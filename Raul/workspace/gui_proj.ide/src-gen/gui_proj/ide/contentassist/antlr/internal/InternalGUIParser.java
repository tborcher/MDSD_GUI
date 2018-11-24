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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGUIParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GUI'", "'Titel'", "'Heigth'", "'Width'", "'callback'", "'text'", "'left'", "'top'", "'heigth'", "'width'", "'TextLabel'", "'{'", "'}'", "'InputField'", "'Button'", "'RadioButton'", "'CheckBox'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGUIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGUIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGUIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGUI.g"; }


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



    // $ANTLR start "entryRuleGui"
    // InternalGUI.g:53:1: entryRuleGui : ruleGui EOF ;
    public final void entryRuleGui() throws RecognitionException {
        try {
            // InternalGUI.g:54:1: ( ruleGui EOF )
            // InternalGUI.g:55:1: ruleGui EOF
            {
             before(grammarAccess.getGuiRule()); 
            pushFollow(FOLLOW_1);
            ruleGui();

            state._fsp--;

             after(grammarAccess.getGuiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGui"


    // $ANTLR start "ruleGui"
    // InternalGUI.g:62:1: ruleGui : ( ( rule__Gui__Group__0 ) ) ;
    public final void ruleGui() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:66:2: ( ( ( rule__Gui__Group__0 ) ) )
            // InternalGUI.g:67:2: ( ( rule__Gui__Group__0 ) )
            {
            // InternalGUI.g:67:2: ( ( rule__Gui__Group__0 ) )
            // InternalGUI.g:68:3: ( rule__Gui__Group__0 )
            {
             before(grammarAccess.getGuiAccess().getGroup()); 
            // InternalGUI.g:69:3: ( rule__Gui__Group__0 )
            // InternalGUI.g:69:4: rule__Gui__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gui__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGui"


    // $ANTLR start "entryRuleGUIElement"
    // InternalGUI.g:78:1: entryRuleGUIElement : ruleGUIElement EOF ;
    public final void entryRuleGUIElement() throws RecognitionException {
        try {
            // InternalGUI.g:79:1: ( ruleGUIElement EOF )
            // InternalGUI.g:80:1: ruleGUIElement EOF
            {
             before(grammarAccess.getGUIElementRule()); 
            pushFollow(FOLLOW_1);
            ruleGUIElement();

            state._fsp--;

             after(grammarAccess.getGUIElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGUIElement"


    // $ANTLR start "ruleGUIElement"
    // InternalGUI.g:87:1: ruleGUIElement : ( ( rule__GUIElement__Alternatives ) ) ;
    public final void ruleGUIElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:91:2: ( ( ( rule__GUIElement__Alternatives ) ) )
            // InternalGUI.g:92:2: ( ( rule__GUIElement__Alternatives ) )
            {
            // InternalGUI.g:92:2: ( ( rule__GUIElement__Alternatives ) )
            // InternalGUI.g:93:3: ( rule__GUIElement__Alternatives )
            {
             before(grammarAccess.getGUIElementAccess().getAlternatives()); 
            // InternalGUI.g:94:3: ( rule__GUIElement__Alternatives )
            // InternalGUI.g:94:4: rule__GUIElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GUIElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGUIElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGUIElement"


    // $ANTLR start "entryRuleGUIElementDescription"
    // InternalGUI.g:103:1: entryRuleGUIElementDescription : ruleGUIElementDescription EOF ;
    public final void entryRuleGUIElementDescription() throws RecognitionException {
        try {
            // InternalGUI.g:104:1: ( ruleGUIElementDescription EOF )
            // InternalGUI.g:105:1: ruleGUIElementDescription EOF
            {
             before(grammarAccess.getGUIElementDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleGUIElementDescription();

            state._fsp--;

             after(grammarAccess.getGUIElementDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGUIElementDescription"


    // $ANTLR start "ruleGUIElementDescription"
    // InternalGUI.g:112:1: ruleGUIElementDescription : ( ( rule__GUIElementDescription__Group__0 ) ) ;
    public final void ruleGUIElementDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:116:2: ( ( ( rule__GUIElementDescription__Group__0 ) ) )
            // InternalGUI.g:117:2: ( ( rule__GUIElementDescription__Group__0 ) )
            {
            // InternalGUI.g:117:2: ( ( rule__GUIElementDescription__Group__0 ) )
            // InternalGUI.g:118:3: ( rule__GUIElementDescription__Group__0 )
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getGroup()); 
            // InternalGUI.g:119:3: ( rule__GUIElementDescription__Group__0 )
            // InternalGUI.g:119:4: rule__GUIElementDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGUIElementDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGUIElementDescription"


    // $ANTLR start "entryRuleTextLabel"
    // InternalGUI.g:128:1: entryRuleTextLabel : ruleTextLabel EOF ;
    public final void entryRuleTextLabel() throws RecognitionException {
        try {
            // InternalGUI.g:129:1: ( ruleTextLabel EOF )
            // InternalGUI.g:130:1: ruleTextLabel EOF
            {
             before(grammarAccess.getTextLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleTextLabel();

            state._fsp--;

             after(grammarAccess.getTextLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextLabel"


    // $ANTLR start "ruleTextLabel"
    // InternalGUI.g:137:1: ruleTextLabel : ( ( rule__TextLabel__Group__0 ) ) ;
    public final void ruleTextLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:141:2: ( ( ( rule__TextLabel__Group__0 ) ) )
            // InternalGUI.g:142:2: ( ( rule__TextLabel__Group__0 ) )
            {
            // InternalGUI.g:142:2: ( ( rule__TextLabel__Group__0 ) )
            // InternalGUI.g:143:3: ( rule__TextLabel__Group__0 )
            {
             before(grammarAccess.getTextLabelAccess().getGroup()); 
            // InternalGUI.g:144:3: ( rule__TextLabel__Group__0 )
            // InternalGUI.g:144:4: rule__TextLabel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextLabel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextLabel"


    // $ANTLR start "entryRuleInputField"
    // InternalGUI.g:153:1: entryRuleInputField : ruleInputField EOF ;
    public final void entryRuleInputField() throws RecognitionException {
        try {
            // InternalGUI.g:154:1: ( ruleInputField EOF )
            // InternalGUI.g:155:1: ruleInputField EOF
            {
             before(grammarAccess.getInputFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleInputField();

            state._fsp--;

             after(grammarAccess.getInputFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputField"


    // $ANTLR start "ruleInputField"
    // InternalGUI.g:162:1: ruleInputField : ( ( rule__InputField__Group__0 ) ) ;
    public final void ruleInputField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:166:2: ( ( ( rule__InputField__Group__0 ) ) )
            // InternalGUI.g:167:2: ( ( rule__InputField__Group__0 ) )
            {
            // InternalGUI.g:167:2: ( ( rule__InputField__Group__0 ) )
            // InternalGUI.g:168:3: ( rule__InputField__Group__0 )
            {
             before(grammarAccess.getInputFieldAccess().getGroup()); 
            // InternalGUI.g:169:3: ( rule__InputField__Group__0 )
            // InternalGUI.g:169:4: rule__InputField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputField"


    // $ANTLR start "entryRuleButton"
    // InternalGUI.g:178:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalGUI.g:179:1: ( ruleButton EOF )
            // InternalGUI.g:180:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalGUI.g:187:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:191:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalGUI.g:192:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalGUI.g:192:2: ( ( rule__Button__Group__0 ) )
            // InternalGUI.g:193:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalGUI.g:194:3: ( rule__Button__Group__0 )
            // InternalGUI.g:194:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleRadioButton"
    // InternalGUI.g:203:1: entryRuleRadioButton : ruleRadioButton EOF ;
    public final void entryRuleRadioButton() throws RecognitionException {
        try {
            // InternalGUI.g:204:1: ( ruleRadioButton EOF )
            // InternalGUI.g:205:1: ruleRadioButton EOF
            {
             before(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleRadioButton();

            state._fsp--;

             after(grammarAccess.getRadioButtonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // InternalGUI.g:212:1: ruleRadioButton : ( ( rule__RadioButton__Group__0 ) ) ;
    public final void ruleRadioButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:216:2: ( ( ( rule__RadioButton__Group__0 ) ) )
            // InternalGUI.g:217:2: ( ( rule__RadioButton__Group__0 ) )
            {
            // InternalGUI.g:217:2: ( ( rule__RadioButton__Group__0 ) )
            // InternalGUI.g:218:3: ( rule__RadioButton__Group__0 )
            {
             before(grammarAccess.getRadioButtonAccess().getGroup()); 
            // InternalGUI.g:219:3: ( rule__RadioButton__Group__0 )
            // InternalGUI.g:219:4: rule__RadioButton__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RadioButton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleCheckBox"
    // InternalGUI.g:228:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // InternalGUI.g:229:1: ( ruleCheckBox EOF )
            // InternalGUI.g:230:1: ruleCheckBox EOF
            {
             before(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckBox();

            state._fsp--;

             after(grammarAccess.getCheckBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // InternalGUI.g:237:1: ruleCheckBox : ( ( rule__CheckBox__Group__0 ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:241:2: ( ( ( rule__CheckBox__Group__0 ) ) )
            // InternalGUI.g:242:2: ( ( rule__CheckBox__Group__0 ) )
            {
            // InternalGUI.g:242:2: ( ( rule__CheckBox__Group__0 ) )
            // InternalGUI.g:243:3: ( rule__CheckBox__Group__0 )
            {
             before(grammarAccess.getCheckBoxAccess().getGroup()); 
            // InternalGUI.g:244:3: ( rule__CheckBox__Group__0 )
            // InternalGUI.g:244:4: rule__CheckBox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "rule__GUIElement__Alternatives"
    // InternalGUI.g:252:1: rule__GUIElement__Alternatives : ( ( ruleTextLabel ) | ( ruleInputField ) | ( ruleButton ) | ( ruleRadioButton ) | ( ruleCheckBox ) );
    public final void rule__GUIElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:256:1: ( ( ruleTextLabel ) | ( ruleInputField ) | ( ruleButton ) | ( ruleRadioButton ) | ( ruleCheckBox ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGUI.g:257:2: ( ruleTextLabel )
                    {
                    // InternalGUI.g:257:2: ( ruleTextLabel )
                    // InternalGUI.g:258:3: ruleTextLabel
                    {
                     before(grammarAccess.getGUIElementAccess().getTextLabelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextLabel();

                    state._fsp--;

                     after(grammarAccess.getGUIElementAccess().getTextLabelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGUI.g:263:2: ( ruleInputField )
                    {
                    // InternalGUI.g:263:2: ( ruleInputField )
                    // InternalGUI.g:264:3: ruleInputField
                    {
                     before(grammarAccess.getGUIElementAccess().getInputFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInputField();

                    state._fsp--;

                     after(grammarAccess.getGUIElementAccess().getInputFieldParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGUI.g:269:2: ( ruleButton )
                    {
                    // InternalGUI.g:269:2: ( ruleButton )
                    // InternalGUI.g:270:3: ruleButton
                    {
                     before(grammarAccess.getGUIElementAccess().getButtonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getGUIElementAccess().getButtonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGUI.g:275:2: ( ruleRadioButton )
                    {
                    // InternalGUI.g:275:2: ( ruleRadioButton )
                    // InternalGUI.g:276:3: ruleRadioButton
                    {
                     before(grammarAccess.getGUIElementAccess().getRadioButtonParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRadioButton();

                    state._fsp--;

                     after(grammarAccess.getGUIElementAccess().getRadioButtonParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGUI.g:281:2: ( ruleCheckBox )
                    {
                    // InternalGUI.g:281:2: ( ruleCheckBox )
                    // InternalGUI.g:282:3: ruleCheckBox
                    {
                     before(grammarAccess.getGUIElementAccess().getCheckBoxParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckBox();

                    state._fsp--;

                     after(grammarAccess.getGUIElementAccess().getCheckBoxParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElement__Alternatives"


    // $ANTLR start "rule__Gui__Group__0"
    // InternalGUI.g:291:1: rule__Gui__Group__0 : rule__Gui__Group__0__Impl rule__Gui__Group__1 ;
    public final void rule__Gui__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:295:1: ( rule__Gui__Group__0__Impl rule__Gui__Group__1 )
            // InternalGUI.g:296:2: rule__Gui__Group__0__Impl rule__Gui__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Gui__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gui__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__0"


    // $ANTLR start "rule__Gui__Group__0__Impl"
    // InternalGUI.g:303:1: rule__Gui__Group__0__Impl : ( 'GUI' ) ;
    public final void rule__Gui__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:307:1: ( ( 'GUI' ) )
            // InternalGUI.g:308:1: ( 'GUI' )
            {
            // InternalGUI.g:308:1: ( 'GUI' )
            // InternalGUI.g:309:2: 'GUI'
            {
             before(grammarAccess.getGuiAccess().getGUIKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGuiAccess().getGUIKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__0__Impl"


    // $ANTLR start "rule__Gui__Group__1"
    // InternalGUI.g:318:1: rule__Gui__Group__1 : rule__Gui__Group__1__Impl rule__Gui__Group__2 ;
    public final void rule__Gui__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:322:1: ( rule__Gui__Group__1__Impl rule__Gui__Group__2 )
            // InternalGUI.g:323:2: rule__Gui__Group__1__Impl rule__Gui__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Gui__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gui__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__1"


    // $ANTLR start "rule__Gui__Group__1__Impl"
    // InternalGUI.g:330:1: rule__Gui__Group__1__Impl : ( ( rule__Gui__NameAssignment_1 ) ) ;
    public final void rule__Gui__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:334:1: ( ( ( rule__Gui__NameAssignment_1 ) ) )
            // InternalGUI.g:335:1: ( ( rule__Gui__NameAssignment_1 ) )
            {
            // InternalGUI.g:335:1: ( ( rule__Gui__NameAssignment_1 ) )
            // InternalGUI.g:336:2: ( rule__Gui__NameAssignment_1 )
            {
             before(grammarAccess.getGuiAccess().getNameAssignment_1()); 
            // InternalGUI.g:337:2: ( rule__Gui__NameAssignment_1 )
            // InternalGUI.g:337:3: rule__Gui__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Gui__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuiAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__1__Impl"


    // $ANTLR start "rule__Gui__Group__2"
    // InternalGUI.g:345:1: rule__Gui__Group__2 : rule__Gui__Group__2__Impl rule__Gui__Group__3 ;
    public final void rule__Gui__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:349:1: ( rule__Gui__Group__2__Impl rule__Gui__Group__3 )
            // InternalGUI.g:350:2: rule__Gui__Group__2__Impl rule__Gui__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Gui__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gui__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__2"


    // $ANTLR start "rule__Gui__Group__2__Impl"
    // InternalGUI.g:357:1: rule__Gui__Group__2__Impl : ( 'Titel' ) ;
    public final void rule__Gui__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:361:1: ( ( 'Titel' ) )
            // InternalGUI.g:362:1: ( 'Titel' )
            {
            // InternalGUI.g:362:1: ( 'Titel' )
            // InternalGUI.g:363:2: 'Titel'
            {
             before(grammarAccess.getGuiAccess().getTitelKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGuiAccess().getTitelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__2__Impl"


    // $ANTLR start "rule__Gui__Group__3"
    // InternalGUI.g:372:1: rule__Gui__Group__3 : rule__Gui__Group__3__Impl rule__Gui__Group__4 ;
    public final void rule__Gui__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:376:1: ( rule__Gui__Group__3__Impl rule__Gui__Group__4 )
            // InternalGUI.g:377:2: rule__Gui__Group__3__Impl rule__Gui__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Gui__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gui__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__3"


    // $ANTLR start "rule__Gui__Group__3__Impl"
    // InternalGUI.g:384:1: rule__Gui__Group__3__Impl : ( ( rule__Gui__TitelAssignment_3 ) ) ;
    public final void rule__Gui__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:388:1: ( ( ( rule__Gui__TitelAssignment_3 ) ) )
            // InternalGUI.g:389:1: ( ( rule__Gui__TitelAssignment_3 ) )
            {
            // InternalGUI.g:389:1: ( ( rule__Gui__TitelAssignment_3 ) )
            // InternalGUI.g:390:2: ( rule__Gui__TitelAssignment_3 )
            {
             before(grammarAccess.getGuiAccess().getTitelAssignment_3()); 
            // InternalGUI.g:391:2: ( rule__Gui__TitelAssignment_3 )
            // InternalGUI.g:391:3: rule__Gui__TitelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Gui__TitelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuiAccess().getTitelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__3__Impl"


    // $ANTLR start "rule__Gui__Group__4"
    // InternalGUI.g:399:1: rule__Gui__Group__4 : rule__Gui__Group__4__Impl rule__Gui__Group__5 ;
    public final void rule__Gui__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:403:1: ( rule__Gui__Group__4__Impl rule__Gui__Group__5 )
            // InternalGUI.g:404:2: rule__Gui__Group__4__Impl rule__Gui__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Gui__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gui__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__4"


    // $ANTLR start "rule__Gui__Group__4__Impl"
    // InternalGUI.g:411:1: rule__Gui__Group__4__Impl : ( 'Heigth' ) ;
    public final void rule__Gui__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:415:1: ( ( 'Heigth' ) )
            // InternalGUI.g:416:1: ( 'Heigth' )
            {
            // InternalGUI.g:416:1: ( 'Heigth' )
            // InternalGUI.g:417:2: 'Heigth'
            {
             before(grammarAccess.getGuiAccess().getHeigthKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGuiAccess().getHeigthKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__4__Impl"


    // $ANTLR start "rule__Gui__Group__5"
    // InternalGUI.g:426:1: rule__Gui__Group__5 : rule__Gui__Group__5__Impl rule__Gui__Group__6 ;
    public final void rule__Gui__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:430:1: ( rule__Gui__Group__5__Impl rule__Gui__Group__6 )
            // InternalGUI.g:431:2: rule__Gui__Group__5__Impl rule__Gui__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Gui__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gui__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__5"


    // $ANTLR start "rule__Gui__Group__5__Impl"
    // InternalGUI.g:438:1: rule__Gui__Group__5__Impl : ( ( rule__Gui__HeightAssignment_5 ) ) ;
    public final void rule__Gui__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:442:1: ( ( ( rule__Gui__HeightAssignment_5 ) ) )
            // InternalGUI.g:443:1: ( ( rule__Gui__HeightAssignment_5 ) )
            {
            // InternalGUI.g:443:1: ( ( rule__Gui__HeightAssignment_5 ) )
            // InternalGUI.g:444:2: ( rule__Gui__HeightAssignment_5 )
            {
             before(grammarAccess.getGuiAccess().getHeightAssignment_5()); 
            // InternalGUI.g:445:2: ( rule__Gui__HeightAssignment_5 )
            // InternalGUI.g:445:3: rule__Gui__HeightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Gui__HeightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGuiAccess().getHeightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__5__Impl"


    // $ANTLR start "rule__Gui__Group__6"
    // InternalGUI.g:453:1: rule__Gui__Group__6 : rule__Gui__Group__6__Impl rule__Gui__Group__7 ;
    public final void rule__Gui__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:457:1: ( rule__Gui__Group__6__Impl rule__Gui__Group__7 )
            // InternalGUI.g:458:2: rule__Gui__Group__6__Impl rule__Gui__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Gui__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gui__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__6"


    // $ANTLR start "rule__Gui__Group__6__Impl"
    // InternalGUI.g:465:1: rule__Gui__Group__6__Impl : ( 'Width' ) ;
    public final void rule__Gui__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:469:1: ( ( 'Width' ) )
            // InternalGUI.g:470:1: ( 'Width' )
            {
            // InternalGUI.g:470:1: ( 'Width' )
            // InternalGUI.g:471:2: 'Width'
            {
             before(grammarAccess.getGuiAccess().getWidthKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGuiAccess().getWidthKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__6__Impl"


    // $ANTLR start "rule__Gui__Group__7"
    // InternalGUI.g:480:1: rule__Gui__Group__7 : rule__Gui__Group__7__Impl rule__Gui__Group__8 ;
    public final void rule__Gui__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:484:1: ( rule__Gui__Group__7__Impl rule__Gui__Group__8 )
            // InternalGUI.g:485:2: rule__Gui__Group__7__Impl rule__Gui__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Gui__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gui__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__7"


    // $ANTLR start "rule__Gui__Group__7__Impl"
    // InternalGUI.g:492:1: rule__Gui__Group__7__Impl : ( ( rule__Gui__WidthAssignment_7 ) ) ;
    public final void rule__Gui__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:496:1: ( ( ( rule__Gui__WidthAssignment_7 ) ) )
            // InternalGUI.g:497:1: ( ( rule__Gui__WidthAssignment_7 ) )
            {
            // InternalGUI.g:497:1: ( ( rule__Gui__WidthAssignment_7 ) )
            // InternalGUI.g:498:2: ( rule__Gui__WidthAssignment_7 )
            {
             before(grammarAccess.getGuiAccess().getWidthAssignment_7()); 
            // InternalGUI.g:499:2: ( rule__Gui__WidthAssignment_7 )
            // InternalGUI.g:499:3: rule__Gui__WidthAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Gui__WidthAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGuiAccess().getWidthAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__7__Impl"


    // $ANTLR start "rule__Gui__Group__8"
    // InternalGUI.g:507:1: rule__Gui__Group__8 : rule__Gui__Group__8__Impl ;
    public final void rule__Gui__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:511:1: ( rule__Gui__Group__8__Impl )
            // InternalGUI.g:512:2: rule__Gui__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gui__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__8"


    // $ANTLR start "rule__Gui__Group__8__Impl"
    // InternalGUI.g:518:1: rule__Gui__Group__8__Impl : ( ( rule__Gui__GuiObjectsAssignment_8 )* ) ;
    public final void rule__Gui__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:522:1: ( ( ( rule__Gui__GuiObjectsAssignment_8 )* ) )
            // InternalGUI.g:523:1: ( ( rule__Gui__GuiObjectsAssignment_8 )* )
            {
            // InternalGUI.g:523:1: ( ( rule__Gui__GuiObjectsAssignment_8 )* )
            // InternalGUI.g:524:2: ( rule__Gui__GuiObjectsAssignment_8 )*
            {
             before(grammarAccess.getGuiAccess().getGuiObjectsAssignment_8()); 
            // InternalGUI.g:525:2: ( rule__Gui__GuiObjectsAssignment_8 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21||(LA2_0>=24 && LA2_0<=27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGUI.g:525:3: rule__Gui__GuiObjectsAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Gui__GuiObjectsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getGuiAccess().getGuiObjectsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__8__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__0"
    // InternalGUI.g:534:1: rule__GUIElementDescription__Group__0 : rule__GUIElementDescription__Group__0__Impl rule__GUIElementDescription__Group__1 ;
    public final void rule__GUIElementDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:538:1: ( rule__GUIElementDescription__Group__0__Impl rule__GUIElementDescription__Group__1 )
            // InternalGUI.g:539:2: rule__GUIElementDescription__Group__0__Impl rule__GUIElementDescription__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GUIElementDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__0"


    // $ANTLR start "rule__GUIElementDescription__Group__0__Impl"
    // InternalGUI.g:546:1: rule__GUIElementDescription__Group__0__Impl : ( 'callback' ) ;
    public final void rule__GUIElementDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:550:1: ( ( 'callback' ) )
            // InternalGUI.g:551:1: ( 'callback' )
            {
            // InternalGUI.g:551:1: ( 'callback' )
            // InternalGUI.g:552:2: 'callback'
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getCallbackKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getCallbackKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__0__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__1"
    // InternalGUI.g:561:1: rule__GUIElementDescription__Group__1 : rule__GUIElementDescription__Group__1__Impl rule__GUIElementDescription__Group__2 ;
    public final void rule__GUIElementDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:565:1: ( rule__GUIElementDescription__Group__1__Impl rule__GUIElementDescription__Group__2 )
            // InternalGUI.g:566:2: rule__GUIElementDescription__Group__1__Impl rule__GUIElementDescription__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__GUIElementDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__1"


    // $ANTLR start "rule__GUIElementDescription__Group__1__Impl"
    // InternalGUI.g:573:1: rule__GUIElementDescription__Group__1__Impl : ( ( rule__GUIElementDescription__CallbackAssignment_1 ) ) ;
    public final void rule__GUIElementDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:577:1: ( ( ( rule__GUIElementDescription__CallbackAssignment_1 ) ) )
            // InternalGUI.g:578:1: ( ( rule__GUIElementDescription__CallbackAssignment_1 ) )
            {
            // InternalGUI.g:578:1: ( ( rule__GUIElementDescription__CallbackAssignment_1 ) )
            // InternalGUI.g:579:2: ( rule__GUIElementDescription__CallbackAssignment_1 )
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getCallbackAssignment_1()); 
            // InternalGUI.g:580:2: ( rule__GUIElementDescription__CallbackAssignment_1 )
            // InternalGUI.g:580:3: rule__GUIElementDescription__CallbackAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__CallbackAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGUIElementDescriptionAccess().getCallbackAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__1__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__2"
    // InternalGUI.g:588:1: rule__GUIElementDescription__Group__2 : rule__GUIElementDescription__Group__2__Impl rule__GUIElementDescription__Group__3 ;
    public final void rule__GUIElementDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:592:1: ( rule__GUIElementDescription__Group__2__Impl rule__GUIElementDescription__Group__3 )
            // InternalGUI.g:593:2: rule__GUIElementDescription__Group__2__Impl rule__GUIElementDescription__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GUIElementDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__2"


    // $ANTLR start "rule__GUIElementDescription__Group__2__Impl"
    // InternalGUI.g:600:1: rule__GUIElementDescription__Group__2__Impl : ( 'text' ) ;
    public final void rule__GUIElementDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:604:1: ( ( 'text' ) )
            // InternalGUI.g:605:1: ( 'text' )
            {
            // InternalGUI.g:605:1: ( 'text' )
            // InternalGUI.g:606:2: 'text'
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getTextKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getTextKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__2__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__3"
    // InternalGUI.g:615:1: rule__GUIElementDescription__Group__3 : rule__GUIElementDescription__Group__3__Impl rule__GUIElementDescription__Group__4 ;
    public final void rule__GUIElementDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:619:1: ( rule__GUIElementDescription__Group__3__Impl rule__GUIElementDescription__Group__4 )
            // InternalGUI.g:620:2: rule__GUIElementDescription__Group__3__Impl rule__GUIElementDescription__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__GUIElementDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__3"


    // $ANTLR start "rule__GUIElementDescription__Group__3__Impl"
    // InternalGUI.g:627:1: rule__GUIElementDescription__Group__3__Impl : ( ( rule__GUIElementDescription__TextAssignment_3 ) ) ;
    public final void rule__GUIElementDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:631:1: ( ( ( rule__GUIElementDescription__TextAssignment_3 ) ) )
            // InternalGUI.g:632:1: ( ( rule__GUIElementDescription__TextAssignment_3 ) )
            {
            // InternalGUI.g:632:1: ( ( rule__GUIElementDescription__TextAssignment_3 ) )
            // InternalGUI.g:633:2: ( rule__GUIElementDescription__TextAssignment_3 )
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getTextAssignment_3()); 
            // InternalGUI.g:634:2: ( rule__GUIElementDescription__TextAssignment_3 )
            // InternalGUI.g:634:3: rule__GUIElementDescription__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGUIElementDescriptionAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__3__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__4"
    // InternalGUI.g:642:1: rule__GUIElementDescription__Group__4 : rule__GUIElementDescription__Group__4__Impl rule__GUIElementDescription__Group__5 ;
    public final void rule__GUIElementDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:646:1: ( rule__GUIElementDescription__Group__4__Impl rule__GUIElementDescription__Group__5 )
            // InternalGUI.g:647:2: rule__GUIElementDescription__Group__4__Impl rule__GUIElementDescription__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__GUIElementDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__4"


    // $ANTLR start "rule__GUIElementDescription__Group__4__Impl"
    // InternalGUI.g:654:1: rule__GUIElementDescription__Group__4__Impl : ( 'left' ) ;
    public final void rule__GUIElementDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:658:1: ( ( 'left' ) )
            // InternalGUI.g:659:1: ( 'left' )
            {
            // InternalGUI.g:659:1: ( 'left' )
            // InternalGUI.g:660:2: 'left'
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getLeftKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getLeftKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__4__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__5"
    // InternalGUI.g:669:1: rule__GUIElementDescription__Group__5 : rule__GUIElementDescription__Group__5__Impl rule__GUIElementDescription__Group__6 ;
    public final void rule__GUIElementDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:673:1: ( rule__GUIElementDescription__Group__5__Impl rule__GUIElementDescription__Group__6 )
            // InternalGUI.g:674:2: rule__GUIElementDescription__Group__5__Impl rule__GUIElementDescription__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__GUIElementDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__5"


    // $ANTLR start "rule__GUIElementDescription__Group__5__Impl"
    // InternalGUI.g:681:1: rule__GUIElementDescription__Group__5__Impl : ( ( rule__GUIElementDescription__LeftAssignment_5 ) ) ;
    public final void rule__GUIElementDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:685:1: ( ( ( rule__GUIElementDescription__LeftAssignment_5 ) ) )
            // InternalGUI.g:686:1: ( ( rule__GUIElementDescription__LeftAssignment_5 ) )
            {
            // InternalGUI.g:686:1: ( ( rule__GUIElementDescription__LeftAssignment_5 ) )
            // InternalGUI.g:687:2: ( rule__GUIElementDescription__LeftAssignment_5 )
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getLeftAssignment_5()); 
            // InternalGUI.g:688:2: ( rule__GUIElementDescription__LeftAssignment_5 )
            // InternalGUI.g:688:3: rule__GUIElementDescription__LeftAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__LeftAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGUIElementDescriptionAccess().getLeftAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__5__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__6"
    // InternalGUI.g:696:1: rule__GUIElementDescription__Group__6 : rule__GUIElementDescription__Group__6__Impl rule__GUIElementDescription__Group__7 ;
    public final void rule__GUIElementDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:700:1: ( rule__GUIElementDescription__Group__6__Impl rule__GUIElementDescription__Group__7 )
            // InternalGUI.g:701:2: rule__GUIElementDescription__Group__6__Impl rule__GUIElementDescription__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__GUIElementDescription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__6"


    // $ANTLR start "rule__GUIElementDescription__Group__6__Impl"
    // InternalGUI.g:708:1: rule__GUIElementDescription__Group__6__Impl : ( 'top' ) ;
    public final void rule__GUIElementDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:712:1: ( ( 'top' ) )
            // InternalGUI.g:713:1: ( 'top' )
            {
            // InternalGUI.g:713:1: ( 'top' )
            // InternalGUI.g:714:2: 'top'
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getTopKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getTopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__6__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__7"
    // InternalGUI.g:723:1: rule__GUIElementDescription__Group__7 : rule__GUIElementDescription__Group__7__Impl rule__GUIElementDescription__Group__8 ;
    public final void rule__GUIElementDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:727:1: ( rule__GUIElementDescription__Group__7__Impl rule__GUIElementDescription__Group__8 )
            // InternalGUI.g:728:2: rule__GUIElementDescription__Group__7__Impl rule__GUIElementDescription__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__GUIElementDescription__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__7"


    // $ANTLR start "rule__GUIElementDescription__Group__7__Impl"
    // InternalGUI.g:735:1: rule__GUIElementDescription__Group__7__Impl : ( ( rule__GUIElementDescription__TopAssignment_7 ) ) ;
    public final void rule__GUIElementDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:739:1: ( ( ( rule__GUIElementDescription__TopAssignment_7 ) ) )
            // InternalGUI.g:740:1: ( ( rule__GUIElementDescription__TopAssignment_7 ) )
            {
            // InternalGUI.g:740:1: ( ( rule__GUIElementDescription__TopAssignment_7 ) )
            // InternalGUI.g:741:2: ( rule__GUIElementDescription__TopAssignment_7 )
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getTopAssignment_7()); 
            // InternalGUI.g:742:2: ( rule__GUIElementDescription__TopAssignment_7 )
            // InternalGUI.g:742:3: rule__GUIElementDescription__TopAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__TopAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGUIElementDescriptionAccess().getTopAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__7__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__8"
    // InternalGUI.g:750:1: rule__GUIElementDescription__Group__8 : rule__GUIElementDescription__Group__8__Impl rule__GUIElementDescription__Group__9 ;
    public final void rule__GUIElementDescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:754:1: ( rule__GUIElementDescription__Group__8__Impl rule__GUIElementDescription__Group__9 )
            // InternalGUI.g:755:2: rule__GUIElementDescription__Group__8__Impl rule__GUIElementDescription__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__GUIElementDescription__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__8"


    // $ANTLR start "rule__GUIElementDescription__Group__8__Impl"
    // InternalGUI.g:762:1: rule__GUIElementDescription__Group__8__Impl : ( 'heigth' ) ;
    public final void rule__GUIElementDescription__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:766:1: ( ( 'heigth' ) )
            // InternalGUI.g:767:1: ( 'heigth' )
            {
            // InternalGUI.g:767:1: ( 'heigth' )
            // InternalGUI.g:768:2: 'heigth'
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getHeigthKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getHeigthKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__8__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__9"
    // InternalGUI.g:777:1: rule__GUIElementDescription__Group__9 : rule__GUIElementDescription__Group__9__Impl rule__GUIElementDescription__Group__10 ;
    public final void rule__GUIElementDescription__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:781:1: ( rule__GUIElementDescription__Group__9__Impl rule__GUIElementDescription__Group__10 )
            // InternalGUI.g:782:2: rule__GUIElementDescription__Group__9__Impl rule__GUIElementDescription__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__GUIElementDescription__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__9"


    // $ANTLR start "rule__GUIElementDescription__Group__9__Impl"
    // InternalGUI.g:789:1: rule__GUIElementDescription__Group__9__Impl : ( ( rule__GUIElementDescription__HeigthAssignment_9 ) ) ;
    public final void rule__GUIElementDescription__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:793:1: ( ( ( rule__GUIElementDescription__HeigthAssignment_9 ) ) )
            // InternalGUI.g:794:1: ( ( rule__GUIElementDescription__HeigthAssignment_9 ) )
            {
            // InternalGUI.g:794:1: ( ( rule__GUIElementDescription__HeigthAssignment_9 ) )
            // InternalGUI.g:795:2: ( rule__GUIElementDescription__HeigthAssignment_9 )
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getHeigthAssignment_9()); 
            // InternalGUI.g:796:2: ( rule__GUIElementDescription__HeigthAssignment_9 )
            // InternalGUI.g:796:3: rule__GUIElementDescription__HeigthAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__HeigthAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getGUIElementDescriptionAccess().getHeigthAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__9__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__10"
    // InternalGUI.g:804:1: rule__GUIElementDescription__Group__10 : rule__GUIElementDescription__Group__10__Impl rule__GUIElementDescription__Group__11 ;
    public final void rule__GUIElementDescription__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:808:1: ( rule__GUIElementDescription__Group__10__Impl rule__GUIElementDescription__Group__11 )
            // InternalGUI.g:809:2: rule__GUIElementDescription__Group__10__Impl rule__GUIElementDescription__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__GUIElementDescription__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__10"


    // $ANTLR start "rule__GUIElementDescription__Group__10__Impl"
    // InternalGUI.g:816:1: rule__GUIElementDescription__Group__10__Impl : ( 'width' ) ;
    public final void rule__GUIElementDescription__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:820:1: ( ( 'width' ) )
            // InternalGUI.g:821:1: ( 'width' )
            {
            // InternalGUI.g:821:1: ( 'width' )
            // InternalGUI.g:822:2: 'width'
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getWidthKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getWidthKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__10__Impl"


    // $ANTLR start "rule__GUIElementDescription__Group__11"
    // InternalGUI.g:831:1: rule__GUIElementDescription__Group__11 : rule__GUIElementDescription__Group__11__Impl ;
    public final void rule__GUIElementDescription__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:835:1: ( rule__GUIElementDescription__Group__11__Impl )
            // InternalGUI.g:836:2: rule__GUIElementDescription__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__11"


    // $ANTLR start "rule__GUIElementDescription__Group__11__Impl"
    // InternalGUI.g:842:1: rule__GUIElementDescription__Group__11__Impl : ( ( rule__GUIElementDescription__WidthAssignment_11 ) ) ;
    public final void rule__GUIElementDescription__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:846:1: ( ( ( rule__GUIElementDescription__WidthAssignment_11 ) ) )
            // InternalGUI.g:847:1: ( ( rule__GUIElementDescription__WidthAssignment_11 ) )
            {
            // InternalGUI.g:847:1: ( ( rule__GUIElementDescription__WidthAssignment_11 ) )
            // InternalGUI.g:848:2: ( rule__GUIElementDescription__WidthAssignment_11 )
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getWidthAssignment_11()); 
            // InternalGUI.g:849:2: ( rule__GUIElementDescription__WidthAssignment_11 )
            // InternalGUI.g:849:3: rule__GUIElementDescription__WidthAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__GUIElementDescription__WidthAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getGUIElementDescriptionAccess().getWidthAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__Group__11__Impl"


    // $ANTLR start "rule__TextLabel__Group__0"
    // InternalGUI.g:858:1: rule__TextLabel__Group__0 : rule__TextLabel__Group__0__Impl rule__TextLabel__Group__1 ;
    public final void rule__TextLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:862:1: ( rule__TextLabel__Group__0__Impl rule__TextLabel__Group__1 )
            // InternalGUI.g:863:2: rule__TextLabel__Group__0__Impl rule__TextLabel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TextLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextLabel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__0"


    // $ANTLR start "rule__TextLabel__Group__0__Impl"
    // InternalGUI.g:870:1: rule__TextLabel__Group__0__Impl : ( 'TextLabel' ) ;
    public final void rule__TextLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:874:1: ( ( 'TextLabel' ) )
            // InternalGUI.g:875:1: ( 'TextLabel' )
            {
            // InternalGUI.g:875:1: ( 'TextLabel' )
            // InternalGUI.g:876:2: 'TextLabel'
            {
             before(grammarAccess.getTextLabelAccess().getTextLabelKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextLabelAccess().getTextLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__0__Impl"


    // $ANTLR start "rule__TextLabel__Group__1"
    // InternalGUI.g:885:1: rule__TextLabel__Group__1 : rule__TextLabel__Group__1__Impl rule__TextLabel__Group__2 ;
    public final void rule__TextLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:889:1: ( rule__TextLabel__Group__1__Impl rule__TextLabel__Group__2 )
            // InternalGUI.g:890:2: rule__TextLabel__Group__1__Impl rule__TextLabel__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TextLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextLabel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__1"


    // $ANTLR start "rule__TextLabel__Group__1__Impl"
    // InternalGUI.g:897:1: rule__TextLabel__Group__1__Impl : ( ( rule__TextLabel__NameAssignment_1 ) ) ;
    public final void rule__TextLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:901:1: ( ( ( rule__TextLabel__NameAssignment_1 ) ) )
            // InternalGUI.g:902:1: ( ( rule__TextLabel__NameAssignment_1 ) )
            {
            // InternalGUI.g:902:1: ( ( rule__TextLabel__NameAssignment_1 ) )
            // InternalGUI.g:903:2: ( rule__TextLabel__NameAssignment_1 )
            {
             before(grammarAccess.getTextLabelAccess().getNameAssignment_1()); 
            // InternalGUI.g:904:2: ( rule__TextLabel__NameAssignment_1 )
            // InternalGUI.g:904:3: rule__TextLabel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TextLabel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextLabelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__1__Impl"


    // $ANTLR start "rule__TextLabel__Group__2"
    // InternalGUI.g:912:1: rule__TextLabel__Group__2 : rule__TextLabel__Group__2__Impl rule__TextLabel__Group__3 ;
    public final void rule__TextLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:916:1: ( rule__TextLabel__Group__2__Impl rule__TextLabel__Group__3 )
            // InternalGUI.g:917:2: rule__TextLabel__Group__2__Impl rule__TextLabel__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__TextLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextLabel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__2"


    // $ANTLR start "rule__TextLabel__Group__2__Impl"
    // InternalGUI.g:924:1: rule__TextLabel__Group__2__Impl : ( '{' ) ;
    public final void rule__TextLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:928:1: ( ( '{' ) )
            // InternalGUI.g:929:1: ( '{' )
            {
            // InternalGUI.g:929:1: ( '{' )
            // InternalGUI.g:930:2: '{'
            {
             before(grammarAccess.getTextLabelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTextLabelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__2__Impl"


    // $ANTLR start "rule__TextLabel__Group__3"
    // InternalGUI.g:939:1: rule__TextLabel__Group__3 : rule__TextLabel__Group__3__Impl rule__TextLabel__Group__4 ;
    public final void rule__TextLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:943:1: ( rule__TextLabel__Group__3__Impl rule__TextLabel__Group__4 )
            // InternalGUI.g:944:2: rule__TextLabel__Group__3__Impl rule__TextLabel__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__TextLabel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextLabel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__3"


    // $ANTLR start "rule__TextLabel__Group__3__Impl"
    // InternalGUI.g:951:1: rule__TextLabel__Group__3__Impl : ( ( rule__TextLabel__TextLabelDescriptionAssignment_3 ) ) ;
    public final void rule__TextLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:955:1: ( ( ( rule__TextLabel__TextLabelDescriptionAssignment_3 ) ) )
            // InternalGUI.g:956:1: ( ( rule__TextLabel__TextLabelDescriptionAssignment_3 ) )
            {
            // InternalGUI.g:956:1: ( ( rule__TextLabel__TextLabelDescriptionAssignment_3 ) )
            // InternalGUI.g:957:2: ( rule__TextLabel__TextLabelDescriptionAssignment_3 )
            {
             before(grammarAccess.getTextLabelAccess().getTextLabelDescriptionAssignment_3()); 
            // InternalGUI.g:958:2: ( rule__TextLabel__TextLabelDescriptionAssignment_3 )
            // InternalGUI.g:958:3: rule__TextLabel__TextLabelDescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TextLabel__TextLabelDescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextLabelAccess().getTextLabelDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__3__Impl"


    // $ANTLR start "rule__TextLabel__Group__4"
    // InternalGUI.g:966:1: rule__TextLabel__Group__4 : rule__TextLabel__Group__4__Impl ;
    public final void rule__TextLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:970:1: ( rule__TextLabel__Group__4__Impl )
            // InternalGUI.g:971:2: rule__TextLabel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextLabel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__4"


    // $ANTLR start "rule__TextLabel__Group__4__Impl"
    // InternalGUI.g:977:1: rule__TextLabel__Group__4__Impl : ( '}' ) ;
    public final void rule__TextLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:981:1: ( ( '}' ) )
            // InternalGUI.g:982:1: ( '}' )
            {
            // InternalGUI.g:982:1: ( '}' )
            // InternalGUI.g:983:2: '}'
            {
             before(grammarAccess.getTextLabelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextLabelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__Group__4__Impl"


    // $ANTLR start "rule__InputField__Group__0"
    // InternalGUI.g:993:1: rule__InputField__Group__0 : rule__InputField__Group__0__Impl rule__InputField__Group__1 ;
    public final void rule__InputField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:997:1: ( rule__InputField__Group__0__Impl rule__InputField__Group__1 )
            // InternalGUI.g:998:2: rule__InputField__Group__0__Impl rule__InputField__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InputField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__0"


    // $ANTLR start "rule__InputField__Group__0__Impl"
    // InternalGUI.g:1005:1: rule__InputField__Group__0__Impl : ( 'InputField' ) ;
    public final void rule__InputField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1009:1: ( ( 'InputField' ) )
            // InternalGUI.g:1010:1: ( 'InputField' )
            {
            // InternalGUI.g:1010:1: ( 'InputField' )
            // InternalGUI.g:1011:2: 'InputField'
            {
             before(grammarAccess.getInputFieldAccess().getInputFieldKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInputFieldAccess().getInputFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__0__Impl"


    // $ANTLR start "rule__InputField__Group__1"
    // InternalGUI.g:1020:1: rule__InputField__Group__1 : rule__InputField__Group__1__Impl rule__InputField__Group__2 ;
    public final void rule__InputField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1024:1: ( rule__InputField__Group__1__Impl rule__InputField__Group__2 )
            // InternalGUI.g:1025:2: rule__InputField__Group__1__Impl rule__InputField__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__InputField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__1"


    // $ANTLR start "rule__InputField__Group__1__Impl"
    // InternalGUI.g:1032:1: rule__InputField__Group__1__Impl : ( ( rule__InputField__NameAssignment_1 ) ) ;
    public final void rule__InputField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1036:1: ( ( ( rule__InputField__NameAssignment_1 ) ) )
            // InternalGUI.g:1037:1: ( ( rule__InputField__NameAssignment_1 ) )
            {
            // InternalGUI.g:1037:1: ( ( rule__InputField__NameAssignment_1 ) )
            // InternalGUI.g:1038:2: ( rule__InputField__NameAssignment_1 )
            {
             before(grammarAccess.getInputFieldAccess().getNameAssignment_1()); 
            // InternalGUI.g:1039:2: ( rule__InputField__NameAssignment_1 )
            // InternalGUI.g:1039:3: rule__InputField__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputField__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__1__Impl"


    // $ANTLR start "rule__InputField__Group__2"
    // InternalGUI.g:1047:1: rule__InputField__Group__2 : rule__InputField__Group__2__Impl rule__InputField__Group__3 ;
    public final void rule__InputField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1051:1: ( rule__InputField__Group__2__Impl rule__InputField__Group__3 )
            // InternalGUI.g:1052:2: rule__InputField__Group__2__Impl rule__InputField__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__InputField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__2"


    // $ANTLR start "rule__InputField__Group__2__Impl"
    // InternalGUI.g:1059:1: rule__InputField__Group__2__Impl : ( '{' ) ;
    public final void rule__InputField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1063:1: ( ( '{' ) )
            // InternalGUI.g:1064:1: ( '{' )
            {
            // InternalGUI.g:1064:1: ( '{' )
            // InternalGUI.g:1065:2: '{'
            {
             before(grammarAccess.getInputFieldAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInputFieldAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__2__Impl"


    // $ANTLR start "rule__InputField__Group__3"
    // InternalGUI.g:1074:1: rule__InputField__Group__3 : rule__InputField__Group__3__Impl rule__InputField__Group__4 ;
    public final void rule__InputField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1078:1: ( rule__InputField__Group__3__Impl rule__InputField__Group__4 )
            // InternalGUI.g:1079:2: rule__InputField__Group__3__Impl rule__InputField__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__InputField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__3"


    // $ANTLR start "rule__InputField__Group__3__Impl"
    // InternalGUI.g:1086:1: rule__InputField__Group__3__Impl : ( ( rule__InputField__InputFieldDescriptionAssignment_3 ) ) ;
    public final void rule__InputField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1090:1: ( ( ( rule__InputField__InputFieldDescriptionAssignment_3 ) ) )
            // InternalGUI.g:1091:1: ( ( rule__InputField__InputFieldDescriptionAssignment_3 ) )
            {
            // InternalGUI.g:1091:1: ( ( rule__InputField__InputFieldDescriptionAssignment_3 ) )
            // InternalGUI.g:1092:2: ( rule__InputField__InputFieldDescriptionAssignment_3 )
            {
             before(grammarAccess.getInputFieldAccess().getInputFieldDescriptionAssignment_3()); 
            // InternalGUI.g:1093:2: ( rule__InputField__InputFieldDescriptionAssignment_3 )
            // InternalGUI.g:1093:3: rule__InputField__InputFieldDescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputField__InputFieldDescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputFieldAccess().getInputFieldDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__3__Impl"


    // $ANTLR start "rule__InputField__Group__4"
    // InternalGUI.g:1101:1: rule__InputField__Group__4 : rule__InputField__Group__4__Impl ;
    public final void rule__InputField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1105:1: ( rule__InputField__Group__4__Impl )
            // InternalGUI.g:1106:2: rule__InputField__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputField__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__4"


    // $ANTLR start "rule__InputField__Group__4__Impl"
    // InternalGUI.g:1112:1: rule__InputField__Group__4__Impl : ( '}' ) ;
    public final void rule__InputField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1116:1: ( ( '}' ) )
            // InternalGUI.g:1117:1: ( '}' )
            {
            // InternalGUI.g:1117:1: ( '}' )
            // InternalGUI.g:1118:2: '}'
            {
             before(grammarAccess.getInputFieldAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputFieldAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__Group__4__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalGUI.g:1128:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1132:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalGUI.g:1133:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalGUI.g:1140:1: rule__Button__Group__0__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1144:1: ( ( 'Button' ) )
            // InternalGUI.g:1145:1: ( 'Button' )
            {
            // InternalGUI.g:1145:1: ( 'Button' )
            // InternalGUI.g:1146:2: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalGUI.g:1155:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1159:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalGUI.g:1160:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalGUI.g:1167:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1171:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalGUI.g:1172:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalGUI.g:1172:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalGUI.g:1173:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalGUI.g:1174:2: ( rule__Button__NameAssignment_1 )
            // InternalGUI.g:1174:3: rule__Button__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalGUI.g:1182:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1186:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalGUI.g:1187:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalGUI.g:1194:1: rule__Button__Group__2__Impl : ( '{' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1198:1: ( ( '{' ) )
            // InternalGUI.g:1199:1: ( '{' )
            {
            // InternalGUI.g:1199:1: ( '{' )
            // InternalGUI.g:1200:2: '{'
            {
             before(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // InternalGUI.g:1209:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1213:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalGUI.g:1214:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalGUI.g:1221:1: rule__Button__Group__3__Impl : ( ( rule__Button__ButtonDescriptionAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1225:1: ( ( ( rule__Button__ButtonDescriptionAssignment_3 ) ) )
            // InternalGUI.g:1226:1: ( ( rule__Button__ButtonDescriptionAssignment_3 ) )
            {
            // InternalGUI.g:1226:1: ( ( rule__Button__ButtonDescriptionAssignment_3 ) )
            // InternalGUI.g:1227:2: ( rule__Button__ButtonDescriptionAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getButtonDescriptionAssignment_3()); 
            // InternalGUI.g:1228:2: ( rule__Button__ButtonDescriptionAssignment_3 )
            // InternalGUI.g:1228:3: rule__Button__ButtonDescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Button__ButtonDescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getButtonDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // InternalGUI.g:1236:1: rule__Button__Group__4 : rule__Button__Group__4__Impl ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1240:1: ( rule__Button__Group__4__Impl )
            // InternalGUI.g:1241:2: rule__Button__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // InternalGUI.g:1247:1: rule__Button__Group__4__Impl : ( '}' ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1251:1: ( ( '}' ) )
            // InternalGUI.g:1252:1: ( '}' )
            {
            // InternalGUI.g:1252:1: ( '}' )
            // InternalGUI.g:1253:2: '}'
            {
             before(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__RadioButton__Group__0"
    // InternalGUI.g:1263:1: rule__RadioButton__Group__0 : rule__RadioButton__Group__0__Impl rule__RadioButton__Group__1 ;
    public final void rule__RadioButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1267:1: ( rule__RadioButton__Group__0__Impl rule__RadioButton__Group__1 )
            // InternalGUI.g:1268:2: rule__RadioButton__Group__0__Impl rule__RadioButton__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RadioButton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButton__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__0"


    // $ANTLR start "rule__RadioButton__Group__0__Impl"
    // InternalGUI.g:1275:1: rule__RadioButton__Group__0__Impl : ( 'RadioButton' ) ;
    public final void rule__RadioButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1279:1: ( ( 'RadioButton' ) )
            // InternalGUI.g:1280:1: ( 'RadioButton' )
            {
            // InternalGUI.g:1280:1: ( 'RadioButton' )
            // InternalGUI.g:1281:2: 'RadioButton'
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRadioButtonAccess().getRadioButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__0__Impl"


    // $ANTLR start "rule__RadioButton__Group__1"
    // InternalGUI.g:1290:1: rule__RadioButton__Group__1 : rule__RadioButton__Group__1__Impl rule__RadioButton__Group__2 ;
    public final void rule__RadioButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1294:1: ( rule__RadioButton__Group__1__Impl rule__RadioButton__Group__2 )
            // InternalGUI.g:1295:2: rule__RadioButton__Group__1__Impl rule__RadioButton__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RadioButton__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButton__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__1"


    // $ANTLR start "rule__RadioButton__Group__1__Impl"
    // InternalGUI.g:1302:1: rule__RadioButton__Group__1__Impl : ( ( rule__RadioButton__NameAssignment_1 ) ) ;
    public final void rule__RadioButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1306:1: ( ( ( rule__RadioButton__NameAssignment_1 ) ) )
            // InternalGUI.g:1307:1: ( ( rule__RadioButton__NameAssignment_1 ) )
            {
            // InternalGUI.g:1307:1: ( ( rule__RadioButton__NameAssignment_1 ) )
            // InternalGUI.g:1308:2: ( rule__RadioButton__NameAssignment_1 )
            {
             before(grammarAccess.getRadioButtonAccess().getNameAssignment_1()); 
            // InternalGUI.g:1309:2: ( rule__RadioButton__NameAssignment_1 )
            // InternalGUI.g:1309:3: rule__RadioButton__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RadioButton__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__1__Impl"


    // $ANTLR start "rule__RadioButton__Group__2"
    // InternalGUI.g:1317:1: rule__RadioButton__Group__2 : rule__RadioButton__Group__2__Impl rule__RadioButton__Group__3 ;
    public final void rule__RadioButton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1321:1: ( rule__RadioButton__Group__2__Impl rule__RadioButton__Group__3 )
            // InternalGUI.g:1322:2: rule__RadioButton__Group__2__Impl rule__RadioButton__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__RadioButton__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButton__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__2"


    // $ANTLR start "rule__RadioButton__Group__2__Impl"
    // InternalGUI.g:1329:1: rule__RadioButton__Group__2__Impl : ( '{' ) ;
    public final void rule__RadioButton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1333:1: ( ( '{' ) )
            // InternalGUI.g:1334:1: ( '{' )
            {
            // InternalGUI.g:1334:1: ( '{' )
            // InternalGUI.g:1335:2: '{'
            {
             before(grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__2__Impl"


    // $ANTLR start "rule__RadioButton__Group__3"
    // InternalGUI.g:1344:1: rule__RadioButton__Group__3 : rule__RadioButton__Group__3__Impl rule__RadioButton__Group__4 ;
    public final void rule__RadioButton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1348:1: ( rule__RadioButton__Group__3__Impl rule__RadioButton__Group__4 )
            // InternalGUI.g:1349:2: rule__RadioButton__Group__3__Impl rule__RadioButton__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__RadioButton__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButton__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__3"


    // $ANTLR start "rule__RadioButton__Group__3__Impl"
    // InternalGUI.g:1356:1: rule__RadioButton__Group__3__Impl : ( ( rule__RadioButton__RadioButtonDescriptionAssignment_3 ) ) ;
    public final void rule__RadioButton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1360:1: ( ( ( rule__RadioButton__RadioButtonDescriptionAssignment_3 ) ) )
            // InternalGUI.g:1361:1: ( ( rule__RadioButton__RadioButtonDescriptionAssignment_3 ) )
            {
            // InternalGUI.g:1361:1: ( ( rule__RadioButton__RadioButtonDescriptionAssignment_3 ) )
            // InternalGUI.g:1362:2: ( rule__RadioButton__RadioButtonDescriptionAssignment_3 )
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionAssignment_3()); 
            // InternalGUI.g:1363:2: ( rule__RadioButton__RadioButtonDescriptionAssignment_3 )
            // InternalGUI.g:1363:3: rule__RadioButton__RadioButtonDescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RadioButton__RadioButtonDescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__3__Impl"


    // $ANTLR start "rule__RadioButton__Group__4"
    // InternalGUI.g:1371:1: rule__RadioButton__Group__4 : rule__RadioButton__Group__4__Impl ;
    public final void rule__RadioButton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1375:1: ( rule__RadioButton__Group__4__Impl )
            // InternalGUI.g:1376:2: rule__RadioButton__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadioButton__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__4"


    // $ANTLR start "rule__RadioButton__Group__4__Impl"
    // InternalGUI.g:1382:1: rule__RadioButton__Group__4__Impl : ( '}' ) ;
    public final void rule__RadioButton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1386:1: ( ( '}' ) )
            // InternalGUI.g:1387:1: ( '}' )
            {
            // InternalGUI.g:1387:1: ( '}' )
            // InternalGUI.g:1388:2: '}'
            {
             before(grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__4__Impl"


    // $ANTLR start "rule__CheckBox__Group__0"
    // InternalGUI.g:1398:1: rule__CheckBox__Group__0 : rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 ;
    public final void rule__CheckBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1402:1: ( rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 )
            // InternalGUI.g:1403:2: rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CheckBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__0"


    // $ANTLR start "rule__CheckBox__Group__0__Impl"
    // InternalGUI.g:1410:1: rule__CheckBox__Group__0__Impl : ( 'CheckBox' ) ;
    public final void rule__CheckBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1414:1: ( ( 'CheckBox' ) )
            // InternalGUI.g:1415:1: ( 'CheckBox' )
            {
            // InternalGUI.g:1415:1: ( 'CheckBox' )
            // InternalGUI.g:1416:2: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__0__Impl"


    // $ANTLR start "rule__CheckBox__Group__1"
    // InternalGUI.g:1425:1: rule__CheckBox__Group__1 : rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 ;
    public final void rule__CheckBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1429:1: ( rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 )
            // InternalGUI.g:1430:2: rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__CheckBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__1"


    // $ANTLR start "rule__CheckBox__Group__1__Impl"
    // InternalGUI.g:1437:1: rule__CheckBox__Group__1__Impl : ( ( rule__CheckBox__NameAssignment_1 ) ) ;
    public final void rule__CheckBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1441:1: ( ( ( rule__CheckBox__NameAssignment_1 ) ) )
            // InternalGUI.g:1442:1: ( ( rule__CheckBox__NameAssignment_1 ) )
            {
            // InternalGUI.g:1442:1: ( ( rule__CheckBox__NameAssignment_1 ) )
            // InternalGUI.g:1443:2: ( rule__CheckBox__NameAssignment_1 )
            {
             before(grammarAccess.getCheckBoxAccess().getNameAssignment_1()); 
            // InternalGUI.g:1444:2: ( rule__CheckBox__NameAssignment_1 )
            // InternalGUI.g:1444:3: rule__CheckBox__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__1__Impl"


    // $ANTLR start "rule__CheckBox__Group__2"
    // InternalGUI.g:1452:1: rule__CheckBox__Group__2 : rule__CheckBox__Group__2__Impl rule__CheckBox__Group__3 ;
    public final void rule__CheckBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1456:1: ( rule__CheckBox__Group__2__Impl rule__CheckBox__Group__3 )
            // InternalGUI.g:1457:2: rule__CheckBox__Group__2__Impl rule__CheckBox__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__CheckBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__2"


    // $ANTLR start "rule__CheckBox__Group__2__Impl"
    // InternalGUI.g:1464:1: rule__CheckBox__Group__2__Impl : ( '{' ) ;
    public final void rule__CheckBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1468:1: ( ( '{' ) )
            // InternalGUI.g:1469:1: ( '{' )
            {
            // InternalGUI.g:1469:1: ( '{' )
            // InternalGUI.g:1470:2: '{'
            {
             before(grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__2__Impl"


    // $ANTLR start "rule__CheckBox__Group__3"
    // InternalGUI.g:1479:1: rule__CheckBox__Group__3 : rule__CheckBox__Group__3__Impl rule__CheckBox__Group__4 ;
    public final void rule__CheckBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1483:1: ( rule__CheckBox__Group__3__Impl rule__CheckBox__Group__4 )
            // InternalGUI.g:1484:2: rule__CheckBox__Group__3__Impl rule__CheckBox__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__CheckBox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__3"


    // $ANTLR start "rule__CheckBox__Group__3__Impl"
    // InternalGUI.g:1491:1: rule__CheckBox__Group__3__Impl : ( ( rule__CheckBox__CheckBoxDescriptionAssignment_3 ) ) ;
    public final void rule__CheckBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1495:1: ( ( ( rule__CheckBox__CheckBoxDescriptionAssignment_3 ) ) )
            // InternalGUI.g:1496:1: ( ( rule__CheckBox__CheckBoxDescriptionAssignment_3 ) )
            {
            // InternalGUI.g:1496:1: ( ( rule__CheckBox__CheckBoxDescriptionAssignment_3 ) )
            // InternalGUI.g:1497:2: ( rule__CheckBox__CheckBoxDescriptionAssignment_3 )
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionAssignment_3()); 
            // InternalGUI.g:1498:2: ( rule__CheckBox__CheckBoxDescriptionAssignment_3 )
            // InternalGUI.g:1498:3: rule__CheckBox__CheckBoxDescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__CheckBoxDescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__3__Impl"


    // $ANTLR start "rule__CheckBox__Group__4"
    // InternalGUI.g:1506:1: rule__CheckBox__Group__4 : rule__CheckBox__Group__4__Impl ;
    public final void rule__CheckBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1510:1: ( rule__CheckBox__Group__4__Impl )
            // InternalGUI.g:1511:2: rule__CheckBox__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__4"


    // $ANTLR start "rule__CheckBox__Group__4__Impl"
    // InternalGUI.g:1517:1: rule__CheckBox__Group__4__Impl : ( '}' ) ;
    public final void rule__CheckBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1521:1: ( ( '}' ) )
            // InternalGUI.g:1522:1: ( '}' )
            {
            // InternalGUI.g:1522:1: ( '}' )
            // InternalGUI.g:1523:2: '}'
            {
             before(grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__4__Impl"


    // $ANTLR start "rule__Gui__NameAssignment_1"
    // InternalGUI.g:1533:1: rule__Gui__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Gui__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1537:1: ( ( RULE_ID ) )
            // InternalGUI.g:1538:2: ( RULE_ID )
            {
            // InternalGUI.g:1538:2: ( RULE_ID )
            // InternalGUI.g:1539:3: RULE_ID
            {
             before(grammarAccess.getGuiAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuiAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__NameAssignment_1"


    // $ANTLR start "rule__Gui__TitelAssignment_3"
    // InternalGUI.g:1548:1: rule__Gui__TitelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Gui__TitelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1552:1: ( ( RULE_STRING ) )
            // InternalGUI.g:1553:2: ( RULE_STRING )
            {
            // InternalGUI.g:1553:2: ( RULE_STRING )
            // InternalGUI.g:1554:3: RULE_STRING
            {
             before(grammarAccess.getGuiAccess().getTitelSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuiAccess().getTitelSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__TitelAssignment_3"


    // $ANTLR start "rule__Gui__HeightAssignment_5"
    // InternalGUI.g:1563:1: rule__Gui__HeightAssignment_5 : ( RULE_INT ) ;
    public final void rule__Gui__HeightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1567:1: ( ( RULE_INT ) )
            // InternalGUI.g:1568:2: ( RULE_INT )
            {
            // InternalGUI.g:1568:2: ( RULE_INT )
            // InternalGUI.g:1569:3: RULE_INT
            {
             before(grammarAccess.getGuiAccess().getHeightINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGuiAccess().getHeightINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__HeightAssignment_5"


    // $ANTLR start "rule__Gui__WidthAssignment_7"
    // InternalGUI.g:1578:1: rule__Gui__WidthAssignment_7 : ( RULE_INT ) ;
    public final void rule__Gui__WidthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1582:1: ( ( RULE_INT ) )
            // InternalGUI.g:1583:2: ( RULE_INT )
            {
            // InternalGUI.g:1583:2: ( RULE_INT )
            // InternalGUI.g:1584:3: RULE_INT
            {
             before(grammarAccess.getGuiAccess().getWidthINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGuiAccess().getWidthINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__WidthAssignment_7"


    // $ANTLR start "rule__Gui__GuiObjectsAssignment_8"
    // InternalGUI.g:1593:1: rule__Gui__GuiObjectsAssignment_8 : ( ruleGUIElement ) ;
    public final void rule__Gui__GuiObjectsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1597:1: ( ( ruleGUIElement ) )
            // InternalGUI.g:1598:2: ( ruleGUIElement )
            {
            // InternalGUI.g:1598:2: ( ruleGUIElement )
            // InternalGUI.g:1599:3: ruleGUIElement
            {
             before(grammarAccess.getGuiAccess().getGuiObjectsGUIElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleGUIElement();

            state._fsp--;

             after(grammarAccess.getGuiAccess().getGuiObjectsGUIElementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__GuiObjectsAssignment_8"


    // $ANTLR start "rule__GUIElementDescription__CallbackAssignment_1"
    // InternalGUI.g:1608:1: rule__GUIElementDescription__CallbackAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GUIElementDescription__CallbackAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1612:1: ( ( RULE_STRING ) )
            // InternalGUI.g:1613:2: ( RULE_STRING )
            {
            // InternalGUI.g:1613:2: ( RULE_STRING )
            // InternalGUI.g:1614:3: RULE_STRING
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getCallbackSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getCallbackSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__CallbackAssignment_1"


    // $ANTLR start "rule__GUIElementDescription__TextAssignment_3"
    // InternalGUI.g:1623:1: rule__GUIElementDescription__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__GUIElementDescription__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1627:1: ( ( RULE_STRING ) )
            // InternalGUI.g:1628:2: ( RULE_STRING )
            {
            // InternalGUI.g:1628:2: ( RULE_STRING )
            // InternalGUI.g:1629:3: RULE_STRING
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getTextSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__TextAssignment_3"


    // $ANTLR start "rule__GUIElementDescription__LeftAssignment_5"
    // InternalGUI.g:1638:1: rule__GUIElementDescription__LeftAssignment_5 : ( RULE_INT ) ;
    public final void rule__GUIElementDescription__LeftAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1642:1: ( ( RULE_INT ) )
            // InternalGUI.g:1643:2: ( RULE_INT )
            {
            // InternalGUI.g:1643:2: ( RULE_INT )
            // InternalGUI.g:1644:3: RULE_INT
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getLeftINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getLeftINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__LeftAssignment_5"


    // $ANTLR start "rule__GUIElementDescription__TopAssignment_7"
    // InternalGUI.g:1653:1: rule__GUIElementDescription__TopAssignment_7 : ( RULE_INT ) ;
    public final void rule__GUIElementDescription__TopAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1657:1: ( ( RULE_INT ) )
            // InternalGUI.g:1658:2: ( RULE_INT )
            {
            // InternalGUI.g:1658:2: ( RULE_INT )
            // InternalGUI.g:1659:3: RULE_INT
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getTopINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getTopINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__TopAssignment_7"


    // $ANTLR start "rule__GUIElementDescription__HeigthAssignment_9"
    // InternalGUI.g:1668:1: rule__GUIElementDescription__HeigthAssignment_9 : ( RULE_INT ) ;
    public final void rule__GUIElementDescription__HeigthAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1672:1: ( ( RULE_INT ) )
            // InternalGUI.g:1673:2: ( RULE_INT )
            {
            // InternalGUI.g:1673:2: ( RULE_INT )
            // InternalGUI.g:1674:3: RULE_INT
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getHeigthINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getHeigthINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__HeigthAssignment_9"


    // $ANTLR start "rule__GUIElementDescription__WidthAssignment_11"
    // InternalGUI.g:1683:1: rule__GUIElementDescription__WidthAssignment_11 : ( RULE_INT ) ;
    public final void rule__GUIElementDescription__WidthAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1687:1: ( ( RULE_INT ) )
            // InternalGUI.g:1688:2: ( RULE_INT )
            {
            // InternalGUI.g:1688:2: ( RULE_INT )
            // InternalGUI.g:1689:3: RULE_INT
            {
             before(grammarAccess.getGUIElementDescriptionAccess().getWidthINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGUIElementDescriptionAccess().getWidthINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIElementDescription__WidthAssignment_11"


    // $ANTLR start "rule__TextLabel__NameAssignment_1"
    // InternalGUI.g:1698:1: rule__TextLabel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextLabel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1702:1: ( ( RULE_ID ) )
            // InternalGUI.g:1703:2: ( RULE_ID )
            {
            // InternalGUI.g:1703:2: ( RULE_ID )
            // InternalGUI.g:1704:3: RULE_ID
            {
             before(grammarAccess.getTextLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextLabelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__NameAssignment_1"


    // $ANTLR start "rule__TextLabel__TextLabelDescriptionAssignment_3"
    // InternalGUI.g:1713:1: rule__TextLabel__TextLabelDescriptionAssignment_3 : ( ruleGUIElementDescription ) ;
    public final void rule__TextLabel__TextLabelDescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1717:1: ( ( ruleGUIElementDescription ) )
            // InternalGUI.g:1718:2: ( ruleGUIElementDescription )
            {
            // InternalGUI.g:1718:2: ( ruleGUIElementDescription )
            // InternalGUI.g:1719:3: ruleGUIElementDescription
            {
             before(grammarAccess.getTextLabelAccess().getTextLabelDescriptionGUIElementDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGUIElementDescription();

            state._fsp--;

             after(grammarAccess.getTextLabelAccess().getTextLabelDescriptionGUIElementDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLabel__TextLabelDescriptionAssignment_3"


    // $ANTLR start "rule__InputField__NameAssignment_1"
    // InternalGUI.g:1728:1: rule__InputField__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InputField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1732:1: ( ( RULE_ID ) )
            // InternalGUI.g:1733:2: ( RULE_ID )
            {
            // InternalGUI.g:1733:2: ( RULE_ID )
            // InternalGUI.g:1734:3: RULE_ID
            {
             before(grammarAccess.getInputFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__NameAssignment_1"


    // $ANTLR start "rule__InputField__InputFieldDescriptionAssignment_3"
    // InternalGUI.g:1743:1: rule__InputField__InputFieldDescriptionAssignment_3 : ( ruleGUIElementDescription ) ;
    public final void rule__InputField__InputFieldDescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1747:1: ( ( ruleGUIElementDescription ) )
            // InternalGUI.g:1748:2: ( ruleGUIElementDescription )
            {
            // InternalGUI.g:1748:2: ( ruleGUIElementDescription )
            // InternalGUI.g:1749:3: ruleGUIElementDescription
            {
             before(grammarAccess.getInputFieldAccess().getInputFieldDescriptionGUIElementDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGUIElementDescription();

            state._fsp--;

             after(grammarAccess.getInputFieldAccess().getInputFieldDescriptionGUIElementDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputField__InputFieldDescriptionAssignment_3"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // InternalGUI.g:1758:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1762:1: ( ( RULE_ID ) )
            // InternalGUI.g:1763:2: ( RULE_ID )
            {
            // InternalGUI.g:1763:2: ( RULE_ID )
            // InternalGUI.g:1764:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__NameAssignment_1"


    // $ANTLR start "rule__Button__ButtonDescriptionAssignment_3"
    // InternalGUI.g:1773:1: rule__Button__ButtonDescriptionAssignment_3 : ( ruleGUIElementDescription ) ;
    public final void rule__Button__ButtonDescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1777:1: ( ( ruleGUIElementDescription ) )
            // InternalGUI.g:1778:2: ( ruleGUIElementDescription )
            {
            // InternalGUI.g:1778:2: ( ruleGUIElementDescription )
            // InternalGUI.g:1779:3: ruleGUIElementDescription
            {
             before(grammarAccess.getButtonAccess().getButtonDescriptionGUIElementDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGUIElementDescription();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getButtonDescriptionGUIElementDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ButtonDescriptionAssignment_3"


    // $ANTLR start "rule__RadioButton__NameAssignment_1"
    // InternalGUI.g:1788:1: rule__RadioButton__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RadioButton__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1792:1: ( ( RULE_ID ) )
            // InternalGUI.g:1793:2: ( RULE_ID )
            {
            // InternalGUI.g:1793:2: ( RULE_ID )
            // InternalGUI.g:1794:3: RULE_ID
            {
             before(grammarAccess.getRadioButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRadioButtonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__NameAssignment_1"


    // $ANTLR start "rule__RadioButton__RadioButtonDescriptionAssignment_3"
    // InternalGUI.g:1803:1: rule__RadioButton__RadioButtonDescriptionAssignment_3 : ( ruleGUIElementDescription ) ;
    public final void rule__RadioButton__RadioButtonDescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1807:1: ( ( ruleGUIElementDescription ) )
            // InternalGUI.g:1808:2: ( ruleGUIElementDescription )
            {
            // InternalGUI.g:1808:2: ( ruleGUIElementDescription )
            // InternalGUI.g:1809:3: ruleGUIElementDescription
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionGUIElementDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGUIElementDescription();

            state._fsp--;

             after(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionGUIElementDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__RadioButtonDescriptionAssignment_3"


    // $ANTLR start "rule__CheckBox__NameAssignment_1"
    // InternalGUI.g:1818:1: rule__CheckBox__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CheckBox__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1822:1: ( ( RULE_ID ) )
            // InternalGUI.g:1823:2: ( RULE_ID )
            {
            // InternalGUI.g:1823:2: ( RULE_ID )
            // InternalGUI.g:1824:3: RULE_ID
            {
             before(grammarAccess.getCheckBoxAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckBoxAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__NameAssignment_1"


    // $ANTLR start "rule__CheckBox__CheckBoxDescriptionAssignment_3"
    // InternalGUI.g:1833:1: rule__CheckBox__CheckBoxDescriptionAssignment_3 : ( ruleGUIElementDescription ) ;
    public final void rule__CheckBox__CheckBoxDescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGUI.g:1837:1: ( ( ruleGUIElementDescription ) )
            // InternalGUI.g:1838:2: ( ruleGUIElementDescription )
            {
            // InternalGUI.g:1838:2: ( ruleGUIElementDescription )
            // InternalGUI.g:1839:3: ruleGUIElementDescription
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionGUIElementDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGUIElementDescription();

            state._fsp--;

             after(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionGUIElementDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__CheckBoxDescriptionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000F200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000F200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});

}