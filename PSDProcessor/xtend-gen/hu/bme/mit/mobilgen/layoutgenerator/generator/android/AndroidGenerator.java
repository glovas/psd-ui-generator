package hu.bme.mit.mobilgen.layoutgenerator.generator.android;

import com.google.common.base.Objects;
import hu.bme.mit.mobilgen.layoutgenerator.generator.android.ControllerGenerator;
import hu.bme.mit.mobilgen.layoutgenerator.generator.android.XmlGenerator;
import java.util.Map;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class AndroidGenerator {
  public void generate(final URI file, final IProject project, final String filename) {
    this.doEMFSetup();
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(file, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      String _fileExtension = file.fileExtension();
      boolean _notEquals_1 = (!Objects.equal(_fileExtension, null));
      _and_1 = _notEquals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      String _fileExtension_1 = file.fileExtension();
      boolean _equals = _fileExtension_1.equals("psdstructure");
      _and = _equals;
    }
    if (_and) {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      final Resource resource = resourceSet.getResource(file, true);
      final XmlGenerator xmlGenerator = new XmlGenerator(project);
      xmlGenerator.generate(resource);
      xmlGenerator.save(filename);
      final ControllerGenerator controllerGenerator = new ControllerGenerator(project, filename);
      controllerGenerator.generate(resource);
      controllerGenerator.save(filename);
    }
  }
  
  public Object doEMFSetup() {
    Map<String,Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    return _extensionToFactoryMap.put("psdstructure", _xMIResourceFactoryImpl);
  }
}
