package hu.bme.mit.mobilgen.layoutgenerator.generator.android

import hu.bme.mit.mobilgen.layoutgenerator.generator.FileGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.core.resources.IProject
import psdstructure.ViewGroup
import java.util.List
import java.util.ArrayList
import psdstructure.View
import psdstructure.DatePicker
import psdstructure.Select
import psdstructure.Button
import psdstructure.WebView
import hu.bme.mit.mobilgen.layoutgenerator.helpers.FileHelper
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.ByteArrayInputStream
import org.eclipse.core.resources.IFile

class ControllerGenerator extends FileGenerator {
	
	val generatedCodePrefix = "/* GENERATED CODE, DO NOT EDIT MANUALY */"
	val generatedCodeSuffix = "/* END OF GENERATED CODE */" 
	var filename = ""
	var List<String> imported
	var code = ""
	
	new(IProject p) {
		super(p)
		imported = new ArrayList<String>()
	}
	
	new(IProject p, String f){
		super(p)
		imported = new ArrayList<String>()
		filename = f
	}
	
	override generate(Resource res) {
		
		val outFolder = getOutFolder(filename)
		
		if(!project.getFolder(outFolder).exists()) {
			for (content : res.contents) {
				code = code + generateClass(content as ViewGroup).toString
			}
			return 
		}
		
		val file = project.getFile(outFolder+"/"+getClassName(filename)+ ".java")
		// if file exists, check if enabled to generate
		if(!file.exists){
			for (content : res.contents) {
				code = code + generateClass(content as ViewGroup).toString
			}
			return
		}
		else {
			// if file exists, read old content and replace the old generated code
			var oldContent = ""
			var nextPart = ""
			var reader = new BufferedReader(new InputStreamReader(file.contents))
			while((nextPart = reader.readLine()) != null){
				 oldContent = oldContent + "\n" + nextPart;
			}
			
			oldContent = oldContent.replaceFirst("\n", "");
			
			var imports = generatedCodePrefix + "\n"
			var functions = generatedCodePrefix + "\n"
			
			for (content : res.contents) {
				imports = imports + getImports(content as ViewGroup).toString
				functions = functions + generateInitFunction(content as ViewGroup).toString
				functions = functions + generateOnClickListener(content as ViewGroup).toString
			}
			
			imports = imports + "\n" + generatedCodeSuffix
			functions = functions + "\n" + generatedCodeSuffix
			
			oldContent = oldContent.replaceAll(generatedCodePrefix.replace("*", "\\*")+"[^*]*" + generatedCodeSuffix.replace("*", "\\*"), functions)
			oldContent = oldContent.replaceFirst(generatedCodePrefix.replace("*", "\\*")+"[^*]*" + generatedCodeSuffix.replace("*", "\\*"), imports)
			code = oldContent						
		}
	}
	
	override save(String filename) {
		val outFolder = getOutFolder(filename)
		
		if(!project.getFolder(outFolder).exists()) {
			FileHelper.createFolder(project.getFolder(outFolder));
		}
		
		val file = project.getFile(outFolder+"/"+getClassName(filename)+ ".java")
		// if file exists, check if enabled to generate
		if(file.exists){
			// check if contains generated header
			var oldContent = ""
			var nextPart = ""
			var reader = new BufferedReader(new InputStreamReader(file.contents))
			while((nextPart = reader.readLine()) != null){
				 oldContent = oldContent + nextPart;
			}
			
			file.setContents(new ByteArrayInputStream(code.getBytes()), IFile.FORCE, null)			
		}	
		else {
			file.create(new ByteArrayInputStream(code.getBytes()), true, null)
		}
	}
	
	def dispatch generateClass(ViewGroup it)'''
		package «getPackage(filename)»;
		
		«generatedCodePrefix»
		«getImports(it)»
		«generatedCodeSuffix»
		
		import android.app.Activity;
		import android.view.View;
		import android.os.Bundle;
		
		public class «getClassName(filename)» extends Activity {
			
			@Override
			public void onCreate(Bundle b) {
				super.onCreate(b);
				setContentView(R.layout.«filename»);
				
				initViews();
			}
			
			private boolean yourOnClickListener(View v) {
				// TODO Auto generated method
				return false;	
			}
			
			«generatedCodePrefix»
			«generateOnClickListener(it)»
			
			«generateInitFunction(it)»
			«generatedCodeSuffix»
			
			
		}
	'''
	
	def dispatch getImports(View it)''''''
	def dispatch getImports(DatePicker it) {
		if(!imported.contains("android.widget.DatePicker")){
			imported.add("android.widget.DatePicker")
			return "import android.widget.DatePicker;
					import java.util.Calendar;"	
		}
	}
	def dispatch getImports(Select it) {
		if(!imported.contains("android.widget.Spinner")){
			imported.add("android.widget.Spinner")
			return "import android.widget.Spinner;"
		}
	}
	def dispatch getImports(Button it) {
		if(!imported.contains("android.widget.Button")){
			imported.add("android.widget.Button")
			return "import android.widget.Button;"
		}
	}
	def dispatch getImports(WebView it){
		if(!imported.contains("android.widget.WebView")){
			imported.add("android.widget.WebView")
			return "import android.widget.WebView;"
		}
	}
	def dispatch getImports(ViewGroup it)'''
		«FOR child : children»
		«getImports(child)»
		«ENDFOR»
	'''
	
	def dispatch init(View it) ''''''
	def dispatch init(DatePicker it) '''
		Calendar cal = Calendar.getInstance();		
		DatePicker datePicker = ((DatePicker)findViewById(R.id.«ID»));
		
		«IF ^default != null»
		cal.setTime(«^default»);
		«ENDIF»
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		
		datePicker.updateDate(year, month, day);
		«IF min != null»
		cal.setTime(«min»);
		datePicker.setMinDate(cal.getTimeInMillis());
		«ENDIF»
		«IF max != null»
		cal.setTime(«max»);
		datePicker.setMaxDate(cal.getTimeInMillis());
		«ENDIF»
	'''
	def dispatch init(WebView it) '''
		WebView webView = (WebView)findViewById(R.id.«ID»);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.setWebChromeClient(new WebChromeClient());
        «IF url != null»
        webView.loadUrl("«url»");
        «ENDIF»
	'''
	
	def dispatch generateInitFunction(ViewGroup it) '''
		
		public void initViews(){
		«FOR child : children»
		«init(child)»
		«ENDFOR»	
		}
		
	'''
	
	def dispatch generateOnClickListener(ViewGroup it)'''		
		public void onClick(View v){
			yourOnClickListener(v);
		}		
	'''
	
	
	def getPackage(String filename){
		if(filename.contains("_")){
			return filename.subSequence(0, filename.lastIndexOf("_")).toString.replaceAll("_", ".")
		}
		return filename
	}
	
	def getClassName(String filename) {
		return filename.subSequence(filename.lastIndexOf("_")+1, filename.length)
	}
	
	def getOutFolder(String filename) {
		return "/src/" + filename.subSequence(0, filename.lastIndexOf("_")).toString.replaceAll("_", "/")
	}
	
}