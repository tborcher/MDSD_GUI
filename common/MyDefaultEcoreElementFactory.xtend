package gui_proj

import org.eclipse.xtext.parser.DefaultEcoreElementFactory
import org.eclipse.xtext.*
import javax.inject.Inject
import gui_proj.services.MyGuiDslGrammarAccess
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException
import gui_proj.myGuiDsl.*
import gui_proj.myGuiDsl.impl.TextLabelImpl
import gui_proj.myGuiDsl.impl.InputFieldImpl
import org.eclipse.emf.ecore.EClassifier

class MyDefaultEcoreElementFactory extends DefaultEcoreElementFactory {
    @Inject extension MyGuiDslGrammarAccess

	override create(EClassifier classifier) {
		println("\nCreated " + classifier.toString)
		if(classifier.name == "TextLabel"){
			//classifier.
		}
		super.create(classifier)
	}

	override add(EObject object, String feature, Object value, String ruleName, INode node) throws ValueConverterException {
		super.add(object, feature, value, ruleName, node)
	}

    override set(EObject object, String feature, Object value, String ruleName, INode node) throws ValueConverterException {
		println("EObject: " + object.toString)
		print("> Feature: " + feature)
		print("\t = " + value.toString)
		println("\t// Rulename: " + ruleName)
    	if (object instanceof GUIElement){
    		println("I'm a GUIElement!")
	    	var newVal = value
	    	if (feature == "name") {
		    	switch(object) {
		    		TextLabel: newVal = "NewName"
		    		InputField: newVal = "Text"
		    	}
		    	if(newVal != value)
	    			println(">> New Value: " + newVal)
	    	}
	    	super.set(object, feature, newVal, ruleName, node)
	    	return
    	}
    	
    	/* 
        if (object instanceof Range) {
            if (ruleName == grammar.name+"."+ZEROONERule.name) {
                object.max = 1
                object.min = 0
                return;
            } else if (ruleName == grammar.name+"."+ONEONERule.name) {
                object.max = 1
                object.min = 1
                return;
            }

        }//*/
        
        super.set(object, feature, value, ruleName, node)
    }	
}