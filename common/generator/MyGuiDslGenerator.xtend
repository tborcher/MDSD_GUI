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

	var callbacksFileName = ""
	var guiFileName = ""

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (g : resource.allContents.toIterable.filter(Gui)) {
			var isCS = g.target == "WinForms" || g.target == "Both"
			var isA3 = g.target == "AutoIt" || g.target == "Both"
			var fqn = g.fullyQualifiedName.toString("/")
			if(isA3) {
				var prefix = "autoit/"
				guiFileName = prefix + "genGUI_" + fqn + ".au3"
				callbacksFileName = prefix + "callbacks_" + fqn + ".au3"
				fsa.generateFile(guiFileName,g.compile_A3)
				fsa.generateFile(callbacksFileName, g.createCallbacks_A3)
            }
			if(isCS) {
				var prefix = "csharp/"
				fsa.generateFile(prefix + fqn + ".Designer.cs", g.compile_cs)
				fsa.generateFile(prefix + fqn + ".cs", g.createCallbacks_cs)
				fsa.generateFile(prefix + "Program.cs", g.createMain_cs)
			}
        }
	}
	
	
	
	def compile_A3(Gui g) ''' 
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
	
	Global «FOR e : g.guiObjects SEPARATOR ',' AFTER '\n'»$«e.name»«ENDFOR»
	
	_initGUI()
	
	GUISetState(@SW_SHOW)
	
	While 1
		$nMsg = GUIGetMsg()
		Switch $nMsg
			Case $GUI_EVENT_CLOSE
				Exit
	
	«FOR e : g.guiObjects»«
		IF(e.type == GUIElementType.INPUT_FIELD)»«ELSE»		Case $«e.name»
				_«e.name»Func()
	«ENDIF»«ENDFOR»
	
		EndSwitch
	
	WEnd
	

	
	Func _initGUI()
		$«g.name» = GUICreate("«g.titel»", «g.width», «g.height»)
	«FOR e : g.guiObjects»	«e.compile_gE»
	«ENDFOR»EndFunc
	'''
	//create GUIElements in initGUI
	def compile_gE(GUIElement gE) '''«switch gE.type {
	case TEXT_LABEL:   "$" + gE.name + " = GUICtrlCreateLabel(\"" + gE.text + "\", " + gE.left + ", " + gE.top + optionalWidthHeight(gE) + ")"
	case INPUT_FIELD:  "$" + gE.name + " = GUICtrlCreateInput(\"" + gE.text + "\", " + gE.left + ", " + gE.top + optionalWidthHeight(gE) + ")"
	case BUTTON:       "$" + gE.name + " = GUICtrlCreateButton(\"" + gE.text + "\", " + gE.left + ", " + gE.top + optionalWidthHeight(gE) + ")"
	case RADIO_BUTTON: "$" + gE.name + " = GUICtrlCreateRadio(\"" + gE.text + "\", " + gE.left + ", " + gE.top + optionalWidthHeight(gE) + ")"
	case CHECK_BOX:    "$" + gE.name + " = GUICtrlCreateCheckbox(\"" + gE.text + "\", " + gE.left + ", " + gE.top + optionalWidthHeight(gE) + ")"
	default: 'ERROR'
	}»'''
	
	
	def String optionalWidthHeight(GUIElement gED){
		var ret = ""
		
		if((gED.width == 0)&&(gED.height == 0)){
		}else if((gED.width != 0)&&(gED.height == 0)){
			ret += ", " +  gED.width
		}else if((gED.width != 0)&&(gED.height != 0)){
			ret += ", " +  gED.width + ", " +  gED.height
		}else if((gED.width == 0)&&(gED.height != 0)){
			ret += ", Default, " +  gED.height
		}
		
		ret
	}
	
//===================================Callbacks A3=========================================
	def createCallbacks_A3(Gui g) '''
	#include <MsgBoxConstants.au3>
	#include "«guiFileName»"
	
	«FOR e : g.guiObjects»«
			IF e.type == GUIElementType.INPUT_FIELD»«ELSE»Func _«e.name»Func()
		MsgBox($MB_SYSTEMMODAL, "«e.name»", "«e.name»")
	EndFunc
	
	«ENDIF»«ENDFOR»
	'''
//===================================END Callbacks A3=========================================




//------------------------------------------------------------
// -------- C#

// BEFORE ''
// (INDENT TEXT SEPERATOR '' NEWLINE)*
// AFTER ''

def compile_cs(Gui g)'''
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ns_«g.fullyQualifiedName» {
	partial class «g.name» {
		/// <summary>
		/// Erforderliche Designervariable.
		/// </summary>
		private System.ComponentModel.IContainer components = null;

		/// <summary>
		/// Verwendete Ressourcen bereinigen.
		/// </summary>
		/// <param name="disposing">True, wenn verwaltete Ressourcen gelöscht werden sollen; andernfalls False.</param>
		protected override void Dispose(bool disposing) {
			if (disposing && (components != null)) {
				components.Dispose();
			}
			base.Dispose(disposing);
		}

		#region Vom Windows Form-Designer generierter Code

		/// <summary>
		/// Erforderliche Methode für die Designerunterstützung.
		/// Der Inhalt der Methode darf nicht mit dem Code-Editor geändert werden.
		/// </summary>
		private void InitializeComponent() {
«««			/// Initializer seperate to allow them referencing each other.
			«FOR e : g.guiObjects »
			this.«e.name» = new System.Windows.Forms.«createMemberType_cs(e.type)»();
			«ENDFOR»
			this.SuspendLayout();
			«FOR e : g.guiObjects »
			«e.createMember_cs»
			«ENDFOR»
«««			/// Outsourced for convenience, but I guess this can be moved into her as well.
			«g.createGUI»
			addCallbacks();
			this.ResumeLayout(false);
			this.PerformLayout();
		}

		#endregion

		«FOR e : g.guiObjects»
			private System.Windows.Forms.«createMemberType_cs(e.type)» «e.name»;
		«ENDFOR»
	}
}'''

