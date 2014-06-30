package hu.bme.mit.mobilgen.layoutgenerator.generator.android;

import hu.bme.mit.mobilgen.layoutgenerator.generator.BackgroundCreator;
import hu.bme.mit.mobilgen.layoutgenerator.helpers.FileHelper;
import hu.bme.mit.mobilgen.layoutgenerator.psdprocessor.PsdProcessor;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.imageio.ImageIO;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

import psdstructure.BackgroundImage;
import psdstructure.Vector;
import psdstructure.View;

public class AndroidBackgroundCreator extends BackgroundCreator {

	public static final int SIZE_LDPI = 1;
	public static final int SIZE_MDPI = 2;
	public static final int SIZE_HDPI = 3;
	public static final int SIZE_XHDPI = 4;
	public static final int SIZE_XXHDPI = 5;
	private static String[] outFolders = { "res/drawable-ldpi",
			"res/drawable-mdpi", "res/drawable-hdpi", "res/drawable-xhdpi",
			"res/drawable-xxhdpi"};

	public AndroidBackgroundCreator(IProject p) {
		super(p);
	}
	
	public String create(View view) {
		fixImagePositions(view);
		String imageName = view.getID();

		saveImage(compose(view.getBackgrounds(), view.getSize()), imageName);

		return imageName;
	}

	private void fixImagePositions(View view) {
		for (BackgroundImage img : view.getBackgrounds()) {
			Vector newPos = img.getPos();
			newPos.setX(newPos.getX() - view.getPos().getX());
			newPos.setY(newPos.getY() - view.getPos().getY());
			img.setPos(newPos);
		}
	}

	private BufferedImage compose(List<BackgroundImage> parts, Vector size) {
		BufferedImage img = new BufferedImage(size.getX(), size.getY(),
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		for (BackgroundImage backgroundImage : parts) {

			BufferedImage imagePart = getImage(backgroundImage.getImage());

			g.drawImage(imagePart,
					backgroundImage.getPos().getX(),
					backgroundImage.getPos().getY(), null);
		}

		return img;
	}

	private BufferedImage getImage(String name) {
		IFile file = project.getFile(PsdProcessor.outputFolder + "/images/"
				+ name + ".png");
		if (!file.exists()) {
			return null;
		}
		BufferedImage img = null;
		try {
			img = ImageIO.read(file.getContents());
		} catch (IOException e) {
			return null;
		} catch (CoreException e) {
			return null;
		}

		return img;
	}

	private void saveImage(BufferedImage image, String imageName) {
		for(int i=0; i<outFolders.length; i++) {
			
			IFolder folder = project.getFolder(outFolders[i]);
			
			if(!folder.exists()) {
				try {
					FileHelper.createFolder(folder);
				} catch (CoreException e) {
					// TODO raise warning
					continue;
				}
			}
			
			BufferedImage  scaledImage = scaleImage(image, i+1);
			
			// create new file
			IFile file = folder.getFile(imageName+".png");
			
			
			
			// write out the image
			try {
				ImageIO.write(scaledImage, "PNG", new File(file.getLocationURI()));
			} catch (IOException e) {
				// TODO raise warning
				continue;
			}
			/*InputStream is = new ByteArrayInputStream(os.toByteArray());
			
			try {
				file.create(is, false, null);
			} catch (CoreException e) {
				// TODO raise warning
				continue;
			}*/
		}
	}

	private BufferedImage scaleImage(BufferedImage image, int targetSize) {

		
		AffineTransform at = new AffineTransform();
		int width = image.getWidth();
		int height = image.getHeight();
		
		switch (targetSize) {
			case SIZE_LDPI:
				at.scale(0.3, 0.3);
				width *= 0.3;
				height *= 0.3;
				break;
			case SIZE_MDPI:
				at.scale(0.4, 0.4);
				width *= 0.4;
				height *= 0.4;
				break;
			case SIZE_HDPI:
				at.scale(0.6, 0.6);
				width *= 0.6;
				height *= 0.6;
				break;
			case SIZE_XHDPI:
				at.scale(0.8, 0.8);
				width *= 0.8;
				height *= 0.8;
				break;
			case SIZE_XXHDPI:
			default:
				return image;
		}
		
		BufferedImage scaledImage = new BufferedImage(width,
				height, BufferedImage.TYPE_INT_ARGB);

		AffineTransformOp scaleOp = new AffineTransformOp(at,
				AffineTransformOp.TYPE_BILINEAR);
		scaledImage = scaleOp.filter(image, scaledImage);

		return scaledImage;
	}

}
