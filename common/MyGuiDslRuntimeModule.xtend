/*
 * generated by Xtext 2.15.0
 */
package gui_proj

import org.eclipse.xtext.parser.DefaultEcoreElementFactory

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class MyGuiDslRuntimeModule extends AbstractMyGuiDslRuntimeModule {
	
	
	override bindIAstFactory() {
		return MyDefaultEcoreElementFactory
	}

		
}
