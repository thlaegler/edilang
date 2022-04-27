package io.thlaegler.edifact.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEdilangLexer extends Lexer {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=7;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_COLON=4;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__90=90;
    public static final int T__185=185;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__169=169;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int RULE_PLUS=5;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_QUOTE_AND_NL=6;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
            // InternalEdilang.g:11:7: ( 'UNA' )
            // InternalEdilang.g:11:9: 'UNA'
            {
            match("UNA"); 


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
            // InternalEdilang.g:12:7: ( '.?' )
            // InternalEdilang.g:12:9: '.?'
            {
            match(".?"); 


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
            // InternalEdilang.g:15:7: ( 'UNG' )
            // InternalEdilang.g:15:9: 'UNG'
            {
            match("UNG"); 


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
            // InternalEdilang.g:16:7: ( 'ADR' )
            // InternalEdilang.g:16:9: 'ADR'
            {
            match("ADR"); 


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
            // InternalEdilang.g:17:7: ( 'AGR' )
            // InternalEdilang.g:17:9: 'AGR'
            {
            match("AGR"); 


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
            // InternalEdilang.g:18:7: ( 'AJT' )
            // InternalEdilang.g:18:9: 'AJT'
            {
            match("AJT"); 


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
            // InternalEdilang.g:19:7: ( 'ALC' )
            // InternalEdilang.g:19:9: 'ALC'
            {
            match("ALC"); 


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
            // InternalEdilang.g:20:7: ( 'ALI' )
            // InternalEdilang.g:20:9: 'ALI'
            {
            match("ALI"); 


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
            // InternalEdilang.g:21:7: ( 'APP' )
            // InternalEdilang.g:21:9: 'APP'
            {
            match("APP"); 


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
            // InternalEdilang.g:22:7: ( 'APR' )
            // InternalEdilang.g:22:9: 'APR'
            {
            match("APR"); 


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
            // InternalEdilang.g:23:7: ( 'ARD' )
            // InternalEdilang.g:23:9: 'ARD'
            {
            match("ARD"); 


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
            // InternalEdilang.g:24:7: ( 'ARR' )
            // InternalEdilang.g:24:9: 'ARR'
            {
            match("ARR"); 


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
            // InternalEdilang.g:25:7: ( 'ASI' )
            // InternalEdilang.g:25:9: 'ASI'
            {
            match("ASI"); 


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
            // InternalEdilang.g:26:7: ( 'ATT' )
            // InternalEdilang.g:26:9: 'ATT'
            {
            match("ATT"); 


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
            // InternalEdilang.g:27:7: ( 'AUT' )
            // InternalEdilang.g:27:9: 'AUT'
            {
            match("AUT"); 


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
            // InternalEdilang.g:28:7: ( 'BAS' )
            // InternalEdilang.g:28:9: 'BAS'
            {
            match("BAS"); 


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
            // InternalEdilang.g:29:7: ( 'BII' )
            // InternalEdilang.g:29:9: 'BII'
            {
            match("BII"); 


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
            // InternalEdilang.g:30:7: ( 'BUS' )
            // InternalEdilang.g:30:9: 'BUS'
            {
            match("BUS"); 


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
            // InternalEdilang.g:31:7: ( 'CAV' )
            // InternalEdilang.g:31:9: 'CAV'
            {
            match("CAV"); 


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
            // InternalEdilang.g:32:7: ( 'CCD' )
            // InternalEdilang.g:32:9: 'CCD'
            {
            match("CCD"); 


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
            // InternalEdilang.g:33:7: ( 'CCI' )
            // InternalEdilang.g:33:9: 'CCI'
            {
            match("CCI"); 


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
            // InternalEdilang.g:34:7: ( 'CDI' )
            // InternalEdilang.g:34:9: 'CDI'
            {
            match("CDI"); 


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
            // InternalEdilang.g:35:7: ( 'CDS' )
            // InternalEdilang.g:35:9: 'CDS'
            {
            match("CDS"); 


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
            // InternalEdilang.g:36:7: ( 'CDV' )
            // InternalEdilang.g:36:9: 'CDV'
            {
            match("CDV"); 


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
            // InternalEdilang.g:37:7: ( 'CED' )
            // InternalEdilang.g:37:9: 'CED'
            {
            match("CED"); 


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
            // InternalEdilang.g:38:7: ( 'CIN' )
            // InternalEdilang.g:38:9: 'CIN'
            {
            match("CIN"); 


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
            // InternalEdilang.g:39:7: ( 'CLA' )
            // InternalEdilang.g:39:9: 'CLA'
            {
            match("CLA"); 


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
            // InternalEdilang.g:40:7: ( 'CLI' )
            // InternalEdilang.g:40:9: 'CLI'
            {
            match("CLI"); 


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
            // InternalEdilang.g:41:7: ( 'CMP' )
            // InternalEdilang.g:41:9: 'CMP'
            {
            match("CMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:42:7: ( 'CNI' )
            // InternalEdilang.g:42:9: 'CNI'
            {
            match("CNI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:43:7: ( 'COD' )
            // InternalEdilang.g:43:9: 'COD'
            {
            match("COD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:44:7: ( 'COM' )
            // InternalEdilang.g:44:9: 'COM'
            {
            match("COM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:45:7: ( 'COT' )
            // InternalEdilang.g:45:9: 'COT'
            {
            match("COT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:46:7: ( 'CPI' )
            // InternalEdilang.g:46:9: 'CPI'
            {
            match("CPI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:47:7: ( 'CPS' )
            // InternalEdilang.g:47:9: 'CPS'
            {
            match("CPS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:48:7: ( 'CPT' )
            // InternalEdilang.g:48:9: 'CPT'
            {
            match("CPT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:49:7: ( 'CST' )
            // InternalEdilang.g:49:9: 'CST'
            {
            match("CST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:50:7: ( 'DAM' )
            // InternalEdilang.g:50:9: 'DAM'
            {
            match("DAM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:51:7: ( 'DFN' )
            // InternalEdilang.g:51:9: 'DFN'
            {
            match("DFN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:52:7: ( 'DGS' )
            // InternalEdilang.g:52:9: 'DGS'
            {
            match("DGS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:53:7: ( 'DII' )
            // InternalEdilang.g:53:9: 'DII'
            {
            match("DII"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:54:7: ( 'DIM' )
            // InternalEdilang.g:54:9: 'DIM'
            {
            match("DIM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:55:7: ( 'DLI' )
            // InternalEdilang.g:55:9: 'DLI'
            {
            match("DLI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:56:7: ( 'DLM' )
            // InternalEdilang.g:56:9: 'DLM'
            {
            match("DLM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:57:7: ( 'DMS' )
            // InternalEdilang.g:57:9: 'DMS'
            {
            match("DMS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:58:7: ( 'DOC' )
            // InternalEdilang.g:58:9: 'DOC'
            {
            match("DOC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:59:7: ( 'DRD' )
            // InternalEdilang.g:59:9: 'DRD'
            {
            match("DRD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:60:7: ( 'DSG' )
            // InternalEdilang.g:60:9: 'DSG'
            {
            match("DSG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:61:7: ( 'DSI' )
            // InternalEdilang.g:61:9: 'DSI'
            {
            match("DSI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:62:7: ( 'EDT' )
            // InternalEdilang.g:62:9: 'EDT'
            {
            match("EDT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:63:7: ( 'EFI' )
            // InternalEdilang.g:63:9: 'EFI'
            {
            match("EFI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:64:7: ( 'ELM' )
            // InternalEdilang.g:64:9: 'ELM'
            {
            match("ELM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:65:7: ( 'ELU' )
            // InternalEdilang.g:65:9: 'ELU'
            {
            match("ELU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:66:7: ( 'ELV' )
            // InternalEdilang.g:66:9: 'ELV'
            {
            match("ELV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:67:7: ( 'EMP' )
            // InternalEdilang.g:67:9: 'EMP'
            {
            match("EMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:68:7: ( 'EQA' )
            // InternalEdilang.g:68:9: 'EQA'
            {
            match("EQA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:69:7: ( 'EQD' )
            // InternalEdilang.g:69:9: 'EQD'
            {
            match("EQD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:70:7: ( 'EQN' )
            // InternalEdilang.g:70:9: 'EQN'
            {
            match("EQN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:71:7: ( 'ERP' )
            // InternalEdilang.g:71:9: 'ERP'
            {
            match("ERP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:72:7: ( 'EVE' )
            // InternalEdilang.g:72:9: 'EVE'
            {
            match("EVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:73:7: ( 'EVT' )
            // InternalEdilang.g:73:9: 'EVT'
            {
            match("EVT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:74:7: ( 'FCA' )
            // InternalEdilang.g:74:9: 'FCA'
            {
            match("FCA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:75:7: ( 'FII' )
            // InternalEdilang.g:75:9: 'FII'
            {
            match("FII"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:76:7: ( 'FNS' )
            // InternalEdilang.g:76:9: 'FNS'
            {
            match("FNS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:77:7: ( 'FNT' )
            // InternalEdilang.g:77:9: 'FNT'
            {
            match("FNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:78:7: ( 'FOR' )
            // InternalEdilang.g:78:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:79:7: ( 'FSQ' )
            // InternalEdilang.g:79:9: 'FSQ'
            {
            match("FSQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:80:7: ( 'GDS' )
            // InternalEdilang.g:80:9: 'GDS'
            {
            match("GDS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:81:7: ( 'GEI' )
            // InternalEdilang.g:81:9: 'GEI'
            {
            match("GEI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:82:7: ( 'GID' )
            // InternalEdilang.g:82:9: 'GID'
            {
            match("GID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:83:7: ( 'GIN' )
            // InternalEdilang.g:83:9: 'GIN'
            {
            match("GIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:84:7: ( 'GIR' )
            // InternalEdilang.g:84:9: 'GIR'
            {
            match("GIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:85:7: ( 'GIS' )
            // InternalEdilang.g:85:9: 'GIS'
            {
            match("GIS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:86:7: ( 'GOR' )
            // InternalEdilang.g:86:9: 'GOR'
            {
            match("GOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:87:7: ( 'GRU' )
            // InternalEdilang.g:87:9: 'GRU'
            {
            match("GRU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:88:7: ( 'HAN' )
            // InternalEdilang.g:88:9: 'HAN'
            {
            match("HAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:89:7: ( 'HYN' )
            // InternalEdilang.g:89:9: 'HYN'
            {
            match("HYN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:90:7: ( 'ICD' )
            // InternalEdilang.g:90:9: 'ICD'
            {
            match("ICD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:91:7: ( 'IDE' )
            // InternalEdilang.g:91:9: 'IDE'
            {
            match("IDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:92:7: ( 'IFD' )
            // InternalEdilang.g:92:9: 'IFD'
            {
            match("IFD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:93:7: ( 'IHC' )
            // InternalEdilang.g:93:9: 'IHC'
            {
            match("IHC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:94:7: ( 'IMD' )
            // InternalEdilang.g:94:9: 'IMD'
            {
            match("IMD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:95:7: ( 'IND' )
            // InternalEdilang.g:95:9: 'IND'
            {
            match("IND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:96:7: ( 'INP' )
            // InternalEdilang.g:96:9: 'INP'
            {
            match("INP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:97:8: ( 'INV' )
            // InternalEdilang.g:97:10: 'INV'
            {
            match("INV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:98:8: ( 'IRQ' )
            // InternalEdilang.g:98:10: 'IRQ'
            {
            match("IRQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:99:8: ( 'LAN' )
            // InternalEdilang.g:99:10: 'LAN'
            {
            match("LAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:100:8: ( 'LOC' )
            // InternalEdilang.g:100:10: 'LOC'
            {
            match("LOC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:101:8: ( 'MEA' )
            // InternalEdilang.g:101:10: 'MEA'
            {
            match("MEA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:102:8: ( 'MEM' )
            // InternalEdilang.g:102:10: 'MEM'
            {
            match("MEM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:103:8: ( 'MKS' )
            // InternalEdilang.g:103:10: 'MKS'
            {
            match("MKS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:104:8: ( 'NAT' )
            // InternalEdilang.g:104:10: 'NAT'
            {
            match("NAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:105:8: ( 'PAC' )
            // InternalEdilang.g:105:10: 'PAC'
            {
            match("PAC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:106:8: ( 'PAI' )
            // InternalEdilang.g:106:10: 'PAI'
            {
            match("PAI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:107:8: ( 'PAS' )
            // InternalEdilang.g:107:10: 'PAS'
            {
            match("PAS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:108:8: ( 'PCC' )
            // InternalEdilang.g:108:10: 'PCC'
            {
            match("PCC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:109:8: ( 'PCD' )
            // InternalEdilang.g:109:10: 'PCD'
            {
            match("PCD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:110:8: ( 'PER' )
            // InternalEdilang.g:110:10: 'PER'
            {
            match("PER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:111:8: ( 'PGI' )
            // InternalEdilang.g:111:10: 'PGI'
            {
            match("PGI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:112:8: ( 'PIA' )
            // InternalEdilang.g:112:10: 'PIA'
            {
            match("PIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:113:8: ( 'PNA' )
            // InternalEdilang.g:113:10: 'PNA'
            {
            match("PNA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:114:8: ( 'PRC' )
            // InternalEdilang.g:114:10: 'PRC'
            {
            match("PRC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:115:8: ( 'PRV' )
            // InternalEdilang.g:115:10: 'PRV'
            {
            match("PRV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:116:8: ( 'PSD' )
            // InternalEdilang.g:116:10: 'PSD'
            {
            match("PSD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:117:8: ( 'PTY' )
            // InternalEdilang.g:117:10: 'PTY'
            {
            match("PTY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:118:8: ( 'PYT' )
            // InternalEdilang.g:118:10: 'PYT'
            {
            match("PYT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:119:8: ( 'QRS' )
            // InternalEdilang.g:119:10: 'QRS'
            {
            match("QRS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:120:8: ( 'QUA' )
            // InternalEdilang.g:120:10: 'QUA'
            {
            match("QUA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:121:8: ( 'QVR' )
            // InternalEdilang.g:121:10: 'QVR'
            {
            match("QVR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:122:8: ( 'RCS' )
            // InternalEdilang.g:122:10: 'RCS'
            {
            match("RCS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:123:8: ( 'REL' )
            // InternalEdilang.g:123:10: 'REL'
            {
            match("REL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:124:8: ( 'RJL' )
            // InternalEdilang.g:124:10: 'RJL'
            {
            match("RJL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:125:8: ( 'RNG' )
            // InternalEdilang.g:125:10: 'RNG'
            {
            match("RNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:126:8: ( 'ROD' )
            // InternalEdilang.g:126:10: 'ROD'
            {
            match("ROD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:127:8: ( 'RSL' )
            // InternalEdilang.g:127:10: 'RSL'
            {
            match("RSL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:128:8: ( 'RTE' )
            // InternalEdilang.g:128:10: 'RTE'
            {
            match("RTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:129:8: ( 'SAL' )
            // InternalEdilang.g:129:10: 'SAL'
            {
            match("SAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:130:8: ( 'SCC' )
            // InternalEdilang.g:130:10: 'SCC'
            {
            match("SCC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:131:8: ( 'SCD' )
            // InternalEdilang.g:131:10: 'SCD'
            {
            match("SCD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:132:8: ( 'SEG' )
            // InternalEdilang.g:132:10: 'SEG'
            {
            match("SEG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:133:8: ( 'SEL' )
            // InternalEdilang.g:133:10: 'SEL'
            {
            match("SEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:134:8: ( 'SEQ' )
            // InternalEdilang.g:134:10: 'SEQ'
            {
            match("SEQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:135:8: ( 'SFI' )
            // InternalEdilang.g:135:10: 'SFI'
            {
            match("SFI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:136:8: ( 'SGP' )
            // InternalEdilang.g:136:10: 'SGP'
            {
            match("SGP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:137:8: ( 'SGU' )
            // InternalEdilang.g:137:10: 'SGU'
            {
            match("SGU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:138:8: ( 'SPR' )
            // InternalEdilang.g:138:10: 'SPR'
            {
            match("SPR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:139:8: ( 'SPS' )
            // InternalEdilang.g:139:10: 'SPS'
            {
            match("SPS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:140:8: ( 'STA' )
            // InternalEdilang.g:140:10: 'STA'
            {
            match("STA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:141:8: ( 'STC' )
            // InternalEdilang.g:141:10: 'STC'
            {
            match("STC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:142:8: ( 'STG' )
            // InternalEdilang.g:142:10: 'STG'
            {
            match("STG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:143:8: ( 'STS' )
            // InternalEdilang.g:143:10: 'STS'
            {
            match("STS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:144:8: ( 'STX' )
            // InternalEdilang.g:144:10: 'STX'
            {
            match("STX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:145:8: ( 'TCC' )
            // InternalEdilang.g:145:10: 'TCC'
            {
            match("TCC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:146:8: ( 'TDT' )
            // InternalEdilang.g:146:10: 'TDT'
            {
            match("TDT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:147:8: ( 'TEM' )
            // InternalEdilang.g:147:10: 'TEM'
            {
            match("TEM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:148:8: ( 'TMD' )
            // InternalEdilang.g:148:10: 'TMD'
            {
            match("TMD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:149:8: ( 'TMP' )
            // InternalEdilang.g:149:10: 'TMP'
            {
            match("TMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:150:8: ( 'TOD' )
            // InternalEdilang.g:150:10: 'TOD'
            {
            match("TOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:151:8: ( 'TPL' )
            // InternalEdilang.g:151:10: 'TPL'
            {
            match("TPL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:152:8: ( 'TRU' )
            // InternalEdilang.g:152:10: 'TRU'
            {
            match("TRU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:153:8: ( 'TSR' )
            // InternalEdilang.g:153:10: 'TSR'
            {
            match("TSR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:154:8: ( 'VLI' )
            // InternalEdilang.g:154:10: 'VLI'
            {
            match("VLI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:155:8: ( 'MSG' )
            // InternalEdilang.g:155:10: 'MSG'
            {
            match("MSG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:156:8: ( 'ORG' )
            // InternalEdilang.g:156:10: 'ORG'
            {
            match("ORG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:157:8: ( 'POC' )
            // InternalEdilang.g:157:10: 'POC'
            {
            match("POC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:158:8: ( 'ODI' )
            // InternalEdilang.g:158:10: 'ODI'
            {
            match("ODI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:159:8: ( 'UCI' )
            // InternalEdilang.g:159:10: 'UCI'
            {
            match("UCI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:160:8: ( 'PDI' )
            // InternalEdilang.g:160:10: 'PDI'
            {
            match("PDI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:161:8: ( 'TVL' )
            // InternalEdilang.g:161:10: 'TVL'
            {
            match("TVL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:162:8: ( 'RPI' )
            // InternalEdilang.g:162:10: 'RPI'
            {
            match("RPI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:163:8: ( 'MOA' )
            // InternalEdilang.g:163:10: 'MOA'
            {
            match("MOA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:164:8: ( 'LIN' )
            // InternalEdilang.g:164:10: 'LIN'
            {
            match("LIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:165:8: ( 'PRI' )
            // InternalEdilang.g:165:10: 'PRI'
            {
            match("PRI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:166:8: ( 'QTY' )
            // InternalEdilang.g:166:10: 'QTY'
            {
            match("QTY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:167:8: ( 'CUX' )
            // InternalEdilang.g:167:10: 'CUX'
            {
            match("CUX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:168:8: ( 'TAX' )
            // InternalEdilang.g:168:10: 'TAX'
            {
            match("TAX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:169:8: ( 'RFF' )
            // InternalEdilang.g:169:10: 'RFF'
            {
            match("RFF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:170:8: ( 'NAD' )
            // InternalEdilang.g:170:10: 'NAD'
            {
            match("NAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:171:8: ( 'DTM' )
            // InternalEdilang.g:171:10: 'DTM'
            {
            match("DTM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:172:8: ( 'BGM' )
            // InternalEdilang.g:172:10: 'BGM'
            {
            match("BGM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:173:8: ( 'PAT' )
            // InternalEdilang.g:173:10: 'PAT'
            {
            match("PAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:174:8: ( 'FTX' )
            // InternalEdilang.g:174:10: 'FTX'
            {
            match("FTX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:175:8: ( 'ERC' )
            // InternalEdilang.g:175:10: 'ERC'
            {
            match("ERC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:176:8: ( 'CNT' )
            // InternalEdilang.g:176:10: 'CNT'
            {
            match("CNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:177:8: ( 'CTA' )
            // InternalEdilang.g:177:10: 'CTA'
            {
            match("CTA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:178:8: ( 'PCI' )
            // InternalEdilang.g:178:10: 'PCI'
            {
            match("PCI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:179:8: ( 'UNS' )
            // InternalEdilang.g:179:10: 'UNS'
            {
            match("UNS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:180:8: ( 'UNT' )
            // InternalEdilang.g:180:10: 'UNT'
            {
            match("UNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:181:8: ( 'UNZ' )
            // InternalEdilang.g:181:10: 'UNZ'
            {
            match("UNZ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:182:8: ( 'UNE' )
            // InternalEdilang.g:182:10: 'UNE'
            {
            match("UNE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "RULE_QUOTE_AND_NL"
    public final void mRULE_QUOTE_AND_NL() throws RecognitionException {
        try {
            int _type = RULE_QUOTE_AND_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdilang.g:25955:19: ( ( '\\'' | '~' ) ( '\\n' )? )
            // InternalEdilang.g:25955:21: ( '\\'' | '~' ) ( '\\n' )?
            {
            if ( input.LA(1)=='\''||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEdilang.g:25955:32: ( '\\n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\n') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEdilang.g:25955:32: '\\n'
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
            // InternalEdilang.g:25957:11: ( ( '+' | '*' ) )
            // InternalEdilang.g:25957:13: ( '+' | '*' )
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
            // InternalEdilang.g:25959:12: ( ':' )
            // InternalEdilang.g:25959:14: ':'
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
            // InternalEdilang.g:25961:10: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalEdilang.g:25961:12: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalEdilang.g:25963:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )? )
            // InternalEdilang.g:25963:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEdilang.g:25963:40: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==' '||(LA3_0>='-' && LA3_0<='.')||(LA3_0>='0' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEdilang.g:25963:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
                    {
                    // InternalEdilang.g:25963:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | ' ' | '?' )*
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
            // InternalEdilang.g:25965:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalEdilang.g:25965:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalEdilang.g:25965:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalEdilang.g:25965:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalEdilang.g:25965:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalEdilang.g:25967:9: ( ( '\\t' | '\\r' | '\\n' )+ )
            // InternalEdilang.g:25967:11: ( '\\t' | '\\r' | '\\n' )+
            {
            // InternalEdilang.g:25967:11: ( '\\t' | '\\r' | '\\n' )+
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
            // InternalEdilang.g:25969:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEdilang.g:25969:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEdilang.g:25969:24: ( options {greedy=false; } : . )*
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
            	    // InternalEdilang.g:25969:52: .
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
            // InternalEdilang.g:25971:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEdilang.g:25971:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEdilang.g:25971:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEdilang.g:25971:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalEdilang.g:25971:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEdilang.g:25971:41: ( '\\r' )? '\\n'
                    {
                    // InternalEdilang.g:25971:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalEdilang.g:25971:41: '\\r'
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
            // InternalEdilang.g:25973:16: ( . )
            // InternalEdilang.g:25973:18: .
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
        // InternalEdilang.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | RULE_QUOTE_AND_NL | RULE_PLUS | RULE_COLON | RULE_INT | RULE_ID | RULE_STRING | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt10=182;
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
                // InternalEdilang.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalEdilang.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalEdilang.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalEdilang.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalEdilang.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalEdilang.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalEdilang.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalEdilang.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalEdilang.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalEdilang.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalEdilang.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalEdilang.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalEdilang.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalEdilang.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalEdilang.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalEdilang.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalEdilang.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalEdilang.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalEdilang.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalEdilang.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalEdilang.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalEdilang.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalEdilang.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalEdilang.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalEdilang.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalEdilang.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalEdilang.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalEdilang.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalEdilang.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalEdilang.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalEdilang.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalEdilang.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalEdilang.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalEdilang.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalEdilang.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalEdilang.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // InternalEdilang.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // InternalEdilang.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // InternalEdilang.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // InternalEdilang.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // InternalEdilang.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // InternalEdilang.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // InternalEdilang.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // InternalEdilang.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // InternalEdilang.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // InternalEdilang.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // InternalEdilang.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // InternalEdilang.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // InternalEdilang.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // InternalEdilang.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // InternalEdilang.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // InternalEdilang.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // InternalEdilang.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // InternalEdilang.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // InternalEdilang.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // InternalEdilang.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // InternalEdilang.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // InternalEdilang.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // InternalEdilang.g:1:547: T__103
                {
                mT__103(); 

                }
                break;
            case 91 :
                // InternalEdilang.g:1:554: T__104
                {
                mT__104(); 

                }
                break;
            case 92 :
                // InternalEdilang.g:1:561: T__105
                {
                mT__105(); 

                }
                break;
            case 93 :
                // InternalEdilang.g:1:568: T__106
                {
                mT__106(); 

                }
                break;
            case 94 :
                // InternalEdilang.g:1:575: T__107
                {
                mT__107(); 

                }
                break;
            case 95 :
                // InternalEdilang.g:1:582: T__108
                {
                mT__108(); 

                }
                break;
            case 96 :
                // InternalEdilang.g:1:589: T__109
                {
                mT__109(); 

                }
                break;
            case 97 :
                // InternalEdilang.g:1:596: T__110
                {
                mT__110(); 

                }
                break;
            case 98 :
                // InternalEdilang.g:1:603: T__111
                {
                mT__111(); 

                }
                break;
            case 99 :
                // InternalEdilang.g:1:610: T__112
                {
                mT__112(); 

                }
                break;
            case 100 :
                // InternalEdilang.g:1:617: T__113
                {
                mT__113(); 

                }
                break;
            case 101 :
                // InternalEdilang.g:1:624: T__114
                {
                mT__114(); 

                }
                break;
            case 102 :
                // InternalEdilang.g:1:631: T__115
                {
                mT__115(); 

                }
                break;
            case 103 :
                // InternalEdilang.g:1:638: T__116
                {
                mT__116(); 

                }
                break;
            case 104 :
                // InternalEdilang.g:1:645: T__117
                {
                mT__117(); 

                }
                break;
            case 105 :
                // InternalEdilang.g:1:652: T__118
                {
                mT__118(); 

                }
                break;
            case 106 :
                // InternalEdilang.g:1:659: T__119
                {
                mT__119(); 

                }
                break;
            case 107 :
                // InternalEdilang.g:1:666: T__120
                {
                mT__120(); 

                }
                break;
            case 108 :
                // InternalEdilang.g:1:673: T__121
                {
                mT__121(); 

                }
                break;
            case 109 :
                // InternalEdilang.g:1:680: T__122
                {
                mT__122(); 

                }
                break;
            case 110 :
                // InternalEdilang.g:1:687: T__123
                {
                mT__123(); 

                }
                break;
            case 111 :
                // InternalEdilang.g:1:694: T__124
                {
                mT__124(); 

                }
                break;
            case 112 :
                // InternalEdilang.g:1:701: T__125
                {
                mT__125(); 

                }
                break;
            case 113 :
                // InternalEdilang.g:1:708: T__126
                {
                mT__126(); 

                }
                break;
            case 114 :
                // InternalEdilang.g:1:715: T__127
                {
                mT__127(); 

                }
                break;
            case 115 :
                // InternalEdilang.g:1:722: T__128
                {
                mT__128(); 

                }
                break;
            case 116 :
                // InternalEdilang.g:1:729: T__129
                {
                mT__129(); 

                }
                break;
            case 117 :
                // InternalEdilang.g:1:736: T__130
                {
                mT__130(); 

                }
                break;
            case 118 :
                // InternalEdilang.g:1:743: T__131
                {
                mT__131(); 

                }
                break;
            case 119 :
                // InternalEdilang.g:1:750: T__132
                {
                mT__132(); 

                }
                break;
            case 120 :
                // InternalEdilang.g:1:757: T__133
                {
                mT__133(); 

                }
                break;
            case 121 :
                // InternalEdilang.g:1:764: T__134
                {
                mT__134(); 

                }
                break;
            case 122 :
                // InternalEdilang.g:1:771: T__135
                {
                mT__135(); 

                }
                break;
            case 123 :
                // InternalEdilang.g:1:778: T__136
                {
                mT__136(); 

                }
                break;
            case 124 :
                // InternalEdilang.g:1:785: T__137
                {
                mT__137(); 

                }
                break;
            case 125 :
                // InternalEdilang.g:1:792: T__138
                {
                mT__138(); 

                }
                break;
            case 126 :
                // InternalEdilang.g:1:799: T__139
                {
                mT__139(); 

                }
                break;
            case 127 :
                // InternalEdilang.g:1:806: T__140
                {
                mT__140(); 

                }
                break;
            case 128 :
                // InternalEdilang.g:1:813: T__141
                {
                mT__141(); 

                }
                break;
            case 129 :
                // InternalEdilang.g:1:820: T__142
                {
                mT__142(); 

                }
                break;
            case 130 :
                // InternalEdilang.g:1:827: T__143
                {
                mT__143(); 

                }
                break;
            case 131 :
                // InternalEdilang.g:1:834: T__144
                {
                mT__144(); 

                }
                break;
            case 132 :
                // InternalEdilang.g:1:841: T__145
                {
                mT__145(); 

                }
                break;
            case 133 :
                // InternalEdilang.g:1:848: T__146
                {
                mT__146(); 

                }
                break;
            case 134 :
                // InternalEdilang.g:1:855: T__147
                {
                mT__147(); 

                }
                break;
            case 135 :
                // InternalEdilang.g:1:862: T__148
                {
                mT__148(); 

                }
                break;
            case 136 :
                // InternalEdilang.g:1:869: T__149
                {
                mT__149(); 

                }
                break;
            case 137 :
                // InternalEdilang.g:1:876: T__150
                {
                mT__150(); 

                }
                break;
            case 138 :
                // InternalEdilang.g:1:883: T__151
                {
                mT__151(); 

                }
                break;
            case 139 :
                // InternalEdilang.g:1:890: T__152
                {
                mT__152(); 

                }
                break;
            case 140 :
                // InternalEdilang.g:1:897: T__153
                {
                mT__153(); 

                }
                break;
            case 141 :
                // InternalEdilang.g:1:904: T__154
                {
                mT__154(); 

                }
                break;
            case 142 :
                // InternalEdilang.g:1:911: T__155
                {
                mT__155(); 

                }
                break;
            case 143 :
                // InternalEdilang.g:1:918: T__156
                {
                mT__156(); 

                }
                break;
            case 144 :
                // InternalEdilang.g:1:925: T__157
                {
                mT__157(); 

                }
                break;
            case 145 :
                // InternalEdilang.g:1:932: T__158
                {
                mT__158(); 

                }
                break;
            case 146 :
                // InternalEdilang.g:1:939: T__159
                {
                mT__159(); 

                }
                break;
            case 147 :
                // InternalEdilang.g:1:946: T__160
                {
                mT__160(); 

                }
                break;
            case 148 :
                // InternalEdilang.g:1:953: T__161
                {
                mT__161(); 

                }
                break;
            case 149 :
                // InternalEdilang.g:1:960: T__162
                {
                mT__162(); 

                }
                break;
            case 150 :
                // InternalEdilang.g:1:967: T__163
                {
                mT__163(); 

                }
                break;
            case 151 :
                // InternalEdilang.g:1:974: T__164
                {
                mT__164(); 

                }
                break;
            case 152 :
                // InternalEdilang.g:1:981: T__165
                {
                mT__165(); 

                }
                break;
            case 153 :
                // InternalEdilang.g:1:988: T__166
                {
                mT__166(); 

                }
                break;
            case 154 :
                // InternalEdilang.g:1:995: T__167
                {
                mT__167(); 

                }
                break;
            case 155 :
                // InternalEdilang.g:1:1002: T__168
                {
                mT__168(); 

                }
                break;
            case 156 :
                // InternalEdilang.g:1:1009: T__169
                {
                mT__169(); 

                }
                break;
            case 157 :
                // InternalEdilang.g:1:1016: T__170
                {
                mT__170(); 

                }
                break;
            case 158 :
                // InternalEdilang.g:1:1023: T__171
                {
                mT__171(); 

                }
                break;
            case 159 :
                // InternalEdilang.g:1:1030: T__172
                {
                mT__172(); 

                }
                break;
            case 160 :
                // InternalEdilang.g:1:1037: T__173
                {
                mT__173(); 

                }
                break;
            case 161 :
                // InternalEdilang.g:1:1044: T__174
                {
                mT__174(); 

                }
                break;
            case 162 :
                // InternalEdilang.g:1:1051: T__175
                {
                mT__175(); 

                }
                break;
            case 163 :
                // InternalEdilang.g:1:1058: T__176
                {
                mT__176(); 

                }
                break;
            case 164 :
                // InternalEdilang.g:1:1065: T__177
                {
                mT__177(); 

                }
                break;
            case 165 :
                // InternalEdilang.g:1:1072: T__178
                {
                mT__178(); 

                }
                break;
            case 166 :
                // InternalEdilang.g:1:1079: T__179
                {
                mT__179(); 

                }
                break;
            case 167 :
                // InternalEdilang.g:1:1086: T__180
                {
                mT__180(); 

                }
                break;
            case 168 :
                // InternalEdilang.g:1:1093: T__181
                {
                mT__181(); 

                }
                break;
            case 169 :
                // InternalEdilang.g:1:1100: T__182
                {
                mT__182(); 

                }
                break;
            case 170 :
                // InternalEdilang.g:1:1107: T__183
                {
                mT__183(); 

                }
                break;
            case 171 :
                // InternalEdilang.g:1:1114: T__184
                {
                mT__184(); 

                }
                break;
            case 172 :
                // InternalEdilang.g:1:1121: T__185
                {
                mT__185(); 

                }
                break;
            case 173 :
                // InternalEdilang.g:1:1128: RULE_QUOTE_AND_NL
                {
                mRULE_QUOTE_AND_NL(); 

                }
                break;
            case 174 :
                // InternalEdilang.g:1:1146: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 175 :
                // InternalEdilang.g:1:1156: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 176 :
                // InternalEdilang.g:1:1167: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 177 :
                // InternalEdilang.g:1:1176: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 178 :
                // InternalEdilang.g:1:1184: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 179 :
                // InternalEdilang.g:1:1196: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 180 :
                // InternalEdilang.g:1:1204: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 181 :
                // InternalEdilang.g:1:1220: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 182 :
                // InternalEdilang.g:1:1236: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\41\1\36\23\41\3\uffff\1\41\1\uffff\1\36\1\uffff\1\36\1\uffff\2\41\2\uffff\164\41\3\uffff\1\41\4\uffff\1\u014b\1\u014c\1\u014d\1\u014e\1\u014f\1\u0150\1\u0151\1\u0152\1\u0153\1\u0154\1\u0155\1\u0156\1\u0157\1\u0158\1\u0159\1\u015a\1\u015b\1\u015c\1\u015d\1\u015e\1\u015f\1\u0160\1\u0161\1\u0162\1\u0163\1\u0164\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\u016b\1\u016c\1\u016d\1\u016e\1\u016f\1\u0170\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\u017b\1\u017c\1\u017d\1\u017e\1\u017f\1\u0180\1\u0181\1\u0182\1\u0183\1\u0184\1\u0185\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\u018c\1\u018d\1\u018e\1\u018f\1\u0190\1\u0191\1\u0192\1\u0193\1\u0194\1\u0195\1\u0196\1\u0197\1\u0198\1\u0199\1\u019a\1\u019b\1\u019c\1\u019d\1\u019e\1\u019f\1\u01a0\1\u01a1\1\u01a2\1\u01a3\1\u01a4\1\u01a5\1\u01a6\1\u01a7\1\u01a8\1\u01a9\1\u01aa\1\u01ab\1\u01ac\1\u01ad\1\u01ae\1\u01af\1\u01b0\1\u01b1\1\u01b2\1\u01b3\1\u01b4\1\u01b5\1\u01b6\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\u01bd\1\u01be\1\u01bf\1\u01c0\1\u01c1\1\u01c2\1\u01c3\1\u01c4\1\u01c5\1\u01c6\1\u01c7\1\u01c8\1\u01c9\1\u01ca\1\u01cb\1\u01cc\1\u01cd\1\u01ce\1\u01cf\1\u01d0\1\u01d1\1\u01d2\1\u01d3\1\u01d4\1\u01d5\1\u01d6\1\u01d7\1\u01d8\1\u01d9\1\u01da\1\u01db\1\u01dc\1\u01dd\1\u01de\1\u01df\1\u01e0\1\u01e1\1\u01e2\1\u01e3\1\u01e4\1\u01e5\1\u01e6\1\u01e7\1\u01e8\1\u01e9\1\u01ea\1\u01eb\1\u01ec\1\u01ed\1\u01ee\1\u01ef\1\u01f0\1\u01f1\1\u01f2\1\u01f3\1\u01f4\1\u01f5\1\41\u00ab\uffff\14\41\1\u0203\1\uffff";
    static final String DFA10_eofS =
        "\u0204\uffff";
    static final String DFA10_minS =
        "\1\0\1\103\1\77\1\104\3\101\1\104\1\103\1\104\1\101\1\103\1\101\1\105\2\101\1\122\1\103\2\101\1\114\1\104\3\uffff\1\60\1\uffff\1\0\1\uffff\1\52\1\uffff\1\101\1\111\2\uffff\2\122\1\124\1\103\1\120\1\104\1\111\2\124\1\123\1\111\1\123\1\115\1\126\1\104\1\111\1\104\1\116\1\101\1\120\1\111\1\104\1\111\1\124\1\130\1\101\1\115\1\116\1\123\2\111\1\123\1\103\1\104\1\107\1\115\1\124\1\111\1\115\1\120\1\101\1\103\1\105\1\101\1\111\1\123\1\122\1\121\1\130\1\123\1\111\1\104\1\122\1\125\2\116\1\104\1\105\1\104\1\103\2\104\1\121\1\116\1\103\1\116\1\101\1\123\1\107\1\101\1\104\2\103\1\122\1\111\2\101\1\103\1\104\1\131\1\124\1\103\1\111\1\123\1\101\1\122\1\131\1\123\2\114\1\107\1\104\1\114\1\105\1\111\1\106\1\114\1\103\1\107\1\111\1\120\1\122\1\101\1\103\1\124\1\115\2\104\1\114\1\125\1\122\1\114\1\130\1\111\1\107\1\111\3\uffff\1\60\4\uffff\u00ab\40\1\60\u00ab\uffff\14\60\1\40\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\116\1\77\3\125\1\124\1\126\1\124\1\122\1\131\1\122\1\117\1\123\1\101\1\131\1\126\2\124\1\126\1\114\1\122\3\uffff\1\71\1\uffff\1\uffff\1\uffff\1\57\1\uffff\1\132\1\111\2\uffff\2\122\1\124\1\111\2\122\1\111\2\124\1\123\1\111\1\123\1\115\1\126\1\111\1\126\1\104\1\116\1\111\1\120\4\124\1\130\1\101\1\115\1\116\1\123\2\115\1\123\1\103\1\104\1\111\1\115\1\124\1\111\1\126\1\120\1\116\1\120\1\124\1\101\1\111\1\124\1\122\1\121\1\130\1\123\1\111\1\123\1\122\1\125\2\116\1\104\1\105\1\104\1\103\1\104\1\126\1\121\1\116\1\103\1\116\1\115\1\123\1\107\1\101\2\124\1\111\1\122\1\111\2\101\1\126\1\104\1\131\1\124\1\103\1\111\1\123\1\101\1\122\1\131\1\123\2\114\1\107\1\104\1\114\1\105\1\111\1\106\1\114\1\104\1\121\1\111\1\125\1\123\1\130\1\103\1\124\1\115\1\120\1\104\1\114\1\125\1\122\1\114\1\130\1\111\1\107\1\111\3\uffff\1\71\4\uffff\u00ab\172\1\71\u00ab\uffff\14\71\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\26\uffff\1\u00ad\1\u00ae\1\u00af\1\uffff\1\u00b1\1\uffff\1\u00b3\1\uffff\1\u00b6\2\uffff\1\u00b1\1\2\164\uffff\1\u00ad\1\u00ae\1\u00af\1\uffff\1\u00b2\1\u00b3\1\u00b4\1\u00b5\u00ac\uffff\1\1\1\3\1\4\1\5\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u0095\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\u00a2\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\u00a6\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\u009d\1\u00a7\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\u00a1\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\u00a5\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\u00a4\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\u009a\1\133\1\134\1\135\1\u0091\1\u0099\1\136\1\u00a0\1\137\1\140\1\141\1\u00a3\1\142\1\143\1\u00a8\1\144\1\145\1\146\1\147\1\150\1\151\1\u009b\1\152\1\153\1\154\1\u0093\1\u0096\1\155\1\156\1\157\1\u009c\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\u0098\1\u009f\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0097\1\u009e\1\u0090\1\u0092\1\u0094\15\uffff\1\u00b0";
    static final String DFA10_specialS =
        "\1\0\32\uffff\1\1\u01e8\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\36\2\34\2\36\1\34\24\36\1\33\4\36\1\26\2\36\2\27\2\36\1\2\1\35\12\31\1\30\6\36\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\32\1\14\1\15\1\16\1\25\1\17\1\20\1\21\1\22\1\23\1\1\1\24\4\32\6\36\32\32\3\36\1\26\uff81\36",
            "\1\40\12\uffff\1\37",
            "\1\42",
            "\1\43\2\uffff\1\44\2\uffff\1\45\1\uffff\1\46\3\uffff\1\47\1\uffff\1\50\1\51\1\52\1\53",
            "\1\54\5\uffff\1\57\1\uffff\1\55\13\uffff\1\56",
            "\1\60\1\uffff\1\61\1\62\1\63\3\uffff\1\64\2\uffff\1\65\1\66\1\67\1\70\1\71\2\uffff\1\72\1\74\1\73",
            "\1\75\4\uffff\1\76\1\77\1\uffff\1\100\2\uffff\1\101\1\102\1\uffff\1\103\2\uffff\1\104\1\105\1\106",
            "\1\107\1\uffff\1\110\5\uffff\1\111\1\112\3\uffff\1\113\1\114\3\uffff\1\115",
            "\1\116\5\uffff\1\117\4\uffff\1\120\1\121\3\uffff\1\122\1\123",
            "\1\124\1\125\3\uffff\1\126\5\uffff\1\127\2\uffff\1\130",
            "\1\131\27\uffff\1\132",
            "\1\133\1\134\1\uffff\1\135\1\uffff\1\136\4\uffff\1\137\1\140\3\uffff\1\141",
            "\1\142\7\uffff\1\144\5\uffff\1\143",
            "\1\145\5\uffff\1\146\3\uffff\1\150\3\uffff\1\147",
            "\1\151",
            "\1\152\1\uffff\1\153\1\165\1\154\1\uffff\1\155\1\uffff\1\156\4\uffff\1\157\1\164\2\uffff\1\160\1\161\1\162\4\uffff\1\163",
            "\1\166\1\uffff\1\171\1\167\1\170",
            "\1\172\1\uffff\1\173\1\u0082\3\uffff\1\174\3\uffff\1\175\1\176\1\u0081\2\uffff\1\177\1\u0080",
            "\1\u0083\1\uffff\1\u0084\1\uffff\1\u0085\1\u0086\1\u0087\10\uffff\1\u0088\3\uffff\1\u0089",
            "\1\u0093\1\uffff\1\u008a\1\u008b\1\u008c\7\uffff\1\u008d\1\uffff\1\u008e\1\u008f\1\uffff\1\u0090\1\u0091\2\uffff\1\u0092",
            "\1\u0094",
            "\1\u0096\15\uffff\1\u0095",
            "",
            "",
            "",
            "\12\u009a",
            "",
            "\0\u009b",
            "",
            "\1\u009d\4\uffff\1\u009e",
            "",
            "\1\u009f\1\u00a0\2\uffff\1\u00a6\1\uffff\1\u00a2\1\u00a1\12\uffff\1\u00a3\1\u00a4\5\uffff\1\u00a5",
            "\1\u00a7",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\5\uffff\1\u00ac",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00af\15\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\4\uffff\1\u00ba",
            "\1\u00bb\11\uffff\1\u00bc\2\uffff\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0\7\uffff\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\12\uffff\1\u00c4",
            "\1\u00c5\10\uffff\1\u00c6\6\uffff\1\u00c7",
            "\1\u00c8\11\uffff\1\u00c9\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1\3\uffff\1\u00d2",
            "\1\u00d3\3\uffff\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8\1\uffff\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd\7\uffff\1\u00de\1\u00df",
            "\1\u00e0",
            "\1\u00e1\2\uffff\1\u00e2\11\uffff\1\u00e3",
            "\1\u00e5\14\uffff\1\u00e4",
            "\1\u00e6\16\uffff\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1\11\uffff\1\u00f2\3\uffff\1\u00f3\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe\13\uffff\1\u00ff\5\uffff\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105\13\uffff\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010b\17\uffff\1\u010a",
            "\1\u010c\5\uffff\1\u010d\11\uffff\1\u010e\1\u010f",
            "\1\u0110\1\u0111\4\uffff\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117\5\uffff\1\u0119\14\uffff\1\u0118",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d\1\u012e",
            "\1\u012f\4\uffff\1\u0130\4\uffff\1\u0131",
            "\1\u0132",
            "\1\u0133\4\uffff\1\u0134",
            "\1\u0135\1\u0136",
            "\1\u0137\1\uffff\1\u0138\3\uffff\1\u0139\13\uffff\1\u013a\4\uffff\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f\13\uffff\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "",
            "",
            "",
            "\12\u014a",
            "",
            "",
            "",
            "",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\u01f6",
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
            "\12\u01f7",
            "\12\u01f8",
            "\12\u01f9",
            "\12\u01fa",
            "\12\u01fb",
            "\12\u01fc",
            "\12\u01fd",
            "\12\u01fe",
            "\12\u01ff",
            "\12\u0200",
            "\12\u0201",
            "\12\u0202",
            "\1\41\14\uffff\2\41\1\uffff\12\41\5\uffff\1\41\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | RULE_QUOTE_AND_NL | RULE_PLUS | RULE_COLON | RULE_INT | RULE_ID | RULE_STRING | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='U') ) {s = 1;}

                        else if ( (LA10_0=='.') ) {s = 2;}

                        else if ( (LA10_0=='A') ) {s = 3;}

                        else if ( (LA10_0=='B') ) {s = 4;}

                        else if ( (LA10_0=='C') ) {s = 5;}

                        else if ( (LA10_0=='D') ) {s = 6;}

                        else if ( (LA10_0=='E') ) {s = 7;}

                        else if ( (LA10_0=='F') ) {s = 8;}

                        else if ( (LA10_0=='G') ) {s = 9;}

                        else if ( (LA10_0=='H') ) {s = 10;}

                        else if ( (LA10_0=='I') ) {s = 11;}

                        else if ( (LA10_0=='L') ) {s = 12;}

                        else if ( (LA10_0=='M') ) {s = 13;}

                        else if ( (LA10_0=='N') ) {s = 14;}

                        else if ( (LA10_0=='P') ) {s = 15;}

                        else if ( (LA10_0=='Q') ) {s = 16;}

                        else if ( (LA10_0=='R') ) {s = 17;}

                        else if ( (LA10_0=='S') ) {s = 18;}

                        else if ( (LA10_0=='T') ) {s = 19;}

                        else if ( (LA10_0=='V') ) {s = 20;}

                        else if ( (LA10_0=='O') ) {s = 21;}

                        else if ( (LA10_0=='\''||LA10_0=='~') ) {s = 22;}

                        else if ( ((LA10_0>='*' && LA10_0<='+')) ) {s = 23;}

                        else if ( (LA10_0==':') ) {s = 24;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 25;}

                        else if ( ((LA10_0>='J' && LA10_0<='K')||(LA10_0>='W' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {s = 26;}

                        else if ( (LA10_0=='\"') ) {s = 27;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r') ) {s = 28;}

                        else if ( (LA10_0=='/') ) {s = 29;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='&')||(LA10_0>='(' && LA10_0<=')')||(LA10_0>=',' && LA10_0<='-')||(LA10_0>=';' && LA10_0<='@')||(LA10_0>='[' && LA10_0<='`')||(LA10_0>='{' && LA10_0<='}')||(LA10_0>='\u007F' && LA10_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_27 = input.LA(1);

                        s = -1;
                        if ( ((LA10_27>='\u0000' && LA10_27<='\uFFFF')) ) {s = 155;}

                        else s = 30;

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