/*
 * generated by Xtext 2.15.0
 */
package gui_proj


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GUIStandaloneSetup extends GUIStandaloneSetupGenerated {

	def static void doSetup() {
		new GUIStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}