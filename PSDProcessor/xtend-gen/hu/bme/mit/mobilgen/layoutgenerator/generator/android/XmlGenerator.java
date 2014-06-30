package hu.bme.mit.mobilgen.layoutgenerator.generator.android;

import com.google.common.base.Objects;
import hu.bme.mit.mobilgen.layoutgenerator.generator.FileGenerator;
import hu.bme.mit.mobilgen.layoutgenerator.generator.android.AndroidBackgroundCreator;
import hu.bme.mit.mobilgen.layoutgenerator.generator.android.BitmapXmlGenerator;
import hu.bme.mit.mobilgen.layoutgenerator.generator.android.RelativePosition;
import hu.bme.mit.mobilgen.layoutgenerator.helpers.FileHelper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import psdstructure.AdView;
import psdstructure.BackgroundImage;
import psdstructure.Button;
import psdstructure.Checkbox;
import psdstructure.Grid;
import psdstructure.Image;
import psdstructure.Map;
import psdstructure.ProgressBar;
import psdstructure.ProgressSpinner;
import psdstructure.RadioButton;
import psdstructure.Scroll;
import psdstructure.Select;
import psdstructure.Slider;
import psdstructure.Switch;
import psdstructure.Text;
import psdstructure.Vector;
import psdstructure.View;
import psdstructure.ViewGroup;
import psdstructure.WebView;

@SuppressWarnings("all")
public class XmlGenerator extends FileGenerator {
  private final String outFolder = "/res/layout";
  
  private AndroidBackgroundCreator abc;
  
  private boolean root = true;
  
  private String code = "";
  
  private Object model = null;
  
  private BitmapXmlGenerator bxg;
  
