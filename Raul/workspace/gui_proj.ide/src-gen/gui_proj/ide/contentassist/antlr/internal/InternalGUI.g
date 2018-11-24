/*
 * generated by Xtext 2.15.0
 */
grammar InternalGUI;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package gui_proj.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package gui_proj.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import gui_proj.services.GUIGrammarAccess;

}
@parser::members {
	private GUIGrammarAccess grammarAccess;

	public void setGrammarAccess(GUIGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleGui
entryRuleGui
:
{ before(grammarAccess.getGuiRule()); }
	 ruleGui
{ after(grammarAccess.getGuiRule()); } 
	 EOF 
;

// Rule Gui
ruleGui 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGuiAccess().getGroup()); }
		(rule__Gui__Group__0)
		{ after(grammarAccess.getGuiAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGUIElement
entryRuleGUIElement
:
{ before(grammarAccess.getGUIElementRule()); }
	 ruleGUIElement
{ after(grammarAccess.getGUIElementRule()); } 
	 EOF 
;

// Rule GUIElement
ruleGUIElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGUIElementAccess().getAlternatives()); }
		(rule__GUIElement__Alternatives)
		{ after(grammarAccess.getGUIElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGUIElementDescription
entryRuleGUIElementDescription
:
{ before(grammarAccess.getGUIElementDescriptionRule()); }
	 ruleGUIElementDescription
{ after(grammarAccess.getGUIElementDescriptionRule()); } 
	 EOF 
;

// Rule GUIElementDescription
ruleGUIElementDescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGUIElementDescriptionAccess().getGroup()); }
		(rule__GUIElementDescription__Group__0)
		{ after(grammarAccess.getGUIElementDescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTextLabel
entryRuleTextLabel
:
{ before(grammarAccess.getTextLabelRule()); }
	 ruleTextLabel
{ after(grammarAccess.getTextLabelRule()); } 
	 EOF 
;

// Rule TextLabel
ruleTextLabel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTextLabelAccess().getGroup()); }
		(rule__TextLabel__Group__0)
		{ after(grammarAccess.getTextLabelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInputField
entryRuleInputField
:
{ before(grammarAccess.getInputFieldRule()); }
	 ruleInputField
{ after(grammarAccess.getInputFieldRule()); } 
	 EOF 
;

// Rule InputField
ruleInputField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputFieldAccess().getGroup()); }
		(rule__InputField__Group__0)
		{ after(grammarAccess.getInputFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleButton
entryRuleButton
:
{ before(grammarAccess.getButtonRule()); }
	 ruleButton
{ after(grammarAccess.getButtonRule()); } 
	 EOF 
;

// Rule Button
ruleButton 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getButtonAccess().getGroup()); }
		(rule__Button__Group__0)
		{ after(grammarAccess.getButtonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRadioButton
entryRuleRadioButton
:
{ before(grammarAccess.getRadioButtonRule()); }
	 ruleRadioButton
{ after(grammarAccess.getRadioButtonRule()); } 
	 EOF 
;

// Rule RadioButton
ruleRadioButton 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRadioButtonAccess().getGroup()); }
		(rule__RadioButton__Group__0)
		{ after(grammarAccess.getRadioButtonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCheckBox
entryRuleCheckBox
:
{ before(grammarAccess.getCheckBoxRule()); }
	 ruleCheckBox
{ after(grammarAccess.getCheckBoxRule()); } 
	 EOF 
;

// Rule CheckBox
ruleCheckBox 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCheckBoxAccess().getGroup()); }
		(rule__CheckBox__Group__0)
		{ after(grammarAccess.getCheckBoxAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGUIElementAccess().getTextLabelParserRuleCall_0()); }
		ruleTextLabel
		{ after(grammarAccess.getGUIElementAccess().getTextLabelParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGUIElementAccess().getInputFieldParserRuleCall_1()); }
		ruleInputField
		{ after(grammarAccess.getGUIElementAccess().getInputFieldParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getGUIElementAccess().getButtonParserRuleCall_2()); }
		ruleButton
		{ after(grammarAccess.getGUIElementAccess().getButtonParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getGUIElementAccess().getRadioButtonParserRuleCall_3()); }
		ruleRadioButton
		{ after(grammarAccess.getGUIElementAccess().getRadioButtonParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getGUIElementAccess().getCheckBoxParserRuleCall_4()); }
		ruleCheckBox
		{ after(grammarAccess.getGUIElementAccess().getCheckBoxParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gui__Group__0__Impl
	rule__Gui__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuiAccess().getGUIKeyword_0()); }
	'GUI'
	{ after(grammarAccess.getGuiAccess().getGUIKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gui__Group__1__Impl
	rule__Gui__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuiAccess().getNameAssignment_1()); }
	(rule__Gui__NameAssignment_1)
	{ after(grammarAccess.getGuiAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gui__Group__2__Impl
	rule__Gui__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuiAccess().getTitelKeyword_2()); }
	'Titel'
	{ after(grammarAccess.getGuiAccess().getTitelKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gui__Group__3__Impl
	rule__Gui__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuiAccess().getTitelAssignment_3()); }
	(rule__Gui__TitelAssignment_3)
	{ after(grammarAccess.getGuiAccess().getTitelAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gui__Group__4__Impl
	rule__Gui__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuiAccess().getHeigthKeyword_4()); }
	'Heigth'
	{ after(grammarAccess.getGuiAccess().getHeigthKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gui__Group__5__Impl
	rule__Gui__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuiAccess().getHeightAssignment_5()); }
	(rule__Gui__HeightAssignment_5)
	{ after(grammarAccess.getGuiAccess().getHeightAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gui__Group__6__Impl
	rule__Gui__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuiAccess().getWidthKeyword_6()); }
	'Width'
	{ after(grammarAccess.getGuiAccess().getWidthKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gui__Group__7__Impl
	rule__Gui__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuiAccess().getWidthAssignment_7()); }
	(rule__Gui__WidthAssignment_7)
	{ after(grammarAccess.getGuiAccess().getWidthAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gui__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuiAccess().getGuiObjectsAssignment_8()); }
	(rule__Gui__GuiObjectsAssignment_8)*
	{ after(grammarAccess.getGuiAccess().getGuiObjectsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GUIElementDescription__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__0__Impl
	rule__GUIElementDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getCallbackKeyword_0()); }
	'callback'
	{ after(grammarAccess.getGUIElementDescriptionAccess().getCallbackKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__1__Impl
	rule__GUIElementDescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getCallbackAssignment_1()); }
	(rule__GUIElementDescription__CallbackAssignment_1)
	{ after(grammarAccess.getGUIElementDescriptionAccess().getCallbackAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__2__Impl
	rule__GUIElementDescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getTextKeyword_2()); }
	'text'
	{ after(grammarAccess.getGUIElementDescriptionAccess().getTextKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__3__Impl
	rule__GUIElementDescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getTextAssignment_3()); }
	(rule__GUIElementDescription__TextAssignment_3)
	{ after(grammarAccess.getGUIElementDescriptionAccess().getTextAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__4__Impl
	rule__GUIElementDescription__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getLeftKeyword_4()); }
	'left'
	{ after(grammarAccess.getGUIElementDescriptionAccess().getLeftKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__5__Impl
	rule__GUIElementDescription__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getLeftAssignment_5()); }
	(rule__GUIElementDescription__LeftAssignment_5)
	{ after(grammarAccess.getGUIElementDescriptionAccess().getLeftAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__6__Impl
	rule__GUIElementDescription__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getTopKeyword_6()); }
	'top'
	{ after(grammarAccess.getGUIElementDescriptionAccess().getTopKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__7__Impl
	rule__GUIElementDescription__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getTopAssignment_7()); }
	(rule__GUIElementDescription__TopAssignment_7)
	{ after(grammarAccess.getGUIElementDescriptionAccess().getTopAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__8__Impl
	rule__GUIElementDescription__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getHeigthKeyword_8()); }
	'heigth'
	{ after(grammarAccess.getGUIElementDescriptionAccess().getHeigthKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__9__Impl
	rule__GUIElementDescription__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getHeigthAssignment_9()); }
	(rule__GUIElementDescription__HeigthAssignment_9)
	{ after(grammarAccess.getGUIElementDescriptionAccess().getHeigthAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__10__Impl
	rule__GUIElementDescription__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getWidthKeyword_10()); }
	'width'
	{ after(grammarAccess.getGUIElementDescriptionAccess().getWidthKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GUIElementDescription__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGUIElementDescriptionAccess().getWidthAssignment_11()); }
	(rule__GUIElementDescription__WidthAssignment_11)
	{ after(grammarAccess.getGUIElementDescriptionAccess().getWidthAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TextLabel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TextLabel__Group__0__Impl
	rule__TextLabel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTextLabelAccess().getTextLabelKeyword_0()); }
	'TextLabel'
	{ after(grammarAccess.getTextLabelAccess().getTextLabelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TextLabel__Group__1__Impl
	rule__TextLabel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTextLabelAccess().getNameAssignment_1()); }
	(rule__TextLabel__NameAssignment_1)
	{ after(grammarAccess.getTextLabelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TextLabel__Group__2__Impl
	rule__TextLabel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTextLabelAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTextLabelAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TextLabel__Group__3__Impl
	rule__TextLabel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTextLabelAccess().getTextLabelDescriptionAssignment_3()); }
	(rule__TextLabel__TextLabelDescriptionAssignment_3)
	{ after(grammarAccess.getTextLabelAccess().getTextLabelDescriptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TextLabel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTextLabelAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTextLabelAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InputField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputField__Group__0__Impl
	rule__InputField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputFieldAccess().getInputFieldKeyword_0()); }
	'InputField'
	{ after(grammarAccess.getInputFieldAccess().getInputFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputField__Group__1__Impl
	rule__InputField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputFieldAccess().getNameAssignment_1()); }
	(rule__InputField__NameAssignment_1)
	{ after(grammarAccess.getInputFieldAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputField__Group__2__Impl
	rule__InputField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputFieldAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getInputFieldAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputField__Group__3__Impl
	rule__InputField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputFieldAccess().getInputFieldDescriptionAssignment_3()); }
	(rule__InputField__InputFieldDescriptionAssignment_3)
	{ after(grammarAccess.getInputFieldAccess().getInputFieldDescriptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputField__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputFieldAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getInputFieldAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Button__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__0__Impl
	rule__Button__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getButtonKeyword_0()); }
	'Button'
	{ after(grammarAccess.getButtonAccess().getButtonKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__1__Impl
	rule__Button__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getNameAssignment_1()); }
	(rule__Button__NameAssignment_1)
	{ after(grammarAccess.getButtonAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__2__Impl
	rule__Button__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__3__Impl
	rule__Button__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getButtonDescriptionAssignment_3()); }
	(rule__Button__ButtonDescriptionAssignment_3)
	{ after(grammarAccess.getButtonAccess().getButtonDescriptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RadioButton__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RadioButton__Group__0__Impl
	rule__RadioButton__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRadioButtonAccess().getRadioButtonKeyword_0()); }
	'RadioButton'
	{ after(grammarAccess.getRadioButtonAccess().getRadioButtonKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RadioButton__Group__1__Impl
	rule__RadioButton__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRadioButtonAccess().getNameAssignment_1()); }
	(rule__RadioButton__NameAssignment_1)
	{ after(grammarAccess.getRadioButtonAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RadioButton__Group__2__Impl
	rule__RadioButton__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RadioButton__Group__3__Impl
	rule__RadioButton__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionAssignment_3()); }
	(rule__RadioButton__RadioButtonDescriptionAssignment_3)
	{ after(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RadioButton__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CheckBox__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CheckBox__Group__0__Impl
	rule__CheckBox__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0()); }
	'CheckBox'
	{ after(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CheckBox__Group__1__Impl
	rule__CheckBox__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheckBoxAccess().getNameAssignment_1()); }
	(rule__CheckBox__NameAssignment_1)
	{ after(grammarAccess.getCheckBoxAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CheckBox__Group__2__Impl
	rule__CheckBox__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CheckBox__Group__3__Impl
	rule__CheckBox__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionAssignment_3()); }
	(rule__CheckBox__CheckBoxDescriptionAssignment_3)
	{ after(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CheckBox__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Gui__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuiAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGuiAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__TitelAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuiAccess().getTitelSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getGuiAccess().getTitelSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__HeightAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuiAccess().getHeightINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getGuiAccess().getHeightINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__WidthAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuiAccess().getWidthINTTerminalRuleCall_7_0()); }
		RULE_INT
		{ after(grammarAccess.getGuiAccess().getWidthINTTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gui__GuiObjectsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuiAccess().getGuiObjectsGUIElementParserRuleCall_8_0()); }
		ruleGUIElement
		{ after(grammarAccess.getGuiAccess().getGuiObjectsGUIElementParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__CallbackAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGUIElementDescriptionAccess().getCallbackSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getGUIElementDescriptionAccess().getCallbackSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__TextAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGUIElementDescriptionAccess().getTextSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getGUIElementDescriptionAccess().getTextSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__LeftAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGUIElementDescriptionAccess().getLeftINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getGUIElementDescriptionAccess().getLeftINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__TopAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGUIElementDescriptionAccess().getTopINTTerminalRuleCall_7_0()); }
		RULE_INT
		{ after(grammarAccess.getGUIElementDescriptionAccess().getTopINTTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__HeigthAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGUIElementDescriptionAccess().getHeigthINTTerminalRuleCall_9_0()); }
		RULE_INT
		{ after(grammarAccess.getGUIElementDescriptionAccess().getHeigthINTTerminalRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GUIElementDescription__WidthAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGUIElementDescriptionAccess().getWidthINTTerminalRuleCall_11_0()); }
		RULE_INT
		{ after(grammarAccess.getGUIElementDescriptionAccess().getWidthINTTerminalRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTextLabelAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTextLabelAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TextLabel__TextLabelDescriptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTextLabelAccess().getTextLabelDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
		ruleGUIElementDescription
		{ after(grammarAccess.getTextLabelAccess().getTextLabelDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputFieldAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInputFieldAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputField__InputFieldDescriptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputFieldAccess().getInputFieldDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
		ruleGUIElementDescription
		{ after(grammarAccess.getInputFieldAccess().getInputFieldDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__ButtonDescriptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getButtonAccess().getButtonDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
		ruleGUIElementDescription
		{ after(grammarAccess.getButtonAccess().getButtonDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRadioButtonAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRadioButtonAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RadioButton__RadioButtonDescriptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
		ruleGUIElementDescription
		{ after(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCheckBoxAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCheckBoxAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CheckBox__CheckBoxDescriptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
		ruleGUIElementDescription
		{ after(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionGUIElementDescriptionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;