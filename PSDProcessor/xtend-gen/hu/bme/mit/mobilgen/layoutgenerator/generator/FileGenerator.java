package hu.bme.mit.mobilgen.layoutgenerator.generator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public abstract class FileGenerator {
  protected IProject project;
  
  public FileGenerator(final IProject p) {
    this.project = p;
  }
  
  public abstract void generate(final Resource res);
  
  public abstract void save(final String filename);
}
