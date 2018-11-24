/*
 * generated by Xtext 2.15.0
 */
package gui_proj.serializer;

import com.google.inject.Inject;
import gui_proj.gUI.Button;
import gui_proj.gUI.CheckBox;
import gui_proj.gUI.GUIElementDescription;
import gui_proj.gUI.GUIPackage;
import gui_proj.gUI.Gui;
import gui_proj.gUI.InputField;
import gui_proj.gUI.RadioButton;
import gui_proj.gUI.TextLabel;
import gui_proj.services.GUIGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GUISemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GUIGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GUIPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GUIPackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case GUIPackage.CHECK_BOX:
				sequence_CheckBox(context, (CheckBox) semanticObject); 
				return; 
			case GUIPackage.GUI_ELEMENT_DESCRIPTION:
				sequence_GUIElementDescription(context, (GUIElementDescription) semanticObject); 
				return; 
			case GUIPackage.GUI:
				sequence_Gui(context, (Gui) semanticObject); 
				return; 
			case GUIPackage.INPUT_FIELD:
				sequence_InputField(context, (InputField) semanticObject); 
				return; 
			case GUIPackage.RADIO_BUTTON:
				sequence_RadioButton(context, (RadioButton) semanticObject); 
				return; 
			case GUIPackage.TEXT_LABEL:
				sequence_TextLabel(context, (TextLabel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GUIElement returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     (name=ID buttonDescription=GUIElementDescription)
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.BUTTON__BUTTON_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.BUTTON__BUTTON_DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getButtonAccess().getButtonDescriptionGUIElementDescriptionParserRuleCall_3_0(), semanticObject.getButtonDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GUIElement returns CheckBox
	 *     CheckBox returns CheckBox
	 *
	 * Constraint:
	 *     (name=ID checkBoxDescription=GUIElementDescription)
	 */
	protected void sequence_CheckBox(ISerializationContext context, CheckBox semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.CHECK_BOX__CHECK_BOX_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.CHECK_BOX__CHECK_BOX_DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCheckBoxAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionGUIElementDescriptionParserRuleCall_3_0(), semanticObject.getCheckBoxDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GUIElementDescription returns GUIElementDescription
	 *
	 * Constraint:
	 *     (
	 *         callback=STRING 
	 *         text=STRING 
	 *         left=INT 
	 *         top=INT 
	 *         heigth=INT 
	 *         width=INT
	 *     )
	 */
	protected void sequence_GUIElementDescription(ISerializationContext context, GUIElementDescription semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__CALLBACK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__CALLBACK));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__TEXT));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__LEFT));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__TOP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__TOP));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__HEIGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__HEIGTH));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT_DESCRIPTION__WIDTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGUIElementDescriptionAccess().getCallbackSTRINGTerminalRuleCall_1_0(), semanticObject.getCallback());
		feeder.accept(grammarAccess.getGUIElementDescriptionAccess().getTextSTRINGTerminalRuleCall_3_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getGUIElementDescriptionAccess().getLeftINTTerminalRuleCall_5_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getGUIElementDescriptionAccess().getTopINTTerminalRuleCall_7_0(), semanticObject.getTop());
		feeder.accept(grammarAccess.getGUIElementDescriptionAccess().getHeigthINTTerminalRuleCall_9_0(), semanticObject.getHeigth());
		feeder.accept(grammarAccess.getGUIElementDescriptionAccess().getWidthINTTerminalRuleCall_11_0(), semanticObject.getWidth());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Gui returns Gui
	 *
	 * Constraint:
	 *     (name=ID titel=STRING height=INT width=INT guiObjects+=GUIElement*)
	 */
	protected void sequence_Gui(ISerializationContext context, Gui semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GUIElement returns InputField
	 *     InputField returns InputField
	 *
	 * Constraint:
	 *     (name=ID inputFieldDescription=GUIElementDescription)
	 */
	protected void sequence_InputField(ISerializationContext context, InputField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.INPUT_FIELD__INPUT_FIELD_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.INPUT_FIELD__INPUT_FIELD_DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInputFieldAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInputFieldAccess().getInputFieldDescriptionGUIElementDescriptionParserRuleCall_3_0(), semanticObject.getInputFieldDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GUIElement returns RadioButton
	 *     RadioButton returns RadioButton
	 *
	 * Constraint:
	 *     (name=ID radioButtonDescription=GUIElementDescription)
	 */
	protected void sequence_RadioButton(ISerializationContext context, RadioButton semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.RADIO_BUTTON__RADIO_BUTTON_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.RADIO_BUTTON__RADIO_BUTTON_DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRadioButtonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionGUIElementDescriptionParserRuleCall_3_0(), semanticObject.getRadioButtonDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GUIElement returns TextLabel
	 *     TextLabel returns TextLabel
	 *
	 * Constraint:
	 *     (name=ID textLabelDescription=GUIElementDescription)
	 */
	protected void sequence_TextLabel(ISerializationContext context, TextLabel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.GUI_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, GUIPackage.Literals.TEXT_LABEL__TEXT_LABEL_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GUIPackage.Literals.TEXT_LABEL__TEXT_LABEL_DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextLabelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTextLabelAccess().getTextLabelDescriptionGUIElementDescriptionParserRuleCall_3_0(), semanticObject.getTextLabelDescription());
		feeder.finish();
	}
	
	
}
