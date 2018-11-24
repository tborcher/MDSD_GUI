/**
 * generated by Xtext 2.15.0
 */
package gui_proj.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class GUILabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public GUILabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}