  public XmlGenerator(final IProject project) {
    super(project);
    AndroidBackgroundCreator _androidBackgroundCreator = new AndroidBackgroundCreator(project);
    this.abc = _androidBackgroundCreator;
    BitmapXmlGenerator _bitmapXmlGenerator = new BitmapXmlGenerator(project);
    this.bxg = _bitmapXmlGenerator;
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
        String oldContent = "";
        String nextPart = "";
        InputStream _contents = file.getContents();
        InputStreamReader _inputStreamReader = new InputStreamReader(_contents);
        BufferedReader reader = new BufferedReader(_inputStreamReader);
        String _readLine = reader.readLine();
        String _nextPart = nextPart = _readLine;
        boolean _notEquals = (!Objects.equal(_nextPart, null));
        boolean _while = _notEquals;
        while (_while) {
          oldContent = (oldContent + nextPart);
          String _readLine_1 = reader.readLine();
          String _nextPart_1 = nextPart = _readLine_1;
          boolean _notEquals_1 = (!Objects.equal(_nextPart_1, null));
          _while = _notEquals_1;
        }
        boolean _contains = oldContent.contains("IF YOU WANT TO DISABLE REGENERATION REMOVE THIS COMMENT");
        boolean _not_1 = (!_contains);
        if (_not_1) {
          return;
        } else {
          byte[] _bytes = this.code.getBytes();
          ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
          file.setContents(_byteArrayInputStream, IFile.FORCE, null);
        }
      } else {
        byte[] _bytes_1 = this.code.getBytes();
        ByteArrayInputStream _byteArrayInputStream_1 = new ByteArrayInputStream(_bytes_1);
        file.create(_byteArrayInputStream_1, true, null);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generate(final Resource res) {
    CharSequence _generateHead = this.generateHead();
    String _string = _generateHead.toString();
    this.code = _string;
    EList<EObject> _contents = res.getContents();
    for (final EObject content : _contents) {
      {
        this.model = content;
        CharSequence _generateCode = this.generateCode(content);
        String _string_1 = _generateCode.toString();
        String _plus = (this.code + _string_1);
        this.code = _plus;
      }
    }
  }
  
  public void fixChildren(final Grid g) {
    EList<View> _children = g.getChildren();
    for (final View child : _children) {
      {
        EList<BackgroundImage> _backgrounds = child.getBackgrounds();
        for (final BackgroundImage bg : _backgrounds) {
          {
            Vector newPos = bg.getPos();
            int _x = newPos.getX();
            Vector _pos = child.getPos();
            int _x_1 = _pos.getX();
            int _minus = (_x - _x_1);
            newPos.setX(_minus);
            int _y = newPos.getY();
            Vector _pos_1 = child.getPos();
            int _y_1 = _pos_1.getY();
            int _minus_1 = (_y - _y_1);
            newPos.setY(_minus_1);
            bg.setPos(newPos);
          }
        }
        Vector _pos = child.getPos();
        _pos.setX(0);
        Vector _pos_1 = child.getPos();
        _pos_1.setY(0);
      }
    }
  }
  
  protected CharSequence _position(final View it) {
    CharSequence _xblockexpression = null;
    {
      final RelativePosition rp = RelativePosition.getPosition(((ViewGroup) this.model), it);
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _alignParent = rp.getAlignParent(RelativePosition.TOP);
        if (_alignParent) {
          _builder.append("android:layout_alignParentTop=\"true\"");
          _builder.newLine();
        }
      }
      {
        boolean _and = false;
        boolean _and_1 = false;
        boolean _alignParent_1 = rp.getAlignParent(RelativePosition.BOTTOM);
        if (!_alignParent_1) {
          _and_1 = false;
        } else {
          String _neighbour = rp.getNeighbour(RelativePosition.TOP);
          int _length = _neighbour.length();
          boolean _equals = (_length == 0);
          _and_1 = _equals;
        }
        if (!_and_1) {
          _and = false;
        } else {
          boolean _alignParent_2 = rp.getAlignParent(RelativePosition.TOP);
          boolean _not = (!_alignParent_2);
          _and = _not;
        }
        if (_and) {
          _builder.append("android:layout_alignParentBottom=\"true\"");
          _builder.newLine();
        }
      }
      {
        boolean _centerHorizontal = rp.getCenterHorizontal();
        boolean _equals_1 = (_centerHorizontal == false);
        if (_equals_1) {
          {
            boolean _alignParent_3 = rp.getAlignParent(RelativePosition.LEFT);
            if (_alignParent_3) {
              _builder.append("android:layout_alignParentLeft=\"true\"");
              _builder.newLine();
            }
          }
          {
            boolean _alignParent_4 = rp.getAlignParent(RelativePosition.RIGHT);
            if (_alignParent_4) {
              _builder.append("android:layout_alignParentRight=\"true\"");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("android:layout_marginTop=\"");
      int _margin = rp.getMargin(RelativePosition.TOP);
      int _divide = (_margin / 2);
      _builder.append(_divide, "");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      {
        boolean _centerHorizontal_1 = rp.getCenterHorizontal();
        boolean _equals_2 = (_centerHorizontal_1 == false);
        if (_equals_2) {
          _builder.append("android:layout_marginRight=\"");
          int _margin_1 = rp.getMargin(RelativePosition.RIGHT);
          int _divide_1 = (_margin_1 / 2);
          _builder.append(_divide_1, "");
          _builder.append("dp\"");
          _builder.newLineIfNotEmpty();
          _builder.append("android:layout_marginLeft=\"");
          int _margin_2 = rp.getMargin(RelativePosition.LEFT);
          int _divide_2 = (_margin_2 / 2);
          _builder.append(_divide_2, "");
          _builder.append("dp\"");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("android:layout_centerHorizontal=\"true\"");
          _builder.newLine();
          {
            if ((!(it instanceof Grid))) {
              _builder.append("android:paddingLeft=\"");
              int _padding = rp.getPadding(RelativePosition.LEFT);
              _builder.append(_padding, "");
              _builder.append("dp\"");
              _builder.newLineIfNotEmpty();
              _builder.append("android:paddingRight=\"");
              int _padding_1 = rp.getPadding(RelativePosition.RIGHT);
              _builder.append(_padding_1, "");
              _builder.append("dp\"");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        String _neighbour_1 = rp.getNeighbour(RelativePosition.TOP);
        int _length_1 = _neighbour_1.length();
        boolean _greaterThan = (_length_1 > 0);
        if (_greaterThan) {
          _builder.append("android:layout_below=\"@+id/");
          String _neighbour_2 = rp.getNeighbour(RelativePosition.TOP);
          _builder.append(_neighbour_2, "");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        String _neighbour_3 = rp.getNeighbour(RelativePosition.LEFT);
        int _length_2 = _neighbour_3.length();
        boolean _greaterThan_1 = (_length_2 > 0);
        if (_greaterThan_1) {
          _builder.append("android:layout_toRightOf=\"@+id/");
          String _neighbour_4 = rp.getNeighbour(RelativePosition.LEFT);
          _builder.append(_neighbour_4, "");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateHead() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("THIS FILE IS GENERATED BASED ON A PSD FILE ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("IF YOU WANT TO DISABLE REGENERATION REMOVE THIS COMMENT");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("-->");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateCode(final ViewGroup it) {
    CharSequence _xblockexpression = null;
    {
      String filename = this.abc.create(it);
      final boolean isroot = this.root;
      this.root = false;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<RelativeLayout");
      _builder.newLine();
      {
        if ((isroot == true)) {
          _builder.append("\t\t\t");
          _builder.append("xmlns:android=\"http://schemas.android.com/apk/res/android\"");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("android:layout_height=\"match_parent\"");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("android:layout_width=\"match_parent\"");
          _builder.newLine();
        } else {
          {
            Vector _size = it.getSize();
            boolean _notEquals = (!Objects.equal(_size, null));
            if (_notEquals) {
              _builder.append("\t\t\t");
              _builder.append("android:layout_width=\"");
              Vector _size_1 = it.getSize();
              int _x = _size_1.getX();
              int _divide = (_x / 2);
              _builder.append(_divide, "\t\t\t");
              _builder.append("dp\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              _builder.append("android:layout_height=\"");
              Vector _size_2 = it.getSize();
              int _y = _size_2.getY();
              int _divide_1 = (_y / 2);
              _builder.append(_divide_1, "\t\t\t");
              _builder.append("dp\"");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t\t\t");
              _builder.append("android:layout_width=\"wrap_content\"");
              _builder.newLine();
              _builder.append("\t\t\t");
              _builder.append("android:layout_height=\"wrap_content\"");
              _builder.newLine();
            }
          }
        }
      }
      {
        if ((isroot == false)) {
          _builder.append("\t\t\t");
          CharSequence _position = this.position(it);
          _builder.append(_position, "\t\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t\t");
      _builder.append("android:id=\"@+id/");
      String _iD = it.getID();
      _builder.append(_iD, "\t\t\t");
      _builder.append("\" ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("android:background=\"@drawable/");
      _builder.append(filename, "\t\t\t");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      {
        EList<View> _children = it.getChildren();
        for(final View view : _children) {
          _builder.append("\t\t\t");
          Object _generateCode = this.generateCode(view);
          _builder.append(_generateCode, "\t\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t\t");
      _builder.append("</RelativeLayout>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateCode(final View it) {
    CharSequence _xblockexpression = null;
    {
      final RelativePosition rp = RelativePosition.getPosition(((ViewGroup) this.model), it);
      String _create = this.abc.create(it);
      String filename = this.bxg.generate(_create, rp);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<View");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("android:id=\"@+id/");
      String _iD = it.getID();
      _builder.append(_iD, "\t\t        ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t        ");
      _builder.append("android:layout_width=\"");
      Vector _size = it.getSize();
      int _x = _size.getX();
      int _divide = (_x / 2);
      _builder.append(_divide, "\t\t        ");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t        ");
      _builder.append("android:layout_height=\"");
      Vector _size_1 = it.getSize();
      int _y = _size_1.getY();
      int _divide_1 = (_y / 2);
      _builder.append(_divide_1, "\t\t        ");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      CharSequence _position = this.position(it);
      _builder.append(_position, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("           \t\t");
      _builder.append("android:background=\"@drawable/");
      _builder.append(filename, "           \t\t");
      _builder.append("\"\t/>");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateCode(final AdView it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<com.google.android.gms.ads.AdView android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("android:layout_width=\"");
    Vector _size = it.getSize();
    int _x = _size.getX();
    int _divide = (_x / 2);
    _builder.append(_divide, "        ");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("android:layout_height=\"");
    Vector _size_1 = it.getSize();
    int _y = _size_1.getY();
    int _divide_1 = (_y / 2);
    _builder.append(_divide_1, "        ");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("ads:adUnitId=\"");
    String _unitid = it.getUnitid();
    _builder.append(_unitid, "        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("ads:adSize=\"SMART_BANNER\"/>");
    return _builder;
  }
  
  protected CharSequence _generateCode(final Checkbox it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<CheckBox");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("android:layout_width=\"wrap_content\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t");
    _builder.newLineIfNotEmpty();
    {
      boolean _isSelected = it.isSelected();
      if (_isSelected) {
        _builder.append("android:checked=\"true\"");
        _builder.newLine();
      }
    }
    _builder.append("\t ");
    _builder.append("/>");
    return _builder;
  }
  
  protected CharSequence _generateCode(final Grid it) {
    CharSequence _xblockexpression = null;
    {
      this.fixChildren(it);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<GridLayout");
      _builder.newLine();
      _builder.append("\t\t   \t");
      _builder.append("android:layout_width=\"");
      Vector _size = it.getSize();
      int _x = _size.getX();
      int _divide = (_x / 2);
      _builder.append(_divide, "\t\t   \t");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t   \t");
      _builder.append("android:layout_height=\"");
      Vector _size_1 = it.getSize();
      int _y = _size_1.getY();
      int _divide_1 = (_y / 2);
      _builder.append(_divide_1, "\t\t   \t");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      CharSequence _position = this.position(it);
      _builder.append(_position, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t    ");
      _builder.append("android:columnCount=\"");
      int _cols = it.getCols();
      _builder.append(_cols, "\t\t    ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t    ");
      _builder.append("android:rowCount=\"");
      int _rows = it.getRows();
      _builder.append(_rows, "\t\t    ");
      _builder.append("\" >");
      _builder.newLineIfNotEmpty();
      {
        EList<View> _children = it.getChildren();
        for(final View view : _children) {
          _builder.append("\t\t    ");
          Object _generateCode = this.generateCode(view);
          _builder.append(_generateCode, "\t\t    ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.append("</GridLayout>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateCode(final Image it) {
    CharSequence _xblockexpression = null;
    {
      final RelativePosition rp = RelativePosition.getPosition(((ViewGroup) this.model), it);
      String _create = this.abc.create(it);
      String filename = this.bxg.generate(_create, rp);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<ImageView");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("android:id=\"@+id/");
      String _iD = it.getID();
      _builder.append(_iD, "\t\t        ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t   \t");
      _builder.append("android:layout_width=\"");
      Vector _size = it.getSize();
      int _x = _size.getX();
      int _divide = (_x / 2);
      _builder.append(_divide, "\t\t\t   \t");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t   \t");
      _builder.append("android:layout_height=\"");
      Vector _size_1 = it.getSize();
      int _y = _size_1.getY();
      int _divide_1 = (_y / 2);
      _builder.append(_divide_1, "\t\t\t   \t");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      CharSequence _position = this.position(it);
      _builder.append(_position, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t        ");
      _builder.append("android:src=\"@drawable/");
      _builder.append(filename, "\t\t        ");
      _builder.append("\" />");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateCode(final Map it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<com.google.android.maps.MapView");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("android:layout_width=\"");
    Vector _size = it.getSize();
    int _x = _size.getX();
    int _divide = (_x / 2);
    _builder.append(_divide, "   \t");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("android:layout_height=\"");
    Vector _size_1 = it.getSize();
    int _y = _size_1.getY();
    int _divide_1 = (_y / 2);
    _builder.append(_divide_1, "   \t");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t");
    _builder.newLineIfNotEmpty();
    {
      boolean _isClickable = it.isClickable();
      if (_isClickable) {
        _builder.append("    ");
        _builder.append("android:clickable=\"true\"");
        _builder.newLine();
      } else {
        _builder.append("    ");
        _builder.append("android:clickable=\"false\"");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("android:apiKey=\"");
    String _apikey = it.getApikey();
    _builder.append(_apikey, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("/>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateCode(final ProgressBar it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ProgressBar");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t   \t");
    _builder.append("android:layout_width=\"");
    Vector _size = it.getSize();
    int _x = _size.getX();
    int _divide = (_x / 2);
    _builder.append(_divide, "\t\t   \t");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t   \t");
    _builder.append("android:layout_height=\"");
    Vector _size_1 = it.getSize();
    int _y = _size_1.getY();
    int _divide_1 = (_y / 2);
    _builder.append(_divide_1, "\t\t   \t");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("        \t");
    _builder.append("style=\"?android:attr/progressBarStyleHorizontal\" />");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateCode(final ProgressSpinner it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ProgressBar");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t   \t");
    _builder.append("android:layout_width=\"");
    Vector _size = it.getSize();
    int _x = _size.getX();
    int _divide = (_x / 2);
    _builder.append(_divide, "\t\t   \t");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t   \t");
    _builder.append("android:layout_height=\"");
    Vector _size_1 = it.getSize();
    int _y = _size_1.getY();
    int _divide_1 = (_y / 2);
    _builder.append(_divide_1, "\t\t   \t");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("        \t");
    _builder.append("style=\"?android:attr/progressBarStyleLarge\" />\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateCode(final RadioButton it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<RadioButton");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "\t        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("android:layout_width=\"wrap_content\"");
    _builder.newLine();
    _builder.append("   \t");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t");
    _builder.append(" />");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateCode(final Button it) {
    CharSequence _xblockexpression = null;
    {
      final RelativePosition rp = RelativePosition.getPosition(((ViewGroup) this.model), it);
      String _create = this.abc.create(it);
      String filename = this.bxg.generate(_create, rp);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<Button");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("android:id=\"@+id/");
      String _iD = it.getID();
      _builder.append(_iD, "\t\t        ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t        ");
      _builder.append("android:layout_width=\"");
      Vector _size = it.getSize();
      int _x = _size.getX();
      int _divide = (_x / 2);
      _builder.append(_divide, "\t\t        ");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t        ");
      _builder.append("android:layout_height=\"");
      Vector _size_1 = it.getSize();
      int _y = _size_1.getY();
      int _divide_1 = (_y / 2);
      _builder.append(_divide_1, "\t\t        ");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      CharSequence _position = this.position(it);
      _builder.append(_position, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t       \t\t");
      _builder.append("android:background=\"@drawable/");
      _builder.append(filename, "\t       \t\t");
      _builder.append("\"    ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t        ");
      _builder.append("android:text=\"");
      String _text = it.getText();
      _builder.append(_text, "\t\t        ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t       \t\t");
      _builder.append("android:onClick=\"onClick\" />");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateCode(final Scroll it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ScrollView");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "\t        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("android:layout_width=\"wrap_content\"");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t");
    _builder.append(" >");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("<RelativeLayout");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("android:orientation=\"vertical\" >");
    _builder.newLine();
    {
      EList<View> _children = it.getChildren();
      for(final View view : _children) {
        _builder.append("\t            ");
        Object _generateCode = this.generateCode(view);
        _builder.append(_generateCode, "\t            ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t        ");
    _builder.append("</RelativeLayout>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("</ScrollView>\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateCode(final Select it) {
    CharSequence _xblockexpression = null;
    {
      final RelativePosition rp = RelativePosition.getPosition(((ViewGroup) this.model), it);
      String _create = this.abc.create(it);
      String filename = this.bxg.generate(_create, rp);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<Spinner");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("android:id=\"@+id/");
      String _iD = it.getID();
      _builder.append(_iD, "\t        ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t        ");
      _builder.append("android:layout_width=\"");
      Vector _size = it.getSize();
      int _x = _size.getX();
      int _divide = (_x / 2);
      _builder.append(_divide, "\t        ");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t        ");
      _builder.append("android:layout_height=\"");
      Vector _size_1 = it.getSize();
      int _y = _size_1.getY();
      int _divide_1 = (_y / 2);
      _builder.append(_divide_1, "\t        ");
      _builder.append("dp\"");
      _builder.newLineIfNotEmpty();
      _builder.append("   ");
      _builder.append("android:background=\"@drawable/");
      _builder.append(filename, "   ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      CharSequence _position = this.position(it);
      _builder.append(_position, "\t\t\t");
      _builder.append(" />");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateCode(final Slider it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<SeekBar");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("android:layout_width=\"");
    Vector _size = it.getSize();
    int _x = _size.getX();
    int _divide = (_x / 2);
    _builder.append(_divide, "    ");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("android:layout_height=\"");
    Vector _size_1 = it.getSize();
    int _y = _size_1.getY();
    int _divide_1 = (_y / 2);
    _builder.append(_divide_1, "    ");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("        \t");
    _builder.append("android:max=\"");
    int _max = it.getMax();
    _builder.append(_max, "        \t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("        \t");
    _builder.append("android:progress=\"");
    int _default = it.getDefault();
    _builder.append(_default, "        \t");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateCode(final Switch it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Switch");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("android:layout_width=\"wrap_content\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t");
    _builder.newLineIfNotEmpty();
    {
      boolean _isSelected = it.isSelected();
      if (_isSelected) {
        _builder.append("android:checked=\"true\"");
        _builder.newLine();
      }
    }
    _builder.append("/>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateCode(final Text it) {
    CharSequence _xblockexpression = null;
    {
      final RelativePosition rp = RelativePosition.getPosition(((ViewGroup) this.model), it);
      String _create = this.abc.create(it);
      String filename = this.bxg.generate(_create, rp);
      CharSequence _xifexpression = null;
      boolean _isEditable = it.isEditable();
      if (_isEditable) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<EditText");
        _builder.newLine();
        _builder.append("\t\t        ");
        _builder.append("android:id=\"@+id/");
        String _iD = it.getID();
        _builder.append(_iD, "\t\t        ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("android:layout_width=\"");
        Vector _size = it.getSize();
        int _x = _size.getX();
        int _divide = (_x / 2);
        _builder.append(_divide, "\t\t\t\t");
        _builder.append("dp\"");
        _builder.newLineIfNotEmpty();
        {
          Vector _size_1 = it.getSize();
          int _y = _size_1.getY();
          int _divide_1 = (_y / 2);
          boolean _lessThan = (_divide_1 < 12);
          if (_lessThan) {
            _builder.append("\t\t\t\t");
            _builder.append("android:layout_height=\"12dp\"");
            _builder.newLine();
          } else {
            _builder.append("\t\t\t\t");
            _builder.append("android:layout_height=\"");
            Vector _size_2 = it.getSize();
            int _y_1 = _size_2.getY();
            int _divide_2 = (_y_1 / 2);
            _builder.append(_divide_2, "\t\t\t\t");
            _builder.append("dp\"");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t\t");
        CharSequence _position = this.position(it);
        _builder.append(_position, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t        ");
        _builder.append("android:text=\"");
        String _text = it.getText();
        _builder.append(_text, "\t\t        ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t        ");
        _builder.append("android:background=\"@drawable/");
        _builder.append(filename, "\t\t        ");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
        {
          String _type = it.getType();
          boolean _notEquals = (!Objects.equal(_type, null));
          if (_notEquals) {
            _builder.append("\t\t        ");
            _builder.append("android:inputType=\"");
            String _type_1 = it.getType();
            _builder.append(_type_1, "\t\t        ");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t        ");
          }
        }
        _builder.append(" />");
        _builder.newLineIfNotEmpty();
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<TextView");
        _builder_1.newLine();
        _builder_1.append("\t\t        ");
        _builder_1.append("android:id=\"@+id/");
        String _iD_1 = it.getID();
        _builder_1.append(_iD_1, "\t\t        ");
        _builder_1.append("\"");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("android:layout_width=\"");
        Vector _size_3 = it.getSize();
        int _x_1 = _size_3.getX();
        int _divide_3 = (_x_1 / 2);
        _builder_1.append(_divide_3, "\t\t\t\t");
        _builder_1.append("dp\"");
        _builder_1.newLineIfNotEmpty();
        {
          Vector _size_4 = it.getSize();
          int _y_2 = _size_4.getY();
          int _divide_4 = (_y_2 / 2);
          boolean _lessThan_1 = (_divide_4 < 12);
          if (_lessThan_1) {
            _builder_1.append("\t\t\t\t");
            _builder_1.append("android:layout_height=\"12dp\"");
            _builder_1.newLine();
          } else {
            _builder_1.append("\t\t\t\t");
            _builder_1.append("android:layout_height=\"");
            Vector _size_5 = it.getSize();
            int _y_3 = _size_5.getY();
            int _divide_5 = (_y_3 / 2);
            _builder_1.append(_divide_5, "\t\t\t\t");
            _builder_1.append("dp\"");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("\t\t\t\t");
        CharSequence _position_1 = this.position(it);
        _builder_1.append(_position_1, "\t\t\t\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t        ");
        _builder_1.append("android:text=\"");
        String _text_1 = it.getText();
        _builder_1.append(_text_1, "\t\t        ");
        _builder_1.append("\" />");
        _builder_1.newLineIfNotEmpty();
        _xifexpression = _builder_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateCode(final WebView it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<WebView");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@+id/");
    String _iD = it.getID();
    _builder.append(_iD, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("android:layout_width=\"");
    Vector _size = it.getSize();
    int _x = _size.getX();
    int _divide = (_x / 2);
    _builder.append(_divide, "\t\t\t");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("android:layout_height=\"");
    Vector _size_1 = it.getSize();
    int _y = _size_1.getY();
    int _divide_1 = (_y / 2);
    _builder.append(_divide_1, "\t\t\t");
    _builder.append("dp\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    CharSequence _position = this.position(it);
    _builder.append(_position, "\t\t\t");
    _builder.append(" />");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateCode(final EClass it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence position(final View it) {
    {
      return _position(it);
    }
  }
  
  public CharSequence generateCode(final EObject it) {
    if (it instanceof EClass) {
      return _generateCode((EClass)it);
    } else if (it instanceof Grid) {
      return _generateCode((Grid)it);
    } else if (it instanceof Scroll) {
      return _generateCode((Scroll)it);
    } else if (it instanceof AdView) {
      return _generateCode((AdView)it);
    } else if (it instanceof Button) {
      return _generateCode((Button)it);
    } else if (it instanceof Checkbox) {
      return _generateCode((Checkbox)it);
    } else if (it instanceof Image) {
      return _generateCode((Image)it);
    } else if (it instanceof Map) {
      return _generateCode((Map)it);
    } else if (it instanceof ProgressBar) {
      return _generateCode((ProgressBar)it);
    } else if (it instanceof ProgressSpinner) {
      return _generateCode((ProgressSpinner)it);
    } else if (it instanceof RadioButton) {
      return _generateCode((RadioButton)it);
    } else if (it instanceof Select) {
      return _generateCode((Select)it);
    } else if (it instanceof Slider) {
      return _generateCode((Slider)it);
    } else if (it instanceof Switch) {
      return _generateCode((Switch)it);
    } else if (it instanceof Text) {
      return _generateCode((Text)it);
    } else if (it instanceof ViewGroup) {
      return _generateCode((ViewGroup)it);
    } else if (it instanceof WebView) {
      return _generateCode((WebView)it);
    } else if (it instanceof View) {
      return _generateCode((View)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