var seqNum = 0

def createMemberType_cs(GUIElementType type) {
	switch type {
		case TEXT_LABEL:  return "Label"
		case INPUT_FIELD:  return "TextBox"
		case BUTTON:       return "Button"
		case RADIO_BUTTON: return "RadioButton"
		case CHECK_BOX:    return "CheckBox"
		default: 'ERROR'
	}
}

def createMember_cs(GUIElement e) '''
// 
// «e.name»
// 
«««	// Button, TextBox, RadioButton, Label, CheckBox (this is required, I think)
this.«e.name».Name = "«e.name»";
«««	// Button, TextBox, RadioButton, Label, CheckBox
this.«e.name».Location = new System.Drawing.Point(«e.left», «e.top»);
«IF e.width > 0 || e.height > 0»
«««	// Button, TextBox, RadioButton, Label, CheckBox
this.«e.name».Size = new System.Drawing.Size(«e.width», «e.height»);
«ELSE»
«««	// Label, CheckBox --> Will discard ".Size" scale based on "Text"
this.«e.name».AutoSize = true;
«ENDIF»
«««	// Button, TextBox, RadioButton, Label, CheckBox
this.«e.name».TabIndex = «seqNum++»;
«««	// Button, RadioButton, Label, CheckBox
this.«e.name».Text = "«e.text»";
«««	// Button, CheckBox (defaults to true)
«««//this.«e.name».UseVisualStyleBackColor = true;
«««	// Button, RadioButton, CheckBox
«««	if e.hasHandler then
«««		foreach(h in e.handler) do
«««			this.«e.name».«h.type» += new System.EventHandler(this.«h.name»);
this.Controls.Add(this.«e.name»);
'''
def createGUI(Gui g)'''
// 
// «g.name»
// 
«««	/// Default (MinScale, MaxScale)
this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
«««	/// Default
this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
this.ClientSize = new System.Drawing.Size(«g.width», «g.height»);
«««	<<{{assignMember}}>> --> easier done in createMember_cs
«««	/// Default
this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
«««	/// Default
this.Location = new System.Drawing.Point(200, 200);
this.Name = "«g.name»";
this.Text = "«g.name»";
«««	//------------
«««	with GUI gui having 
«««	--	name    :str: Title of Window
«««	--	width   :int: Size in X-Direction >> default 300 (?)
«««	--	height  :int: Size in Y-Direction >> default 300 (?)
'''
//} Folding mark1

def createCallbacks_cs(Gui g)'''
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ns_«g.fullyQualifiedName» {
	public partial class «g.name» : Form {
		public «g.name»() {
			InitializeComponent();
		}
		
		public void addCallbacks() {
			«FOR e : g.guiObjects »
				«IF e.type == GUIElementType.BUTTON»
				this.«e.name».Click += new System.EventHandler(this.«e.name»_Click);
				«ELSEIF e.type == GUIElementType.CHECK_BOX»
				this.«e.name».CheckedChanged += new System.EventHandler(this.«e.name»_CheckedChanged);
				«ELSEIF e.type == GUIElementType.RADIO_BUTTON»
				this.«e.name».CheckedChanged += new System.EventHandler(this.«e.name»_CheckedChanged);
				«ENDIF»
			«ENDFOR»
		}
		
		«FOR e : g.guiObjects »
			«IF e.type == GUIElementType.BUTTON»
			private void «e.name»_Click(object sender, EventArgs e) {
				MessageBox.Show("Hello World von «e.text»", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
			}«ELSEIF e.type == GUIElementType.CHECK_BOX»
			private void «e.name»_CheckedChanged(object sender, EventArgs e) {
				var chk = (CheckBox) sender;
				if (chk.Checked)
					MessageBox.Show("Checked", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
				else
					MessageBox.Show("Unchecked", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
			}«ELSEIF e.type == GUIElementType.RADIO_BUTTON»
			private void «e.name»_CheckedChanged(object sender, EventArgs e) {
				var rad = (RadioButton) sender;
				if (!rad.Checked) return;
				MessageBox.Show(rad.Text, "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
			}«ENDIF»
		«ENDFOR»
	}
}'''
/* Define Member "e" as
--	name    :str: VariableName >> default: ToLowercase(class) + SEQNO
--	class   :str: Button	or	System.Windows.Forms.Button, if using does not work.
--	left    :int: Position in px from left border
--	top     :int: Position in px from top border
--	width   :int: Size in X-Direction
--	height  :int: Size in Y-Direction >> default seems to be 17
--	display :str: Text to be displayed >> default: $name (if no sideeffects) or null (if the case)
--	handler :xxx: Collection of Callbacks >> default: null
--	parent  :GuiElement: Parent Element >> default: GUI-Root (??)
//*/

def createMain_cs(Gui g)'''
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ns_«g.fullyQualifiedName» {
	static class Program {
		/// <summary>
		/// Der Haupteinstiegspunkt für die Anwendung.
		/// </summary>
		[STAThread]
		static void Main() {
			Application.EnableVisualStyles();
			Application.SetCompatibleTextRenderingDefault(false);
			Application.Run(new «g.name»());
		}
	}
}'''

}

