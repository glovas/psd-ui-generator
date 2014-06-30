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

class XmlGenerator extends FileGenerator {
	
	val outFolder = "/res/layout"
	var AndroidBackgroundCreator abc
	var root = true
	var code = ""
	var model = null
	var BitmapXmlGenerator bxg
	
	new(IProject project) {
		super(project);
		abc = new AndroidBackgroundCreator(project)
		bxg = new BitmapXmlGenerator(project)
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
			model = content
			code = code + generateCode(content).toString
		}
	}
	
	def fixChildren(Grid g) {
		for(child : g.children) {
			for(bg : child.backgrounds) {
				var newPos = bg.getPos();
				newPos.setX(newPos.getX() - (child.getPos().getX()));
				newPos.setY(newPos.getY() - (child.getPos().getY()));
				bg.setPos(newPos);
			}
			child.getPos().setX(0);
			child.getPos().setY(0);
		}
	}
	
	def dispatch position(View it){
		 val rp = RelativePosition.getPosition(model as ViewGroup, it);
		 '''
		 «IF rp.getAlignParent(RelativePosition.TOP)»
		 android:layout_alignParentTop="true"
		 «ENDIF»
		 «IF (rp.getAlignParent(RelativePosition.BOTTOM) && rp.getNeighbour(RelativePosition.TOP).length == 0 && !rp.getAlignParent(RelativePosition.TOP))»
		 android:layout_alignParentBottom="true"
		 «ENDIF»
		 «IF rp.centerHorizontal == false»
		 «IF rp.getAlignParent(RelativePosition.LEFT)»
		 android:layout_alignParentLeft="true"
		 «ENDIF»
		 «IF rp.getAlignParent(RelativePosition.RIGHT)»
		 android:layout_alignParentRight="true"
		 «ENDIF»
		 «ENDIF»
		 android:layout_marginTop="«rp.getMargin(RelativePosition.TOP)/2»dp"
		 «IF rp.centerHorizontal == false»
		 android:layout_marginRight="«rp.getMargin(RelativePosition.RIGHT)/2»dp"
		 android:layout_marginLeft="«rp.getMargin(RelativePosition.LEFT)/2»dp"
		 «ELSE»
		 android:layout_centerHorizontal="true"
		 «IF !(it instanceof Grid)»
		 android:paddingLeft="«rp.getPadding(RelativePosition.LEFT)»dp"
		 android:paddingRight="«rp.getPadding(RelativePosition.RIGHT)»dp"
		 «ENDIF»
		 «ENDIF»
		 «IF rp.getNeighbour(RelativePosition.TOP).length > 0»
		 android:layout_below="@+id/«rp.getNeighbour(RelativePosition.TOP)»"
		 «ENDIF»
		 «IF rp.getNeighbour(RelativePosition.LEFT).length > 0»
		 android:layout_toRightOf="@+id/«rp.getNeighbour(RelativePosition.LEFT)»"
		 «ENDIF»
		 '''
		 
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
		'''<RelativeLayout
			«IF isroot == true»
			xmlns:android="http://schemas.android.com/apk/res/android"
			android:layout_height="match_parent"
			android:layout_width="match_parent"
			«ELSE»
			«IF size != null»
			android:layout_width="«size.x/2»dp"
			android:layout_height="«size.y/2»dp"
			«ELSE»
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			«ENDIF»
			«ENDIF»
			«IF isroot == false»
			«position(it)»
			«ENDIF»
			android:id="@+id/«ID»" 
			android:background="@drawable/«filename»">
			«FOR view : children»
				«generateCode(view)»
			«ENDFOR»
			</RelativeLayout>
		'''
	}

	def dispatch generateCode(View it) {
		val rp = RelativePosition.getPosition(model as ViewGroup, it);
		var filename = bxg.generate(abc.create(it),rp);	
		'''<View
		        android:id="@+id/«ID»"
		        android:layout_width="«size.x/2»dp"
		        android:layout_height="«size.y/2»dp"
				«position(it)»
           		android:background="@drawable/«filename»"	/>
		'''
	}

	def dispatch generateCode(AdView it)'''
	<com.google.android.gms.ads.AdView android:id="@+id/«ID»"
        android:layout_width="«size.x/2»dp"
        android:layout_height="«size.y/2»dp"
		«position(it)»
        ads:adUnitId="«unitid»"
        ads:adSize="SMART_BANNER"/>'''

	def dispatch generateCode(Checkbox it) '''
	<CheckBox
		android:id="@+id/«ID»"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		«position(it)»
		«IF selected»
        android:checked="true"
		«ENDIF»
		 />'''

	def dispatch generateCode(Grid it) {
	fixChildren(it);
	'''<GridLayout
		   	android:layout_width="«size.x/2»dp"
		   	android:layout_height="«size.y/2»dp"
			«position(it)»
		    android:columnCount="«cols»"
		    android:rowCount="«rows»" >
		    «FOR view : children»
		    	«generateCode(view)»
		    «ENDFOR»
		</GridLayout>
	'''
	}

	def dispatch generateCode(Image it) {
		val rp = RelativePosition.getPosition(model as ViewGroup, it);
		var filename = bxg.generate(abc.create(it),rp);	
		'''<ImageView
		        android:id="@+id/«ID»"
			   	android:layout_width="«size.x/2»dp"
			   	android:layout_height="«size.y/2»dp"
				«position(it)»
		        android:src="@drawable/«filename»" />
		'''
	}
	
	def dispatch generateCode(Map it) '''
		<com.google.android.maps.MapView
		    android:id="@+id/«ID»"
		   	android:layout_width="«size.x/2»dp"
		   	android:layout_height="«size.y/2»dp"
			«position(it)»
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
			«position(it)»
        	style="?android:attr/progressBarStyleHorizontal" />
	'''
	
	def dispatch generateCode(ProgressSpinner it) '''	
	    <ProgressBar
	        android:id="@+id/«ID»"
		   	android:layout_width="«size.x/2»dp"
		   	android:layout_height="«size.y/2»dp"
			«position(it)»
        	style="?android:attr/progressBarStyleLarge" />	
	'''
	
	def dispatch generateCode(RadioButton it) '''
		<RadioButton
	        android:id="@+id/«ID»"
		   	android:layout_width="wrap_content"
		   	android:layout_height="wrap_content"
			«position(it)» />
	'''

	def dispatch generateCode(Button it){
		val rp = RelativePosition.getPosition(model as ViewGroup, it);
		var filename = bxg.generate(abc.create(it),rp);	
		'''<Button
		        android:id="@+id/«ID»"
		        android:layout_width="«size.x/2»dp"
		        android:layout_height="«size.y/2»dp"
				«position(it)»
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
			«position(it)» >
	        <RelativeLayout
	            android:layout_width="match_parent"
	            android:layout_height="wrap_content"
	            android:orientation="vertical" >
	            «FOR view : children»
	            	«generateCode(view)»
	            «ENDFOR»
	        </RelativeLayout>
	    </ScrollView>	
	'''
	
	def dispatch generateCode(Select it) {
	val rp = RelativePosition.getPosition(model as ViewGroup, it);
	var filename = bxg.generate(abc.create(it),rp);	
	'''
		 <Spinner
	        android:id="@+id/«ID»"
	        android:layout_width="«size.x/2»dp"
	        android:layout_height="«size.y/2»dp"
		    android:background="@drawable/«filename»"
			«position(it)» />
	'''
	}
	
	def dispatch generateCode(Slider it) '''
	    <SeekBar
	        android:id="@+id/«ID»"
	        android:layout_width="«size.x/2»dp"
	        android:layout_height="«size.y/2»dp"
			«position(it)»
        	android:max="«max»"
        	android:progress="«^default»" />
	'''
	
	def dispatch generateCode(Switch it) '''
	<Switch
		android:id="@+id/«ID»"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		«position(it)»
		«IF selected»
        android:checked="true"
		«ENDIF»
	/>
	'''
	def dispatch generateCode(Text it) {
		val rp = RelativePosition.getPosition(model as ViewGroup, it);
		var filename = bxg.generate(abc.create(it),rp);	
		if(editable){
		'''<EditText
		        android:id="@+id/«ID»"
				android:layout_width="«size.x/2»dp"
				«IF size.y/2 < 12»
				android:layout_height="12dp"
				«ELSE»
				android:layout_height="«size.y/2»dp"
				«ENDIF»
				«position(it)»
		        android:text="«text»"
		        android:background="@drawable/«filename»" />
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
				«position(it)»
		        android:text="«text»" />
		'''
		}
	}
	
	def dispatch generateCode(WebView it) '''	
	    <WebView
	        android:id="@+id/«ID»"
			android:layout_width="«size.x/2»dp"
			android:layout_height="«size.y/2»dp"
			«position(it)» />
	'''

	def dispatch generateCode(EClass it) ''''''
		
}
