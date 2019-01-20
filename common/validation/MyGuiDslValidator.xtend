/*
 * generated by Xtext 2.15.0
 */
package gui_proj.validation

import org.eclipse.xtext.validation.Check
import gui_proj.myGuiDsl.GUIElement
import gui_proj.myGuiDsl.Gui
import gui_proj.myGuiDsl.MyGuiDslPackage
import java.util.Map
import java.util.HashMap
import gui_proj.myGuiDsl.GUIElementType
import java.text.MessageFormat

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
    	var flag = false
        var superGUI = (gE.eContainer as Gui)
        if (superGUI !== null) {
            for (other : superGUI.guiObjects) {
                if (gE.name == other.name) {
                	if (flag) {
                    error("GUIElement names have to be unique",
                        MyGuiDslPackage.Literals.GUI_ELEMENT__NAME)
                    return
                    
                    }
                    flag = true
                }
            }
        }
    }
	
	@Check
    def void checkGUINumberOfElements2(GUIElement elem) {
    	var limit = 5
    	var map = new HashMap<GUIElementType, Integer>()
    	
        var superGUI = (elem.eContainer as Gui)
        if (superGUI !== null) {
            for (gE : superGUI.guiObjects) {
	        	var num = map.putIfAbsent(gE.type, 0)
        		if(num === null) num = 1 else num++
	        	map.put(gE.type,num)
	        	if(gE.name == elem.name) {
					if(num > limit) {
						var msg = MessageFormat.format("Too many Elements of Type \"{0}\" ({1} > {2})", gE.type, num, limit)
						error(msg, MyGuiDslPackage.Literals.GUI_ELEMENT__TYPE)
					}
					return
	        	}
	        }
		}
    }	
    
    @Check
    def void checkGUITotalNumberOfElements(Gui gui) {
    	var totalLimit = 10
    	var total = gui.guiObjects.length 
        if(total > totalLimit) {
    		var msg = MessageFormat.format("Too many Elements ({0} > {1})", total, totalLimit)
    		error(msg, MyGuiDslPackage.Literals.GUI__NAME)
        }
    }
}
