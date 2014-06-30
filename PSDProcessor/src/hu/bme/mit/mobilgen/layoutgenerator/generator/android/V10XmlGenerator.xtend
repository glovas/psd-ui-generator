package hu.bme.mit.mobilgen.layoutgenerator.generator.android

import psdstructure.ViewGroup
import org.eclipse.emf.ecore.EClass
import psdstructure.*
import org.eclipse.core.resources.IProject
import java.io.ByteArrayInputStream
import org.eclipse.core.resources.IFile
import hu.bme.mit.mobilgen.layoutgenerator.helpers.FileHelper
import java.io.InputStreamReader
import java.io.BufferedReader
import psdstructure.View
import org.eclipse.emf.ecore.resource.Resource
import hu.bme.mit.mobilgen.layoutgenerator.generator.FileGenerator

class V10XmlGenerator extends FileGenerator {
	
	val outFolder = "/res/layout-v10"
	var AndroidBackgroundCreator abc
	var root = true
	var code = ""
	
	new(IProject project) {
		super(project);
		abc = new AndroidBackgroundCreator(project)
	}
	
	override save(String filename) {
		
		if(!project.getFolder(outFolder).exists()) {
			FileHelper.createFolder(project.getFolder(outFolder));
		}
		
		val file = project.getFile(outFolder+"/"+filename+ ".xml")
		// if file exists, check if enabled to generate
		if(file.exists){
			// check if contains generated header
			var oldContent = ""
			var nextPart = ""
			var reader = new BufferedReader(new InputStreamReader(file.contents))
			while((nextPart = reader.readLine()) != null){
				 oldContent = oldContent + nextPart;
			}
			
			if(!oldContent.contains("IF YOU WANT TO DISABLE REGENERATION REMOVE THIS COMMENT")){
				return
			}
			else {
				file.setContents(new ByteArrayInputStream(code.getBytes()), IFile.FORCE, null)
			}			
		}	
		else {
			file.create(new ByteArrayInputStream(code.getBytes()), true, null)
		}
		
	}
	
	override generate(Resource res) {
		code = generateHead().toString
		for (content : res.contents) {
			code = code + generateCode(content).toString
		}
	}

	def generateHead() '''
<!-- 
	THIS FILE IS GENERATED BASED ON A PSD FILE 
	IF YOU WANT TO DISABLE REGENERATION REMOVE THIS COMMENT
 -->
	'''

	def dispatch generateCode(ViewGroup it) {
		var filename = abc.create(it);	
		val isroot = root
		root = false;
		'''<AbsoluteLayout
			«IF isroot == true»
			xmlns:android="http://schemas.android.com/apk/res/android"
			«ENDIF»
			«IF size != null»
			android:layout_width="«size.x/2»dp"
			android:layout_height="«size.y/2»dp"
			«ELSE»
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			«ENDIF»
			android:layout_x="«pos.x/2»dp"
			android:layout_y="«pos.y/2»dp"
			android:id="@+id/«ID»" 
			android:background="@drawable/«filename»">
			«FOR view : children»
				«generateCode(view)»
			«ENDFOR»
			</AbsoluteLayout>
		'''
	}

	def dispatch generateCode(View it) {
		var filename = abc.create(it)
		'''<View
		        android:id="@+id/«ID»"
		        android:layout_width="«size.x/2»dp"
		        android:layout_height="«size.y/2»dp"
				android:layout_x="«pos.x/2»dp"
           		android:layout_y="«pos.y/2»dp"
           		android:background="@drawable/«filename»"	/>
		'''
	}

	def dispatch generateCode(AdView it)'''
	<com.google.android.gms.ads.AdView android:id="@+id/«ID»"
        android:layout_width="«size.x/2»dp"
        android:layout_height="«size.y/2»dp"
		android:layout_x="«pos.x/2»dp"
   		android:layout_y="«pos.y/2»dp"
        ads:adUnitId="«unitid»"
        ads:adSize="SMART_BANNER"/>'''

	def dispatch generateCode(Checkbox it) '''
	<CheckBox
		android:id="@+id/«ID»"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:layout_x="«pos.x/2»dp"
		android:layout_y="«pos.y/2»dp"
		«IF selected»
        android:checked="true"
		«ENDIF»
		 />'''

	def dispatch generateCode(Grid it) '''
		<android.support.v7.widget.GridLayout
		   	android:layout_width="«size.x/2»dp"
		   	android:layout_height="«size.y/2»dp"
			android:layout_x="«pos.x/2»dp"
		    android:layout_y="«pos.y/2»dp"
		    app:columnCount="«cols»"
		    app:rowCount="«rows»" >
		    «FOR view : children»
		    	«generateCode(view)»
		    «ENDFOR»
		</android.support.v7.widget.GridLayout>
	'''

	def dispatch generateCode(Image it) {
		var filename = abc.create(it)
		'''<ImageView
		        android:id="@+id/«ID»"
			   	android:layout_width="«size.x/2»dp"
			   	android:layout_height="«size.y/2»dp"
				android:layout_x="«pos.x/2»dp"
			    android:layout_y="«pos.y/2»dp"
		        android:src="@drawable/«filename»" />
		'''
	}
	
