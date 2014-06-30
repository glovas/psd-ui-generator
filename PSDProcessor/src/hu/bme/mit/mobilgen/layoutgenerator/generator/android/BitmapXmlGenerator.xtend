package hu.bme.mit.mobilgen.layoutgenerator.generator.android

import hu.bme.mit.mobilgen.layoutgenerator.generator.FileGenerator
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.resource.Resource
import hu.bme.mit.mobilgen.layoutgenerator.helpers.FileHelper
import java.io.ByteArrayInputStream
import org.eclipse.core.resources.IFile

class BitmapXmlGenerator {
	
	IProject project = null;
	val outFolder = "/res/drawable"
	val bitmapSuffix = "_fit"
	val insetPrefix = "inset_"
	var code = ""
	
	new(IProject p) {
		project = p
	}
	
	def generate(String drawable, RelativePosition rp) {
		code = generateBitmap(drawable).toString
		save(drawable+bitmapSuffix)
		if(rp.hasPadding()){
			code = generateInset(drawable+bitmapSuffix, rp).toString
			save(insetPrefix+drawable+bitmapSuffix)
			return insetPrefix + drawable + bitmapSuffix
		}
		return drawable+bitmapSuffix;
	}
	
	def save(String filename) {
		
		if(!project.getFolder(outFolder).exists()) {
			FileHelper.createFolder(project.getFolder(outFolder));
		}
		
		val file = project.getFile(outFolder+"/"+filename+ ".xml")
		// if file exists, check if enabled to generate
		if(file.exists) {
			file.setContents(new ByteArrayInputStream(code.getBytes()), IFile.FORCE, null)
		}
		else {
			file.create(new ByteArrayInputStream(code.getBytes()), true, null)
		}
	}
	
	def generateBitmap(String drawable)'''
		<?xml version="1.0" encoding="utf-8"?>
		<bitmap xmlns:android="http://schemas.android.com/apk/res/android"
		    android:src="@drawable/«drawable»"
		    android:tileMode="disabled"  android:gravity="fill_horizontal|bottom" >
		</bitmap>
	'''
	
	def generateInset(String drawable, RelativePosition rp)'''
		<?xml version="1.0" encoding="utf-8"?>
		<inset
		    xmlns:android="http://schemas.android.com/apk/res/android"
		    android:drawable="@drawable/«drawable»"
		    «IF rp.getPadding(RelativePosition.TOP) > 0»
		    android:insetTop="«rp.getPadding(RelativePosition.TOP)»dp"
		    «ENDIF»
		    «IF rp.getPadding(RelativePosition.RIGHT) > 0»
		    android:insetRight="«rp.getPadding(RelativePosition.RIGHT)»dp"
		    «ENDIF»
		    «IF rp.getPadding(RelativePosition.BOTTOM) > 0»
		    android:insetBottom="«rp.getPadding(RelativePosition.BOTTOM)»dp"
		    «ENDIF»
		    «IF rp.getPadding(RelativePosition.LEFT) > 0»
		    android:insetLeft="«rp.getPadding(RelativePosition.LEFT)»dp"
		    «ENDIF» />
	'''
	
}