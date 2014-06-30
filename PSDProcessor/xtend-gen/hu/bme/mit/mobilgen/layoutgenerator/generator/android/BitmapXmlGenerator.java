package hu.bme.mit.mobilgen.layoutgenerator.generator.android;

import hu.bme.mit.mobilgen.layoutgenerator.generator.android.RelativePosition;
import hu.bme.mit.mobilgen.layoutgenerator.helpers.FileHelper;
import java.io.ByteArrayInputStream;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class BitmapXmlGenerator {
  private IProject project = null;
  
  private final String outFolder = "/res/drawable";
  
  private final String bitmapSuffix = "_fit";
  
  private final String insetPrefix = "inset_";
  
  private String code = "";
  
  public BitmapXmlGenerator(final IProject p) {
    this.project = p;
  }
  
  public String generate(final String drawable, final RelativePosition rp) {
    CharSequence _generateBitmap = this.generateBitmap(drawable);
    String _string = _generateBitmap.toString();
    this.code = _string;
    this.save((drawable + this.bitmapSuffix));
    boolean _hasPadding = rp.hasPadding();
    if (_hasPadding) {
      CharSequence _generateInset = this.generateInset((drawable + this.bitmapSuffix), rp);
      String _string_1 = _generateInset.toString();
      this.code = _string_1;
      this.save(((this.insetPrefix + drawable) + this.bitmapSuffix));
      return ((this.insetPrefix + drawable) + this.bitmapSuffix);
    }
    return (drawable + this.bitmapSuffix);
  }
  
  public void save(final String filename) {
    try {
      IFolder _folder = this.project.getFolder(this.outFolder);
      boolean _exists = _folder.exists();
      boolean _not = (!_exists);
      if (_not) {
        IFolder _folder_1 = this.project.getFolder(this.outFolder);
        FileHelper.createFolder(_folder_1);
      }
      final IFile file = this.project.getFile((((this.outFolder + "/") + filename) + ".xml"));
      boolean _exists_1 = file.exists();
      if (_exists_1) {
        byte[] _bytes = this.code.getBytes();
        ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
        file.setContents(_byteArrayInputStream, IFile.FORCE, null);
      } else {
        byte[] _bytes_1 = this.code.getBytes();
        ByteArrayInputStream _byteArrayInputStream_1 = new ByteArrayInputStream(_bytes_1);
        file.create(_byteArrayInputStream_1, true, null);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence generateBitmap(final String drawable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<bitmap xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:src=\"@drawable/");
    _builder.append(drawable, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("android:tileMode=\"disabled\"  android:gravity=\"fill_horizontal|bottom\" >");
    _builder.newLine();
    _builder.append("</bitmap>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateInset(final String drawable, final RelativePosition rp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<inset");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:drawable=\"@drawable/");
    _builder.append(drawable, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    {
      int _padding = rp.getPadding(RelativePosition.TOP);
      boolean _greaterThan = (_padding > 0);
      if (_greaterThan) {
        _builder.append("    ");
        _builder.append("android:insetTop=\"");
        int _padding_1 = rp.getPadding(RelativePosition.TOP);
        _builder.append(_padding_1, "    ");
        _builder.append("dp\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _padding_2 = rp.getPadding(RelativePosition.RIGHT);
      boolean _greaterThan_1 = (_padding_2 > 0);
      if (_greaterThan_1) {
        _builder.append("    ");
        _builder.append("android:insetRight=\"");
        int _padding_3 = rp.getPadding(RelativePosition.RIGHT);
        _builder.append(_padding_3, "    ");
        _builder.append("dp\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _padding_4 = rp.getPadding(RelativePosition.BOTTOM);
      boolean _greaterThan_2 = (_padding_4 > 0);
      if (_greaterThan_2) {
        _builder.append("    ");
        _builder.append("android:insetBottom=\"");
        int _padding_5 = rp.getPadding(RelativePosition.BOTTOM);
        _builder.append(_padding_5, "    ");
        _builder.append("dp\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _padding_6 = rp.getPadding(RelativePosition.LEFT);
      boolean _greaterThan_3 = (_padding_6 > 0);
      if (_greaterThan_3) {
        _builder.append("    ");
        _builder.append("android:insetLeft=\"");
        int _padding_7 = rp.getPadding(RelativePosition.LEFT);
        _builder.append(_padding_7, "    ");
        _builder.append("dp\"");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
      }
    }
    _builder.append(" />");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