	def dispatch generateCode(Map it) '''
		<com.google.android.maps.MapView
		    android:id="@+id/«ID»"
		   	android:layout_width="«size.x/2»dp"
		   	android:layout_height="«size.y/2»dp"
			android:layout_x="«pos.x/2»dp"
		    android:layout_y="«pos.y/2»dp"
		    «IF clickable»
		    android:clickable="true"
		    «ELSE»
		    android:clickable="false"
		    «ENDIF»
		    android:apiKey="«apikey»"
		/>
	'''

	def dispatch generateCode(ProgressBar it) '''	
	    <ProgressBar
	        android:id="@+id/«ID»"
		   	android:layout_width="«size.x/2»dp"
		   	android:layout_height="«size.y/2»dp"
			android:layout_x="«pos.x/2»dp"
		    android:layout_y="«pos.y/2»dp"
        	style="?android:attr/progressBarStyleHorizontal" />
	'''
	
	def dispatch generateCode(ProgressSpinner it) '''	
	    <ProgressBar
	        android:id="@+id/«ID»"
		   	android:layout_width="«size.x/2»dp"
		   	android:layout_height="«size.y/2»dp"
			android:layout_x="«pos.x/2»dp"
		    android:layout_y="«pos.y/2»dp"
        	style="?android:attr/progressBarStyleLarge" />	
	'''
	
	def dispatch generateCode(RadioButton it) '''
		<RadioButton
	        android:id="@+id/«ID»"
		   	android:layout_width="wrap_content"
		   	android:layout_height="wrap_content"
			android:layout_x="«pos.x/2»dp"
		    android:layout_y="«pos.y/2»dp" />
	'''

	def dispatch generateCode(Button it){
		var filename = abc.create(it)	
		'''<Button
		        android:id="@+id/«ID»"
		        android:layout_width="«size.x/2»dp"
		        android:layout_height="«size.y/2»dp"
				android:layout_x="«pos.x/2»dp"
	       		android:layout_y="«pos.y/2»dp"
	       		android:background="@drawable/«filename»"    
		        android:text="«text»"
	       		android:onClick="onClick" />
		'''
	}
	
	def dispatch generateCode(Scroll it) '''
		<ScrollView
	        android:id="@+id/«ID»"
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
			android:layout_x="«pos.x/2»dp"
       		android:layout_y="«pos.y/2»dp" >
	        <LinearLayout
	            android:layout_width="match_parent"
	            android:layout_height="match_parent"
	            android:orientation="vertical" >
	            «FOR view : children»
	            	«generateCode(view)»
	            «ENDFOR»
	        </LinearLayout>
	    </ScrollView>	
	'''
	
	def dispatch generateCode(Select it) '''
		 <Spinner
	        android:id="@+id/«ID»"
	        android:layout_width="«size.x/2»dp"
	        android:layout_height="«size.y/2»dp"
			android:layout_x="«pos.x/2»dp"
       		android:layout_y="«pos.y/2»dp" />
	'''
	
	def dispatch generateCode(Slider it) '''
	    <SeekBar
	        android:id="@+id/«ID»"
	        android:layout_width="«size.x/2»dp"
	        android:layout_height="«size.y/2»dp"
			android:layout_x="«pos.x/2»dp"
       		android:layout_y="«pos.y/2»dp"
        	android:max="«max»"
        	android:progress="«^default»" />
	'''
	
	def dispatch generateCode(Switch it) '''
	<CheckBox
		android:id="@+id/«ID»"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:layout_x="«pos.x/2»dp"
		android:layout_y="«pos.y/2»dp"
		«IF selected»
        android:checked="true"
		«ENDIF»
	/>
	'''
	def dispatch generateCode(Text it) {
		var filename = abc.create(it)
		if(editable){
		'''<EditText
		        android:id="@+id/«ID»"
				android:layout_width="«size.x/2»dp"
				«IF size.y/2 < 12»
				android:layout_height="12dp"
				«ELSE»
				android:layout_height="«size.y/2»dp"
				«ENDIF»
				android:layout_x="«pos.x/2»dp"
				android:layout_y="«pos.y/2»dp"
		        android:text="«text»"
		        android:background="@drawable/«filename»"
		        «IF type != null»
		        android:inputType="«type»"
		        «ENDIF» />
		'''
		}
		else {
		'''<TextView
		        android:id="@+id/«ID»"
				android:layout_width="«size.x/2»dp"
				«IF size.y/2 < 12»
				android:layout_height="12dp"
				«ELSE»
				android:layout_height="«size.y/2»dp"
				«ENDIF»
				android:layout_x="«pos.x/2»dp"
				android:layout_y="«pos.y/2»dp"
		        android:text="«text»"
		        android:background="@drawable/«filename»" />
		'''
		}
	}
	
	def dispatch generateCode(WebView it) '''	
	    <WebView
	        android:id="@+id/«ID»"
			android:layout_width="«size.x/2»dp"
			android:layout_height="«size.y/2»dp"
			android:layout_x="«pos.x/2»dp"
			android:layout_y="«pos.y/2»dp" />
	'''

	def dispatch generateCode(EClass it) ''''''
	
}
