package io.thlaegler.edifact.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import io.thlaegler.edifact.services.EdilangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEdilangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLON", "RULE_PLUS", "RULE_QUOTE_AND_NL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'UNA'", "'.?'", "'UNB'", "'UNH'", "'MSG'", "'ORG'", "'POC'", "'ODI'", "'UCI'", "'PDI'", "'TVL'", "'RPI'", "'MOA'", "'LIN'", "'PRI'", "'QTY'", "'CUX'", "'TAX'", "'RFF'", "'NAD'", "'DTM'", "'BGM'", "'PAT'", "'FTX'", "'ERC'", "'CNT'", "'CTA'", "'PCI'", "'UNS'", "'UNT'", "'UNZ'"
    };
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


        public InternalEdilangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEdilangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEdilangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEdilang.g"; }



     	private EdilangGrammarAccess grammarAccess;

        public InternalEdilangParser(TokenStream input, EdilangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EdiModel";
       	}

       	@Override
       	protected EdilangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEdiModel"
    // InternalEdilang.g:64:1: entryRuleEdiModel returns [EObject current=null] : iv_ruleEdiModel= ruleEdiModel EOF ;
    public final EObject entryRuleEdiModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdiModel = null;


        try {
            // InternalEdilang.g:64:49: (iv_ruleEdiModel= ruleEdiModel EOF )
            // InternalEdilang.g:65:2: iv_ruleEdiModel= ruleEdiModel EOF
            {
             newCompositeNode(grammarAccess.getEdiModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdiModel=ruleEdiModel();

            state._fsp--;

             current =iv_ruleEdiModel; 
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
    // $ANTLR end "entryRuleEdiModel"


    // $ANTLR start "ruleEdiModel"
    // InternalEdilang.g:71:1: ruleEdiModel returns [EObject current=null] : ( (lv_segments_0_0= ruleAbstractEdiSegment ) )* ;
    public final EObject ruleEdiModel() throws RecognitionException {
        EObject current = null;

        EObject lv_segments_0_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:77:2: ( ( (lv_segments_0_0= ruleAbstractEdiSegment ) )* )
            // InternalEdilang.g:78:2: ( (lv_segments_0_0= ruleAbstractEdiSegment ) )*
            {
            // InternalEdilang.g:78:2: ( (lv_segments_0_0= ruleAbstractEdiSegment ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=16 && LA1_0<=44)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEdilang.g:79:3: (lv_segments_0_0= ruleAbstractEdiSegment )
            	    {
            	    // InternalEdilang.g:79:3: (lv_segments_0_0= ruleAbstractEdiSegment )
            	    // InternalEdilang.g:80:4: lv_segments_0_0= ruleAbstractEdiSegment
            	    {

            	    				newCompositeNode(grammarAccess.getEdiModelAccess().getSegmentsAbstractEdiSegmentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_segments_0_0=ruleAbstractEdiSegment();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEdiModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"segments",
            	    					lv_segments_0_0,
            	    					"io.thlaegler.edifact.Edilang.AbstractEdiSegment");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleEdiModel"


    // $ANTLR start "entryRuleAbstractEdiSegment"
    // InternalEdilang.g:100:1: entryRuleAbstractEdiSegment returns [EObject current=null] : iv_ruleAbstractEdiSegment= ruleAbstractEdiSegment EOF ;
    public final EObject entryRuleAbstractEdiSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEdiSegment = null;


        try {
            // InternalEdilang.g:100:59: (iv_ruleAbstractEdiSegment= ruleAbstractEdiSegment EOF )
            // InternalEdilang.g:101:2: iv_ruleAbstractEdiSegment= ruleAbstractEdiSegment EOF
            {
             newCompositeNode(grammarAccess.getAbstractEdiSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractEdiSegment=ruleAbstractEdiSegment();

            state._fsp--;

             current =iv_ruleAbstractEdiSegment; 
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
    // $ANTLR end "entryRuleAbstractEdiSegment"


    // $ANTLR start "ruleAbstractEdiSegment"
    // InternalEdilang.g:107:1: ruleAbstractEdiSegment returns [EObject current=null] : (this_UNASegment_0= ruleUNASegment | this_UNBSegment_1= ruleUNBSegment | this_UNHSegment_2= ruleUNHSegment | this_MSGSegment_3= ruleMSGSegment | this_ORGSegment_4= ruleORGSegment | this_POCSegment_5= rulePOCSegment | this_ODISegment_6= ruleODISegment | this_UCISegment_7= ruleUCISegment | this_PDISegment_8= rulePDISegment | this_RPISegment_9= ruleRPISegment | this_TVLSegment_10= ruleTVLSegment | this_BGMSegment_11= ruleBGMSegment | this_DTMSegment_12= ruleDTMSegment | this_NADSegment_13= ruleNADSegment | this_RFFSegment_14= ruleRFFSegment | this_CUXSegment_15= ruleCUXSegment | this_TAXSegment_16= ruleTAXSegment | this_LINSegment_17= ruleLINSegment | this_QTYSegment_18= ruleQTYSegment | this_MOASegment_19= ruleMOASegment | this_PRISegment_20= rulePRISegment | this_PATSegment_21= rulePATSegment | this_PCISegment_22= rulePCISegment | this_CTASegment_23= ruleCTASegment | this_CNTSegment_24= ruleCNTSegment | this_FTXSegment_25= ruleFTXSegment | this_ERCSegment_26= ruleERCSegment | this_UNSSegment_27= ruleUNSSegment | this_UNZSegment_28= ruleUNZSegment | this_UNTSegment_29= ruleUNTSegment ) ;
    public final EObject ruleAbstractEdiSegment() throws RecognitionException {
        EObject current = null;

        EObject this_UNASegment_0 = null;

        EObject this_UNBSegment_1 = null;

        EObject this_UNHSegment_2 = null;

        EObject this_MSGSegment_3 = null;

        EObject this_ORGSegment_4 = null;

        EObject this_POCSegment_5 = null;

        EObject this_ODISegment_6 = null;

        EObject this_UCISegment_7 = null;

        EObject this_PDISegment_8 = null;

        EObject this_RPISegment_9 = null;

        EObject this_TVLSegment_10 = null;

        EObject this_BGMSegment_11 = null;

        EObject this_DTMSegment_12 = null;

        EObject this_NADSegment_13 = null;

        EObject this_RFFSegment_14 = null;

        EObject this_CUXSegment_15 = null;

        EObject this_TAXSegment_16 = null;

        EObject this_LINSegment_17 = null;

        EObject this_QTYSegment_18 = null;

        EObject this_MOASegment_19 = null;

        EObject this_PRISegment_20 = null;

        EObject this_PATSegment_21 = null;

        EObject this_PCISegment_22 = null;

        EObject this_CTASegment_23 = null;

        EObject this_CNTSegment_24 = null;

        EObject this_FTXSegment_25 = null;

        EObject this_ERCSegment_26 = null;

        EObject this_UNSSegment_27 = null;

        EObject this_UNZSegment_28 = null;

        EObject this_UNTSegment_29 = null;



        	enterRule();

        try {
            // InternalEdilang.g:113:2: ( (this_UNASegment_0= ruleUNASegment | this_UNBSegment_1= ruleUNBSegment | this_UNHSegment_2= ruleUNHSegment | this_MSGSegment_3= ruleMSGSegment | this_ORGSegment_4= ruleORGSegment | this_POCSegment_5= rulePOCSegment | this_ODISegment_6= ruleODISegment | this_UCISegment_7= ruleUCISegment | this_PDISegment_8= rulePDISegment | this_RPISegment_9= ruleRPISegment | this_TVLSegment_10= ruleTVLSegment | this_BGMSegment_11= ruleBGMSegment | this_DTMSegment_12= ruleDTMSegment | this_NADSegment_13= ruleNADSegment | this_RFFSegment_14= ruleRFFSegment | this_CUXSegment_15= ruleCUXSegment | this_TAXSegment_16= ruleTAXSegment | this_LINSegment_17= ruleLINSegment | this_QTYSegment_18= ruleQTYSegment | this_MOASegment_19= ruleMOASegment | this_PRISegment_20= rulePRISegment | this_PATSegment_21= rulePATSegment | this_PCISegment_22= rulePCISegment | this_CTASegment_23= ruleCTASegment | this_CNTSegment_24= ruleCNTSegment | this_FTXSegment_25= ruleFTXSegment | this_ERCSegment_26= ruleERCSegment | this_UNSSegment_27= ruleUNSSegment | this_UNZSegment_28= ruleUNZSegment | this_UNTSegment_29= ruleUNTSegment ) )
            // InternalEdilang.g:114:2: (this_UNASegment_0= ruleUNASegment | this_UNBSegment_1= ruleUNBSegment | this_UNHSegment_2= ruleUNHSegment | this_MSGSegment_3= ruleMSGSegment | this_ORGSegment_4= ruleORGSegment | this_POCSegment_5= rulePOCSegment | this_ODISegment_6= ruleODISegment | this_UCISegment_7= ruleUCISegment | this_PDISegment_8= rulePDISegment | this_RPISegment_9= ruleRPISegment | this_TVLSegment_10= ruleTVLSegment | this_BGMSegment_11= ruleBGMSegment | this_DTMSegment_12= ruleDTMSegment | this_NADSegment_13= ruleNADSegment | this_RFFSegment_14= ruleRFFSegment | this_CUXSegment_15= ruleCUXSegment | this_TAXSegment_16= ruleTAXSegment | this_LINSegment_17= ruleLINSegment | this_QTYSegment_18= ruleQTYSegment | this_MOASegment_19= ruleMOASegment | this_PRISegment_20= rulePRISegment | this_PATSegment_21= rulePATSegment | this_PCISegment_22= rulePCISegment | this_CTASegment_23= ruleCTASegment | this_CNTSegment_24= ruleCNTSegment | this_FTXSegment_25= ruleFTXSegment | this_ERCSegment_26= ruleERCSegment | this_UNSSegment_27= ruleUNSSegment | this_UNZSegment_28= ruleUNZSegment | this_UNTSegment_29= ruleUNTSegment )
            {
            // InternalEdilang.g:114:2: (this_UNASegment_0= ruleUNASegment | this_UNBSegment_1= ruleUNBSegment | this_UNHSegment_2= ruleUNHSegment | this_MSGSegment_3= ruleMSGSegment | this_ORGSegment_4= ruleORGSegment | this_POCSegment_5= rulePOCSegment | this_ODISegment_6= ruleODISegment | this_UCISegment_7= ruleUCISegment | this_PDISegment_8= rulePDISegment | this_RPISegment_9= ruleRPISegment | this_TVLSegment_10= ruleTVLSegment | this_BGMSegment_11= ruleBGMSegment | this_DTMSegment_12= ruleDTMSegment | this_NADSegment_13= ruleNADSegment | this_RFFSegment_14= ruleRFFSegment | this_CUXSegment_15= ruleCUXSegment | this_TAXSegment_16= ruleTAXSegment | this_LINSegment_17= ruleLINSegment | this_QTYSegment_18= ruleQTYSegment | this_MOASegment_19= ruleMOASegment | this_PRISegment_20= rulePRISegment | this_PATSegment_21= rulePATSegment | this_PCISegment_22= rulePCISegment | this_CTASegment_23= ruleCTASegment | this_CNTSegment_24= ruleCNTSegment | this_FTXSegment_25= ruleFTXSegment | this_ERCSegment_26= ruleERCSegment | this_UNSSegment_27= ruleUNSSegment | this_UNZSegment_28= ruleUNZSegment | this_UNTSegment_29= ruleUNTSegment )
            int alt2=30;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            case 20:
                {
                alt2=6;
                }
                break;
            case 21:
                {
                alt2=7;
                }
                break;
            case 22:
                {
                alt2=8;
                }
                break;
            case 23:
                {
                alt2=9;
                }
                break;
            case 25:
                {
                alt2=10;
                }
                break;
            case 24:
                {
                alt2=11;
                }
                break;
            case 35:
                {
                alt2=12;
                }
                break;
            case 34:
                {
                alt2=13;
                }
                break;
            case 33:
                {
                alt2=14;
                }
                break;
            case 32:
                {
                alt2=15;
                }
                break;
            case 30:
                {
                alt2=16;
                }
                break;
            case 31:
                {
                alt2=17;
                }
                break;
            case 27:
                {
                alt2=18;
                }
                break;
            case 29:
                {
                alt2=19;
                }
                break;
            case 26:
                {
                alt2=20;
                }
                break;
            case 28:
                {
                alt2=21;
                }
                break;
            case 36:
                {
                alt2=22;
                }
                break;
            case 41:
                {
                alt2=23;
                }
                break;
            case 40:
                {
                alt2=24;
                }
                break;
            case 39:
                {
                alt2=25;
                }
                break;
            case 37:
                {
                alt2=26;
                }
                break;
            case 38:
                {
                alt2=27;
                }
                break;
            case 42:
                {
                alt2=28;
                }
                break;
            case 44:
                {
                alt2=29;
                }
                break;
            case 43:
                {
                alt2=30;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEdilang.g:115:3: this_UNASegment_0= ruleUNASegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getUNASegmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UNASegment_0=ruleUNASegment();

                    state._fsp--;


                    			current = this_UNASegment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEdilang.g:124:3: this_UNBSegment_1= ruleUNBSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getUNBSegmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UNBSegment_1=ruleUNBSegment();

                    state._fsp--;


                    			current = this_UNBSegment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEdilang.g:133:3: this_UNHSegment_2= ruleUNHSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getUNHSegmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UNHSegment_2=ruleUNHSegment();

                    state._fsp--;


                    			current = this_UNHSegment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEdilang.g:142:3: this_MSGSegment_3= ruleMSGSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getMSGSegmentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MSGSegment_3=ruleMSGSegment();

                    state._fsp--;


                    			current = this_MSGSegment_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEdilang.g:151:3: this_ORGSegment_4= ruleORGSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getORGSegmentParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ORGSegment_4=ruleORGSegment();

                    state._fsp--;


                    			current = this_ORGSegment_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEdilang.g:160:3: this_POCSegment_5= rulePOCSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getPOCSegmentParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_POCSegment_5=rulePOCSegment();

                    state._fsp--;


                    			current = this_POCSegment_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalEdilang.g:169:3: this_ODISegment_6= ruleODISegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getODISegmentParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ODISegment_6=ruleODISegment();

                    state._fsp--;


                    			current = this_ODISegment_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalEdilang.g:178:3: this_UCISegment_7= ruleUCISegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getUCISegmentParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_UCISegment_7=ruleUCISegment();

                    state._fsp--;


                    			current = this_UCISegment_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalEdilang.g:187:3: this_PDISegment_8= rulePDISegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getPDISegmentParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_PDISegment_8=rulePDISegment();

                    state._fsp--;


                    			current = this_PDISegment_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalEdilang.g:196:3: this_RPISegment_9= ruleRPISegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getRPISegmentParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RPISegment_9=ruleRPISegment();

                    state._fsp--;


                    			current = this_RPISegment_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalEdilang.g:205:3: this_TVLSegment_10= ruleTVLSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getTVLSegmentParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TVLSegment_10=ruleTVLSegment();

                    state._fsp--;


                    			current = this_TVLSegment_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalEdilang.g:214:3: this_BGMSegment_11= ruleBGMSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getBGMSegmentParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_BGMSegment_11=ruleBGMSegment();

                    state._fsp--;


                    			current = this_BGMSegment_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalEdilang.g:223:3: this_DTMSegment_12= ruleDTMSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getDTMSegmentParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DTMSegment_12=ruleDTMSegment();

                    state._fsp--;


                    			current = this_DTMSegment_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalEdilang.g:232:3: this_NADSegment_13= ruleNADSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getNADSegmentParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_NADSegment_13=ruleNADSegment();

                    state._fsp--;


                    			current = this_NADSegment_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalEdilang.g:241:3: this_RFFSegment_14= ruleRFFSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getRFFSegmentParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_RFFSegment_14=ruleRFFSegment();

                    state._fsp--;


                    			current = this_RFFSegment_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalEdilang.g:250:3: this_CUXSegment_15= ruleCUXSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getCUXSegmentParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_CUXSegment_15=ruleCUXSegment();

                    state._fsp--;


                    			current = this_CUXSegment_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalEdilang.g:259:3: this_TAXSegment_16= ruleTAXSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getTAXSegmentParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_TAXSegment_16=ruleTAXSegment();

                    state._fsp--;


                    			current = this_TAXSegment_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalEdilang.g:268:3: this_LINSegment_17= ruleLINSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getLINSegmentParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_LINSegment_17=ruleLINSegment();

                    state._fsp--;


                    			current = this_LINSegment_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalEdilang.g:277:3: this_QTYSegment_18= ruleQTYSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getQTYSegmentParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_QTYSegment_18=ruleQTYSegment();

                    state._fsp--;


                    			current = this_QTYSegment_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalEdilang.g:286:3: this_MOASegment_19= ruleMOASegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getMOASegmentParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_MOASegment_19=ruleMOASegment();

                    state._fsp--;


                    			current = this_MOASegment_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalEdilang.g:295:3: this_PRISegment_20= rulePRISegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getPRISegmentParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_PRISegment_20=rulePRISegment();

                    state._fsp--;


                    			current = this_PRISegment_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalEdilang.g:304:3: this_PATSegment_21= rulePATSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getPATSegmentParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_PATSegment_21=rulePATSegment();

                    state._fsp--;


                    			current = this_PATSegment_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalEdilang.g:313:3: this_PCISegment_22= rulePCISegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getPCISegmentParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_PCISegment_22=rulePCISegment();

                    state._fsp--;


                    			current = this_PCISegment_22;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 24 :
                    // InternalEdilang.g:322:3: this_CTASegment_23= ruleCTASegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getCTASegmentParserRuleCall_23());
                    		
                    pushFollow(FOLLOW_2);
                    this_CTASegment_23=ruleCTASegment();

                    state._fsp--;


                    			current = this_CTASegment_23;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 25 :
                    // InternalEdilang.g:331:3: this_CNTSegment_24= ruleCNTSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getCNTSegmentParserRuleCall_24());
                    		
                    pushFollow(FOLLOW_2);
                    this_CNTSegment_24=ruleCNTSegment();

                    state._fsp--;


                    			current = this_CNTSegment_24;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 26 :
                    // InternalEdilang.g:340:3: this_FTXSegment_25= ruleFTXSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getFTXSegmentParserRuleCall_25());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTXSegment_25=ruleFTXSegment();

                    state._fsp--;


                    			current = this_FTXSegment_25;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 27 :
                    // InternalEdilang.g:349:3: this_ERCSegment_26= ruleERCSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getERCSegmentParserRuleCall_26());
                    		
                    pushFollow(FOLLOW_2);
                    this_ERCSegment_26=ruleERCSegment();

                    state._fsp--;


                    			current = this_ERCSegment_26;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 28 :
                    // InternalEdilang.g:358:3: this_UNSSegment_27= ruleUNSSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getUNSSegmentParserRuleCall_27());
                    		
                    pushFollow(FOLLOW_2);
                    this_UNSSegment_27=ruleUNSSegment();

                    state._fsp--;


                    			current = this_UNSSegment_27;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 29 :
                    // InternalEdilang.g:367:3: this_UNZSegment_28= ruleUNZSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getUNZSegmentParserRuleCall_28());
                    		
                    pushFollow(FOLLOW_2);
                    this_UNZSegment_28=ruleUNZSegment();

                    state._fsp--;


                    			current = this_UNZSegment_28;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 30 :
                    // InternalEdilang.g:376:3: this_UNTSegment_29= ruleUNTSegment
                    {

                    			newCompositeNode(grammarAccess.getAbstractEdiSegmentAccess().getUNTSegmentParserRuleCall_29());
                    		
                    pushFollow(FOLLOW_2);
                    this_UNTSegment_29=ruleUNTSegment();

                    state._fsp--;


                    			current = this_UNTSegment_29;
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
    // $ANTLR end "ruleAbstractEdiSegment"


    // $ANTLR start "entryRuleUNASegment"
    // InternalEdilang.g:388:1: entryRuleUNASegment returns [EObject current=null] : iv_ruleUNASegment= ruleUNASegment EOF ;
    public final EObject entryRuleUNASegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNASegment = null;


        try {
            // InternalEdilang.g:388:51: (iv_ruleUNASegment= ruleUNASegment EOF )
            // InternalEdilang.g:389:2: iv_ruleUNASegment= ruleUNASegment EOF
            {
             newCompositeNode(grammarAccess.getUNASegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNASegment=ruleUNASegment();

            state._fsp--;

             current =iv_ruleUNASegment; 
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
    // $ANTLR end "entryRuleUNASegment"


    // $ANTLR start "ruleUNASegment"
    // InternalEdilang.g:395:1: ruleUNASegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNA' ) ) this_COLON_1= RULE_COLON this_PLUS_2= RULE_PLUS otherlv_3= '.?' ( (lv_lineEnd_4_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleUNASegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_COLON_1=null;
        Token this_PLUS_2=null;
        Token otherlv_3=null;
        Token lv_lineEnd_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:401:2: ( ( ( (lv_segment_0_0= 'UNA' ) ) this_COLON_1= RULE_COLON this_PLUS_2= RULE_PLUS otherlv_3= '.?' ( (lv_lineEnd_4_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:402:2: ( ( (lv_segment_0_0= 'UNA' ) ) this_COLON_1= RULE_COLON this_PLUS_2= RULE_PLUS otherlv_3= '.?' ( (lv_lineEnd_4_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:402:2: ( ( (lv_segment_0_0= 'UNA' ) ) this_COLON_1= RULE_COLON this_PLUS_2= RULE_PLUS otherlv_3= '.?' ( (lv_lineEnd_4_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:403:3: ( (lv_segment_0_0= 'UNA' ) ) this_COLON_1= RULE_COLON this_PLUS_2= RULE_PLUS otherlv_3= '.?' ( (lv_lineEnd_4_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:403:3: ( (lv_segment_0_0= 'UNA' ) )
            // InternalEdilang.g:404:4: (lv_segment_0_0= 'UNA' )
            {
            // InternalEdilang.g:404:4: (lv_segment_0_0= 'UNA' )
            // InternalEdilang.g:405:5: lv_segment_0_0= 'UNA'
            {
            lv_segment_0_0=(Token)match(input,14,FOLLOW_4); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getUNASegmentAccess().getSegmentUNAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNASegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "UNA");
            				

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_1, grammarAccess.getUNASegmentAccess().getCOLONTerminalRuleCall_1());
            		
            this_PLUS_2=(Token)match(input,RULE_PLUS,FOLLOW_6); 

            			newLeafNode(this_PLUS_2, grammarAccess.getUNASegmentAccess().getPLUSTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getUNASegmentAccess().getFullStopQuestionMarkKeyword_3());
            		
            // InternalEdilang.g:429:3: ( (lv_lineEnd_4_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:430:4: (lv_lineEnd_4_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:430:4: (lv_lineEnd_4_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:431:5: lv_lineEnd_4_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_4_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_4_0, grammarAccess.getUNASegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNASegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_4_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleUNASegment"


    // $ANTLR start "entryRuleUNBSegment"
    // InternalEdilang.g:451:1: entryRuleUNBSegment returns [EObject current=null] : iv_ruleUNBSegment= ruleUNBSegment EOF ;
    public final EObject entryRuleUNBSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNBSegment = null;


        try {
            // InternalEdilang.g:451:51: (iv_ruleUNBSegment= ruleUNBSegment EOF )
            // InternalEdilang.g:452:2: iv_ruleUNBSegment= ruleUNBSegment EOF
            {
             newCompositeNode(grammarAccess.getUNBSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNBSegment=ruleUNBSegment();

            state._fsp--;

             current =iv_ruleUNBSegment; 
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
    // $ANTLR end "entryRuleUNBSegment"


    // $ANTLR start "ruleUNBSegment"
    // InternalEdilang.g:458:1: ruleUNBSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_syntax_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_num1_4_0= RULE_ID ) )? )? this_PLUS_5= RULE_PLUS ( (lv_interchangeSender_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_interchangeRecipient_8_0= ruleInterchangerFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_dateAndTime_10_0= ruleDateAndTimeFunction ) )? this_PLUS_11= RULE_PLUS ( (lv_interchangeControlSenderRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_interchangeControlRecipientRef_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_fse_16_0= RULE_ID ) )? (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleUNBSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_syntax_2_0=null;
        Token this_COLON_3=null;
        Token lv_num1_4_0=null;
        Token this_PLUS_5=null;
        Token this_PLUS_7=null;
        Token this_PLUS_9=null;
        Token this_PLUS_11=null;
        Token lv_interchangeControlSenderRef_12_0=null;
        Token this_PLUS_13=null;
        Token lv_interchangeControlRecipientRef_14_0=null;
        Token this_PLUS_15=null;
        Token lv_fse_16_0=null;
        Token this_PLUS_17=null;
        Token lv_assiciationCode_18_0=null;
        Token lv_lineEnd_19_0=null;
        EObject lv_interchangeSender_6_0 = null;

        EObject lv_interchangeRecipient_8_0 = null;

        EObject lv_dateAndTime_10_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:464:2: ( ( ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_syntax_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_num1_4_0= RULE_ID ) )? )? this_PLUS_5= RULE_PLUS ( (lv_interchangeSender_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_interchangeRecipient_8_0= ruleInterchangerFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_dateAndTime_10_0= ruleDateAndTimeFunction ) )? this_PLUS_11= RULE_PLUS ( (lv_interchangeControlSenderRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_interchangeControlRecipientRef_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_fse_16_0= RULE_ID ) )? (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:465:2: ( ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_syntax_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_num1_4_0= RULE_ID ) )? )? this_PLUS_5= RULE_PLUS ( (lv_interchangeSender_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_interchangeRecipient_8_0= ruleInterchangerFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_dateAndTime_10_0= ruleDateAndTimeFunction ) )? this_PLUS_11= RULE_PLUS ( (lv_interchangeControlSenderRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_interchangeControlRecipientRef_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_fse_16_0= RULE_ID ) )? (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:465:2: ( ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_syntax_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_num1_4_0= RULE_ID ) )? )? this_PLUS_5= RULE_PLUS ( (lv_interchangeSender_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_interchangeRecipient_8_0= ruleInterchangerFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_dateAndTime_10_0= ruleDateAndTimeFunction ) )? this_PLUS_11= RULE_PLUS ( (lv_interchangeControlSenderRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_interchangeControlRecipientRef_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_fse_16_0= RULE_ID ) )? (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:466:3: ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_syntax_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_num1_4_0= RULE_ID ) )? )? this_PLUS_5= RULE_PLUS ( (lv_interchangeSender_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_interchangeRecipient_8_0= ruleInterchangerFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_dateAndTime_10_0= ruleDateAndTimeFunction ) )? this_PLUS_11= RULE_PLUS ( (lv_interchangeControlSenderRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_interchangeControlRecipientRef_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_fse_16_0= RULE_ID ) )? (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:466:3: ( (lv_segment_0_0= 'UNB' ) )
            // InternalEdilang.g:467:4: (lv_segment_0_0= 'UNB' )
            {
            // InternalEdilang.g:467:4: (lv_segment_0_0= 'UNB' )
            // InternalEdilang.g:468:5: lv_segment_0_0= 'UNB'
            {
            lv_segment_0_0=(Token)match(input,16,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getUNBSegmentAccess().getSegmentUNBKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNBSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "UNB");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_8); 

            			newLeafNode(this_PLUS_1, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:484:3: ( ( (lv_syntax_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_num1_4_0= RULE_ID ) )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COLON||LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEdilang.g:485:4: ( (lv_syntax_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_num1_4_0= RULE_ID ) )?
                    {
                    // InternalEdilang.g:485:4: ( (lv_syntax_2_0= RULE_ID ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_ID) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalEdilang.g:486:5: (lv_syntax_2_0= RULE_ID )
                            {
                            // InternalEdilang.g:486:5: (lv_syntax_2_0= RULE_ID )
                            // InternalEdilang.g:487:6: lv_syntax_2_0= RULE_ID
                            {
                            lv_syntax_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                            						newLeafNode(lv_syntax_2_0, grammarAccess.getUNBSegmentAccess().getSyntaxIDTerminalRuleCall_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getUNBSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"syntax",
                            							lv_syntax_2_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_9); 

                    				newLeafNode(this_COLON_3, grammarAccess.getUNBSegmentAccess().getCOLONTerminalRuleCall_2_1());
                    			
                    // InternalEdilang.g:507:4: ( (lv_num1_4_0= RULE_ID ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalEdilang.g:508:5: (lv_num1_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:508:5: (lv_num1_4_0= RULE_ID )
                            // InternalEdilang.g:509:6: lv_num1_4_0= RULE_ID
                            {
                            lv_num1_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                            						newLeafNode(lv_num1_4_0, grammarAccess.getUNBSegmentAccess().getNum1IDTerminalRuleCall_2_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getUNBSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"num1",
                            							lv_num1_4_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_5, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:530:3: ( (lv_interchangeSender_6_0= ruleInterchangerFunction ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEdilang.g:531:4: (lv_interchangeSender_6_0= ruleInterchangerFunction )
                    {
                    // InternalEdilang.g:531:4: (lv_interchangeSender_6_0= ruleInterchangerFunction )
                    // InternalEdilang.g:532:5: lv_interchangeSender_6_0= ruleInterchangerFunction
                    {

                    					newCompositeNode(grammarAccess.getUNBSegmentAccess().getInterchangeSenderInterchangerFunctionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_interchangeSender_6_0=ruleInterchangerFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUNBSegmentRule());
                    					}
                    					set(
                    						current,
                    						"interchangeSender",
                    						lv_interchangeSender_6_0,
                    						"io.thlaegler.edifact.Edilang.InterchangerFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_7, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:553:3: ( (lv_interchangeRecipient_8_0= ruleInterchangerFunction ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEdilang.g:554:4: (lv_interchangeRecipient_8_0= ruleInterchangerFunction )
                    {
                    // InternalEdilang.g:554:4: (lv_interchangeRecipient_8_0= ruleInterchangerFunction )
                    // InternalEdilang.g:555:5: lv_interchangeRecipient_8_0= ruleInterchangerFunction
                    {

                    					newCompositeNode(grammarAccess.getUNBSegmentAccess().getInterchangeRecipientInterchangerFunctionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_interchangeRecipient_8_0=ruleInterchangerFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUNBSegmentRule());
                    					}
                    					set(
                    						current,
                    						"interchangeRecipient",
                    						lv_interchangeRecipient_8_0,
                    						"io.thlaegler.edifact.Edilang.InterchangerFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_9, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_7());
            		
            // InternalEdilang.g:576:3: ( (lv_dateAndTime_10_0= ruleDateAndTimeFunction ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEdilang.g:577:4: (lv_dateAndTime_10_0= ruleDateAndTimeFunction )
                    {
                    // InternalEdilang.g:577:4: (lv_dateAndTime_10_0= ruleDateAndTimeFunction )
                    // InternalEdilang.g:578:5: lv_dateAndTime_10_0= ruleDateAndTimeFunction
                    {

                    					newCompositeNode(grammarAccess.getUNBSegmentAccess().getDateAndTimeDateAndTimeFunctionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_dateAndTime_10_0=ruleDateAndTimeFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUNBSegmentRule());
                    					}
                    					add(
                    						current,
                    						"dateAndTime",
                    						lv_dateAndTime_10_0,
                    						"io.thlaegler.edifact.Edilang.DateAndTimeFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_11=(Token)match(input,RULE_PLUS,FOLLOW_10); 

            			newLeafNode(this_PLUS_11, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_9());
            		
            // InternalEdilang.g:599:3: ( (lv_interchangeControlSenderRef_12_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEdilang.g:600:4: (lv_interchangeControlSenderRef_12_0= RULE_ID )
                    {
                    // InternalEdilang.g:600:4: (lv_interchangeControlSenderRef_12_0= RULE_ID )
                    // InternalEdilang.g:601:5: lv_interchangeControlSenderRef_12_0= RULE_ID
                    {
                    lv_interchangeControlSenderRef_12_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(lv_interchangeControlSenderRef_12_0, grammarAccess.getUNBSegmentAccess().getInterchangeControlSenderRefIDTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUNBSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"interchangeControlSenderRef",
                    						lv_interchangeControlSenderRef_12_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:617:3: (this_PLUS_13= RULE_PLUS ( (lv_interchangeControlRecipientRef_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_fse_16_0= RULE_ID ) )? (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )? )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_PLUS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEdilang.g:618:4: this_PLUS_13= RULE_PLUS ( (lv_interchangeControlRecipientRef_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_fse_16_0= RULE_ID ) )? (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )? )?
                    {
                    this_PLUS_13=(Token)match(input,RULE_PLUS,FOLLOW_10); 

                    				newLeafNode(this_PLUS_13, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_11_0());
                    			
                    // InternalEdilang.g:622:4: ( (lv_interchangeControlRecipientRef_14_0= RULE_ID ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalEdilang.g:623:5: (lv_interchangeControlRecipientRef_14_0= RULE_ID )
                            {
                            // InternalEdilang.g:623:5: (lv_interchangeControlRecipientRef_14_0= RULE_ID )
                            // InternalEdilang.g:624:6: lv_interchangeControlRecipientRef_14_0= RULE_ID
                            {
                            lv_interchangeControlRecipientRef_14_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                            						newLeafNode(lv_interchangeControlRecipientRef_14_0, grammarAccess.getUNBSegmentAccess().getInterchangeControlRecipientRefIDTerminalRuleCall_11_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getUNBSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"interchangeControlRecipientRef",
                            							lv_interchangeControlRecipientRef_14_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    // InternalEdilang.g:640:4: (this_PLUS_15= RULE_PLUS ( (lv_fse_16_0= RULE_ID ) )? (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_PLUS) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEdilang.g:641:5: this_PLUS_15= RULE_PLUS ( (lv_fse_16_0= RULE_ID ) )? (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )?
                            {
                            this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_10); 

                            					newLeafNode(this_PLUS_15, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_11_2_0());
                            				
                            // InternalEdilang.g:645:5: ( (lv_fse_16_0= RULE_ID ) )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==RULE_ID) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalEdilang.g:646:6: (lv_fse_16_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:646:6: (lv_fse_16_0= RULE_ID )
                                    // InternalEdilang.g:647:7: lv_fse_16_0= RULE_ID
                                    {
                                    lv_fse_16_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                                    							newLeafNode(lv_fse_16_0, grammarAccess.getUNBSegmentAccess().getFseIDTerminalRuleCall_11_2_1_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getUNBSegmentRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"fse",
                                    								lv_fse_16_0,
                                    								"io.thlaegler.edifact.Edilang.ID");
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalEdilang.g:663:5: (this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )? )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==RULE_PLUS) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalEdilang.g:664:6: this_PLUS_17= RULE_PLUS ( (lv_assiciationCode_18_0= RULE_ID ) )?
                                    {
                                    this_PLUS_17=(Token)match(input,RULE_PLUS,FOLLOW_12); 

                                    						newLeafNode(this_PLUS_17, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_11_2_2_0());
                                    					
                                    // InternalEdilang.g:668:6: ( (lv_assiciationCode_18_0= RULE_ID ) )?
                                    int alt12=2;
                                    int LA12_0 = input.LA(1);

                                    if ( (LA12_0==RULE_ID) ) {
                                        alt12=1;
                                    }
                                    switch (alt12) {
                                        case 1 :
                                            // InternalEdilang.g:669:7: (lv_assiciationCode_18_0= RULE_ID )
                                            {
                                            // InternalEdilang.g:669:7: (lv_assiciationCode_18_0= RULE_ID )
                                            // InternalEdilang.g:670:8: lv_assiciationCode_18_0= RULE_ID
                                            {
                                            lv_assiciationCode_18_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                                            								newLeafNode(lv_assiciationCode_18_0, grammarAccess.getUNBSegmentAccess().getAssiciationCodeIDTerminalRuleCall_11_2_2_1_0());
                                            							

                                            								if (current==null) {
                                            									current = createModelElement(grammarAccess.getUNBSegmentRule());
                                            								}
                                            								setWithLastConsumed(
                                            									current,
                                            									"assiciationCode",
                                            									lv_assiciationCode_18_0,
                                            									"io.thlaegler.edifact.Edilang.ID");
                                            							

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:689:3: ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:690:4: (lv_lineEnd_19_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:690:4: (lv_lineEnd_19_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:691:5: lv_lineEnd_19_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_19_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_19_0, grammarAccess.getUNBSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNBSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_19_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleUNBSegment"


    // $ANTLR start "entryRuleUNHSegment"
    // InternalEdilang.g:711:1: entryRuleUNHSegment returns [EObject current=null] : iv_ruleUNHSegment= ruleUNHSegment EOF ;
    public final EObject entryRuleUNHSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNHSegment = null;


        try {
            // InternalEdilang.g:711:51: (iv_ruleUNHSegment= ruleUNHSegment EOF )
            // InternalEdilang.g:712:2: iv_ruleUNHSegment= ruleUNHSegment EOF
            {
             newCompositeNode(grammarAccess.getUNHSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNHSegment=ruleUNHSegment();

            state._fsp--;

             current =iv_ruleUNHSegment; 
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
    // $ANTLR end "entryRuleUNHSegment"


    // $ANTLR start "ruleUNHSegment"
    // InternalEdilang.g:718:1: ruleUNHSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleUNHSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_messageReferenceNumber_2_0=null;
        Token this_PLUS_3=null;
        Token this_PLUS_5=null;
        Token lv_commonAccessReference_6_0=null;
        Token lv_lineEnd_7_0=null;
        EObject lv_message_4_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:724:2: ( ( ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:725:2: ( ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:725:2: ( ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:726:3: ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:726:3: ( (lv_segment_0_0= 'UNH' ) )
            // InternalEdilang.g:727:4: (lv_segment_0_0= 'UNH' )
            {
            // InternalEdilang.g:727:4: (lv_segment_0_0= 'UNH' )
            // InternalEdilang.g:728:5: lv_segment_0_0= 'UNH'
            {
            lv_segment_0_0=(Token)match(input,17,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getUNHSegmentAccess().getSegmentUNHKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNHSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "UNH");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getUNHSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:744:3: ( (lv_messageReferenceNumber_2_0= RULE_ID ) )
            // InternalEdilang.g:745:4: (lv_messageReferenceNumber_2_0= RULE_ID )
            {
            // InternalEdilang.g:745:4: (lv_messageReferenceNumber_2_0= RULE_ID )
            // InternalEdilang.g:746:5: lv_messageReferenceNumber_2_0= RULE_ID
            {
            lv_messageReferenceNumber_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_messageReferenceNumber_2_0, grammarAccess.getUNHSegmentAccess().getMessageReferenceNumberIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNHSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"messageReferenceNumber",
            						lv_messageReferenceNumber_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_3, grammarAccess.getUNHSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:766:3: ( (lv_message_4_0= ruleMessageBodyFunction ) )
            // InternalEdilang.g:767:4: (lv_message_4_0= ruleMessageBodyFunction )
            {
            // InternalEdilang.g:767:4: (lv_message_4_0= ruleMessageBodyFunction )
            // InternalEdilang.g:768:5: lv_message_4_0= ruleMessageBodyFunction
            {

            					newCompositeNode(grammarAccess.getUNHSegmentAccess().getMessageMessageBodyFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_message_4_0=ruleMessageBodyFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUNHSegmentRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_4_0,
            						"io.thlaegler.edifact.Edilang.MessageBodyFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdilang.g:785:3: (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_PLUS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEdilang.g:786:4: this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) )
                    {
                    this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_5, grammarAccess.getUNHSegmentAccess().getPLUSTerminalRuleCall_5_0());
                    			
                    // InternalEdilang.g:790:4: ( (lv_commonAccessReference_6_0= RULE_ID ) )
                    // InternalEdilang.g:791:5: (lv_commonAccessReference_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:791:5: (lv_commonAccessReference_6_0= RULE_ID )
                    // InternalEdilang.g:792:6: lv_commonAccessReference_6_0= RULE_ID
                    {
                    lv_commonAccessReference_6_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_commonAccessReference_6_0, grammarAccess.getUNHSegmentAccess().getCommonAccessReferenceIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUNHSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"commonAccessReference",
                    							lv_commonAccessReference_6_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEdilang.g:809:3: ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:810:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:810:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:811:5: lv_lineEnd_7_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_7_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_7_0, grammarAccess.getUNHSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNHSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_7_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleUNHSegment"


    // $ANTLR start "entryRuleMSGSegment"
    // InternalEdilang.g:831:1: entryRuleMSGSegment returns [EObject current=null] : iv_ruleMSGSegment= ruleMSGSegment EOF ;
    public final EObject entryRuleMSGSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMSGSegment = null;


        try {
            // InternalEdilang.g:831:51: (iv_ruleMSGSegment= ruleMSGSegment EOF )
            // InternalEdilang.g:832:2: iv_ruleMSGSegment= ruleMSGSegment EOF
            {
             newCompositeNode(grammarAccess.getMSGSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMSGSegment=ruleMSGSegment();

            state._fsp--;

             current =iv_ruleMSGSegment; 
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
    // $ANTLR end "entryRuleMSGSegment"


    // $ANTLR start "ruleMSGSegment"
    // InternalEdilang.g:838:1: ruleMSGSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageFunction_2_0= ruleMSGFunction ) )? (this_PLUS_3= RULE_PLUS ( (lv_responseType_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleMSGSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token this_PLUS_3=null;
        Token lv_responseType_4_0=null;
        Token lv_lineEnd_5_0=null;
        EObject lv_messageFunction_2_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:844:2: ( ( ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageFunction_2_0= ruleMSGFunction ) )? (this_PLUS_3= RULE_PLUS ( (lv_responseType_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:845:2: ( ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageFunction_2_0= ruleMSGFunction ) )? (this_PLUS_3= RULE_PLUS ( (lv_responseType_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:845:2: ( ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageFunction_2_0= ruleMSGFunction ) )? (this_PLUS_3= RULE_PLUS ( (lv_responseType_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:846:3: ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageFunction_2_0= ruleMSGFunction ) )? (this_PLUS_3= RULE_PLUS ( (lv_responseType_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:846:3: ( (lv_segment_0_0= 'MSG' ) )
            // InternalEdilang.g:847:4: (lv_segment_0_0= 'MSG' )
            {
            // InternalEdilang.g:847:4: (lv_segment_0_0= 'MSG' )
            // InternalEdilang.g:848:5: lv_segment_0_0= 'MSG'
            {
            lv_segment_0_0=(Token)match(input,18,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getMSGSegmentAccess().getSegmentMSGKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMSGSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "MSG");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_14); 

            			newLeafNode(this_PLUS_1, grammarAccess.getMSGSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:864:3: ( (lv_messageFunction_2_0= ruleMSGFunction ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_COLON||LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEdilang.g:865:4: (lv_messageFunction_2_0= ruleMSGFunction )
                    {
                    // InternalEdilang.g:865:4: (lv_messageFunction_2_0= ruleMSGFunction )
                    // InternalEdilang.g:866:5: lv_messageFunction_2_0= ruleMSGFunction
                    {

                    					newCompositeNode(grammarAccess.getMSGSegmentAccess().getMessageFunctionMSGFunctionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_messageFunction_2_0=ruleMSGFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMSGSegmentRule());
                    					}
                    					set(
                    						current,
                    						"messageFunction",
                    						lv_messageFunction_2_0,
                    						"io.thlaegler.edifact.Edilang.MSGFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:883:3: (this_PLUS_3= RULE_PLUS ( (lv_responseType_4_0= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_PLUS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEdilang.g:884:4: this_PLUS_3= RULE_PLUS ( (lv_responseType_4_0= RULE_ID ) )
                    {
                    this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_3, grammarAccess.getMSGSegmentAccess().getPLUSTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:888:4: ( (lv_responseType_4_0= RULE_ID ) )
                    // InternalEdilang.g:889:5: (lv_responseType_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:889:5: (lv_responseType_4_0= RULE_ID )
                    // InternalEdilang.g:890:6: lv_responseType_4_0= RULE_ID
                    {
                    lv_responseType_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_responseType_4_0, grammarAccess.getMSGSegmentAccess().getResponseTypeIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMSGSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"responseType",
                    							lv_responseType_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEdilang.g:907:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:908:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:908:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:909:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getMSGSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMSGSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleMSGSegment"


    // $ANTLR start "entryRuleORGSegment"
    // InternalEdilang.g:929:1: entryRuleORGSegment returns [EObject current=null] : iv_ruleORGSegment= ruleORGSegment EOF ;
    public final EObject entryRuleORGSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORGSegment = null;


        try {
            // InternalEdilang.g:929:51: (iv_ruleORGSegment= ruleORGSegment EOF )
            // InternalEdilang.g:930:2: iv_ruleORGSegment= ruleORGSegment EOF
            {
             newCompositeNode(grammarAccess.getORGSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORGSegment=ruleORGSegment();

            state._fsp--;

             current =iv_ruleORGSegment; 
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
    // $ANTLR end "entryRuleORGSegment"


    // $ANTLR start "ruleORGSegment"
    // InternalEdilang.g:936:1: ruleORGSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleORGSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token this_PLUS_3=null;
        Token this_PLUS_5=null;
        Token this_PLUS_7=null;
        Token this_PLUS_9=null;
        Token lv_originatorTypeCode_10_0=null;
        Token this_PLUS_11=null;
        Token this_PLUS_13=null;
        Token lv_originatorsAuthorityRequestCode_14_0=null;
        Token this_PLUS_15=null;
        Token lv_communicationNumber_16_0=null;
        Token this_PLUS_17=null;
        Token lv_partyIdIdentification_18_0=null;
        Token lv_lineEnd_19_0=null;
        EObject lv_systemDetail1_2_0 = null;

        EObject lv_originatorIdentification_4_0 = null;

        EObject lv_location_6_0 = null;

        EObject lv_systemDetail2_8_0 = null;

        EObject lv_originator_12_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:942:2: ( ( ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:943:2: ( ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:943:2: ( ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:944:3: ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:944:3: ( (lv_segment_0_0= 'ORG' ) )
            // InternalEdilang.g:945:4: (lv_segment_0_0= 'ORG' )
            {
            // InternalEdilang.g:945:4: (lv_segment_0_0= 'ORG' )
            // InternalEdilang.g:946:5: lv_segment_0_0= 'ORG'
            {
            lv_segment_0_0=(Token)match(input,19,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getORGSegmentAccess().getSegmentORGKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getORGSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "ORG");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_1, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:962:3: ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEdilang.g:963:4: (lv_systemDetail1_2_0= ruleSystemDetailFunction )
                    {
                    // InternalEdilang.g:963:4: (lv_systemDetail1_2_0= ruleSystemDetailFunction )
                    // InternalEdilang.g:964:5: lv_systemDetail1_2_0= ruleSystemDetailFunction
                    {

                    					newCompositeNode(grammarAccess.getORGSegmentAccess().getSystemDetail1SystemDetailFunctionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_systemDetail1_2_0=ruleSystemDetailFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getORGSegmentRule());
                    					}
                    					set(
                    						current,
                    						"systemDetail1",
                    						lv_systemDetail1_2_0,
                    						"io.thlaegler.edifact.Edilang.SystemDetailFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_3, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:985:3: ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEdilang.g:986:4: (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction )
                    {
                    // InternalEdilang.g:986:4: (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction )
                    // InternalEdilang.g:987:5: lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction
                    {

                    					newCompositeNode(grammarAccess.getORGSegmentAccess().getOriginatorIdentificationOriginatorIdentificationFunctionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_originatorIdentification_4_0=ruleOriginatorIdentificationFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getORGSegmentRule());
                    					}
                    					set(
                    						current,
                    						"originatorIdentification",
                    						lv_originatorIdentification_4_0,
                    						"io.thlaegler.edifact.Edilang.OriginatorIdentificationFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_5, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:1008:3: ( (lv_location_6_0= ruleLocationFunction ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEdilang.g:1009:4: (lv_location_6_0= ruleLocationFunction )
                    {
                    // InternalEdilang.g:1009:4: (lv_location_6_0= ruleLocationFunction )
                    // InternalEdilang.g:1010:5: lv_location_6_0= ruleLocationFunction
                    {

                    					newCompositeNode(grammarAccess.getORGSegmentAccess().getLocationLocationFunctionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_location_6_0=ruleLocationFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getORGSegmentRule());
                    					}
                    					set(
                    						current,
                    						"location",
                    						lv_location_6_0,
                    						"io.thlaegler.edifact.Edilang.LocationFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_7, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_7());
            		
            // InternalEdilang.g:1031:3: ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEdilang.g:1032:4: (lv_systemDetail2_8_0= ruleSystemDetailFunction )
                    {
                    // InternalEdilang.g:1032:4: (lv_systemDetail2_8_0= ruleSystemDetailFunction )
                    // InternalEdilang.g:1033:5: lv_systemDetail2_8_0= ruleSystemDetailFunction
                    {

                    					newCompositeNode(grammarAccess.getORGSegmentAccess().getSystemDetail2SystemDetailFunctionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_systemDetail2_8_0=ruleSystemDetailFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getORGSegmentRule());
                    					}
                    					set(
                    						current,
                    						"systemDetail2",
                    						lv_systemDetail2_8_0,
                    						"io.thlaegler.edifact.Edilang.SystemDetailFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_9, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_9());
            		
            // InternalEdilang.g:1054:3: ( (lv_originatorTypeCode_10_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEdilang.g:1055:4: (lv_originatorTypeCode_10_0= RULE_ID )
                    {
                    // InternalEdilang.g:1055:4: (lv_originatorTypeCode_10_0= RULE_ID )
                    // InternalEdilang.g:1056:5: lv_originatorTypeCode_10_0= RULE_ID
                    {
                    lv_originatorTypeCode_10_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_originatorTypeCode_10_0, grammarAccess.getORGSegmentAccess().getOriginatorTypeCodeIDTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getORGSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"originatorTypeCode",
                    						lv_originatorTypeCode_10_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_11=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_11, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_11());
            		
            // InternalEdilang.g:1076:3: ( (lv_originator_12_0= ruleOriginatorFunction ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEdilang.g:1077:4: (lv_originator_12_0= ruleOriginatorFunction )
                    {
                    // InternalEdilang.g:1077:4: (lv_originator_12_0= ruleOriginatorFunction )
                    // InternalEdilang.g:1078:5: lv_originator_12_0= ruleOriginatorFunction
                    {

                    					newCompositeNode(grammarAccess.getORGSegmentAccess().getOriginatorOriginatorFunctionParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_originator_12_0=ruleOriginatorFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getORGSegmentRule());
                    					}
                    					set(
                    						current,
                    						"originator",
                    						lv_originator_12_0,
                    						"io.thlaegler.edifact.Edilang.OriginatorFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_13=(Token)match(input,RULE_PLUS,FOLLOW_10); 

            			newLeafNode(this_PLUS_13, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_13());
            		
            // InternalEdilang.g:1099:3: ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEdilang.g:1100:4: (lv_originatorsAuthorityRequestCode_14_0= RULE_ID )
                    {
                    // InternalEdilang.g:1100:4: (lv_originatorsAuthorityRequestCode_14_0= RULE_ID )
                    // InternalEdilang.g:1101:5: lv_originatorsAuthorityRequestCode_14_0= RULE_ID
                    {
                    lv_originatorsAuthorityRequestCode_14_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(lv_originatorsAuthorityRequestCode_14_0, grammarAccess.getORGSegmentAccess().getOriginatorsAuthorityRequestCodeIDTerminalRuleCall_14_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getORGSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"originatorsAuthorityRequestCode",
                    						lv_originatorsAuthorityRequestCode_14_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:1117:3: (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_PLUS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEdilang.g:1118:4: this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )?
                    {
                    this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_15, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_15_0());
                    			
                    // InternalEdilang.g:1122:4: ( (lv_communicationNumber_16_0= RULE_ID ) )
                    // InternalEdilang.g:1123:5: (lv_communicationNumber_16_0= RULE_ID )
                    {
                    // InternalEdilang.g:1123:5: (lv_communicationNumber_16_0= RULE_ID )
                    // InternalEdilang.g:1124:6: lv_communicationNumber_16_0= RULE_ID
                    {
                    lv_communicationNumber_16_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_communicationNumber_16_0, grammarAccess.getORGSegmentAccess().getCommunicationNumberIDTerminalRuleCall_15_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getORGSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"communicationNumber",
                    							lv_communicationNumber_16_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:1140:4: (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_PLUS) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalEdilang.g:1141:5: this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) )
                            {
                            this_PLUS_17=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                            					newLeafNode(this_PLUS_17, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_15_2_0());
                            				
                            // InternalEdilang.g:1145:5: ( (lv_partyIdIdentification_18_0= RULE_ID ) )
                            // InternalEdilang.g:1146:6: (lv_partyIdIdentification_18_0= RULE_ID )
                            {
                            // InternalEdilang.g:1146:6: (lv_partyIdIdentification_18_0= RULE_ID )
                            // InternalEdilang.g:1147:7: lv_partyIdIdentification_18_0= RULE_ID
                            {
                            lv_partyIdIdentification_18_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                            							newLeafNode(lv_partyIdIdentification_18_0, grammarAccess.getORGSegmentAccess().getPartyIdIdentificationIDTerminalRuleCall_15_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getORGSegmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"partyIdIdentification",
                            								lv_partyIdIdentification_18_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:1165:3: ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1166:4: (lv_lineEnd_19_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1166:4: (lv_lineEnd_19_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1167:5: lv_lineEnd_19_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_19_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_19_0, grammarAccess.getORGSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getORGSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_19_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleORGSegment"


    // $ANTLR start "entryRulePOCSegment"
    // InternalEdilang.g:1187:1: entryRulePOCSegment returns [EObject current=null] : iv_rulePOCSegment= rulePOCSegment EOF ;
    public final EObject entryRulePOCSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOCSegment = null;


        try {
            // InternalEdilang.g:1187:51: (iv_rulePOCSegment= rulePOCSegment EOF )
            // InternalEdilang.g:1188:2: iv_rulePOCSegment= rulePOCSegment EOF
            {
             newCompositeNode(grammarAccess.getPOCSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePOCSegment=rulePOCSegment();

            state._fsp--;

             current =iv_rulePOCSegment; 
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
    // $ANTLR end "entryRulePOCSegment"


    // $ANTLR start "rulePOCSegment"
    // InternalEdilang.g:1194:1: rulePOCSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject rulePOCSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_location_2_0=null;
        Token this_PLUS_3=null;
        Token lv_departureDate_4_0=null;
        Token this_PLUS_5=null;
        Token lv_departureTime_6_0=null;
        Token lv_lineEnd_7_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:1200:2: ( ( ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1201:2: ( ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1201:2: ( ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1202:3: ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1202:3: ( (lv_segment_0_0= 'POC' ) )
            // InternalEdilang.g:1203:4: (lv_segment_0_0= 'POC' )
            {
            // InternalEdilang.g:1203:4: (lv_segment_0_0= 'POC' )
            // InternalEdilang.g:1204:5: lv_segment_0_0= 'POC'
            {
            lv_segment_0_0=(Token)match(input,20,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getPOCSegmentAccess().getSegmentPOCKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPOCSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "POC");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_1, grammarAccess.getPOCSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:1220:3: ( (lv_location_2_0= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEdilang.g:1221:4: (lv_location_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:1221:4: (lv_location_2_0= RULE_ID )
                    // InternalEdilang.g:1222:5: lv_location_2_0= RULE_ID
                    {
                    lv_location_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_location_2_0, grammarAccess.getPOCSegmentAccess().getLocationIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPOCSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"location",
                    						lv_location_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_10); 

            			newLeafNode(this_PLUS_3, grammarAccess.getPOCSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:1242:3: ( (lv_departureDate_4_0= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEdilang.g:1243:4: (lv_departureDate_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:1243:4: (lv_departureDate_4_0= RULE_ID )
                    // InternalEdilang.g:1244:5: lv_departureDate_4_0= RULE_ID
                    {
                    lv_departureDate_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(lv_departureDate_4_0, grammarAccess.getPOCSegmentAccess().getDepartureDateIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPOCSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"departureDate",
                    						lv_departureDate_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:1260:3: (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_PLUS) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEdilang.g:1261:4: this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) )
                    {
                    this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_5, grammarAccess.getPOCSegmentAccess().getPLUSTerminalRuleCall_5_0());
                    			
                    // InternalEdilang.g:1265:4: ( (lv_departureTime_6_0= RULE_ID ) )
                    // InternalEdilang.g:1266:5: (lv_departureTime_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:1266:5: (lv_departureTime_6_0= RULE_ID )
                    // InternalEdilang.g:1267:6: lv_departureTime_6_0= RULE_ID
                    {
                    lv_departureTime_6_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_departureTime_6_0, grammarAccess.getPOCSegmentAccess().getDepartureTimeIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPOCSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"departureTime",
                    							lv_departureTime_6_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEdilang.g:1284:3: ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1285:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1285:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1286:5: lv_lineEnd_7_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_7_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_7_0, grammarAccess.getPOCSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPOCSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_7_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "rulePOCSegment"


    // $ANTLR start "entryRuleODISegment"
    // InternalEdilang.g:1306:1: entryRuleODISegment returns [EObject current=null] : iv_ruleODISegment= ruleODISegment EOF ;
    public final EObject entryRuleODISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleODISegment = null;


        try {
            // InternalEdilang.g:1306:51: (iv_ruleODISegment= ruleODISegment EOF )
            // InternalEdilang.g:1307:2: iv_ruleODISegment= ruleODISegment EOF
            {
             newCompositeNode(grammarAccess.getODISegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleODISegment=ruleODISegment();

            state._fsp--;

             current =iv_ruleODISegment; 
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
    // $ANTLR end "entryRuleODISegment"


    // $ANTLR start "ruleODISegment"
    // InternalEdilang.g:1313:1: ruleODISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleODISegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_origin_2_0=null;
        Token this_PLUS_3=null;
        Token lv_destination_4_0=null;
        Token lv_lineEnd_5_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:1319:2: ( ( ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1320:2: ( ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1320:2: ( ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1321:3: ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1321:3: ( (lv_segment_0_0= 'ODI' ) )
            // InternalEdilang.g:1322:4: (lv_segment_0_0= 'ODI' )
            {
            // InternalEdilang.g:1322:4: (lv_segment_0_0= 'ODI' )
            // InternalEdilang.g:1323:5: lv_segment_0_0= 'ODI'
            {
            lv_segment_0_0=(Token)match(input,21,FOLLOW_11); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getODISegmentAccess().getSegmentODIKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getODISegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "ODI");
            				

            }


            }

            // InternalEdilang.g:1335:3: (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_PLUS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEdilang.g:1336:4: this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )?
                    {
                    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

                    				newLeafNode(this_PLUS_1, grammarAccess.getODISegmentAccess().getPLUSTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:1340:4: ( (lv_origin_2_0= RULE_ID ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalEdilang.g:1341:5: (lv_origin_2_0= RULE_ID )
                            {
                            // InternalEdilang.g:1341:5: (lv_origin_2_0= RULE_ID )
                            // InternalEdilang.g:1342:6: lv_origin_2_0= RULE_ID
                            {
                            lv_origin_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                            						newLeafNode(lv_origin_2_0, grammarAccess.getODISegmentAccess().getOriginIDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getODISegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"origin",
                            							lv_origin_2_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_12); 

                    				newLeafNode(this_PLUS_3, grammarAccess.getODISegmentAccess().getPLUSTerminalRuleCall_1_2());
                    			
                    // InternalEdilang.g:1362:4: ( (lv_destination_4_0= RULE_ID ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalEdilang.g:1363:5: (lv_destination_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:1363:5: (lv_destination_4_0= RULE_ID )
                            // InternalEdilang.g:1364:6: lv_destination_4_0= RULE_ID
                            {
                            lv_destination_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                            						newLeafNode(lv_destination_4_0, grammarAccess.getODISegmentAccess().getDestinationIDTerminalRuleCall_1_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getODISegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"destination",
                            							lv_destination_4_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:1381:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1382:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1382:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1383:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getODISegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getODISegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleODISegment"


    // $ANTLR start "entryRuleUCISegment"
    // InternalEdilang.g:1403:1: entryRuleUCISegment returns [EObject current=null] : iv_ruleUCISegment= ruleUCISegment EOF ;
    public final EObject entryRuleUCISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUCISegment = null;


        try {
            // InternalEdilang.g:1403:51: (iv_ruleUCISegment= ruleUCISegment EOF )
            // InternalEdilang.g:1404:2: iv_ruleUCISegment= ruleUCISegment EOF
            {
             newCompositeNode(grammarAccess.getUCISegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUCISegment=ruleUCISegment();

            state._fsp--;

             current =iv_ruleUCISegment; 
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
    // $ANTLR end "entryRuleUCISegment"


    // $ANTLR start "ruleUCISegment"
    // InternalEdilang.g:1410:1: ruleUCISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleUCISegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_interchangeControlReference_2_0=null;
        Token this_PLUS_3=null;
        Token lv_interchangeSender_4_0=null;
        Token this_PLUS_5=null;
        Token lv_interchangeRecipient_6_0=null;
        Token this_PLUS_7=null;
        Token lv_action_8_0=null;
        Token this_PLUS_9=null;
        Token lv_syntaxErrorCode_10_0=null;
        Token this_PLUS_11=null;
        Token lv_segmentTagCode_12_0=null;
        Token lv_lineEnd_13_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:1416:2: ( ( ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1417:2: ( ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1417:2: ( ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1418:3: ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1418:3: ( (lv_segment_0_0= 'UCI' ) )
            // InternalEdilang.g:1419:4: (lv_segment_0_0= 'UCI' )
            {
            // InternalEdilang.g:1419:4: (lv_segment_0_0= 'UCI' )
            // InternalEdilang.g:1420:5: lv_segment_0_0= 'UCI'
            {
            lv_segment_0_0=(Token)match(input,22,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getUCISegmentAccess().getSegmentUCIKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUCISegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "UCI");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_1, grammarAccess.getUCISegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:1436:3: ( (lv_interchangeControlReference_2_0= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEdilang.g:1437:4: (lv_interchangeControlReference_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:1437:4: (lv_interchangeControlReference_2_0= RULE_ID )
                    // InternalEdilang.g:1438:5: lv_interchangeControlReference_2_0= RULE_ID
                    {
                    lv_interchangeControlReference_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_interchangeControlReference_2_0, grammarAccess.getUCISegmentAccess().getInterchangeControlReferenceIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUCISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"interchangeControlReference",
                    						lv_interchangeControlReference_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_3, grammarAccess.getUCISegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:1458:3: ( (lv_interchangeSender_4_0= RULE_ID ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEdilang.g:1459:4: (lv_interchangeSender_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:1459:4: (lv_interchangeSender_4_0= RULE_ID )
                    // InternalEdilang.g:1460:5: lv_interchangeSender_4_0= RULE_ID
                    {
                    lv_interchangeSender_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_interchangeSender_4_0, grammarAccess.getUCISegmentAccess().getInterchangeSenderIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUCISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"interchangeSender",
                    						lv_interchangeSender_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_5, grammarAccess.getUCISegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:1480:3: ( (lv_interchangeRecipient_6_0= RULE_ID ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEdilang.g:1481:4: (lv_interchangeRecipient_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:1481:4: (lv_interchangeRecipient_6_0= RULE_ID )
                    // InternalEdilang.g:1482:5: lv_interchangeRecipient_6_0= RULE_ID
                    {
                    lv_interchangeRecipient_6_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_interchangeRecipient_6_0, grammarAccess.getUCISegmentAccess().getInterchangeRecipientIDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUCISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"interchangeRecipient",
                    						lv_interchangeRecipient_6_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_7, grammarAccess.getUCISegmentAccess().getPLUSTerminalRuleCall_7());
            		
            // InternalEdilang.g:1502:3: ( (lv_action_8_0= RULE_ID ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEdilang.g:1503:4: (lv_action_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:1503:4: (lv_action_8_0= RULE_ID )
                    // InternalEdilang.g:1504:5: lv_action_8_0= RULE_ID
                    {
                    lv_action_8_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_action_8_0, grammarAccess.getUCISegmentAccess().getActionIDTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUCISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"action",
                    						lv_action_8_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_9, grammarAccess.getUCISegmentAccess().getPLUSTerminalRuleCall_9());
            		
            // InternalEdilang.g:1524:3: ( (lv_syntaxErrorCode_10_0= RULE_ID ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEdilang.g:1525:4: (lv_syntaxErrorCode_10_0= RULE_ID )
                    {
                    // InternalEdilang.g:1525:4: (lv_syntaxErrorCode_10_0= RULE_ID )
                    // InternalEdilang.g:1526:5: lv_syntaxErrorCode_10_0= RULE_ID
                    {
                    lv_syntaxErrorCode_10_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_syntaxErrorCode_10_0, grammarAccess.getUCISegmentAccess().getSyntaxErrorCodeIDTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUCISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"syntaxErrorCode",
                    						lv_syntaxErrorCode_10_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_11=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_11, grammarAccess.getUCISegmentAccess().getPLUSTerminalRuleCall_11());
            		
            // InternalEdilang.g:1546:3: ( (lv_segmentTagCode_12_0= RULE_ID ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalEdilang.g:1547:4: (lv_segmentTagCode_12_0= RULE_ID )
                    {
                    // InternalEdilang.g:1547:4: (lv_segmentTagCode_12_0= RULE_ID )
                    // InternalEdilang.g:1548:5: lv_segmentTagCode_12_0= RULE_ID
                    {
                    lv_segmentTagCode_12_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_segmentTagCode_12_0, grammarAccess.getUCISegmentAccess().getSegmentTagCodeIDTerminalRuleCall_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUCISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"segmentTagCode",
                    						lv_segmentTagCode_12_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:1564:3: ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1565:4: (lv_lineEnd_13_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1565:4: (lv_lineEnd_13_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1566:5: lv_lineEnd_13_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_13_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_13_0, grammarAccess.getUCISegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUCISegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_13_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleUCISegment"


    // $ANTLR start "entryRulePDISegment"
    // InternalEdilang.g:1586:1: entryRulePDISegment returns [EObject current=null] : iv_rulePDISegment= rulePDISegment EOF ;
    public final EObject entryRulePDISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDISegment = null;


        try {
            // InternalEdilang.g:1586:51: (iv_rulePDISegment= rulePDISegment EOF )
            // InternalEdilang.g:1587:2: iv_rulePDISegment= rulePDISegment EOF
            {
             newCompositeNode(grammarAccess.getPDISegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePDISegment=rulePDISegment();

            state._fsp--;

             current =iv_rulePDISegment; 
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
    // $ANTLR end "entryRulePDISegment"


    // $ANTLR start "rulePDISegment"
    // InternalEdilang.g:1593:1: rulePDISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject rulePDISegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_productDetailsQualifier_2_0=null;
        Token this_PLUS_3=null;
        Token lv_lineEnd_5_0=null;
        EObject lv_products_4_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:1599:2: ( ( ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1600:2: ( ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1600:2: ( ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1601:3: ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1601:3: ( (lv_segment_0_0= 'PDI' ) )
            // InternalEdilang.g:1602:4: (lv_segment_0_0= 'PDI' )
            {
            // InternalEdilang.g:1602:4: (lv_segment_0_0= 'PDI' )
            // InternalEdilang.g:1603:5: lv_segment_0_0= 'PDI'
            {
            lv_segment_0_0=(Token)match(input,23,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getPDISegmentAccess().getSegmentPDIKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPDISegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "PDI");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_10); 

            			newLeafNode(this_PLUS_1, grammarAccess.getPDISegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:1619:3: ( (lv_productDetailsQualifier_2_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEdilang.g:1620:4: (lv_productDetailsQualifier_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:1620:4: (lv_productDetailsQualifier_2_0= RULE_ID )
                    // InternalEdilang.g:1621:5: lv_productDetailsQualifier_2_0= RULE_ID
                    {
                    lv_productDetailsQualifier_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(lv_productDetailsQualifier_2_0, grammarAccess.getPDISegmentAccess().getProductDetailsQualifierIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPDISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"productDetailsQualifier",
                    						lv_productDetailsQualifier_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:1637:3: (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_PLUS) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalEdilang.g:1638:4: this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) )
            	    {
            	    this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            	    				newLeafNode(this_PLUS_3, grammarAccess.getPDISegmentAccess().getPLUSTerminalRuleCall_3_0());
            	    			
            	    // InternalEdilang.g:1642:4: ( (lv_products_4_0= ruleProductFunction ) )
            	    // InternalEdilang.g:1643:5: (lv_products_4_0= ruleProductFunction )
            	    {
            	    // InternalEdilang.g:1643:5: (lv_products_4_0= ruleProductFunction )
            	    // InternalEdilang.g:1644:6: lv_products_4_0= ruleProductFunction
            	    {

            	    						newCompositeNode(grammarAccess.getPDISegmentAccess().getProductsProductFunctionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_products_4_0=ruleProductFunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPDISegmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"products",
            	    							lv_products_4_0,
            	    							"io.thlaegler.edifact.Edilang.ProductFunction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalEdilang.g:1662:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1663:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1663:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1664:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getPDISegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPDISegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "rulePDISegment"


    // $ANTLR start "entryRuleTVLSegment"
    // InternalEdilang.g:1684:1: entryRuleTVLSegment returns [EObject current=null] : iv_ruleTVLSegment= ruleTVLSegment EOF ;
    public final EObject entryRuleTVLSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTVLSegment = null;


        try {
            // InternalEdilang.g:1684:51: (iv_ruleTVLSegment= ruleTVLSegment EOF )
            // InternalEdilang.g:1685:2: iv_ruleTVLSegment= ruleTVLSegment EOF
            {
             newCompositeNode(grammarAccess.getTVLSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTVLSegment=ruleTVLSegment();

            state._fsp--;

             current =iv_ruleTVLSegment; 
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
    // $ANTLR end "entryRuleTVLSegment"


    // $ANTLR start "ruleTVLSegment"
    // InternalEdilang.g:1691:1: ruleTVLSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleTVLSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token this_COLON_4=null;
        Token this_PLUS_6=null;
        Token lv_originCode_7_0=null;
        Token this_PLUS_8=null;
        Token lv_destinationCode_9_0=null;
        Token this_PLUS_10=null;
        Token lv_carrierId_11_0=null;
        Token this_PLUS_12=null;
        Token lv_productId_13_0=null;
        Token this_COLON_14=null;
        Token lv_characteristicId_15_0=null;
        Token this_COLON_16=null;
        Token lv_productIdCharacteristic_17_0=null;
        Token this_COLON_18=null;
        Token lv_descriptionIds_19_0=null;
        Token this_PLUS_20=null;
        Token lv_productType_21_0=null;
        Token this_PLUS_22=null;
        Token lv_lineItemNumber_23_0=null;
        Token this_PLUS_24=null;
        Token lv_processingIndicatorCode_25_0=null;
        Token lv_lineEnd_26_0=null;
        EObject lv_dateAndTime_2_0 = null;

        EObject lv_dateAndTime_3_0 = null;

        EObject lv_dateAndTime_5_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:1697:2: ( ( ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1698:2: ( ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1698:2: ( ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1699:3: ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1699:3: ( (lv_segment_0_0= 'TVL' ) )
            // InternalEdilang.g:1700:4: (lv_segment_0_0= 'TVL' )
            {
            // InternalEdilang.g:1700:4: (lv_segment_0_0= 'TVL' )
            // InternalEdilang.g:1701:5: lv_segment_0_0= 'TVL'
            {
            lv_segment_0_0=(Token)match(input,24,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getTVLSegmentAccess().getSegmentTVLKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTVLSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "TVL");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:1717:3: ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_PLUS) ) {
                    alt43=1;
                }
                else if ( (LA43_1==RULE_COLON) ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalEdilang.g:1718:4: ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) )
                    {
                    // InternalEdilang.g:1718:4: ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) )
                    // InternalEdilang.g:1719:5: (lv_dateAndTime_2_0= ruleDateOnlyFunction )
                    {
                    // InternalEdilang.g:1719:5: (lv_dateAndTime_2_0= ruleDateOnlyFunction )
                    // InternalEdilang.g:1720:6: lv_dateAndTime_2_0= ruleDateOnlyFunction
                    {

                    						newCompositeNode(grammarAccess.getTVLSegmentAccess().getDateAndTimeDateOnlyFunctionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_dateAndTime_2_0=ruleDateOnlyFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTVLSegmentRule());
                    						}
                    						add(
                    							current,
                    							"dateAndTime",
                    							lv_dateAndTime_2_0,
                    							"io.thlaegler.edifact.Edilang.DateOnlyFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEdilang.g:1738:4: ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* )
                    {
                    // InternalEdilang.g:1738:4: ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* )
                    // InternalEdilang.g:1739:5: ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )*
                    {
                    // InternalEdilang.g:1739:5: ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) )
                    // InternalEdilang.g:1740:6: (lv_dateAndTime_3_0= ruleDateAndTimeFunction )
                    {
                    // InternalEdilang.g:1740:6: (lv_dateAndTime_3_0= ruleDateAndTimeFunction )
                    // InternalEdilang.g:1741:7: lv_dateAndTime_3_0= ruleDateAndTimeFunction
                    {

                    							newCompositeNode(grammarAccess.getTVLSegmentAccess().getDateAndTimeDateAndTimeFunctionParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_dateAndTime_3_0=ruleDateAndTimeFunction();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTVLSegmentRule());
                    							}
                    							add(
                    								current,
                    								"dateAndTime",
                    								lv_dateAndTime_3_0,
                    								"io.thlaegler.edifact.Edilang.DateAndTimeFunction");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalEdilang.g:1758:5: (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_COLON) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalEdilang.g:1759:6: this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) )
                    	    {
                    	    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    	    						newLeafNode(this_COLON_4, grammarAccess.getTVLSegmentAccess().getCOLONTerminalRuleCall_2_1_1_0());
                    	    					
                    	    // InternalEdilang.g:1763:6: ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) )
                    	    // InternalEdilang.g:1764:7: (lv_dateAndTime_5_0= ruleDateAndTimeFunction )
                    	    {
                    	    // InternalEdilang.g:1764:7: (lv_dateAndTime_5_0= ruleDateAndTimeFunction )
                    	    // InternalEdilang.g:1765:8: lv_dateAndTime_5_0= ruleDateAndTimeFunction
                    	    {

                    	    								newCompositeNode(grammarAccess.getTVLSegmentAccess().getDateAndTimeDateAndTimeFunctionParserRuleCall_2_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_15);
                    	    lv_dateAndTime_5_0=ruleDateAndTimeFunction();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTVLSegmentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"dateAndTime",
                    	    									lv_dateAndTime_5_0,
                    	    									"io.thlaegler.edifact.Edilang.DateAndTimeFunction");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            this_PLUS_6=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_6, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:1789:3: ( (lv_originCode_7_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEdilang.g:1790:4: (lv_originCode_7_0= RULE_ID )
                    {
                    // InternalEdilang.g:1790:4: (lv_originCode_7_0= RULE_ID )
                    // InternalEdilang.g:1791:5: lv_originCode_7_0= RULE_ID
                    {
                    lv_originCode_7_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_originCode_7_0, grammarAccess.getTVLSegmentAccess().getOriginCodeIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTVLSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"originCode",
                    						lv_originCode_7_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_8, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:1811:3: ( (lv_destinationCode_9_0= RULE_ID ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalEdilang.g:1812:4: (lv_destinationCode_9_0= RULE_ID )
                    {
                    // InternalEdilang.g:1812:4: (lv_destinationCode_9_0= RULE_ID )
                    // InternalEdilang.g:1813:5: lv_destinationCode_9_0= RULE_ID
                    {
                    lv_destinationCode_9_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_destinationCode_9_0, grammarAccess.getTVLSegmentAccess().getDestinationCodeIDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTVLSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"destinationCode",
                    						lv_destinationCode_9_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_10=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_10, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_7());
            		
            // InternalEdilang.g:1833:3: ( (lv_carrierId_11_0= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEdilang.g:1834:4: (lv_carrierId_11_0= RULE_ID )
                    {
                    // InternalEdilang.g:1834:4: (lv_carrierId_11_0= RULE_ID )
                    // InternalEdilang.g:1835:5: lv_carrierId_11_0= RULE_ID
                    {
                    lv_carrierId_11_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_carrierId_11_0, grammarAccess.getTVLSegmentAccess().getCarrierIdIDTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTVLSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"carrierId",
                    						lv_carrierId_11_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_12=(Token)match(input,RULE_PLUS,FOLLOW_10); 

            			newLeafNode(this_PLUS_12, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_9());
            		
            // InternalEdilang.g:1855:3: ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEdilang.g:1856:4: ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )?
                    {
                    // InternalEdilang.g:1856:4: ( (lv_productId_13_0= RULE_ID ) )
                    // InternalEdilang.g:1857:5: (lv_productId_13_0= RULE_ID )
                    {
                    // InternalEdilang.g:1857:5: (lv_productId_13_0= RULE_ID )
                    // InternalEdilang.g:1858:6: lv_productId_13_0= RULE_ID
                    {
                    lv_productId_13_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_productId_13_0, grammarAccess.getTVLSegmentAccess().getProductIdIDTerminalRuleCall_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTVLSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"productId",
                    							lv_productId_13_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:1874:4: (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_COLON) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalEdilang.g:1875:5: this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )?
                            {
                            this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_14, grammarAccess.getTVLSegmentAccess().getCOLONTerminalRuleCall_10_1_0());
                            				
                            // InternalEdilang.g:1879:5: ( (lv_characteristicId_15_0= RULE_ID ) )
                            // InternalEdilang.g:1880:6: (lv_characteristicId_15_0= RULE_ID )
                            {
                            // InternalEdilang.g:1880:6: (lv_characteristicId_15_0= RULE_ID )
                            // InternalEdilang.g:1881:7: lv_characteristicId_15_0= RULE_ID
                            {
                            lv_characteristicId_15_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                            							newLeafNode(lv_characteristicId_15_0, grammarAccess.getTVLSegmentAccess().getCharacteristicIdIDTerminalRuleCall_10_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTVLSegmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"characteristicId",
                            								lv_characteristicId_15_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:1897:5: (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==RULE_COLON) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // InternalEdilang.g:1898:6: this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )*
                                    {
                                    this_COLON_16=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_16, grammarAccess.getTVLSegmentAccess().getCOLONTerminalRuleCall_10_1_2_0());
                                    					
                                    // InternalEdilang.g:1902:6: ( (lv_productIdCharacteristic_17_0= RULE_ID ) )
                                    // InternalEdilang.g:1903:7: (lv_productIdCharacteristic_17_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:1903:7: (lv_productIdCharacteristic_17_0= RULE_ID )
                                    // InternalEdilang.g:1904:8: lv_productIdCharacteristic_17_0= RULE_ID
                                    {
                                    lv_productIdCharacteristic_17_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                                    								newLeafNode(lv_productIdCharacteristic_17_0, grammarAccess.getTVLSegmentAccess().getProductIdCharacteristicIDTerminalRuleCall_10_1_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getTVLSegmentRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"productIdCharacteristic",
                                    									lv_productIdCharacteristic_17_0,
                                    									"io.thlaegler.edifact.Edilang.ID");
                                    							

                                    }


                                    }

                                    // InternalEdilang.g:1920:6: (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )*
                                    loop47:
                                    do {
                                        int alt47=2;
                                        int LA47_0 = input.LA(1);

                                        if ( (LA47_0==RULE_COLON) ) {
                                            alt47=1;
                                        }


                                        switch (alt47) {
                                    	case 1 :
                                    	    // InternalEdilang.g:1921:7: this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) )
                                    	    {
                                    	    this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    	    							newLeafNode(this_COLON_18, grammarAccess.getTVLSegmentAccess().getCOLONTerminalRuleCall_10_1_2_2_0());
                                    	    						
                                    	    // InternalEdilang.g:1925:7: ( (lv_descriptionIds_19_0= RULE_ID ) )
                                    	    // InternalEdilang.g:1926:8: (lv_descriptionIds_19_0= RULE_ID )
                                    	    {
                                    	    // InternalEdilang.g:1926:8: (lv_descriptionIds_19_0= RULE_ID )
                                    	    // InternalEdilang.g:1927:9: lv_descriptionIds_19_0= RULE_ID
                                    	    {
                                    	    lv_descriptionIds_19_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                                    	    									newLeafNode(lv_descriptionIds_19_0, grammarAccess.getTVLSegmentAccess().getDescriptionIdsIDTerminalRuleCall_10_1_2_2_1_0());
                                    	    								

                                    	    									if (current==null) {
                                    	    										current = createModelElement(grammarAccess.getTVLSegmentRule());
                                    	    									}
                                    	    									addWithLastConsumed(
                                    	    										current,
                                    	    										"descriptionIds",
                                    	    										lv_descriptionIds_19_0,
                                    	    										"io.thlaegler.edifact.Edilang.ID");
                                    	    								

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop47;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:1947:3: (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_PLUS) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalEdilang.g:1948:4: this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )?
                    {
                    this_PLUS_20=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_20, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_11_0());
                    			
                    // InternalEdilang.g:1952:4: ( (lv_productType_21_0= RULE_ID ) )
                    // InternalEdilang.g:1953:5: (lv_productType_21_0= RULE_ID )
                    {
                    // InternalEdilang.g:1953:5: (lv_productType_21_0= RULE_ID )
                    // InternalEdilang.g:1954:6: lv_productType_21_0= RULE_ID
                    {
                    lv_productType_21_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_productType_21_0, grammarAccess.getTVLSegmentAccess().getProductTypeIDTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTVLSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"productType",
                    							lv_productType_21_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:1970:4: (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_PLUS) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalEdilang.g:1971:5: this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )?
                            {
                            this_PLUS_22=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                            					newLeafNode(this_PLUS_22, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_11_2_0());
                            				
                            // InternalEdilang.g:1975:5: ( (lv_lineItemNumber_23_0= RULE_ID ) )
                            // InternalEdilang.g:1976:6: (lv_lineItemNumber_23_0= RULE_ID )
                            {
                            // InternalEdilang.g:1976:6: (lv_lineItemNumber_23_0= RULE_ID )
                            // InternalEdilang.g:1977:7: lv_lineItemNumber_23_0= RULE_ID
                            {
                            lv_lineItemNumber_23_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                            							newLeafNode(lv_lineItemNumber_23_0, grammarAccess.getTVLSegmentAccess().getLineItemNumberIDTerminalRuleCall_11_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTVLSegmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"lineItemNumber",
                            								lv_lineItemNumber_23_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:1993:5: (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==RULE_PLUS) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // InternalEdilang.g:1994:6: this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) )
                                    {
                                    this_PLUS_24=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                    						newLeafNode(this_PLUS_24, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_11_2_2_0());
                                    					
                                    // InternalEdilang.g:1998:6: ( (lv_processingIndicatorCode_25_0= RULE_ID ) )
                                    // InternalEdilang.g:1999:7: (lv_processingIndicatorCode_25_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:1999:7: (lv_processingIndicatorCode_25_0= RULE_ID )
                                    // InternalEdilang.g:2000:8: lv_processingIndicatorCode_25_0= RULE_ID
                                    {
                                    lv_processingIndicatorCode_25_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                                    								newLeafNode(lv_processingIndicatorCode_25_0, grammarAccess.getTVLSegmentAccess().getProcessingIndicatorCodeIDTerminalRuleCall_11_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getTVLSegmentRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"processingIndicatorCode",
                                    									lv_processingIndicatorCode_25_0,
                                    									"io.thlaegler.edifact.Edilang.ID");
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:2019:3: ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2020:4: (lv_lineEnd_26_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2020:4: (lv_lineEnd_26_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2021:5: lv_lineEnd_26_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_26_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_26_0, grammarAccess.getTVLSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTVLSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_26_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleTVLSegment"


    // $ANTLR start "entryRuleRPISegment"
    // InternalEdilang.g:2041:1: entryRuleRPISegment returns [EObject current=null] : iv_ruleRPISegment= ruleRPISegment EOF ;
    public final EObject entryRuleRPISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRPISegment = null;


        try {
            // InternalEdilang.g:2041:51: (iv_ruleRPISegment= ruleRPISegment EOF )
            // InternalEdilang.g:2042:2: iv_ruleRPISegment= ruleRPISegment EOF
            {
             newCompositeNode(grammarAccess.getRPISegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRPISegment=ruleRPISegment();

            state._fsp--;

             current =iv_ruleRPISegment; 
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
    // $ANTLR end "entryRuleRPISegment"


    // $ANTLR start "ruleRPISegment"
    // InternalEdilang.g:2048:1: ruleRPISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleRPISegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_numberOfPax_2_0=null;
        Token this_PLUS_3=null;
        Token lv_status_4_0=null;
        Token lv_lineEnd_5_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:2054:2: ( ( ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2055:2: ( ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2055:2: ( ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2056:3: ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2056:3: ( (lv_segment_0_0= 'RPI' ) )
            // InternalEdilang.g:2057:4: (lv_segment_0_0= 'RPI' )
            {
            // InternalEdilang.g:2057:4: (lv_segment_0_0= 'RPI' )
            // InternalEdilang.g:2058:5: lv_segment_0_0= 'RPI'
            {
            lv_segment_0_0=(Token)match(input,25,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getRPISegmentAccess().getSegmentRPIKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRPISegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "RPI");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_1, grammarAccess.getRPISegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:2074:3: ( (lv_numberOfPax_2_0= RULE_ID ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEdilang.g:2075:4: (lv_numberOfPax_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:2075:4: (lv_numberOfPax_2_0= RULE_ID )
                    // InternalEdilang.g:2076:5: lv_numberOfPax_2_0= RULE_ID
                    {
                    lv_numberOfPax_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_numberOfPax_2_0, grammarAccess.getRPISegmentAccess().getNumberOfPaxIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRPISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"numberOfPax",
                    						lv_numberOfPax_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_3, grammarAccess.getRPISegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:2096:3: ( (lv_status_4_0= RULE_ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalEdilang.g:2097:4: (lv_status_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:2097:4: (lv_status_4_0= RULE_ID )
                    // InternalEdilang.g:2098:5: lv_status_4_0= RULE_ID
                    {
                    lv_status_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_status_4_0, grammarAccess.getRPISegmentAccess().getStatusIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRPISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"status",
                    						lv_status_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:2114:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2115:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2115:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2116:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getRPISegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRPISegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleRPISegment"


    // $ANTLR start "entryRuleMOASegment"
    // InternalEdilang.g:2136:1: entryRuleMOASegment returns [EObject current=null] : iv_ruleMOASegment= ruleMOASegment EOF ;
    public final EObject entryRuleMOASegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOASegment = null;


        try {
            // InternalEdilang.g:2136:51: (iv_ruleMOASegment= ruleMOASegment EOF )
            // InternalEdilang.g:2137:2: iv_ruleMOASegment= ruleMOASegment EOF
            {
             newCompositeNode(grammarAccess.getMOASegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMOASegment=ruleMOASegment();

            state._fsp--;

             current =iv_ruleMOASegment; 
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
    // $ANTLR end "entryRuleMOASegment"


    // $ANTLR start "ruleMOASegment"
    // InternalEdilang.g:2143:1: ruleMOASegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleMOASegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_code1_2_0=null;
        Token this_COLON_3=null;
        Token lv_code2_4_0=null;
        Token lv_lineEnd_5_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:2149:2: ( ( ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2150:2: ( ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2150:2: ( ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2151:3: ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2151:3: ( (lv_segment_0_0= 'MOA' ) )
            // InternalEdilang.g:2152:4: (lv_segment_0_0= 'MOA' )
            {
            // InternalEdilang.g:2152:4: (lv_segment_0_0= 'MOA' )
            // InternalEdilang.g:2153:5: lv_segment_0_0= 'MOA'
            {
            lv_segment_0_0=(Token)match(input,26,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getMOASegmentAccess().getSegmentMOAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMOASegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "MOA");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getMOASegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:2169:3: ( (lv_code1_2_0= RULE_ID ) )
            // InternalEdilang.g:2170:4: (lv_code1_2_0= RULE_ID )
            {
            // InternalEdilang.g:2170:4: (lv_code1_2_0= RULE_ID )
            // InternalEdilang.g:2171:5: lv_code1_2_0= RULE_ID
            {
            lv_code1_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_code1_2_0, grammarAccess.getMOASegmentAccess().getCode1IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMOASegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code1",
            						lv_code1_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:2187:3: (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_COLON) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalEdilang.g:2188:4: this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getMOASegmentAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:2192:4: ( (lv_code2_4_0= RULE_ID ) )
                    // InternalEdilang.g:2193:5: (lv_code2_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:2193:5: (lv_code2_4_0= RULE_ID )
                    // InternalEdilang.g:2194:6: lv_code2_4_0= RULE_ID
                    {
                    lv_code2_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_code2_4_0, grammarAccess.getMOASegmentAccess().getCode2IDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMOASegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code2",
                    							lv_code2_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEdilang.g:2211:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2212:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2212:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2213:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getMOASegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMOASegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleMOASegment"


    // $ANTLR start "entryRuleLINSegment"
    // InternalEdilang.g:2233:1: entryRuleLINSegment returns [EObject current=null] : iv_ruleLINSegment= ruleLINSegment EOF ;
    public final EObject entryRuleLINSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLINSegment = null;


        try {
            // InternalEdilang.g:2233:51: (iv_ruleLINSegment= ruleLINSegment EOF )
            // InternalEdilang.g:2234:2: iv_ruleLINSegment= ruleLINSegment EOF
            {
             newCompositeNode(grammarAccess.getLINSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLINSegment=ruleLINSegment();

            state._fsp--;

             current =iv_ruleLINSegment; 
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
    // $ANTLR end "entryRuleLINSegment"


    // $ANTLR start "ruleLINSegment"
    // InternalEdilang.g:2240:1: ruleLINSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_code2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_code3_6_0= RULE_ID ) ) this_COLON_7= RULE_COLON ( (lv_code4_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleLINSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_code1_2_0=null;
        Token this_PLUS_3=null;
        Token lv_code2_4_0=null;
        Token this_PLUS_5=null;
        Token lv_code3_6_0=null;
        Token this_COLON_7=null;
        Token lv_code4_8_0=null;
        Token lv_lineEnd_9_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:2246:2: ( ( ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_code2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_code3_6_0= RULE_ID ) ) this_COLON_7= RULE_COLON ( (lv_code4_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2247:2: ( ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_code2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_code3_6_0= RULE_ID ) ) this_COLON_7= RULE_COLON ( (lv_code4_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2247:2: ( ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_code2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_code3_6_0= RULE_ID ) ) this_COLON_7= RULE_COLON ( (lv_code4_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2248:3: ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_code2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_code3_6_0= RULE_ID ) ) this_COLON_7= RULE_COLON ( (lv_code4_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2248:3: ( (lv_segment_0_0= 'LIN' ) )
            // InternalEdilang.g:2249:4: (lv_segment_0_0= 'LIN' )
            {
            // InternalEdilang.g:2249:4: (lv_segment_0_0= 'LIN' )
            // InternalEdilang.g:2250:5: lv_segment_0_0= 'LIN'
            {
            lv_segment_0_0=(Token)match(input,27,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getLINSegmentAccess().getSegmentLINKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLINSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "LIN");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_1, grammarAccess.getLINSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:2266:3: ( (lv_code1_2_0= RULE_ID ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalEdilang.g:2267:4: (lv_code1_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:2267:4: (lv_code1_2_0= RULE_ID )
                    // InternalEdilang.g:2268:5: lv_code1_2_0= RULE_ID
                    {
                    lv_code1_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_code1_2_0, grammarAccess.getLINSegmentAccess().getCode1IDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLINSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"code1",
                    						lv_code1_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_3, grammarAccess.getLINSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:2288:3: ( (lv_code2_4_0= RULE_ID ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalEdilang.g:2289:4: (lv_code2_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:2289:4: (lv_code2_4_0= RULE_ID )
                    // InternalEdilang.g:2290:5: lv_code2_4_0= RULE_ID
                    {
                    lv_code2_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_code2_4_0, grammarAccess.getLINSegmentAccess().getCode2IDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLINSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"code2",
                    						lv_code2_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_5, grammarAccess.getLINSegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:2310:3: ( ( (lv_code3_6_0= RULE_ID ) ) this_COLON_7= RULE_COLON ( (lv_code4_8_0= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalEdilang.g:2311:4: ( (lv_code3_6_0= RULE_ID ) ) this_COLON_7= RULE_COLON ( (lv_code4_8_0= RULE_ID ) )
                    {
                    // InternalEdilang.g:2311:4: ( (lv_code3_6_0= RULE_ID ) )
                    // InternalEdilang.g:2312:5: (lv_code3_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:2312:5: (lv_code3_6_0= RULE_ID )
                    // InternalEdilang.g:2313:6: lv_code3_6_0= RULE_ID
                    {
                    lv_code3_6_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_code3_6_0, grammarAccess.getLINSegmentAccess().getCode3IDTerminalRuleCall_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLINSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code3",
                    							lv_code3_6_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_7, grammarAccess.getLINSegmentAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalEdilang.g:2333:4: ( (lv_code4_8_0= RULE_ID ) )
                    // InternalEdilang.g:2334:5: (lv_code4_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:2334:5: (lv_code4_8_0= RULE_ID )
                    // InternalEdilang.g:2335:6: lv_code4_8_0= RULE_ID
                    {
                    lv_code4_8_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_code4_8_0, grammarAccess.getLINSegmentAccess().getCode4IDTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLINSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code4",
                    							lv_code4_8_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEdilang.g:2352:3: ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2353:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2353:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2354:5: lv_lineEnd_9_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_9_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_9_0, grammarAccess.getLINSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLINSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_9_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleLINSegment"


    // $ANTLR start "entryRulePRISegment"
    // InternalEdilang.g:2374:1: entryRulePRISegment returns [EObject current=null] : iv_rulePRISegment= rulePRISegment EOF ;
    public final EObject entryRulePRISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRISegment = null;


        try {
            // InternalEdilang.g:2374:51: (iv_rulePRISegment= rulePRISegment EOF )
            // InternalEdilang.g:2375:2: iv_rulePRISegment= rulePRISegment EOF
            {
             newCompositeNode(grammarAccess.getPRISegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePRISegment=rulePRISegment();

            state._fsp--;

             current =iv_rulePRISegment; 
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
    // $ANTLR end "entryRulePRISegment"


    // $ANTLR start "rulePRISegment"
    // InternalEdilang.g:2381:1: rulePRISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePRIFunction ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject rulePRISegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_lineEnd_3_0=null;
        EObject lv_sub_2_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:2387:2: ( ( ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePRIFunction ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2388:2: ( ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePRIFunction ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2388:2: ( ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePRIFunction ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2389:3: ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePRIFunction ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2389:3: ( (lv_segment_0_0= 'PRI' ) )
            // InternalEdilang.g:2390:4: (lv_segment_0_0= 'PRI' )
            {
            // InternalEdilang.g:2390:4: (lv_segment_0_0= 'PRI' )
            // InternalEdilang.g:2391:5: lv_segment_0_0= 'PRI'
            {
            lv_segment_0_0=(Token)match(input,28,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getPRISegmentAccess().getSegmentPRIKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPRISegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "PRI");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getPRISegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:2407:3: ( (lv_sub_2_0= rulePRIFunction ) )
            // InternalEdilang.g:2408:4: (lv_sub_2_0= rulePRIFunction )
            {
            // InternalEdilang.g:2408:4: (lv_sub_2_0= rulePRIFunction )
            // InternalEdilang.g:2409:5: lv_sub_2_0= rulePRIFunction
            {

            					newCompositeNode(grammarAccess.getPRISegmentAccess().getSubPRIFunctionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_sub_2_0=rulePRIFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPRISegmentRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_2_0,
            						"io.thlaegler.edifact.Edilang.PRIFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdilang.g:2426:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2427:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2427:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2428:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_3_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_3_0, grammarAccess.getPRISegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPRISegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_3_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "rulePRISegment"


    // $ANTLR start "entryRuleQTYSegment"
    // InternalEdilang.g:2448:1: entryRuleQTYSegment returns [EObject current=null] : iv_ruleQTYSegment= ruleQTYSegment EOF ;
    public final EObject entryRuleQTYSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQTYSegment = null;


        try {
            // InternalEdilang.g:2448:51: (iv_ruleQTYSegment= ruleQTYSegment EOF )
            // InternalEdilang.g:2449:2: iv_ruleQTYSegment= ruleQTYSegment EOF
            {
             newCompositeNode(grammarAccess.getQTYSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQTYSegment=ruleQTYSegment();

            state._fsp--;

             current =iv_ruleQTYSegment; 
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
    // $ANTLR end "entryRuleQTYSegment"


    // $ANTLR start "ruleQTYSegment"
    // InternalEdilang.g:2455:1: ruleQTYSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'QTY' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_code3_6_0= RULE_ID ) ) )? )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleQTYSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_code1_2_0=null;
        Token this_COLON_3=null;
        Token lv_code2_4_0=null;
        Token this_COLON_5=null;
        Token lv_code3_6_0=null;
        Token lv_lineEnd_7_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:2461:2: ( ( ( (lv_segment_0_0= 'QTY' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_code3_6_0= RULE_ID ) ) )? )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2462:2: ( ( (lv_segment_0_0= 'QTY' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_code3_6_0= RULE_ID ) ) )? )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2462:2: ( ( (lv_segment_0_0= 'QTY' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_code3_6_0= RULE_ID ) ) )? )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2463:3: ( (lv_segment_0_0= 'QTY' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_code3_6_0= RULE_ID ) ) )? )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2463:3: ( (lv_segment_0_0= 'QTY' ) )
            // InternalEdilang.g:2464:4: (lv_segment_0_0= 'QTY' )
            {
            // InternalEdilang.g:2464:4: (lv_segment_0_0= 'QTY' )
            // InternalEdilang.g:2465:5: lv_segment_0_0= 'QTY'
            {
            lv_segment_0_0=(Token)match(input,29,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getQTYSegmentAccess().getSegmentQTYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQTYSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "QTY");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getQTYSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:2481:3: ( (lv_code1_2_0= RULE_ID ) )
            // InternalEdilang.g:2482:4: (lv_code1_2_0= RULE_ID )
            {
            // InternalEdilang.g:2482:4: (lv_code1_2_0= RULE_ID )
            // InternalEdilang.g:2483:5: lv_code1_2_0= RULE_ID
            {
            lv_code1_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_code1_2_0, grammarAccess.getQTYSegmentAccess().getCode1IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQTYSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code1",
            						lv_code1_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:2499:3: (this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_code3_6_0= RULE_ID ) ) )? )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_COLON) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalEdilang.g:2500:4: this_COLON_3= RULE_COLON ( (lv_code2_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_code3_6_0= RULE_ID ) ) )?
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getQTYSegmentAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:2504:4: ( (lv_code2_4_0= RULE_ID ) )
                    // InternalEdilang.g:2505:5: (lv_code2_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:2505:5: (lv_code2_4_0= RULE_ID )
                    // InternalEdilang.g:2506:6: lv_code2_4_0= RULE_ID
                    {
                    lv_code2_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_code2_4_0, grammarAccess.getQTYSegmentAccess().getCode2IDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQTYSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code2",
                    							lv_code2_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:2522:4: (this_COLON_5= RULE_COLON ( (lv_code3_6_0= RULE_ID ) ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_COLON) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalEdilang.g:2523:5: this_COLON_5= RULE_COLON ( (lv_code3_6_0= RULE_ID ) )
                            {
                            this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_5, grammarAccess.getQTYSegmentAccess().getCOLONTerminalRuleCall_3_2_0());
                            				
                            // InternalEdilang.g:2527:5: ( (lv_code3_6_0= RULE_ID ) )
                            // InternalEdilang.g:2528:6: (lv_code3_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:2528:6: (lv_code3_6_0= RULE_ID )
                            // InternalEdilang.g:2529:7: lv_code3_6_0= RULE_ID
                            {
                            lv_code3_6_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                            							newLeafNode(lv_code3_6_0, grammarAccess.getQTYSegmentAccess().getCode3IDTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQTYSegmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"code3",
                            								lv_code3_6_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:2547:3: ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2548:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2548:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2549:5: lv_lineEnd_7_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_7_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_7_0, grammarAccess.getQTYSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQTYSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_7_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleQTYSegment"


    // $ANTLR start "entryRuleCUXSegment"
    // InternalEdilang.g:2569:1: entryRuleCUXSegment returns [EObject current=null] : iv_ruleCUXSegment= ruleCUXSegment EOF ;
    public final EObject entryRuleCUXSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCUXSegment = null;


        try {
            // InternalEdilang.g:2569:51: (iv_ruleCUXSegment= ruleCUXSegment EOF )
            // InternalEdilang.g:2570:2: iv_ruleCUXSegment= ruleCUXSegment EOF
            {
             newCompositeNode(grammarAccess.getCUXSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCUXSegment=ruleCUXSegment();

            state._fsp--;

             current =iv_ruleCUXSegment; 
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
    // $ANTLR end "entryRuleCUXSegment"


    // $ANTLR start "ruleCUXSegment"
    // InternalEdilang.g:2576:1: ruleCUXSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currency_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleCUXSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_num_2_0=null;
        Token this_COLON_3=null;
        Token lv_currency_4_0=null;
        Token lv_lineEnd_5_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:2582:2: ( ( ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currency_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2583:2: ( ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currency_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2583:2: ( ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currency_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2584:3: ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currency_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2584:3: ( (lv_segment_0_0= 'CUX' ) )
            // InternalEdilang.g:2585:4: (lv_segment_0_0= 'CUX' )
            {
            // InternalEdilang.g:2585:4: (lv_segment_0_0= 'CUX' )
            // InternalEdilang.g:2586:5: lv_segment_0_0= 'CUX'
            {
            lv_segment_0_0=(Token)match(input,30,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getCUXSegmentAccess().getSegmentCUXKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCUXSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "CUX");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getCUXSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:2602:3: ( (lv_num_2_0= RULE_ID ) )
            // InternalEdilang.g:2603:4: (lv_num_2_0= RULE_ID )
            {
            // InternalEdilang.g:2603:4: (lv_num_2_0= RULE_ID )
            // InternalEdilang.g:2604:5: lv_num_2_0= RULE_ID
            {
            lv_num_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_num_2_0, grammarAccess.getCUXSegmentAccess().getNumIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCUXSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:2620:3: (this_COLON_3= RULE_COLON ( (lv_currency_4_0= RULE_ID ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_COLON) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalEdilang.g:2621:4: this_COLON_3= RULE_COLON ( (lv_currency_4_0= RULE_ID ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getCUXSegmentAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:2625:4: ( (lv_currency_4_0= RULE_ID ) )
                    // InternalEdilang.g:2626:5: (lv_currency_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:2626:5: (lv_currency_4_0= RULE_ID )
                    // InternalEdilang.g:2627:6: lv_currency_4_0= RULE_ID
                    {
                    lv_currency_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_currency_4_0, grammarAccess.getCUXSegmentAccess().getCurrencyIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCUXSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"currency",
                    							lv_currency_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEdilang.g:2644:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2645:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2645:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2646:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getCUXSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCUXSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleCUXSegment"


    // $ANTLR start "entryRuleTAXSegment"
    // InternalEdilang.g:2666:1: entryRuleTAXSegment returns [EObject current=null] : iv_ruleTAXSegment= ruleTAXSegment EOF ;
    public final EObject entryRuleTAXSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAXSegment = null;


        try {
            // InternalEdilang.g:2666:51: (iv_ruleTAXSegment= ruleTAXSegment EOF )
            // InternalEdilang.g:2667:2: iv_ruleTAXSegment= ruleTAXSegment EOF
            {
             newCompositeNode(grammarAccess.getTAXSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTAXSegment=ruleTAXSegment();

            state._fsp--;

             current =iv_ruleTAXSegment; 
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
    // $ANTLR end "entryRuleTAXSegment"


    // $ANTLR start "ruleTAXSegment"
    // InternalEdilang.g:2673:1: ruleTAXSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_type_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_todo1_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo2_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( ( (lv_todo3_10_0= RULE_ID ) )? this_COLON_11= RULE_COLON ( (lv_todo4_12_0= RULE_ID ) )? this_COLON_13= RULE_COLON ( (lv_todo5_14_0= RULE_ID ) )? this_COLON_15= RULE_COLON ( (lv_todo6_16_0= RULE_ID ) )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleTAXSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_num_2_0=null;
        Token this_PLUS_3=null;
        Token lv_type_4_0=null;
        Token this_PLUS_5=null;
        Token lv_todo1_6_0=null;
        Token this_PLUS_7=null;
        Token lv_todo2_8_0=null;
        Token this_PLUS_9=null;
        Token lv_todo3_10_0=null;
        Token this_COLON_11=null;
        Token lv_todo4_12_0=null;
        Token this_COLON_13=null;
        Token lv_todo5_14_0=null;
        Token this_COLON_15=null;
        Token lv_todo6_16_0=null;
        Token lv_lineEnd_17_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:2679:2: ( ( ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_type_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_todo1_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo2_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( ( (lv_todo3_10_0= RULE_ID ) )? this_COLON_11= RULE_COLON ( (lv_todo4_12_0= RULE_ID ) )? this_COLON_13= RULE_COLON ( (lv_todo5_14_0= RULE_ID ) )? this_COLON_15= RULE_COLON ( (lv_todo6_16_0= RULE_ID ) )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2680:2: ( ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_type_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_todo1_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo2_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( ( (lv_todo3_10_0= RULE_ID ) )? this_COLON_11= RULE_COLON ( (lv_todo4_12_0= RULE_ID ) )? this_COLON_13= RULE_COLON ( (lv_todo5_14_0= RULE_ID ) )? this_COLON_15= RULE_COLON ( (lv_todo6_16_0= RULE_ID ) )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2680:2: ( ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_type_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_todo1_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo2_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( ( (lv_todo3_10_0= RULE_ID ) )? this_COLON_11= RULE_COLON ( (lv_todo4_12_0= RULE_ID ) )? this_COLON_13= RULE_COLON ( (lv_todo5_14_0= RULE_ID ) )? this_COLON_15= RULE_COLON ( (lv_todo6_16_0= RULE_ID ) )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2681:3: ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_num_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_type_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_todo1_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo2_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( ( (lv_todo3_10_0= RULE_ID ) )? this_COLON_11= RULE_COLON ( (lv_todo4_12_0= RULE_ID ) )? this_COLON_13= RULE_COLON ( (lv_todo5_14_0= RULE_ID ) )? this_COLON_15= RULE_COLON ( (lv_todo6_16_0= RULE_ID ) )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2681:3: ( (lv_segment_0_0= 'TAX' ) )
            // InternalEdilang.g:2682:4: (lv_segment_0_0= 'TAX' )
            {
            // InternalEdilang.g:2682:4: (lv_segment_0_0= 'TAX' )
            // InternalEdilang.g:2683:5: lv_segment_0_0= 'TAX'
            {
            lv_segment_0_0=(Token)match(input,31,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getTAXSegmentAccess().getSegmentTAXKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTAXSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "TAX");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:2699:3: ( (lv_num_2_0= RULE_ID ) )
            // InternalEdilang.g:2700:4: (lv_num_2_0= RULE_ID )
            {
            // InternalEdilang.g:2700:4: (lv_num_2_0= RULE_ID )
            // InternalEdilang.g:2701:5: lv_num_2_0= RULE_ID
            {
            lv_num_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_num_2_0, grammarAccess.getTAXSegmentAccess().getNumIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTAXSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_3, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:2721:3: ( (lv_type_4_0= RULE_ID ) )
            // InternalEdilang.g:2722:4: (lv_type_4_0= RULE_ID )
            {
            // InternalEdilang.g:2722:4: (lv_type_4_0= RULE_ID )
            // InternalEdilang.g:2723:5: lv_type_4_0= RULE_ID
            {
            lv_type_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_type_4_0, grammarAccess.getTAXSegmentAccess().getTypeIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTAXSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:2739:3: (this_PLUS_5= RULE_PLUS ( (lv_todo1_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo2_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( ( (lv_todo3_10_0= RULE_ID ) )? this_COLON_11= RULE_COLON ( (lv_todo4_12_0= RULE_ID ) )? this_COLON_13= RULE_COLON ( (lv_todo5_14_0= RULE_ID ) )? this_COLON_15= RULE_COLON ( (lv_todo6_16_0= RULE_ID ) )? )? )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_PLUS) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalEdilang.g:2740:4: this_PLUS_5= RULE_PLUS ( (lv_todo1_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo2_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( ( (lv_todo3_10_0= RULE_ID ) )? this_COLON_11= RULE_COLON ( (lv_todo4_12_0= RULE_ID ) )? this_COLON_13= RULE_COLON ( (lv_todo5_14_0= RULE_ID ) )? this_COLON_15= RULE_COLON ( (lv_todo6_16_0= RULE_ID ) )? )?
                    {
                    this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_9); 

                    				newLeafNode(this_PLUS_5, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_5_0());
                    			
                    // InternalEdilang.g:2744:4: ( (lv_todo1_6_0= RULE_ID ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalEdilang.g:2745:5: (lv_todo1_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:2745:5: (lv_todo1_6_0= RULE_ID )
                            // InternalEdilang.g:2746:6: lv_todo1_6_0= RULE_ID
                            {
                            lv_todo1_6_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                            						newLeafNode(lv_todo1_6_0, grammarAccess.getTAXSegmentAccess().getTodo1IDTerminalRuleCall_5_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTAXSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"todo1",
                            							lv_todo1_6_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_9); 

                    				newLeafNode(this_PLUS_7, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_5_2());
                    			
                    // InternalEdilang.g:2766:4: ( (lv_todo2_8_0= RULE_ID ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_ID) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalEdilang.g:2767:5: (lv_todo2_8_0= RULE_ID )
                            {
                            // InternalEdilang.g:2767:5: (lv_todo2_8_0= RULE_ID )
                            // InternalEdilang.g:2768:6: lv_todo2_8_0= RULE_ID
                            {
                            lv_todo2_8_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                            						newLeafNode(lv_todo2_8_0, grammarAccess.getTAXSegmentAccess().getTodo2IDTerminalRuleCall_5_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTAXSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"todo2",
                            							lv_todo2_8_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_18); 

                    				newLeafNode(this_PLUS_9, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_5_4());
                    			
                    // InternalEdilang.g:2788:4: ( ( (lv_todo3_10_0= RULE_ID ) )? this_COLON_11= RULE_COLON ( (lv_todo4_12_0= RULE_ID ) )? this_COLON_13= RULE_COLON ( (lv_todo5_14_0= RULE_ID ) )? this_COLON_15= RULE_COLON ( (lv_todo6_16_0= RULE_ID ) )? )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_COLON||LA69_0==RULE_ID) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalEdilang.g:2789:5: ( (lv_todo3_10_0= RULE_ID ) )? this_COLON_11= RULE_COLON ( (lv_todo4_12_0= RULE_ID ) )? this_COLON_13= RULE_COLON ( (lv_todo5_14_0= RULE_ID ) )? this_COLON_15= RULE_COLON ( (lv_todo6_16_0= RULE_ID ) )?
                            {
                            // InternalEdilang.g:2789:5: ( (lv_todo3_10_0= RULE_ID ) )?
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==RULE_ID) ) {
                                alt65=1;
                            }
                            switch (alt65) {
                                case 1 :
                                    // InternalEdilang.g:2790:6: (lv_todo3_10_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:2790:6: (lv_todo3_10_0= RULE_ID )
                                    // InternalEdilang.g:2791:7: lv_todo3_10_0= RULE_ID
                                    {
                                    lv_todo3_10_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                                    							newLeafNode(lv_todo3_10_0, grammarAccess.getTAXSegmentAccess().getTodo3IDTerminalRuleCall_5_5_0_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTAXSegmentRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"todo3",
                                    								lv_todo3_10_0,
                                    								"io.thlaegler.edifact.Edilang.ID");
                                    						

                                    }


                                    }
                                    break;

                            }

                            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_19); 

                            					newLeafNode(this_COLON_11, grammarAccess.getTAXSegmentAccess().getCOLONTerminalRuleCall_5_5_1());
                            				
                            // InternalEdilang.g:2811:5: ( (lv_todo4_12_0= RULE_ID ) )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==RULE_ID) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // InternalEdilang.g:2812:6: (lv_todo4_12_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:2812:6: (lv_todo4_12_0= RULE_ID )
                                    // InternalEdilang.g:2813:7: lv_todo4_12_0= RULE_ID
                                    {
                                    lv_todo4_12_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                                    							newLeafNode(lv_todo4_12_0, grammarAccess.getTAXSegmentAccess().getTodo4IDTerminalRuleCall_5_5_2_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTAXSegmentRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"todo4",
                                    								lv_todo4_12_0,
                                    								"io.thlaegler.edifact.Edilang.ID");
                                    						

                                    }


                                    }
                                    break;

                            }

                            this_COLON_13=(Token)match(input,RULE_COLON,FOLLOW_19); 

                            					newLeafNode(this_COLON_13, grammarAccess.getTAXSegmentAccess().getCOLONTerminalRuleCall_5_5_3());
                            				
                            // InternalEdilang.g:2833:5: ( (lv_todo5_14_0= RULE_ID ) )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==RULE_ID) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // InternalEdilang.g:2834:6: (lv_todo5_14_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:2834:6: (lv_todo5_14_0= RULE_ID )
                                    // InternalEdilang.g:2835:7: lv_todo5_14_0= RULE_ID
                                    {
                                    lv_todo5_14_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                                    							newLeafNode(lv_todo5_14_0, grammarAccess.getTAXSegmentAccess().getTodo5IDTerminalRuleCall_5_5_4_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTAXSegmentRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"todo5",
                                    								lv_todo5_14_0,
                                    								"io.thlaegler.edifact.Edilang.ID");
                                    						

                                    }


                                    }
                                    break;

                            }

                            this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_12); 

                            					newLeafNode(this_COLON_15, grammarAccess.getTAXSegmentAccess().getCOLONTerminalRuleCall_5_5_5());
                            				
                            // InternalEdilang.g:2855:5: ( (lv_todo6_16_0= RULE_ID ) )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==RULE_ID) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // InternalEdilang.g:2856:6: (lv_todo6_16_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:2856:6: (lv_todo6_16_0= RULE_ID )
                                    // InternalEdilang.g:2857:7: lv_todo6_16_0= RULE_ID
                                    {
                                    lv_todo6_16_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                                    							newLeafNode(lv_todo6_16_0, grammarAccess.getTAXSegmentAccess().getTodo6IDTerminalRuleCall_5_5_6_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTAXSegmentRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"todo6",
                                    								lv_todo6_16_0,
                                    								"io.thlaegler.edifact.Edilang.ID");
                                    						

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:2875:3: ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2876:4: (lv_lineEnd_17_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2876:4: (lv_lineEnd_17_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2877:5: lv_lineEnd_17_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_17_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_17_0, grammarAccess.getTAXSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTAXSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_17_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleTAXSegment"


    // $ANTLR start "entryRuleRFFSegment"
    // InternalEdilang.g:2897:1: entryRuleRFFSegment returns [EObject current=null] : iv_ruleRFFSegment= ruleRFFSegment EOF ;
    public final EObject entryRuleRFFSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRFFSegment = null;


        try {
            // InternalEdilang.g:2897:51: (iv_ruleRFFSegment= ruleRFFSegment EOF )
            // InternalEdilang.g:2898:2: iv_ruleRFFSegment= ruleRFFSegment EOF
            {
             newCompositeNode(grammarAccess.getRFFSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRFFSegment=ruleRFFSegment();

            state._fsp--;

             current =iv_ruleRFFSegment; 
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
    // $ANTLR end "entryRuleRFFSegment"


    // $ANTLR start "ruleRFFSegment"
    // InternalEdilang.g:2904:1: ruleRFFSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleRFFSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_rff1_2_0=null;
        Token this_COLON_3=null;
        Token lv_rff2_4_0=null;
        Token lv_lineEnd_5_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:2910:2: ( ( ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2911:2: ( ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2911:2: ( ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2912:3: ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2912:3: ( (lv_segment_0_0= 'RFF' ) )
            // InternalEdilang.g:2913:4: (lv_segment_0_0= 'RFF' )
            {
            // InternalEdilang.g:2913:4: (lv_segment_0_0= 'RFF' )
            // InternalEdilang.g:2914:5: lv_segment_0_0= 'RFF'
            {
            lv_segment_0_0=(Token)match(input,32,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getRFFSegmentAccess().getSegmentRFFKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRFFSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "RFF");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getRFFSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:2930:3: ( (lv_rff1_2_0= RULE_ID ) )
            // InternalEdilang.g:2931:4: (lv_rff1_2_0= RULE_ID )
            {
            // InternalEdilang.g:2931:4: (lv_rff1_2_0= RULE_ID )
            // InternalEdilang.g:2932:5: lv_rff1_2_0= RULE_ID
            {
            lv_rff1_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_rff1_2_0, grammarAccess.getRFFSegmentAccess().getRff1IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRFFSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rff1",
            						lv_rff1_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:2948:3: (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_COLON) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalEdilang.g:2949:4: this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getRFFSegmentAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:2953:4: ( (lv_rff2_4_0= RULE_ID ) )
                    // InternalEdilang.g:2954:5: (lv_rff2_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:2954:5: (lv_rff2_4_0= RULE_ID )
                    // InternalEdilang.g:2955:6: lv_rff2_4_0= RULE_ID
                    {
                    lv_rff2_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_rff2_4_0, grammarAccess.getRFFSegmentAccess().getRff2IDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRFFSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rff2",
                    							lv_rff2_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEdilang.g:2972:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2973:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2973:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2974:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getRFFSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRFFSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleRFFSegment"


    // $ANTLR start "entryRuleNADSegment"
    // InternalEdilang.g:2994:1: entryRuleNADSegment returns [EObject current=null] : iv_ruleNADSegment= ruleNADSegment EOF ;
    public final EObject entryRuleNADSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNADSegment = null;


        try {
            // InternalEdilang.g:2994:51: (iv_ruleNADSegment= ruleNADSegment EOF )
            // InternalEdilang.g:2995:2: iv_ruleNADSegment= ruleNADSegment EOF
            {
             newCompositeNode(grammarAccess.getNADSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNADSegment=ruleNADSegment();

            state._fsp--;

             current =iv_ruleNADSegment; 
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
    // $ANTLR end "entryRuleNADSegment"


    // $ANTLR start "ruleNADSegment"
    // InternalEdilang.g:3001:1: ruleNADSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_code_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( ( (lv_manufacturer1_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_manufacturer2_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_manufacturer3_8_0= RULE_ID ) )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleNADSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_code_2_0=null;
        Token this_PLUS_3=null;
        Token lv_manufacturer1_4_0=null;
        Token this_COLON_5=null;
        Token lv_manufacturer2_6_0=null;
        Token this_COLON_7=null;
        Token lv_manufacturer3_8_0=null;
        Token lv_lineEnd_9_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3007:2: ( ( ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_code_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( ( (lv_manufacturer1_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_manufacturer2_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_manufacturer3_8_0= RULE_ID ) )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3008:2: ( ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_code_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( ( (lv_manufacturer1_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_manufacturer2_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_manufacturer3_8_0= RULE_ID ) )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3008:2: ( ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_code_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( ( (lv_manufacturer1_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_manufacturer2_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_manufacturer3_8_0= RULE_ID ) )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3009:3: ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_code_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( ( (lv_manufacturer1_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_manufacturer2_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_manufacturer3_8_0= RULE_ID ) )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3009:3: ( (lv_segment_0_0= 'NAD' ) )
            // InternalEdilang.g:3010:4: (lv_segment_0_0= 'NAD' )
            {
            // InternalEdilang.g:3010:4: (lv_segment_0_0= 'NAD' )
            // InternalEdilang.g:3011:5: lv_segment_0_0= 'NAD'
            {
            lv_segment_0_0=(Token)match(input,33,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getNADSegmentAccess().getSegmentNADKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNADSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "NAD");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3027:3: ( (lv_code_2_0= RULE_ID ) )
            // InternalEdilang.g:3028:4: (lv_code_2_0= RULE_ID )
            {
            // InternalEdilang.g:3028:4: (lv_code_2_0= RULE_ID )
            // InternalEdilang.g:3029:5: lv_code_2_0= RULE_ID
            {
            lv_code_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_code_2_0, grammarAccess.getNADSegmentAccess().getCodeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNADSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_18); 

            			newLeafNode(this_PLUS_3, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:3049:3: ( ( (lv_manufacturer1_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_manufacturer2_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_manufacturer3_8_0= RULE_ID ) )? )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_COLON||LA75_0==RULE_ID) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalEdilang.g:3050:4: ( (lv_manufacturer1_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_manufacturer2_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_manufacturer3_8_0= RULE_ID ) )?
                    {
                    // InternalEdilang.g:3050:4: ( (lv_manufacturer1_4_0= RULE_ID ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==RULE_ID) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalEdilang.g:3051:5: (lv_manufacturer1_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:3051:5: (lv_manufacturer1_4_0= RULE_ID )
                            // InternalEdilang.g:3052:6: lv_manufacturer1_4_0= RULE_ID
                            {
                            lv_manufacturer1_4_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                            						newLeafNode(lv_manufacturer1_4_0, grammarAccess.getNADSegmentAccess().getManufacturer1IDTerminalRuleCall_4_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getNADSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"manufacturer1",
                            							lv_manufacturer1_4_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_19); 

                    				newLeafNode(this_COLON_5, grammarAccess.getNADSegmentAccess().getCOLONTerminalRuleCall_4_1());
                    			
                    // InternalEdilang.g:3072:4: ( (lv_manufacturer2_6_0= RULE_ID ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_ID) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalEdilang.g:3073:5: (lv_manufacturer2_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:3073:5: (lv_manufacturer2_6_0= RULE_ID )
                            // InternalEdilang.g:3074:6: lv_manufacturer2_6_0= RULE_ID
                            {
                            lv_manufacturer2_6_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                            						newLeafNode(lv_manufacturer2_6_0, grammarAccess.getNADSegmentAccess().getManufacturer2IDTerminalRuleCall_4_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getNADSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"manufacturer2",
                            							lv_manufacturer2_6_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_12); 

                    				newLeafNode(this_COLON_7, grammarAccess.getNADSegmentAccess().getCOLONTerminalRuleCall_4_3());
                    			
                    // InternalEdilang.g:3094:4: ( (lv_manufacturer3_8_0= RULE_ID ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_ID) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalEdilang.g:3095:5: (lv_manufacturer3_8_0= RULE_ID )
                            {
                            // InternalEdilang.g:3095:5: (lv_manufacturer3_8_0= RULE_ID )
                            // InternalEdilang.g:3096:6: lv_manufacturer3_8_0= RULE_ID
                            {
                            lv_manufacturer3_8_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                            						newLeafNode(lv_manufacturer3_8_0, grammarAccess.getNADSegmentAccess().getManufacturer3IDTerminalRuleCall_4_4_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getNADSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"manufacturer3",
                            							lv_manufacturer3_8_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:3113:3: ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3114:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3114:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3115:5: lv_lineEnd_9_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_9_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_9_0, grammarAccess.getNADSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNADSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_9_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleNADSegment"


    // $ANTLR start "entryRuleDTMSegment"
    // InternalEdilang.g:3135:1: entryRuleDTMSegment returns [EObject current=null] : iv_ruleDTMSegment= ruleDTMSegment EOF ;
    public final EObject entryRuleDTMSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTMSegment = null;


        try {
            // InternalEdilang.g:3135:51: (iv_ruleDTMSegment= ruleDTMSegment EOF )
            // InternalEdilang.g:3136:2: iv_ruleDTMSegment= ruleDTMSegment EOF
            {
             newCompositeNode(grammarAccess.getDTMSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDTMSegment=ruleDTMSegment();

            state._fsp--;

             current =iv_ruleDTMSegment; 
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
    // $ANTLR end "entryRuleDTMSegment"


    // $ANTLR start "ruleDTMSegment"
    // InternalEdilang.g:3142:1: ruleDTMSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'DTM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_num2_4_0= RULE_ID ) ) this_COLON_5= RULE_COLON ( (lv_num3_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleDTMSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_num1_2_0=null;
        Token this_COLON_3=null;
        Token lv_num2_4_0=null;
        Token this_COLON_5=null;
        Token lv_num3_6_0=null;
        Token lv_lineEnd_7_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3148:2: ( ( ( (lv_segment_0_0= 'DTM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_num2_4_0= RULE_ID ) ) this_COLON_5= RULE_COLON ( (lv_num3_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3149:2: ( ( (lv_segment_0_0= 'DTM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_num2_4_0= RULE_ID ) ) this_COLON_5= RULE_COLON ( (lv_num3_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3149:2: ( ( (lv_segment_0_0= 'DTM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_num2_4_0= RULE_ID ) ) this_COLON_5= RULE_COLON ( (lv_num3_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3150:3: ( (lv_segment_0_0= 'DTM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_num2_4_0= RULE_ID ) ) this_COLON_5= RULE_COLON ( (lv_num3_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3150:3: ( (lv_segment_0_0= 'DTM' ) )
            // InternalEdilang.g:3151:4: (lv_segment_0_0= 'DTM' )
            {
            // InternalEdilang.g:3151:4: (lv_segment_0_0= 'DTM' )
            // InternalEdilang.g:3152:5: lv_segment_0_0= 'DTM'
            {
            lv_segment_0_0=(Token)match(input,34,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getDTMSegmentAccess().getSegmentDTMKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTMSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "DTM");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getDTMSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3168:3: ( (lv_num1_2_0= RULE_ID ) )
            // InternalEdilang.g:3169:4: (lv_num1_2_0= RULE_ID )
            {
            // InternalEdilang.g:3169:4: (lv_num1_2_0= RULE_ID )
            // InternalEdilang.g:3170:5: lv_num1_2_0= RULE_ID
            {
            lv_num1_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_num1_2_0, grammarAccess.getDTMSegmentAccess().getNum1IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTMSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num1",
            						lv_num1_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:3186:3: (this_COLON_3= RULE_COLON ( (lv_num2_4_0= RULE_ID ) ) this_COLON_5= RULE_COLON ( (lv_num3_6_0= RULE_ID ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_COLON) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalEdilang.g:3187:4: this_COLON_3= RULE_COLON ( (lv_num2_4_0= RULE_ID ) ) this_COLON_5= RULE_COLON ( (lv_num3_6_0= RULE_ID ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getDTMSegmentAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:3191:4: ( (lv_num2_4_0= RULE_ID ) )
                    // InternalEdilang.g:3192:5: (lv_num2_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:3192:5: (lv_num2_4_0= RULE_ID )
                    // InternalEdilang.g:3193:6: lv_num2_4_0= RULE_ID
                    {
                    lv_num2_4_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_num2_4_0, grammarAccess.getDTMSegmentAccess().getNum2IDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDTMSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"num2",
                    							lv_num2_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_5, grammarAccess.getDTMSegmentAccess().getCOLONTerminalRuleCall_3_2());
                    			
                    // InternalEdilang.g:3213:4: ( (lv_num3_6_0= RULE_ID ) )
                    // InternalEdilang.g:3214:5: (lv_num3_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:3214:5: (lv_num3_6_0= RULE_ID )
                    // InternalEdilang.g:3215:6: lv_num3_6_0= RULE_ID
                    {
                    lv_num3_6_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_num3_6_0, grammarAccess.getDTMSegmentAccess().getNum3IDTerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDTMSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"num3",
                    							lv_num3_6_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEdilang.g:3232:3: ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3233:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3233:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3234:5: lv_lineEnd_7_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_7_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_7_0, grammarAccess.getDTMSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTMSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_7_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleDTMSegment"


    // $ANTLR start "entryRuleBGMSegment"
    // InternalEdilang.g:3254:1: entryRuleBGMSegment returns [EObject current=null] : iv_ruleBGMSegment= ruleBGMSegment EOF ;
    public final EObject entryRuleBGMSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBGMSegment = null;


        try {
            // InternalEdilang.g:3254:51: (iv_ruleBGMSegment= ruleBGMSegment EOF )
            // InternalEdilang.g:3255:2: iv_ruleBGMSegment= ruleBGMSegment EOF
            {
             newCompositeNode(grammarAccess.getBGMSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBGMSegment=ruleBGMSegment();

            state._fsp--;

             current =iv_ruleBGMSegment; 
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
    // $ANTLR end "entryRuleBGMSegment"


    // $ANTLR start "ruleBGMSegment"
    // InternalEdilang.g:3261:1: ruleBGMSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_num2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_num3_6_0= RULE_ID ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleBGMSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_num1_2_0=null;
        Token this_PLUS_3=null;
        Token lv_num2_4_0=null;
        Token this_PLUS_5=null;
        Token lv_num3_6_0=null;
        Token lv_lineEnd_7_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3267:2: ( ( ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_num2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_num3_6_0= RULE_ID ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3268:2: ( ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_num2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_num3_6_0= RULE_ID ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3268:2: ( ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_num2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_num3_6_0= RULE_ID ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3269:3: ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_num1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_num2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_num3_6_0= RULE_ID ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3269:3: ( (lv_segment_0_0= 'BGM' ) )
            // InternalEdilang.g:3270:4: (lv_segment_0_0= 'BGM' )
            {
            // InternalEdilang.g:3270:4: (lv_segment_0_0= 'BGM' )
            // InternalEdilang.g:3271:5: lv_segment_0_0= 'BGM'
            {
            lv_segment_0_0=(Token)match(input,35,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getBGMSegmentAccess().getSegmentBGMKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBGMSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "BGM");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_1, grammarAccess.getBGMSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3287:3: ( (lv_num1_2_0= RULE_ID ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalEdilang.g:3288:4: (lv_num1_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:3288:4: (lv_num1_2_0= RULE_ID )
                    // InternalEdilang.g:3289:5: lv_num1_2_0= RULE_ID
                    {
                    lv_num1_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_num1_2_0, grammarAccess.getBGMSegmentAccess().getNum1IDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBGMSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"num1",
                    						lv_num1_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_3, grammarAccess.getBGMSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:3309:3: ( (lv_num2_4_0= RULE_ID ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalEdilang.g:3310:4: (lv_num2_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:3310:4: (lv_num2_4_0= RULE_ID )
                    // InternalEdilang.g:3311:5: lv_num2_4_0= RULE_ID
                    {
                    lv_num2_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_num2_4_0, grammarAccess.getBGMSegmentAccess().getNum2IDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBGMSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"num2",
                    						lv_num2_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_5, grammarAccess.getBGMSegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:3331:3: ( (lv_num3_6_0= RULE_ID ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalEdilang.g:3332:4: (lv_num3_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:3332:4: (lv_num3_6_0= RULE_ID )
                    // InternalEdilang.g:3333:5: lv_num3_6_0= RULE_ID
                    {
                    lv_num3_6_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_num3_6_0, grammarAccess.getBGMSegmentAccess().getNum3IDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBGMSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"num3",
                    						lv_num3_6_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:3349:3: ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3350:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3350:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3351:5: lv_lineEnd_7_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_7_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_7_0, grammarAccess.getBGMSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBGMSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_7_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleBGMSegment"


    // $ANTLR start "entryRulePATSegment"
    // InternalEdilang.g:3371:1: entryRulePATSegment returns [EObject current=null] : iv_rulePATSegment= rulePATSegment EOF ;
    public final EObject entryRulePATSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePATSegment = null;


        try {
            // InternalEdilang.g:3371:51: (iv_rulePATSegment= rulePATSegment EOF )
            // InternalEdilang.g:3372:2: iv_rulePATSegment= rulePATSegment EOF
            {
             newCompositeNode(grammarAccess.getPATSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePATSegment=rulePATSegment();

            state._fsp--;

             current =iv_rulePATSegment; 
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
    // $ANTLR end "entryRulePATSegment"


    // $ANTLR start "rulePATSegment"
    // InternalEdilang.g:3378:1: rulePATSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject rulePATSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_segmentCount_2_0=null;
        Token lv_lineEnd_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3384:2: ( ( ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3385:2: ( ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3385:2: ( ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3386:3: ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3386:3: ( (lv_segment_0_0= 'PAT' ) )
            // InternalEdilang.g:3387:4: (lv_segment_0_0= 'PAT' )
            {
            // InternalEdilang.g:3387:4: (lv_segment_0_0= 'PAT' )
            // InternalEdilang.g:3388:5: lv_segment_0_0= 'PAT'
            {
            lv_segment_0_0=(Token)match(input,36,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getPATSegmentAccess().getSegmentPATKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPATSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "PAT");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getPATSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3404:3: ( (lv_segmentCount_2_0= RULE_ID ) )
            // InternalEdilang.g:3405:4: (lv_segmentCount_2_0= RULE_ID )
            {
            // InternalEdilang.g:3405:4: (lv_segmentCount_2_0= RULE_ID )
            // InternalEdilang.g:3406:5: lv_segmentCount_2_0= RULE_ID
            {
            lv_segmentCount_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_segmentCount_2_0, grammarAccess.getPATSegmentAccess().getSegmentCountIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPATSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"segmentCount",
            						lv_segmentCount_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:3422:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3423:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3423:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3424:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_3_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_3_0, grammarAccess.getPATSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPATSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_3_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "rulePATSegment"


    // $ANTLR start "entryRuleFTXSegment"
    // InternalEdilang.g:3444:1: entryRuleFTXSegment returns [EObject current=null] : iv_ruleFTXSegment= ruleFTXSegment EOF ;
    public final EObject entryRuleFTXSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTXSegment = null;


        try {
            // InternalEdilang.g:3444:51: (iv_ruleFTXSegment= ruleFTXSegment EOF )
            // InternalEdilang.g:3445:2: iv_ruleFTXSegment= ruleFTXSegment EOF
            {
             newCompositeNode(grammarAccess.getFTXSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTXSegment=ruleFTXSegment();

            state._fsp--;

             current =iv_ruleFTXSegment; 
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
    // $ANTLR end "entryRuleFTXSegment"


    // $ANTLR start "ruleFTXSegment"
    // InternalEdilang.g:3451:1: ruleFTXSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleFTXSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_todo1_2_0=null;
        Token this_PLUS_3=null;
        Token lv_todo2_4_0=null;
        Token this_PLUS_5=null;
        Token lv_todo3_6_0=null;
        Token this_PLUS_7=null;
        Token lv_todo4_8_0=null;
        Token lv_lineEnd_9_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3457:2: ( ( ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3458:2: ( ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3458:2: ( ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3459:3: ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3459:3: ( (lv_segment_0_0= 'FTX' ) )
            // InternalEdilang.g:3460:4: (lv_segment_0_0= 'FTX' )
            {
            // InternalEdilang.g:3460:4: (lv_segment_0_0= 'FTX' )
            // InternalEdilang.g:3461:5: lv_segment_0_0= 'FTX'
            {
            lv_segment_0_0=(Token)match(input,37,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getFTXSegmentAccess().getSegmentFTXKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTXSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "FTX");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_1, grammarAccess.getFTXSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3477:3: ( (lv_todo1_2_0= RULE_ID ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalEdilang.g:3478:4: (lv_todo1_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:3478:4: (lv_todo1_2_0= RULE_ID )
                    // InternalEdilang.g:3479:5: lv_todo1_2_0= RULE_ID
                    {
                    lv_todo1_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_todo1_2_0, grammarAccess.getFTXSegmentAccess().getTodo1IDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFTXSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"todo1",
                    						lv_todo1_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_3, grammarAccess.getFTXSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:3499:3: ( (lv_todo2_4_0= RULE_ID ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalEdilang.g:3500:4: (lv_todo2_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:3500:4: (lv_todo2_4_0= RULE_ID )
                    // InternalEdilang.g:3501:5: lv_todo2_4_0= RULE_ID
                    {
                    lv_todo2_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_todo2_4_0, grammarAccess.getFTXSegmentAccess().getTodo2IDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFTXSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"todo2",
                    						lv_todo2_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_5, grammarAccess.getFTXSegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:3521:3: ( (lv_todo3_6_0= RULE_ID ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalEdilang.g:3522:4: (lv_todo3_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:3522:4: (lv_todo3_6_0= RULE_ID )
                    // InternalEdilang.g:3523:5: lv_todo3_6_0= RULE_ID
                    {
                    lv_todo3_6_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_todo3_6_0, grammarAccess.getFTXSegmentAccess().getTodo3IDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFTXSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"todo3",
                    						lv_todo3_6_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_7, grammarAccess.getFTXSegmentAccess().getPLUSTerminalRuleCall_7());
            		
            // InternalEdilang.g:3543:3: ( (lv_todo4_8_0= RULE_ID ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalEdilang.g:3544:4: (lv_todo4_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:3544:4: (lv_todo4_8_0= RULE_ID )
                    // InternalEdilang.g:3545:5: lv_todo4_8_0= RULE_ID
                    {
                    lv_todo4_8_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_todo4_8_0, grammarAccess.getFTXSegmentAccess().getTodo4IDTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFTXSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"todo4",
                    						lv_todo4_8_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:3561:3: ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3562:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3562:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3563:5: lv_lineEnd_9_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_9_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_9_0, grammarAccess.getFTXSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTXSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_9_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleFTXSegment"


    // $ANTLR start "entryRuleERCSegment"
    // InternalEdilang.g:3583:1: entryRuleERCSegment returns [EObject current=null] : iv_ruleERCSegment= ruleERCSegment EOF ;
    public final EObject entryRuleERCSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERCSegment = null;


        try {
            // InternalEdilang.g:3583:51: (iv_ruleERCSegment= ruleERCSegment EOF )
            // InternalEdilang.g:3584:2: iv_ruleERCSegment= ruleERCSegment EOF
            {
             newCompositeNode(grammarAccess.getERCSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERCSegment=ruleERCSegment();

            state._fsp--;

             current =iv_ruleERCSegment; 
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
    // $ANTLR end "entryRuleERCSegment"


    // $ANTLR start "ruleERCSegment"
    // InternalEdilang.g:3590:1: ruleERCSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'ERC' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleERCSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_code1_2_0=null;
        Token lv_lineEnd_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3596:2: ( ( ( (lv_segment_0_0= 'ERC' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3597:2: ( ( (lv_segment_0_0= 'ERC' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3597:2: ( ( (lv_segment_0_0= 'ERC' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3598:3: ( (lv_segment_0_0= 'ERC' ) ) this_PLUS_1= RULE_PLUS ( (lv_code1_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3598:3: ( (lv_segment_0_0= 'ERC' ) )
            // InternalEdilang.g:3599:4: (lv_segment_0_0= 'ERC' )
            {
            // InternalEdilang.g:3599:4: (lv_segment_0_0= 'ERC' )
            // InternalEdilang.g:3600:5: lv_segment_0_0= 'ERC'
            {
            lv_segment_0_0=(Token)match(input,38,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getERCSegmentAccess().getSegmentERCKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERCSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "ERC");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getERCSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3616:3: ( (lv_code1_2_0= RULE_ID ) )
            // InternalEdilang.g:3617:4: (lv_code1_2_0= RULE_ID )
            {
            // InternalEdilang.g:3617:4: (lv_code1_2_0= RULE_ID )
            // InternalEdilang.g:3618:5: lv_code1_2_0= RULE_ID
            {
            lv_code1_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_code1_2_0, grammarAccess.getERCSegmentAccess().getCode1IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERCSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code1",
            						lv_code1_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:3634:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3635:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3635:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3636:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_3_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_3_0, grammarAccess.getERCSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERCSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_3_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleERCSegment"


    // $ANTLR start "entryRuleCNTSegment"
    // InternalEdilang.g:3656:1: entryRuleCNTSegment returns [EObject current=null] : iv_ruleCNTSegment= ruleCNTSegment EOF ;
    public final EObject entryRuleCNTSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCNTSegment = null;


        try {
            // InternalEdilang.g:3656:51: (iv_ruleCNTSegment= ruleCNTSegment EOF )
            // InternalEdilang.g:3657:2: iv_ruleCNTSegment= ruleCNTSegment EOF
            {
             newCompositeNode(grammarAccess.getCNTSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCNTSegment=ruleCNTSegment();

            state._fsp--;

             current =iv_ruleCNTSegment; 
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
    // $ANTLR end "entryRuleCNTSegment"


    // $ANTLR start "ruleCNTSegment"
    // InternalEdilang.g:3663:1: ruleCNTSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleCNTSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_todo1_2_0=null;
        Token this_COLON_3=null;
        Token lv_todo2_4_0=null;
        Token lv_lineEnd_5_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3669:2: ( ( ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3670:2: ( ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3670:2: ( ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3671:3: ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3671:3: ( (lv_segment_0_0= 'CNT' ) )
            // InternalEdilang.g:3672:4: (lv_segment_0_0= 'CNT' )
            {
            // InternalEdilang.g:3672:4: (lv_segment_0_0= 'CNT' )
            // InternalEdilang.g:3673:5: lv_segment_0_0= 'CNT'
            {
            lv_segment_0_0=(Token)match(input,39,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getCNTSegmentAccess().getSegmentCNTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCNTSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "CNT");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_18); 

            			newLeafNode(this_PLUS_1, grammarAccess.getCNTSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3689:3: ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_COLON||LA86_0==RULE_ID) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalEdilang.g:3690:4: ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )?
                    {
                    // InternalEdilang.g:3690:4: ( (lv_todo1_2_0= RULE_ID ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_ID) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalEdilang.g:3691:5: (lv_todo1_2_0= RULE_ID )
                            {
                            // InternalEdilang.g:3691:5: (lv_todo1_2_0= RULE_ID )
                            // InternalEdilang.g:3692:6: lv_todo1_2_0= RULE_ID
                            {
                            lv_todo1_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                            						newLeafNode(lv_todo1_2_0, grammarAccess.getCNTSegmentAccess().getTodo1IDTerminalRuleCall_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCNTSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"todo1",
                            							lv_todo1_2_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_12); 

                    				newLeafNode(this_COLON_3, grammarAccess.getCNTSegmentAccess().getCOLONTerminalRuleCall_2_1());
                    			
                    // InternalEdilang.g:3712:4: ( (lv_todo2_4_0= RULE_ID ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_ID) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalEdilang.g:3713:5: (lv_todo2_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:3713:5: (lv_todo2_4_0= RULE_ID )
                            // InternalEdilang.g:3714:6: lv_todo2_4_0= RULE_ID
                            {
                            lv_todo2_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                            						newLeafNode(lv_todo2_4_0, grammarAccess.getCNTSegmentAccess().getTodo2IDTerminalRuleCall_2_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCNTSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"todo2",
                            							lv_todo2_4_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:3731:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3732:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3732:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3733:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getCNTSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCNTSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleCNTSegment"


    // $ANTLR start "entryRuleCTASegment"
    // InternalEdilang.g:3753:1: entryRuleCTASegment returns [EObject current=null] : iv_ruleCTASegment= ruleCTASegment EOF ;
    public final EObject entryRuleCTASegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTASegment = null;


        try {
            // InternalEdilang.g:3753:51: (iv_ruleCTASegment= ruleCTASegment EOF )
            // InternalEdilang.g:3754:2: iv_ruleCTASegment= ruleCTASegment EOF
            {
             newCompositeNode(grammarAccess.getCTASegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCTASegment=ruleCTASegment();

            state._fsp--;

             current =iv_ruleCTASegment; 
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
    // $ANTLR end "entryRuleCTASegment"


    // $ANTLR start "ruleCTASegment"
    // InternalEdilang.g:3760:1: ruleCTASegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleCTASegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_todo_2_0=null;
        Token lv_lineEnd_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3766:2: ( ( ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3767:2: ( ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3767:2: ( ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3768:3: ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3768:3: ( (lv_segment_0_0= 'CTA' ) )
            // InternalEdilang.g:3769:4: (lv_segment_0_0= 'CTA' )
            {
            // InternalEdilang.g:3769:4: (lv_segment_0_0= 'CTA' )
            // InternalEdilang.g:3770:5: lv_segment_0_0= 'CTA'
            {
            lv_segment_0_0=(Token)match(input,40,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getCTASegmentAccess().getSegmentCTAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCTASegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "CTA");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_1, grammarAccess.getCTASegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3786:3: ( (lv_todo_2_0= RULE_ID ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalEdilang.g:3787:4: (lv_todo_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:3787:4: (lv_todo_2_0= RULE_ID )
                    // InternalEdilang.g:3788:5: lv_todo_2_0= RULE_ID
                    {
                    lv_todo_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_todo_2_0, grammarAccess.getCTASegmentAccess().getTodoIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCTASegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"todo",
                    						lv_todo_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:3804:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3805:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3805:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3806:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_3_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_3_0, grammarAccess.getCTASegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCTASegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_3_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleCTASegment"


    // $ANTLR start "entryRulePCISegment"
    // InternalEdilang.g:3826:1: entryRulePCISegment returns [EObject current=null] : iv_rulePCISegment= rulePCISegment EOF ;
    public final EObject entryRulePCISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePCISegment = null;


        try {
            // InternalEdilang.g:3826:51: (iv_rulePCISegment= rulePCISegment EOF )
            // InternalEdilang.g:3827:2: iv_rulePCISegment= rulePCISegment EOF
            {
             newCompositeNode(grammarAccess.getPCISegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePCISegment=rulePCISegment();

            state._fsp--;

             current =iv_rulePCISegment; 
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
    // $ANTLR end "entryRulePCISegment"


    // $ANTLR start "rulePCISegment"
    // InternalEdilang.g:3833:1: rulePCISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject rulePCISegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_todo_2_0=null;
        Token lv_lineEnd_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3839:2: ( ( ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3840:2: ( ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3840:2: ( ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3841:3: ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3841:3: ( (lv_segment_0_0= 'PCI' ) )
            // InternalEdilang.g:3842:4: (lv_segment_0_0= 'PCI' )
            {
            // InternalEdilang.g:3842:4: (lv_segment_0_0= 'PCI' )
            // InternalEdilang.g:3843:5: lv_segment_0_0= 'PCI'
            {
            lv_segment_0_0=(Token)match(input,41,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getPCISegmentAccess().getSegmentPCIKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPCISegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "PCI");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_1, grammarAccess.getPCISegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3859:3: ( (lv_todo_2_0= RULE_ID ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalEdilang.g:3860:4: (lv_todo_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:3860:4: (lv_todo_2_0= RULE_ID )
                    // InternalEdilang.g:3861:5: lv_todo_2_0= RULE_ID
                    {
                    lv_todo_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_todo_2_0, grammarAccess.getPCISegmentAccess().getTodoIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPCISegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"todo",
                    						lv_todo_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:3877:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3878:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3878:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3879:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_3_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_3_0, grammarAccess.getPCISegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPCISegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_3_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "rulePCISegment"


    // $ANTLR start "entryRuleUNSSegment"
    // InternalEdilang.g:3899:1: entryRuleUNSSegment returns [EObject current=null] : iv_ruleUNSSegment= ruleUNSSegment EOF ;
    public final EObject entryRuleUNSSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNSSegment = null;


        try {
            // InternalEdilang.g:3899:51: (iv_ruleUNSSegment= ruleUNSSegment EOF )
            // InternalEdilang.g:3900:2: iv_ruleUNSSegment= ruleUNSSegment EOF
            {
             newCompositeNode(grammarAccess.getUNSSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNSSegment=ruleUNSSegment();

            state._fsp--;

             current =iv_ruleUNSSegment; 
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
    // $ANTLR end "entryRuleUNSSegment"


    // $ANTLR start "ruleUNSSegment"
    // InternalEdilang.g:3906:1: ruleUNSSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleUNSSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_segmentCount_2_0=null;
        Token lv_lineEnd_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3912:2: ( ( ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3913:2: ( ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3913:2: ( ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3914:3: ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3914:3: ( (lv_segment_0_0= 'UNS' ) )
            // InternalEdilang.g:3915:4: (lv_segment_0_0= 'UNS' )
            {
            // InternalEdilang.g:3915:4: (lv_segment_0_0= 'UNS' )
            // InternalEdilang.g:3916:5: lv_segment_0_0= 'UNS'
            {
            lv_segment_0_0=(Token)match(input,42,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getUNSSegmentAccess().getSegmentUNSKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNSSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "UNS");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_1, grammarAccess.getUNSSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3932:3: ( (lv_segmentCount_2_0= RULE_ID ) )
            // InternalEdilang.g:3933:4: (lv_segmentCount_2_0= RULE_ID )
            {
            // InternalEdilang.g:3933:4: (lv_segmentCount_2_0= RULE_ID )
            // InternalEdilang.g:3934:5: lv_segmentCount_2_0= RULE_ID
            {
            lv_segmentCount_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_segmentCount_2_0, grammarAccess.getUNSSegmentAccess().getSegmentCountIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNSSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"segmentCount",
            						lv_segmentCount_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:3950:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3951:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3951:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3952:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_3_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_3_0, grammarAccess.getUNSSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNSSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_3_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleUNSSegment"


    // $ANTLR start "entryRuleUNTSegment"
    // InternalEdilang.g:3972:1: entryRuleUNTSegment returns [EObject current=null] : iv_ruleUNTSegment= ruleUNTSegment EOF ;
    public final EObject entryRuleUNTSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNTSegment = null;


        try {
            // InternalEdilang.g:3972:51: (iv_ruleUNTSegment= ruleUNTSegment EOF )
            // InternalEdilang.g:3973:2: iv_ruleUNTSegment= ruleUNTSegment EOF
            {
             newCompositeNode(grammarAccess.getUNTSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNTSegment=ruleUNTSegment();

            state._fsp--;

             current =iv_ruleUNTSegment; 
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
    // $ANTLR end "entryRuleUNTSegment"


    // $ANTLR start "ruleUNTSegment"
    // InternalEdilang.g:3979:1: ruleUNTSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleUNTSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_segmentCount_2_0=null;
        Token this_PLUS_3=null;
        Token lv_messageReferenceNumber_4_0=null;
        Token lv_lineEnd_5_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3985:2: ( ( ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3986:2: ( ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3986:2: ( ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3987:3: ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3987:3: ( (lv_segment_0_0= 'UNT' ) )
            // InternalEdilang.g:3988:4: (lv_segment_0_0= 'UNT' )
            {
            // InternalEdilang.g:3988:4: (lv_segment_0_0= 'UNT' )
            // InternalEdilang.g:3989:5: lv_segment_0_0= 'UNT'
            {
            lv_segment_0_0=(Token)match(input,43,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getUNTSegmentAccess().getSegmentUNTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNTSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "UNT");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_1, grammarAccess.getUNTSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:4005:3: ( (lv_segmentCount_2_0= RULE_ID ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalEdilang.g:4006:4: (lv_segmentCount_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4006:4: (lv_segmentCount_2_0= RULE_ID )
                    // InternalEdilang.g:4007:5: lv_segmentCount_2_0= RULE_ID
                    {
                    lv_segmentCount_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_segmentCount_2_0, grammarAccess.getUNTSegmentAccess().getSegmentCountIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUNTSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"segmentCount",
                    						lv_segmentCount_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_3, grammarAccess.getUNTSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:4027:3: ( (lv_messageReferenceNumber_4_0= RULE_ID ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalEdilang.g:4028:4: (lv_messageReferenceNumber_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4028:4: (lv_messageReferenceNumber_4_0= RULE_ID )
                    // InternalEdilang.g:4029:5: lv_messageReferenceNumber_4_0= RULE_ID
                    {
                    lv_messageReferenceNumber_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_messageReferenceNumber_4_0, grammarAccess.getUNTSegmentAccess().getMessageReferenceNumberIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUNTSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"messageReferenceNumber",
                    						lv_messageReferenceNumber_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:4045:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:4046:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:4046:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:4047:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getUNTSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNTSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleUNTSegment"


    // $ANTLR start "entryRuleUNZSegment"
    // InternalEdilang.g:4067:1: entryRuleUNZSegment returns [EObject current=null] : iv_ruleUNZSegment= ruleUNZSegment EOF ;
    public final EObject entryRuleUNZSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNZSegment = null;


        try {
            // InternalEdilang.g:4067:51: (iv_ruleUNZSegment= ruleUNZSegment EOF )
            // InternalEdilang.g:4068:2: iv_ruleUNZSegment= ruleUNZSegment EOF
            {
             newCompositeNode(grammarAccess.getUNZSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNZSegment=ruleUNZSegment();

            state._fsp--;

             current =iv_ruleUNZSegment; 
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
    // $ANTLR end "entryRuleUNZSegment"


    // $ANTLR start "ruleUNZSegment"
    // InternalEdilang.g:4074:1: ruleUNZSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleUNZSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_interchangeControlCount_2_0=null;
        Token this_PLUS_3=null;
        Token lv_interchangeControlRef_4_0=null;
        Token lv_lineEnd_5_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4080:2: ( ( ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:4081:2: ( ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:4081:2: ( ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:4082:3: ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:4082:3: ( (lv_segment_0_0= 'UNZ' ) )
            // InternalEdilang.g:4083:4: (lv_segment_0_0= 'UNZ' )
            {
            // InternalEdilang.g:4083:4: (lv_segment_0_0= 'UNZ' )
            // InternalEdilang.g:4084:5: lv_segment_0_0= 'UNZ'
            {
            lv_segment_0_0=(Token)match(input,44,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getUNZSegmentAccess().getSegmentUNZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNZSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "UNZ");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_1, grammarAccess.getUNZSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:4100:3: ( (lv_interchangeControlCount_2_0= RULE_ID ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_ID) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalEdilang.g:4101:4: (lv_interchangeControlCount_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4101:4: (lv_interchangeControlCount_2_0= RULE_ID )
                    // InternalEdilang.g:4102:5: lv_interchangeControlCount_2_0= RULE_ID
                    {
                    lv_interchangeControlCount_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_interchangeControlCount_2_0, grammarAccess.getUNZSegmentAccess().getInterchangeControlCountIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUNZSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"interchangeControlCount",
                    						lv_interchangeControlCount_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_3, grammarAccess.getUNZSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:4122:3: ( (lv_interchangeControlRef_4_0= RULE_ID ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalEdilang.g:4123:4: (lv_interchangeControlRef_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4123:4: (lv_interchangeControlRef_4_0= RULE_ID )
                    // InternalEdilang.g:4124:5: lv_interchangeControlRef_4_0= RULE_ID
                    {
                    lv_interchangeControlRef_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_interchangeControlRef_4_0, grammarAccess.getUNZSegmentAccess().getInterchangeControlRefIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUNZSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"interchangeControlRef",
                    						lv_interchangeControlRef_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:4140:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:4141:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:4141:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:4142:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_5_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_5_0, grammarAccess.getUNZSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNZSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_5_0,
            						"io.thlaegler.edifact.Edilang.QUOTE_AND_NL");
            				

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
    // $ANTLR end "ruleUNZSegment"


    // $ANTLR start "entryRulePRIFunction"
    // InternalEdilang.g:4162:1: entryRulePRIFunction returns [EObject current=null] : iv_rulePRIFunction= rulePRIFunction EOF ;
    public final EObject entryRulePRIFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRIFunction = null;


        try {
            // InternalEdilang.g:4162:52: (iv_rulePRIFunction= rulePRIFunction EOF )
            // InternalEdilang.g:4163:2: iv_rulePRIFunction= rulePRIFunction EOF
            {
             newCompositeNode(grammarAccess.getPRIFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePRIFunction=rulePRIFunction();

            state._fsp--;

             current =iv_rulePRIFunction; 
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
    // $ANTLR end "entryRulePRIFunction"


    // $ANTLR start "rulePRIFunction"
    // InternalEdilang.g:4169:1: rulePRIFunction returns [EObject current=null] : ( ( (lv_code1_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_code2_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_code3_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_code4_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_code5_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_code6_10_0= RULE_ID ) )? ) ;
    public final EObject rulePRIFunction() throws RecognitionException {
        EObject current = null;

        Token lv_code1_0_0=null;
        Token this_COLON_1=null;
        Token lv_code2_2_0=null;
        Token this_COLON_3=null;
        Token lv_code3_4_0=null;
        Token this_COLON_5=null;
        Token lv_code4_6_0=null;
        Token this_COLON_7=null;
        Token lv_code5_8_0=null;
        Token this_COLON_9=null;
        Token lv_code6_10_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4175:2: ( ( ( (lv_code1_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_code2_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_code3_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_code4_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_code5_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_code6_10_0= RULE_ID ) )? ) )
            // InternalEdilang.g:4176:2: ( ( (lv_code1_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_code2_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_code3_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_code4_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_code5_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_code6_10_0= RULE_ID ) )? )
            {
            // InternalEdilang.g:4176:2: ( ( (lv_code1_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_code2_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_code3_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_code4_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_code5_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_code6_10_0= RULE_ID ) )? )
            // InternalEdilang.g:4177:3: ( (lv_code1_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_code2_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_code3_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_code4_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_code5_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_code6_10_0= RULE_ID ) )?
            {
            // InternalEdilang.g:4177:3: ( (lv_code1_0_0= RULE_ID ) )
            // InternalEdilang.g:4178:4: (lv_code1_0_0= RULE_ID )
            {
            // InternalEdilang.g:4178:4: (lv_code1_0_0= RULE_ID )
            // InternalEdilang.g:4179:5: lv_code1_0_0= RULE_ID
            {
            lv_code1_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_code1_0_0, grammarAccess.getPRIFunctionAccess().getCode1IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPRIFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code1",
            						lv_code1_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_1, grammarAccess.getPRIFunctionAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:4199:3: ( (lv_code2_2_0= RULE_ID ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalEdilang.g:4200:4: (lv_code2_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4200:4: (lv_code2_2_0= RULE_ID )
                    // InternalEdilang.g:4201:5: lv_code2_2_0= RULE_ID
                    {
                    lv_code2_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_code2_2_0, grammarAccess.getPRIFunctionAccess().getCode2IDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPRIFunctionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"code2",
                    						lv_code2_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_3, grammarAccess.getPRIFunctionAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalEdilang.g:4221:3: ( (lv_code3_4_0= RULE_ID ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalEdilang.g:4222:4: (lv_code3_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4222:4: (lv_code3_4_0= RULE_ID )
                    // InternalEdilang.g:4223:5: lv_code3_4_0= RULE_ID
                    {
                    lv_code3_4_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_code3_4_0, grammarAccess.getPRIFunctionAccess().getCode3IDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPRIFunctionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"code3",
                    						lv_code3_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_5, grammarAccess.getPRIFunctionAccess().getCOLONTerminalRuleCall_5());
            		
            // InternalEdilang.g:4243:3: ( (lv_code4_6_0= RULE_ID ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalEdilang.g:4244:4: (lv_code4_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:4244:4: (lv_code4_6_0= RULE_ID )
                    // InternalEdilang.g:4245:5: lv_code4_6_0= RULE_ID
                    {
                    lv_code4_6_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_code4_6_0, grammarAccess.getPRIFunctionAccess().getCode4IDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPRIFunctionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"code4",
                    						lv_code4_6_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_7, grammarAccess.getPRIFunctionAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalEdilang.g:4265:3: ( (lv_code5_8_0= RULE_ID ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalEdilang.g:4266:4: (lv_code5_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:4266:4: (lv_code5_8_0= RULE_ID )
                    // InternalEdilang.g:4267:5: lv_code5_8_0= RULE_ID
                    {
                    lv_code5_8_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_code5_8_0, grammarAccess.getPRIFunctionAccess().getCode5IDTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPRIFunctionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"code5",
                    						lv_code5_8_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_9=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_9, grammarAccess.getPRIFunctionAccess().getCOLONTerminalRuleCall_9());
            		
            // InternalEdilang.g:4287:3: ( (lv_code6_10_0= RULE_ID ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ID) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalEdilang.g:4288:4: (lv_code6_10_0= RULE_ID )
                    {
                    // InternalEdilang.g:4288:4: (lv_code6_10_0= RULE_ID )
                    // InternalEdilang.g:4289:5: lv_code6_10_0= RULE_ID
                    {
                    lv_code6_10_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_code6_10_0, grammarAccess.getPRIFunctionAccess().getCode6IDTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPRIFunctionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"code6",
                    						lv_code6_10_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "rulePRIFunction"


    // $ANTLR start "entryRuleMessageBodyFunction"
    // InternalEdilang.g:4309:1: entryRuleMessageBodyFunction returns [EObject current=null] : iv_ruleMessageBodyFunction= ruleMessageBodyFunction EOF ;
    public final EObject entryRuleMessageBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageBodyFunction = null;


        try {
            // InternalEdilang.g:4309:60: (iv_ruleMessageBodyFunction= ruleMessageBodyFunction EOF )
            // InternalEdilang.g:4310:2: iv_ruleMessageBodyFunction= ruleMessageBodyFunction EOF
            {
             newCompositeNode(grammarAccess.getMessageBodyFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageBodyFunction=ruleMessageBodyFunction();

            state._fsp--;

             current =iv_ruleMessageBodyFunction; 
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
    // $ANTLR end "entryRuleMessageBodyFunction"


    // $ANTLR start "ruleMessageBodyFunction"
    // InternalEdilang.g:4316:1: ruleMessageBodyFunction returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )? ) ;
    public final EObject ruleMessageBodyFunction() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token this_COLON_1=null;
        Token lv_version_2_0=null;
        Token this_COLON_3=null;
        Token lv_release_4_0=null;
        Token this_COLON_5=null;
        Token lv_controllingAgency_6_0=null;
        Token this_COLON_7=null;
        Token lv_more_8_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4322:2: ( ( ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )? ) )
            // InternalEdilang.g:4323:2: ( ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )? )
            {
            // InternalEdilang.g:4323:2: ( ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )? )
            // InternalEdilang.g:4324:3: ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )?
            {
            // InternalEdilang.g:4324:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalEdilang.g:4325:4: (lv_type_0_0= RULE_ID )
            {
            // InternalEdilang.g:4325:4: (lv_type_0_0= RULE_ID )
            // InternalEdilang.g:4326:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_type_0_0, grammarAccess.getMessageBodyFunctionAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageBodyFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_1, grammarAccess.getMessageBodyFunctionAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:4346:3: ( (lv_version_2_0= RULE_ID ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalEdilang.g:4347:4: (lv_version_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4347:4: (lv_version_2_0= RULE_ID )
                    // InternalEdilang.g:4348:5: lv_version_2_0= RULE_ID
                    {
                    lv_version_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_version_2_0, grammarAccess.getMessageBodyFunctionAccess().getVersionIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageBodyFunctionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"version",
                    						lv_version_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_3, grammarAccess.getMessageBodyFunctionAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalEdilang.g:4368:3: ( (lv_release_4_0= RULE_ID ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalEdilang.g:4369:4: (lv_release_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4369:4: (lv_release_4_0= RULE_ID )
                    // InternalEdilang.g:4370:5: lv_release_4_0= RULE_ID
                    {
                    lv_release_4_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_release_4_0, grammarAccess.getMessageBodyFunctionAccess().getReleaseIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageBodyFunctionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"release",
                    						lv_release_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_21); 

            			newLeafNode(this_COLON_5, grammarAccess.getMessageBodyFunctionAccess().getCOLONTerminalRuleCall_5());
            		
            // InternalEdilang.g:4390:3: ( (lv_controllingAgency_6_0= RULE_ID ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_ID) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalEdilang.g:4391:4: (lv_controllingAgency_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:4391:4: (lv_controllingAgency_6_0= RULE_ID )
                    // InternalEdilang.g:4392:5: lv_controllingAgency_6_0= RULE_ID
                    {
                    lv_controllingAgency_6_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    					newLeafNode(lv_controllingAgency_6_0, grammarAccess.getMessageBodyFunctionAccess().getControllingAgencyIDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageBodyFunctionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"controllingAgency",
                    						lv_controllingAgency_6_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:4408:3: (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_COLON) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalEdilang.g:4409:4: this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) )
                    {
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_7, grammarAccess.getMessageBodyFunctionAccess().getCOLONTerminalRuleCall_7_0());
                    			
                    // InternalEdilang.g:4413:4: ( (lv_more_8_0= RULE_ID ) )
                    // InternalEdilang.g:4414:5: (lv_more_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:4414:5: (lv_more_8_0= RULE_ID )
                    // InternalEdilang.g:4415:6: lv_more_8_0= RULE_ID
                    {
                    lv_more_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_more_8_0, grammarAccess.getMessageBodyFunctionAccess().getMoreIDTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageBodyFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"more",
                    							lv_more_8_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMessageBodyFunction"


    // $ANTLR start "entryRuleMSGFunction"
    // InternalEdilang.g:4436:1: entryRuleMSGFunction returns [EObject current=null] : iv_ruleMSGFunction= ruleMSGFunction EOF ;
    public final EObject entryRuleMSGFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMSGFunction = null;


        try {
            // InternalEdilang.g:4436:52: (iv_ruleMSGFunction= ruleMSGFunction EOF )
            // InternalEdilang.g:4437:2: iv_ruleMSGFunction= ruleMSGFunction EOF
            {
             newCompositeNode(grammarAccess.getMSGFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMSGFunction=ruleMSGFunction();

            state._fsp--;

             current =iv_ruleMSGFunction; 
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
    // $ANTLR end "entryRuleMSGFunction"


    // $ANTLR start "ruleMSGFunction"
    // InternalEdilang.g:4443:1: ruleMSGFunction returns [EObject current=null] : ( ( (lv_businessFunction_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_messageFunction1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_messageFunction2_6_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleMSGFunction() throws RecognitionException {
        EObject current = null;

        Token lv_businessFunction_0_0=null;
        Token this_COLON_1=null;
        Token lv_messageFunction1_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListResponsibleAgency_4_0=null;
        Token this_COLON_5=null;
        Token lv_messageFunction2_6_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4449:2: ( ( ( (lv_businessFunction_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_messageFunction1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_messageFunction2_6_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:4450:2: ( ( (lv_businessFunction_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_messageFunction1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_messageFunction2_6_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:4450:2: ( ( (lv_businessFunction_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_messageFunction1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_messageFunction2_6_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:4451:3: ( (lv_businessFunction_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_messageFunction1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_messageFunction2_6_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:4451:3: ( (lv_businessFunction_0_0= RULE_ID ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_ID) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalEdilang.g:4452:4: (lv_businessFunction_0_0= RULE_ID )
                    {
                    // InternalEdilang.g:4452:4: (lv_businessFunction_0_0= RULE_ID )
                    // InternalEdilang.g:4453:5: lv_businessFunction_0_0= RULE_ID
                    {
                    lv_businessFunction_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_businessFunction_0_0, grammarAccess.getMSGFunctionAccess().getBusinessFunctionIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMSGFunctionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"businessFunction",
                    						lv_businessFunction_0_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

            			newLeafNode(this_COLON_1, grammarAccess.getMSGFunctionAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:4473:3: ( (lv_messageFunction1_2_0= RULE_ID ) )
            // InternalEdilang.g:4474:4: (lv_messageFunction1_2_0= RULE_ID )
            {
            // InternalEdilang.g:4474:4: (lv_messageFunction1_2_0= RULE_ID )
            // InternalEdilang.g:4475:5: lv_messageFunction1_2_0= RULE_ID
            {
            lv_messageFunction1_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_messageFunction1_2_0, grammarAccess.getMSGFunctionAccess().getMessageFunction1IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMSGFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"messageFunction1",
            						lv_messageFunction1_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:4491:3: (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_messageFunction2_6_0= RULE_ID ) ) )? )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_COLON) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalEdilang.g:4492:4: this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_messageFunction2_6_0= RULE_ID ) ) )?
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getMSGFunctionAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:4496:4: ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) )
                    // InternalEdilang.g:4497:5: (lv_codeListResponsibleAgency_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4497:5: (lv_codeListResponsibleAgency_4_0= RULE_ID )
                    // InternalEdilang.g:4498:6: lv_codeListResponsibleAgency_4_0= RULE_ID
                    {
                    lv_codeListResponsibleAgency_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_codeListResponsibleAgency_4_0, grammarAccess.getMSGFunctionAccess().getCodeListResponsibleAgencyIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMSGFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"codeListResponsibleAgency",
                    							lv_codeListResponsibleAgency_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:4514:4: (this_COLON_5= RULE_COLON ( (lv_messageFunction2_6_0= RULE_ID ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==RULE_COLON) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalEdilang.g:4515:5: this_COLON_5= RULE_COLON ( (lv_messageFunction2_6_0= RULE_ID ) )
                            {
                            this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_5, grammarAccess.getMSGFunctionAccess().getCOLONTerminalRuleCall_3_2_0());
                            				
                            // InternalEdilang.g:4519:5: ( (lv_messageFunction2_6_0= RULE_ID ) )
                            // InternalEdilang.g:4520:6: (lv_messageFunction2_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:4520:6: (lv_messageFunction2_6_0= RULE_ID )
                            // InternalEdilang.g:4521:7: lv_messageFunction2_6_0= RULE_ID
                            {
                            lv_messageFunction2_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_messageFunction2_6_0, grammarAccess.getMSGFunctionAccess().getMessageFunction2IDTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMSGFunctionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"messageFunction2",
                            								lv_messageFunction2_6_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMSGFunction"


    // $ANTLR start "entryRuleProductFunction"
    // InternalEdilang.g:4543:1: entryRuleProductFunction returns [EObject current=null] : iv_ruleProductFunction= ruleProductFunction EOF ;
    public final EObject entryRuleProductFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFunction = null;


        try {
            // InternalEdilang.g:4543:56: (iv_ruleProductFunction= ruleProductFunction EOF )
            // InternalEdilang.g:4544:2: iv_ruleProductFunction= ruleProductFunction EOF
            {
             newCompositeNode(grammarAccess.getProductFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductFunction=ruleProductFunction();

            state._fsp--;

             current =iv_ruleProductFunction; 
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
    // $ANTLR end "entryRuleProductFunction"


    // $ANTLR start "ruleProductFunction"
    // InternalEdilang.g:4550:1: ruleProductFunction returns [EObject current=null] : ( ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleProductFunction() throws RecognitionException {
        EObject current = null;

        Token lv_bookingClass_0_0=null;
        Token this_COLON_1=null;
        Token lv_avail_2_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4556:2: ( ( ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )? ) )
            // InternalEdilang.g:4557:2: ( ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )? )
            {
            // InternalEdilang.g:4557:2: ( ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )? )
            // InternalEdilang.g:4558:3: ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )?
            {
            // InternalEdilang.g:4558:3: ( (lv_bookingClass_0_0= RULE_ID ) )
            // InternalEdilang.g:4559:4: (lv_bookingClass_0_0= RULE_ID )
            {
            // InternalEdilang.g:4559:4: (lv_bookingClass_0_0= RULE_ID )
            // InternalEdilang.g:4560:5: lv_bookingClass_0_0= RULE_ID
            {
            lv_bookingClass_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_bookingClass_0_0, grammarAccess.getProductFunctionAccess().getBookingClassIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bookingClass",
            						lv_bookingClass_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:4576:3: (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_COLON) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalEdilang.g:4577:4: this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) )
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getProductFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:4581:4: ( (lv_avail_2_0= RULE_ID ) )
                    // InternalEdilang.g:4582:5: (lv_avail_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4582:5: (lv_avail_2_0= RULE_ID )
                    // InternalEdilang.g:4583:6: lv_avail_2_0= RULE_ID
                    {
                    lv_avail_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_avail_2_0, grammarAccess.getProductFunctionAccess().getAvailIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProductFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"avail",
                    							lv_avail_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleProductFunction"


    // $ANTLR start "entryRuleSystemDetailFunction"
    // InternalEdilang.g:4604:1: entryRuleSystemDetailFunction returns [EObject current=null] : iv_ruleSystemDetailFunction= ruleSystemDetailFunction EOF ;
    public final EObject entryRuleSystemDetailFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDetailFunction = null;


        try {
            // InternalEdilang.g:4604:61: (iv_ruleSystemDetailFunction= ruleSystemDetailFunction EOF )
            // InternalEdilang.g:4605:2: iv_ruleSystemDetailFunction= ruleSystemDetailFunction EOF
            {
             newCompositeNode(grammarAccess.getSystemDetailFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemDetailFunction=ruleSystemDetailFunction();

            state._fsp--;

             current =iv_ruleSystemDetailFunction; 
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
    // $ANTLR end "entryRuleSystemDetailFunction"


    // $ANTLR start "ruleSystemDetailFunction"
    // InternalEdilang.g:4611:1: ruleSystemDetailFunction returns [EObject current=null] : ( ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleSystemDetailFunction() throws RecognitionException {
        EObject current = null;

        Token lv_companyIdentification_0_0=null;
        Token this_COLON_1=null;
        Token lv_locationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_locationName_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4617:2: ( ( ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:4618:2: ( ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:4618:2: ( ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:4619:3: ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:4619:3: ( (lv_companyIdentification_0_0= RULE_ID ) )
            // InternalEdilang.g:4620:4: (lv_companyIdentification_0_0= RULE_ID )
            {
            // InternalEdilang.g:4620:4: (lv_companyIdentification_0_0= RULE_ID )
            // InternalEdilang.g:4621:5: lv_companyIdentification_0_0= RULE_ID
            {
            lv_companyIdentification_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_companyIdentification_0_0, grammarAccess.getSystemDetailFunctionAccess().getCompanyIdentificationIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemDetailFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"companyIdentification",
            						lv_companyIdentification_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:4637:3: (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_COLON) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalEdilang.g:4638:4: this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getSystemDetailFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:4642:4: ( (lv_locationCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:4643:5: (lv_locationCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4643:5: (lv_locationCode_2_0= RULE_ID )
                    // InternalEdilang.g:4644:6: lv_locationCode_2_0= RULE_ID
                    {
                    lv_locationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_locationCode_2_0, grammarAccess.getSystemDetailFunctionAccess().getLocationCodeIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemDetailFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"locationCode",
                    							lv_locationCode_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:4660:4: (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==RULE_COLON) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalEdilang.g:4661:5: this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getSystemDetailFunctionAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:4665:5: ( (lv_locationName_4_0= RULE_ID ) )
                            // InternalEdilang.g:4666:6: (lv_locationName_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:4666:6: (lv_locationName_4_0= RULE_ID )
                            // InternalEdilang.g:4667:7: lv_locationName_4_0= RULE_ID
                            {
                            lv_locationName_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_locationName_4_0, grammarAccess.getSystemDetailFunctionAccess().getLocationNameIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSystemDetailFunctionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"locationName",
                            								lv_locationName_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSystemDetailFunction"


    // $ANTLR start "entryRuleOriginatorFunction"
    // InternalEdilang.g:4689:1: entryRuleOriginatorFunction returns [EObject current=null] : iv_ruleOriginatorFunction= ruleOriginatorFunction EOF ;
    public final EObject entryRuleOriginatorFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOriginatorFunction = null;


        try {
            // InternalEdilang.g:4689:59: (iv_ruleOriginatorFunction= ruleOriginatorFunction EOF )
            // InternalEdilang.g:4690:2: iv_ruleOriginatorFunction= ruleOriginatorFunction EOF
            {
             newCompositeNode(grammarAccess.getOriginatorFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOriginatorFunction=ruleOriginatorFunction();

            state._fsp--;

             current =iv_ruleOriginatorFunction; 
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
    // $ANTLR end "entryRuleOriginatorFunction"


    // $ANTLR start "ruleOriginatorFunction"
    // InternalEdilang.g:4696:1: ruleOriginatorFunction returns [EObject current=null] : ( ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleOriginatorFunction() throws RecognitionException {
        EObject current = null;

        Token lv_countryCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_currencyCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_languageCode_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4702:2: ( ( ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:4703:2: ( ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:4703:2: ( ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:4704:3: ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:4704:3: ( (lv_countryCode_0_0= RULE_ID ) )
            // InternalEdilang.g:4705:4: (lv_countryCode_0_0= RULE_ID )
            {
            // InternalEdilang.g:4705:4: (lv_countryCode_0_0= RULE_ID )
            // InternalEdilang.g:4706:5: lv_countryCode_0_0= RULE_ID
            {
            lv_countryCode_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_countryCode_0_0, grammarAccess.getOriginatorFunctionAccess().getCountryCodeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOriginatorFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"countryCode",
            						lv_countryCode_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:4722:3: (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_COLON) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalEdilang.g:4723:4: this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getOriginatorFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:4727:4: ( (lv_currencyCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:4728:5: (lv_currencyCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4728:5: (lv_currencyCode_2_0= RULE_ID )
                    // InternalEdilang.g:4729:6: lv_currencyCode_2_0= RULE_ID
                    {
                    lv_currencyCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_currencyCode_2_0, grammarAccess.getOriginatorFunctionAccess().getCurrencyCodeIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginatorFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"currencyCode",
                    							lv_currencyCode_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:4745:4: (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==RULE_COLON) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalEdilang.g:4746:5: this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getOriginatorFunctionAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:4750:5: ( (lv_languageCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:4751:6: (lv_languageCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:4751:6: (lv_languageCode_4_0= RULE_ID )
                            // InternalEdilang.g:4752:7: lv_languageCode_4_0= RULE_ID
                            {
                            lv_languageCode_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_languageCode_4_0, grammarAccess.getOriginatorFunctionAccess().getLanguageCodeIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOriginatorFunctionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"languageCode",
                            								lv_languageCode_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOriginatorFunction"


    // $ANTLR start "entryRuleOriginatorIdentificationFunction"
    // InternalEdilang.g:4774:1: entryRuleOriginatorIdentificationFunction returns [EObject current=null] : iv_ruleOriginatorIdentificationFunction= ruleOriginatorIdentificationFunction EOF ;
    public final EObject entryRuleOriginatorIdentificationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOriginatorIdentificationFunction = null;


        try {
            // InternalEdilang.g:4774:73: (iv_ruleOriginatorIdentificationFunction= ruleOriginatorIdentificationFunction EOF )
            // InternalEdilang.g:4775:2: iv_ruleOriginatorIdentificationFunction= ruleOriginatorIdentificationFunction EOF
            {
             newCompositeNode(grammarAccess.getOriginatorIdentificationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOriginatorIdentificationFunction=ruleOriginatorIdentificationFunction();

            state._fsp--;

             current =iv_ruleOriginatorIdentificationFunction; 
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
    // $ANTLR end "entryRuleOriginatorIdentificationFunction"


    // $ANTLR start "ruleOriginatorIdentificationFunction"
    // InternalEdilang.g:4781:1: ruleOriginatorIdentificationFunction returns [EObject current=null] : ( ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleOriginatorIdentificationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_travelAgentId_0_0=null;
        Token this_COLON_1=null;
        Token lv_inHouseId1_2_0=null;
        Token this_COLON_3=null;
        Token lv_inHouseId2_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4787:2: ( ( ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:4788:2: ( ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:4788:2: ( ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:4789:3: ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:4789:3: ( (lv_travelAgentId_0_0= RULE_ID ) )
            // InternalEdilang.g:4790:4: (lv_travelAgentId_0_0= RULE_ID )
            {
            // InternalEdilang.g:4790:4: (lv_travelAgentId_0_0= RULE_ID )
            // InternalEdilang.g:4791:5: lv_travelAgentId_0_0= RULE_ID
            {
            lv_travelAgentId_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_travelAgentId_0_0, grammarAccess.getOriginatorIdentificationFunctionAccess().getTravelAgentIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOriginatorIdentificationFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"travelAgentId",
            						lv_travelAgentId_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:4807:3: (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==RULE_COLON) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalEdilang.g:4808:4: this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_21); 

                    				newLeafNode(this_COLON_1, grammarAccess.getOriginatorIdentificationFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:4812:4: ( (lv_inHouseId1_2_0= RULE_ID ) )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==RULE_ID) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalEdilang.g:4813:5: (lv_inHouseId1_2_0= RULE_ID )
                            {
                            // InternalEdilang.g:4813:5: (lv_inHouseId1_2_0= RULE_ID )
                            // InternalEdilang.g:4814:6: lv_inHouseId1_2_0= RULE_ID
                            {
                            lv_inHouseId1_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            						newLeafNode(lv_inHouseId1_2_0, grammarAccess.getOriginatorIdentificationFunctionAccess().getInHouseId1IDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOriginatorIdentificationFunctionRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"inHouseId1",
                            							lv_inHouseId1_2_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    // InternalEdilang.g:4830:4: (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==RULE_COLON) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // InternalEdilang.g:4831:5: this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getOriginatorIdentificationFunctionAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:4835:5: ( (lv_inHouseId2_4_0= RULE_ID ) )
                            // InternalEdilang.g:4836:6: (lv_inHouseId2_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:4836:6: (lv_inHouseId2_4_0= RULE_ID )
                            // InternalEdilang.g:4837:7: lv_inHouseId2_4_0= RULE_ID
                            {
                            lv_inHouseId2_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_inHouseId2_4_0, grammarAccess.getOriginatorIdentificationFunctionAccess().getInHouseId2IDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOriginatorIdentificationFunctionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"inHouseId2",
                            								lv_inHouseId2_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOriginatorIdentificationFunction"


    // $ANTLR start "entryRuleLocationFunction"
    // InternalEdilang.g:4859:1: entryRuleLocationFunction returns [EObject current=null] : iv_ruleLocationFunction= ruleLocationFunction EOF ;
    public final EObject entryRuleLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationFunction = null;


        try {
            // InternalEdilang.g:4859:57: (iv_ruleLocationFunction= ruleLocationFunction EOF )
            // InternalEdilang.g:4860:2: iv_ruleLocationFunction= ruleLocationFunction EOF
            {
             newCompositeNode(grammarAccess.getLocationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocationFunction=ruleLocationFunction();

            state._fsp--;

             current =iv_ruleLocationFunction; 
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
    // $ANTLR end "entryRuleLocationFunction"


    // $ANTLR start "ruleLocationFunction"
    // InternalEdilang.g:4866:1: ruleLocationFunction returns [EObject current=null] : ( ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_locationId_0_0=null;
        Token this_COLON_1=null;
        Token lv_locationName_2_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4872:2: ( ( ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )? ) )
            // InternalEdilang.g:4873:2: ( ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )? )
            {
            // InternalEdilang.g:4873:2: ( ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )? )
            // InternalEdilang.g:4874:3: ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )?
            {
            // InternalEdilang.g:4874:3: ( (lv_locationId_0_0= RULE_ID ) )
            // InternalEdilang.g:4875:4: (lv_locationId_0_0= RULE_ID )
            {
            // InternalEdilang.g:4875:4: (lv_locationId_0_0= RULE_ID )
            // InternalEdilang.g:4876:5: lv_locationId_0_0= RULE_ID
            {
            lv_locationId_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_locationId_0_0, grammarAccess.getLocationFunctionAccess().getLocationIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locationId",
            						lv_locationId_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:4892:3: (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_COLON) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalEdilang.g:4893:4: this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) )
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getLocationFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:4897:4: ( (lv_locationName_2_0= RULE_ID ) )
                    // InternalEdilang.g:4898:5: (lv_locationName_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4898:5: (lv_locationName_2_0= RULE_ID )
                    // InternalEdilang.g:4899:6: lv_locationName_2_0= RULE_ID
                    {
                    lv_locationName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_locationName_2_0, grammarAccess.getLocationFunctionAccess().getLocationNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocationFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"locationName",
                    							lv_locationName_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleLocationFunction"


    // $ANTLR start "entryRuleInterchangerFunction"
    // InternalEdilang.g:4920:1: entryRuleInterchangerFunction returns [EObject current=null] : iv_ruleInterchangerFunction= ruleInterchangerFunction EOF ;
    public final EObject entryRuleInterchangerFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterchangerFunction = null;


        try {
            // InternalEdilang.g:4920:61: (iv_ruleInterchangerFunction= ruleInterchangerFunction EOF )
            // InternalEdilang.g:4921:2: iv_ruleInterchangerFunction= ruleInterchangerFunction EOF
            {
             newCompositeNode(grammarAccess.getInterchangerFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterchangerFunction=ruleInterchangerFunction();

            state._fsp--;

             current =iv_ruleInterchangerFunction; 
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
    // $ANTLR end "entryRuleInterchangerFunction"


    // $ANTLR start "ruleInterchangerFunction"
    // InternalEdilang.g:4927:1: ruleInterchangerFunction returns [EObject current=null] : ( ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleInterchangerFunction() throws RecognitionException {
        EObject current = null;

        Token lv_interchange_0_0=null;
        Token this_COLON_1=null;
        Token lv_interchange2_2_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4933:2: ( ( ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )? ) )
            // InternalEdilang.g:4934:2: ( ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )? )
            {
            // InternalEdilang.g:4934:2: ( ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )? )
            // InternalEdilang.g:4935:3: ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )?
            {
            // InternalEdilang.g:4935:3: ( (lv_interchange_0_0= RULE_ID ) )
            // InternalEdilang.g:4936:4: (lv_interchange_0_0= RULE_ID )
            {
            // InternalEdilang.g:4936:4: (lv_interchange_0_0= RULE_ID )
            // InternalEdilang.g:4937:5: lv_interchange_0_0= RULE_ID
            {
            lv_interchange_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_interchange_0_0, grammarAccess.getInterchangerFunctionAccess().getInterchangeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterchangerFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interchange",
            						lv_interchange_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:4953:3: (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_COLON) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalEdilang.g:4954:4: this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) )
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getInterchangerFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:4958:4: ( (lv_interchange2_2_0= RULE_ID ) )
                    // InternalEdilang.g:4959:5: (lv_interchange2_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4959:5: (lv_interchange2_2_0= RULE_ID )
                    // InternalEdilang.g:4960:6: lv_interchange2_2_0= RULE_ID
                    {
                    lv_interchange2_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_interchange2_2_0, grammarAccess.getInterchangerFunctionAccess().getInterchange2IDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterchangerFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"interchange2",
                    							lv_interchange2_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleInterchangerFunction"


    // $ANTLR start "entryRuleDateOnlyFunction"
    // InternalEdilang.g:4981:1: entryRuleDateOnlyFunction returns [EObject current=null] : iv_ruleDateOnlyFunction= ruleDateOnlyFunction EOF ;
    public final EObject entryRuleDateOnlyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateOnlyFunction = null;


        try {
            // InternalEdilang.g:4981:57: (iv_ruleDateOnlyFunction= ruleDateOnlyFunction EOF )
            // InternalEdilang.g:4982:2: iv_ruleDateOnlyFunction= ruleDateOnlyFunction EOF
            {
             newCompositeNode(grammarAccess.getDateOnlyFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateOnlyFunction=ruleDateOnlyFunction();

            state._fsp--;

             current =iv_ruleDateOnlyFunction; 
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
    // $ANTLR end "entryRuleDateOnlyFunction"


    // $ANTLR start "ruleDateOnlyFunction"
    // InternalEdilang.g:4988:1: ruleDateOnlyFunction returns [EObject current=null] : ( (lv_date6_0_0= RULE_ID ) ) ;
    public final EObject ruleDateOnlyFunction() throws RecognitionException {
        EObject current = null;

        Token lv_date6_0_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4994:2: ( ( (lv_date6_0_0= RULE_ID ) ) )
            // InternalEdilang.g:4995:2: ( (lv_date6_0_0= RULE_ID ) )
            {
            // InternalEdilang.g:4995:2: ( (lv_date6_0_0= RULE_ID ) )
            // InternalEdilang.g:4996:3: (lv_date6_0_0= RULE_ID )
            {
            // InternalEdilang.g:4996:3: (lv_date6_0_0= RULE_ID )
            // InternalEdilang.g:4997:4: lv_date6_0_0= RULE_ID
            {
            lv_date6_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_date6_0_0, grammarAccess.getDateOnlyFunctionAccess().getDate6IDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDateOnlyFunctionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"date6",
            					lv_date6_0_0,
            					"io.thlaegler.edifact.Edilang.ID");
            			

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
    // $ANTLR end "ruleDateOnlyFunction"


    // $ANTLR start "entryRuleDateAndTimeFunction"
    // InternalEdilang.g:5016:1: entryRuleDateAndTimeFunction returns [EObject current=null] : iv_ruleDateAndTimeFunction= ruleDateAndTimeFunction EOF ;
    public final EObject entryRuleDateAndTimeFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateAndTimeFunction = null;


        try {
            // InternalEdilang.g:5016:60: (iv_ruleDateAndTimeFunction= ruleDateAndTimeFunction EOF )
            // InternalEdilang.g:5017:2: iv_ruleDateAndTimeFunction= ruleDateAndTimeFunction EOF
            {
             newCompositeNode(grammarAccess.getDateAndTimeFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateAndTimeFunction=ruleDateAndTimeFunction();

            state._fsp--;

             current =iv_ruleDateAndTimeFunction; 
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
    // $ANTLR end "entryRuleDateAndTimeFunction"


    // $ANTLR start "ruleDateAndTimeFunction"
    // InternalEdilang.g:5023:1: ruleDateAndTimeFunction returns [EObject current=null] : ( ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDateAndTimeFunction() throws RecognitionException {
        EObject current = null;

        Token lv_date6_0_0=null;
        Token this_COLON_1=null;
        Token lv_time4_2_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5029:2: ( ( ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) ) ) )
            // InternalEdilang.g:5030:2: ( ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) ) )
            {
            // InternalEdilang.g:5030:2: ( ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) ) )
            // InternalEdilang.g:5031:3: ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) )
            {
            // InternalEdilang.g:5031:3: ( (lv_date6_0_0= RULE_ID ) )
            // InternalEdilang.g:5032:4: (lv_date6_0_0= RULE_ID )
            {
            // InternalEdilang.g:5032:4: (lv_date6_0_0= RULE_ID )
            // InternalEdilang.g:5033:5: lv_date6_0_0= RULE_ID
            {
            lv_date6_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_date6_0_0, grammarAccess.getDateAndTimeFunctionAccess().getDate6IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateAndTimeFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date6",
            						lv_date6_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

            			newLeafNode(this_COLON_1, grammarAccess.getDateAndTimeFunctionAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:5053:3: ( (lv_time4_2_0= RULE_ID ) )
            // InternalEdilang.g:5054:4: (lv_time4_2_0= RULE_ID )
            {
            // InternalEdilang.g:5054:4: (lv_time4_2_0= RULE_ID )
            // InternalEdilang.g:5055:5: lv_time4_2_0= RULE_ID
            {
            lv_time4_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_time4_2_0, grammarAccess.getDateAndTimeFunctionAccess().getTime4IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateAndTimeFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time4",
            						lv_time4_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

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
    // $ANTLR end "ruleDateAndTimeFunction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00001FFFFFFF4002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000012L});

}