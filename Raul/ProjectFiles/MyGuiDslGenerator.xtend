/*
 * generated by Xtext 2.15.0
 */
package gui_proj.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import gui_proj.myGuiDsl.*
import org.eclipse.xtext.naming.IQualifiedNameProvider
//import javax.inject.Inject
import com.google.inject.Inject

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyGuiDslGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider



	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (g : resource.allContents.toIterable.filter(Gui)) {
			fsa.generateFile(
            "genGUI_" + g.fullyQualifiedName.toString("/") + ".au3",
            g.compile)
            
            fsa.generateFile(
            "callbacks_" + g.fullyQualifiedName.toString("/") + ".au3",
            "hallo")
            
        }
	}
	
	
	
	def compile(Gui g) ''' 
	#Region include
	;~ general
	#include <GUIConstantsEx.au3>
	#include <WindowsConstants.au3>
	
	;~ ---spezific---
	;~ buttons Checkbox
	#include <ButtonConstants.au3>
	;~ inputfield
	#include <EditConstants.au3>
	;~ Label
	#include <StaticConstants.au3>
	#EndRegion END include
	
	Global �FOR e : g.guiObjects SEPARATOR ',' AFTER '\n'�$�e.name��ENDFOR�
	
	_initGUI()
	
	
	;~ Variablen m�ssen einzigartig sein, damit sie bei der implementierung nicht vergeben sind. oder vom Benutzer definiert!
	
	;~ _UserFuncBeforeGUIStart
	
	GUISetState(@SW_SHOW)
	
	While 1
		$nMsg = GUIGetMsg()
		Switch $nMsg
			Case $GUI_EVENT_CLOSE
				Exit
	
			Case $GUI_EVENT_MINIMIZE
	
			Case $GUI_EVENT_RESTORE
	
			Case $GUI_EVENT_MAXIMIZE
	
			Case $GUI_EVENT_MOUSEMOVE
	
			Case $GUI_EVENT_PRIMARYDOWN
	
			Case $GUI_EVENT_PRIMARYUP
	
			Case $GUI_EVENT_SECONDARYDOWN
	
			Case $GUI_EVENT_SECONDARYUP
	
			Case $GUI_EVENT_RESIZED
	
			Case $GUI_EVENT_DROPPED
	
	
	
	
	
			Case $Button1
				_Button1Func()
			Case $Input1
	
			Case $idRadio_1 To $idRadio_3
				_RadioFunc($nMsg - $idRadio_1)
				;~ GUIGetMsg radiobutton beispiel
				;~ GUICtrlCreateGroup
				;~ GUIStartGroup
	
			Case $Checkbox1
				_Checkbox1Func()
	
	
		EndSwitch
	
		;~ _UserFuncWhileGUIRunning   Das w�rde Blockieren!  evtl l�sung
	
	WEnd
	
	
	
	
	
	
	
	
	Func _initGUI()
		$Form1 = GUICreate("Form1", 350, 250, 200, 200)
		$Button1 = GUICtrlCreateButton("TestInputBox", 80, 140, 75, 25)
		$Input1 = GUICtrlCreateInput("Input1", 80, 110, 121, 21)
		$idRadio_1 = GUICtrlCreateRadio("Radio &0", 180, 20)
		             GUICtrlCreateRadio("Radio &1", 180, 50)
		$idRadio_3 = GUICtrlCreateRadio("Radio &2", 180, 80)
		$Label1 = GUICtrlCreateLabel("Label1", 100, 10, 36, 17)
		$Checkbox1 = GUICtrlCreateCheckbox("Checkbox1", 80, 30, 97, 17)
	EndFunc
	







'''
	
}






	

