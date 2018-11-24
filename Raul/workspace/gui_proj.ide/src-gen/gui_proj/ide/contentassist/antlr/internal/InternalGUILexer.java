package gui_proj.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGUILexer extends Lexer {
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

    public InternalGUILexer() {;} 
    public InternalGUILexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGUILexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGUI.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:11:7: ( 'GUI' )
            // InternalGUI.g:11:9: 'GUI'
            {
            match("GUI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:12:7: ( 'Titel' )
            // InternalGUI.g:12:9: 'Titel'
            {
            match("Titel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:13:7: ( 'Heigth' )
            // InternalGUI.g:13:9: 'Heigth'
            {
            match("Heigth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:14:7: ( 'Width' )
            // InternalGUI.g:14:9: 'Width'
            {
            match("Width"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:15:7: ( 'callback' )
            // InternalGUI.g:15:9: 'callback'
            {
            match("callback"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:16:7: ( 'text' )
            // InternalGUI.g:16:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:17:7: ( 'left' )
            // InternalGUI.g:17:9: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:18:7: ( 'top' )
            // InternalGUI.g:18:9: 'top'
            {
            match("top"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:19:7: ( 'heigth' )
            // InternalGUI.g:19:9: 'heigth'
            {
            match("heigth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:20:7: ( 'width' )
            // InternalGUI.g:20:9: 'width'
            {
            match("width"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:21:7: ( 'TextLabel' )
            // InternalGUI.g:21:9: 'TextLabel'
            {
            match("TextLabel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:22:7: ( '{' )
            // InternalGUI.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:23:7: ( '}' )
            // InternalGUI.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:24:7: ( 'InputField' )
            // InternalGUI.g:24:9: 'InputField'
            {
            match("InputField"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:25:7: ( 'Button' )
            // InternalGUI.g:25:9: 'Button'
            {
            match("Button"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:26:7: ( 'RadioButton' )
            // InternalGUI.g:26:9: 'RadioButton'
            {
            match("RadioButton"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:27:7: ( 'CheckBox' )
            // InternalGUI.g:27:9: 'CheckBox'
            {
            match("CheckBox"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:1848:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGUI.g:1848:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGUI.g:1848:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGUI.g:1848:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGUI.g:1848:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGUI.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:1850:10: ( ( '0' .. '9' )+ )
            // InternalGUI.g:1850:12: ( '0' .. '9' )+
            {
            // InternalGUI.g:1850:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGUI.g:1850:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:1852:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGUI.g:1852:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGUI.g:1852:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGUI.g:1852:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGUI.g:1852:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGUI.g:1852:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGUI.g:1852:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGUI.g:1852:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGUI.g:1852:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGUI.g:1852:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGUI.g:1852:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:1854:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGUI.g:1854:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGUI.g:1854:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGUI.g:1854:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:1856:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGUI.g:1856:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGUI.g:1856:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGUI.g:1856:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalGUI.g:1856:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGUI.g:1856:41: ( '\\r' )? '\\n'
                    {
                    // InternalGUI.g:1856:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGUI.g:1856:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:1858:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGUI.g:1858:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGUI.g:1858:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGUI.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGUI.g:1860:16: ( . )
            // InternalGUI.g:1860:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGUI.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=24;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalGUI.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalGUI.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalGUI.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalGUI.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalGUI.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalGUI.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalGUI.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalGUI.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalGUI.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalGUI.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalGUI.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalGUI.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalGUI.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalGUI.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalGUI.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalGUI.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalGUI.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalGUI.g:1:112: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // InternalGUI.g:1:120: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // InternalGUI.g:1:129: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // InternalGUI.g:1:141: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // InternalGUI.g:1:157: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // InternalGUI.g:1:173: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // InternalGUI.g:1:181: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\11\31\2\uffff\4\31\1\27\2\uffff\3\27\2\uffff\1\31\1\uffff\12\31\2\uffff\4\31\5\uffff\1\76\6\31\1\105\7\31\1\uffff\5\31\1\122\1\uffff\1\123\6\31\1\132\2\31\1\135\1\31\2\uffff\1\31\1\140\4\31\1\uffff\1\31\1\146\1\uffff\1\31\1\150\1\uffff\1\31\1\152\3\31\1\uffff\1\31\1\uffff\1\31\1\uffff\3\31\1\163\2\31\1\166\1\167\1\uffff\2\31\2\uffff\1\172\1\31\1\uffff\1\174\1\uffff";
    static final String DFA12_eofS =
        "\175\uffff";
    static final String DFA12_minS =
        "\1\0\1\125\2\145\1\151\1\141\3\145\1\151\2\uffff\1\156\1\165\1\141\1\150\1\101\2\uffff\2\0\1\52\2\uffff\1\111\1\uffff\1\164\1\170\1\151\1\144\1\154\1\170\1\160\1\146\1\151\1\144\2\uffff\1\160\1\164\1\144\1\145\5\uffff\1\60\1\145\1\164\1\147\1\164\1\154\1\164\1\60\1\164\1\147\1\164\1\165\1\164\1\151\1\143\1\uffff\1\154\1\114\1\164\1\150\1\142\1\60\1\uffff\1\60\1\164\1\150\1\164\2\157\1\153\1\60\1\141\1\150\1\60\1\141\2\uffff\1\150\1\60\1\106\1\156\2\102\1\uffff\1\142\1\60\1\uffff\1\143\1\60\1\uffff\1\151\1\60\1\165\1\157\1\145\1\uffff\1\153\1\uffff\1\145\1\uffff\1\164\1\170\1\154\1\60\1\154\1\164\2\60\1\uffff\1\144\1\157\2\uffff\1\60\1\156\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\125\1\151\1\145\1\151\1\141\1\157\2\145\1\151\2\uffff\1\156\1\165\1\141\1\150\1\172\2\uffff\2\uffff\1\57\2\uffff\1\111\1\uffff\1\164\1\170\1\151\1\144\1\154\1\170\1\160\1\146\1\151\1\144\2\uffff\1\160\1\164\1\144\1\145\5\uffff\1\172\1\145\1\164\1\147\1\164\1\154\1\164\1\172\1\164\1\147\1\164\1\165\1\164\1\151\1\143\1\uffff\1\154\1\114\1\164\1\150\1\142\1\172\1\uffff\1\172\1\164\1\150\1\164\2\157\1\153\1\172\1\141\1\150\1\172\1\141\2\uffff\1\150\1\172\1\106\1\156\2\102\1\uffff\1\142\1\172\1\uffff\1\143\1\172\1\uffff\1\151\1\172\1\165\1\157\1\145\1\uffff\1\153\1\uffff\1\145\1\uffff\1\164\1\170\1\154\1\172\1\154\1\164\2\172\1\uffff\1\144\1\157\2\uffff\1\172\1\156\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\14\1\15\5\uffff\1\22\1\23\3\uffff\1\27\1\30\1\uffff\1\22\12\uffff\1\14\1\15\4\uffff\1\23\1\24\1\25\1\26\1\27\17\uffff\1\1\6\uffff\1\10\14\uffff\1\6\1\7\6\uffff\1\2\2\uffff\1\4\2\uffff\1\12\5\uffff\1\3\1\uffff\1\11\1\uffff\1\17\10\uffff\1\5\2\uffff\1\21\1\13\2\uffff\1\16\1\uffff\1\20";
    static final String DFA12_specialS =
        "\1\0\22\uffff\1\2\1\1\150\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\4\27\1\24\7\27\1\25\12\22\7\27\1\21\1\15\1\17\3\21\1\1\1\3\1\14\10\21\1\16\1\21\1\2\2\21\1\4\3\21\3\27\1\20\1\21\1\27\2\21\1\5\4\21\1\10\3\21\1\7\7\21\1\6\2\21\1\11\3\21\1\12\1\27\1\13\uff82\27",
            "\1\30",
            "\1\33\3\uffff\1\32",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37\11\uffff\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\0\53",
            "\0\53",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\133",
            "\1\134",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\136",
            "",
            "",
            "\1\137",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\147",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\151",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\164",
            "\1\165",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\170",
            "\1\171",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\173",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='G') ) {s = 1;}

                        else if ( (LA12_0=='T') ) {s = 2;}

                        else if ( (LA12_0=='H') ) {s = 3;}

                        else if ( (LA12_0=='W') ) {s = 4;}

                        else if ( (LA12_0=='c') ) {s = 5;}

                        else if ( (LA12_0=='t') ) {s = 6;}

                        else if ( (LA12_0=='l') ) {s = 7;}

                        else if ( (LA12_0=='h') ) {s = 8;}

                        else if ( (LA12_0=='w') ) {s = 9;}

                        else if ( (LA12_0=='{') ) {s = 10;}

                        else if ( (LA12_0=='}') ) {s = 11;}

                        else if ( (LA12_0=='I') ) {s = 12;}

                        else if ( (LA12_0=='B') ) {s = 13;}

                        else if ( (LA12_0=='R') ) {s = 14;}

                        else if ( (LA12_0=='C') ) {s = 15;}

                        else if ( (LA12_0=='^') ) {s = 16;}

                        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='F')||(LA12_0>='J' && LA12_0<='Q')||LA12_0=='S'||(LA12_0>='U' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||(LA12_0>='d' && LA12_0<='g')||(LA12_0>='i' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 17;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 18;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 43;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 43;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}