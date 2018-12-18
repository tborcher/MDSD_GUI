/*
 * generated by Xtext 2.15.0
 */
package gui_proj.validation

import org.eclipse.xtext.validation.Check
import gui_proj.myGuiDsl.GUIElement
import gui_proj.myGuiDsl.Gui
import gui_proj.myGuiDsl.MyGuiDslPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyGuiDslValidator extends AbstractMyGuiDslValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyGuiDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

    @Check
    def void checkGUIElementNameIsUnique(GUIElement gE) {
        var superGUI = (gE.eContainer as Gui)
        while (superGUI !== null) {
            for (other : superGUI.guiObjects) {
                if (gE.name == other.name) {
                    error("GUIElement names have to be unique",
                        MyGuiDslPackage.Literals.GUI_ELEMENT__NAME)
                    return
                }
            }
        }
    }
	
}
