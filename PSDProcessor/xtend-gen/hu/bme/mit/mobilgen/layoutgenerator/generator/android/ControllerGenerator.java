package hu.bme.mit.mobilgen.layoutgenerator.generator.android;

import com.google.common.base.Objects;
import hu.bme.mit.mobilgen.layoutgenerator.generator.FileGenerator;
import hu.bme.mit.mobilgen.layoutgenerator.helpers.FileHelper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import psdstructure.Button;
import psdstructure.DatePicker;
import psdstructure.Select;
import psdstructure.View;
import psdstructure.ViewGroup;
import psdstructure.WebView;

@SuppressWarnings("all")
public class ControllerGenerator extends FileGenerator {
  private final String generatedCodePrefix = "/* GENERATED CODE, DO NOT EDIT MANUALY */";
  
  private final String generatedCodeSuffix = "/* END OF GENERATED CODE */";
  
  private String filename = "";
  
  private List<String> imported;
  
  private String code = "";
  
  public ControllerGenerator(final IProject p) {
    super(p);
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.imported = _arrayList;
  }
  
  public ControllerGenerator(final IProject p, final String f) {
    super(p);
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.imported = _arrayList;
    this.filename = f;
  }
  
  public void generate(final Resource res) {
    try {
      final String outFolder = this.getOutFolder(this.filename);
      IFolder _folder = this.project.getFolder(outFolder);
      boolean _exists = _folder.exists();
      boolean _not = (!_exists);
      if (_not) {
        EList<EObject> _contents = res.getContents();
        for (final EObject content : _contents) {
          CharSequence _generateClass = this.generateClass(((ViewGroup) content));
          String _string = _generateClass.toString();
          String _plus = (this.code + _string);
          this.code = _plus;
        }
        return;
      }
      CharSequence _className = this.getClassName(this.filename);
      String _plus_1 = ((outFolder + "/") + _className);
      String _plus_2 = (_plus_1 + ".java");
      final IFile file = this.project.getFile(_plus_2);
      boolean _exists_1 = file.exists();
      boolean _not_1 = (!_exists_1);
      if (_not_1) {
        EList<EObject> _contents_1 = res.getContents();
        for (final EObject content_1 : _contents_1) {
          CharSequence _generateClass_1 = this.generateClass(((ViewGroup) content_1));
          String _string_1 = _generateClass_1.toString();
          String _plus_3 = (this.code + _string_1);
          this.code = _plus_3;
        }
        return;
      } else {
        String oldContent = "";
        String nextPart = "";
        InputStream _contents_2 = file.getContents();
        InputStreamReader _inputStreamReader = new InputStreamReader(_contents_2);
        BufferedReader reader = new BufferedReader(_inputStreamReader);
        String _readLine = reader.readLine();
        String _nextPart = nextPart = _readLine;
        boolean _notEquals = (!Objects.equal(_nextPart, null));
        boolean _while = _notEquals;
        while (_while) {
          oldContent = ((oldContent + "\n") + nextPart);
          String _readLine_1 = reader.readLine();
          String _nextPart_1 = nextPart = _readLine_1;
          boolean _notEquals_1 = (!Objects.equal(_nextPart_1, null));
          _while = _notEquals_1;
        }
        String _replaceFirst = oldContent.replaceFirst("\n", "");
        oldContent = _replaceFirst;
        String imports = (this.generatedCodePrefix + "\n");
        String functions = (this.generatedCodePrefix + "\n");
        EList<EObject> _contents_3 = res.getContents();
        for (final EObject content_2 : _contents_3) {
          {
            CharSequence _imports = this.getImports(((ViewGroup) content_2));
            String _string_2 = _imports.toString();
            String _plus_4 = (imports + _string_2);
            imports = _plus_4;
            CharSequence _generateInitFunction = this.generateInitFunction(((ViewGroup) content_2));
            String _string_3 = _generateInitFunction.toString();
            String _plus_5 = (functions + _string_3);
            functions = _plus_5;
            CharSequence _generateOnClickListener = this.generateOnClickListener(((ViewGroup) content_2));
            String _string_4 = _generateOnClickListener.toString();
            String _plus_6 = (functions + _string_4);
            functions = _plus_6;
          }
        }
        imports = ((imports + "\n") + this.generatedCodeSuffix);
        functions = ((functions + "\n") + this.generatedCodeSuffix);
        String _replace = this.generatedCodePrefix.replace("*", "\\*");
        String _plus_4 = (_replace + "[^*]*");
        String _replace_1 = this.generatedCodeSuffix.replace("*", "\\*");
        String _plus_5 = (_plus_4 + _replace_1);
        String _replaceAll = oldContent.replaceAll(_plus_5, functions);
        oldContent = _replaceAll;
        String _replace_2 = this.generatedCodePrefix.replace("*", "\\*");
        String _plus_6 = (_replace_2 + "[^*]*");
        String _replace_3 = this.generatedCodeSuffix.replace("*", "\\*");
        String _plus_7 = (_plus_6 + _replace_3);
        String _replaceFirst_1 = oldContent.replaceFirst(_plus_7, imports);
        oldContent = _replaceFirst_1;
        this.code = oldContent;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void save(final String filename) {
    try {
      final String outFolder = this.getOutFolder(filename);
      IFolder _folder = this.project.getFolder(outFolder);
      boolean _exists = _folder.exists();
      boolean _not = (!_exists);
      if (_not) {
        IFolder _folder_1 = this.project.getFolder(outFolder);
        FileHelper.createFolder(_folder_1);
      }
      CharSequence _className = this.getClassName(filename);
      String _plus = ((outFolder + "/") + _className);
      String _plus_1 = (_plus + ".java");
      final IFile file = this.project.getFile(_plus_1);
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
  
  protected CharSequence _generateClass(final ViewGroup it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _package = this.getPackage(this.filename);
    _builder.append(_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(this.generatedCodePrefix, "");
    _builder.newLineIfNotEmpty();
    CharSequence _imports = this.getImports(it);
    _builder.append(_imports, "");
    _builder.newLineIfNotEmpty();
    _builder.append(this.generatedCodeSuffix, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.app.Activity;");
    _builder.newLine();
    _builder.append("import android.view.View;");
    _builder.newLine();
    _builder.append("import android.os.Bundle;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    CharSequence _className = this.getClassName(this.filename);
    _builder.append(_className, "");
    _builder.append(" extends Activity {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void onCreate(Bundle b) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super.onCreate(b);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setContentView(R.layout.");
    _builder.append(this.filename, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("initViews();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private boolean yourOnClickListener(View v) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO Auto generated method");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(this.generatedCodePrefix, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateOnClickListener = this.generateOnClickListener(it);
    _builder.append(_generateOnClickListener, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateInitFunction = this.generateInitFunction(it);
    _builder.append(_generateInitFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(this.generatedCodeSuffix, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _getImports(final View it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _getImports(final DatePicker it) {
    boolean _contains = this.imported.contains("android.widget.DatePicker");
    boolean _not = (!_contains);
    if (_not) {
      this.imported.add("android.widget.DatePicker");
      return "import android.widget.DatePicker;\n\t\t\t\t\timport java.util.Calendar;";
    }
    return null;
  }
  
  protected CharSequence _getImports(final Select it) {
    boolean _contains = this.imported.contains("android.widget.Spinner");
    boolean _not = (!_contains);
    if (_not) {
      this.imported.add("android.widget.Spinner");
      return "import android.widget.Spinner;";
    }
    return null;
  }
  
  protected CharSequence _getImports(final Button it) {
    boolean _contains = this.imported.contains("android.widget.Button");
    boolean _not = (!_contains);
    if (_not) {
      this.imported.add("android.widget.Button");
      return "import android.widget.Button;";
    }
    return null;
  }
  
  protected CharSequence _getImports(final WebView it) {
    boolean _contains = this.imported.contains("android.widget.WebView");
    boolean _not = (!_contains);
    if (_not) {
      this.imported.add("android.widget.WebView");
      return "import android.widget.WebView;";
    }
    return null;
  }
  
  protected CharSequence _getImports(final ViewGroup it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<View> _children = it.getChildren();
      for(final View child : _children) {
        Object _imports = this.getImports(child);
        _builder.append(_imports, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _init(final View it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _init(final DatePicker it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Calendar cal = Calendar.getInstance();\t\t");
    _builder.newLine();
    _builder.append("DatePicker datePicker = ((DatePicker)findViewById(R.id.");
    String _iD = it.getID();
    _builder.append(_iD, "");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Date _default = it.getDefault();
      boolean _notEquals = (!Objects.equal(_default, null));
      if (_notEquals) {
        _builder.append("cal.setTime(");
        Date _default_1 = it.getDefault();
        _builder.append(_default_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("int year=cal.get(Calendar.YEAR);");
    _builder.newLine();
    _builder.append("int month=cal.get(Calendar.MONTH);");
    _builder.newLine();
    _builder.append("int day=cal.get(Calendar.DAY_OF_MONTH);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("datePicker.updateDate(year, month, day);");
    _builder.newLine();
    {
      Date _min = it.getMin();
      boolean _notEquals_1 = (!Objects.equal(_min, null));
      if (_notEquals_1) {
        _builder.append("cal.setTime(");
        Date _min_1 = it.getMin();
        _builder.append(_min_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("datePicker.setMinDate(cal.getTimeInMillis());");
        _builder.newLine();
      }
    }
    {
      Date _max = it.getMax();
      boolean _notEquals_2 = (!Objects.equal(_max, null));
      if (_notEquals_2) {
        _builder.append("cal.setTime(");
        Date _max_1 = it.getMax();
        _builder.append(_max_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("datePicker.setMaxDate(cal.getTimeInMillis());");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _init(final WebView it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("WebView webView = (WebView)findViewById(R.id.");
    String _iD = it.getID();
    _builder.append(_iD, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("webView.getSettings().setJavaScriptEnabled(true);");
    _builder.newLine();
    _builder.append("webView.setWebChromeClient(new WebChromeClient());");
    _builder.newLine();
    {
      String _url = it.getUrl();
      boolean _notEquals = (!Objects.equal(_url, null));
      if (_notEquals) {
        _builder.append("        ");
        _builder.append("webView.loadUrl(\"");
        String _url_1 = it.getUrl();
        _builder.append(_url_1, "        ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateInitFunction(final ViewGroup it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public void initViews(){");
    _builder.newLine();
    {
      EList<View> _children = it.getChildren();
      for(final View child : _children) {
        CharSequence _init = this.init(child);
        _builder.append(_init, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateOnClickListener(final ViewGroup it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void onClick(View v){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("yourOnClickListener(v);");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public String getPackage(final String filename) {
    boolean _contains = filename.contains("_");
    if (_contains) {
      int _lastIndexOf = filename.lastIndexOf("_");
      CharSequence _subSequence = filename.subSequence(0, _lastIndexOf);
      String _string = _subSequence.toString();
      return _string.replaceAll("_", ".");
    }
    return filename;
  }
  
  public CharSequence getClassName(final String filename) {
    int _lastIndexOf = filename.lastIndexOf("_");
    int _plus = (_lastIndexOf + 1);
    int _length = filename.length();
    return filename.subSequence(_plus, _length);
  }
  
  public String getOutFolder(final String filename) {
    int _lastIndexOf = filename.lastIndexOf("_");
    CharSequence _subSequence = filename.subSequence(0, _lastIndexOf);
    String _string = _subSequence.toString();
    String _replaceAll = _string.replaceAll("_", "/");
    return ("/src/" + _replaceAll);
  }
  
  public CharSequence generateClass(final ViewGroup it) {
    {
      return _generateClass(it);
    }
  }
  
  public CharSequence getImports(final View it) {
    if (it instanceof Button) {
      return _getImports((Button)it);
    } else if (it instanceof DatePicker) {
      return _getImports((DatePicker)it);
    } else if (it instanceof Select) {
      return _getImports((Select)it);
    } else if (it instanceof ViewGroup) {
      return _getImports((ViewGroup)it);
    } else if (it instanceof WebView) {
      return _getImports((WebView)it);
    } else if (it != null) {
      return _getImports(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence init(final View it) {
    if (it instanceof DatePicker) {
      return _init((DatePicker)it);
    } else if (it instanceof WebView) {
      return _init((WebView)it);
    } else if (it != null) {
      return _init(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence generateInitFunction(final ViewGroup it) {
    {
      return _generateInitFunction(it);
    }
  }
  
  public CharSequence generateOnClickListener(final ViewGroup it) {
    {
      return _generateOnClickListener(it);
    }
  }
}
