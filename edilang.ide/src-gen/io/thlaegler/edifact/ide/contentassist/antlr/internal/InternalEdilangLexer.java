package io.thlaegler.edifact.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEdilangLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int RULE_COLON=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_PLUS=5;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_QUOTE_AND_NL=6;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalEdilangLexer() {;} 
    public InternalEdilangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEdilangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEdilang.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:11:7: ( '.?' )
            // InternalEdilang.g:11:9: '.?'
            {
            match(".?"); 


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
            // InternalEdilang.g:12:7: ( 'UNA' )
            // InternalEdilang.g:12:9: 'UNA'
            {
            match("UNA"); 


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
            // InternalEdilang.g:13:7: ( 'UNB' )
            // InternalEdilang.g:13:9: 'UNB'
            {
            match("UNB"); 


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
            // InternalEdilang.g:14:7: ( 'UNH' )
            // InternalEdilang.g:14:9: 'UNH'
            {
            match("UNH"); 


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
            // InternalEdilang.g:15:7: ( 'MSG' )
            // InternalEdilang.g:15:9: 'MSG'
            {
            match("MSG"); 


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
            // InternalEdilang.g:16:7: ( 'ORG' )
            // InternalEdilang.g:16:9: 'ORG'
            {
            match("ORG"); 


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
            // InternalEdilang.g:17:7: ( 'POC' )
            // InternalEdilang.g:17:9: 'POC'
            {
            match("POC"); 


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
            // InternalEdilang.g:18:7: ( 'ODI' )
            // InternalEdilang.g:18:9: 'ODI'
            {
            match("ODI"); 


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
            // InternalEdilang.g:19:7: ( 'UCI' )
            // InternalEdilang.g:19:9: 'UCI'
            {
            match("UCI"); 


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
            // InternalEdilang.g:20:7: ( 'PDI' )
            // InternalEdilang.g:20:9: 'PDI'
            {
            match("PDI"); 


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
            // InternalEdilang.g:21:7: ( 'TVL' )
            // InternalEdilang.g:21:9: 'TVL'
            {
            match("TVL"); 


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
            // InternalEdilang.g:22:7: ( 'RPI' )
            // InternalEdilang.g:22:9: 'RPI'
            {
            match("RPI"); 


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
            // InternalEdilang.g:23:7: ( 'MOA' )
            // InternalEdilang.g:23:9: 'MOA'
            {
            match("MOA"); 


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
            // InternalEdilang.g:24:7: ( 'LIN' )
            // InternalEdilang.g:24:9: 'LIN'
            {
            match("LIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:25:7: ( 'PRI' )
            // InternalEdilang.g:25:9: 'PRI'
            {
            match("PRI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:26:7: ( 'QTY' )
            // InternalEdilang.g:26:9: 'QTY'
            {
            match("QTY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:27:7: ( 'CUX' )
            // InternalEdilang.g:27:9: 'CUX'
            {
            match("CUX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:28:7: ( 'TAX' )
            // InternalEdilang.g:28:9: 'TAX'
            {
            match("TAX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:29:7: ( 'RFF' )
            // InternalEdilang.g:29:9: 'RFF'
            {
            match("RFF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:30:7: ( 'NAD' )
            // InternalEdilang.g:30:9: 'NAD'
            {
            match("NAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:31:7: ( 'DTM' )
            // InternalEdilang.g:31:9: 'DTM'
            {
            match("DTM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:32:7: ( 'BGM' )
            // InternalEdilang.g:32:9: 'BGM'
            {
            match("BGM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:33:7: ( 'PAT' )
            // InternalEdilang.g:33:9: 'PAT'
            {
            match("PAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:34:7: ( 'FTX' )
            // InternalEdilang.g:34:9: 'FTX'
            {
            match("FTX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:35:7: ( 'ERC' )
            // InternalEdilang.g:35:9: 'ERC'
            {
            match("ERC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:36:7: ( 'CNT' )
            // InternalEdilang.g:36:9: 'CNT'
            {
            match("CNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:37:7: ( 'CTA' )
            // InternalEdilang.g:37:9: 'CTA'
            {
            match("CTA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:38:7: ( 'PCI' )
            // InternalEdilang.g:38:9: 'PCI'
            {
            match("PCI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:39:7: ( 'UNS' )
            // InternalEdilang.g:39:9: 'UNS'
            {
            match("UNS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:40:7: ( 'UNT' )
            // InternalEdilang.g:40:9: 'UNT'
            {
            match("UNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:41:7: ( 'UNZ' )
            // InternalEdilang.g:41:9: 'UNZ'
            {
            match("UNZ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_QUOTE_AND_NL"
    public final void mRULE_QUOTE_AND_NL() throws RecognitionException {
        try {
            int _type = RULE_QUOTE_AND_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:21338:19: ( ( '\\'' | '~' ) ( '\\n' )? )
            // InternalEdilang.g:21338:21: ( '\\'' | '~' ) ( '\\n' )?
            {
            if ( input.LA(1)=='\''||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEdilang.g:21338:32: ( '\\n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\n') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEdilang.g:21338:32: '\\n'
                    {
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
    // $ANTLR end "RULE_QUOTE_AND_NL"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:21340:11: ( ( '+' | '*' ) )
            // InternalEdilang.g:21340:13: ( '+' | '*' )
            {
            if ( (input.LA(1)>='*' && input.LA(1)<='+') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:21342:12: ( ':' )
            // InternalEdilang.g:21342:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:21344:10: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalEdilang.g:21344:12: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:21346:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )? )
            // InternalEdilang.g:21346:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEdilang.g:21346:40: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==' '||(LA3_0>='-' && LA3_0<='.')||(LA3_0>='0' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEdilang.g:21346:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
                    {
                    // InternalEdilang.g:21346:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==' '||(LA2_1>='-' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='9')||LA2_1=='?'||(LA2_1>='A' && LA2_1<='Z')||LA2_1=='_'||(LA2_1>='a' && LA2_1<='z')) ) {
                                alt2=1;
                            }


                        }
                        else if ( (LA2_0==' '||(LA2_0>='-' && LA2_0<='.')||LA2_0=='?'||LA2_0=='_') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalEdilang.g:
                    	    {
                    	    if ( input.LA(1)==' '||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:21348:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalEdilang.g:21348:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalEdilang.g:21348:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalEdilang.g:21348:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalEdilang.g:21348:27: ~ ( ( '\\\\' | '\"' ) )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:21350:9: ( ( '\\t' | '\\r' | '\\n' )+ )
            // InternalEdilang.g:21350:11: ( '\\t' | '\\r' | '\\n' )+
            {
            // InternalEdilang.g:21350:11: ( '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEdilang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:21352:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEdilang.g:21352:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEdilang.g:21352:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEdilang.g:21352:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // InternalEdilang.g:21354:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEdilang.g:21354:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEdilang.g:21354:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEdilang.g:21354:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // InternalEdilang.g:21354:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEdilang.g:21354:41: ( '\\r' )? '\\n'
                    {
                    // InternalEdilang.g:21354:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalEdilang.g:21354:41: '\\r'
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:21356:16: ( . )
            // InternalEdilang.g:21356:18: .
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
        // InternalEdilang.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_QUOTE_AND_NL | RULE_PLUS | RULE_COLON | RULE_INT | RULE_ID | RULE_STRING | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt10=41;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalEdilang.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalEdilang.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalEdilang.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalEdilang.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalEdilang.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalEdilang.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalEdilang.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalEdilang.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalEdilang.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalEdilang.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalEdilang.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalEdilang.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalEdilang.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalEdilang.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalEdilang.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalEdilang.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalEdilang.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalEdilang.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalEdilang.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalEdilang.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalEdilang.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalEdilang.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalEdilang.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalEdilang.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalEdilang.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalEdilang.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalEdilang.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalEdilang.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalEdilang.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalEdilang.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalEdilang.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalEdilang.g:1:196: RULE_QUOTE_AND_NL
                {
                mRULE_QUOTE_AND_NL(); 

                }
                break;
            case 33 :
                // InternalEdilang.g:1:214: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 34 :
                // InternalEdilang.g:1:224: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 35 :
                // InternalEdilang.g:1:235: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalEdilang.g:1:244: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalEdilang.g:1:252: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalEdilang.g:1:264: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalEdilang.g:1:272: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalEdilang.g:1:288: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalEdilang.g:1:304: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\30\16\34\3\uffff\1\34\1\uffff\1\30\1\uffff\1\30\2\uffff\2\34\1\uffff\27\34\3\uffff\1\34\4\uffff\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\34\36\uffff\14\34\1\u0086\1\uffff";
    static final String DFA10_eofS =
        "\u0087\uffff";
    static final String DFA10_minS =
        "\1\0\1\77\1\103\1\117\1\104\2\101\1\106\1\111\1\124\1\116\1\101\1\124\1\107\1\124\1\122\3\uffff\1\60\1\uffff\1\0\1\uffff\1\52\2\uffff\1\101\1\111\1\uffff\1\107\1\101\1\107\1\111\1\103\2\111\1\124\1\111\1\114\1\130\1\111\1\106\1\116\1\131\1\130\1\124\1\101\1\104\2\115\1\130\1\103\3\uffff\1\60\4\uffff\36\40\1\60\36\uffff\14\60\1\40\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\77\1\116\1\123\2\122\1\126\1\120\1\111\1\124\1\125\1\101\1\124\1\107\1\124\1\122\3\uffff\1\71\1\uffff\1\uffff\1\uffff\1\57\2\uffff\1\132\1\111\1\uffff\1\107\1\101\1\107\1\111\1\103\2\111\1\124\1\111\1\114\1\130\1\111\1\106\1\116\1\131\1\130\1\124\1\101\1\104\2\115\1\130\1\103\3\uffff\1\71\4\uffff\36\172\1\71\36\uffff\14\71\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\20\uffff\1\40\1\41\1\42\1\uffff\1\44\1\uffff\1\46\1\uffff\1\51\1\1\2\uffff\1\44\27\uffff\1\40\1\41\1\42\1\uffff\1\45\1\46\1\47\1\50\37\uffff\1\2\1\3\1\4\1\35\1\36\1\37\1\11\1\5\1\15\1\6\1\10\1\7\1\12\1\17\1\27\1\34\1\13\1\22\1\14\1\23\1\16\1\20\1\21\1\32\1\33\1\24\1\25\1\26\1\30\1\31\15\uffff\1\43";
    static final String DFA10_specialS =
        "\1\1\24\uffff\1\0\161\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\30\2\26\2\30\1\26\24\30\1\25\4\30\1\20\2\30\2\21\2\30\1\1\1\27\12\23\1\22\6\30\1\24\1\15\1\12\1\14\1\17\1\16\5\24\1\10\1\3\1\13\1\4\1\5\1\11\1\7\1\24\1\6\1\2\5\24\6\30\32\24\3\30\1\20\uff81\30",
            "\1\31",
            "\1\33\12\uffff\1\32",
            "\1\36\3\uffff\1\35",
            "\1\40\15\uffff\1\37",
            "\1\44\1\uffff\1\45\1\42\12\uffff\1\41\2\uffff\1\43",
            "\1\47\24\uffff\1\46",
            "\1\51\11\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\55\5\uffff\1\56\1\54",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "\12\67",
            "",
            "\0\70",
            "",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "\1\74\1\75\5\uffff\1\76\12\uffff\1\77\1\100\5\uffff\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "\12\132",
            "",
            "",
            "",
            "",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\172",
            "\12\173",
            "\12\174",
            "\12\175",
            "\12\176",
            "\12\177",
            "\12\u0080",
            "\12\u0081",
            "\12\u0082",
            "\12\u0083",
            "\12\u0084",
            "\12\u0085",
            "\1\34\14\uffff\2\34\1\uffff\12\34\5\uffff\1\34\1\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_QUOTE_AND_NL | RULE_PLUS | RULE_COLON | RULE_INT | RULE_ID | RULE_STRING | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_21 = input.LA(1);

                        s = -1;
                        if ( ((LA10_21>='\u0000' && LA10_21<='\uFFFF')) ) {s = 56;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='.') ) {s = 1;}

                        else if ( (LA10_0=='U') ) {s = 2;}

                        else if ( (LA10_0=='M') ) {s = 3;}

                        else if ( (LA10_0=='O') ) {s = 4;}

                        else if ( (LA10_0=='P') ) {s = 5;}

                        else if ( (LA10_0=='T') ) {s = 6;}

                        else if ( (LA10_0=='R') ) {s = 7;}

                        else if ( (LA10_0=='L') ) {s = 8;}

                        else if ( (LA10_0=='Q') ) {s = 9;}

                        else if ( (LA10_0=='C') ) {s = 10;}

                        else if ( (LA10_0=='N') ) {s = 11;}

                        else if ( (LA10_0=='D') ) {s = 12;}

                        else if ( (LA10_0=='B') ) {s = 13;}

                        else if ( (LA10_0=='F') ) {s = 14;}

                        else if ( (LA10_0=='E') ) {s = 15;}

                        else if ( (LA10_0=='\''||LA10_0=='~') ) {s = 16;}

                        else if ( ((LA10_0>='*' && LA10_0<='+')) ) {s = 17;}

                        else if ( (LA10_0==':') ) {s = 18;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 19;}

                        else if ( (LA10_0=='A'||(LA10_0>='G' && LA10_0<='K')||LA10_0=='S'||(LA10_0>='V' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {s = 20;}

                        else if ( (LA10_0=='\"') ) {s = 21;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r') ) {s = 22;}

                        else if ( (LA10_0=='/') ) {s = 23;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='&')||(LA10_0>='(' && LA10_0<=')')||(LA10_0>=',' && LA10_0<='-')||(LA10_0>=';' && LA10_0<='@')||(LA10_0>='[' && LA10_0<='`')||(LA10_0>='{' && LA10_0<='}')||(LA10_0>='\u007F' && LA10_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}