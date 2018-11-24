/*
 * generated by Xtext 2.15.0
 */
package gui_proj.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GUIGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GuiElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gui_proj.GUI.Gui");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGUIKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cTitelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitelAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitelSTRINGTerminalRuleCall_3_0 = (RuleCall)cTitelAssignment_3.eContents().get(0);
		private final Keyword cHeigthKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cHeightAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cHeightINTTerminalRuleCall_5_0 = (RuleCall)cHeightAssignment_5.eContents().get(0);
		private final Keyword cWidthKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cWidthAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cWidthINTTerminalRuleCall_7_0 = (RuleCall)cWidthAssignment_7.eContents().get(0);
		private final Assignment cGuiObjectsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cGuiObjectsGUIElementParserRuleCall_8_0 = (RuleCall)cGuiObjectsAssignment_8.eContents().get(0);
		
		//Gui:
		//	"GUI" name=ID
		//	"Titel" titel=STRING
		//	"Heigth" height=INT
		//	"Width" width=INT
		//	guiObjects+=GUIElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//"GUI" name=ID "Titel" titel=STRING "Heigth" height=INT "Width" width=INT guiObjects+=GUIElement*
		public Group getGroup() { return cGroup; }
		
		//"GUI"
		public Keyword getGUIKeyword_0() { return cGUIKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"Titel"
		public Keyword getTitelKeyword_2() { return cTitelKeyword_2; }
		
		//titel=STRING
		public Assignment getTitelAssignment_3() { return cTitelAssignment_3; }
		
		//STRING
		public RuleCall getTitelSTRINGTerminalRuleCall_3_0() { return cTitelSTRINGTerminalRuleCall_3_0; }
		
		//"Heigth"
		public Keyword getHeigthKeyword_4() { return cHeigthKeyword_4; }
		
		//height=INT
		public Assignment getHeightAssignment_5() { return cHeightAssignment_5; }
		
		//INT
		public RuleCall getHeightINTTerminalRuleCall_5_0() { return cHeightINTTerminalRuleCall_5_0; }
		
		//"Width"
		public Keyword getWidthKeyword_6() { return cWidthKeyword_6; }
		
		//width=INT
		public Assignment getWidthAssignment_7() { return cWidthAssignment_7; }
		
		//INT
		public RuleCall getWidthINTTerminalRuleCall_7_0() { return cWidthINTTerminalRuleCall_7_0; }
		
		//guiObjects+=GUIElement*
		public Assignment getGuiObjectsAssignment_8() { return cGuiObjectsAssignment_8; }
		
		//GUIElement
		public RuleCall getGuiObjectsGUIElementParserRuleCall_8_0() { return cGuiObjectsGUIElementParserRuleCall_8_0; }
	}
	public class GUIElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gui_proj.GUI.GUIElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTextLabelParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInputFieldParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cButtonParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRadioButtonParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cCheckBoxParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//GUIElement:
		//	TextLabel | InputField | Button | RadioButton | CheckBox;
		@Override public ParserRule getRule() { return rule; }
		
		//TextLabel | InputField | Button | RadioButton | CheckBox
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TextLabel
		public RuleCall getTextLabelParserRuleCall_0() { return cTextLabelParserRuleCall_0; }
		
		//InputField
		public RuleCall getInputFieldParserRuleCall_1() { return cInputFieldParserRuleCall_1; }
		
		//Button
		public RuleCall getButtonParserRuleCall_2() { return cButtonParserRuleCall_2; }
		
		//RadioButton
		public RuleCall getRadioButtonParserRuleCall_3() { return cRadioButtonParserRuleCall_3; }
		
		//CheckBox
		public RuleCall getCheckBoxParserRuleCall_4() { return cCheckBoxParserRuleCall_4; }
	}
	public class GUIElementDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gui_proj.GUI.GUIElementDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCallbackKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCallbackAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCallbackSTRINGTerminalRuleCall_1_0 = (RuleCall)cCallbackAssignment_1.eContents().get(0);
		private final Keyword cTextKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTextAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTextSTRINGTerminalRuleCall_3_0 = (RuleCall)cTextAssignment_3.eContents().get(0);
		private final Keyword cLeftKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLeftAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLeftINTTerminalRuleCall_5_0 = (RuleCall)cLeftAssignment_5.eContents().get(0);
		private final Keyword cTopKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTopAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTopINTTerminalRuleCall_7_0 = (RuleCall)cTopAssignment_7.eContents().get(0);
		private final Keyword cHeigthKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cHeigthAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cHeigthINTTerminalRuleCall_9_0 = (RuleCall)cHeigthAssignment_9.eContents().get(0);
		private final Keyword cWidthKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cWidthAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cWidthINTTerminalRuleCall_11_0 = (RuleCall)cWidthAssignment_11.eContents().get(0);
		
		//GUIElementDescription:
		//	"callback" callback=STRING
		//	"text" text=STRING
		//	"left" left=INT
		//	"top" top=INT
		//	"heigth" heigth=INT
		//	"width" width=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//"callback" callback=STRING "text" text=STRING "left" left=INT "top" top=INT "heigth" heigth=INT "width" width=INT
		public Group getGroup() { return cGroup; }
		
		//"callback"
		public Keyword getCallbackKeyword_0() { return cCallbackKeyword_0; }
		
		//callback=STRING
		public Assignment getCallbackAssignment_1() { return cCallbackAssignment_1; }
		
		//STRING
		public RuleCall getCallbackSTRINGTerminalRuleCall_1_0() { return cCallbackSTRINGTerminalRuleCall_1_0; }
		
		//"text"
		public Keyword getTextKeyword_2() { return cTextKeyword_2; }
		
		//text=STRING
		public Assignment getTextAssignment_3() { return cTextAssignment_3; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_3_0() { return cTextSTRINGTerminalRuleCall_3_0; }
		
		//"left"
		public Keyword getLeftKeyword_4() { return cLeftKeyword_4; }
		
		//left=INT
		public Assignment getLeftAssignment_5() { return cLeftAssignment_5; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_5_0() { return cLeftINTTerminalRuleCall_5_0; }
		
		//"top"
		public Keyword getTopKeyword_6() { return cTopKeyword_6; }
		
		//top=INT
		public Assignment getTopAssignment_7() { return cTopAssignment_7; }
		
		//INT
		public RuleCall getTopINTTerminalRuleCall_7_0() { return cTopINTTerminalRuleCall_7_0; }
		
		//"heigth"
		public Keyword getHeigthKeyword_8() { return cHeigthKeyword_8; }
		
		//heigth=INT
		public Assignment getHeigthAssignment_9() { return cHeigthAssignment_9; }
		
		//INT
		public RuleCall getHeigthINTTerminalRuleCall_9_0() { return cHeigthINTTerminalRuleCall_9_0; }
		
		//"width"
		public Keyword getWidthKeyword_10() { return cWidthKeyword_10; }
		
		//width=INT
		public Assignment getWidthAssignment_11() { return cWidthAssignment_11; }
		
		//INT
		public RuleCall getWidthINTTerminalRuleCall_11_0() { return cWidthINTTerminalRuleCall_11_0; }
	}
	public class TextLabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gui_proj.GUI.TextLabel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTextLabelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTextLabelDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTextLabelDescriptionGUIElementDescriptionParserRuleCall_3_0 = (RuleCall)cTextLabelDescriptionAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TextLabel:
		//	'TextLabel' name=ID '{'
		//	textLabelDescription=GUIElementDescription
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'TextLabel' name=ID '{' textLabelDescription=GUIElementDescription '}'
		public Group getGroup() { return cGroup; }
		
		//'TextLabel'
		public Keyword getTextLabelKeyword_0() { return cTextLabelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//textLabelDescription=GUIElementDescription
		public Assignment getTextLabelDescriptionAssignment_3() { return cTextLabelDescriptionAssignment_3; }
		
		//GUIElementDescription
		public RuleCall getTextLabelDescriptionGUIElementDescriptionParserRuleCall_3_0() { return cTextLabelDescriptionGUIElementDescriptionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class InputFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gui_proj.GUI.InputField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInputFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInputFieldDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInputFieldDescriptionGUIElementDescriptionParserRuleCall_3_0 = (RuleCall)cInputFieldDescriptionAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InputField:
		//	'InputField' name=ID '{'
		//	inputFieldDescription=GUIElementDescription
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'InputField' name=ID '{' inputFieldDescription=GUIElementDescription '}'
		public Group getGroup() { return cGroup; }
		
		//'InputField'
		public Keyword getInputFieldKeyword_0() { return cInputFieldKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//inputFieldDescription=GUIElementDescription
		public Assignment getInputFieldDescriptionAssignment_3() { return cInputFieldDescriptionAssignment_3; }
		
		//GUIElementDescription
		public RuleCall getInputFieldDescriptionGUIElementDescriptionParserRuleCall_3_0() { return cInputFieldDescriptionGUIElementDescriptionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gui_proj.GUI.Button");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cButtonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cButtonDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cButtonDescriptionGUIElementDescriptionParserRuleCall_3_0 = (RuleCall)cButtonDescriptionAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Button:
		//	'Button' name=ID '{'
		//	buttonDescription=GUIElementDescription
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Button' name=ID '{' buttonDescription=GUIElementDescription '}'
		public Group getGroup() { return cGroup; }
		
		//'Button'
		public Keyword getButtonKeyword_0() { return cButtonKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//buttonDescription=GUIElementDescription
		public Assignment getButtonDescriptionAssignment_3() { return cButtonDescriptionAssignment_3; }
		
		//GUIElementDescription
		public RuleCall getButtonDescriptionGUIElementDescriptionParserRuleCall_3_0() { return cButtonDescriptionGUIElementDescriptionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class RadioButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gui_proj.GUI.RadioButton");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRadioButtonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRadioButtonDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRadioButtonDescriptionGUIElementDescriptionParserRuleCall_3_0 = (RuleCall)cRadioButtonDescriptionAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//RadioButton:
		//	'RadioButton' name=ID '{'
		//	radioButtonDescription=GUIElementDescription
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'RadioButton' name=ID '{' radioButtonDescription=GUIElementDescription '}'
		public Group getGroup() { return cGroup; }
		
		//'RadioButton'
		public Keyword getRadioButtonKeyword_0() { return cRadioButtonKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//radioButtonDescription=GUIElementDescription
		public Assignment getRadioButtonDescriptionAssignment_3() { return cRadioButtonDescriptionAssignment_3; }
		
		//GUIElementDescription
		public RuleCall getRadioButtonDescriptionGUIElementDescriptionParserRuleCall_3_0() { return cRadioButtonDescriptionGUIElementDescriptionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class CheckBoxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gui_proj.GUI.CheckBox");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCheckBoxKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCheckBoxDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCheckBoxDescriptionGUIElementDescriptionParserRuleCall_3_0 = (RuleCall)cCheckBoxDescriptionAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CheckBox:
		//	'CheckBox' name=ID '{'
		//	checkBoxDescription=GUIElementDescription
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CheckBox' name=ID '{' checkBoxDescription=GUIElementDescription '}'
		public Group getGroup() { return cGroup; }
		
		//'CheckBox'
		public Keyword getCheckBoxKeyword_0() { return cCheckBoxKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//checkBoxDescription=GUIElementDescription
		public Assignment getCheckBoxDescriptionAssignment_3() { return cCheckBoxDescriptionAssignment_3; }
		
		//GUIElementDescription
		public RuleCall getCheckBoxDescriptionGUIElementDescriptionParserRuleCall_3_0() { return cCheckBoxDescriptionGUIElementDescriptionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final GuiElements pGui;
	private final GUIElementElements pGUIElement;
	private final GUIElementDescriptionElements pGUIElementDescription;
	private final TextLabelElements pTextLabel;
	private final InputFieldElements pInputField;
	private final ButtonElements pButton;
	private final RadioButtonElements pRadioButton;
	private final CheckBoxElements pCheckBox;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GUIGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGui = new GuiElements();
		this.pGUIElement = new GUIElementElements();
		this.pGUIElementDescription = new GUIElementDescriptionElements();
		this.pTextLabel = new TextLabelElements();
		this.pInputField = new InputFieldElements();
		this.pButton = new ButtonElements();
		this.pRadioButton = new RadioButtonElements();
		this.pCheckBox = new CheckBoxElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("gui_proj.GUI".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Gui:
	//	"GUI" name=ID
	//	"Titel" titel=STRING
	//	"Heigth" height=INT
	//	"Width" width=INT
	//	guiObjects+=GUIElement*;
	public GuiElements getGuiAccess() {
		return pGui;
	}
	
	public ParserRule getGuiRule() {
		return getGuiAccess().getRule();
	}
	
	//GUIElement:
	//	TextLabel | InputField | Button | RadioButton | CheckBox;
	public GUIElementElements getGUIElementAccess() {
		return pGUIElement;
	}
	
	public ParserRule getGUIElementRule() {
		return getGUIElementAccess().getRule();
	}
	
	//GUIElementDescription:
	//	"callback" callback=STRING
	//	"text" text=STRING
	//	"left" left=INT
	//	"top" top=INT
	//	"heigth" heigth=INT
	//	"width" width=INT;
	public GUIElementDescriptionElements getGUIElementDescriptionAccess() {
		return pGUIElementDescription;
	}
	
	public ParserRule getGUIElementDescriptionRule() {
		return getGUIElementDescriptionAccess().getRule();
	}
	
	//TextLabel:
	//	'TextLabel' name=ID '{'
	//	textLabelDescription=GUIElementDescription
	//	'}';
	public TextLabelElements getTextLabelAccess() {
		return pTextLabel;
	}
	
	public ParserRule getTextLabelRule() {
		return getTextLabelAccess().getRule();
	}
	
	//InputField:
	//	'InputField' name=ID '{'
	//	inputFieldDescription=GUIElementDescription
	//	'}';
	public InputFieldElements getInputFieldAccess() {
		return pInputField;
	}
	
	public ParserRule getInputFieldRule() {
		return getInputFieldAccess().getRule();
	}
	
	//Button:
	//	'Button' name=ID '{'
	//	buttonDescription=GUIElementDescription
	//	'}';
	public ButtonElements getButtonAccess() {
		return pButton;
	}
	
	public ParserRule getButtonRule() {
		return getButtonAccess().getRule();
	}
	
	//RadioButton:
	//	'RadioButton' name=ID '{'
	//	radioButtonDescription=GUIElementDescription
	//	'}';
	public RadioButtonElements getRadioButtonAccess() {
		return pRadioButton;
	}
	
	public ParserRule getRadioButtonRule() {
		return getRadioButtonAccess().getRule();
	}
	
	//CheckBox:
	//	'CheckBox' name=ID '{'
	//	checkBoxDescription=GUIElementDescription
	//	'}';
	public CheckBoxElements getCheckBoxAccess() {
		return pCheckBox;
	}
	
	public ParserRule getCheckBoxRule() {
		return getCheckBoxAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}