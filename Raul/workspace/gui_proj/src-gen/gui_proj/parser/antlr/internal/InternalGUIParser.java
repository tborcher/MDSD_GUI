package gui_proj.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gui_proj.services.GUIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGUIParser extends AbstractInternalAntlrParser {
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

        public InternalGUIParser(TokenStream input, GUIGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Gui";
       	}

       	@Override
       	protected GUIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGui"
    // InternalGUI.g:64:1: entryRuleGui returns [EObject current=null] : iv_ruleGui= ruleGui EOF ;
    public final EObject entryRuleGui() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGui = null;


        try {
            // InternalGUI.g:64:44: (iv_ruleGui= ruleGui EOF )
            // InternalGUI.g:65:2: iv_ruleGui= ruleGui EOF
            {
             newCompositeNode(grammarAccess.getGuiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGui=ruleGui();

            state._fsp--;

             current =iv_ruleGui; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGui"


    // $ANTLR start "ruleGui"
    // InternalGUI.g:71:1: ruleGui returns [EObject current=null] : (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Titel' ( (lv_titel_3_0= RULE_STRING ) ) otherlv_4= 'Heigth' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= 'Width' ( (lv_width_7_0= RULE_INT ) ) ( (lv_guiObjects_8_0= ruleGUIElement ) )* ) ;
    public final EObject ruleGui() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_titel_3_0=null;
        Token otherlv_4=null;
        Token lv_height_5_0=null;
        Token otherlv_6=null;
        Token lv_width_7_0=null;
        EObject lv_guiObjects_8_0 = null;



        	enterRule();

        try {
            // InternalGUI.g:77:2: ( (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Titel' ( (lv_titel_3_0= RULE_STRING ) ) otherlv_4= 'Heigth' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= 'Width' ( (lv_width_7_0= RULE_INT ) ) ( (lv_guiObjects_8_0= ruleGUIElement ) )* ) )
            // InternalGUI.g:78:2: (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Titel' ( (lv_titel_3_0= RULE_STRING ) ) otherlv_4= 'Heigth' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= 'Width' ( (lv_width_7_0= RULE_INT ) ) ( (lv_guiObjects_8_0= ruleGUIElement ) )* )
            {
            // InternalGUI.g:78:2: (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Titel' ( (lv_titel_3_0= RULE_STRING ) ) otherlv_4= 'Heigth' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= 'Width' ( (lv_width_7_0= RULE_INT ) ) ( (lv_guiObjects_8_0= ruleGUIElement ) )* )
            // InternalGUI.g:79:3: otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Titel' ( (lv_titel_3_0= RULE_STRING ) ) otherlv_4= 'Heigth' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= 'Width' ( (lv_width_7_0= RULE_INT ) ) ( (lv_guiObjects_8_0= ruleGUIElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGuiAccess().getGUIKeyword_0());
            		
            // InternalGUI.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGUI.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGUI.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalGUI.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGuiAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGuiAccess().getTitelKeyword_2());
            		
            // InternalGUI.g:105:3: ( (lv_titel_3_0= RULE_STRING ) )
            // InternalGUI.g:106:4: (lv_titel_3_0= RULE_STRING )
            {
            // InternalGUI.g:106:4: (lv_titel_3_0= RULE_STRING )
            // InternalGUI.g:107:5: lv_titel_3_0= RULE_STRING
            {
            lv_titel_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_titel_3_0, grammarAccess.getGuiAccess().getTitelSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"titel",
            						lv_titel_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getGuiAccess().getHeigthKeyword_4());
            		
            // InternalGUI.g:127:3: ( (lv_height_5_0= RULE_INT ) )
            // InternalGUI.g:128:4: (lv_height_5_0= RULE_INT )
            {
            // InternalGUI.g:128:4: (lv_height_5_0= RULE_INT )
            // InternalGUI.g:129:5: lv_height_5_0= RULE_INT
            {
            lv_height_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_height_5_0, grammarAccess.getGuiAccess().getHeightINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getGuiAccess().getWidthKeyword_6());
            		
            // InternalGUI.g:149:3: ( (lv_width_7_0= RULE_INT ) )
            // InternalGUI.g:150:4: (lv_width_7_0= RULE_INT )
            {
            // InternalGUI.g:150:4: (lv_width_7_0= RULE_INT )
            // InternalGUI.g:151:5: lv_width_7_0= RULE_INT
            {
            lv_width_7_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_width_7_0, grammarAccess.getGuiAccess().getWidthINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGUI.g:167:3: ( (lv_guiObjects_8_0= ruleGUIElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21||(LA1_0>=24 && LA1_0<=27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGUI.g:168:4: (lv_guiObjects_8_0= ruleGUIElement )
            	    {
            	    // InternalGUI.g:168:4: (lv_guiObjects_8_0= ruleGUIElement )
            	    // InternalGUI.g:169:5: lv_guiObjects_8_0= ruleGUIElement
            	    {

            	    					newCompositeNode(grammarAccess.getGuiAccess().getGuiObjectsGUIElementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_guiObjects_8_0=ruleGUIElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGuiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"guiObjects",
            	    						lv_guiObjects_8_0,
            	    						"gui_proj.GUI.GUIElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGui"


    // $ANTLR start "entryRuleGUIElement"
    // InternalGUI.g:190:1: entryRuleGUIElement returns [EObject current=null] : iv_ruleGUIElement= ruleGUIElement EOF ;
    public final EObject entryRuleGUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUIElement = null;


        try {
            // InternalGUI.g:190:51: (iv_ruleGUIElement= ruleGUIElement EOF )
            // InternalGUI.g:191:2: iv_ruleGUIElement= ruleGUIElement EOF
            {
             newCompositeNode(grammarAccess.getGUIElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGUIElement=ruleGUIElement();

            state._fsp--;

             current =iv_ruleGUIElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGUIElement"


    // $ANTLR start "ruleGUIElement"
    // InternalGUI.g:197:1: ruleGUIElement returns [EObject current=null] : (this_TextLabel_0= ruleTextLabel | this_InputField_1= ruleInputField | this_Button_2= ruleButton | this_RadioButton_3= ruleRadioButton | this_CheckBox_4= ruleCheckBox ) ;
    public final EObject ruleGUIElement() throws RecognitionException {
        EObject current = null;

        EObject this_TextLabel_0 = null;

        EObject this_InputField_1 = null;

        EObject this_Button_2 = null;

        EObject this_RadioButton_3 = null;

        EObject this_CheckBox_4 = null;



        	enterRule();

        try {
            // InternalGUI.g:203:2: ( (this_TextLabel_0= ruleTextLabel | this_InputField_1= ruleInputField | this_Button_2= ruleButton | this_RadioButton_3= ruleRadioButton | this_CheckBox_4= ruleCheckBox ) )
            // InternalGUI.g:204:2: (this_TextLabel_0= ruleTextLabel | this_InputField_1= ruleInputField | this_Button_2= ruleButton | this_RadioButton_3= ruleRadioButton | this_CheckBox_4= ruleCheckBox )
            {
            // InternalGUI.g:204:2: (this_TextLabel_0= ruleTextLabel | this_InputField_1= ruleInputField | this_Button_2= ruleButton | this_RadioButton_3= ruleRadioButton | this_CheckBox_4= ruleCheckBox )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGUI.g:205:3: this_TextLabel_0= ruleTextLabel
                    {

                    			newCompositeNode(grammarAccess.getGUIElementAccess().getTextLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextLabel_0=ruleTextLabel();

                    state._fsp--;


                    			current = this_TextLabel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGUI.g:214:3: this_InputField_1= ruleInputField
                    {

                    			newCompositeNode(grammarAccess.getGUIElementAccess().getInputFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputField_1=ruleInputField();

                    state._fsp--;


                    			current = this_InputField_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGUI.g:223:3: this_Button_2= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getGUIElementAccess().getButtonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_2=ruleButton();

                    state._fsp--;


                    			current = this_Button_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGUI.g:232:3: this_RadioButton_3= ruleRadioButton
                    {

                    			newCompositeNode(grammarAccess.getGUIElementAccess().getRadioButtonParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RadioButton_3=ruleRadioButton();

                    state._fsp--;


                    			current = this_RadioButton_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGUI.g:241:3: this_CheckBox_4= ruleCheckBox
                    {

                    			newCompositeNode(grammarAccess.getGUIElementAccess().getCheckBoxParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckBox_4=ruleCheckBox();

                    state._fsp--;


                    			current = this_CheckBox_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGUIElement"


    // $ANTLR start "entryRuleGUIElementDescription"
    // InternalGUI.g:253:1: entryRuleGUIElementDescription returns [EObject current=null] : iv_ruleGUIElementDescription= ruleGUIElementDescription EOF ;
    public final EObject entryRuleGUIElementDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUIElementDescription = null;


        try {
            // InternalGUI.g:253:62: (iv_ruleGUIElementDescription= ruleGUIElementDescription EOF )
            // InternalGUI.g:254:2: iv_ruleGUIElementDescription= ruleGUIElementDescription EOF
            {
             newCompositeNode(grammarAccess.getGUIElementDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGUIElementDescription=ruleGUIElementDescription();

            state._fsp--;

             current =iv_ruleGUIElementDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGUIElementDescription"


    // $ANTLR start "ruleGUIElementDescription"
    // InternalGUI.g:260:1: ruleGUIElementDescription returns [EObject current=null] : (otherlv_0= 'callback' ( (lv_callback_1_0= RULE_STRING ) ) otherlv_2= 'text' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'left' ( (lv_left_5_0= RULE_INT ) ) otherlv_6= 'top' ( (lv_top_7_0= RULE_INT ) ) otherlv_8= 'heigth' ( (lv_heigth_9_0= RULE_INT ) ) otherlv_10= 'width' ( (lv_width_11_0= RULE_INT ) ) ) ;
    public final EObject ruleGUIElementDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_callback_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;
        Token lv_left_5_0=null;
        Token otherlv_6=null;
        Token lv_top_7_0=null;
        Token otherlv_8=null;
        Token lv_heigth_9_0=null;
        Token otherlv_10=null;
        Token lv_width_11_0=null;


        	enterRule();

        try {
            // InternalGUI.g:266:2: ( (otherlv_0= 'callback' ( (lv_callback_1_0= RULE_STRING ) ) otherlv_2= 'text' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'left' ( (lv_left_5_0= RULE_INT ) ) otherlv_6= 'top' ( (lv_top_7_0= RULE_INT ) ) otherlv_8= 'heigth' ( (lv_heigth_9_0= RULE_INT ) ) otherlv_10= 'width' ( (lv_width_11_0= RULE_INT ) ) ) )
            // InternalGUI.g:267:2: (otherlv_0= 'callback' ( (lv_callback_1_0= RULE_STRING ) ) otherlv_2= 'text' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'left' ( (lv_left_5_0= RULE_INT ) ) otherlv_6= 'top' ( (lv_top_7_0= RULE_INT ) ) otherlv_8= 'heigth' ( (lv_heigth_9_0= RULE_INT ) ) otherlv_10= 'width' ( (lv_width_11_0= RULE_INT ) ) )
            {
            // InternalGUI.g:267:2: (otherlv_0= 'callback' ( (lv_callback_1_0= RULE_STRING ) ) otherlv_2= 'text' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'left' ( (lv_left_5_0= RULE_INT ) ) otherlv_6= 'top' ( (lv_top_7_0= RULE_INT ) ) otherlv_8= 'heigth' ( (lv_heigth_9_0= RULE_INT ) ) otherlv_10= 'width' ( (lv_width_11_0= RULE_INT ) ) )
            // InternalGUI.g:268:3: otherlv_0= 'callback' ( (lv_callback_1_0= RULE_STRING ) ) otherlv_2= 'text' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'left' ( (lv_left_5_0= RULE_INT ) ) otherlv_6= 'top' ( (lv_top_7_0= RULE_INT ) ) otherlv_8= 'heigth' ( (lv_heigth_9_0= RULE_INT ) ) otherlv_10= 'width' ( (lv_width_11_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGUIElementDescriptionAccess().getCallbackKeyword_0());
            		
            // InternalGUI.g:272:3: ( (lv_callback_1_0= RULE_STRING ) )
            // InternalGUI.g:273:4: (lv_callback_1_0= RULE_STRING )
            {
            // InternalGUI.g:273:4: (lv_callback_1_0= RULE_STRING )
            // InternalGUI.g:274:5: lv_callback_1_0= RULE_STRING
            {
            lv_callback_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_callback_1_0, grammarAccess.getGUIElementDescriptionAccess().getCallbackSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGUIElementDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"callback",
            						lv_callback_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGUIElementDescriptionAccess().getTextKeyword_2());
            		
            // InternalGUI.g:294:3: ( (lv_text_3_0= RULE_STRING ) )
            // InternalGUI.g:295:4: (lv_text_3_0= RULE_STRING )
            {
            // InternalGUI.g:295:4: (lv_text_3_0= RULE_STRING )
            // InternalGUI.g:296:5: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_text_3_0, grammarAccess.getGUIElementDescriptionAccess().getTextSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGUIElementDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getGUIElementDescriptionAccess().getLeftKeyword_4());
            		
            // InternalGUI.g:316:3: ( (lv_left_5_0= RULE_INT ) )
            // InternalGUI.g:317:4: (lv_left_5_0= RULE_INT )
            {
            // InternalGUI.g:317:4: (lv_left_5_0= RULE_INT )
            // InternalGUI.g:318:5: lv_left_5_0= RULE_INT
            {
            lv_left_5_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_left_5_0, grammarAccess.getGUIElementDescriptionAccess().getLeftINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGUIElementDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getGUIElementDescriptionAccess().getTopKeyword_6());
            		
            // InternalGUI.g:338:3: ( (lv_top_7_0= RULE_INT ) )
            // InternalGUI.g:339:4: (lv_top_7_0= RULE_INT )
            {
            // InternalGUI.g:339:4: (lv_top_7_0= RULE_INT )
            // InternalGUI.g:340:5: lv_top_7_0= RULE_INT
            {
            lv_top_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_top_7_0, grammarAccess.getGUIElementDescriptionAccess().getTopINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGUIElementDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"top",
            						lv_top_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getGUIElementDescriptionAccess().getHeigthKeyword_8());
            		
            // InternalGUI.g:360:3: ( (lv_heigth_9_0= RULE_INT ) )
            // InternalGUI.g:361:4: (lv_heigth_9_0= RULE_INT )
            {
            // InternalGUI.g:361:4: (lv_heigth_9_0= RULE_INT )
            // InternalGUI.g:362:5: lv_heigth_9_0= RULE_INT
            {
            lv_heigth_9_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_heigth_9_0, grammarAccess.getGUIElementDescriptionAccess().getHeigthINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGUIElementDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"heigth",
            						lv_heigth_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getGUIElementDescriptionAccess().getWidthKeyword_10());
            		
            // InternalGUI.g:382:3: ( (lv_width_11_0= RULE_INT ) )
            // InternalGUI.g:383:4: (lv_width_11_0= RULE_INT )
            {
            // InternalGUI.g:383:4: (lv_width_11_0= RULE_INT )
            // InternalGUI.g:384:5: lv_width_11_0= RULE_INT
            {
            lv_width_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_width_11_0, grammarAccess.getGUIElementDescriptionAccess().getWidthINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGUIElementDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGUIElementDescription"


    // $ANTLR start "entryRuleTextLabel"
    // InternalGUI.g:404:1: entryRuleTextLabel returns [EObject current=null] : iv_ruleTextLabel= ruleTextLabel EOF ;
    public final EObject entryRuleTextLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextLabel = null;


        try {
            // InternalGUI.g:404:50: (iv_ruleTextLabel= ruleTextLabel EOF )
            // InternalGUI.g:405:2: iv_ruleTextLabel= ruleTextLabel EOF
            {
             newCompositeNode(grammarAccess.getTextLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextLabel=ruleTextLabel();

            state._fsp--;

             current =iv_ruleTextLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextLabel"


    // $ANTLR start "ruleTextLabel"
    // InternalGUI.g:411:1: ruleTextLabel returns [EObject current=null] : (otherlv_0= 'TextLabel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_textLabelDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) ;
    public final EObject ruleTextLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_textLabelDescription_3_0 = null;



        	enterRule();

        try {
            // InternalGUI.g:417:2: ( (otherlv_0= 'TextLabel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_textLabelDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) )
            // InternalGUI.g:418:2: (otherlv_0= 'TextLabel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_textLabelDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            {
            // InternalGUI.g:418:2: (otherlv_0= 'TextLabel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_textLabelDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            // InternalGUI.g:419:3: otherlv_0= 'TextLabel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_textLabelDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextLabelAccess().getTextLabelKeyword_0());
            		
            // InternalGUI.g:423:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGUI.g:424:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGUI.g:424:4: (lv_name_1_0= RULE_ID )
            // InternalGUI.g:425:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTextLabelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getTextLabelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGUI.g:445:3: ( (lv_textLabelDescription_3_0= ruleGUIElementDescription ) )
            // InternalGUI.g:446:4: (lv_textLabelDescription_3_0= ruleGUIElementDescription )
            {
            // InternalGUI.g:446:4: (lv_textLabelDescription_3_0= ruleGUIElementDescription )
            // InternalGUI.g:447:5: lv_textLabelDescription_3_0= ruleGUIElementDescription
            {

            					newCompositeNode(grammarAccess.getTextLabelAccess().getTextLabelDescriptionGUIElementDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_textLabelDescription_3_0=ruleGUIElementDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextLabelRule());
            					}
            					set(
            						current,
            						"textLabelDescription",
            						lv_textLabelDescription_3_0,
            						"gui_proj.GUI.GUIElementDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTextLabelAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextLabel"


    // $ANTLR start "entryRuleInputField"
    // InternalGUI.g:472:1: entryRuleInputField returns [EObject current=null] : iv_ruleInputField= ruleInputField EOF ;
    public final EObject entryRuleInputField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputField = null;


        try {
            // InternalGUI.g:472:51: (iv_ruleInputField= ruleInputField EOF )
            // InternalGUI.g:473:2: iv_ruleInputField= ruleInputField EOF
            {
             newCompositeNode(grammarAccess.getInputFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputField=ruleInputField();

            state._fsp--;

             current =iv_ruleInputField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputField"


    // $ANTLR start "ruleInputField"
    // InternalGUI.g:479:1: ruleInputField returns [EObject current=null] : (otherlv_0= 'InputField' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputFieldDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) ;
    public final EObject ruleInputField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inputFieldDescription_3_0 = null;



        	enterRule();

        try {
            // InternalGUI.g:485:2: ( (otherlv_0= 'InputField' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputFieldDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) )
            // InternalGUI.g:486:2: (otherlv_0= 'InputField' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputFieldDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            {
            // InternalGUI.g:486:2: (otherlv_0= 'InputField' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputFieldDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            // InternalGUI.g:487:3: otherlv_0= 'InputField' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputFieldDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputFieldAccess().getInputFieldKeyword_0());
            		
            // InternalGUI.g:491:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGUI.g:492:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGUI.g:492:4: (lv_name_1_0= RULE_ID )
            // InternalGUI.g:493:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getInputFieldAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGUI.g:513:3: ( (lv_inputFieldDescription_3_0= ruleGUIElementDescription ) )
            // InternalGUI.g:514:4: (lv_inputFieldDescription_3_0= ruleGUIElementDescription )
            {
            // InternalGUI.g:514:4: (lv_inputFieldDescription_3_0= ruleGUIElementDescription )
            // InternalGUI.g:515:5: lv_inputFieldDescription_3_0= ruleGUIElementDescription
            {

            					newCompositeNode(grammarAccess.getInputFieldAccess().getInputFieldDescriptionGUIElementDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_inputFieldDescription_3_0=ruleGUIElementDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputFieldRule());
            					}
            					set(
            						current,
            						"inputFieldDescription",
            						lv_inputFieldDescription_3_0,
            						"gui_proj.GUI.GUIElementDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInputFieldAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputField"


    // $ANTLR start "entryRuleButton"
    // InternalGUI.g:540:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalGUI.g:540:47: (iv_ruleButton= ruleButton EOF )
            // InternalGUI.g:541:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalGUI.g:547:1: ruleButton returns [EObject current=null] : (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_buttonDescription_3_0 = null;



        	enterRule();

        try {
            // InternalGUI.g:553:2: ( (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) )
            // InternalGUI.g:554:2: (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            {
            // InternalGUI.g:554:2: (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            // InternalGUI.g:555:3: otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalGUI.g:559:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGUI.g:560:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGUI.g:560:4: (lv_name_1_0= RULE_ID )
            // InternalGUI.g:561:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGUI.g:581:3: ( (lv_buttonDescription_3_0= ruleGUIElementDescription ) )
            // InternalGUI.g:582:4: (lv_buttonDescription_3_0= ruleGUIElementDescription )
            {
            // InternalGUI.g:582:4: (lv_buttonDescription_3_0= ruleGUIElementDescription )
            // InternalGUI.g:583:5: lv_buttonDescription_3_0= ruleGUIElementDescription
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getButtonDescriptionGUIElementDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_buttonDescription_3_0=ruleGUIElementDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"buttonDescription",
            						lv_buttonDescription_3_0,
            						"gui_proj.GUI.GUIElementDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleRadioButton"
    // InternalGUI.g:608:1: entryRuleRadioButton returns [EObject current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final EObject entryRuleRadioButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButton = null;


        try {
            // InternalGUI.g:608:52: (iv_ruleRadioButton= ruleRadioButton EOF )
            // InternalGUI.g:609:2: iv_ruleRadioButton= ruleRadioButton EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadioButton=ruleRadioButton();

            state._fsp--;

             current =iv_ruleRadioButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // InternalGUI.g:615:1: ruleRadioButton returns [EObject current=null] : (otherlv_0= 'RadioButton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_radioButtonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) ;
    public final EObject ruleRadioButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_radioButtonDescription_3_0 = null;



        	enterRule();

        try {
            // InternalGUI.g:621:2: ( (otherlv_0= 'RadioButton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_radioButtonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) )
            // InternalGUI.g:622:2: (otherlv_0= 'RadioButton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_radioButtonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            {
            // InternalGUI.g:622:2: (otherlv_0= 'RadioButton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_radioButtonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            // InternalGUI.g:623:3: otherlv_0= 'RadioButton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_radioButtonDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRadioButtonAccess().getRadioButtonKeyword_0());
            		
            // InternalGUI.g:627:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGUI.g:628:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGUI.g:628:4: (lv_name_1_0= RULE_ID )
            // InternalGUI.g:629:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRadioButtonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadioButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGUI.g:649:3: ( (lv_radioButtonDescription_3_0= ruleGUIElementDescription ) )
            // InternalGUI.g:650:4: (lv_radioButtonDescription_3_0= ruleGUIElementDescription )
            {
            // InternalGUI.g:650:4: (lv_radioButtonDescription_3_0= ruleGUIElementDescription )
            // InternalGUI.g:651:5: lv_radioButtonDescription_3_0= ruleGUIElementDescription
            {

            					newCompositeNode(grammarAccess.getRadioButtonAccess().getRadioButtonDescriptionGUIElementDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_radioButtonDescription_3_0=ruleGUIElementDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadioButtonRule());
            					}
            					set(
            						current,
            						"radioButtonDescription",
            						lv_radioButtonDescription_3_0,
            						"gui_proj.GUI.GUIElementDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleCheckBox"
    // InternalGUI.g:676:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // InternalGUI.g:676:49: (iv_ruleCheckBox= ruleCheckBox EOF )
            // InternalGUI.g:677:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // InternalGUI.g:683:1: ruleCheckBox returns [EObject current=null] : (otherlv_0= 'CheckBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_checkBoxDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_checkBoxDescription_3_0 = null;



        	enterRule();

        try {
            // InternalGUI.g:689:2: ( (otherlv_0= 'CheckBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_checkBoxDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' ) )
            // InternalGUI.g:690:2: (otherlv_0= 'CheckBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_checkBoxDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            {
            // InternalGUI.g:690:2: (otherlv_0= 'CheckBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_checkBoxDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}' )
            // InternalGUI.g:691:3: otherlv_0= 'CheckBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_checkBoxDescription_3_0= ruleGUIElementDescription ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0());
            		
            // InternalGUI.g:695:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGUI.g:696:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGUI.g:696:4: (lv_name_1_0= RULE_ID )
            // InternalGUI.g:697:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheckBoxAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGUI.g:717:3: ( (lv_checkBoxDescription_3_0= ruleGUIElementDescription ) )
            // InternalGUI.g:718:4: (lv_checkBoxDescription_3_0= ruleGUIElementDescription )
            {
            // InternalGUI.g:718:4: (lv_checkBoxDescription_3_0= ruleGUIElementDescription )
            // InternalGUI.g:719:5: lv_checkBoxDescription_3_0= ruleGUIElementDescription
            {

            					newCompositeNode(grammarAccess.getCheckBoxAccess().getCheckBoxDescriptionGUIElementDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_checkBoxDescription_3_0=ruleGUIElementDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckBoxRule());
            					}
            					set(
            						current,
            						"checkBoxDescription",
            						lv_checkBoxDescription_3_0,
            						"gui_proj.GUI.GUIElementDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckBox"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000F200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});

}