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
    // InternalEdilang.g:458:1: ruleUNBSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( (lv_header_2_0= ruleUNBHeader ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= ruleInterchangerFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_dateAndTime_8_0= ruleDateAndTimeFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_interchangeControlSenderRef_10_0= RULE_ID ) )? (this_PLUS_11= RULE_PLUS ( (lv_interchangeControlRecipientRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_fse_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleUNBSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token this_PLUS_3=null;
        Token this_PLUS_5=null;
        Token this_PLUS_7=null;
        Token this_PLUS_9=null;
        Token lv_interchangeControlSenderRef_10_0=null;
        Token this_PLUS_11=null;
        Token lv_interchangeControlRecipientRef_12_0=null;
        Token this_PLUS_13=null;
        Token lv_fse_14_0=null;
        Token this_PLUS_15=null;
        Token lv_assiciationCode_16_0=null;
        Token lv_lineEnd_17_0=null;
        EObject lv_header_2_0 = null;

        EObject lv_interchangeSender_4_0 = null;

        EObject lv_interchangeRecipient_6_0 = null;

        EObject lv_dateAndTime_8_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:464:2: ( ( ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( (lv_header_2_0= ruleUNBHeader ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= ruleInterchangerFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_dateAndTime_8_0= ruleDateAndTimeFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_interchangeControlSenderRef_10_0= RULE_ID ) )? (this_PLUS_11= RULE_PLUS ( (lv_interchangeControlRecipientRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_fse_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:465:2: ( ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( (lv_header_2_0= ruleUNBHeader ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= ruleInterchangerFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_dateAndTime_8_0= ruleDateAndTimeFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_interchangeControlSenderRef_10_0= RULE_ID ) )? (this_PLUS_11= RULE_PLUS ( (lv_interchangeControlRecipientRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_fse_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:465:2: ( ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( (lv_header_2_0= ruleUNBHeader ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= ruleInterchangerFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_dateAndTime_8_0= ruleDateAndTimeFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_interchangeControlSenderRef_10_0= RULE_ID ) )? (this_PLUS_11= RULE_PLUS ( (lv_interchangeControlRecipientRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_fse_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:466:3: ( (lv_segment_0_0= 'UNB' ) ) this_PLUS_1= RULE_PLUS ( (lv_header_2_0= ruleUNBHeader ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= ruleInterchangerFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= ruleInterchangerFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_dateAndTime_8_0= ruleDateAndTimeFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_interchangeControlSenderRef_10_0= RULE_ID ) )? (this_PLUS_11= RULE_PLUS ( (lv_interchangeControlRecipientRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_fse_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) )
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
            		
            // InternalEdilang.g:484:3: ( (lv_header_2_0= ruleUNBHeader ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COLON||LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEdilang.g:485:4: (lv_header_2_0= ruleUNBHeader )
                    {
                    // InternalEdilang.g:485:4: (lv_header_2_0= ruleUNBHeader )
                    // InternalEdilang.g:486:5: lv_header_2_0= ruleUNBHeader
                    {

                    					newCompositeNode(grammarAccess.getUNBSegmentAccess().getHeaderUNBHeaderParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_header_2_0=ruleUNBHeader();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUNBSegmentRule());
                    					}
                    					set(
                    						current,
                    						"header",
                    						lv_header_2_0,
                    						"io.thlaegler.edifact.Edilang.UNBHeader");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_3, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:507:3: ( (lv_interchangeSender_4_0= ruleInterchangerFunction ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEdilang.g:508:4: (lv_interchangeSender_4_0= ruleInterchangerFunction )
                    {
                    // InternalEdilang.g:508:4: (lv_interchangeSender_4_0= ruleInterchangerFunction )
                    // InternalEdilang.g:509:5: lv_interchangeSender_4_0= ruleInterchangerFunction
                    {

                    					newCompositeNode(grammarAccess.getUNBSegmentAccess().getInterchangeSenderInterchangerFunctionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_interchangeSender_4_0=ruleInterchangerFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUNBSegmentRule());
                    					}
                    					set(
                    						current,
                    						"interchangeSender",
                    						lv_interchangeSender_4_0,
                    						"io.thlaegler.edifact.Edilang.InterchangerFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_5, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:530:3: ( (lv_interchangeRecipient_6_0= ruleInterchangerFunction ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEdilang.g:531:4: (lv_interchangeRecipient_6_0= ruleInterchangerFunction )
                    {
                    // InternalEdilang.g:531:4: (lv_interchangeRecipient_6_0= ruleInterchangerFunction )
                    // InternalEdilang.g:532:5: lv_interchangeRecipient_6_0= ruleInterchangerFunction
                    {

                    					newCompositeNode(grammarAccess.getUNBSegmentAccess().getInterchangeRecipientInterchangerFunctionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_interchangeRecipient_6_0=ruleInterchangerFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUNBSegmentRule());
                    					}
                    					set(
                    						current,
                    						"interchangeRecipient",
                    						lv_interchangeRecipient_6_0,
                    						"io.thlaegler.edifact.Edilang.InterchangerFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_7, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_7());
            		
            // InternalEdilang.g:553:3: ( (lv_dateAndTime_8_0= ruleDateAndTimeFunction ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEdilang.g:554:4: (lv_dateAndTime_8_0= ruleDateAndTimeFunction )
                    {
                    // InternalEdilang.g:554:4: (lv_dateAndTime_8_0= ruleDateAndTimeFunction )
                    // InternalEdilang.g:555:5: lv_dateAndTime_8_0= ruleDateAndTimeFunction
                    {

                    					newCompositeNode(grammarAccess.getUNBSegmentAccess().getDateAndTimeDateAndTimeFunctionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_dateAndTime_8_0=ruleDateAndTimeFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUNBSegmentRule());
                    					}
                    					add(
                    						current,
                    						"dateAndTime",
                    						lv_dateAndTime_8_0,
                    						"io.thlaegler.edifact.Edilang.DateAndTimeFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_10); 

            			newLeafNode(this_PLUS_9, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_9());
            		
            // InternalEdilang.g:576:3: ( (lv_interchangeControlSenderRef_10_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEdilang.g:577:4: (lv_interchangeControlSenderRef_10_0= RULE_ID )
                    {
                    // InternalEdilang.g:577:4: (lv_interchangeControlSenderRef_10_0= RULE_ID )
                    // InternalEdilang.g:578:5: lv_interchangeControlSenderRef_10_0= RULE_ID
                    {
                    lv_interchangeControlSenderRef_10_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(lv_interchangeControlSenderRef_10_0, grammarAccess.getUNBSegmentAccess().getInterchangeControlSenderRefIDTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUNBSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"interchangeControlSenderRef",
                    						lv_interchangeControlSenderRef_10_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:594:3: (this_PLUS_11= RULE_PLUS ( (lv_interchangeControlRecipientRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_fse_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )? )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_PLUS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEdilang.g:595:4: this_PLUS_11= RULE_PLUS ( (lv_interchangeControlRecipientRef_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_fse_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )? )?
                    {
                    this_PLUS_11=(Token)match(input,RULE_PLUS,FOLLOW_10); 

                    				newLeafNode(this_PLUS_11, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_11_0());
                    			
                    // InternalEdilang.g:599:4: ( (lv_interchangeControlRecipientRef_12_0= RULE_ID ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalEdilang.g:600:5: (lv_interchangeControlRecipientRef_12_0= RULE_ID )
                            {
                            // InternalEdilang.g:600:5: (lv_interchangeControlRecipientRef_12_0= RULE_ID )
                            // InternalEdilang.g:601:6: lv_interchangeControlRecipientRef_12_0= RULE_ID
                            {
                            lv_interchangeControlRecipientRef_12_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                            						newLeafNode(lv_interchangeControlRecipientRef_12_0, grammarAccess.getUNBSegmentAccess().getInterchangeControlRecipientRefIDTerminalRuleCall_11_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getUNBSegmentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"interchangeControlRecipientRef",
                            							lv_interchangeControlRecipientRef_12_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    // InternalEdilang.g:617:4: (this_PLUS_13= RULE_PLUS ( (lv_fse_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )? )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_PLUS) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEdilang.g:618:5: this_PLUS_13= RULE_PLUS ( (lv_fse_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )?
                            {
                            this_PLUS_13=(Token)match(input,RULE_PLUS,FOLLOW_10); 

                            					newLeafNode(this_PLUS_13, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_11_2_0());
                            				
                            // InternalEdilang.g:622:5: ( (lv_fse_14_0= RULE_ID ) )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==RULE_ID) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // InternalEdilang.g:623:6: (lv_fse_14_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:623:6: (lv_fse_14_0= RULE_ID )
                                    // InternalEdilang.g:624:7: lv_fse_14_0= RULE_ID
                                    {
                                    lv_fse_14_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                                    							newLeafNode(lv_fse_14_0, grammarAccess.getUNBSegmentAccess().getFseIDTerminalRuleCall_11_2_1_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getUNBSegmentRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"fse",
                                    								lv_fse_14_0,
                                    								"io.thlaegler.edifact.Edilang.ID");
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalEdilang.g:640:5: (this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )? )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==RULE_PLUS) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalEdilang.g:641:6: this_PLUS_15= RULE_PLUS ( (lv_assiciationCode_16_0= RULE_ID ) )?
                                    {
                                    this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_12); 

                                    						newLeafNode(this_PLUS_15, grammarAccess.getUNBSegmentAccess().getPLUSTerminalRuleCall_11_2_2_0());
                                    					
                                    // InternalEdilang.g:645:6: ( (lv_assiciationCode_16_0= RULE_ID ) )?
                                    int alt10=2;
                                    int LA10_0 = input.LA(1);

                                    if ( (LA10_0==RULE_ID) ) {
                                        alt10=1;
                                    }
                                    switch (alt10) {
                                        case 1 :
                                            // InternalEdilang.g:646:7: (lv_assiciationCode_16_0= RULE_ID )
                                            {
                                            // InternalEdilang.g:646:7: (lv_assiciationCode_16_0= RULE_ID )
                                            // InternalEdilang.g:647:8: lv_assiciationCode_16_0= RULE_ID
                                            {
                                            lv_assiciationCode_16_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                                            								newLeafNode(lv_assiciationCode_16_0, grammarAccess.getUNBSegmentAccess().getAssiciationCodeIDTerminalRuleCall_11_2_2_1_0());
                                            							

                                            								if (current==null) {
                                            									current = createModelElement(grammarAccess.getUNBSegmentRule());
                                            								}
                                            								setWithLastConsumed(
                                            									current,
                                            									"assiciationCode",
                                            									lv_assiciationCode_16_0,
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

            // InternalEdilang.g:666:3: ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:667:4: (lv_lineEnd_17_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:667:4: (lv_lineEnd_17_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:668:5: lv_lineEnd_17_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_17_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_17_0, grammarAccess.getUNBSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNBSegmentRule());
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
    // $ANTLR end "ruleUNBSegment"


    // $ANTLR start "entryRuleUNHSegment"
    // InternalEdilang.g:688:1: entryRuleUNHSegment returns [EObject current=null] : iv_ruleUNHSegment= ruleUNHSegment EOF ;
    public final EObject entryRuleUNHSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNHSegment = null;


        try {
            // InternalEdilang.g:688:51: (iv_ruleUNHSegment= ruleUNHSegment EOF )
            // InternalEdilang.g:689:2: iv_ruleUNHSegment= ruleUNHSegment EOF
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
    // InternalEdilang.g:695:1: ruleUNHSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:701:2: ( ( ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:702:2: ( ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:702:2: ( ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:703:3: ( (lv_segment_0_0= 'UNH' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageReferenceNumber_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_message_4_0= ruleMessageBodyFunction ) ) (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:703:3: ( (lv_segment_0_0= 'UNH' ) )
            // InternalEdilang.g:704:4: (lv_segment_0_0= 'UNH' )
            {
            // InternalEdilang.g:704:4: (lv_segment_0_0= 'UNH' )
            // InternalEdilang.g:705:5: lv_segment_0_0= 'UNH'
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
            		
            // InternalEdilang.g:721:3: ( (lv_messageReferenceNumber_2_0= RULE_ID ) )
            // InternalEdilang.g:722:4: (lv_messageReferenceNumber_2_0= RULE_ID )
            {
            // InternalEdilang.g:722:4: (lv_messageReferenceNumber_2_0= RULE_ID )
            // InternalEdilang.g:723:5: lv_messageReferenceNumber_2_0= RULE_ID
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
            		
            // InternalEdilang.g:743:3: ( (lv_message_4_0= ruleMessageBodyFunction ) )
            // InternalEdilang.g:744:4: (lv_message_4_0= ruleMessageBodyFunction )
            {
            // InternalEdilang.g:744:4: (lv_message_4_0= ruleMessageBodyFunction )
            // InternalEdilang.g:745:5: lv_message_4_0= ruleMessageBodyFunction
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

            // InternalEdilang.g:762:3: (this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_PLUS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEdilang.g:763:4: this_PLUS_5= RULE_PLUS ( (lv_commonAccessReference_6_0= RULE_ID ) )
                    {
                    this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_5, grammarAccess.getUNHSegmentAccess().getPLUSTerminalRuleCall_5_0());
                    			
                    // InternalEdilang.g:767:4: ( (lv_commonAccessReference_6_0= RULE_ID ) )
                    // InternalEdilang.g:768:5: (lv_commonAccessReference_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:768:5: (lv_commonAccessReference_6_0= RULE_ID )
                    // InternalEdilang.g:769:6: lv_commonAccessReference_6_0= RULE_ID
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

            // InternalEdilang.g:786:3: ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:787:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:787:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:788:5: lv_lineEnd_7_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:808:1: entryRuleMSGSegment returns [EObject current=null] : iv_ruleMSGSegment= ruleMSGSegment EOF ;
    public final EObject entryRuleMSGSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMSGSegment = null;


        try {
            // InternalEdilang.g:808:51: (iv_ruleMSGSegment= ruleMSGSegment EOF )
            // InternalEdilang.g:809:2: iv_ruleMSGSegment= ruleMSGSegment EOF
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
    // InternalEdilang.g:815:1: ruleMSGSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageIdentifier_2_0= ruleMessageIndentifier ) )? (this_PLUS_3= RULE_PLUS ( (lv_designatedClassCode_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_maintenanceOperationCode_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleMSGSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token this_PLUS_3=null;
        Token lv_designatedClassCode_4_0=null;
        Token this_PLUS_5=null;
        Token lv_maintenanceOperationCode_6_0=null;
        Token this_PLUS_7=null;
        Token lv_lineEnd_9_0=null;
        EObject lv_messageIdentifier_2_0 = null;

        EObject lv_relationship_8_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:821:2: ( ( ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageIdentifier_2_0= ruleMessageIndentifier ) )? (this_PLUS_3= RULE_PLUS ( (lv_designatedClassCode_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_maintenanceOperationCode_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:822:2: ( ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageIdentifier_2_0= ruleMessageIndentifier ) )? (this_PLUS_3= RULE_PLUS ( (lv_designatedClassCode_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_maintenanceOperationCode_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:822:2: ( ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageIdentifier_2_0= ruleMessageIndentifier ) )? (this_PLUS_3= RULE_PLUS ( (lv_designatedClassCode_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_maintenanceOperationCode_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:823:3: ( (lv_segment_0_0= 'MSG' ) ) this_PLUS_1= RULE_PLUS ( (lv_messageIdentifier_2_0= ruleMessageIndentifier ) )? (this_PLUS_3= RULE_PLUS ( (lv_designatedClassCode_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_maintenanceOperationCode_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:823:3: ( (lv_segment_0_0= 'MSG' ) )
            // InternalEdilang.g:824:4: (lv_segment_0_0= 'MSG' )
            {
            // InternalEdilang.g:824:4: (lv_segment_0_0= 'MSG' )
            // InternalEdilang.g:825:5: lv_segment_0_0= 'MSG'
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
            		
            // InternalEdilang.g:841:3: ( (lv_messageIdentifier_2_0= ruleMessageIndentifier ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COLON||LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEdilang.g:842:4: (lv_messageIdentifier_2_0= ruleMessageIndentifier )
                    {
                    // InternalEdilang.g:842:4: (lv_messageIdentifier_2_0= ruleMessageIndentifier )
                    // InternalEdilang.g:843:5: lv_messageIdentifier_2_0= ruleMessageIndentifier
                    {

                    					newCompositeNode(grammarAccess.getMSGSegmentAccess().getMessageIdentifierMessageIndentifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_messageIdentifier_2_0=ruleMessageIndentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMSGSegmentRule());
                    					}
                    					set(
                    						current,
                    						"messageIdentifier",
                    						lv_messageIdentifier_2_0,
                    						"io.thlaegler.edifact.Edilang.MessageIndentifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:860:3: (this_PLUS_3= RULE_PLUS ( (lv_designatedClassCode_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_maintenanceOperationCode_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )? )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_PLUS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEdilang.g:861:4: this_PLUS_3= RULE_PLUS ( (lv_designatedClassCode_4_0= RULE_ID ) ) (this_PLUS_5= RULE_PLUS ( (lv_maintenanceOperationCode_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )? )?
                    {
                    this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_3, grammarAccess.getMSGSegmentAccess().getPLUSTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:865:4: ( (lv_designatedClassCode_4_0= RULE_ID ) )
                    // InternalEdilang.g:866:5: (lv_designatedClassCode_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:866:5: (lv_designatedClassCode_4_0= RULE_ID )
                    // InternalEdilang.g:867:6: lv_designatedClassCode_4_0= RULE_ID
                    {
                    lv_designatedClassCode_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_designatedClassCode_4_0, grammarAccess.getMSGSegmentAccess().getDesignatedClassCodeIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMSGSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"designatedClassCode",
                    							lv_designatedClassCode_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:883:4: (this_PLUS_5= RULE_PLUS ( (lv_maintenanceOperationCode_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_PLUS) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalEdilang.g:884:5: this_PLUS_5= RULE_PLUS ( (lv_maintenanceOperationCode_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )?
                            {
                            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                            					newLeafNode(this_PLUS_5, grammarAccess.getMSGSegmentAccess().getPLUSTerminalRuleCall_3_2_0());
                            				
                            // InternalEdilang.g:888:5: ( (lv_maintenanceOperationCode_6_0= RULE_ID ) )
                            // InternalEdilang.g:889:6: (lv_maintenanceOperationCode_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:889:6: (lv_maintenanceOperationCode_6_0= RULE_ID )
                            // InternalEdilang.g:890:7: lv_maintenanceOperationCode_6_0= RULE_ID
                            {
                            lv_maintenanceOperationCode_6_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                            							newLeafNode(lv_maintenanceOperationCode_6_0, grammarAccess.getMSGSegmentAccess().getMaintenanceOperationCodeIDTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMSGSegmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maintenanceOperationCode",
                            								lv_maintenanceOperationCode_6_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:906:5: (this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) ) )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==RULE_PLUS) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalEdilang.g:907:6: this_PLUS_7= RULE_PLUS ( (lv_relationship_8_0= ruleRelationship ) )
                                    {
                                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_15); 

                                    						newLeafNode(this_PLUS_7, grammarAccess.getMSGSegmentAccess().getPLUSTerminalRuleCall_3_2_2_0());
                                    					
                                    // InternalEdilang.g:911:6: ( (lv_relationship_8_0= ruleRelationship ) )
                                    // InternalEdilang.g:912:7: (lv_relationship_8_0= ruleRelationship )
                                    {
                                    // InternalEdilang.g:912:7: (lv_relationship_8_0= ruleRelationship )
                                    // InternalEdilang.g:913:8: lv_relationship_8_0= ruleRelationship
                                    {

                                    								newCompositeNode(grammarAccess.getMSGSegmentAccess().getRelationshipRelationshipParserRuleCall_3_2_2_1_0());
                                    							
                                    pushFollow(FOLLOW_7);
                                    lv_relationship_8_0=ruleRelationship();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getMSGSegmentRule());
                                    								}
                                    								set(
                                    									current,
                                    									"relationship",
                                    									lv_relationship_8_0,
                                    									"io.thlaegler.edifact.Edilang.Relationship");
                                    								afterParserOrEnumRuleCall();
                                    							

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

            // InternalEdilang.g:933:3: ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:934:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:934:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:935:5: lv_lineEnd_9_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_9_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_9_0, grammarAccess.getMSGSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMSGSegmentRule());
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
    // $ANTLR end "ruleMSGSegment"


    // $ANTLR start "entryRuleORGSegment"
    // InternalEdilang.g:955:1: entryRuleORGSegment returns [EObject current=null] : iv_ruleORGSegment= ruleORGSegment EOF ;
    public final EObject entryRuleORGSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORGSegment = null;


        try {
            // InternalEdilang.g:955:51: (iv_ruleORGSegment= ruleORGSegment EOF )
            // InternalEdilang.g:956:2: iv_ruleORGSegment= ruleORGSegment EOF
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
    // InternalEdilang.g:962:1: ruleORGSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:968:2: ( ( ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:969:2: ( ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:969:2: ( ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:970:3: ( (lv_segment_0_0= 'ORG' ) ) this_PLUS_1= RULE_PLUS ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )? this_PLUS_3= RULE_PLUS ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )? this_PLUS_5= RULE_PLUS ( (lv_location_6_0= ruleLocationFunction ) )? this_PLUS_7= RULE_PLUS ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )? this_PLUS_9= RULE_PLUS ( (lv_originatorTypeCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_originator_12_0= ruleOriginatorFunction ) )? this_PLUS_13= RULE_PLUS ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:970:3: ( (lv_segment_0_0= 'ORG' ) )
            // InternalEdilang.g:971:4: (lv_segment_0_0= 'ORG' )
            {
            // InternalEdilang.g:971:4: (lv_segment_0_0= 'ORG' )
            // InternalEdilang.g:972:5: lv_segment_0_0= 'ORG'
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
            		
            // InternalEdilang.g:988:3: ( (lv_systemDetail1_2_0= ruleSystemDetailFunction ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEdilang.g:989:4: (lv_systemDetail1_2_0= ruleSystemDetailFunction )
                    {
                    // InternalEdilang.g:989:4: (lv_systemDetail1_2_0= ruleSystemDetailFunction )
                    // InternalEdilang.g:990:5: lv_systemDetail1_2_0= ruleSystemDetailFunction
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
            		
            // InternalEdilang.g:1011:3: ( (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEdilang.g:1012:4: (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction )
                    {
                    // InternalEdilang.g:1012:4: (lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction )
                    // InternalEdilang.g:1013:5: lv_originatorIdentification_4_0= ruleOriginatorIdentificationFunction
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
            		
            // InternalEdilang.g:1034:3: ( (lv_location_6_0= ruleLocationFunction ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEdilang.g:1035:4: (lv_location_6_0= ruleLocationFunction )
                    {
                    // InternalEdilang.g:1035:4: (lv_location_6_0= ruleLocationFunction )
                    // InternalEdilang.g:1036:5: lv_location_6_0= ruleLocationFunction
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
            		
            // InternalEdilang.g:1057:3: ( (lv_systemDetail2_8_0= ruleSystemDetailFunction ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEdilang.g:1058:4: (lv_systemDetail2_8_0= ruleSystemDetailFunction )
                    {
                    // InternalEdilang.g:1058:4: (lv_systemDetail2_8_0= ruleSystemDetailFunction )
                    // InternalEdilang.g:1059:5: lv_systemDetail2_8_0= ruleSystemDetailFunction
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
            		
            // InternalEdilang.g:1080:3: ( (lv_originatorTypeCode_10_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEdilang.g:1081:4: (lv_originatorTypeCode_10_0= RULE_ID )
                    {
                    // InternalEdilang.g:1081:4: (lv_originatorTypeCode_10_0= RULE_ID )
                    // InternalEdilang.g:1082:5: lv_originatorTypeCode_10_0= RULE_ID
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
            		
            // InternalEdilang.g:1102:3: ( (lv_originator_12_0= ruleOriginatorFunction ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEdilang.g:1103:4: (lv_originator_12_0= ruleOriginatorFunction )
                    {
                    // InternalEdilang.g:1103:4: (lv_originator_12_0= ruleOriginatorFunction )
                    // InternalEdilang.g:1104:5: lv_originator_12_0= ruleOriginatorFunction
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
            		
            // InternalEdilang.g:1125:3: ( (lv_originatorsAuthorityRequestCode_14_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEdilang.g:1126:4: (lv_originatorsAuthorityRequestCode_14_0= RULE_ID )
                    {
                    // InternalEdilang.g:1126:4: (lv_originatorsAuthorityRequestCode_14_0= RULE_ID )
                    // InternalEdilang.g:1127:5: lv_originatorsAuthorityRequestCode_14_0= RULE_ID
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

            // InternalEdilang.g:1143:3: (this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_PLUS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEdilang.g:1144:4: this_PLUS_15= RULE_PLUS ( (lv_communicationNumber_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )?
                    {
                    this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_15, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_15_0());
                    			
                    // InternalEdilang.g:1148:4: ( (lv_communicationNumber_16_0= RULE_ID ) )
                    // InternalEdilang.g:1149:5: (lv_communicationNumber_16_0= RULE_ID )
                    {
                    // InternalEdilang.g:1149:5: (lv_communicationNumber_16_0= RULE_ID )
                    // InternalEdilang.g:1150:6: lv_communicationNumber_16_0= RULE_ID
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

                    // InternalEdilang.g:1166:4: (this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_PLUS) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalEdilang.g:1167:5: this_PLUS_17= RULE_PLUS ( (lv_partyIdIdentification_18_0= RULE_ID ) )
                            {
                            this_PLUS_17=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                            					newLeafNode(this_PLUS_17, grammarAccess.getORGSegmentAccess().getPLUSTerminalRuleCall_15_2_0());
                            				
                            // InternalEdilang.g:1171:5: ( (lv_partyIdIdentification_18_0= RULE_ID ) )
                            // InternalEdilang.g:1172:6: (lv_partyIdIdentification_18_0= RULE_ID )
                            {
                            // InternalEdilang.g:1172:6: (lv_partyIdIdentification_18_0= RULE_ID )
                            // InternalEdilang.g:1173:7: lv_partyIdIdentification_18_0= RULE_ID
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

            // InternalEdilang.g:1191:3: ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1192:4: (lv_lineEnd_19_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1192:4: (lv_lineEnd_19_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1193:5: lv_lineEnd_19_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:1213:1: entryRulePOCSegment returns [EObject current=null] : iv_rulePOCSegment= rulePOCSegment EOF ;
    public final EObject entryRulePOCSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOCSegment = null;


        try {
            // InternalEdilang.g:1213:51: (iv_rulePOCSegment= rulePOCSegment EOF )
            // InternalEdilang.g:1214:2: iv_rulePOCSegment= rulePOCSegment EOF
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
    // InternalEdilang.g:1220:1: rulePOCSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:1226:2: ( ( ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1227:2: ( ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1227:2: ( ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1228:3: ( (lv_segment_0_0= 'POC' ) ) this_PLUS_1= RULE_PLUS ( (lv_location_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_departureDate_4_0= RULE_ID ) )? (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )? ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1228:3: ( (lv_segment_0_0= 'POC' ) )
            // InternalEdilang.g:1229:4: (lv_segment_0_0= 'POC' )
            {
            // InternalEdilang.g:1229:4: (lv_segment_0_0= 'POC' )
            // InternalEdilang.g:1230:5: lv_segment_0_0= 'POC'
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
            		
            // InternalEdilang.g:1246:3: ( (lv_location_2_0= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEdilang.g:1247:4: (lv_location_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:1247:4: (lv_location_2_0= RULE_ID )
                    // InternalEdilang.g:1248:5: lv_location_2_0= RULE_ID
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
            		
            // InternalEdilang.g:1268:3: ( (lv_departureDate_4_0= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEdilang.g:1269:4: (lv_departureDate_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:1269:4: (lv_departureDate_4_0= RULE_ID )
                    // InternalEdilang.g:1270:5: lv_departureDate_4_0= RULE_ID
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

            // InternalEdilang.g:1286:3: (this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_PLUS) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEdilang.g:1287:4: this_PLUS_5= RULE_PLUS ( (lv_departureTime_6_0= RULE_ID ) )
                    {
                    this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_5, grammarAccess.getPOCSegmentAccess().getPLUSTerminalRuleCall_5_0());
                    			
                    // InternalEdilang.g:1291:4: ( (lv_departureTime_6_0= RULE_ID ) )
                    // InternalEdilang.g:1292:5: (lv_departureTime_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:1292:5: (lv_departureTime_6_0= RULE_ID )
                    // InternalEdilang.g:1293:6: lv_departureTime_6_0= RULE_ID
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

            // InternalEdilang.g:1310:3: ( (lv_lineEnd_7_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1311:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1311:4: (lv_lineEnd_7_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1312:5: lv_lineEnd_7_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:1332:1: entryRuleODISegment returns [EObject current=null] : iv_ruleODISegment= ruleODISegment EOF ;
    public final EObject entryRuleODISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleODISegment = null;


        try {
            // InternalEdilang.g:1332:51: (iv_ruleODISegment= ruleODISegment EOF )
            // InternalEdilang.g:1333:2: iv_ruleODISegment= ruleODISegment EOF
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
    // InternalEdilang.g:1339:1: ruleODISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:1345:2: ( ( ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1346:2: ( ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1346:2: ( ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1347:3: ( (lv_segment_0_0= 'ODI' ) ) (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1347:3: ( (lv_segment_0_0= 'ODI' ) )
            // InternalEdilang.g:1348:4: (lv_segment_0_0= 'ODI' )
            {
            // InternalEdilang.g:1348:4: (lv_segment_0_0= 'ODI' )
            // InternalEdilang.g:1349:5: lv_segment_0_0= 'ODI'
            {
            lv_segment_0_0=(Token)match(input,21,FOLLOW_11); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getODISegmentAccess().getSegmentODIKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getODISegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "ODI");
            				

            }


            }

            // InternalEdilang.g:1361:3: (this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_PLUS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEdilang.g:1362:4: this_PLUS_1= RULE_PLUS ( (lv_origin_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_destination_4_0= RULE_ID ) )?
                    {
                    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_9); 

                    				newLeafNode(this_PLUS_1, grammarAccess.getODISegmentAccess().getPLUSTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:1366:4: ( (lv_origin_2_0= RULE_ID ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalEdilang.g:1367:5: (lv_origin_2_0= RULE_ID )
                            {
                            // InternalEdilang.g:1367:5: (lv_origin_2_0= RULE_ID )
                            // InternalEdilang.g:1368:6: lv_origin_2_0= RULE_ID
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
                    			
                    // InternalEdilang.g:1388:4: ( (lv_destination_4_0= RULE_ID ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalEdilang.g:1389:5: (lv_destination_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:1389:5: (lv_destination_4_0= RULE_ID )
                            // InternalEdilang.g:1390:6: lv_destination_4_0= RULE_ID
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

            // InternalEdilang.g:1407:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1408:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1408:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1409:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:1429:1: entryRuleUCISegment returns [EObject current=null] : iv_ruleUCISegment= ruleUCISegment EOF ;
    public final EObject entryRuleUCISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUCISegment = null;


        try {
            // InternalEdilang.g:1429:51: (iv_ruleUCISegment= ruleUCISegment EOF )
            // InternalEdilang.g:1430:2: iv_ruleUCISegment= ruleUCISegment EOF
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
    // InternalEdilang.g:1436:1: ruleUCISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:1442:2: ( ( ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1443:2: ( ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1443:2: ( ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1444:3: ( (lv_segment_0_0= 'UCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlReference_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeSender_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_interchangeRecipient_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_action_8_0= RULE_ID ) )? this_PLUS_9= RULE_PLUS ( (lv_syntaxErrorCode_10_0= RULE_ID ) )? this_PLUS_11= RULE_PLUS ( (lv_segmentTagCode_12_0= RULE_ID ) )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1444:3: ( (lv_segment_0_0= 'UCI' ) )
            // InternalEdilang.g:1445:4: (lv_segment_0_0= 'UCI' )
            {
            // InternalEdilang.g:1445:4: (lv_segment_0_0= 'UCI' )
            // InternalEdilang.g:1446:5: lv_segment_0_0= 'UCI'
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
            		
            // InternalEdilang.g:1462:3: ( (lv_interchangeControlReference_2_0= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEdilang.g:1463:4: (lv_interchangeControlReference_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:1463:4: (lv_interchangeControlReference_2_0= RULE_ID )
                    // InternalEdilang.g:1464:5: lv_interchangeControlReference_2_0= RULE_ID
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
            		
            // InternalEdilang.g:1484:3: ( (lv_interchangeSender_4_0= RULE_ID ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEdilang.g:1485:4: (lv_interchangeSender_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:1485:4: (lv_interchangeSender_4_0= RULE_ID )
                    // InternalEdilang.g:1486:5: lv_interchangeSender_4_0= RULE_ID
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
            		
            // InternalEdilang.g:1506:3: ( (lv_interchangeRecipient_6_0= RULE_ID ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEdilang.g:1507:4: (lv_interchangeRecipient_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:1507:4: (lv_interchangeRecipient_6_0= RULE_ID )
                    // InternalEdilang.g:1508:5: lv_interchangeRecipient_6_0= RULE_ID
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
            		
            // InternalEdilang.g:1528:3: ( (lv_action_8_0= RULE_ID ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEdilang.g:1529:4: (lv_action_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:1529:4: (lv_action_8_0= RULE_ID )
                    // InternalEdilang.g:1530:5: lv_action_8_0= RULE_ID
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
            		
            // InternalEdilang.g:1550:3: ( (lv_syntaxErrorCode_10_0= RULE_ID ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEdilang.g:1551:4: (lv_syntaxErrorCode_10_0= RULE_ID )
                    {
                    // InternalEdilang.g:1551:4: (lv_syntaxErrorCode_10_0= RULE_ID )
                    // InternalEdilang.g:1552:5: lv_syntaxErrorCode_10_0= RULE_ID
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
            		
            // InternalEdilang.g:1572:3: ( (lv_segmentTagCode_12_0= RULE_ID ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalEdilang.g:1573:4: (lv_segmentTagCode_12_0= RULE_ID )
                    {
                    // InternalEdilang.g:1573:4: (lv_segmentTagCode_12_0= RULE_ID )
                    // InternalEdilang.g:1574:5: lv_segmentTagCode_12_0= RULE_ID
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

            // InternalEdilang.g:1590:3: ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1591:4: (lv_lineEnd_13_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1591:4: (lv_lineEnd_13_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1592:5: lv_lineEnd_13_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:1612:1: entryRulePDISegment returns [EObject current=null] : iv_rulePDISegment= rulePDISegment EOF ;
    public final EObject entryRulePDISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDISegment = null;


        try {
            // InternalEdilang.g:1612:51: (iv_rulePDISegment= rulePDISegment EOF )
            // InternalEdilang.g:1613:2: iv_rulePDISegment= rulePDISegment EOF
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
    // InternalEdilang.g:1619:1: rulePDISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:1625:2: ( ( ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1626:2: ( ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1626:2: ( ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1627:3: ( (lv_segment_0_0= 'PDI' ) ) this_PLUS_1= RULE_PLUS ( (lv_productDetailsQualifier_2_0= RULE_ID ) )? (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )* ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1627:3: ( (lv_segment_0_0= 'PDI' ) )
            // InternalEdilang.g:1628:4: (lv_segment_0_0= 'PDI' )
            {
            // InternalEdilang.g:1628:4: (lv_segment_0_0= 'PDI' )
            // InternalEdilang.g:1629:5: lv_segment_0_0= 'PDI'
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
            		
            // InternalEdilang.g:1645:3: ( (lv_productDetailsQualifier_2_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEdilang.g:1646:4: (lv_productDetailsQualifier_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:1646:4: (lv_productDetailsQualifier_2_0= RULE_ID )
                    // InternalEdilang.g:1647:5: lv_productDetailsQualifier_2_0= RULE_ID
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

            // InternalEdilang.g:1663:3: (this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_PLUS) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalEdilang.g:1664:4: this_PLUS_3= RULE_PLUS ( (lv_products_4_0= ruleProductFunction ) )
            	    {
            	    this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            	    				newLeafNode(this_PLUS_3, grammarAccess.getPDISegmentAccess().getPLUSTerminalRuleCall_3_0());
            	    			
            	    // InternalEdilang.g:1668:4: ( (lv_products_4_0= ruleProductFunction ) )
            	    // InternalEdilang.g:1669:5: (lv_products_4_0= ruleProductFunction )
            	    {
            	    // InternalEdilang.g:1669:5: (lv_products_4_0= ruleProductFunction )
            	    // InternalEdilang.g:1670:6: lv_products_4_0= ruleProductFunction
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

            // InternalEdilang.g:1688:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:1689:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:1689:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:1690:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:1710:1: entryRuleTVLSegment returns [EObject current=null] : iv_ruleTVLSegment= ruleTVLSegment EOF ;
    public final EObject entryRuleTVLSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTVLSegment = null;


        try {
            // InternalEdilang.g:1710:51: (iv_ruleTVLSegment= ruleTVLSegment EOF )
            // InternalEdilang.g:1711:2: iv_ruleTVLSegment= ruleTVLSegment EOF
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
    // InternalEdilang.g:1717:1: ruleTVLSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:1723:2: ( ( ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:1724:2: ( ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:1724:2: ( ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:1725:3: ( (lv_segment_0_0= 'TVL' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) ) this_PLUS_6= RULE_PLUS ( (lv_originCode_7_0= RULE_ID ) )? this_PLUS_8= RULE_PLUS ( (lv_destinationCode_9_0= RULE_ID ) )? this_PLUS_10= RULE_PLUS ( (lv_carrierId_11_0= RULE_ID ) )? this_PLUS_12= RULE_PLUS ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )? (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:1725:3: ( (lv_segment_0_0= 'TVL' ) )
            // InternalEdilang.g:1726:4: (lv_segment_0_0= 'TVL' )
            {
            // InternalEdilang.g:1726:4: (lv_segment_0_0= 'TVL' )
            // InternalEdilang.g:1727:5: lv_segment_0_0= 'TVL'
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
            		
            // InternalEdilang.g:1743:3: ( ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) ) | ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* ) )
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
                    // InternalEdilang.g:1744:4: ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) )
                    {
                    // InternalEdilang.g:1744:4: ( (lv_dateAndTime_2_0= ruleDateOnlyFunction ) )
                    // InternalEdilang.g:1745:5: (lv_dateAndTime_2_0= ruleDateOnlyFunction )
                    {
                    // InternalEdilang.g:1745:5: (lv_dateAndTime_2_0= ruleDateOnlyFunction )
                    // InternalEdilang.g:1746:6: lv_dateAndTime_2_0= ruleDateOnlyFunction
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
                    // InternalEdilang.g:1764:4: ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* )
                    {
                    // InternalEdilang.g:1764:4: ( ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )* )
                    // InternalEdilang.g:1765:5: ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) ) (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )*
                    {
                    // InternalEdilang.g:1765:5: ( (lv_dateAndTime_3_0= ruleDateAndTimeFunction ) )
                    // InternalEdilang.g:1766:6: (lv_dateAndTime_3_0= ruleDateAndTimeFunction )
                    {
                    // InternalEdilang.g:1766:6: (lv_dateAndTime_3_0= ruleDateAndTimeFunction )
                    // InternalEdilang.g:1767:7: lv_dateAndTime_3_0= ruleDateAndTimeFunction
                    {

                    							newCompositeNode(grammarAccess.getTVLSegmentAccess().getDateAndTimeDateAndTimeFunctionParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_16);
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

                    // InternalEdilang.g:1784:5: (this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_COLON) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalEdilang.g:1785:6: this_COLON_4= RULE_COLON ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) )
                    	    {
                    	    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    	    						newLeafNode(this_COLON_4, grammarAccess.getTVLSegmentAccess().getCOLONTerminalRuleCall_2_1_1_0());
                    	    					
                    	    // InternalEdilang.g:1789:6: ( (lv_dateAndTime_5_0= ruleDateAndTimeFunction ) )
                    	    // InternalEdilang.g:1790:7: (lv_dateAndTime_5_0= ruleDateAndTimeFunction )
                    	    {
                    	    // InternalEdilang.g:1790:7: (lv_dateAndTime_5_0= ruleDateAndTimeFunction )
                    	    // InternalEdilang.g:1791:8: lv_dateAndTime_5_0= ruleDateAndTimeFunction
                    	    {

                    	    								newCompositeNode(grammarAccess.getTVLSegmentAccess().getDateAndTimeDateAndTimeFunctionParserRuleCall_2_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_16);
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
            		
            // InternalEdilang.g:1815:3: ( (lv_originCode_7_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEdilang.g:1816:4: (lv_originCode_7_0= RULE_ID )
                    {
                    // InternalEdilang.g:1816:4: (lv_originCode_7_0= RULE_ID )
                    // InternalEdilang.g:1817:5: lv_originCode_7_0= RULE_ID
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
            		
            // InternalEdilang.g:1837:3: ( (lv_destinationCode_9_0= RULE_ID ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalEdilang.g:1838:4: (lv_destinationCode_9_0= RULE_ID )
                    {
                    // InternalEdilang.g:1838:4: (lv_destinationCode_9_0= RULE_ID )
                    // InternalEdilang.g:1839:5: lv_destinationCode_9_0= RULE_ID
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
            		
            // InternalEdilang.g:1859:3: ( (lv_carrierId_11_0= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEdilang.g:1860:4: (lv_carrierId_11_0= RULE_ID )
                    {
                    // InternalEdilang.g:1860:4: (lv_carrierId_11_0= RULE_ID )
                    // InternalEdilang.g:1861:5: lv_carrierId_11_0= RULE_ID
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
            		
            // InternalEdilang.g:1881:3: ( ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEdilang.g:1882:4: ( (lv_productId_13_0= RULE_ID ) ) (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )?
                    {
                    // InternalEdilang.g:1882:4: ( (lv_productId_13_0= RULE_ID ) )
                    // InternalEdilang.g:1883:5: (lv_productId_13_0= RULE_ID )
                    {
                    // InternalEdilang.g:1883:5: (lv_productId_13_0= RULE_ID )
                    // InternalEdilang.g:1884:6: lv_productId_13_0= RULE_ID
                    {
                    lv_productId_13_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

                    // InternalEdilang.g:1900:4: (this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )? )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_COLON) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalEdilang.g:1901:5: this_COLON_14= RULE_COLON ( (lv_characteristicId_15_0= RULE_ID ) ) (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )?
                            {
                            this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_14, grammarAccess.getTVLSegmentAccess().getCOLONTerminalRuleCall_10_1_0());
                            				
                            // InternalEdilang.g:1905:5: ( (lv_characteristicId_15_0= RULE_ID ) )
                            // InternalEdilang.g:1906:6: (lv_characteristicId_15_0= RULE_ID )
                            {
                            // InternalEdilang.g:1906:6: (lv_characteristicId_15_0= RULE_ID )
                            // InternalEdilang.g:1907:7: lv_characteristicId_15_0= RULE_ID
                            {
                            lv_characteristicId_15_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

                            // InternalEdilang.g:1923:5: (this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )* )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==RULE_COLON) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // InternalEdilang.g:1924:6: this_COLON_16= RULE_COLON ( (lv_productIdCharacteristic_17_0= RULE_ID ) ) (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )*
                                    {
                                    this_COLON_16=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_16, grammarAccess.getTVLSegmentAccess().getCOLONTerminalRuleCall_10_1_2_0());
                                    					
                                    // InternalEdilang.g:1928:6: ( (lv_productIdCharacteristic_17_0= RULE_ID ) )
                                    // InternalEdilang.g:1929:7: (lv_productIdCharacteristic_17_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:1929:7: (lv_productIdCharacteristic_17_0= RULE_ID )
                                    // InternalEdilang.g:1930:8: lv_productIdCharacteristic_17_0= RULE_ID
                                    {
                                    lv_productIdCharacteristic_17_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

                                    // InternalEdilang.g:1946:6: (this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) ) )*
                                    loop47:
                                    do {
                                        int alt47=2;
                                        int LA47_0 = input.LA(1);

                                        if ( (LA47_0==RULE_COLON) ) {
                                            alt47=1;
                                        }


                                        switch (alt47) {
                                    	case 1 :
                                    	    // InternalEdilang.g:1947:7: this_COLON_18= RULE_COLON ( (lv_descriptionIds_19_0= RULE_ID ) )
                                    	    {
                                    	    this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    	    							newLeafNode(this_COLON_18, grammarAccess.getTVLSegmentAccess().getCOLONTerminalRuleCall_10_1_2_2_0());
                                    	    						
                                    	    // InternalEdilang.g:1951:7: ( (lv_descriptionIds_19_0= RULE_ID ) )
                                    	    // InternalEdilang.g:1952:8: (lv_descriptionIds_19_0= RULE_ID )
                                    	    {
                                    	    // InternalEdilang.g:1952:8: (lv_descriptionIds_19_0= RULE_ID )
                                    	    // InternalEdilang.g:1953:9: lv_descriptionIds_19_0= RULE_ID
                                    	    {
                                    	    lv_descriptionIds_19_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            // InternalEdilang.g:1973:3: (this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )? )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_PLUS) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalEdilang.g:1974:4: this_PLUS_20= RULE_PLUS ( (lv_productType_21_0= RULE_ID ) ) (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )?
                    {
                    this_PLUS_20=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_20, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_11_0());
                    			
                    // InternalEdilang.g:1978:4: ( (lv_productType_21_0= RULE_ID ) )
                    // InternalEdilang.g:1979:5: (lv_productType_21_0= RULE_ID )
                    {
                    // InternalEdilang.g:1979:5: (lv_productType_21_0= RULE_ID )
                    // InternalEdilang.g:1980:6: lv_productType_21_0= RULE_ID
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

                    // InternalEdilang.g:1996:4: (this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )? )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_PLUS) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalEdilang.g:1997:5: this_PLUS_22= RULE_PLUS ( (lv_lineItemNumber_23_0= RULE_ID ) ) (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )?
                            {
                            this_PLUS_22=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                            					newLeafNode(this_PLUS_22, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_11_2_0());
                            				
                            // InternalEdilang.g:2001:5: ( (lv_lineItemNumber_23_0= RULE_ID ) )
                            // InternalEdilang.g:2002:6: (lv_lineItemNumber_23_0= RULE_ID )
                            {
                            // InternalEdilang.g:2002:6: (lv_lineItemNumber_23_0= RULE_ID )
                            // InternalEdilang.g:2003:7: lv_lineItemNumber_23_0= RULE_ID
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

                            // InternalEdilang.g:2019:5: (this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) ) )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==RULE_PLUS) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // InternalEdilang.g:2020:6: this_PLUS_24= RULE_PLUS ( (lv_processingIndicatorCode_25_0= RULE_ID ) )
                                    {
                                    this_PLUS_24=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                    						newLeafNode(this_PLUS_24, grammarAccess.getTVLSegmentAccess().getPLUSTerminalRuleCall_11_2_2_0());
                                    					
                                    // InternalEdilang.g:2024:6: ( (lv_processingIndicatorCode_25_0= RULE_ID ) )
                                    // InternalEdilang.g:2025:7: (lv_processingIndicatorCode_25_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:2025:7: (lv_processingIndicatorCode_25_0= RULE_ID )
                                    // InternalEdilang.g:2026:8: lv_processingIndicatorCode_25_0= RULE_ID
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

            // InternalEdilang.g:2045:3: ( (lv_lineEnd_26_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2046:4: (lv_lineEnd_26_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2046:4: (lv_lineEnd_26_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2047:5: lv_lineEnd_26_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:2067:1: entryRuleRPISegment returns [EObject current=null] : iv_ruleRPISegment= ruleRPISegment EOF ;
    public final EObject entryRuleRPISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRPISegment = null;


        try {
            // InternalEdilang.g:2067:51: (iv_ruleRPISegment= ruleRPISegment EOF )
            // InternalEdilang.g:2068:2: iv_ruleRPISegment= ruleRPISegment EOF
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
    // InternalEdilang.g:2074:1: ruleRPISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:2080:2: ( ( ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2081:2: ( ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2081:2: ( ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2082:3: ( (lv_segment_0_0= 'RPI' ) ) this_PLUS_1= RULE_PLUS ( (lv_numberOfPax_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_status_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2082:3: ( (lv_segment_0_0= 'RPI' ) )
            // InternalEdilang.g:2083:4: (lv_segment_0_0= 'RPI' )
            {
            // InternalEdilang.g:2083:4: (lv_segment_0_0= 'RPI' )
            // InternalEdilang.g:2084:5: lv_segment_0_0= 'RPI'
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
            		
            // InternalEdilang.g:2100:3: ( (lv_numberOfPax_2_0= RULE_ID ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEdilang.g:2101:4: (lv_numberOfPax_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:2101:4: (lv_numberOfPax_2_0= RULE_ID )
                    // InternalEdilang.g:2102:5: lv_numberOfPax_2_0= RULE_ID
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
            		
            // InternalEdilang.g:2122:3: ( (lv_status_4_0= RULE_ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalEdilang.g:2123:4: (lv_status_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:2123:4: (lv_status_4_0= RULE_ID )
                    // InternalEdilang.g:2124:5: lv_status_4_0= RULE_ID
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

            // InternalEdilang.g:2140:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2141:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2141:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2142:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:2162:1: entryRuleMOASegment returns [EObject current=null] : iv_ruleMOASegment= ruleMOASegment EOF ;
    public final EObject entryRuleMOASegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOASegment = null;


        try {
            // InternalEdilang.g:2162:51: (iv_ruleMOASegment= ruleMOASegment EOF )
            // InternalEdilang.g:2163:2: iv_ruleMOASegment= ruleMOASegment EOF
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
    // InternalEdilang.g:2169:1: ruleMOASegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_monetaryAmountTypeCodeQualifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_monetaryAmount_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyIdentificationCode_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_11_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleMOASegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_monetaryAmountTypeCodeQualifier_2_0=null;
        Token this_COLON_3=null;
        Token lv_monetaryAmount_4_0=null;
        Token this_COLON_5=null;
        Token lv_currencyIdentificationCode_6_0=null;
        Token this_COLON_7=null;
        Token lv_currencyTypeCodeQualifier_8_0=null;
        Token this_COLON_9=null;
        Token lv_statusDescriptionCode_10_0=null;
        Token lv_lineEnd_11_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:2175:2: ( ( ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_monetaryAmountTypeCodeQualifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_monetaryAmount_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyIdentificationCode_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_11_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2176:2: ( ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_monetaryAmountTypeCodeQualifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_monetaryAmount_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyIdentificationCode_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_11_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2176:2: ( ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_monetaryAmountTypeCodeQualifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_monetaryAmount_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyIdentificationCode_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_11_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2177:3: ( (lv_segment_0_0= 'MOA' ) ) this_PLUS_1= RULE_PLUS ( (lv_monetaryAmountTypeCodeQualifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_monetaryAmount_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyIdentificationCode_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_11_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2177:3: ( (lv_segment_0_0= 'MOA' ) )
            // InternalEdilang.g:2178:4: (lv_segment_0_0= 'MOA' )
            {
            // InternalEdilang.g:2178:4: (lv_segment_0_0= 'MOA' )
            // InternalEdilang.g:2179:5: lv_segment_0_0= 'MOA'
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
            		
            // InternalEdilang.g:2195:3: ( (lv_monetaryAmountTypeCodeQualifier_2_0= RULE_ID ) )
            // InternalEdilang.g:2196:4: (lv_monetaryAmountTypeCodeQualifier_2_0= RULE_ID )
            {
            // InternalEdilang.g:2196:4: (lv_monetaryAmountTypeCodeQualifier_2_0= RULE_ID )
            // InternalEdilang.g:2197:5: lv_monetaryAmountTypeCodeQualifier_2_0= RULE_ID
            {
            lv_monetaryAmountTypeCodeQualifier_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_monetaryAmountTypeCodeQualifier_2_0, grammarAccess.getMOASegmentAccess().getMonetaryAmountTypeCodeQualifierIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMOASegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"monetaryAmountTypeCodeQualifier",
            						lv_monetaryAmountTypeCodeQualifier_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:2213:3: (this_COLON_3= RULE_COLON ( (lv_monetaryAmount_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyIdentificationCode_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )? )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_COLON) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalEdilang.g:2214:4: this_COLON_3= RULE_COLON ( (lv_monetaryAmount_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyIdentificationCode_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )? )?
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getMOASegmentAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:2218:4: ( (lv_monetaryAmount_4_0= RULE_ID ) )
                    // InternalEdilang.g:2219:5: (lv_monetaryAmount_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:2219:5: (lv_monetaryAmount_4_0= RULE_ID )
                    // InternalEdilang.g:2220:6: lv_monetaryAmount_4_0= RULE_ID
                    {
                    lv_monetaryAmount_4_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_monetaryAmount_4_0, grammarAccess.getMOASegmentAccess().getMonetaryAmountIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMOASegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"monetaryAmount",
                    							lv_monetaryAmount_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:2236:4: (this_COLON_5= RULE_COLON ( (lv_currencyIdentificationCode_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )? )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_COLON) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalEdilang.g:2237:5: this_COLON_5= RULE_COLON ( (lv_currencyIdentificationCode_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )?
                            {
                            this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_5, grammarAccess.getMOASegmentAccess().getCOLONTerminalRuleCall_3_2_0());
                            				
                            // InternalEdilang.g:2241:5: ( (lv_currencyIdentificationCode_6_0= RULE_ID ) )
                            // InternalEdilang.g:2242:6: (lv_currencyIdentificationCode_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:2242:6: (lv_currencyIdentificationCode_6_0= RULE_ID )
                            // InternalEdilang.g:2243:7: lv_currencyIdentificationCode_6_0= RULE_ID
                            {
                            lv_currencyIdentificationCode_6_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                            							newLeafNode(lv_currencyIdentificationCode_6_0, grammarAccess.getMOASegmentAccess().getCurrencyIdentificationCodeIDTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMOASegmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"currencyIdentificationCode",
                            								lv_currencyIdentificationCode_6_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:2259:5: (this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )? )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==RULE_COLON) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // InternalEdilang.g:2260:6: this_COLON_7= RULE_COLON ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )?
                                    {
                                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_7, grammarAccess.getMOASegmentAccess().getCOLONTerminalRuleCall_3_2_2_0());
                                    					
                                    // InternalEdilang.g:2264:6: ( (lv_currencyTypeCodeQualifier_8_0= RULE_ID ) )
                                    // InternalEdilang.g:2265:7: (lv_currencyTypeCodeQualifier_8_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:2265:7: (lv_currencyTypeCodeQualifier_8_0= RULE_ID )
                                    // InternalEdilang.g:2266:8: lv_currencyTypeCodeQualifier_8_0= RULE_ID
                                    {
                                    lv_currencyTypeCodeQualifier_8_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                                    								newLeafNode(lv_currencyTypeCodeQualifier_8_0, grammarAccess.getMOASegmentAccess().getCurrencyTypeCodeQualifierIDTerminalRuleCall_3_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getMOASegmentRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"currencyTypeCodeQualifier",
                                    									lv_currencyTypeCodeQualifier_8_0,
                                    									"io.thlaegler.edifact.Edilang.ID");
                                    							

                                    }


                                    }

                                    // InternalEdilang.g:2282:6: (this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) ) )?
                                    int alt56=2;
                                    int LA56_0 = input.LA(1);

                                    if ( (LA56_0==RULE_COLON) ) {
                                        alt56=1;
                                    }
                                    switch (alt56) {
                                        case 1 :
                                            // InternalEdilang.g:2283:7: this_COLON_9= RULE_COLON ( (lv_statusDescriptionCode_10_0= RULE_ID ) )
                                            {
                                            this_COLON_9=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                            							newLeafNode(this_COLON_9, grammarAccess.getMOASegmentAccess().getCOLONTerminalRuleCall_3_2_2_2_0());
                                            						
                                            // InternalEdilang.g:2287:7: ( (lv_statusDescriptionCode_10_0= RULE_ID ) )
                                            // InternalEdilang.g:2288:8: (lv_statusDescriptionCode_10_0= RULE_ID )
                                            {
                                            // InternalEdilang.g:2288:8: (lv_statusDescriptionCode_10_0= RULE_ID )
                                            // InternalEdilang.g:2289:9: lv_statusDescriptionCode_10_0= RULE_ID
                                            {
                                            lv_statusDescriptionCode_10_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                                            									newLeafNode(lv_statusDescriptionCode_10_0, grammarAccess.getMOASegmentAccess().getStatusDescriptionCodeIDTerminalRuleCall_3_2_2_2_1_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getMOASegmentRule());
                                            									}
                                            									setWithLastConsumed(
                                            										current,
                                            										"statusDescriptionCode",
                                            										lv_statusDescriptionCode_10_0,
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


                    }
                    break;

            }

            // InternalEdilang.g:2309:3: ( (lv_lineEnd_11_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2310:4: (lv_lineEnd_11_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2310:4: (lv_lineEnd_11_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2311:5: lv_lineEnd_11_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_11_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_11_0, grammarAccess.getMOASegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMOASegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineEnd",
            						lv_lineEnd_11_0,
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
    // InternalEdilang.g:2331:1: entryRuleLINSegment returns [EObject current=null] : iv_ruleLINSegment= ruleLINSegment EOF ;
    public final EObject entryRuleLINSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLINSegment = null;


        try {
            // InternalEdilang.g:2331:51: (iv_ruleLINSegment= ruleLINSegment EOF )
            // InternalEdilang.g:2332:2: iv_ruleLINSegment= ruleLINSegment EOF
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
    // InternalEdilang.g:2338:1: ruleLINSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_lineItemIdentifier_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_actionRequest_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification ) ) (this_PLUS_7= RULE_PLUS ( (lv_sublineInformation_8_0= ruleSublineInformation ) ) (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleLINSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_lineItemIdentifier_2_0=null;
        Token this_PLUS_3=null;
        Token lv_actionRequest_4_0=null;
        Token this_PLUS_5=null;
        Token this_PLUS_7=null;
        Token this_PLUS_9=null;
        Token lv_configurationLevelNumber_10_0=null;
        Token this_PLUS_11=null;
        Token lv_configurationOperationCode_12_0=null;
        Token lv_lineEnd_13_0=null;
        EObject lv_itemNumberIdentification_6_0 = null;

        EObject lv_sublineInformation_8_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:2344:2: ( ( ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_lineItemIdentifier_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_actionRequest_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification ) ) (this_PLUS_7= RULE_PLUS ( (lv_sublineInformation_8_0= ruleSublineInformation ) ) (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2345:2: ( ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_lineItemIdentifier_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_actionRequest_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification ) ) (this_PLUS_7= RULE_PLUS ( (lv_sublineInformation_8_0= ruleSublineInformation ) ) (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2345:2: ( ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_lineItemIdentifier_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_actionRequest_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification ) ) (this_PLUS_7= RULE_PLUS ( (lv_sublineInformation_8_0= ruleSublineInformation ) ) (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2346:3: ( (lv_segment_0_0= 'LIN' ) ) this_PLUS_1= RULE_PLUS ( (lv_lineItemIdentifier_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_actionRequest_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( ( (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification ) ) (this_PLUS_7= RULE_PLUS ( (lv_sublineInformation_8_0= ruleSublineInformation ) ) (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )? )? )? ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2346:3: ( (lv_segment_0_0= 'LIN' ) )
            // InternalEdilang.g:2347:4: (lv_segment_0_0= 'LIN' )
            {
            // InternalEdilang.g:2347:4: (lv_segment_0_0= 'LIN' )
            // InternalEdilang.g:2348:5: lv_segment_0_0= 'LIN'
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
            		
            // InternalEdilang.g:2364:3: ( (lv_lineItemIdentifier_2_0= RULE_ID ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalEdilang.g:2365:4: (lv_lineItemIdentifier_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:2365:4: (lv_lineItemIdentifier_2_0= RULE_ID )
                    // InternalEdilang.g:2366:5: lv_lineItemIdentifier_2_0= RULE_ID
                    {
                    lv_lineItemIdentifier_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_lineItemIdentifier_2_0, grammarAccess.getLINSegmentAccess().getLineItemIdentifierIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLINSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"lineItemIdentifier",
                    						lv_lineItemIdentifier_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_3, grammarAccess.getLINSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:2386:3: ( (lv_actionRequest_4_0= RULE_ID ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalEdilang.g:2387:4: (lv_actionRequest_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:2387:4: (lv_actionRequest_4_0= RULE_ID )
                    // InternalEdilang.g:2388:5: lv_actionRequest_4_0= RULE_ID
                    {
                    lv_actionRequest_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_actionRequest_4_0, grammarAccess.getLINSegmentAccess().getActionRequestIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLINSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"actionRequest",
                    						lv_actionRequest_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_12); 

            			newLeafNode(this_PLUS_5, grammarAccess.getLINSegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:2408:3: ( ( (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification ) ) (this_PLUS_7= RULE_PLUS ( (lv_sublineInformation_8_0= ruleSublineInformation ) ) (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )? )? )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalEdilang.g:2409:4: ( (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification ) ) (this_PLUS_7= RULE_PLUS ( (lv_sublineInformation_8_0= ruleSublineInformation ) ) (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )? )?
                    {
                    // InternalEdilang.g:2409:4: ( (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification ) )
                    // InternalEdilang.g:2410:5: (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification )
                    {
                    // InternalEdilang.g:2410:5: (lv_itemNumberIdentification_6_0= ruleItemNumberIdentification )
                    // InternalEdilang.g:2411:6: lv_itemNumberIdentification_6_0= ruleItemNumberIdentification
                    {

                    						newCompositeNode(grammarAccess.getLINSegmentAccess().getItemNumberIdentificationItemNumberIdentificationParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_itemNumberIdentification_6_0=ruleItemNumberIdentification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLINSegmentRule());
                    						}
                    						set(
                    							current,
                    							"itemNumberIdentification",
                    							lv_itemNumberIdentification_6_0,
                    							"io.thlaegler.edifact.Edilang.ItemNumberIdentification");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEdilang.g:2428:4: (this_PLUS_7= RULE_PLUS ( (lv_sublineInformation_8_0= ruleSublineInformation ) ) (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )? )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_PLUS) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalEdilang.g:2429:5: this_PLUS_7= RULE_PLUS ( (lv_sublineInformation_8_0= ruleSublineInformation ) ) (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )?
                            {
                            this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                            					newLeafNode(this_PLUS_7, grammarAccess.getLINSegmentAccess().getPLUSTerminalRuleCall_6_1_0());
                            				
                            // InternalEdilang.g:2433:5: ( (lv_sublineInformation_8_0= ruleSublineInformation ) )
                            // InternalEdilang.g:2434:6: (lv_sublineInformation_8_0= ruleSublineInformation )
                            {
                            // InternalEdilang.g:2434:6: (lv_sublineInformation_8_0= ruleSublineInformation )
                            // InternalEdilang.g:2435:7: lv_sublineInformation_8_0= ruleSublineInformation
                            {

                            							newCompositeNode(grammarAccess.getLINSegmentAccess().getSublineInformationSublineInformationParserRuleCall_6_1_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_sublineInformation_8_0=ruleSublineInformation();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLINSegmentRule());
                            							}
                            							set(
                            								current,
                            								"sublineInformation",
                            								lv_sublineInformation_8_0,
                            								"io.thlaegler.edifact.Edilang.SublineInformation");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalEdilang.g:2452:5: (this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )? )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==RULE_PLUS) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // InternalEdilang.g:2453:6: this_PLUS_9= RULE_PLUS ( (lv_configurationLevelNumber_10_0= RULE_ID ) ) (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )?
                                    {
                                    this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                    						newLeafNode(this_PLUS_9, grammarAccess.getLINSegmentAccess().getPLUSTerminalRuleCall_6_1_2_0());
                                    					
                                    // InternalEdilang.g:2457:6: ( (lv_configurationLevelNumber_10_0= RULE_ID ) )
                                    // InternalEdilang.g:2458:7: (lv_configurationLevelNumber_10_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:2458:7: (lv_configurationLevelNumber_10_0= RULE_ID )
                                    // InternalEdilang.g:2459:8: lv_configurationLevelNumber_10_0= RULE_ID
                                    {
                                    lv_configurationLevelNumber_10_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                                    								newLeafNode(lv_configurationLevelNumber_10_0, grammarAccess.getLINSegmentAccess().getConfigurationLevelNumberIDTerminalRuleCall_6_1_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getLINSegmentRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"configurationLevelNumber",
                                    									lv_configurationLevelNumber_10_0,
                                    									"io.thlaegler.edifact.Edilang.ID");
                                    							

                                    }


                                    }

                                    // InternalEdilang.g:2475:6: (this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) ) )?
                                    int alt62=2;
                                    int LA62_0 = input.LA(1);

                                    if ( (LA62_0==RULE_PLUS) ) {
                                        alt62=1;
                                    }
                                    switch (alt62) {
                                        case 1 :
                                            // InternalEdilang.g:2476:7: this_PLUS_11= RULE_PLUS ( (lv_configurationOperationCode_12_0= RULE_ID ) )
                                            {
                                            this_PLUS_11=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                            							newLeafNode(this_PLUS_11, grammarAccess.getLINSegmentAccess().getPLUSTerminalRuleCall_6_1_2_2_0());
                                            						
                                            // InternalEdilang.g:2480:7: ( (lv_configurationOperationCode_12_0= RULE_ID ) )
                                            // InternalEdilang.g:2481:8: (lv_configurationOperationCode_12_0= RULE_ID )
                                            {
                                            // InternalEdilang.g:2481:8: (lv_configurationOperationCode_12_0= RULE_ID )
                                            // InternalEdilang.g:2482:9: lv_configurationOperationCode_12_0= RULE_ID
                                            {
                                            lv_configurationOperationCode_12_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                                            									newLeafNode(lv_configurationOperationCode_12_0, grammarAccess.getLINSegmentAccess().getConfigurationOperationCodeIDTerminalRuleCall_6_1_2_2_1_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getLINSegmentRule());
                                            									}
                                            									setWithLastConsumed(
                                            										current,
                                            										"configurationOperationCode",
                                            										lv_configurationOperationCode_12_0,
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


                    }
                    break;

            }

            // InternalEdilang.g:2502:3: ( (lv_lineEnd_13_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2503:4: (lv_lineEnd_13_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2503:4: (lv_lineEnd_13_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2504:5: lv_lineEnd_13_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_13_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_13_0, grammarAccess.getLINSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLINSegmentRule());
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
    // $ANTLR end "ruleLINSegment"


    // $ANTLR start "entryRulePRISegment"
    // InternalEdilang.g:2524:1: entryRulePRISegment returns [EObject current=null] : iv_rulePRISegment= rulePRISegment EOF ;
    public final EObject entryRulePRISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRISegment = null;


        try {
            // InternalEdilang.g:2524:51: (iv_rulePRISegment= rulePRISegment EOF )
            // InternalEdilang.g:2525:2: iv_rulePRISegment= rulePRISegment EOF
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
    // InternalEdilang.g:2531:1: rulePRISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePriceInformation ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject rulePRISegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_lineEnd_3_0=null;
        EObject lv_sub_2_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:2537:2: ( ( ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePriceInformation ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2538:2: ( ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePriceInformation ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2538:2: ( ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePriceInformation ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2539:3: ( (lv_segment_0_0= 'PRI' ) ) this_PLUS_1= RULE_PLUS ( (lv_sub_2_0= rulePriceInformation ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2539:3: ( (lv_segment_0_0= 'PRI' ) )
            // InternalEdilang.g:2540:4: (lv_segment_0_0= 'PRI' )
            {
            // InternalEdilang.g:2540:4: (lv_segment_0_0= 'PRI' )
            // InternalEdilang.g:2541:5: lv_segment_0_0= 'PRI'
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
            		
            // InternalEdilang.g:2557:3: ( (lv_sub_2_0= rulePriceInformation ) )
            // InternalEdilang.g:2558:4: (lv_sub_2_0= rulePriceInformation )
            {
            // InternalEdilang.g:2558:4: (lv_sub_2_0= rulePriceInformation )
            // InternalEdilang.g:2559:5: lv_sub_2_0= rulePriceInformation
            {

            					newCompositeNode(grammarAccess.getPRISegmentAccess().getSubPriceInformationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_sub_2_0=rulePriceInformation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPRISegmentRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_2_0,
            						"io.thlaegler.edifact.Edilang.PriceInformation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdilang.g:2576:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2577:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2577:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2578:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:2598:1: entryRuleQTYSegment returns [EObject current=null] : iv_ruleQTYSegment= ruleQTYSegment EOF ;
    public final EObject entryRuleQTYSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQTYSegment = null;


        try {
            // InternalEdilang.g:2598:51: (iv_ruleQTYSegment= ruleQTYSegment EOF )
            // InternalEdilang.g:2599:2: iv_ruleQTYSegment= ruleQTYSegment EOF
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
    // InternalEdilang.g:2605:1: ruleQTYSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'QTY' ) ) (this_PLUS_1= RULE_PLUS ( (lv_quantityDetails_2_0= ruleQuantityDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleQTYSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_lineEnd_3_0=null;
        EObject lv_quantityDetails_2_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:2611:2: ( ( ( (lv_segment_0_0= 'QTY' ) ) (this_PLUS_1= RULE_PLUS ( (lv_quantityDetails_2_0= ruleQuantityDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2612:2: ( ( (lv_segment_0_0= 'QTY' ) ) (this_PLUS_1= RULE_PLUS ( (lv_quantityDetails_2_0= ruleQuantityDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2612:2: ( ( (lv_segment_0_0= 'QTY' ) ) (this_PLUS_1= RULE_PLUS ( (lv_quantityDetails_2_0= ruleQuantityDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2613:3: ( (lv_segment_0_0= 'QTY' ) ) (this_PLUS_1= RULE_PLUS ( (lv_quantityDetails_2_0= ruleQuantityDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2613:3: ( (lv_segment_0_0= 'QTY' ) )
            // InternalEdilang.g:2614:4: (lv_segment_0_0= 'QTY' )
            {
            // InternalEdilang.g:2614:4: (lv_segment_0_0= 'QTY' )
            // InternalEdilang.g:2615:5: lv_segment_0_0= 'QTY'
            {
            lv_segment_0_0=(Token)match(input,29,FOLLOW_11); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getQTYSegmentAccess().getSegmentQTYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQTYSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "QTY");
            				

            }


            }

            // InternalEdilang.g:2627:3: (this_PLUS_1= RULE_PLUS ( (lv_quantityDetails_2_0= ruleQuantityDetail ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_PLUS) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalEdilang.g:2628:4: this_PLUS_1= RULE_PLUS ( (lv_quantityDetails_2_0= ruleQuantityDetail ) )
            	    {
            	    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            	    				newLeafNode(this_PLUS_1, grammarAccess.getQTYSegmentAccess().getPLUSTerminalRuleCall_1_0());
            	    			
            	    // InternalEdilang.g:2632:4: ( (lv_quantityDetails_2_0= ruleQuantityDetail ) )
            	    // InternalEdilang.g:2633:5: (lv_quantityDetails_2_0= ruleQuantityDetail )
            	    {
            	    // InternalEdilang.g:2633:5: (lv_quantityDetails_2_0= ruleQuantityDetail )
            	    // InternalEdilang.g:2634:6: lv_quantityDetails_2_0= ruleQuantityDetail
            	    {

            	    						newCompositeNode(grammarAccess.getQTYSegmentAccess().getQuantityDetailsQuantityDetailParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_quantityDetails_2_0=ruleQuantityDetail();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQTYSegmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"quantityDetails",
            	    							lv_quantityDetails_2_0,
            	    							"io.thlaegler.edifact.Edilang.QuantityDetail");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalEdilang.g:2652:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2653:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2653:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2654:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_3_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_3_0, grammarAccess.getQTYSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQTYSegmentRule());
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
    // $ANTLR end "ruleQTYSegment"


    // $ANTLR start "entryRuleCUXSegment"
    // InternalEdilang.g:2674:1: entryRuleCUXSegment returns [EObject current=null] : iv_ruleCUXSegment= ruleCUXSegment EOF ;
    public final EObject entryRuleCUXSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCUXSegment = null;


        try {
            // InternalEdilang.g:2674:51: (iv_ruleCUXSegment= ruleCUXSegment EOF )
            // InternalEdilang.g:2675:2: iv_ruleCUXSegment= ruleCUXSegment EOF
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
    // InternalEdilang.g:2681:1: ruleCUXSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_currencyDetails1_2_0= ruleCurrencyDetail ) ) (this_PLUS_3= RULE_PLUS ( (lv_currencyDetails2_4_0= ruleCurrencyDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_currencyExchangeRate_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleCUXSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token this_PLUS_3=null;
        Token this_PLUS_5=null;
        Token lv_currencyExchangeRate_6_0=null;
        Token this_PLUS_7=null;
        Token lv_exchangeRateCurrencyMarketIdentifier_8_0=null;
        Token lv_lineEnd_9_0=null;
        EObject lv_currencyDetails1_2_0 = null;

        EObject lv_currencyDetails2_4_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:2687:2: ( ( ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_currencyDetails1_2_0= ruleCurrencyDetail ) ) (this_PLUS_3= RULE_PLUS ( (lv_currencyDetails2_4_0= ruleCurrencyDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_currencyExchangeRate_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2688:2: ( ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_currencyDetails1_2_0= ruleCurrencyDetail ) ) (this_PLUS_3= RULE_PLUS ( (lv_currencyDetails2_4_0= ruleCurrencyDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_currencyExchangeRate_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2688:2: ( ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_currencyDetails1_2_0= ruleCurrencyDetail ) ) (this_PLUS_3= RULE_PLUS ( (lv_currencyDetails2_4_0= ruleCurrencyDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_currencyExchangeRate_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2689:3: ( (lv_segment_0_0= 'CUX' ) ) this_PLUS_1= RULE_PLUS ( (lv_currencyDetails1_2_0= ruleCurrencyDetail ) ) (this_PLUS_3= RULE_PLUS ( (lv_currencyDetails2_4_0= ruleCurrencyDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_currencyExchangeRate_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )? )? )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2689:3: ( (lv_segment_0_0= 'CUX' ) )
            // InternalEdilang.g:2690:4: (lv_segment_0_0= 'CUX' )
            {
            // InternalEdilang.g:2690:4: (lv_segment_0_0= 'CUX' )
            // InternalEdilang.g:2691:5: lv_segment_0_0= 'CUX'
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
            		
            // InternalEdilang.g:2707:3: ( (lv_currencyDetails1_2_0= ruleCurrencyDetail ) )
            // InternalEdilang.g:2708:4: (lv_currencyDetails1_2_0= ruleCurrencyDetail )
            {
            // InternalEdilang.g:2708:4: (lv_currencyDetails1_2_0= ruleCurrencyDetail )
            // InternalEdilang.g:2709:5: lv_currencyDetails1_2_0= ruleCurrencyDetail
            {

            					newCompositeNode(grammarAccess.getCUXSegmentAccess().getCurrencyDetails1CurrencyDetailParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_currencyDetails1_2_0=ruleCurrencyDetail();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCUXSegmentRule());
            					}
            					set(
            						current,
            						"currencyDetails1",
            						lv_currencyDetails1_2_0,
            						"io.thlaegler.edifact.Edilang.CurrencyDetail");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdilang.g:2726:3: (this_PLUS_3= RULE_PLUS ( (lv_currencyDetails2_4_0= ruleCurrencyDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_currencyExchangeRate_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )? )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_PLUS) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalEdilang.g:2727:4: this_PLUS_3= RULE_PLUS ( (lv_currencyDetails2_4_0= ruleCurrencyDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_currencyExchangeRate_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )? )?
                    {
                    this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_3, grammarAccess.getCUXSegmentAccess().getPLUSTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:2731:4: ( (lv_currencyDetails2_4_0= ruleCurrencyDetail ) )
                    // InternalEdilang.g:2732:5: (lv_currencyDetails2_4_0= ruleCurrencyDetail )
                    {
                    // InternalEdilang.g:2732:5: (lv_currencyDetails2_4_0= ruleCurrencyDetail )
                    // InternalEdilang.g:2733:6: lv_currencyDetails2_4_0= ruleCurrencyDetail
                    {

                    						newCompositeNode(grammarAccess.getCUXSegmentAccess().getCurrencyDetails2CurrencyDetailParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_currencyDetails2_4_0=ruleCurrencyDetail();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCUXSegmentRule());
                    						}
                    						set(
                    							current,
                    							"currencyDetails2",
                    							lv_currencyDetails2_4_0,
                    							"io.thlaegler.edifact.Edilang.CurrencyDetail");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEdilang.g:2750:4: (this_PLUS_5= RULE_PLUS ( (lv_currencyExchangeRate_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )? )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_PLUS) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalEdilang.g:2751:5: this_PLUS_5= RULE_PLUS ( (lv_currencyExchangeRate_6_0= RULE_ID ) ) (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )?
                            {
                            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                            					newLeafNode(this_PLUS_5, grammarAccess.getCUXSegmentAccess().getPLUSTerminalRuleCall_3_2_0());
                            				
                            // InternalEdilang.g:2755:5: ( (lv_currencyExchangeRate_6_0= RULE_ID ) )
                            // InternalEdilang.g:2756:6: (lv_currencyExchangeRate_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:2756:6: (lv_currencyExchangeRate_6_0= RULE_ID )
                            // InternalEdilang.g:2757:7: lv_currencyExchangeRate_6_0= RULE_ID
                            {
                            lv_currencyExchangeRate_6_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                            							newLeafNode(lv_currencyExchangeRate_6_0, grammarAccess.getCUXSegmentAccess().getCurrencyExchangeRateIDTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCUXSegmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"currencyExchangeRate",
                            								lv_currencyExchangeRate_6_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:2773:5: (this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) ) )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==RULE_PLUS) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // InternalEdilang.g:2774:6: this_PLUS_7= RULE_PLUS ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) )
                                    {
                                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                    						newLeafNode(this_PLUS_7, grammarAccess.getCUXSegmentAccess().getPLUSTerminalRuleCall_3_2_2_0());
                                    					
                                    // InternalEdilang.g:2778:6: ( (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID ) )
                                    // InternalEdilang.g:2779:7: (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:2779:7: (lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID )
                                    // InternalEdilang.g:2780:8: lv_exchangeRateCurrencyMarketIdentifier_8_0= RULE_ID
                                    {
                                    lv_exchangeRateCurrencyMarketIdentifier_8_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                                    								newLeafNode(lv_exchangeRateCurrencyMarketIdentifier_8_0, grammarAccess.getCUXSegmentAccess().getExchangeRateCurrencyMarketIdentifierIDTerminalRuleCall_3_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getCUXSegmentRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"exchangeRateCurrencyMarketIdentifier",
                                    									lv_exchangeRateCurrencyMarketIdentifier_8_0,
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

            // InternalEdilang.g:2799:3: ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:2800:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:2800:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:2801:5: lv_lineEnd_9_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_9_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_9_0, grammarAccess.getCUXSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCUXSegmentRule());
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
    // $ANTLR end "ruleCUXSegment"


    // $ANTLR start "entryRuleTAXSegment"
    // InternalEdilang.g:2821:1: entryRuleTAXSegment returns [EObject current=null] : iv_ruleTAXSegment= ruleTAXSegment EOF ;
    public final EObject entryRuleTAXSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAXSegment = null;


        try {
            // InternalEdilang.g:2821:51: (iv_ruleTAXSegment= ruleTAXSegment EOF )
            // InternalEdilang.g:2822:2: iv_ruleTAXSegment= ruleTAXSegment EOF
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
    // InternalEdilang.g:2828:1: ruleTAXSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_taxFunctionCodeQualifier_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_taxType_4_0= ruleTaxType ) ) (this_PLUS_5= RULE_PLUS ( (lv_taxAccountDetail_6_0= ruleTaxAccountDetail ) )? (this_PLUS_7= RULE_PLUS ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )? (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleTAXSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_taxFunctionCodeQualifier_2_0=null;
        Token this_PLUS_3=null;
        Token this_PLUS_5=null;
        Token this_PLUS_7=null;
        Token lv_taxAssessmentBasicValue_8_0=null;
        Token this_PLUS_9=null;
        Token this_PLUS_11=null;
        Token lv_taxCategoryCode_12_0=null;
        Token this_PLUS_13=null;
        Token lv_partyTaxIdentifier_14_0=null;
        Token this_PLUS_15=null;
        Token lv_calculationSequenceCode_16_0=null;
        Token lv_lineEnd_17_0=null;
        EObject lv_taxType_4_0 = null;

        EObject lv_taxAccountDetail_6_0 = null;

        EObject lv_taxDetail_10_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:2834:2: ( ( ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_taxFunctionCodeQualifier_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_taxType_4_0= ruleTaxType ) ) (this_PLUS_5= RULE_PLUS ( (lv_taxAccountDetail_6_0= ruleTaxAccountDetail ) )? (this_PLUS_7= RULE_PLUS ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )? (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:2835:2: ( ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_taxFunctionCodeQualifier_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_taxType_4_0= ruleTaxType ) ) (this_PLUS_5= RULE_PLUS ( (lv_taxAccountDetail_6_0= ruleTaxAccountDetail ) )? (this_PLUS_7= RULE_PLUS ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )? (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:2835:2: ( ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_taxFunctionCodeQualifier_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_taxType_4_0= ruleTaxType ) ) (this_PLUS_5= RULE_PLUS ( (lv_taxAccountDetail_6_0= ruleTaxAccountDetail ) )? (this_PLUS_7= RULE_PLUS ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )? (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:2836:3: ( (lv_segment_0_0= 'TAX' ) ) this_PLUS_1= RULE_PLUS ( (lv_taxFunctionCodeQualifier_2_0= RULE_ID ) ) this_PLUS_3= RULE_PLUS ( (lv_taxType_4_0= ruleTaxType ) ) (this_PLUS_5= RULE_PLUS ( (lv_taxAccountDetail_6_0= ruleTaxAccountDetail ) )? (this_PLUS_7= RULE_PLUS ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )? (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )? )? )? ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:2836:3: ( (lv_segment_0_0= 'TAX' ) )
            // InternalEdilang.g:2837:4: (lv_segment_0_0= 'TAX' )
            {
            // InternalEdilang.g:2837:4: (lv_segment_0_0= 'TAX' )
            // InternalEdilang.g:2838:5: lv_segment_0_0= 'TAX'
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
            		
            // InternalEdilang.g:2854:3: ( (lv_taxFunctionCodeQualifier_2_0= RULE_ID ) )
            // InternalEdilang.g:2855:4: (lv_taxFunctionCodeQualifier_2_0= RULE_ID )
            {
            // InternalEdilang.g:2855:4: (lv_taxFunctionCodeQualifier_2_0= RULE_ID )
            // InternalEdilang.g:2856:5: lv_taxFunctionCodeQualifier_2_0= RULE_ID
            {
            lv_taxFunctionCodeQualifier_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_taxFunctionCodeQualifier_2_0, grammarAccess.getTAXSegmentAccess().getTaxFunctionCodeQualifierIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTAXSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taxFunctionCodeQualifier",
            						lv_taxFunctionCodeQualifier_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            			newLeafNode(this_PLUS_3, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:2876:3: ( (lv_taxType_4_0= ruleTaxType ) )
            // InternalEdilang.g:2877:4: (lv_taxType_4_0= ruleTaxType )
            {
            // InternalEdilang.g:2877:4: (lv_taxType_4_0= ruleTaxType )
            // InternalEdilang.g:2878:5: lv_taxType_4_0= ruleTaxType
            {

            					newCompositeNode(grammarAccess.getTAXSegmentAccess().getTaxTypeTaxTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_taxType_4_0=ruleTaxType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTAXSegmentRule());
            					}
            					set(
            						current,
            						"taxType",
            						lv_taxType_4_0,
            						"io.thlaegler.edifact.Edilang.TaxType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdilang.g:2895:3: (this_PLUS_5= RULE_PLUS ( (lv_taxAccountDetail_6_0= ruleTaxAccountDetail ) )? (this_PLUS_7= RULE_PLUS ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )? (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )? )? )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_PLUS) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalEdilang.g:2896:4: this_PLUS_5= RULE_PLUS ( (lv_taxAccountDetail_6_0= ruleTaxAccountDetail ) )? (this_PLUS_7= RULE_PLUS ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )? (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )? )?
                    {
                    this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_10); 

                    				newLeafNode(this_PLUS_5, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_5_0());
                    			
                    // InternalEdilang.g:2900:4: ( (lv_taxAccountDetail_6_0= ruleTaxAccountDetail ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_ID) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalEdilang.g:2901:5: (lv_taxAccountDetail_6_0= ruleTaxAccountDetail )
                            {
                            // InternalEdilang.g:2901:5: (lv_taxAccountDetail_6_0= ruleTaxAccountDetail )
                            // InternalEdilang.g:2902:6: lv_taxAccountDetail_6_0= ruleTaxAccountDetail
                            {

                            						newCompositeNode(grammarAccess.getTAXSegmentAccess().getTaxAccountDetailTaxAccountDetailParserRuleCall_5_1_0());
                            					
                            pushFollow(FOLLOW_11);
                            lv_taxAccountDetail_6_0=ruleTaxAccountDetail();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTAXSegmentRule());
                            						}
                            						set(
                            							current,
                            							"taxAccountDetail",
                            							lv_taxAccountDetail_6_0,
                            							"io.thlaegler.edifact.Edilang.TaxAccountDetail");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalEdilang.g:2919:4: (this_PLUS_7= RULE_PLUS ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )? (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )? )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_PLUS) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalEdilang.g:2920:5: this_PLUS_7= RULE_PLUS ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )? (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )?
                            {
                            this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_10); 

                            					newLeafNode(this_PLUS_7, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_5_2_0());
                            				
                            // InternalEdilang.g:2924:5: ( (lv_taxAssessmentBasicValue_8_0= RULE_ID ) )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==RULE_ID) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // InternalEdilang.g:2925:6: (lv_taxAssessmentBasicValue_8_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:2925:6: (lv_taxAssessmentBasicValue_8_0= RULE_ID )
                                    // InternalEdilang.g:2926:7: lv_taxAssessmentBasicValue_8_0= RULE_ID
                                    {
                                    lv_taxAssessmentBasicValue_8_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                                    							newLeafNode(lv_taxAssessmentBasicValue_8_0, grammarAccess.getTAXSegmentAccess().getTaxAssessmentBasicValueIDTerminalRuleCall_5_2_1_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTAXSegmentRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"taxAssessmentBasicValue",
                                    								lv_taxAssessmentBasicValue_8_0,
                                    								"io.thlaegler.edifact.Edilang.ID");
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalEdilang.g:2942:5: (this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )? )?
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==RULE_PLUS) ) {
                                alt79=1;
                            }
                            switch (alt79) {
                                case 1 :
                                    // InternalEdilang.g:2943:6: this_PLUS_9= RULE_PLUS ( (lv_taxDetail_10_0= ruleTaxDetail ) )? (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )?
                                    {
                                    this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_14); 

                                    						newLeafNode(this_PLUS_9, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_5_2_2_0());
                                    					
                                    // InternalEdilang.g:2947:6: ( (lv_taxDetail_10_0= ruleTaxDetail ) )?
                                    int alt72=2;
                                    int LA72_0 = input.LA(1);

                                    if ( (LA72_0==RULE_COLON||LA72_0==RULE_ID) ) {
                                        alt72=1;
                                    }
                                    switch (alt72) {
                                        case 1 :
                                            // InternalEdilang.g:2948:7: (lv_taxDetail_10_0= ruleTaxDetail )
                                            {
                                            // InternalEdilang.g:2948:7: (lv_taxDetail_10_0= ruleTaxDetail )
                                            // InternalEdilang.g:2949:8: lv_taxDetail_10_0= ruleTaxDetail
                                            {

                                            								newCompositeNode(grammarAccess.getTAXSegmentAccess().getTaxDetailTaxDetailParserRuleCall_5_2_2_1_0());
                                            							
                                            pushFollow(FOLLOW_11);
                                            lv_taxDetail_10_0=ruleTaxDetail();

                                            state._fsp--;


                                            								if (current==null) {
                                            									current = createModelElementForParent(grammarAccess.getTAXSegmentRule());
                                            								}
                                            								set(
                                            									current,
                                            									"taxDetail",
                                            									lv_taxDetail_10_0,
                                            									"io.thlaegler.edifact.Edilang.TaxDetail");
                                            								afterParserOrEnumRuleCall();
                                            							

                                            }


                                            }
                                            break;

                                    }

                                    // InternalEdilang.g:2966:6: (this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )? )?
                                    int alt78=2;
                                    int LA78_0 = input.LA(1);

                                    if ( (LA78_0==RULE_PLUS) ) {
                                        alt78=1;
                                    }
                                    switch (alt78) {
                                        case 1 :
                                            // InternalEdilang.g:2967:7: this_PLUS_11= RULE_PLUS ( (lv_taxCategoryCode_12_0= RULE_ID ) )? (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )?
                                            {
                                            this_PLUS_11=(Token)match(input,RULE_PLUS,FOLLOW_10); 

                                            							newLeafNode(this_PLUS_11, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_5_2_2_2_0());
                                            						
                                            // InternalEdilang.g:2971:7: ( (lv_taxCategoryCode_12_0= RULE_ID ) )?
                                            int alt73=2;
                                            int LA73_0 = input.LA(1);

                                            if ( (LA73_0==RULE_ID) ) {
                                                alt73=1;
                                            }
                                            switch (alt73) {
                                                case 1 :
                                                    // InternalEdilang.g:2972:8: (lv_taxCategoryCode_12_0= RULE_ID )
                                                    {
                                                    // InternalEdilang.g:2972:8: (lv_taxCategoryCode_12_0= RULE_ID )
                                                    // InternalEdilang.g:2973:9: lv_taxCategoryCode_12_0= RULE_ID
                                                    {
                                                    lv_taxCategoryCode_12_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                                                    									newLeafNode(lv_taxCategoryCode_12_0, grammarAccess.getTAXSegmentAccess().getTaxCategoryCodeIDTerminalRuleCall_5_2_2_2_1_0());
                                                    								

                                                    									if (current==null) {
                                                    										current = createModelElement(grammarAccess.getTAXSegmentRule());
                                                    									}
                                                    									setWithLastConsumed(
                                                    										current,
                                                    										"taxCategoryCode",
                                                    										lv_taxCategoryCode_12_0,
                                                    										"io.thlaegler.edifact.Edilang.ID");
                                                    								

                                                    }


                                                    }
                                                    break;

                                            }

                                            // InternalEdilang.g:2989:7: (this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )? )?
                                            int alt77=2;
                                            int LA77_0 = input.LA(1);

                                            if ( (LA77_0==RULE_PLUS) ) {
                                                alt77=1;
                                            }
                                            switch (alt77) {
                                                case 1 :
                                                    // InternalEdilang.g:2990:8: this_PLUS_13= RULE_PLUS ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )? (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )?
                                                    {
                                                    this_PLUS_13=(Token)match(input,RULE_PLUS,FOLLOW_10); 

                                                    								newLeafNode(this_PLUS_13, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_5_2_2_2_2_0());
                                                    							
                                                    // InternalEdilang.g:2994:8: ( (lv_partyTaxIdentifier_14_0= RULE_ID ) )?
                                                    int alt74=2;
                                                    int LA74_0 = input.LA(1);

                                                    if ( (LA74_0==RULE_ID) ) {
                                                        alt74=1;
                                                    }
                                                    switch (alt74) {
                                                        case 1 :
                                                            // InternalEdilang.g:2995:9: (lv_partyTaxIdentifier_14_0= RULE_ID )
                                                            {
                                                            // InternalEdilang.g:2995:9: (lv_partyTaxIdentifier_14_0= RULE_ID )
                                                            // InternalEdilang.g:2996:10: lv_partyTaxIdentifier_14_0= RULE_ID
                                                            {
                                                            lv_partyTaxIdentifier_14_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                                                            										newLeafNode(lv_partyTaxIdentifier_14_0, grammarAccess.getTAXSegmentAccess().getPartyTaxIdentifierIDTerminalRuleCall_5_2_2_2_2_1_0());
                                                            									

                                                            										if (current==null) {
                                                            											current = createModelElement(grammarAccess.getTAXSegmentRule());
                                                            										}
                                                            										setWithLastConsumed(
                                                            											current,
                                                            											"partyTaxIdentifier",
                                                            											lv_partyTaxIdentifier_14_0,
                                                            											"io.thlaegler.edifact.Edilang.ID");
                                                            									

                                                            }


                                                            }
                                                            break;

                                                    }

                                                    // InternalEdilang.g:3012:8: (this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )? )?
                                                    int alt76=2;
                                                    int LA76_0 = input.LA(1);

                                                    if ( (LA76_0==RULE_PLUS) ) {
                                                        alt76=1;
                                                    }
                                                    switch (alt76) {
                                                        case 1 :
                                                            // InternalEdilang.g:3013:9: this_PLUS_15= RULE_PLUS ( (lv_calculationSequenceCode_16_0= RULE_ID ) )?
                                                            {
                                                            this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_12); 

                                                            									newLeafNode(this_PLUS_15, grammarAccess.getTAXSegmentAccess().getPLUSTerminalRuleCall_5_2_2_2_2_2_0());
                                                            								
                                                            // InternalEdilang.g:3017:9: ( (lv_calculationSequenceCode_16_0= RULE_ID ) )?
                                                            int alt75=2;
                                                            int LA75_0 = input.LA(1);

                                                            if ( (LA75_0==RULE_ID) ) {
                                                                alt75=1;
                                                            }
                                                            switch (alt75) {
                                                                case 1 :
                                                                    // InternalEdilang.g:3018:10: (lv_calculationSequenceCode_16_0= RULE_ID )
                                                                    {
                                                                    // InternalEdilang.g:3018:10: (lv_calculationSequenceCode_16_0= RULE_ID )
                                                                    // InternalEdilang.g:3019:11: lv_calculationSequenceCode_16_0= RULE_ID
                                                                    {
                                                                    lv_calculationSequenceCode_16_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                                                                    											newLeafNode(lv_calculationSequenceCode_16_0, grammarAccess.getTAXSegmentAccess().getCalculationSequenceCodeIDTerminalRuleCall_5_2_2_2_2_2_1_0());
                                                                    										

                                                                    											if (current==null) {
                                                                    												current = createModelElement(grammarAccess.getTAXSegmentRule());
                                                                    											}
                                                                    											setWithLastConsumed(
                                                                    												current,
                                                                    												"calculationSequenceCode",
                                                                    												lv_calculationSequenceCode_16_0,
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


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdilang.g:3041:3: ( (lv_lineEnd_17_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3042:4: (lv_lineEnd_17_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3042:4: (lv_lineEnd_17_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3043:5: lv_lineEnd_17_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:3063:1: entryRuleRFFSegment returns [EObject current=null] : iv_ruleRFFSegment= ruleRFFSegment EOF ;
    public final EObject entryRuleRFFSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRFFSegment = null;


        try {
            // InternalEdilang.g:3063:51: (iv_ruleRFFSegment= ruleRFFSegment EOF )
            // InternalEdilang.g:3064:2: iv_ruleRFFSegment= ruleRFFSegment EOF
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
    // InternalEdilang.g:3070:1: ruleRFFSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:3076:2: ( ( ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3077:2: ( ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3077:2: ( ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3078:3: ( (lv_segment_0_0= 'RFF' ) ) this_PLUS_1= RULE_PLUS ( (lv_rff1_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3078:3: ( (lv_segment_0_0= 'RFF' ) )
            // InternalEdilang.g:3079:4: (lv_segment_0_0= 'RFF' )
            {
            // InternalEdilang.g:3079:4: (lv_segment_0_0= 'RFF' )
            // InternalEdilang.g:3080:5: lv_segment_0_0= 'RFF'
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
            		
            // InternalEdilang.g:3096:3: ( (lv_rff1_2_0= RULE_ID ) )
            // InternalEdilang.g:3097:4: (lv_rff1_2_0= RULE_ID )
            {
            // InternalEdilang.g:3097:4: (lv_rff1_2_0= RULE_ID )
            // InternalEdilang.g:3098:5: lv_rff1_2_0= RULE_ID
            {
            lv_rff1_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalEdilang.g:3114:3: (this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_COLON) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalEdilang.g:3115:4: this_COLON_3= RULE_COLON ( (lv_rff2_4_0= RULE_ID ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getRFFSegmentAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:3119:4: ( (lv_rff2_4_0= RULE_ID ) )
                    // InternalEdilang.g:3120:5: (lv_rff2_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:3120:5: (lv_rff2_4_0= RULE_ID )
                    // InternalEdilang.g:3121:6: lv_rff2_4_0= RULE_ID
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

            // InternalEdilang.g:3138:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3139:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3139:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3140:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:3160:1: entryRuleNADSegment returns [EObject current=null] : iv_ruleNADSegment= ruleNADSegment EOF ;
    public final EObject entryRuleNADSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNADSegment = null;


        try {
            // InternalEdilang.g:3160:51: (iv_ruleNADSegment= ruleNADSegment EOF )
            // InternalEdilang.g:3161:2: iv_ruleNADSegment= ruleNADSegment EOF
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
    // InternalEdilang.g:3167:1: ruleNADSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_partyFunctionCodeQualifier_2_0= RULE_ID ) ) (this_PLUS_3= RULE_PLUS ( (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) ) (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleNADSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_partyFunctionCodeQualifier_2_0=null;
        Token this_PLUS_3=null;
        Token this_PLUS_5=null;
        Token this_PLUS_7=null;
        Token this_PLUS_9=null;
        Token this_PLUS_11=null;
        Token lv_cityName_12_0=null;
        Token this_PLUS_13=null;
        Token this_PLUS_15=null;
        Token lv_postalIdentificationCode_16_0=null;
        Token this_PLUS_17=null;
        Token lv_countryNameCode_18_0=null;
        Token lv_lineEnd_19_0=null;
        EObject lv_partyIdentificationDetails_4_0 = null;

        EObject lv_nameAndAddress_6_0 = null;

        EObject lv_partyName_8_0 = null;

        EObject lv_street_10_0 = null;

        EObject lv_countrySubEntityDetails_14_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:3173:2: ( ( ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_partyFunctionCodeQualifier_2_0= RULE_ID ) ) (this_PLUS_3= RULE_PLUS ( (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) ) (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3174:2: ( ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_partyFunctionCodeQualifier_2_0= RULE_ID ) ) (this_PLUS_3= RULE_PLUS ( (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) ) (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3174:2: ( ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_partyFunctionCodeQualifier_2_0= RULE_ID ) ) (this_PLUS_3= RULE_PLUS ( (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) ) (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3175:3: ( (lv_segment_0_0= 'NAD' ) ) this_PLUS_1= RULE_PLUS ( (lv_partyFunctionCodeQualifier_2_0= RULE_ID ) ) (this_PLUS_3= RULE_PLUS ( (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) ) (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )? )? )? ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3175:3: ( (lv_segment_0_0= 'NAD' ) )
            // InternalEdilang.g:3176:4: (lv_segment_0_0= 'NAD' )
            {
            // InternalEdilang.g:3176:4: (lv_segment_0_0= 'NAD' )
            // InternalEdilang.g:3177:5: lv_segment_0_0= 'NAD'
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
            		
            // InternalEdilang.g:3193:3: ( (lv_partyFunctionCodeQualifier_2_0= RULE_ID ) )
            // InternalEdilang.g:3194:4: (lv_partyFunctionCodeQualifier_2_0= RULE_ID )
            {
            // InternalEdilang.g:3194:4: (lv_partyFunctionCodeQualifier_2_0= RULE_ID )
            // InternalEdilang.g:3195:5: lv_partyFunctionCodeQualifier_2_0= RULE_ID
            {
            lv_partyFunctionCodeQualifier_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_partyFunctionCodeQualifier_2_0, grammarAccess.getNADSegmentAccess().getPartyFunctionCodeQualifierIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNADSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"partyFunctionCodeQualifier",
            						lv_partyFunctionCodeQualifier_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:3211:3: (this_PLUS_3= RULE_PLUS ( (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) ) (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )? )? )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_PLUS) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalEdilang.g:3212:4: this_PLUS_3= RULE_PLUS ( (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail ) ) (this_PLUS_5= RULE_PLUS ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) ) (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )? )?
                    {
                    this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_3, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:3216:4: ( (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail ) )
                    // InternalEdilang.g:3217:5: (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail )
                    {
                    // InternalEdilang.g:3217:5: (lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail )
                    // InternalEdilang.g:3218:6: lv_partyIdentificationDetails_4_0= rulePartyIdentificationDetail
                    {

                    						newCompositeNode(grammarAccess.getNADSegmentAccess().getPartyIdentificationDetailsPartyIdentificationDetailParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_partyIdentificationDetails_4_0=rulePartyIdentificationDetail();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNADSegmentRule());
                    						}
                    						set(
                    							current,
                    							"partyIdentificationDetails",
                    							lv_partyIdentificationDetails_4_0,
                    							"io.thlaegler.edifact.Edilang.PartyIdentificationDetail");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEdilang.g:3235:4: (this_PLUS_5= RULE_PLUS ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) ) (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )? )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_PLUS) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalEdilang.g:3236:5: this_PLUS_5= RULE_PLUS ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) ) (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )?
                            {
                            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                            					newLeafNode(this_PLUS_5, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_3_2_0());
                            				
                            // InternalEdilang.g:3240:5: ( (lv_nameAndAddress_6_0= ruleNameAndAddress ) )
                            // InternalEdilang.g:3241:6: (lv_nameAndAddress_6_0= ruleNameAndAddress )
                            {
                            // InternalEdilang.g:3241:6: (lv_nameAndAddress_6_0= ruleNameAndAddress )
                            // InternalEdilang.g:3242:7: lv_nameAndAddress_6_0= ruleNameAndAddress
                            {

                            							newCompositeNode(grammarAccess.getNADSegmentAccess().getNameAndAddressNameAndAddressParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_nameAndAddress_6_0=ruleNameAndAddress();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNADSegmentRule());
                            							}
                            							set(
                            								current,
                            								"nameAndAddress",
                            								lv_nameAndAddress_6_0,
                            								"io.thlaegler.edifact.Edilang.NameAndAddress");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalEdilang.g:3259:5: (this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )? )?
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==RULE_PLUS) ) {
                                alt88=1;
                            }
                            switch (alt88) {
                                case 1 :
                                    // InternalEdilang.g:3260:6: this_PLUS_7= RULE_PLUS ( (lv_partyName_8_0= rulePartyName ) ) (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )?
                                    {
                                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                    						newLeafNode(this_PLUS_7, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_3_2_2_0());
                                    					
                                    // InternalEdilang.g:3264:6: ( (lv_partyName_8_0= rulePartyName ) )
                                    // InternalEdilang.g:3265:7: (lv_partyName_8_0= rulePartyName )
                                    {
                                    // InternalEdilang.g:3265:7: (lv_partyName_8_0= rulePartyName )
                                    // InternalEdilang.g:3266:8: lv_partyName_8_0= rulePartyName
                                    {

                                    								newCompositeNode(grammarAccess.getNADSegmentAccess().getPartyNamePartyNameParserRuleCall_3_2_2_1_0());
                                    							
                                    pushFollow(FOLLOW_11);
                                    lv_partyName_8_0=rulePartyName();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNADSegmentRule());
                                    								}
                                    								set(
                                    									current,
                                    									"partyName",
                                    									lv_partyName_8_0,
                                    									"io.thlaegler.edifact.Edilang.PartyName");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalEdilang.g:3283:6: (this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )? )?
                                    int alt87=2;
                                    int LA87_0 = input.LA(1);

                                    if ( (LA87_0==RULE_PLUS) ) {
                                        alt87=1;
                                    }
                                    switch (alt87) {
                                        case 1 :
                                            // InternalEdilang.g:3284:7: this_PLUS_9= RULE_PLUS ( (lv_street_10_0= ruleStreet ) ) (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )?
                                            {
                                            this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                            							newLeafNode(this_PLUS_9, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_3_2_2_2_0());
                                            						
                                            // InternalEdilang.g:3288:7: ( (lv_street_10_0= ruleStreet ) )
                                            // InternalEdilang.g:3289:8: (lv_street_10_0= ruleStreet )
                                            {
                                            // InternalEdilang.g:3289:8: (lv_street_10_0= ruleStreet )
                                            // InternalEdilang.g:3290:9: lv_street_10_0= ruleStreet
                                            {

                                            									newCompositeNode(grammarAccess.getNADSegmentAccess().getStreetStreetParserRuleCall_3_2_2_2_1_0());
                                            								
                                            pushFollow(FOLLOW_11);
                                            lv_street_10_0=ruleStreet();

                                            state._fsp--;


                                            									if (current==null) {
                                            										current = createModelElementForParent(grammarAccess.getNADSegmentRule());
                                            									}
                                            									set(
                                            										current,
                                            										"street",
                                            										lv_street_10_0,
                                            										"io.thlaegler.edifact.Edilang.Street");
                                            									afterParserOrEnumRuleCall();
                                            								

                                            }


                                            }

                                            // InternalEdilang.g:3307:7: (this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )? )?
                                            int alt86=2;
                                            int LA86_0 = input.LA(1);

                                            if ( (LA86_0==RULE_PLUS) ) {
                                                alt86=1;
                                            }
                                            switch (alt86) {
                                                case 1 :
                                                    // InternalEdilang.g:3308:8: this_PLUS_11= RULE_PLUS ( (lv_cityName_12_0= RULE_ID ) ) (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )?
                                                    {
                                                    this_PLUS_11=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                                    								newLeafNode(this_PLUS_11, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_3_2_2_2_2_0());
                                                    							
                                                    // InternalEdilang.g:3312:8: ( (lv_cityName_12_0= RULE_ID ) )
                                                    // InternalEdilang.g:3313:9: (lv_cityName_12_0= RULE_ID )
                                                    {
                                                    // InternalEdilang.g:3313:9: (lv_cityName_12_0= RULE_ID )
                                                    // InternalEdilang.g:3314:10: lv_cityName_12_0= RULE_ID
                                                    {
                                                    lv_cityName_12_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                                                    										newLeafNode(lv_cityName_12_0, grammarAccess.getNADSegmentAccess().getCityNameIDTerminalRuleCall_3_2_2_2_2_1_0());
                                                    									

                                                    										if (current==null) {
                                                    											current = createModelElement(grammarAccess.getNADSegmentRule());
                                                    										}
                                                    										setWithLastConsumed(
                                                    											current,
                                                    											"cityName",
                                                    											lv_cityName_12_0,
                                                    											"io.thlaegler.edifact.Edilang.ID");
                                                    									

                                                    }


                                                    }

                                                    // InternalEdilang.g:3330:8: (this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )? )?
                                                    int alt85=2;
                                                    int LA85_0 = input.LA(1);

                                                    if ( (LA85_0==RULE_PLUS) ) {
                                                        alt85=1;
                                                    }
                                                    switch (alt85) {
                                                        case 1 :
                                                            // InternalEdilang.g:3331:9: this_PLUS_13= RULE_PLUS ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) ) (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )?
                                                            {
                                                            this_PLUS_13=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                                            									newLeafNode(this_PLUS_13, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_3_2_2_2_2_2_0());
                                                            								
                                                            // InternalEdilang.g:3335:9: ( (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail ) )
                                                            // InternalEdilang.g:3336:10: (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail )
                                                            {
                                                            // InternalEdilang.g:3336:10: (lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail )
                                                            // InternalEdilang.g:3337:11: lv_countrySubEntityDetails_14_0= ruleCountrySubEntityDetail
                                                            {

                                                            											newCompositeNode(grammarAccess.getNADSegmentAccess().getCountrySubEntityDetailsCountrySubEntityDetailParserRuleCall_3_2_2_2_2_2_1_0());
                                                            										
                                                            pushFollow(FOLLOW_11);
                                                            lv_countrySubEntityDetails_14_0=ruleCountrySubEntityDetail();

                                                            state._fsp--;


                                                            											if (current==null) {
                                                            												current = createModelElementForParent(grammarAccess.getNADSegmentRule());
                                                            											}
                                                            											set(
                                                            												current,
                                                            												"countrySubEntityDetails",
                                                            												lv_countrySubEntityDetails_14_0,
                                                            												"io.thlaegler.edifact.Edilang.CountrySubEntityDetail");
                                                            											afterParserOrEnumRuleCall();
                                                            										

                                                            }


                                                            }

                                                            // InternalEdilang.g:3354:9: (this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )? )?
                                                            int alt84=2;
                                                            int LA84_0 = input.LA(1);

                                                            if ( (LA84_0==RULE_PLUS) ) {
                                                                alt84=1;
                                                            }
                                                            switch (alt84) {
                                                                case 1 :
                                                                    // InternalEdilang.g:3355:10: this_PLUS_15= RULE_PLUS ( (lv_postalIdentificationCode_16_0= RULE_ID ) ) (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )?
                                                                    {
                                                                    this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                                                    										newLeafNode(this_PLUS_15, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_3_2_2_2_2_2_2_0());
                                                                    									
                                                                    // InternalEdilang.g:3359:10: ( (lv_postalIdentificationCode_16_0= RULE_ID ) )
                                                                    // InternalEdilang.g:3360:11: (lv_postalIdentificationCode_16_0= RULE_ID )
                                                                    {
                                                                    // InternalEdilang.g:3360:11: (lv_postalIdentificationCode_16_0= RULE_ID )
                                                                    // InternalEdilang.g:3361:12: lv_postalIdentificationCode_16_0= RULE_ID
                                                                    {
                                                                    lv_postalIdentificationCode_16_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                                                                    												newLeafNode(lv_postalIdentificationCode_16_0, grammarAccess.getNADSegmentAccess().getPostalIdentificationCodeIDTerminalRuleCall_3_2_2_2_2_2_2_1_0());
                                                                    											

                                                                    												if (current==null) {
                                                                    													current = createModelElement(grammarAccess.getNADSegmentRule());
                                                                    												}
                                                                    												setWithLastConsumed(
                                                                    													current,
                                                                    													"postalIdentificationCode",
                                                                    													lv_postalIdentificationCode_16_0,
                                                                    													"io.thlaegler.edifact.Edilang.ID");
                                                                    											

                                                                    }


                                                                    }

                                                                    // InternalEdilang.g:3377:10: (this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) ) )?
                                                                    int alt83=2;
                                                                    int LA83_0 = input.LA(1);

                                                                    if ( (LA83_0==RULE_PLUS) ) {
                                                                        alt83=1;
                                                                    }
                                                                    switch (alt83) {
                                                                        case 1 :
                                                                            // InternalEdilang.g:3378:11: this_PLUS_17= RULE_PLUS ( (lv_countryNameCode_18_0= RULE_ID ) )
                                                                            {
                                                                            this_PLUS_17=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                                                                            											newLeafNode(this_PLUS_17, grammarAccess.getNADSegmentAccess().getPLUSTerminalRuleCall_3_2_2_2_2_2_2_2_0());
                                                                            										
                                                                            // InternalEdilang.g:3382:11: ( (lv_countryNameCode_18_0= RULE_ID ) )
                                                                            // InternalEdilang.g:3383:12: (lv_countryNameCode_18_0= RULE_ID )
                                                                            {
                                                                            // InternalEdilang.g:3383:12: (lv_countryNameCode_18_0= RULE_ID )
                                                                            // InternalEdilang.g:3384:13: lv_countryNameCode_18_0= RULE_ID
                                                                            {
                                                                            lv_countryNameCode_18_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                                                                            													newLeafNode(lv_countryNameCode_18_0, grammarAccess.getNADSegmentAccess().getCountryNameCodeIDTerminalRuleCall_3_2_2_2_2_2_2_2_1_0());
                                                                            												

                                                                            													if (current==null) {
                                                                            														current = createModelElement(grammarAccess.getNADSegmentRule());
                                                                            													}
                                                                            													setWithLastConsumed(
                                                                            														current,
                                                                            														"countryNameCode",
                                                                            														lv_countryNameCode_18_0,
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


                    }
                    break;

            }

            // InternalEdilang.g:3408:3: ( (lv_lineEnd_19_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3409:4: (lv_lineEnd_19_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3409:4: (lv_lineEnd_19_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3410:5: lv_lineEnd_19_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_19_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_19_0, grammarAccess.getNADSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNADSegmentRule());
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
    // $ANTLR end "ruleNADSegment"


    // $ANTLR start "entryRuleDTMSegment"
    // InternalEdilang.g:3430:1: entryRuleDTMSegment returns [EObject current=null] : iv_ruleDTMSegment= ruleDTMSegment EOF ;
    public final EObject entryRuleDTMSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTMSegment = null;


        try {
            // InternalEdilang.g:3430:51: (iv_ruleDTMSegment= ruleDTMSegment EOF )
            // InternalEdilang.g:3431:2: iv_ruleDTMSegment= ruleDTMSegment EOF
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
    // InternalEdilang.g:3437:1: ruleDTMSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'DTM' ) ) (this_PLUS_1= RULE_PLUS ( (lv_dateTimePeriods_2_0= ruleDateTimePeriod ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleDTMSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_lineEnd_3_0=null;
        EObject lv_dateTimePeriods_2_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:3443:2: ( ( ( (lv_segment_0_0= 'DTM' ) ) (this_PLUS_1= RULE_PLUS ( (lv_dateTimePeriods_2_0= ruleDateTimePeriod ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3444:2: ( ( (lv_segment_0_0= 'DTM' ) ) (this_PLUS_1= RULE_PLUS ( (lv_dateTimePeriods_2_0= ruleDateTimePeriod ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3444:2: ( ( (lv_segment_0_0= 'DTM' ) ) (this_PLUS_1= RULE_PLUS ( (lv_dateTimePeriods_2_0= ruleDateTimePeriod ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3445:3: ( (lv_segment_0_0= 'DTM' ) ) (this_PLUS_1= RULE_PLUS ( (lv_dateTimePeriods_2_0= ruleDateTimePeriod ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3445:3: ( (lv_segment_0_0= 'DTM' ) )
            // InternalEdilang.g:3446:4: (lv_segment_0_0= 'DTM' )
            {
            // InternalEdilang.g:3446:4: (lv_segment_0_0= 'DTM' )
            // InternalEdilang.g:3447:5: lv_segment_0_0= 'DTM'
            {
            lv_segment_0_0=(Token)match(input,34,FOLLOW_11); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getDTMSegmentAccess().getSegmentDTMKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTMSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "DTM");
            				

            }


            }

            // InternalEdilang.g:3459:3: (this_PLUS_1= RULE_PLUS ( (lv_dateTimePeriods_2_0= ruleDateTimePeriod ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==RULE_PLUS) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalEdilang.g:3460:4: this_PLUS_1= RULE_PLUS ( (lv_dateTimePeriods_2_0= ruleDateTimePeriod ) )
            	    {
            	    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            	    				newLeafNode(this_PLUS_1, grammarAccess.getDTMSegmentAccess().getPLUSTerminalRuleCall_1_0());
            	    			
            	    // InternalEdilang.g:3464:4: ( (lv_dateTimePeriods_2_0= ruleDateTimePeriod ) )
            	    // InternalEdilang.g:3465:5: (lv_dateTimePeriods_2_0= ruleDateTimePeriod )
            	    {
            	    // InternalEdilang.g:3465:5: (lv_dateTimePeriods_2_0= ruleDateTimePeriod )
            	    // InternalEdilang.g:3466:6: lv_dateTimePeriods_2_0= ruleDateTimePeriod
            	    {

            	    						newCompositeNode(grammarAccess.getDTMSegmentAccess().getDateTimePeriodsDateTimePeriodParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_dateTimePeriods_2_0=ruleDateTimePeriod();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDTMSegmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dateTimePeriods",
            	    							lv_dateTimePeriods_2_0,
            	    							"io.thlaegler.edifact.Edilang.DateTimePeriod");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            // InternalEdilang.g:3484:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3485:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3485:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3486:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_3_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_3_0, grammarAccess.getDTMSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTMSegmentRule());
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
    // $ANTLR end "ruleDTMSegment"


    // $ANTLR start "entryRuleBGMSegment"
    // InternalEdilang.g:3506:1: entryRuleBGMSegment returns [EObject current=null] : iv_ruleBGMSegment= ruleBGMSegment EOF ;
    public final EObject entryRuleBGMSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBGMSegment = null;


        try {
            // InternalEdilang.g:3506:51: (iv_ruleBGMSegment= ruleBGMSegment EOF )
            // InternalEdilang.g:3507:2: iv_ruleBGMSegment= ruleBGMSegment EOF
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
    // InternalEdilang.g:3513:1: ruleBGMSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_documentMessageName_2_0= ruleDocumentMessage ) )? this_PLUS_3= RULE_PLUS ( (lv_documentMessageIdentification_4_0= ruleDocumentMessageIdentification ) )? this_PLUS_5= RULE_PLUS ( (lv_messageFunctionCode_6_0= RULE_ID ) )? (this_PLUS_7= RULE_PLUS ( (lv_responseTypeCode_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleBGMSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token this_PLUS_3=null;
        Token this_PLUS_5=null;
        Token lv_messageFunctionCode_6_0=null;
        Token this_PLUS_7=null;
        Token lv_responseTypeCode_8_0=null;
        Token lv_lineEnd_9_0=null;
        EObject lv_documentMessageName_2_0 = null;

        EObject lv_documentMessageIdentification_4_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:3519:2: ( ( ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_documentMessageName_2_0= ruleDocumentMessage ) )? this_PLUS_3= RULE_PLUS ( (lv_documentMessageIdentification_4_0= ruleDocumentMessageIdentification ) )? this_PLUS_5= RULE_PLUS ( (lv_messageFunctionCode_6_0= RULE_ID ) )? (this_PLUS_7= RULE_PLUS ( (lv_responseTypeCode_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3520:2: ( ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_documentMessageName_2_0= ruleDocumentMessage ) )? this_PLUS_3= RULE_PLUS ( (lv_documentMessageIdentification_4_0= ruleDocumentMessageIdentification ) )? this_PLUS_5= RULE_PLUS ( (lv_messageFunctionCode_6_0= RULE_ID ) )? (this_PLUS_7= RULE_PLUS ( (lv_responseTypeCode_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3520:2: ( ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_documentMessageName_2_0= ruleDocumentMessage ) )? this_PLUS_3= RULE_PLUS ( (lv_documentMessageIdentification_4_0= ruleDocumentMessageIdentification ) )? this_PLUS_5= RULE_PLUS ( (lv_messageFunctionCode_6_0= RULE_ID ) )? (this_PLUS_7= RULE_PLUS ( (lv_responseTypeCode_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3521:3: ( (lv_segment_0_0= 'BGM' ) ) this_PLUS_1= RULE_PLUS ( (lv_documentMessageName_2_0= ruleDocumentMessage ) )? this_PLUS_3= RULE_PLUS ( (lv_documentMessageIdentification_4_0= ruleDocumentMessageIdentification ) )? this_PLUS_5= RULE_PLUS ( (lv_messageFunctionCode_6_0= RULE_ID ) )? (this_PLUS_7= RULE_PLUS ( (lv_responseTypeCode_8_0= RULE_ID ) ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3521:3: ( (lv_segment_0_0= 'BGM' ) )
            // InternalEdilang.g:3522:4: (lv_segment_0_0= 'BGM' )
            {
            // InternalEdilang.g:3522:4: (lv_segment_0_0= 'BGM' )
            // InternalEdilang.g:3523:5: lv_segment_0_0= 'BGM'
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
            		
            // InternalEdilang.g:3539:3: ( (lv_documentMessageName_2_0= ruleDocumentMessage ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalEdilang.g:3540:4: (lv_documentMessageName_2_0= ruleDocumentMessage )
                    {
                    // InternalEdilang.g:3540:4: (lv_documentMessageName_2_0= ruleDocumentMessage )
                    // InternalEdilang.g:3541:5: lv_documentMessageName_2_0= ruleDocumentMessage
                    {

                    					newCompositeNode(grammarAccess.getBGMSegmentAccess().getDocumentMessageNameDocumentMessageParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_documentMessageName_2_0=ruleDocumentMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBGMSegmentRule());
                    					}
                    					set(
                    						current,
                    						"documentMessageName",
                    						lv_documentMessageName_2_0,
                    						"io.thlaegler.edifact.Edilang.DocumentMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_3=(Token)match(input,RULE_PLUS,FOLLOW_9); 

            			newLeafNode(this_PLUS_3, grammarAccess.getBGMSegmentAccess().getPLUSTerminalRuleCall_3());
            		
            // InternalEdilang.g:3562:3: ( (lv_documentMessageIdentification_4_0= ruleDocumentMessageIdentification ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalEdilang.g:3563:4: (lv_documentMessageIdentification_4_0= ruleDocumentMessageIdentification )
                    {
                    // InternalEdilang.g:3563:4: (lv_documentMessageIdentification_4_0= ruleDocumentMessageIdentification )
                    // InternalEdilang.g:3564:5: lv_documentMessageIdentification_4_0= ruleDocumentMessageIdentification
                    {

                    					newCompositeNode(grammarAccess.getBGMSegmentAccess().getDocumentMessageIdentificationDocumentMessageIdentificationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_documentMessageIdentification_4_0=ruleDocumentMessageIdentification();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBGMSegmentRule());
                    					}
                    					set(
                    						current,
                    						"documentMessageIdentification",
                    						lv_documentMessageIdentification_4_0,
                    						"io.thlaegler.edifact.Edilang.DocumentMessageIdentification");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_10); 

            			newLeafNode(this_PLUS_5, grammarAccess.getBGMSegmentAccess().getPLUSTerminalRuleCall_5());
            		
            // InternalEdilang.g:3585:3: ( (lv_messageFunctionCode_6_0= RULE_ID ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalEdilang.g:3586:4: (lv_messageFunctionCode_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:3586:4: (lv_messageFunctionCode_6_0= RULE_ID )
                    // InternalEdilang.g:3587:5: lv_messageFunctionCode_6_0= RULE_ID
                    {
                    lv_messageFunctionCode_6_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(lv_messageFunctionCode_6_0, grammarAccess.getBGMSegmentAccess().getMessageFunctionCodeIDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBGMSegmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"messageFunctionCode",
                    						lv_messageFunctionCode_6_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:3603:3: (this_PLUS_7= RULE_PLUS ( (lv_responseTypeCode_8_0= RULE_ID ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_PLUS) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalEdilang.g:3604:4: this_PLUS_7= RULE_PLUS ( (lv_responseTypeCode_8_0= RULE_ID ) )
                    {
                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_13); 

                    				newLeafNode(this_PLUS_7, grammarAccess.getBGMSegmentAccess().getPLUSTerminalRuleCall_7_0());
                    			
                    // InternalEdilang.g:3608:4: ( (lv_responseTypeCode_8_0= RULE_ID ) )
                    // InternalEdilang.g:3609:5: (lv_responseTypeCode_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:3609:5: (lv_responseTypeCode_8_0= RULE_ID )
                    // InternalEdilang.g:3610:6: lv_responseTypeCode_8_0= RULE_ID
                    {
                    lv_responseTypeCode_8_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_responseTypeCode_8_0, grammarAccess.getBGMSegmentAccess().getResponseTypeCodeIDTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBGMSegmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"responseTypeCode",
                    							lv_responseTypeCode_8_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEdilang.g:3627:3: ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3628:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3628:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3629:5: lv_lineEnd_9_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_9_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_9_0, grammarAccess.getBGMSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBGMSegmentRule());
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
    // $ANTLR end "ruleBGMSegment"


    // $ANTLR start "entryRulePATSegment"
    // InternalEdilang.g:3649:1: entryRulePATSegment returns [EObject current=null] : iv_rulePATSegment= rulePATSegment EOF ;
    public final EObject entryRulePATSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePATSegment = null;


        try {
            // InternalEdilang.g:3649:51: (iv_rulePATSegment= rulePATSegment EOF )
            // InternalEdilang.g:3650:2: iv_rulePATSegment= rulePATSegment EOF
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
    // InternalEdilang.g:3656:1: rulePATSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject rulePATSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_segmentCount_2_0=null;
        Token lv_lineEnd_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:3662:2: ( ( ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3663:2: ( ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3663:2: ( ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3664:3: ( (lv_segment_0_0= 'PAT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3664:3: ( (lv_segment_0_0= 'PAT' ) )
            // InternalEdilang.g:3665:4: (lv_segment_0_0= 'PAT' )
            {
            // InternalEdilang.g:3665:4: (lv_segment_0_0= 'PAT' )
            // InternalEdilang.g:3666:5: lv_segment_0_0= 'PAT'
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
            		
            // InternalEdilang.g:3682:3: ( (lv_segmentCount_2_0= RULE_ID ) )
            // InternalEdilang.g:3683:4: (lv_segmentCount_2_0= RULE_ID )
            {
            // InternalEdilang.g:3683:4: (lv_segmentCount_2_0= RULE_ID )
            // InternalEdilang.g:3684:5: lv_segmentCount_2_0= RULE_ID
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

            // InternalEdilang.g:3700:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3701:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3701:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3702:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:3722:1: entryRuleFTXSegment returns [EObject current=null] : iv_ruleFTXSegment= ruleFTXSegment EOF ;
    public final EObject entryRuleFTXSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTXSegment = null;


        try {
            // InternalEdilang.g:3722:51: (iv_ruleFTXSegment= ruleFTXSegment EOF )
            // InternalEdilang.g:3723:2: iv_ruleFTXSegment= ruleFTXSegment EOF
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
    // InternalEdilang.g:3729:1: ruleFTXSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:3735:2: ( ( ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3736:2: ( ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3736:2: ( ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3737:3: ( (lv_segment_0_0= 'FTX' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo1_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_todo2_4_0= RULE_ID ) )? this_PLUS_5= RULE_PLUS ( (lv_todo3_6_0= RULE_ID ) )? this_PLUS_7= RULE_PLUS ( (lv_todo4_8_0= RULE_ID ) )? ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3737:3: ( (lv_segment_0_0= 'FTX' ) )
            // InternalEdilang.g:3738:4: (lv_segment_0_0= 'FTX' )
            {
            // InternalEdilang.g:3738:4: (lv_segment_0_0= 'FTX' )
            // InternalEdilang.g:3739:5: lv_segment_0_0= 'FTX'
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
            		
            // InternalEdilang.g:3755:3: ( (lv_todo1_2_0= RULE_ID ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalEdilang.g:3756:4: (lv_todo1_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:3756:4: (lv_todo1_2_0= RULE_ID )
                    // InternalEdilang.g:3757:5: lv_todo1_2_0= RULE_ID
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
            		
            // InternalEdilang.g:3777:3: ( (lv_todo2_4_0= RULE_ID ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ID) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalEdilang.g:3778:4: (lv_todo2_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:3778:4: (lv_todo2_4_0= RULE_ID )
                    // InternalEdilang.g:3779:5: lv_todo2_4_0= RULE_ID
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
            		
            // InternalEdilang.g:3799:3: ( (lv_todo3_6_0= RULE_ID ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalEdilang.g:3800:4: (lv_todo3_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:3800:4: (lv_todo3_6_0= RULE_ID )
                    // InternalEdilang.g:3801:5: lv_todo3_6_0= RULE_ID
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
            		
            // InternalEdilang.g:3821:3: ( (lv_todo4_8_0= RULE_ID ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalEdilang.g:3822:4: (lv_todo4_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:3822:4: (lv_todo4_8_0= RULE_ID )
                    // InternalEdilang.g:3823:5: lv_todo4_8_0= RULE_ID
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

            // InternalEdilang.g:3839:3: ( (lv_lineEnd_9_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3840:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3840:4: (lv_lineEnd_9_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3841:5: lv_lineEnd_9_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:3861:1: entryRuleERCSegment returns [EObject current=null] : iv_ruleERCSegment= ruleERCSegment EOF ;
    public final EObject entryRuleERCSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERCSegment = null;


        try {
            // InternalEdilang.g:3861:51: (iv_ruleERCSegment= ruleERCSegment EOF )
            // InternalEdilang.g:3862:2: iv_ruleERCSegment= ruleERCSegment EOF
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
    // InternalEdilang.g:3868:1: ruleERCSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'ERC' ) ) (this_PLUS_1= RULE_PLUS ( (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleERCSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_lineEnd_3_0=null;
        EObject lv_applicationErrorDetails_2_0 = null;



        	enterRule();

        try {
            // InternalEdilang.g:3874:2: ( ( ( (lv_segment_0_0= 'ERC' ) ) (this_PLUS_1= RULE_PLUS ( (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3875:2: ( ( (lv_segment_0_0= 'ERC' ) ) (this_PLUS_1= RULE_PLUS ( (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3875:2: ( ( (lv_segment_0_0= 'ERC' ) ) (this_PLUS_1= RULE_PLUS ( (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3876:3: ( (lv_segment_0_0= 'ERC' ) ) (this_PLUS_1= RULE_PLUS ( (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail ) ) )* ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3876:3: ( (lv_segment_0_0= 'ERC' ) )
            // InternalEdilang.g:3877:4: (lv_segment_0_0= 'ERC' )
            {
            // InternalEdilang.g:3877:4: (lv_segment_0_0= 'ERC' )
            // InternalEdilang.g:3878:5: lv_segment_0_0= 'ERC'
            {
            lv_segment_0_0=(Token)match(input,38,FOLLOW_11); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getERCSegmentAccess().getSegmentERCKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERCSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "ERC");
            				

            }


            }

            // InternalEdilang.g:3890:3: (this_PLUS_1= RULE_PLUS ( (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==RULE_PLUS) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalEdilang.g:3891:4: this_PLUS_1= RULE_PLUS ( (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail ) )
            	    {
            	    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_13); 

            	    				newLeafNode(this_PLUS_1, grammarAccess.getERCSegmentAccess().getPLUSTerminalRuleCall_1_0());
            	    			
            	    // InternalEdilang.g:3895:4: ( (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail ) )
            	    // InternalEdilang.g:3896:5: (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail )
            	    {
            	    // InternalEdilang.g:3896:5: (lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail )
            	    // InternalEdilang.g:3897:6: lv_applicationErrorDetails_2_0= ruleApplicationErrorDetail
            	    {

            	    						newCompositeNode(grammarAccess.getERCSegmentAccess().getApplicationErrorDetailsApplicationErrorDetailParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_applicationErrorDetails_2_0=ruleApplicationErrorDetail();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getERCSegmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"applicationErrorDetails",
            	    							lv_applicationErrorDetails_2_0,
            	    							"io.thlaegler.edifact.Edilang.ApplicationErrorDetail");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // InternalEdilang.g:3915:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:3916:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:3916:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:3917:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
            {
            lv_lineEnd_3_0=(Token)match(input,RULE_QUOTE_AND_NL,FOLLOW_2); 

            					newLeafNode(lv_lineEnd_3_0, grammarAccess.getERCSegmentAccess().getLineEndQUOTE_AND_NLTerminalRuleCall_2_0());
            				

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
    // InternalEdilang.g:3937:1: entryRuleCNTSegment returns [EObject current=null] : iv_ruleCNTSegment= ruleCNTSegment EOF ;
    public final EObject entryRuleCNTSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCNTSegment = null;


        try {
            // InternalEdilang.g:3937:51: (iv_ruleCNTSegment= ruleCNTSegment EOF )
            // InternalEdilang.g:3938:2: iv_ruleCNTSegment= ruleCNTSegment EOF
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
    // InternalEdilang.g:3944:1: ruleCNTSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:3950:2: ( ( ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:3951:2: ( ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:3951:2: ( ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:3952:3: ( (lv_segment_0_0= 'CNT' ) ) this_PLUS_1= RULE_PLUS ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:3952:3: ( (lv_segment_0_0= 'CNT' ) )
            // InternalEdilang.g:3953:4: (lv_segment_0_0= 'CNT' )
            {
            // InternalEdilang.g:3953:4: (lv_segment_0_0= 'CNT' )
            // InternalEdilang.g:3954:5: lv_segment_0_0= 'CNT'
            {
            lv_segment_0_0=(Token)match(input,39,FOLLOW_5); 

            					newLeafNode(lv_segment_0_0, grammarAccess.getCNTSegmentAccess().getSegmentCNTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCNTSegmentRule());
            					}
            					setWithLastConsumed(current, "segment", lv_segment_0_0, "CNT");
            				

            }


            }

            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_19); 

            			newLeafNode(this_PLUS_1, grammarAccess.getCNTSegmentAccess().getPLUSTerminalRuleCall_1());
            		
            // InternalEdilang.g:3970:3: ( ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )? )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_COLON||LA103_0==RULE_ID) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalEdilang.g:3971:4: ( (lv_todo1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_todo2_4_0= RULE_ID ) )?
                    {
                    // InternalEdilang.g:3971:4: ( (lv_todo1_2_0= RULE_ID ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==RULE_ID) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalEdilang.g:3972:5: (lv_todo1_2_0= RULE_ID )
                            {
                            // InternalEdilang.g:3972:5: (lv_todo1_2_0= RULE_ID )
                            // InternalEdilang.g:3973:6: lv_todo1_2_0= RULE_ID
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
                    			
                    // InternalEdilang.g:3993:4: ( (lv_todo2_4_0= RULE_ID ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==RULE_ID) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalEdilang.g:3994:5: (lv_todo2_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:3994:5: (lv_todo2_4_0= RULE_ID )
                            // InternalEdilang.g:3995:6: lv_todo2_4_0= RULE_ID
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

            // InternalEdilang.g:4012:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:4013:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:4013:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:4014:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:4034:1: entryRuleCTASegment returns [EObject current=null] : iv_ruleCTASegment= ruleCTASegment EOF ;
    public final EObject entryRuleCTASegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTASegment = null;


        try {
            // InternalEdilang.g:4034:51: (iv_ruleCTASegment= ruleCTASegment EOF )
            // InternalEdilang.g:4035:2: iv_ruleCTASegment= ruleCTASegment EOF
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
    // InternalEdilang.g:4041:1: ruleCTASegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleCTASegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_todo_2_0=null;
        Token lv_lineEnd_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4047:2: ( ( ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:4048:2: ( ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:4048:2: ( ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:4049:3: ( (lv_segment_0_0= 'CTA' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:4049:3: ( (lv_segment_0_0= 'CTA' ) )
            // InternalEdilang.g:4050:4: (lv_segment_0_0= 'CTA' )
            {
            // InternalEdilang.g:4050:4: (lv_segment_0_0= 'CTA' )
            // InternalEdilang.g:4051:5: lv_segment_0_0= 'CTA'
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
            		
            // InternalEdilang.g:4067:3: ( (lv_todo_2_0= RULE_ID ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_ID) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalEdilang.g:4068:4: (lv_todo_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4068:4: (lv_todo_2_0= RULE_ID )
                    // InternalEdilang.g:4069:5: lv_todo_2_0= RULE_ID
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

            // InternalEdilang.g:4085:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:4086:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:4086:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:4087:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:4107:1: entryRulePCISegment returns [EObject current=null] : iv_rulePCISegment= rulePCISegment EOF ;
    public final EObject entryRulePCISegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePCISegment = null;


        try {
            // InternalEdilang.g:4107:51: (iv_rulePCISegment= rulePCISegment EOF )
            // InternalEdilang.g:4108:2: iv_rulePCISegment= rulePCISegment EOF
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
    // InternalEdilang.g:4114:1: rulePCISegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject rulePCISegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_todo_2_0=null;
        Token lv_lineEnd_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4120:2: ( ( ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:4121:2: ( ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:4121:2: ( ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:4122:3: ( (lv_segment_0_0= 'PCI' ) ) this_PLUS_1= RULE_PLUS ( (lv_todo_2_0= RULE_ID ) )? ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:4122:3: ( (lv_segment_0_0= 'PCI' ) )
            // InternalEdilang.g:4123:4: (lv_segment_0_0= 'PCI' )
            {
            // InternalEdilang.g:4123:4: (lv_segment_0_0= 'PCI' )
            // InternalEdilang.g:4124:5: lv_segment_0_0= 'PCI'
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
            		
            // InternalEdilang.g:4140:3: ( (lv_todo_2_0= RULE_ID ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ID) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalEdilang.g:4141:4: (lv_todo_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4141:4: (lv_todo_2_0= RULE_ID )
                    // InternalEdilang.g:4142:5: lv_todo_2_0= RULE_ID
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

            // InternalEdilang.g:4158:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:4159:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:4159:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:4160:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:4180:1: entryRuleUNSSegment returns [EObject current=null] : iv_ruleUNSSegment= ruleUNSSegment EOF ;
    public final EObject entryRuleUNSSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNSSegment = null;


        try {
            // InternalEdilang.g:4180:51: (iv_ruleUNSSegment= ruleUNSSegment EOF )
            // InternalEdilang.g:4181:2: iv_ruleUNSSegment= ruleUNSSegment EOF
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
    // InternalEdilang.g:4187:1: ruleUNSSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) ;
    public final EObject ruleUNSSegment() throws RecognitionException {
        EObject current = null;

        Token lv_segment_0_0=null;
        Token this_PLUS_1=null;
        Token lv_segmentCount_2_0=null;
        Token lv_lineEnd_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4193:2: ( ( ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:4194:2: ( ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:4194:2: ( ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:4195:3: ( (lv_segment_0_0= 'UNS' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) ) ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:4195:3: ( (lv_segment_0_0= 'UNS' ) )
            // InternalEdilang.g:4196:4: (lv_segment_0_0= 'UNS' )
            {
            // InternalEdilang.g:4196:4: (lv_segment_0_0= 'UNS' )
            // InternalEdilang.g:4197:5: lv_segment_0_0= 'UNS'
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
            		
            // InternalEdilang.g:4213:3: ( (lv_segmentCount_2_0= RULE_ID ) )
            // InternalEdilang.g:4214:4: (lv_segmentCount_2_0= RULE_ID )
            {
            // InternalEdilang.g:4214:4: (lv_segmentCount_2_0= RULE_ID )
            // InternalEdilang.g:4215:5: lv_segmentCount_2_0= RULE_ID
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

            // InternalEdilang.g:4231:3: ( (lv_lineEnd_3_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:4232:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:4232:4: (lv_lineEnd_3_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:4233:5: lv_lineEnd_3_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:4253:1: entryRuleUNTSegment returns [EObject current=null] : iv_ruleUNTSegment= ruleUNTSegment EOF ;
    public final EObject entryRuleUNTSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNTSegment = null;


        try {
            // InternalEdilang.g:4253:51: (iv_ruleUNTSegment= ruleUNTSegment EOF )
            // InternalEdilang.g:4254:2: iv_ruleUNTSegment= ruleUNTSegment EOF
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
    // InternalEdilang.g:4260:1: ruleUNTSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:4266:2: ( ( ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:4267:2: ( ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:4267:2: ( ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:4268:3: ( (lv_segment_0_0= 'UNT' ) ) this_PLUS_1= RULE_PLUS ( (lv_segmentCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_messageReferenceNumber_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:4268:3: ( (lv_segment_0_0= 'UNT' ) )
            // InternalEdilang.g:4269:4: (lv_segment_0_0= 'UNT' )
            {
            // InternalEdilang.g:4269:4: (lv_segment_0_0= 'UNT' )
            // InternalEdilang.g:4270:5: lv_segment_0_0= 'UNT'
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
            		
            // InternalEdilang.g:4286:3: ( (lv_segmentCount_2_0= RULE_ID ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalEdilang.g:4287:4: (lv_segmentCount_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4287:4: (lv_segmentCount_2_0= RULE_ID )
                    // InternalEdilang.g:4288:5: lv_segmentCount_2_0= RULE_ID
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
            		
            // InternalEdilang.g:4308:3: ( (lv_messageReferenceNumber_4_0= RULE_ID ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_ID) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalEdilang.g:4309:4: (lv_messageReferenceNumber_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4309:4: (lv_messageReferenceNumber_4_0= RULE_ID )
                    // InternalEdilang.g:4310:5: lv_messageReferenceNumber_4_0= RULE_ID
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

            // InternalEdilang.g:4326:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:4327:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:4327:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:4328:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
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
    // InternalEdilang.g:4348:1: entryRuleUNZSegment returns [EObject current=null] : iv_ruleUNZSegment= ruleUNZSegment EOF ;
    public final EObject entryRuleUNZSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNZSegment = null;


        try {
            // InternalEdilang.g:4348:51: (iv_ruleUNZSegment= ruleUNZSegment EOF )
            // InternalEdilang.g:4349:2: iv_ruleUNZSegment= ruleUNZSegment EOF
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
    // InternalEdilang.g:4355:1: ruleUNZSegment returns [EObject current=null] : ( ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) ;
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
            // InternalEdilang.g:4361:2: ( ( ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) ) )
            // InternalEdilang.g:4362:2: ( ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            {
            // InternalEdilang.g:4362:2: ( ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) ) )
            // InternalEdilang.g:4363:3: ( (lv_segment_0_0= 'UNZ' ) ) this_PLUS_1= RULE_PLUS ( (lv_interchangeControlCount_2_0= RULE_ID ) )? this_PLUS_3= RULE_PLUS ( (lv_interchangeControlRef_4_0= RULE_ID ) )? ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            {
            // InternalEdilang.g:4363:3: ( (lv_segment_0_0= 'UNZ' ) )
            // InternalEdilang.g:4364:4: (lv_segment_0_0= 'UNZ' )
            {
            // InternalEdilang.g:4364:4: (lv_segment_0_0= 'UNZ' )
            // InternalEdilang.g:4365:5: lv_segment_0_0= 'UNZ'
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
            		
            // InternalEdilang.g:4381:3: ( (lv_interchangeControlCount_2_0= RULE_ID ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_ID) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalEdilang.g:4382:4: (lv_interchangeControlCount_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4382:4: (lv_interchangeControlCount_2_0= RULE_ID )
                    // InternalEdilang.g:4383:5: lv_interchangeControlCount_2_0= RULE_ID
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
            		
            // InternalEdilang.g:4403:3: ( (lv_interchangeControlRef_4_0= RULE_ID ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_ID) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalEdilang.g:4404:4: (lv_interchangeControlRef_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4404:4: (lv_interchangeControlRef_4_0= RULE_ID )
                    // InternalEdilang.g:4405:5: lv_interchangeControlRef_4_0= RULE_ID
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

            // InternalEdilang.g:4421:3: ( (lv_lineEnd_5_0= RULE_QUOTE_AND_NL ) )
            // InternalEdilang.g:4422:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            {
            // InternalEdilang.g:4422:4: (lv_lineEnd_5_0= RULE_QUOTE_AND_NL )
            // InternalEdilang.g:4423:5: lv_lineEnd_5_0= RULE_QUOTE_AND_NL
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


    // $ANTLR start "entryRuleUNBHeader"
    // InternalEdilang.g:4443:1: entryRuleUNBHeader returns [EObject current=null] : iv_ruleUNBHeader= ruleUNBHeader EOF ;
    public final EObject entryRuleUNBHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNBHeader = null;


        try {
            // InternalEdilang.g:4443:50: (iv_ruleUNBHeader= ruleUNBHeader EOF )
            // InternalEdilang.g:4444:2: iv_ruleUNBHeader= ruleUNBHeader EOF
            {
             newCompositeNode(grammarAccess.getUNBHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNBHeader=ruleUNBHeader();

            state._fsp--;

             current =iv_ruleUNBHeader; 
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
    // $ANTLR end "entryRuleUNBHeader"


    // $ANTLR start "ruleUNBHeader"
    // InternalEdilang.g:4450:1: ruleUNBHeader returns [EObject current=null] : ( () ( (lv_syntax_1_0= RULE_ID ) )? this_COLON_2= RULE_COLON ( (lv_num1_3_0= RULE_ID ) )? ) ;
    public final EObject ruleUNBHeader() throws RecognitionException {
        EObject current = null;

        Token lv_syntax_1_0=null;
        Token this_COLON_2=null;
        Token lv_num1_3_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4456:2: ( ( () ( (lv_syntax_1_0= RULE_ID ) )? this_COLON_2= RULE_COLON ( (lv_num1_3_0= RULE_ID ) )? ) )
            // InternalEdilang.g:4457:2: ( () ( (lv_syntax_1_0= RULE_ID ) )? this_COLON_2= RULE_COLON ( (lv_num1_3_0= RULE_ID ) )? )
            {
            // InternalEdilang.g:4457:2: ( () ( (lv_syntax_1_0= RULE_ID ) )? this_COLON_2= RULE_COLON ( (lv_num1_3_0= RULE_ID ) )? )
            // InternalEdilang.g:4458:3: () ( (lv_syntax_1_0= RULE_ID ) )? this_COLON_2= RULE_COLON ( (lv_num1_3_0= RULE_ID ) )?
            {
            // InternalEdilang.g:4458:3: ()
            // InternalEdilang.g:4459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUNBHeaderAccess().getUNBHeaderAction_0(),
            					current);
            			

            }

            // InternalEdilang.g:4465:3: ( (lv_syntax_1_0= RULE_ID ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_ID) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalEdilang.g:4466:4: (lv_syntax_1_0= RULE_ID )
                    {
                    // InternalEdilang.g:4466:4: (lv_syntax_1_0= RULE_ID )
                    // InternalEdilang.g:4467:5: lv_syntax_1_0= RULE_ID
                    {
                    lv_syntax_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_syntax_1_0, grammarAccess.getUNBHeaderAccess().getSyntaxIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUNBHeaderRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"syntax",
                    						lv_syntax_1_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_2, grammarAccess.getUNBHeaderAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalEdilang.g:4487:3: ( (lv_num1_3_0= RULE_ID ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_ID) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalEdilang.g:4488:4: (lv_num1_3_0= RULE_ID )
                    {
                    // InternalEdilang.g:4488:4: (lv_num1_3_0= RULE_ID )
                    // InternalEdilang.g:4489:5: lv_num1_3_0= RULE_ID
                    {
                    lv_num1_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_num1_3_0, grammarAccess.getUNBHeaderAccess().getNum1IDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUNBHeaderRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"num1",
                    						lv_num1_3_0,
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
    // $ANTLR end "ruleUNBHeader"


    // $ANTLR start "entryRulePriceInformation"
    // InternalEdilang.g:4509:1: entryRulePriceInformation returns [EObject current=null] : iv_rulePriceInformation= rulePriceInformation EOF ;
    public final EObject entryRulePriceInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriceInformation = null;


        try {
            // InternalEdilang.g:4509:57: (iv_rulePriceInformation= rulePriceInformation EOF )
            // InternalEdilang.g:4510:2: iv_rulePriceInformation= rulePriceInformation EOF
            {
             newCompositeNode(grammarAccess.getPriceInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePriceInformation=rulePriceInformation();

            state._fsp--;

             current =iv_rulePriceInformation; 
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
    // $ANTLR end "entryRulePriceInformation"


    // $ANTLR start "rulePriceInformation"
    // InternalEdilang.g:4516:1: rulePriceInformation returns [EObject current=null] : ( ( (lv_priceCodeQualifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_priceAmount_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_priceTypeCode_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_priceSpecificationCode_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_unitPriceBasisValue_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_measurementUnitCode_10_0= RULE_ID ) )? ) ;
    public final EObject rulePriceInformation() throws RecognitionException {
        EObject current = null;

        Token lv_priceCodeQualifier_0_0=null;
        Token this_COLON_1=null;
        Token lv_priceAmount_2_0=null;
        Token this_COLON_3=null;
        Token lv_priceTypeCode_4_0=null;
        Token this_COLON_5=null;
        Token lv_priceSpecificationCode_6_0=null;
        Token this_COLON_7=null;
        Token lv_unitPriceBasisValue_8_0=null;
        Token this_COLON_9=null;
        Token lv_measurementUnitCode_10_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4522:2: ( ( ( (lv_priceCodeQualifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_priceAmount_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_priceTypeCode_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_priceSpecificationCode_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_unitPriceBasisValue_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_measurementUnitCode_10_0= RULE_ID ) )? ) )
            // InternalEdilang.g:4523:2: ( ( (lv_priceCodeQualifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_priceAmount_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_priceTypeCode_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_priceSpecificationCode_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_unitPriceBasisValue_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_measurementUnitCode_10_0= RULE_ID ) )? )
            {
            // InternalEdilang.g:4523:2: ( ( (lv_priceCodeQualifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_priceAmount_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_priceTypeCode_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_priceSpecificationCode_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_unitPriceBasisValue_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_measurementUnitCode_10_0= RULE_ID ) )? )
            // InternalEdilang.g:4524:3: ( (lv_priceCodeQualifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_priceAmount_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_priceTypeCode_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_priceSpecificationCode_6_0= RULE_ID ) )? this_COLON_7= RULE_COLON ( (lv_unitPriceBasisValue_8_0= RULE_ID ) )? this_COLON_9= RULE_COLON ( (lv_measurementUnitCode_10_0= RULE_ID ) )?
            {
            // InternalEdilang.g:4524:3: ( (lv_priceCodeQualifier_0_0= RULE_ID ) )
            // InternalEdilang.g:4525:4: (lv_priceCodeQualifier_0_0= RULE_ID )
            {
            // InternalEdilang.g:4525:4: (lv_priceCodeQualifier_0_0= RULE_ID )
            // InternalEdilang.g:4526:5: lv_priceCodeQualifier_0_0= RULE_ID
            {
            lv_priceCodeQualifier_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_priceCodeQualifier_0_0, grammarAccess.getPriceInformationAccess().getPriceCodeQualifierIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPriceInformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priceCodeQualifier",
            						lv_priceCodeQualifier_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_15); 

            			newLeafNode(this_COLON_1, grammarAccess.getPriceInformationAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:4546:3: ( (lv_priceAmount_2_0= RULE_ID ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==RULE_ID) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalEdilang.g:4547:4: (lv_priceAmount_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4547:4: (lv_priceAmount_2_0= RULE_ID )
                    // InternalEdilang.g:4548:5: lv_priceAmount_2_0= RULE_ID
                    {
                    lv_priceAmount_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_priceAmount_2_0, grammarAccess.getPriceInformationAccess().getPriceAmountIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPriceInformationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"priceAmount",
                    						lv_priceAmount_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_15); 

            			newLeafNode(this_COLON_3, grammarAccess.getPriceInformationAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalEdilang.g:4568:3: ( (lv_priceTypeCode_4_0= RULE_ID ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_ID) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalEdilang.g:4569:4: (lv_priceTypeCode_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4569:4: (lv_priceTypeCode_4_0= RULE_ID )
                    // InternalEdilang.g:4570:5: lv_priceTypeCode_4_0= RULE_ID
                    {
                    lv_priceTypeCode_4_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_priceTypeCode_4_0, grammarAccess.getPriceInformationAccess().getPriceTypeCodeIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPriceInformationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"priceTypeCode",
                    						lv_priceTypeCode_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_15); 

            			newLeafNode(this_COLON_5, grammarAccess.getPriceInformationAccess().getCOLONTerminalRuleCall_5());
            		
            // InternalEdilang.g:4590:3: ( (lv_priceSpecificationCode_6_0= RULE_ID ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_ID) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalEdilang.g:4591:4: (lv_priceSpecificationCode_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:4591:4: (lv_priceSpecificationCode_6_0= RULE_ID )
                    // InternalEdilang.g:4592:5: lv_priceSpecificationCode_6_0= RULE_ID
                    {
                    lv_priceSpecificationCode_6_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_priceSpecificationCode_6_0, grammarAccess.getPriceInformationAccess().getPriceSpecificationCodeIDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPriceInformationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"priceSpecificationCode",
                    						lv_priceSpecificationCode_6_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_15); 

            			newLeafNode(this_COLON_7, grammarAccess.getPriceInformationAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalEdilang.g:4612:3: ( (lv_unitPriceBasisValue_8_0= RULE_ID ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_ID) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalEdilang.g:4613:4: (lv_unitPriceBasisValue_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:4613:4: (lv_unitPriceBasisValue_8_0= RULE_ID )
                    // InternalEdilang.g:4614:5: lv_unitPriceBasisValue_8_0= RULE_ID
                    {
                    lv_unitPriceBasisValue_8_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_unitPriceBasisValue_8_0, grammarAccess.getPriceInformationAccess().getUnitPriceBasisValueIDTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPriceInformationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"unitPriceBasisValue",
                    						lv_unitPriceBasisValue_8_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_9=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_9, grammarAccess.getPriceInformationAccess().getCOLONTerminalRuleCall_9());
            		
            // InternalEdilang.g:4634:3: ( (lv_measurementUnitCode_10_0= RULE_ID ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_ID) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalEdilang.g:4635:4: (lv_measurementUnitCode_10_0= RULE_ID )
                    {
                    // InternalEdilang.g:4635:4: (lv_measurementUnitCode_10_0= RULE_ID )
                    // InternalEdilang.g:4636:5: lv_measurementUnitCode_10_0= RULE_ID
                    {
                    lv_measurementUnitCode_10_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_measurementUnitCode_10_0, grammarAccess.getPriceInformationAccess().getMeasurementUnitCodeIDTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPriceInformationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"measurementUnitCode",
                    						lv_measurementUnitCode_10_0,
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
    // $ANTLR end "rulePriceInformation"


    // $ANTLR start "entryRuleMessageBodyFunction"
    // InternalEdilang.g:4656:1: entryRuleMessageBodyFunction returns [EObject current=null] : iv_ruleMessageBodyFunction= ruleMessageBodyFunction EOF ;
    public final EObject entryRuleMessageBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageBodyFunction = null;


        try {
            // InternalEdilang.g:4656:60: (iv_ruleMessageBodyFunction= ruleMessageBodyFunction EOF )
            // InternalEdilang.g:4657:2: iv_ruleMessageBodyFunction= ruleMessageBodyFunction EOF
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
    // InternalEdilang.g:4663:1: ruleMessageBodyFunction returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )? ) ;
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
            // InternalEdilang.g:4669:2: ( ( ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )? ) )
            // InternalEdilang.g:4670:2: ( ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )? )
            {
            // InternalEdilang.g:4670:2: ( ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )? )
            // InternalEdilang.g:4671:3: ( (lv_type_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_version_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_release_4_0= RULE_ID ) )? this_COLON_5= RULE_COLON ( (lv_controllingAgency_6_0= RULE_ID ) )? (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )?
            {
            // InternalEdilang.g:4671:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalEdilang.g:4672:4: (lv_type_0_0= RULE_ID )
            {
            // InternalEdilang.g:4672:4: (lv_type_0_0= RULE_ID )
            // InternalEdilang.g:4673:5: lv_type_0_0= RULE_ID
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

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_15); 

            			newLeafNode(this_COLON_1, grammarAccess.getMessageBodyFunctionAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:4693:3: ( (lv_version_2_0= RULE_ID ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==RULE_ID) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalEdilang.g:4694:4: (lv_version_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:4694:4: (lv_version_2_0= RULE_ID )
                    // InternalEdilang.g:4695:5: lv_version_2_0= RULE_ID
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

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_15); 

            			newLeafNode(this_COLON_3, grammarAccess.getMessageBodyFunctionAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalEdilang.g:4715:3: ( (lv_release_4_0= RULE_ID ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==RULE_ID) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalEdilang.g:4716:4: (lv_release_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4716:4: (lv_release_4_0= RULE_ID )
                    // InternalEdilang.g:4717:5: lv_release_4_0= RULE_ID
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
            		
            // InternalEdilang.g:4737:3: ( (lv_controllingAgency_6_0= RULE_ID ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==RULE_ID) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalEdilang.g:4738:4: (lv_controllingAgency_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:4738:4: (lv_controllingAgency_6_0= RULE_ID )
                    // InternalEdilang.g:4739:5: lv_controllingAgency_6_0= RULE_ID
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

            // InternalEdilang.g:4755:3: (this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_COLON) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalEdilang.g:4756:4: this_COLON_7= RULE_COLON ( (lv_more_8_0= RULE_ID ) )
                    {
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_7, grammarAccess.getMessageBodyFunctionAccess().getCOLONTerminalRuleCall_7_0());
                    			
                    // InternalEdilang.g:4760:4: ( (lv_more_8_0= RULE_ID ) )
                    // InternalEdilang.g:4761:5: (lv_more_8_0= RULE_ID )
                    {
                    // InternalEdilang.g:4761:5: (lv_more_8_0= RULE_ID )
                    // InternalEdilang.g:4762:6: lv_more_8_0= RULE_ID
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


    // $ANTLR start "entryRuleMessageIndentifier"
    // InternalEdilang.g:4783:1: entryRuleMessageIndentifier returns [EObject current=null] : iv_ruleMessageIndentifier= ruleMessageIndentifier EOF ;
    public final EObject entryRuleMessageIndentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageIndentifier = null;


        try {
            // InternalEdilang.g:4783:59: (iv_ruleMessageIndentifier= ruleMessageIndentifier EOF )
            // InternalEdilang.g:4784:2: iv_ruleMessageIndentifier= ruleMessageIndentifier EOF
            {
             newCompositeNode(grammarAccess.getMessageIndentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageIndentifier=ruleMessageIndentifier();

            state._fsp--;

             current =iv_ruleMessageIndentifier; 
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
    // $ANTLR end "entryRuleMessageIndentifier"


    // $ANTLR start "ruleMessageIndentifier"
    // InternalEdilang.g:4790:1: ruleMessageIndentifier returns [EObject current=null] : ( ( (lv_messageTypeCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_releaseIdentifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )? )? )? ) ;
    public final EObject ruleMessageIndentifier() throws RecognitionException {
        EObject current = null;

        Token lv_messageTypeCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_versionIdentifier_2_0=null;
        Token this_COLON_3=null;
        Token lv_releaseIdentifier_4_0=null;
        Token this_COLON_5=null;
        Token lv_controllingAgencyIdentifier_6_0=null;
        Token this_COLON_7=null;
        Token lv_messageImplementationIdentificationCode_8_0=null;
        Token this_COLON_9=null;
        Token lv_revisionIdentifier_10_0=null;
        Token this_COLON_11=null;
        Token lv_documentStatusCode_12_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4796:2: ( ( ( (lv_messageTypeCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_releaseIdentifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )? )? )? ) )
            // InternalEdilang.g:4797:2: ( ( (lv_messageTypeCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_releaseIdentifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )? )? )? )
            {
            // InternalEdilang.g:4797:2: ( ( (lv_messageTypeCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_releaseIdentifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )? )? )? )
            // InternalEdilang.g:4798:3: ( (lv_messageTypeCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_releaseIdentifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )? )? )?
            {
            // InternalEdilang.g:4798:3: ( (lv_messageTypeCode_0_0= RULE_ID ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_ID) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalEdilang.g:4799:4: (lv_messageTypeCode_0_0= RULE_ID )
                    {
                    // InternalEdilang.g:4799:4: (lv_messageTypeCode_0_0= RULE_ID )
                    // InternalEdilang.g:4800:5: lv_messageTypeCode_0_0= RULE_ID
                    {
                    lv_messageTypeCode_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_messageTypeCode_0_0, grammarAccess.getMessageIndentifierAccess().getMessageTypeCodeIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageIndentifierRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"messageTypeCode",
                    						lv_messageTypeCode_0_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

            			newLeafNode(this_COLON_1, grammarAccess.getMessageIndentifierAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:4820:3: ( (lv_versionIdentifier_2_0= RULE_ID ) )
            // InternalEdilang.g:4821:4: (lv_versionIdentifier_2_0= RULE_ID )
            {
            // InternalEdilang.g:4821:4: (lv_versionIdentifier_2_0= RULE_ID )
            // InternalEdilang.g:4822:5: lv_versionIdentifier_2_0= RULE_ID
            {
            lv_versionIdentifier_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_versionIdentifier_2_0, grammarAccess.getMessageIndentifierAccess().getVersionIdentifierIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageIndentifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"versionIdentifier",
            						lv_versionIdentifier_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:4838:3: (this_COLON_3= RULE_COLON ( (lv_releaseIdentifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )? )? )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_COLON) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalEdilang.g:4839:4: this_COLON_3= RULE_COLON ( (lv_releaseIdentifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )? )?
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getMessageIndentifierAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:4843:4: ( (lv_releaseIdentifier_4_0= RULE_ID ) )
                    // InternalEdilang.g:4844:5: (lv_releaseIdentifier_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:4844:5: (lv_releaseIdentifier_4_0= RULE_ID )
                    // InternalEdilang.g:4845:6: lv_releaseIdentifier_4_0= RULE_ID
                    {
                    lv_releaseIdentifier_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_releaseIdentifier_4_0, grammarAccess.getMessageIndentifierAccess().getReleaseIdentifierIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageIndentifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"releaseIdentifier",
                    							lv_releaseIdentifier_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:4861:4: (this_COLON_5= RULE_COLON ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )? )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==RULE_COLON) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // InternalEdilang.g:4862:5: this_COLON_5= RULE_COLON ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )?
                            {
                            this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_5, grammarAccess.getMessageIndentifierAccess().getCOLONTerminalRuleCall_3_2_0());
                            				
                            // InternalEdilang.g:4866:5: ( (lv_controllingAgencyIdentifier_6_0= RULE_ID ) )
                            // InternalEdilang.g:4867:6: (lv_controllingAgencyIdentifier_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:4867:6: (lv_controllingAgencyIdentifier_6_0= RULE_ID )
                            // InternalEdilang.g:4868:7: lv_controllingAgencyIdentifier_6_0= RULE_ID
                            {
                            lv_controllingAgencyIdentifier_6_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_controllingAgencyIdentifier_6_0, grammarAccess.getMessageIndentifierAccess().getControllingAgencyIdentifierIDTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageIndentifierRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"controllingAgencyIdentifier",
                            								lv_controllingAgencyIdentifier_6_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:4884:5: (this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )? )?
                            int alt124=2;
                            int LA124_0 = input.LA(1);

                            if ( (LA124_0==RULE_COLON) ) {
                                alt124=1;
                            }
                            switch (alt124) {
                                case 1 :
                                    // InternalEdilang.g:4885:6: this_COLON_7= RULE_COLON ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )?
                                    {
                                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_7, grammarAccess.getMessageIndentifierAccess().getCOLONTerminalRuleCall_3_2_2_0());
                                    					
                                    // InternalEdilang.g:4889:6: ( (lv_messageImplementationIdentificationCode_8_0= RULE_ID ) )
                                    // InternalEdilang.g:4890:7: (lv_messageImplementationIdentificationCode_8_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:4890:7: (lv_messageImplementationIdentificationCode_8_0= RULE_ID )
                                    // InternalEdilang.g:4891:8: lv_messageImplementationIdentificationCode_8_0= RULE_ID
                                    {
                                    lv_messageImplementationIdentificationCode_8_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                                    								newLeafNode(lv_messageImplementationIdentificationCode_8_0, grammarAccess.getMessageIndentifierAccess().getMessageImplementationIdentificationCodeIDTerminalRuleCall_3_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getMessageIndentifierRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"messageImplementationIdentificationCode",
                                    									lv_messageImplementationIdentificationCode_8_0,
                                    									"io.thlaegler.edifact.Edilang.ID");
                                    							

                                    }


                                    }

                                    // InternalEdilang.g:4907:6: (this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )? )?
                                    int alt123=2;
                                    int LA123_0 = input.LA(1);

                                    if ( (LA123_0==RULE_COLON) ) {
                                        alt123=1;
                                    }
                                    switch (alt123) {
                                        case 1 :
                                            // InternalEdilang.g:4908:7: this_COLON_9= RULE_COLON ( (lv_revisionIdentifier_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )?
                                            {
                                            this_COLON_9=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                            							newLeafNode(this_COLON_9, grammarAccess.getMessageIndentifierAccess().getCOLONTerminalRuleCall_3_2_2_2_0());
                                            						
                                            // InternalEdilang.g:4912:7: ( (lv_revisionIdentifier_10_0= RULE_ID ) )
                                            // InternalEdilang.g:4913:8: (lv_revisionIdentifier_10_0= RULE_ID )
                                            {
                                            // InternalEdilang.g:4913:8: (lv_revisionIdentifier_10_0= RULE_ID )
                                            // InternalEdilang.g:4914:9: lv_revisionIdentifier_10_0= RULE_ID
                                            {
                                            lv_revisionIdentifier_10_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                                            									newLeafNode(lv_revisionIdentifier_10_0, grammarAccess.getMessageIndentifierAccess().getRevisionIdentifierIDTerminalRuleCall_3_2_2_2_1_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getMessageIndentifierRule());
                                            									}
                                            									setWithLastConsumed(
                                            										current,
                                            										"revisionIdentifier",
                                            										lv_revisionIdentifier_10_0,
                                            										"io.thlaegler.edifact.Edilang.ID");
                                            								

                                            }


                                            }

                                            // InternalEdilang.g:4930:7: (this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) ) )?
                                            int alt122=2;
                                            int LA122_0 = input.LA(1);

                                            if ( (LA122_0==RULE_COLON) ) {
                                                alt122=1;
                                            }
                                            switch (alt122) {
                                                case 1 :
                                                    // InternalEdilang.g:4931:8: this_COLON_11= RULE_COLON ( (lv_documentStatusCode_12_0= RULE_ID ) )
                                                    {
                                                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                                    								newLeafNode(this_COLON_11, grammarAccess.getMessageIndentifierAccess().getCOLONTerminalRuleCall_3_2_2_2_2_0());
                                                    							
                                                    // InternalEdilang.g:4935:8: ( (lv_documentStatusCode_12_0= RULE_ID ) )
                                                    // InternalEdilang.g:4936:9: (lv_documentStatusCode_12_0= RULE_ID )
                                                    {
                                                    // InternalEdilang.g:4936:9: (lv_documentStatusCode_12_0= RULE_ID )
                                                    // InternalEdilang.g:4937:10: lv_documentStatusCode_12_0= RULE_ID
                                                    {
                                                    lv_documentStatusCode_12_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                                                    										newLeafNode(lv_documentStatusCode_12_0, grammarAccess.getMessageIndentifierAccess().getDocumentStatusCodeIDTerminalRuleCall_3_2_2_2_2_1_0());
                                                    									

                                                    										if (current==null) {
                                                    											current = createModelElement(grammarAccess.getMessageIndentifierRule());
                                                    										}
                                                    										setWithLastConsumed(
                                                    											current,
                                                    											"documentStatusCode",
                                                    											lv_documentStatusCode_12_0,
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
    // $ANTLR end "ruleMessageIndentifier"


    // $ANTLR start "entryRuleRelationship"
    // InternalEdilang.g:4962:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalEdilang.g:4962:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalEdilang.g:4963:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalEdilang.g:4969:1: ruleRelationship returns [EObject current=null] : ( ( (lv_relationshipDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_relationshipDescription_6_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_relationshipDescriptionCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_codeListIdentificationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListResponsibleAgency_4_0=null;
        Token this_COLON_5=null;
        Token lv_relationshipDescription_6_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:4975:2: ( ( ( (lv_relationshipDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_relationshipDescription_6_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:4976:2: ( ( (lv_relationshipDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_relationshipDescription_6_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:4976:2: ( ( (lv_relationshipDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_relationshipDescription_6_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:4977:3: ( (lv_relationshipDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_relationshipDescription_6_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:4977:3: ( (lv_relationshipDescriptionCode_0_0= RULE_ID ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==RULE_ID) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalEdilang.g:4978:4: (lv_relationshipDescriptionCode_0_0= RULE_ID )
                    {
                    // InternalEdilang.g:4978:4: (lv_relationshipDescriptionCode_0_0= RULE_ID )
                    // InternalEdilang.g:4979:5: lv_relationshipDescriptionCode_0_0= RULE_ID
                    {
                    lv_relationshipDescriptionCode_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_relationshipDescriptionCode_0_0, grammarAccess.getRelationshipAccess().getRelationshipDescriptionCodeIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"relationshipDescriptionCode",
                    						lv_relationshipDescriptionCode_0_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

            			newLeafNode(this_COLON_1, grammarAccess.getRelationshipAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:4999:3: ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )
            // InternalEdilang.g:5000:4: (lv_codeListIdentificationCode_2_0= RULE_ID )
            {
            // InternalEdilang.g:5000:4: (lv_codeListIdentificationCode_2_0= RULE_ID )
            // InternalEdilang.g:5001:5: lv_codeListIdentificationCode_2_0= RULE_ID
            {
            lv_codeListIdentificationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_codeListIdentificationCode_2_0, grammarAccess.getRelationshipAccess().getCodeListIdentificationCodeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"codeListIdentificationCode",
            						lv_codeListIdentificationCode_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:5017:3: (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_relationshipDescription_6_0= RULE_ID ) ) )? )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_COLON) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalEdilang.g:5018:4: this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_relationshipDescription_6_0= RULE_ID ) ) )?
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getRelationshipAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:5022:4: ( (lv_codeListResponsibleAgency_4_0= RULE_ID ) )
                    // InternalEdilang.g:5023:5: (lv_codeListResponsibleAgency_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:5023:5: (lv_codeListResponsibleAgency_4_0= RULE_ID )
                    // InternalEdilang.g:5024:6: lv_codeListResponsibleAgency_4_0= RULE_ID
                    {
                    lv_codeListResponsibleAgency_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_codeListResponsibleAgency_4_0, grammarAccess.getRelationshipAccess().getCodeListResponsibleAgencyIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationshipRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"codeListResponsibleAgency",
                    							lv_codeListResponsibleAgency_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:5040:4: (this_COLON_5= RULE_COLON ( (lv_relationshipDescription_6_0= RULE_ID ) ) )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==RULE_COLON) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // InternalEdilang.g:5041:5: this_COLON_5= RULE_COLON ( (lv_relationshipDescription_6_0= RULE_ID ) )
                            {
                            this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_5, grammarAccess.getRelationshipAccess().getCOLONTerminalRuleCall_3_2_0());
                            				
                            // InternalEdilang.g:5045:5: ( (lv_relationshipDescription_6_0= RULE_ID ) )
                            // InternalEdilang.g:5046:6: (lv_relationshipDescription_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:5046:6: (lv_relationshipDescription_6_0= RULE_ID )
                            // InternalEdilang.g:5047:7: lv_relationshipDescription_6_0= RULE_ID
                            {
                            lv_relationshipDescription_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_relationshipDescription_6_0, grammarAccess.getRelationshipAccess().getRelationshipDescriptionIDTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationshipRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"relationshipDescription",
                            								lv_relationshipDescription_6_0,
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleProductFunction"
    // InternalEdilang.g:5069:1: entryRuleProductFunction returns [EObject current=null] : iv_ruleProductFunction= ruleProductFunction EOF ;
    public final EObject entryRuleProductFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFunction = null;


        try {
            // InternalEdilang.g:5069:56: (iv_ruleProductFunction= ruleProductFunction EOF )
            // InternalEdilang.g:5070:2: iv_ruleProductFunction= ruleProductFunction EOF
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
    // InternalEdilang.g:5076:1: ruleProductFunction returns [EObject current=null] : ( ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleProductFunction() throws RecognitionException {
        EObject current = null;

        Token lv_bookingClass_0_0=null;
        Token this_COLON_1=null;
        Token lv_avail_2_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5082:2: ( ( ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )? ) )
            // InternalEdilang.g:5083:2: ( ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )? )
            {
            // InternalEdilang.g:5083:2: ( ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )? )
            // InternalEdilang.g:5084:3: ( (lv_bookingClass_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )?
            {
            // InternalEdilang.g:5084:3: ( (lv_bookingClass_0_0= RULE_ID ) )
            // InternalEdilang.g:5085:4: (lv_bookingClass_0_0= RULE_ID )
            {
            // InternalEdilang.g:5085:4: (lv_bookingClass_0_0= RULE_ID )
            // InternalEdilang.g:5086:5: lv_bookingClass_0_0= RULE_ID
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

            // InternalEdilang.g:5102:3: (this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==RULE_COLON) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalEdilang.g:5103:4: this_COLON_1= RULE_COLON ( (lv_avail_2_0= RULE_ID ) )
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getProductFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:5107:4: ( (lv_avail_2_0= RULE_ID ) )
                    // InternalEdilang.g:5108:5: (lv_avail_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:5108:5: (lv_avail_2_0= RULE_ID )
                    // InternalEdilang.g:5109:6: lv_avail_2_0= RULE_ID
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


    // $ANTLR start "entryRuleItemNumberIdentification"
    // InternalEdilang.g:5130:1: entryRuleItemNumberIdentification returns [EObject current=null] : iv_ruleItemNumberIdentification= ruleItemNumberIdentification EOF ;
    public final EObject entryRuleItemNumberIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemNumberIdentification = null;


        try {
            // InternalEdilang.g:5130:65: (iv_ruleItemNumberIdentification= ruleItemNumberIdentification EOF )
            // InternalEdilang.g:5131:2: iv_ruleItemNumberIdentification= ruleItemNumberIdentification EOF
            {
             newCompositeNode(grammarAccess.getItemNumberIdentificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemNumberIdentification=ruleItemNumberIdentification();

            state._fsp--;

             current =iv_ruleItemNumberIdentification; 
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
    // $ANTLR end "entryRuleItemNumberIdentification"


    // $ANTLR start "ruleItemNumberIdentification"
    // InternalEdilang.g:5137:1: ruleItemNumberIdentification returns [EObject current=null] : ( ( (lv_itemIdentifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_itemTypeIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListIdentificationCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleItemNumberIdentification() throws RecognitionException {
        EObject current = null;

        Token lv_itemIdentifier_0_0=null;
        Token this_COLON_1=null;
        Token lv_itemTypeIdentificationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListIdentificationCode_4_0=null;
        Token this_COLON_5=null;
        Token lv_codeListResponsibleAgencyCode_6_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5143:2: ( ( ( (lv_itemIdentifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_itemTypeIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListIdentificationCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:5144:2: ( ( (lv_itemIdentifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_itemTypeIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListIdentificationCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:5144:2: ( ( (lv_itemIdentifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_itemTypeIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListIdentificationCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:5145:3: ( (lv_itemIdentifier_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_itemTypeIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListIdentificationCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:5145:3: ( (lv_itemIdentifier_0_0= RULE_ID ) )
            // InternalEdilang.g:5146:4: (lv_itemIdentifier_0_0= RULE_ID )
            {
            // InternalEdilang.g:5146:4: (lv_itemIdentifier_0_0= RULE_ID )
            // InternalEdilang.g:5147:5: lv_itemIdentifier_0_0= RULE_ID
            {
            lv_itemIdentifier_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_itemIdentifier_0_0, grammarAccess.getItemNumberIdentificationAccess().getItemIdentifierIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemNumberIdentificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"itemIdentifier",
            						lv_itemIdentifier_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

            			newLeafNode(this_COLON_1, grammarAccess.getItemNumberIdentificationAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:5167:3: ( (lv_itemTypeIdentificationCode_2_0= RULE_ID ) )
            // InternalEdilang.g:5168:4: (lv_itemTypeIdentificationCode_2_0= RULE_ID )
            {
            // InternalEdilang.g:5168:4: (lv_itemTypeIdentificationCode_2_0= RULE_ID )
            // InternalEdilang.g:5169:5: lv_itemTypeIdentificationCode_2_0= RULE_ID
            {
            lv_itemTypeIdentificationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_itemTypeIdentificationCode_2_0, grammarAccess.getItemNumberIdentificationAccess().getItemTypeIdentificationCodeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemNumberIdentificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"itemTypeIdentificationCode",
            						lv_itemTypeIdentificationCode_2_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:5185:3: (this_COLON_3= RULE_COLON ( (lv_codeListIdentificationCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) ) )? )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RULE_COLON) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalEdilang.g:5186:4: this_COLON_3= RULE_COLON ( (lv_codeListIdentificationCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) ) )?
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_3, grammarAccess.getItemNumberIdentificationAccess().getCOLONTerminalRuleCall_3_0());
                    			
                    // InternalEdilang.g:5190:4: ( (lv_codeListIdentificationCode_4_0= RULE_ID ) )
                    // InternalEdilang.g:5191:5: (lv_codeListIdentificationCode_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:5191:5: (lv_codeListIdentificationCode_4_0= RULE_ID )
                    // InternalEdilang.g:5192:6: lv_codeListIdentificationCode_4_0= RULE_ID
                    {
                    lv_codeListIdentificationCode_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_codeListIdentificationCode_4_0, grammarAccess.getItemNumberIdentificationAccess().getCodeListIdentificationCodeIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemNumberIdentificationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"codeListIdentificationCode",
                    							lv_codeListIdentificationCode_4_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:5208:4: (this_COLON_5= RULE_COLON ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) ) )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==RULE_COLON) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // InternalEdilang.g:5209:5: this_COLON_5= RULE_COLON ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) )
                            {
                            this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_5, grammarAccess.getItemNumberIdentificationAccess().getCOLONTerminalRuleCall_3_2_0());
                            				
                            // InternalEdilang.g:5213:5: ( (lv_codeListResponsibleAgencyCode_6_0= RULE_ID ) )
                            // InternalEdilang.g:5214:6: (lv_codeListResponsibleAgencyCode_6_0= RULE_ID )
                            {
                            // InternalEdilang.g:5214:6: (lv_codeListResponsibleAgencyCode_6_0= RULE_ID )
                            // InternalEdilang.g:5215:7: lv_codeListResponsibleAgencyCode_6_0= RULE_ID
                            {
                            lv_codeListResponsibleAgencyCode_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_codeListResponsibleAgencyCode_6_0, grammarAccess.getItemNumberIdentificationAccess().getCodeListResponsibleAgencyCodeIDTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getItemNumberIdentificationRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"codeListResponsibleAgencyCode",
                            								lv_codeListResponsibleAgencyCode_6_0,
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
    // $ANTLR end "ruleItemNumberIdentification"


    // $ANTLR start "entryRuleSublineInformation"
    // InternalEdilang.g:5237:1: entryRuleSublineInformation returns [EObject current=null] : iv_ruleSublineInformation= ruleSublineInformation EOF ;
    public final EObject entryRuleSublineInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSublineInformation = null;


        try {
            // InternalEdilang.g:5237:59: (iv_ruleSublineInformation= ruleSublineInformation EOF )
            // InternalEdilang.g:5238:2: iv_ruleSublineInformation= ruleSublineInformation EOF
            {
             newCompositeNode(grammarAccess.getSublineInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSublineInformation=ruleSublineInformation();

            state._fsp--;

             current =iv_ruleSublineInformation; 
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
    // $ANTLR end "entryRuleSublineInformation"


    // $ANTLR start "ruleSublineInformation"
    // InternalEdilang.g:5244:1: ruleSublineInformation returns [EObject current=null] : ( ( (lv_sublineIndicatorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_lineItemIdentifier_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSublineInformation() throws RecognitionException {
        EObject current = null;

        Token lv_sublineIndicatorCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_lineItemIdentifier_2_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5250:2: ( ( ( (lv_sublineIndicatorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_lineItemIdentifier_2_0= RULE_ID ) ) )? ) )
            // InternalEdilang.g:5251:2: ( ( (lv_sublineIndicatorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_lineItemIdentifier_2_0= RULE_ID ) ) )? )
            {
            // InternalEdilang.g:5251:2: ( ( (lv_sublineIndicatorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_lineItemIdentifier_2_0= RULE_ID ) ) )? )
            // InternalEdilang.g:5252:3: ( (lv_sublineIndicatorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_lineItemIdentifier_2_0= RULE_ID ) ) )?
            {
            // InternalEdilang.g:5252:3: ( (lv_sublineIndicatorCode_0_0= RULE_ID ) )
            // InternalEdilang.g:5253:4: (lv_sublineIndicatorCode_0_0= RULE_ID )
            {
            // InternalEdilang.g:5253:4: (lv_sublineIndicatorCode_0_0= RULE_ID )
            // InternalEdilang.g:5254:5: lv_sublineIndicatorCode_0_0= RULE_ID
            {
            lv_sublineIndicatorCode_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_sublineIndicatorCode_0_0, grammarAccess.getSublineInformationAccess().getSublineIndicatorCodeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSublineInformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sublineIndicatorCode",
            						lv_sublineIndicatorCode_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:5270:3: (this_COLON_1= RULE_COLON ( (lv_lineItemIdentifier_2_0= RULE_ID ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==RULE_COLON) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalEdilang.g:5271:4: this_COLON_1= RULE_COLON ( (lv_lineItemIdentifier_2_0= RULE_ID ) )
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getSublineInformationAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:5275:4: ( (lv_lineItemIdentifier_2_0= RULE_ID ) )
                    // InternalEdilang.g:5276:5: (lv_lineItemIdentifier_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:5276:5: (lv_lineItemIdentifier_2_0= RULE_ID )
                    // InternalEdilang.g:5277:6: lv_lineItemIdentifier_2_0= RULE_ID
                    {
                    lv_lineItemIdentifier_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_lineItemIdentifier_2_0, grammarAccess.getSublineInformationAccess().getLineItemIdentifierIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSublineInformationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lineItemIdentifier",
                    							lv_lineItemIdentifier_2_0,
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
    // $ANTLR end "ruleSublineInformation"


    // $ANTLR start "entryRuleQuantityDetail"
    // InternalEdilang.g:5298:1: entryRuleQuantityDetail returns [EObject current=null] : iv_ruleQuantityDetail= ruleQuantityDetail EOF ;
    public final EObject entryRuleQuantityDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantityDetail = null;


        try {
            // InternalEdilang.g:5298:55: (iv_ruleQuantityDetail= ruleQuantityDetail EOF )
            // InternalEdilang.g:5299:2: iv_ruleQuantityDetail= ruleQuantityDetail EOF
            {
             newCompositeNode(grammarAccess.getQuantityDetailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantityDetail=ruleQuantityDetail();

            state._fsp--;

             current =iv_ruleQuantityDetail; 
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
    // $ANTLR end "entryRuleQuantityDetail"


    // $ANTLR start "ruleQuantityDetail"
    // InternalEdilang.g:5305:1: ruleQuantityDetail returns [EObject current=null] : ( ( (lv_quantityTypeCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_quantity_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_measurementUnitCode_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleQuantityDetail() throws RecognitionException {
        EObject current = null;

        Token lv_quantityTypeCodeQualifier_0_0=null;
        Token this_COLON_1=null;
        Token lv_quantity_2_0=null;
        Token this_COLON_3=null;
        Token lv_measurementUnitCode_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5311:2: ( ( ( (lv_quantityTypeCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_quantity_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_measurementUnitCode_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:5312:2: ( ( (lv_quantityTypeCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_quantity_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_measurementUnitCode_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:5312:2: ( ( (lv_quantityTypeCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_quantity_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_measurementUnitCode_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:5313:3: ( (lv_quantityTypeCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_quantity_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_measurementUnitCode_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:5313:3: ( (lv_quantityTypeCodeQualifier_0_0= RULE_ID ) )
            // InternalEdilang.g:5314:4: (lv_quantityTypeCodeQualifier_0_0= RULE_ID )
            {
            // InternalEdilang.g:5314:4: (lv_quantityTypeCodeQualifier_0_0= RULE_ID )
            // InternalEdilang.g:5315:5: lv_quantityTypeCodeQualifier_0_0= RULE_ID
            {
            lv_quantityTypeCodeQualifier_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_quantityTypeCodeQualifier_0_0, grammarAccess.getQuantityDetailAccess().getQuantityTypeCodeQualifierIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityDetailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantityTypeCodeQualifier",
            						lv_quantityTypeCodeQualifier_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:5331:3: (this_COLON_1= RULE_COLON ( (lv_quantity_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_measurementUnitCode_4_0= RULE_ID ) ) )? )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RULE_COLON) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalEdilang.g:5332:4: this_COLON_1= RULE_COLON ( (lv_quantity_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_measurementUnitCode_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getQuantityDetailAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:5336:4: ( (lv_quantity_2_0= RULE_ID ) )
                    // InternalEdilang.g:5337:5: (lv_quantity_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:5337:5: (lv_quantity_2_0= RULE_ID )
                    // InternalEdilang.g:5338:6: lv_quantity_2_0= RULE_ID
                    {
                    lv_quantity_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_quantity_2_0, grammarAccess.getQuantityDetailAccess().getQuantityIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantityDetailRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"quantity",
                    							lv_quantity_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:5354:4: (this_COLON_3= RULE_COLON ( (lv_measurementUnitCode_4_0= RULE_ID ) ) )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==RULE_COLON) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // InternalEdilang.g:5355:5: this_COLON_3= RULE_COLON ( (lv_measurementUnitCode_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getQuantityDetailAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:5359:5: ( (lv_measurementUnitCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:5360:6: (lv_measurementUnitCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:5360:6: (lv_measurementUnitCode_4_0= RULE_ID )
                            // InternalEdilang.g:5361:7: lv_measurementUnitCode_4_0= RULE_ID
                            {
                            lv_measurementUnitCode_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_measurementUnitCode_4_0, grammarAccess.getQuantityDetailAccess().getMeasurementUnitCodeIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQuantityDetailRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"measurementUnitCode",
                            								lv_measurementUnitCode_4_0,
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
    // $ANTLR end "ruleQuantityDetail"


    // $ANTLR start "entryRuleStreet"
    // InternalEdilang.g:5383:1: entryRuleStreet returns [EObject current=null] : iv_ruleStreet= ruleStreet EOF ;
    public final EObject entryRuleStreet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreet = null;


        try {
            // InternalEdilang.g:5383:47: (iv_ruleStreet= ruleStreet EOF )
            // InternalEdilang.g:5384:2: iv_ruleStreet= ruleStreet EOF
            {
             newCompositeNode(grammarAccess.getStreetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStreet=ruleStreet();

            state._fsp--;

             current =iv_ruleStreet; 
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
    // $ANTLR end "entryRuleStreet"


    // $ANTLR start "ruleStreet"
    // InternalEdilang.g:5390:1: ruleStreet returns [EObject current=null] : ( ( (lv_streetAndNumber_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_streetAndNumber_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_streetAndNumber_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )? )? )? ) ;
    public final EObject ruleStreet() throws RecognitionException {
        EObject current = null;

        Token lv_streetAndNumber_0_0=null;
        Token this_COLON_1=null;
        Token lv_streetAndNumber_2_0=null;
        Token this_COLON_3=null;
        Token lv_streetAndNumber_4_0=null;
        Token this_COLON_5=null;
        Token lv_streetAndNumber_6_0=null;
        Token this_COLON_7=null;
        Token lv_streetAndNumber_8_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5396:2: ( ( ( (lv_streetAndNumber_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_streetAndNumber_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_streetAndNumber_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )? )? )? ) )
            // InternalEdilang.g:5397:2: ( ( (lv_streetAndNumber_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_streetAndNumber_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_streetAndNumber_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )? )? )? )
            {
            // InternalEdilang.g:5397:2: ( ( (lv_streetAndNumber_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_streetAndNumber_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_streetAndNumber_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )? )? )? )
            // InternalEdilang.g:5398:3: ( (lv_streetAndNumber_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_streetAndNumber_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_streetAndNumber_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )? )? )?
            {
            // InternalEdilang.g:5398:3: ( (lv_streetAndNumber_0_0= RULE_ID ) )
            // InternalEdilang.g:5399:4: (lv_streetAndNumber_0_0= RULE_ID )
            {
            // InternalEdilang.g:5399:4: (lv_streetAndNumber_0_0= RULE_ID )
            // InternalEdilang.g:5400:5: lv_streetAndNumber_0_0= RULE_ID
            {
            lv_streetAndNumber_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_streetAndNumber_0_0, grammarAccess.getStreetAccess().getStreetAndNumberIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreetRule());
            					}
            					addWithLastConsumed(
            						current,
            						"streetAndNumber",
            						lv_streetAndNumber_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:5416:3: (this_COLON_1= RULE_COLON ( (lv_streetAndNumber_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_streetAndNumber_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )? )? )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==RULE_COLON) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalEdilang.g:5417:4: this_COLON_1= RULE_COLON ( (lv_streetAndNumber_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_streetAndNumber_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )? )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getStreetAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:5421:4: ( (lv_streetAndNumber_2_0= RULE_ID ) )
                    // InternalEdilang.g:5422:5: (lv_streetAndNumber_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:5422:5: (lv_streetAndNumber_2_0= RULE_ID )
                    // InternalEdilang.g:5423:6: lv_streetAndNumber_2_0= RULE_ID
                    {
                    lv_streetAndNumber_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_streetAndNumber_2_0, grammarAccess.getStreetAccess().getStreetAndNumberIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStreetRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"streetAndNumber",
                    							lv_streetAndNumber_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:5439:4: (this_COLON_3= RULE_COLON ( (lv_streetAndNumber_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )? )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==RULE_COLON) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // InternalEdilang.g:5440:5: this_COLON_3= RULE_COLON ( (lv_streetAndNumber_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )?
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getStreetAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:5444:5: ( (lv_streetAndNumber_4_0= RULE_ID ) )
                            // InternalEdilang.g:5445:6: (lv_streetAndNumber_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:5445:6: (lv_streetAndNumber_4_0= RULE_ID )
                            // InternalEdilang.g:5446:7: lv_streetAndNumber_4_0= RULE_ID
                            {
                            lv_streetAndNumber_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_streetAndNumber_4_0, grammarAccess.getStreetAccess().getStreetAndNumberIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getStreetRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"streetAndNumber",
                            								lv_streetAndNumber_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:5462:5: (this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )? )?
                            int alt137=2;
                            int LA137_0 = input.LA(1);

                            if ( (LA137_0==RULE_COLON) ) {
                                alt137=1;
                            }
                            switch (alt137) {
                                case 1 :
                                    // InternalEdilang.g:5463:6: this_COLON_5= RULE_COLON ( (lv_streetAndNumber_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )?
                                    {
                                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_5, grammarAccess.getStreetAccess().getCOLONTerminalRuleCall_1_2_2_0());
                                    					
                                    // InternalEdilang.g:5467:6: ( (lv_streetAndNumber_6_0= RULE_ID ) )
                                    // InternalEdilang.g:5468:7: (lv_streetAndNumber_6_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:5468:7: (lv_streetAndNumber_6_0= RULE_ID )
                                    // InternalEdilang.g:5469:8: lv_streetAndNumber_6_0= RULE_ID
                                    {
                                    lv_streetAndNumber_6_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                                    								newLeafNode(lv_streetAndNumber_6_0, grammarAccess.getStreetAccess().getStreetAndNumberIDTerminalRuleCall_1_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getStreetRule());
                                    								}
                                    								addWithLastConsumed(
                                    									current,
                                    									"streetAndNumber",
                                    									lv_streetAndNumber_6_0,
                                    									"io.thlaegler.edifact.Edilang.ID");
                                    							

                                    }


                                    }

                                    // InternalEdilang.g:5485:6: (this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) ) )?
                                    int alt136=2;
                                    int LA136_0 = input.LA(1);

                                    if ( (LA136_0==RULE_COLON) ) {
                                        alt136=1;
                                    }
                                    switch (alt136) {
                                        case 1 :
                                            // InternalEdilang.g:5486:7: this_COLON_7= RULE_COLON ( (lv_streetAndNumber_8_0= RULE_ID ) )
                                            {
                                            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                            							newLeafNode(this_COLON_7, grammarAccess.getStreetAccess().getCOLONTerminalRuleCall_1_2_2_2_0());
                                            						
                                            // InternalEdilang.g:5490:7: ( (lv_streetAndNumber_8_0= RULE_ID ) )
                                            // InternalEdilang.g:5491:8: (lv_streetAndNumber_8_0= RULE_ID )
                                            {
                                            // InternalEdilang.g:5491:8: (lv_streetAndNumber_8_0= RULE_ID )
                                            // InternalEdilang.g:5492:9: lv_streetAndNumber_8_0= RULE_ID
                                            {
                                            lv_streetAndNumber_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                                            									newLeafNode(lv_streetAndNumber_8_0, grammarAccess.getStreetAccess().getStreetAndNumberIDTerminalRuleCall_1_2_2_2_1_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getStreetRule());
                                            									}
                                            									addWithLastConsumed(
                                            										current,
                                            										"streetAndNumber",
                                            										lv_streetAndNumber_8_0,
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
    // $ANTLR end "ruleStreet"


    // $ANTLR start "entryRuleCountrySubEntityDetail"
    // InternalEdilang.g:5516:1: entryRuleCountrySubEntityDetail returns [EObject current=null] : iv_ruleCountrySubEntityDetail= ruleCountrySubEntityDetail EOF ;
    public final EObject entryRuleCountrySubEntityDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountrySubEntityDetail = null;


        try {
            // InternalEdilang.g:5516:63: (iv_ruleCountrySubEntityDetail= ruleCountrySubEntityDetail EOF )
            // InternalEdilang.g:5517:2: iv_ruleCountrySubEntityDetail= ruleCountrySubEntityDetail EOF
            {
             newCompositeNode(grammarAccess.getCountrySubEntityDetailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountrySubEntityDetail=ruleCountrySubEntityDetail();

            state._fsp--;

             current =iv_ruleCountrySubEntityDetail; 
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
    // $ANTLR end "entryRuleCountrySubEntityDetail"


    // $ANTLR start "ruleCountrySubEntityDetail"
    // InternalEdilang.g:5523:1: ruleCountrySubEntityDetail returns [EObject current=null] : ( ( (lv_countrySubEntityNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )? )? )? ) ;
    public final EObject ruleCountrySubEntityDetail() throws RecognitionException {
        EObject current = null;

        Token lv_countrySubEntityNameCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_codeListIdentificationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListResponsibleAgencyCode_4_0=null;
        Token this_COLON_5=null;
        Token lv_countrySubEntityName_6_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5529:2: ( ( ( (lv_countrySubEntityNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )? )? )? ) )
            // InternalEdilang.g:5530:2: ( ( (lv_countrySubEntityNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )? )? )? )
            {
            // InternalEdilang.g:5530:2: ( ( (lv_countrySubEntityNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )? )? )? )
            // InternalEdilang.g:5531:3: ( (lv_countrySubEntityNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )? )? )?
            {
            // InternalEdilang.g:5531:3: ( (lv_countrySubEntityNameCode_0_0= RULE_ID ) )
            // InternalEdilang.g:5532:4: (lv_countrySubEntityNameCode_0_0= RULE_ID )
            {
            // InternalEdilang.g:5532:4: (lv_countrySubEntityNameCode_0_0= RULE_ID )
            // InternalEdilang.g:5533:5: lv_countrySubEntityNameCode_0_0= RULE_ID
            {
            lv_countrySubEntityNameCode_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_countrySubEntityNameCode_0_0, grammarAccess.getCountrySubEntityDetailAccess().getCountrySubEntityNameCodeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountrySubEntityDetailRule());
            					}
            					addWithLastConsumed(
            						current,
            						"countrySubEntityNameCode",
            						lv_countrySubEntityNameCode_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:5549:3: (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )? )? )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==RULE_COLON) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalEdilang.g:5550:4: this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )? )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getCountrySubEntityDetailAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:5554:4: ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:5555:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:5555:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    // InternalEdilang.g:5556:6: lv_codeListIdentificationCode_2_0= RULE_ID
                    {
                    lv_codeListIdentificationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_codeListIdentificationCode_2_0, grammarAccess.getCountrySubEntityDetailAccess().getCodeListIdentificationCodeIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCountrySubEntityDetailRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"codeListIdentificationCode",
                    							lv_codeListIdentificationCode_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:5572:4: (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )? )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==RULE_COLON) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // InternalEdilang.g:5573:5: this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )?
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getCountrySubEntityDetailAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:5577:5: ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:5578:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:5578:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            // InternalEdilang.g:5579:7: lv_codeListResponsibleAgencyCode_4_0= RULE_ID
                            {
                            lv_codeListResponsibleAgencyCode_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_codeListResponsibleAgencyCode_4_0, grammarAccess.getCountrySubEntityDetailAccess().getCodeListResponsibleAgencyCodeIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCountrySubEntityDetailRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"codeListResponsibleAgencyCode",
                            								lv_codeListResponsibleAgencyCode_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:5595:5: (this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) ) )?
                            int alt140=2;
                            int LA140_0 = input.LA(1);

                            if ( (LA140_0==RULE_COLON) ) {
                                alt140=1;
                            }
                            switch (alt140) {
                                case 1 :
                                    // InternalEdilang.g:5596:6: this_COLON_5= RULE_COLON ( (lv_countrySubEntityName_6_0= RULE_ID ) )
                                    {
                                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_5, grammarAccess.getCountrySubEntityDetailAccess().getCOLONTerminalRuleCall_1_2_2_0());
                                    					
                                    // InternalEdilang.g:5600:6: ( (lv_countrySubEntityName_6_0= RULE_ID ) )
                                    // InternalEdilang.g:5601:7: (lv_countrySubEntityName_6_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:5601:7: (lv_countrySubEntityName_6_0= RULE_ID )
                                    // InternalEdilang.g:5602:8: lv_countrySubEntityName_6_0= RULE_ID
                                    {
                                    lv_countrySubEntityName_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                                    								newLeafNode(lv_countrySubEntityName_6_0, grammarAccess.getCountrySubEntityDetailAccess().getCountrySubEntityNameIDTerminalRuleCall_1_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getCountrySubEntityDetailRule());
                                    								}
                                    								addWithLastConsumed(
                                    									current,
                                    									"countrySubEntityName",
                                    									lv_countrySubEntityName_6_0,
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
    // $ANTLR end "ruleCountrySubEntityDetail"


    // $ANTLR start "entryRulePartyName"
    // InternalEdilang.g:5625:1: entryRulePartyName returns [EObject current=null] : iv_rulePartyName= rulePartyName EOF ;
    public final EObject entryRulePartyName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartyName = null;


        try {
            // InternalEdilang.g:5625:50: (iv_rulePartyName= rulePartyName EOF )
            // InternalEdilang.g:5626:2: iv_rulePartyName= rulePartyName EOF
            {
             newCompositeNode(grammarAccess.getPartyNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartyName=rulePartyName();

            state._fsp--;

             current =iv_rulePartyName; 
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
    // $ANTLR end "entryRulePartyName"


    // $ANTLR start "rulePartyName"
    // InternalEdilang.g:5632:1: rulePartyName returns [EObject current=null] : ( ( (lv_partyName_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_partyName_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_partyName_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )? )? )? ) ;
    public final EObject rulePartyName() throws RecognitionException {
        EObject current = null;

        Token lv_partyName_0_0=null;
        Token this_COLON_1=null;
        Token lv_partyName_2_0=null;
        Token this_COLON_3=null;
        Token lv_partyName_4_0=null;
        Token this_COLON_5=null;
        Token lv_partyName_6_0=null;
        Token this_COLON_7=null;
        Token lv_partyName_8_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5638:2: ( ( ( (lv_partyName_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_partyName_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_partyName_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )? )? )? ) )
            // InternalEdilang.g:5639:2: ( ( (lv_partyName_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_partyName_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_partyName_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )? )? )? )
            {
            // InternalEdilang.g:5639:2: ( ( (lv_partyName_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_partyName_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_partyName_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )? )? )? )
            // InternalEdilang.g:5640:3: ( (lv_partyName_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_partyName_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_partyName_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )? )? )?
            {
            // InternalEdilang.g:5640:3: ( (lv_partyName_0_0= RULE_ID ) )
            // InternalEdilang.g:5641:4: (lv_partyName_0_0= RULE_ID )
            {
            // InternalEdilang.g:5641:4: (lv_partyName_0_0= RULE_ID )
            // InternalEdilang.g:5642:5: lv_partyName_0_0= RULE_ID
            {
            lv_partyName_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_partyName_0_0, grammarAccess.getPartyNameAccess().getPartyNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartyNameRule());
            					}
            					addWithLastConsumed(
            						current,
            						"partyName",
            						lv_partyName_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:5658:3: (this_COLON_1= RULE_COLON ( (lv_partyName_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_partyName_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )? )? )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==RULE_COLON) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalEdilang.g:5659:4: this_COLON_1= RULE_COLON ( (lv_partyName_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_partyName_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )? )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getPartyNameAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:5663:4: ( (lv_partyName_2_0= RULE_ID ) )
                    // InternalEdilang.g:5664:5: (lv_partyName_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:5664:5: (lv_partyName_2_0= RULE_ID )
                    // InternalEdilang.g:5665:6: lv_partyName_2_0= RULE_ID
                    {
                    lv_partyName_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_partyName_2_0, grammarAccess.getPartyNameAccess().getPartyNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPartyNameRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"partyName",
                    							lv_partyName_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:5681:4: (this_COLON_3= RULE_COLON ( (lv_partyName_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )? )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==RULE_COLON) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // InternalEdilang.g:5682:5: this_COLON_3= RULE_COLON ( (lv_partyName_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )?
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getPartyNameAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:5686:5: ( (lv_partyName_4_0= RULE_ID ) )
                            // InternalEdilang.g:5687:6: (lv_partyName_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:5687:6: (lv_partyName_4_0= RULE_ID )
                            // InternalEdilang.g:5688:7: lv_partyName_4_0= RULE_ID
                            {
                            lv_partyName_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_partyName_4_0, grammarAccess.getPartyNameAccess().getPartyNameIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPartyNameRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"partyName",
                            								lv_partyName_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:5704:5: (this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )? )?
                            int alt144=2;
                            int LA144_0 = input.LA(1);

                            if ( (LA144_0==RULE_COLON) ) {
                                alt144=1;
                            }
                            switch (alt144) {
                                case 1 :
                                    // InternalEdilang.g:5705:6: this_COLON_5= RULE_COLON ( (lv_partyName_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )?
                                    {
                                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_5, grammarAccess.getPartyNameAccess().getCOLONTerminalRuleCall_1_2_2_0());
                                    					
                                    // InternalEdilang.g:5709:6: ( (lv_partyName_6_0= RULE_ID ) )
                                    // InternalEdilang.g:5710:7: (lv_partyName_6_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:5710:7: (lv_partyName_6_0= RULE_ID )
                                    // InternalEdilang.g:5711:8: lv_partyName_6_0= RULE_ID
                                    {
                                    lv_partyName_6_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                                    								newLeafNode(lv_partyName_6_0, grammarAccess.getPartyNameAccess().getPartyNameIDTerminalRuleCall_1_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getPartyNameRule());
                                    								}
                                    								addWithLastConsumed(
                                    									current,
                                    									"partyName",
                                    									lv_partyName_6_0,
                                    									"io.thlaegler.edifact.Edilang.ID");
                                    							

                                    }


                                    }

                                    // InternalEdilang.g:5727:6: (this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) ) )?
                                    int alt143=2;
                                    int LA143_0 = input.LA(1);

                                    if ( (LA143_0==RULE_COLON) ) {
                                        alt143=1;
                                    }
                                    switch (alt143) {
                                        case 1 :
                                            // InternalEdilang.g:5728:7: this_COLON_7= RULE_COLON ( (lv_partyName_8_0= RULE_ID ) )
                                            {
                                            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                            							newLeafNode(this_COLON_7, grammarAccess.getPartyNameAccess().getCOLONTerminalRuleCall_1_2_2_2_0());
                                            						
                                            // InternalEdilang.g:5732:7: ( (lv_partyName_8_0= RULE_ID ) )
                                            // InternalEdilang.g:5733:8: (lv_partyName_8_0= RULE_ID )
                                            {
                                            // InternalEdilang.g:5733:8: (lv_partyName_8_0= RULE_ID )
                                            // InternalEdilang.g:5734:9: lv_partyName_8_0= RULE_ID
                                            {
                                            lv_partyName_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                                            									newLeafNode(lv_partyName_8_0, grammarAccess.getPartyNameAccess().getPartyNameIDTerminalRuleCall_1_2_2_2_1_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getPartyNameRule());
                                            									}
                                            									addWithLastConsumed(
                                            										current,
                                            										"partyName",
                                            										lv_partyName_8_0,
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
    // $ANTLR end "rulePartyName"


    // $ANTLR start "entryRuleNameAndAddress"
    // InternalEdilang.g:5758:1: entryRuleNameAndAddress returns [EObject current=null] : iv_ruleNameAndAddress= ruleNameAndAddress EOF ;
    public final EObject entryRuleNameAndAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAndAddress = null;


        try {
            // InternalEdilang.g:5758:55: (iv_ruleNameAndAddress= ruleNameAndAddress EOF )
            // InternalEdilang.g:5759:2: iv_ruleNameAndAddress= ruleNameAndAddress EOF
            {
             newCompositeNode(grammarAccess.getNameAndAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameAndAddress=ruleNameAndAddress();

            state._fsp--;

             current =iv_ruleNameAndAddress; 
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
    // $ANTLR end "entryRuleNameAndAddress"


    // $ANTLR start "ruleNameAndAddress"
    // InternalEdilang.g:5765:1: ruleNameAndAddress returns [EObject current=null] : ( ( (lv_nameAndAddress_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_nameAndAddress_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_nameAndAddress_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )? )? )? ) ;
    public final EObject ruleNameAndAddress() throws RecognitionException {
        EObject current = null;

        Token lv_nameAndAddress_0_0=null;
        Token this_COLON_1=null;
        Token lv_nameAndAddress_2_0=null;
        Token this_COLON_3=null;
        Token lv_nameAndAddress_4_0=null;
        Token this_COLON_5=null;
        Token lv_nameAndAddress_6_0=null;
        Token this_COLON_7=null;
        Token lv_nameAndAddress_8_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5771:2: ( ( ( (lv_nameAndAddress_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_nameAndAddress_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_nameAndAddress_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )? )? )? ) )
            // InternalEdilang.g:5772:2: ( ( (lv_nameAndAddress_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_nameAndAddress_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_nameAndAddress_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )? )? )? )
            {
            // InternalEdilang.g:5772:2: ( ( (lv_nameAndAddress_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_nameAndAddress_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_nameAndAddress_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )? )? )? )
            // InternalEdilang.g:5773:3: ( (lv_nameAndAddress_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_nameAndAddress_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_nameAndAddress_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )? )? )?
            {
            // InternalEdilang.g:5773:3: ( (lv_nameAndAddress_0_0= RULE_ID ) )
            // InternalEdilang.g:5774:4: (lv_nameAndAddress_0_0= RULE_ID )
            {
            // InternalEdilang.g:5774:4: (lv_nameAndAddress_0_0= RULE_ID )
            // InternalEdilang.g:5775:5: lv_nameAndAddress_0_0= RULE_ID
            {
            lv_nameAndAddress_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_nameAndAddress_0_0, grammarAccess.getNameAndAddressAccess().getNameAndAddressIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameAndAddressRule());
            					}
            					addWithLastConsumed(
            						current,
            						"nameAndAddress",
            						lv_nameAndAddress_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:5791:3: (this_COLON_1= RULE_COLON ( (lv_nameAndAddress_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_nameAndAddress_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )? )? )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==RULE_COLON) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalEdilang.g:5792:4: this_COLON_1= RULE_COLON ( (lv_nameAndAddress_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_nameAndAddress_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )? )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getNameAndAddressAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:5796:4: ( (lv_nameAndAddress_2_0= RULE_ID ) )
                    // InternalEdilang.g:5797:5: (lv_nameAndAddress_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:5797:5: (lv_nameAndAddress_2_0= RULE_ID )
                    // InternalEdilang.g:5798:6: lv_nameAndAddress_2_0= RULE_ID
                    {
                    lv_nameAndAddress_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_nameAndAddress_2_0, grammarAccess.getNameAndAddressAccess().getNameAndAddressIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNameAndAddressRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"nameAndAddress",
                    							lv_nameAndAddress_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:5814:4: (this_COLON_3= RULE_COLON ( (lv_nameAndAddress_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )? )?
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==RULE_COLON) ) {
                        alt149=1;
                    }
                    switch (alt149) {
                        case 1 :
                            // InternalEdilang.g:5815:5: this_COLON_3= RULE_COLON ( (lv_nameAndAddress_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )?
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getNameAndAddressAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:5819:5: ( (lv_nameAndAddress_4_0= RULE_ID ) )
                            // InternalEdilang.g:5820:6: (lv_nameAndAddress_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:5820:6: (lv_nameAndAddress_4_0= RULE_ID )
                            // InternalEdilang.g:5821:7: lv_nameAndAddress_4_0= RULE_ID
                            {
                            lv_nameAndAddress_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_nameAndAddress_4_0, grammarAccess.getNameAndAddressAccess().getNameAndAddressIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNameAndAddressRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"nameAndAddress",
                            								lv_nameAndAddress_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:5837:5: (this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )? )?
                            int alt148=2;
                            int LA148_0 = input.LA(1);

                            if ( (LA148_0==RULE_COLON) ) {
                                alt148=1;
                            }
                            switch (alt148) {
                                case 1 :
                                    // InternalEdilang.g:5838:6: this_COLON_5= RULE_COLON ( (lv_nameAndAddress_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )?
                                    {
                                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_5, grammarAccess.getNameAndAddressAccess().getCOLONTerminalRuleCall_1_2_2_0());
                                    					
                                    // InternalEdilang.g:5842:6: ( (lv_nameAndAddress_6_0= RULE_ID ) )
                                    // InternalEdilang.g:5843:7: (lv_nameAndAddress_6_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:5843:7: (lv_nameAndAddress_6_0= RULE_ID )
                                    // InternalEdilang.g:5844:8: lv_nameAndAddress_6_0= RULE_ID
                                    {
                                    lv_nameAndAddress_6_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                                    								newLeafNode(lv_nameAndAddress_6_0, grammarAccess.getNameAndAddressAccess().getNameAndAddressIDTerminalRuleCall_1_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getNameAndAddressRule());
                                    								}
                                    								addWithLastConsumed(
                                    									current,
                                    									"nameAndAddress",
                                    									lv_nameAndAddress_6_0,
                                    									"io.thlaegler.edifact.Edilang.ID");
                                    							

                                    }


                                    }

                                    // InternalEdilang.g:5860:6: (this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) ) )?
                                    int alt147=2;
                                    int LA147_0 = input.LA(1);

                                    if ( (LA147_0==RULE_COLON) ) {
                                        alt147=1;
                                    }
                                    switch (alt147) {
                                        case 1 :
                                            // InternalEdilang.g:5861:7: this_COLON_7= RULE_COLON ( (lv_nameAndAddress_8_0= RULE_ID ) )
                                            {
                                            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                            							newLeafNode(this_COLON_7, grammarAccess.getNameAndAddressAccess().getCOLONTerminalRuleCall_1_2_2_2_0());
                                            						
                                            // InternalEdilang.g:5865:7: ( (lv_nameAndAddress_8_0= RULE_ID ) )
                                            // InternalEdilang.g:5866:8: (lv_nameAndAddress_8_0= RULE_ID )
                                            {
                                            // InternalEdilang.g:5866:8: (lv_nameAndAddress_8_0= RULE_ID )
                                            // InternalEdilang.g:5867:9: lv_nameAndAddress_8_0= RULE_ID
                                            {
                                            lv_nameAndAddress_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                                            									newLeafNode(lv_nameAndAddress_8_0, grammarAccess.getNameAndAddressAccess().getNameAndAddressIDTerminalRuleCall_1_2_2_2_1_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getNameAndAddressRule());
                                            									}
                                            									addWithLastConsumed(
                                            										current,
                                            										"nameAndAddress",
                                            										lv_nameAndAddress_8_0,
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
    // $ANTLR end "ruleNameAndAddress"


    // $ANTLR start "entryRulePartyIdentificationDetail"
    // InternalEdilang.g:5891:1: entryRulePartyIdentificationDetail returns [EObject current=null] : iv_rulePartyIdentificationDetail= rulePartyIdentificationDetail EOF ;
    public final EObject entryRulePartyIdentificationDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartyIdentificationDetail = null;


        try {
            // InternalEdilang.g:5891:66: (iv_rulePartyIdentificationDetail= rulePartyIdentificationDetail EOF )
            // InternalEdilang.g:5892:2: iv_rulePartyIdentificationDetail= rulePartyIdentificationDetail EOF
            {
             newCompositeNode(grammarAccess.getPartyIdentificationDetailRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartyIdentificationDetail=rulePartyIdentificationDetail();

            state._fsp--;

             current =iv_rulePartyIdentificationDetail; 
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
    // $ANTLR end "entryRulePartyIdentificationDetail"


    // $ANTLR start "rulePartyIdentificationDetail"
    // InternalEdilang.g:5898:1: rulePartyIdentificationDetail returns [EObject current=null] : ( ( (lv_partyIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject rulePartyIdentificationDetail() throws RecognitionException {
        EObject current = null;

        Token lv_partyIdentifier_0_0=null;
        Token this_COLON_1=null;
        Token lv_codeListIdentificationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListResponsibleAgencyCode_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5904:2: ( ( ( (lv_partyIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:5905:2: ( ( (lv_partyIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:5905:2: ( ( (lv_partyIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:5906:3: ( (lv_partyIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:5906:3: ( (lv_partyIdentifier_0_0= RULE_ID ) )
            // InternalEdilang.g:5907:4: (lv_partyIdentifier_0_0= RULE_ID )
            {
            // InternalEdilang.g:5907:4: (lv_partyIdentifier_0_0= RULE_ID )
            // InternalEdilang.g:5908:5: lv_partyIdentifier_0_0= RULE_ID
            {
            lv_partyIdentifier_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_partyIdentifier_0_0, grammarAccess.getPartyIdentificationDetailAccess().getPartyIdentifierIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartyIdentificationDetailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"partyIdentifier",
            						lv_partyIdentifier_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:5924:3: (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==RULE_COLON) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalEdilang.g:5925:4: this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_21); 

                    				newLeafNode(this_COLON_1, grammarAccess.getPartyIdentificationDetailAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:5929:4: ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )?
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==RULE_ID) ) {
                        alt151=1;
                    }
                    switch (alt151) {
                        case 1 :
                            // InternalEdilang.g:5930:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                            {
                            // InternalEdilang.g:5930:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                            // InternalEdilang.g:5931:6: lv_codeListIdentificationCode_2_0= RULE_ID
                            {
                            lv_codeListIdentificationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            						newLeafNode(lv_codeListIdentificationCode_2_0, grammarAccess.getPartyIdentificationDetailAccess().getCodeListIdentificationCodeIDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPartyIdentificationDetailRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"codeListIdentificationCode",
                            							lv_codeListIdentificationCode_2_0,
                            							"io.thlaegler.edifact.Edilang.ID");
                            					

                            }


                            }
                            break;

                    }

                    // InternalEdilang.g:5947:4: (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )?
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==RULE_COLON) ) {
                        alt152=1;
                    }
                    switch (alt152) {
                        case 1 :
                            // InternalEdilang.g:5948:5: this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getPartyIdentificationDetailAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:5952:5: ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:5953:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:5953:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            // InternalEdilang.g:5954:7: lv_codeListResponsibleAgencyCode_4_0= RULE_ID
                            {
                            lv_codeListResponsibleAgencyCode_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_codeListResponsibleAgencyCode_4_0, grammarAccess.getPartyIdentificationDetailAccess().getCodeListResponsibleAgencyCodeIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPartyIdentificationDetailRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"codeListResponsibleAgencyCode",
                            								lv_codeListResponsibleAgencyCode_4_0,
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
    // $ANTLR end "rulePartyIdentificationDetail"


    // $ANTLR start "entryRuleApplicationErrorDetail"
    // InternalEdilang.g:5976:1: entryRuleApplicationErrorDetail returns [EObject current=null] : iv_ruleApplicationErrorDetail= ruleApplicationErrorDetail EOF ;
    public final EObject entryRuleApplicationErrorDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationErrorDetail = null;


        try {
            // InternalEdilang.g:5976:63: (iv_ruleApplicationErrorDetail= ruleApplicationErrorDetail EOF )
            // InternalEdilang.g:5977:2: iv_ruleApplicationErrorDetail= ruleApplicationErrorDetail EOF
            {
             newCompositeNode(grammarAccess.getApplicationErrorDetailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationErrorDetail=ruleApplicationErrorDetail();

            state._fsp--;

             current =iv_ruleApplicationErrorDetail; 
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
    // $ANTLR end "entryRuleApplicationErrorDetail"


    // $ANTLR start "ruleApplicationErrorDetail"
    // InternalEdilang.g:5983:1: ruleApplicationErrorDetail returns [EObject current=null] : ( ( (lv_applictionErrorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleApplicationErrorDetail() throws RecognitionException {
        EObject current = null;

        Token lv_applictionErrorCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_codeListIdentificationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListResponsibleAgencyCode_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:5989:2: ( ( ( (lv_applictionErrorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:5990:2: ( ( (lv_applictionErrorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:5990:2: ( ( (lv_applictionErrorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:5991:3: ( (lv_applictionErrorCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:5991:3: ( (lv_applictionErrorCode_0_0= RULE_ID ) )
            // InternalEdilang.g:5992:4: (lv_applictionErrorCode_0_0= RULE_ID )
            {
            // InternalEdilang.g:5992:4: (lv_applictionErrorCode_0_0= RULE_ID )
            // InternalEdilang.g:5993:5: lv_applictionErrorCode_0_0= RULE_ID
            {
            lv_applictionErrorCode_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_applictionErrorCode_0_0, grammarAccess.getApplicationErrorDetailAccess().getApplictionErrorCodeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationErrorDetailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applictionErrorCode",
            						lv_applictionErrorCode_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:6009:3: (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==RULE_COLON) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalEdilang.g:6010:4: this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getApplicationErrorDetailAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:6014:4: ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:6015:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:6015:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    // InternalEdilang.g:6016:6: lv_codeListIdentificationCode_2_0= RULE_ID
                    {
                    lv_codeListIdentificationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_codeListIdentificationCode_2_0, grammarAccess.getApplicationErrorDetailAccess().getCodeListIdentificationCodeIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getApplicationErrorDetailRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"codeListIdentificationCode",
                    							lv_codeListIdentificationCode_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:6032:4: (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )?
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==RULE_COLON) ) {
                        alt154=1;
                    }
                    switch (alt154) {
                        case 1 :
                            // InternalEdilang.g:6033:5: this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getApplicationErrorDetailAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:6037:5: ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:6038:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:6038:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            // InternalEdilang.g:6039:7: lv_codeListResponsibleAgencyCode_4_0= RULE_ID
                            {
                            lv_codeListResponsibleAgencyCode_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_codeListResponsibleAgencyCode_4_0, grammarAccess.getApplicationErrorDetailAccess().getCodeListResponsibleAgencyCodeIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getApplicationErrorDetailRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"codeListResponsibleAgencyCode",
                            								lv_codeListResponsibleAgencyCode_4_0,
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
    // $ANTLR end "ruleApplicationErrorDetail"


    // $ANTLR start "entryRuleSystemDetailFunction"
    // InternalEdilang.g:6061:1: entryRuleSystemDetailFunction returns [EObject current=null] : iv_ruleSystemDetailFunction= ruleSystemDetailFunction EOF ;
    public final EObject entryRuleSystemDetailFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDetailFunction = null;


        try {
            // InternalEdilang.g:6061:61: (iv_ruleSystemDetailFunction= ruleSystemDetailFunction EOF )
            // InternalEdilang.g:6062:2: iv_ruleSystemDetailFunction= ruleSystemDetailFunction EOF
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
    // InternalEdilang.g:6068:1: ruleSystemDetailFunction returns [EObject current=null] : ( ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleSystemDetailFunction() throws RecognitionException {
        EObject current = null;

        Token lv_companyIdentification_0_0=null;
        Token this_COLON_1=null;
        Token lv_locationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_locationName_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:6074:2: ( ( ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:6075:2: ( ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:6075:2: ( ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:6076:3: ( (lv_companyIdentification_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:6076:3: ( (lv_companyIdentification_0_0= RULE_ID ) )
            // InternalEdilang.g:6077:4: (lv_companyIdentification_0_0= RULE_ID )
            {
            // InternalEdilang.g:6077:4: (lv_companyIdentification_0_0= RULE_ID )
            // InternalEdilang.g:6078:5: lv_companyIdentification_0_0= RULE_ID
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

            // InternalEdilang.g:6094:3: (this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )? )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==RULE_COLON) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalEdilang.g:6095:4: this_COLON_1= RULE_COLON ( (lv_locationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getSystemDetailFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:6099:4: ( (lv_locationCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:6100:5: (lv_locationCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:6100:5: (lv_locationCode_2_0= RULE_ID )
                    // InternalEdilang.g:6101:6: lv_locationCode_2_0= RULE_ID
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

                    // InternalEdilang.g:6117:4: (this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) ) )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==RULE_COLON) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // InternalEdilang.g:6118:5: this_COLON_3= RULE_COLON ( (lv_locationName_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getSystemDetailFunctionAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:6122:5: ( (lv_locationName_4_0= RULE_ID ) )
                            // InternalEdilang.g:6123:6: (lv_locationName_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:6123:6: (lv_locationName_4_0= RULE_ID )
                            // InternalEdilang.g:6124:7: lv_locationName_4_0= RULE_ID
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


    // $ANTLR start "entryRuleTaxDetail"
    // InternalEdilang.g:6146:1: entryRuleTaxDetail returns [EObject current=null] : iv_ruleTaxDetail= ruleTaxDetail EOF ;
    public final EObject entryRuleTaxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaxDetail = null;


        try {
            // InternalEdilang.g:6146:50: (iv_ruleTaxDetail= ruleTaxDetail EOF )
            // InternalEdilang.g:6147:2: iv_ruleTaxDetail= ruleTaxDetail EOF
            {
             newCompositeNode(grammarAccess.getTaxDetailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaxDetail=ruleTaxDetail();

            state._fsp--;

             current =iv_ruleTaxDetail; 
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
    // $ANTLR end "entryRuleTaxDetail"


    // $ANTLR start "ruleTaxDetail"
    // InternalEdilang.g:6153:1: ruleTaxDetail returns [EObject current=null] : ( ( (lv_taxRateDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode1_4_0= RULE_ID ) )? (this_COLON_5= RULE_COLON ( (lv_taxRateDescription_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_taxRateBasisCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )? )? )? ) ;
    public final EObject ruleTaxDetail() throws RecognitionException {
        EObject current = null;

        Token lv_taxRateDescriptionCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_codeListIdentificationCode1_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListResponsibleAgencyCode1_4_0=null;
        Token this_COLON_5=null;
        Token lv_taxRateDescription_6_0=null;
        Token this_COLON_7=null;
        Token lv_taxRateBasisCode_8_0=null;
        Token this_COLON_9=null;
        Token lv_codeListIdentificationCode2_10_0=null;
        Token this_COLON_11=null;
        Token lv_codeListResponsibleAgencyCode2_12_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:6159:2: ( ( ( (lv_taxRateDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode1_4_0= RULE_ID ) )? (this_COLON_5= RULE_COLON ( (lv_taxRateDescription_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_taxRateBasisCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )? )? )? ) )
            // InternalEdilang.g:6160:2: ( ( (lv_taxRateDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode1_4_0= RULE_ID ) )? (this_COLON_5= RULE_COLON ( (lv_taxRateDescription_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_taxRateBasisCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )? )? )? )
            {
            // InternalEdilang.g:6160:2: ( ( (lv_taxRateDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode1_4_0= RULE_ID ) )? (this_COLON_5= RULE_COLON ( (lv_taxRateDescription_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_taxRateBasisCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )? )? )? )
            // InternalEdilang.g:6161:3: ( (lv_taxRateDescriptionCode_0_0= RULE_ID ) )? this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode1_2_0= RULE_ID ) )? this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode1_4_0= RULE_ID ) )? (this_COLON_5= RULE_COLON ( (lv_taxRateDescription_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_taxRateBasisCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )? )? )?
            {
            // InternalEdilang.g:6161:3: ( (lv_taxRateDescriptionCode_0_0= RULE_ID ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==RULE_ID) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalEdilang.g:6162:4: (lv_taxRateDescriptionCode_0_0= RULE_ID )
                    {
                    // InternalEdilang.g:6162:4: (lv_taxRateDescriptionCode_0_0= RULE_ID )
                    // InternalEdilang.g:6163:5: lv_taxRateDescriptionCode_0_0= RULE_ID
                    {
                    lv_taxRateDescriptionCode_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_taxRateDescriptionCode_0_0, grammarAccess.getTaxDetailAccess().getTaxRateDescriptionCodeIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaxDetailRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"taxRateDescriptionCode",
                    						lv_taxRateDescriptionCode_0_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_15); 

            			newLeafNode(this_COLON_1, grammarAccess.getTaxDetailAccess().getCOLONTerminalRuleCall_1());
            		
            // InternalEdilang.g:6183:3: ( (lv_codeListIdentificationCode1_2_0= RULE_ID ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==RULE_ID) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalEdilang.g:6184:4: (lv_codeListIdentificationCode1_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:6184:4: (lv_codeListIdentificationCode1_2_0= RULE_ID )
                    // InternalEdilang.g:6185:5: lv_codeListIdentificationCode1_2_0= RULE_ID
                    {
                    lv_codeListIdentificationCode1_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_codeListIdentificationCode1_2_0, grammarAccess.getTaxDetailAccess().getCodeListIdentificationCode1IDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaxDetailRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"codeListIdentificationCode1",
                    						lv_codeListIdentificationCode1_2_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_21); 

            			newLeafNode(this_COLON_3, grammarAccess.getTaxDetailAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalEdilang.g:6205:3: ( (lv_codeListResponsibleAgencyCode1_4_0= RULE_ID ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==RULE_ID) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalEdilang.g:6206:4: (lv_codeListResponsibleAgencyCode1_4_0= RULE_ID )
                    {
                    // InternalEdilang.g:6206:4: (lv_codeListResponsibleAgencyCode1_4_0= RULE_ID )
                    // InternalEdilang.g:6207:5: lv_codeListResponsibleAgencyCode1_4_0= RULE_ID
                    {
                    lv_codeListResponsibleAgencyCode1_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    					newLeafNode(lv_codeListResponsibleAgencyCode1_4_0, grammarAccess.getTaxDetailAccess().getCodeListResponsibleAgencyCode1IDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaxDetailRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"codeListResponsibleAgencyCode1",
                    						lv_codeListResponsibleAgencyCode1_4_0,
                    						"io.thlaegler.edifact.Edilang.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEdilang.g:6223:3: (this_COLON_5= RULE_COLON ( (lv_taxRateDescription_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_taxRateBasisCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )? )? )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==RULE_COLON) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalEdilang.g:6224:4: this_COLON_5= RULE_COLON ( (lv_taxRateDescription_6_0= RULE_ID ) ) (this_COLON_7= RULE_COLON ( (lv_taxRateBasisCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )? )?
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_5, grammarAccess.getTaxDetailAccess().getCOLONTerminalRuleCall_5_0());
                    			
                    // InternalEdilang.g:6228:4: ( (lv_taxRateDescription_6_0= RULE_ID ) )
                    // InternalEdilang.g:6229:5: (lv_taxRateDescription_6_0= RULE_ID )
                    {
                    // InternalEdilang.g:6229:5: (lv_taxRateDescription_6_0= RULE_ID )
                    // InternalEdilang.g:6230:6: lv_taxRateDescription_6_0= RULE_ID
                    {
                    lv_taxRateDescription_6_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_taxRateDescription_6_0, grammarAccess.getTaxDetailAccess().getTaxRateDescriptionIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaxDetailRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"taxRateDescription",
                    							lv_taxRateDescription_6_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:6246:4: (this_COLON_7= RULE_COLON ( (lv_taxRateBasisCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )? )?
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==RULE_COLON) ) {
                        alt163=1;
                    }
                    switch (alt163) {
                        case 1 :
                            // InternalEdilang.g:6247:5: this_COLON_7= RULE_COLON ( (lv_taxRateBasisCode_8_0= RULE_ID ) ) (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )?
                            {
                            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_7, grammarAccess.getTaxDetailAccess().getCOLONTerminalRuleCall_5_2_0());
                            				
                            // InternalEdilang.g:6251:5: ( (lv_taxRateBasisCode_8_0= RULE_ID ) )
                            // InternalEdilang.g:6252:6: (lv_taxRateBasisCode_8_0= RULE_ID )
                            {
                            // InternalEdilang.g:6252:6: (lv_taxRateBasisCode_8_0= RULE_ID )
                            // InternalEdilang.g:6253:7: lv_taxRateBasisCode_8_0= RULE_ID
                            {
                            lv_taxRateBasisCode_8_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_taxRateBasisCode_8_0, grammarAccess.getTaxDetailAccess().getTaxRateBasisCodeIDTerminalRuleCall_5_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTaxDetailRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"taxRateBasisCode",
                            								lv_taxRateBasisCode_8_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:6269:5: (this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )? )?
                            int alt162=2;
                            int LA162_0 = input.LA(1);

                            if ( (LA162_0==RULE_COLON) ) {
                                alt162=1;
                            }
                            switch (alt162) {
                                case 1 :
                                    // InternalEdilang.g:6270:6: this_COLON_9= RULE_COLON ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) ) (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )?
                                    {
                                    this_COLON_9=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_9, grammarAccess.getTaxDetailAccess().getCOLONTerminalRuleCall_5_2_2_0());
                                    					
                                    // InternalEdilang.g:6274:6: ( (lv_codeListIdentificationCode2_10_0= RULE_ID ) )
                                    // InternalEdilang.g:6275:7: (lv_codeListIdentificationCode2_10_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:6275:7: (lv_codeListIdentificationCode2_10_0= RULE_ID )
                                    // InternalEdilang.g:6276:8: lv_codeListIdentificationCode2_10_0= RULE_ID
                                    {
                                    lv_codeListIdentificationCode2_10_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                                    								newLeafNode(lv_codeListIdentificationCode2_10_0, grammarAccess.getTaxDetailAccess().getCodeListIdentificationCode2IDTerminalRuleCall_5_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getTaxDetailRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"codeListIdentificationCode2",
                                    									lv_codeListIdentificationCode2_10_0,
                                    									"io.thlaegler.edifact.Edilang.ID");
                                    							

                                    }


                                    }

                                    // InternalEdilang.g:6292:6: (this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) ) )?
                                    int alt161=2;
                                    int LA161_0 = input.LA(1);

                                    if ( (LA161_0==RULE_COLON) ) {
                                        alt161=1;
                                    }
                                    switch (alt161) {
                                        case 1 :
                                            // InternalEdilang.g:6293:7: this_COLON_11= RULE_COLON ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) )
                                            {
                                            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                            							newLeafNode(this_COLON_11, grammarAccess.getTaxDetailAccess().getCOLONTerminalRuleCall_5_2_2_2_0());
                                            						
                                            // InternalEdilang.g:6297:7: ( (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID ) )
                                            // InternalEdilang.g:6298:8: (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID )
                                            {
                                            // InternalEdilang.g:6298:8: (lv_codeListResponsibleAgencyCode2_12_0= RULE_ID )
                                            // InternalEdilang.g:6299:9: lv_codeListResponsibleAgencyCode2_12_0= RULE_ID
                                            {
                                            lv_codeListResponsibleAgencyCode2_12_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                                            									newLeafNode(lv_codeListResponsibleAgencyCode2_12_0, grammarAccess.getTaxDetailAccess().getCodeListResponsibleAgencyCode2IDTerminalRuleCall_5_2_2_2_1_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getTaxDetailRule());
                                            									}
                                            									setWithLastConsumed(
                                            										current,
                                            										"codeListResponsibleAgencyCode2",
                                            										lv_codeListResponsibleAgencyCode2_12_0,
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
    // $ANTLR end "ruleTaxDetail"


    // $ANTLR start "entryRuleTaxAccountDetail"
    // InternalEdilang.g:6323:1: entryRuleTaxAccountDetail returns [EObject current=null] : iv_ruleTaxAccountDetail= ruleTaxAccountDetail EOF ;
    public final EObject entryRuleTaxAccountDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaxAccountDetail = null;


        try {
            // InternalEdilang.g:6323:57: (iv_ruleTaxAccountDetail= ruleTaxAccountDetail EOF )
            // InternalEdilang.g:6324:2: iv_ruleTaxAccountDetail= ruleTaxAccountDetail EOF
            {
             newCompositeNode(grammarAccess.getTaxAccountDetailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaxAccountDetail=ruleTaxAccountDetail();

            state._fsp--;

             current =iv_ruleTaxAccountDetail; 
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
    // $ANTLR end "entryRuleTaxAccountDetail"


    // $ANTLR start "ruleTaxAccountDetail"
    // InternalEdilang.g:6330:1: ruleTaxAccountDetail returns [EObject current=null] : ( ( (lv_taxAccountCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleTaxAccountDetail() throws RecognitionException {
        EObject current = null;

        Token lv_taxAccountCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_codeListIdentificationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListResponsibleAgencyCode_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:6336:2: ( ( ( (lv_taxAccountCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:6337:2: ( ( (lv_taxAccountCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:6337:2: ( ( (lv_taxAccountCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:6338:3: ( (lv_taxAccountCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:6338:3: ( (lv_taxAccountCode_0_0= RULE_ID ) )
            // InternalEdilang.g:6339:4: (lv_taxAccountCode_0_0= RULE_ID )
            {
            // InternalEdilang.g:6339:4: (lv_taxAccountCode_0_0= RULE_ID )
            // InternalEdilang.g:6340:5: lv_taxAccountCode_0_0= RULE_ID
            {
            lv_taxAccountCode_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_taxAccountCode_0_0, grammarAccess.getTaxAccountDetailAccess().getTaxAccountCodeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaxAccountDetailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taxAccountCode",
            						lv_taxAccountCode_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:6356:3: (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )? )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==RULE_COLON) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalEdilang.g:6357:4: this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getTaxAccountDetailAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:6361:4: ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:6362:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:6362:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    // InternalEdilang.g:6363:6: lv_codeListIdentificationCode_2_0= RULE_ID
                    {
                    lv_codeListIdentificationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_codeListIdentificationCode_2_0, grammarAccess.getTaxAccountDetailAccess().getCodeListIdentificationCodeIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaxAccountDetailRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"codeListIdentificationCode",
                    							lv_codeListIdentificationCode_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:6379:4: (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==RULE_COLON) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // InternalEdilang.g:6380:5: this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getTaxAccountDetailAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:6384:5: ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:6385:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:6385:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            // InternalEdilang.g:6386:7: lv_codeListResponsibleAgencyCode_4_0= RULE_ID
                            {
                            lv_codeListResponsibleAgencyCode_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_codeListResponsibleAgencyCode_4_0, grammarAccess.getTaxAccountDetailAccess().getCodeListResponsibleAgencyCodeIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTaxAccountDetailRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"codeListResponsibleAgencyCode",
                            								lv_codeListResponsibleAgencyCode_4_0,
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
    // $ANTLR end "ruleTaxAccountDetail"


    // $ANTLR start "entryRuleTaxType"
    // InternalEdilang.g:6408:1: entryRuleTaxType returns [EObject current=null] : iv_ruleTaxType= ruleTaxType EOF ;
    public final EObject entryRuleTaxType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaxType = null;


        try {
            // InternalEdilang.g:6408:48: (iv_ruleTaxType= ruleTaxType EOF )
            // InternalEdilang.g:6409:2: iv_ruleTaxType= ruleTaxType EOF
            {
             newCompositeNode(grammarAccess.getTaxTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaxType=ruleTaxType();

            state._fsp--;

             current =iv_ruleTaxType; 
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
    // $ANTLR end "entryRuleTaxType"


    // $ANTLR start "ruleTaxType"
    // InternalEdilang.g:6415:1: ruleTaxType returns [EObject current=null] : ( ( (lv_taxTypeNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )? )? )? ) ;
    public final EObject ruleTaxType() throws RecognitionException {
        EObject current = null;

        Token lv_taxTypeNameCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_codeListIdentificationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListResponsibleAgencyCode_4_0=null;
        Token this_COLON_5=null;
        Token lv_taxTypeName_6_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:6421:2: ( ( ( (lv_taxTypeNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )? )? )? ) )
            // InternalEdilang.g:6422:2: ( ( (lv_taxTypeNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )? )? )? )
            {
            // InternalEdilang.g:6422:2: ( ( (lv_taxTypeNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )? )? )? )
            // InternalEdilang.g:6423:3: ( (lv_taxTypeNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )? )? )?
            {
            // InternalEdilang.g:6423:3: ( (lv_taxTypeNameCode_0_0= RULE_ID ) )
            // InternalEdilang.g:6424:4: (lv_taxTypeNameCode_0_0= RULE_ID )
            {
            // InternalEdilang.g:6424:4: (lv_taxTypeNameCode_0_0= RULE_ID )
            // InternalEdilang.g:6425:5: lv_taxTypeNameCode_0_0= RULE_ID
            {
            lv_taxTypeNameCode_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_taxTypeNameCode_0_0, grammarAccess.getTaxTypeAccess().getTaxTypeNameCodeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaxTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taxTypeNameCode",
            						lv_taxTypeNameCode_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:6441:3: (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )? )? )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==RULE_COLON) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalEdilang.g:6442:4: this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )? )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getTaxTypeAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:6446:4: ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:6447:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:6447:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    // InternalEdilang.g:6448:6: lv_codeListIdentificationCode_2_0= RULE_ID
                    {
                    lv_codeListIdentificationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_codeListIdentificationCode_2_0, grammarAccess.getTaxTypeAccess().getCodeListIdentificationCodeIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaxTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"codeListIdentificationCode",
                    							lv_codeListIdentificationCode_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:6464:4: (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )? )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==RULE_COLON) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // InternalEdilang.g:6465:5: this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )?
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getTaxTypeAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:6469:5: ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:6470:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:6470:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            // InternalEdilang.g:6471:7: lv_codeListResponsibleAgencyCode_4_0= RULE_ID
                            {
                            lv_codeListResponsibleAgencyCode_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_codeListResponsibleAgencyCode_4_0, grammarAccess.getTaxTypeAccess().getCodeListResponsibleAgencyCodeIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTaxTypeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"codeListResponsibleAgencyCode",
                            								lv_codeListResponsibleAgencyCode_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:6487:5: (this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) ) )?
                            int alt167=2;
                            int LA167_0 = input.LA(1);

                            if ( (LA167_0==RULE_COLON) ) {
                                alt167=1;
                            }
                            switch (alt167) {
                                case 1 :
                                    // InternalEdilang.g:6488:6: this_COLON_5= RULE_COLON ( (lv_taxTypeName_6_0= RULE_ID ) )
                                    {
                                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_5, grammarAccess.getTaxTypeAccess().getCOLONTerminalRuleCall_1_2_2_0());
                                    					
                                    // InternalEdilang.g:6492:6: ( (lv_taxTypeName_6_0= RULE_ID ) )
                                    // InternalEdilang.g:6493:7: (lv_taxTypeName_6_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:6493:7: (lv_taxTypeName_6_0= RULE_ID )
                                    // InternalEdilang.g:6494:8: lv_taxTypeName_6_0= RULE_ID
                                    {
                                    lv_taxTypeName_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                                    								newLeafNode(lv_taxTypeName_6_0, grammarAccess.getTaxTypeAccess().getTaxTypeNameIDTerminalRuleCall_1_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getTaxTypeRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"taxTypeName",
                                    									lv_taxTypeName_6_0,
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
    // $ANTLR end "ruleTaxType"


    // $ANTLR start "entryRuleCurrencyDetail"
    // InternalEdilang.g:6517:1: entryRuleCurrencyDetail returns [EObject current=null] : iv_ruleCurrencyDetail= ruleCurrencyDetail EOF ;
    public final EObject entryRuleCurrencyDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrencyDetail = null;


        try {
            // InternalEdilang.g:6517:55: (iv_ruleCurrencyDetail= ruleCurrencyDetail EOF )
            // InternalEdilang.g:6518:2: iv_ruleCurrencyDetail= ruleCurrencyDetail EOF
            {
             newCompositeNode(grammarAccess.getCurrencyDetailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCurrencyDetail=ruleCurrencyDetail();

            state._fsp--;

             current =iv_ruleCurrencyDetail; 
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
    // $ANTLR end "entryRuleCurrencyDetail"


    // $ANTLR start "ruleCurrencyDetail"
    // InternalEdilang.g:6524:1: ruleCurrencyDetail returns [EObject current=null] : ( ( (lv_currencyUsageCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )? )? )? ) ;
    public final EObject ruleCurrencyDetail() throws RecognitionException {
        EObject current = null;

        Token lv_currencyUsageCodeQualifier_0_0=null;
        Token this_COLON_1=null;
        Token lv_currencyIdentificationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_currencyTypeCodeQualifier_4_0=null;
        Token this_COLON_5=null;
        Token lv_currencyRateValue_6_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:6530:2: ( ( ( (lv_currencyUsageCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )? )? )? ) )
            // InternalEdilang.g:6531:2: ( ( (lv_currencyUsageCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )? )? )? )
            {
            // InternalEdilang.g:6531:2: ( ( (lv_currencyUsageCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )? )? )? )
            // InternalEdilang.g:6532:3: ( (lv_currencyUsageCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )? )? )?
            {
            // InternalEdilang.g:6532:3: ( (lv_currencyUsageCodeQualifier_0_0= RULE_ID ) )
            // InternalEdilang.g:6533:4: (lv_currencyUsageCodeQualifier_0_0= RULE_ID )
            {
            // InternalEdilang.g:6533:4: (lv_currencyUsageCodeQualifier_0_0= RULE_ID )
            // InternalEdilang.g:6534:5: lv_currencyUsageCodeQualifier_0_0= RULE_ID
            {
            lv_currencyUsageCodeQualifier_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_currencyUsageCodeQualifier_0_0, grammarAccess.getCurrencyDetailAccess().getCurrencyUsageCodeQualifierIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCurrencyDetailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"currencyUsageCodeQualifier",
            						lv_currencyUsageCodeQualifier_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:6550:3: (this_COLON_1= RULE_COLON ( (lv_currencyIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )? )? )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==RULE_COLON) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalEdilang.g:6551:4: this_COLON_1= RULE_COLON ( (lv_currencyIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )? )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getCurrencyDetailAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:6555:4: ( (lv_currencyIdentificationCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:6556:5: (lv_currencyIdentificationCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:6556:5: (lv_currencyIdentificationCode_2_0= RULE_ID )
                    // InternalEdilang.g:6557:6: lv_currencyIdentificationCode_2_0= RULE_ID
                    {
                    lv_currencyIdentificationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_currencyIdentificationCode_2_0, grammarAccess.getCurrencyDetailAccess().getCurrencyIdentificationCodeIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCurrencyDetailRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"currencyIdentificationCode",
                    							lv_currencyIdentificationCode_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:6573:4: (this_COLON_3= RULE_COLON ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )? )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==RULE_COLON) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // InternalEdilang.g:6574:5: this_COLON_3= RULE_COLON ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )?
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getCurrencyDetailAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:6578:5: ( (lv_currencyTypeCodeQualifier_4_0= RULE_ID ) )
                            // InternalEdilang.g:6579:6: (lv_currencyTypeCodeQualifier_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:6579:6: (lv_currencyTypeCodeQualifier_4_0= RULE_ID )
                            // InternalEdilang.g:6580:7: lv_currencyTypeCodeQualifier_4_0= RULE_ID
                            {
                            lv_currencyTypeCodeQualifier_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_currencyTypeCodeQualifier_4_0, grammarAccess.getCurrencyDetailAccess().getCurrencyTypeCodeQualifierIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCurrencyDetailRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"currencyTypeCodeQualifier",
                            								lv_currencyTypeCodeQualifier_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:6596:5: (this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) ) )?
                            int alt170=2;
                            int LA170_0 = input.LA(1);

                            if ( (LA170_0==RULE_COLON) ) {
                                alt170=1;
                            }
                            switch (alt170) {
                                case 1 :
                                    // InternalEdilang.g:6597:6: this_COLON_5= RULE_COLON ( (lv_currencyRateValue_6_0= RULE_ID ) )
                                    {
                                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_5, grammarAccess.getCurrencyDetailAccess().getCOLONTerminalRuleCall_1_2_2_0());
                                    					
                                    // InternalEdilang.g:6601:6: ( (lv_currencyRateValue_6_0= RULE_ID ) )
                                    // InternalEdilang.g:6602:7: (lv_currencyRateValue_6_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:6602:7: (lv_currencyRateValue_6_0= RULE_ID )
                                    // InternalEdilang.g:6603:8: lv_currencyRateValue_6_0= RULE_ID
                                    {
                                    lv_currencyRateValue_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                                    								newLeafNode(lv_currencyRateValue_6_0, grammarAccess.getCurrencyDetailAccess().getCurrencyRateValueIDTerminalRuleCall_1_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getCurrencyDetailRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"currencyRateValue",
                                    									lv_currencyRateValue_6_0,
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
    // $ANTLR end "ruleCurrencyDetail"


    // $ANTLR start "entryRuleDocumentMessageIdentification"
    // InternalEdilang.g:6626:1: entryRuleDocumentMessageIdentification returns [EObject current=null] : iv_ruleDocumentMessageIdentification= ruleDocumentMessageIdentification EOF ;
    public final EObject entryRuleDocumentMessageIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentMessageIdentification = null;


        try {
            // InternalEdilang.g:6626:70: (iv_ruleDocumentMessageIdentification= ruleDocumentMessageIdentification EOF )
            // InternalEdilang.g:6627:2: iv_ruleDocumentMessageIdentification= ruleDocumentMessageIdentification EOF
            {
             newCompositeNode(grammarAccess.getDocumentMessageIdentificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentMessageIdentification=ruleDocumentMessageIdentification();

            state._fsp--;

             current =iv_ruleDocumentMessageIdentification; 
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
    // $ANTLR end "entryRuleDocumentMessageIdentification"


    // $ANTLR start "ruleDocumentMessageIdentification"
    // InternalEdilang.g:6633:1: ruleDocumentMessageIdentification returns [EObject current=null] : ( ( (lv_documentIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_revisionIdentifier_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleDocumentMessageIdentification() throws RecognitionException {
        EObject current = null;

        Token lv_documentIdentifier_0_0=null;
        Token this_COLON_1=null;
        Token lv_versionIdentifier_2_0=null;
        Token this_COLON_3=null;
        Token lv_revisionIdentifier_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:6639:2: ( ( ( (lv_documentIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_revisionIdentifier_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:6640:2: ( ( (lv_documentIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_revisionIdentifier_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:6640:2: ( ( (lv_documentIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_revisionIdentifier_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:6641:3: ( (lv_documentIdentifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_revisionIdentifier_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:6641:3: ( (lv_documentIdentifier_0_0= RULE_ID ) )
            // InternalEdilang.g:6642:4: (lv_documentIdentifier_0_0= RULE_ID )
            {
            // InternalEdilang.g:6642:4: (lv_documentIdentifier_0_0= RULE_ID )
            // InternalEdilang.g:6643:5: lv_documentIdentifier_0_0= RULE_ID
            {
            lv_documentIdentifier_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_documentIdentifier_0_0, grammarAccess.getDocumentMessageIdentificationAccess().getDocumentIdentifierIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentMessageIdentificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"documentIdentifier",
            						lv_documentIdentifier_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:6659:3: (this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_revisionIdentifier_4_0= RULE_ID ) ) )? )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==RULE_COLON) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalEdilang.g:6660:4: this_COLON_1= RULE_COLON ( (lv_versionIdentifier_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_revisionIdentifier_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getDocumentMessageIdentificationAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:6664:4: ( (lv_versionIdentifier_2_0= RULE_ID ) )
                    // InternalEdilang.g:6665:5: (lv_versionIdentifier_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:6665:5: (lv_versionIdentifier_2_0= RULE_ID )
                    // InternalEdilang.g:6666:6: lv_versionIdentifier_2_0= RULE_ID
                    {
                    lv_versionIdentifier_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_versionIdentifier_2_0, grammarAccess.getDocumentMessageIdentificationAccess().getVersionIdentifierIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDocumentMessageIdentificationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"versionIdentifier",
                    							lv_versionIdentifier_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:6682:4: (this_COLON_3= RULE_COLON ( (lv_revisionIdentifier_4_0= RULE_ID ) ) )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==RULE_COLON) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // InternalEdilang.g:6683:5: this_COLON_3= RULE_COLON ( (lv_revisionIdentifier_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getDocumentMessageIdentificationAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:6687:5: ( (lv_revisionIdentifier_4_0= RULE_ID ) )
                            // InternalEdilang.g:6688:6: (lv_revisionIdentifier_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:6688:6: (lv_revisionIdentifier_4_0= RULE_ID )
                            // InternalEdilang.g:6689:7: lv_revisionIdentifier_4_0= RULE_ID
                            {
                            lv_revisionIdentifier_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_revisionIdentifier_4_0, grammarAccess.getDocumentMessageIdentificationAccess().getRevisionIdentifierIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDocumentMessageIdentificationRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"revisionIdentifier",
                            								lv_revisionIdentifier_4_0,
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
    // $ANTLR end "ruleDocumentMessageIdentification"


    // $ANTLR start "entryRuleDocumentMessage"
    // InternalEdilang.g:6711:1: entryRuleDocumentMessage returns [EObject current=null] : iv_ruleDocumentMessage= ruleDocumentMessage EOF ;
    public final EObject entryRuleDocumentMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentMessage = null;


        try {
            // InternalEdilang.g:6711:56: (iv_ruleDocumentMessage= ruleDocumentMessage EOF )
            // InternalEdilang.g:6712:2: iv_ruleDocumentMessage= ruleDocumentMessage EOF
            {
             newCompositeNode(grammarAccess.getDocumentMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentMessage=ruleDocumentMessage();

            state._fsp--;

             current =iv_ruleDocumentMessage; 
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
    // $ANTLR end "entryRuleDocumentMessage"


    // $ANTLR start "ruleDocumentMessage"
    // InternalEdilang.g:6718:1: ruleDocumentMessage returns [EObject current=null] : ( ( (lv_documentNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )? )? )? ) ;
    public final EObject ruleDocumentMessage() throws RecognitionException {
        EObject current = null;

        Token lv_documentNameCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_codeListIdentificationCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_codeListResponsibleAgencyCode_4_0=null;
        Token this_COLON_5=null;
        Token lv_documentName_6_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:6724:2: ( ( ( (lv_documentNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )? )? )? ) )
            // InternalEdilang.g:6725:2: ( ( (lv_documentNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )? )? )? )
            {
            // InternalEdilang.g:6725:2: ( ( (lv_documentNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )? )? )? )
            // InternalEdilang.g:6726:3: ( (lv_documentNameCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )? )? )?
            {
            // InternalEdilang.g:6726:3: ( (lv_documentNameCode_0_0= RULE_ID ) )
            // InternalEdilang.g:6727:4: (lv_documentNameCode_0_0= RULE_ID )
            {
            // InternalEdilang.g:6727:4: (lv_documentNameCode_0_0= RULE_ID )
            // InternalEdilang.g:6728:5: lv_documentNameCode_0_0= RULE_ID
            {
            lv_documentNameCode_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_documentNameCode_0_0, grammarAccess.getDocumentMessageAccess().getDocumentNameCodeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"documentNameCode",
            						lv_documentNameCode_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:6744:3: (this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )? )? )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==RULE_COLON) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // InternalEdilang.g:6745:4: this_COLON_1= RULE_COLON ( (lv_codeListIdentificationCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )? )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getDocumentMessageAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:6749:4: ( (lv_codeListIdentificationCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:6750:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:6750:5: (lv_codeListIdentificationCode_2_0= RULE_ID )
                    // InternalEdilang.g:6751:6: lv_codeListIdentificationCode_2_0= RULE_ID
                    {
                    lv_codeListIdentificationCode_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_codeListIdentificationCode_2_0, grammarAccess.getDocumentMessageAccess().getCodeListIdentificationCodeIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDocumentMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"codeListIdentificationCode",
                    							lv_codeListIdentificationCode_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:6767:4: (this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )? )?
                    int alt176=2;
                    int LA176_0 = input.LA(1);

                    if ( (LA176_0==RULE_COLON) ) {
                        alt176=1;
                    }
                    switch (alt176) {
                        case 1 :
                            // InternalEdilang.g:6768:5: this_COLON_3= RULE_COLON ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) ) (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )?
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getDocumentMessageAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:6772:5: ( (lv_codeListResponsibleAgencyCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:6773:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:6773:6: (lv_codeListResponsibleAgencyCode_4_0= RULE_ID )
                            // InternalEdilang.g:6774:7: lv_codeListResponsibleAgencyCode_4_0= RULE_ID
                            {
                            lv_codeListResponsibleAgencyCode_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_codeListResponsibleAgencyCode_4_0, grammarAccess.getDocumentMessageAccess().getCodeListResponsibleAgencyCodeIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDocumentMessageRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"codeListResponsibleAgencyCode",
                            								lv_codeListResponsibleAgencyCode_4_0,
                            								"io.thlaegler.edifact.Edilang.ID");
                            						

                            }


                            }

                            // InternalEdilang.g:6790:5: (this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) ) )?
                            int alt175=2;
                            int LA175_0 = input.LA(1);

                            if ( (LA175_0==RULE_COLON) ) {
                                alt175=1;
                            }
                            switch (alt175) {
                                case 1 :
                                    // InternalEdilang.g:6791:6: this_COLON_5= RULE_COLON ( (lv_documentName_6_0= RULE_ID ) )
                                    {
                                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); 

                                    						newLeafNode(this_COLON_5, grammarAccess.getDocumentMessageAccess().getCOLONTerminalRuleCall_1_2_2_0());
                                    					
                                    // InternalEdilang.g:6795:6: ( (lv_documentName_6_0= RULE_ID ) )
                                    // InternalEdilang.g:6796:7: (lv_documentName_6_0= RULE_ID )
                                    {
                                    // InternalEdilang.g:6796:7: (lv_documentName_6_0= RULE_ID )
                                    // InternalEdilang.g:6797:8: lv_documentName_6_0= RULE_ID
                                    {
                                    lv_documentName_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                                    								newLeafNode(lv_documentName_6_0, grammarAccess.getDocumentMessageAccess().getDocumentNameIDTerminalRuleCall_1_2_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getDocumentMessageRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"documentName",
                                    									lv_documentName_6_0,
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
    // $ANTLR end "ruleDocumentMessage"


    // $ANTLR start "entryRuleOriginatorFunction"
    // InternalEdilang.g:6820:1: entryRuleOriginatorFunction returns [EObject current=null] : iv_ruleOriginatorFunction= ruleOriginatorFunction EOF ;
    public final EObject entryRuleOriginatorFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOriginatorFunction = null;


        try {
            // InternalEdilang.g:6820:59: (iv_ruleOriginatorFunction= ruleOriginatorFunction EOF )
            // InternalEdilang.g:6821:2: iv_ruleOriginatorFunction= ruleOriginatorFunction EOF
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
    // InternalEdilang.g:6827:1: ruleOriginatorFunction returns [EObject current=null] : ( ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleOriginatorFunction() throws RecognitionException {
        EObject current = null;

        Token lv_countryCode_0_0=null;
        Token this_COLON_1=null;
        Token lv_currencyCode_2_0=null;
        Token this_COLON_3=null;
        Token lv_languageCode_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:6833:2: ( ( ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:6834:2: ( ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:6834:2: ( ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:6835:3: ( (lv_countryCode_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:6835:3: ( (lv_countryCode_0_0= RULE_ID ) )
            // InternalEdilang.g:6836:4: (lv_countryCode_0_0= RULE_ID )
            {
            // InternalEdilang.g:6836:4: (lv_countryCode_0_0= RULE_ID )
            // InternalEdilang.g:6837:5: lv_countryCode_0_0= RULE_ID
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

            // InternalEdilang.g:6853:3: (this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )? )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==RULE_COLON) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // InternalEdilang.g:6854:4: this_COLON_1= RULE_COLON ( (lv_currencyCode_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getOriginatorFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:6858:4: ( (lv_currencyCode_2_0= RULE_ID ) )
                    // InternalEdilang.g:6859:5: (lv_currencyCode_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:6859:5: (lv_currencyCode_2_0= RULE_ID )
                    // InternalEdilang.g:6860:6: lv_currencyCode_2_0= RULE_ID
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

                    // InternalEdilang.g:6876:4: (this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) ) )?
                    int alt178=2;
                    int LA178_0 = input.LA(1);

                    if ( (LA178_0==RULE_COLON) ) {
                        alt178=1;
                    }
                    switch (alt178) {
                        case 1 :
                            // InternalEdilang.g:6877:5: this_COLON_3= RULE_COLON ( (lv_languageCode_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getOriginatorFunctionAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:6881:5: ( (lv_languageCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:6882:6: (lv_languageCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:6882:6: (lv_languageCode_4_0= RULE_ID )
                            // InternalEdilang.g:6883:7: lv_languageCode_4_0= RULE_ID
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
    // InternalEdilang.g:6905:1: entryRuleOriginatorIdentificationFunction returns [EObject current=null] : iv_ruleOriginatorIdentificationFunction= ruleOriginatorIdentificationFunction EOF ;
    public final EObject entryRuleOriginatorIdentificationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOriginatorIdentificationFunction = null;


        try {
            // InternalEdilang.g:6905:73: (iv_ruleOriginatorIdentificationFunction= ruleOriginatorIdentificationFunction EOF )
            // InternalEdilang.g:6906:2: iv_ruleOriginatorIdentificationFunction= ruleOriginatorIdentificationFunction EOF
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
    // InternalEdilang.g:6912:1: ruleOriginatorIdentificationFunction returns [EObject current=null] : ( ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleOriginatorIdentificationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_travelAgentId_0_0=null;
        Token this_COLON_1=null;
        Token lv_inHouseId1_2_0=null;
        Token this_COLON_3=null;
        Token lv_inHouseId2_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:6918:2: ( ( ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:6919:2: ( ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:6919:2: ( ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:6920:3: ( (lv_travelAgentId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:6920:3: ( (lv_travelAgentId_0_0= RULE_ID ) )
            // InternalEdilang.g:6921:4: (lv_travelAgentId_0_0= RULE_ID )
            {
            // InternalEdilang.g:6921:4: (lv_travelAgentId_0_0= RULE_ID )
            // InternalEdilang.g:6922:5: lv_travelAgentId_0_0= RULE_ID
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

            // InternalEdilang.g:6938:3: (this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )? )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==RULE_COLON) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalEdilang.g:6939:4: this_COLON_1= RULE_COLON ( (lv_inHouseId1_2_0= RULE_ID ) )? (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_21); 

                    				newLeafNode(this_COLON_1, grammarAccess.getOriginatorIdentificationFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:6943:4: ( (lv_inHouseId1_2_0= RULE_ID ) )?
                    int alt180=2;
                    int LA180_0 = input.LA(1);

                    if ( (LA180_0==RULE_ID) ) {
                        alt180=1;
                    }
                    switch (alt180) {
                        case 1 :
                            // InternalEdilang.g:6944:5: (lv_inHouseId1_2_0= RULE_ID )
                            {
                            // InternalEdilang.g:6944:5: (lv_inHouseId1_2_0= RULE_ID )
                            // InternalEdilang.g:6945:6: lv_inHouseId1_2_0= RULE_ID
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

                    // InternalEdilang.g:6961:4: (this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) ) )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==RULE_COLON) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // InternalEdilang.g:6962:5: this_COLON_3= RULE_COLON ( (lv_inHouseId2_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getOriginatorIdentificationFunctionAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:6966:5: ( (lv_inHouseId2_4_0= RULE_ID ) )
                            // InternalEdilang.g:6967:6: (lv_inHouseId2_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:6967:6: (lv_inHouseId2_4_0= RULE_ID )
                            // InternalEdilang.g:6968:7: lv_inHouseId2_4_0= RULE_ID
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
    // InternalEdilang.g:6990:1: entryRuleLocationFunction returns [EObject current=null] : iv_ruleLocationFunction= ruleLocationFunction EOF ;
    public final EObject entryRuleLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationFunction = null;


        try {
            // InternalEdilang.g:6990:57: (iv_ruleLocationFunction= ruleLocationFunction EOF )
            // InternalEdilang.g:6991:2: iv_ruleLocationFunction= ruleLocationFunction EOF
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
    // InternalEdilang.g:6997:1: ruleLocationFunction returns [EObject current=null] : ( ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_locationId_0_0=null;
        Token this_COLON_1=null;
        Token lv_locationName_2_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:7003:2: ( ( ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )? ) )
            // InternalEdilang.g:7004:2: ( ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )? )
            {
            // InternalEdilang.g:7004:2: ( ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )? )
            // InternalEdilang.g:7005:3: ( (lv_locationId_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )?
            {
            // InternalEdilang.g:7005:3: ( (lv_locationId_0_0= RULE_ID ) )
            // InternalEdilang.g:7006:4: (lv_locationId_0_0= RULE_ID )
            {
            // InternalEdilang.g:7006:4: (lv_locationId_0_0= RULE_ID )
            // InternalEdilang.g:7007:5: lv_locationId_0_0= RULE_ID
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

            // InternalEdilang.g:7023:3: (this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) ) )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==RULE_COLON) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalEdilang.g:7024:4: this_COLON_1= RULE_COLON ( (lv_locationName_2_0= RULE_ID ) )
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getLocationFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:7028:4: ( (lv_locationName_2_0= RULE_ID ) )
                    // InternalEdilang.g:7029:5: (lv_locationName_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:7029:5: (lv_locationName_2_0= RULE_ID )
                    // InternalEdilang.g:7030:6: lv_locationName_2_0= RULE_ID
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
    // InternalEdilang.g:7051:1: entryRuleInterchangerFunction returns [EObject current=null] : iv_ruleInterchangerFunction= ruleInterchangerFunction EOF ;
    public final EObject entryRuleInterchangerFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterchangerFunction = null;


        try {
            // InternalEdilang.g:7051:61: (iv_ruleInterchangerFunction= ruleInterchangerFunction EOF )
            // InternalEdilang.g:7052:2: iv_ruleInterchangerFunction= ruleInterchangerFunction EOF
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
    // InternalEdilang.g:7058:1: ruleInterchangerFunction returns [EObject current=null] : ( ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleInterchangerFunction() throws RecognitionException {
        EObject current = null;

        Token lv_interchange_0_0=null;
        Token this_COLON_1=null;
        Token lv_interchange2_2_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:7064:2: ( ( ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )? ) )
            // InternalEdilang.g:7065:2: ( ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )? )
            {
            // InternalEdilang.g:7065:2: ( ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )? )
            // InternalEdilang.g:7066:3: ( (lv_interchange_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )?
            {
            // InternalEdilang.g:7066:3: ( (lv_interchange_0_0= RULE_ID ) )
            // InternalEdilang.g:7067:4: (lv_interchange_0_0= RULE_ID )
            {
            // InternalEdilang.g:7067:4: (lv_interchange_0_0= RULE_ID )
            // InternalEdilang.g:7068:5: lv_interchange_0_0= RULE_ID
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

            // InternalEdilang.g:7084:3: (this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) ) )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==RULE_COLON) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // InternalEdilang.g:7085:4: this_COLON_1= RULE_COLON ( (lv_interchange2_2_0= RULE_ID ) )
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getInterchangerFunctionAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:7089:4: ( (lv_interchange2_2_0= RULE_ID ) )
                    // InternalEdilang.g:7090:5: (lv_interchange2_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:7090:5: (lv_interchange2_2_0= RULE_ID )
                    // InternalEdilang.g:7091:6: lv_interchange2_2_0= RULE_ID
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
    // InternalEdilang.g:7112:1: entryRuleDateOnlyFunction returns [EObject current=null] : iv_ruleDateOnlyFunction= ruleDateOnlyFunction EOF ;
    public final EObject entryRuleDateOnlyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateOnlyFunction = null;


        try {
            // InternalEdilang.g:7112:57: (iv_ruleDateOnlyFunction= ruleDateOnlyFunction EOF )
            // InternalEdilang.g:7113:2: iv_ruleDateOnlyFunction= ruleDateOnlyFunction EOF
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
    // InternalEdilang.g:7119:1: ruleDateOnlyFunction returns [EObject current=null] : ( (lv_date6_0_0= RULE_ID ) ) ;
    public final EObject ruleDateOnlyFunction() throws RecognitionException {
        EObject current = null;

        Token lv_date6_0_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:7125:2: ( ( (lv_date6_0_0= RULE_ID ) ) )
            // InternalEdilang.g:7126:2: ( (lv_date6_0_0= RULE_ID ) )
            {
            // InternalEdilang.g:7126:2: ( (lv_date6_0_0= RULE_ID ) )
            // InternalEdilang.g:7127:3: (lv_date6_0_0= RULE_ID )
            {
            // InternalEdilang.g:7127:3: (lv_date6_0_0= RULE_ID )
            // InternalEdilang.g:7128:4: lv_date6_0_0= RULE_ID
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
    // InternalEdilang.g:7147:1: entryRuleDateAndTimeFunction returns [EObject current=null] : iv_ruleDateAndTimeFunction= ruleDateAndTimeFunction EOF ;
    public final EObject entryRuleDateAndTimeFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateAndTimeFunction = null;


        try {
            // InternalEdilang.g:7147:60: (iv_ruleDateAndTimeFunction= ruleDateAndTimeFunction EOF )
            // InternalEdilang.g:7148:2: iv_ruleDateAndTimeFunction= ruleDateAndTimeFunction EOF
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
    // InternalEdilang.g:7154:1: ruleDateAndTimeFunction returns [EObject current=null] : ( ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDateAndTimeFunction() throws RecognitionException {
        EObject current = null;

        Token lv_date6_0_0=null;
        Token this_COLON_1=null;
        Token lv_time4_2_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:7160:2: ( ( ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) ) ) )
            // InternalEdilang.g:7161:2: ( ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) ) )
            {
            // InternalEdilang.g:7161:2: ( ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) ) )
            // InternalEdilang.g:7162:3: ( (lv_date6_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_time4_2_0= RULE_ID ) )
            {
            // InternalEdilang.g:7162:3: ( (lv_date6_0_0= RULE_ID ) )
            // InternalEdilang.g:7163:4: (lv_date6_0_0= RULE_ID )
            {
            // InternalEdilang.g:7163:4: (lv_date6_0_0= RULE_ID )
            // InternalEdilang.g:7164:5: lv_date6_0_0= RULE_ID
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
            		
            // InternalEdilang.g:7184:3: ( (lv_time4_2_0= RULE_ID ) )
            // InternalEdilang.g:7185:4: (lv_time4_2_0= RULE_ID )
            {
            // InternalEdilang.g:7185:4: (lv_time4_2_0= RULE_ID )
            // InternalEdilang.g:7186:5: lv_time4_2_0= RULE_ID
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


    // $ANTLR start "entryRuleDateTimePeriod"
    // InternalEdilang.g:7206:1: entryRuleDateTimePeriod returns [EObject current=null] : iv_ruleDateTimePeriod= ruleDateTimePeriod EOF ;
    public final EObject entryRuleDateTimePeriod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimePeriod = null;


        try {
            // InternalEdilang.g:7206:55: (iv_ruleDateTimePeriod= ruleDateTimePeriod EOF )
            // InternalEdilang.g:7207:2: iv_ruleDateTimePeriod= ruleDateTimePeriod EOF
            {
             newCompositeNode(grammarAccess.getDateTimePeriodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTimePeriod=ruleDateTimePeriod();

            state._fsp--;

             current =iv_ruleDateTimePeriod; 
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
    // $ANTLR end "entryRuleDateTimePeriod"


    // $ANTLR start "ruleDateTimePeriod"
    // InternalEdilang.g:7213:1: ruleDateTimePeriod returns [EObject current=null] : ( ( (lv_dateTimePeriodFunctionCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_dateTimePeriodValue_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) ) )? )? ) ;
    public final EObject ruleDateTimePeriod() throws RecognitionException {
        EObject current = null;

        Token lv_dateTimePeriodFunctionCodeQualifier_0_0=null;
        Token this_COLON_1=null;
        Token lv_dateTimePeriodValue_2_0=null;
        Token this_COLON_3=null;
        Token lv_dateTimePeriodFormatCode_4_0=null;


        	enterRule();

        try {
            // InternalEdilang.g:7219:2: ( ( ( (lv_dateTimePeriodFunctionCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_dateTimePeriodValue_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) ) )? )? ) )
            // InternalEdilang.g:7220:2: ( ( (lv_dateTimePeriodFunctionCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_dateTimePeriodValue_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) ) )? )? )
            {
            // InternalEdilang.g:7220:2: ( ( (lv_dateTimePeriodFunctionCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_dateTimePeriodValue_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) ) )? )? )
            // InternalEdilang.g:7221:3: ( (lv_dateTimePeriodFunctionCodeQualifier_0_0= RULE_ID ) ) (this_COLON_1= RULE_COLON ( (lv_dateTimePeriodValue_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) ) )? )?
            {
            // InternalEdilang.g:7221:3: ( (lv_dateTimePeriodFunctionCodeQualifier_0_0= RULE_ID ) )
            // InternalEdilang.g:7222:4: (lv_dateTimePeriodFunctionCodeQualifier_0_0= RULE_ID )
            {
            // InternalEdilang.g:7222:4: (lv_dateTimePeriodFunctionCodeQualifier_0_0= RULE_ID )
            // InternalEdilang.g:7223:5: lv_dateTimePeriodFunctionCodeQualifier_0_0= RULE_ID
            {
            lv_dateTimePeriodFunctionCodeQualifier_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_dateTimePeriodFunctionCodeQualifier_0_0, grammarAccess.getDateTimePeriodAccess().getDateTimePeriodFunctionCodeQualifierIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateTimePeriodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dateTimePeriodFunctionCodeQualifier",
            						lv_dateTimePeriodFunctionCodeQualifier_0_0,
            						"io.thlaegler.edifact.Edilang.ID");
            				

            }


            }

            // InternalEdilang.g:7239:3: (this_COLON_1= RULE_COLON ( (lv_dateTimePeriodValue_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) ) )? )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==RULE_COLON) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // InternalEdilang.g:7240:4: this_COLON_1= RULE_COLON ( (lv_dateTimePeriodValue_2_0= RULE_ID ) ) (this_COLON_3= RULE_COLON ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) ) )?
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_13); 

                    				newLeafNode(this_COLON_1, grammarAccess.getDateTimePeriodAccess().getCOLONTerminalRuleCall_1_0());
                    			
                    // InternalEdilang.g:7244:4: ( (lv_dateTimePeriodValue_2_0= RULE_ID ) )
                    // InternalEdilang.g:7245:5: (lv_dateTimePeriodValue_2_0= RULE_ID )
                    {
                    // InternalEdilang.g:7245:5: (lv_dateTimePeriodValue_2_0= RULE_ID )
                    // InternalEdilang.g:7246:6: lv_dateTimePeriodValue_2_0= RULE_ID
                    {
                    lv_dateTimePeriodValue_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_dateTimePeriodValue_2_0, grammarAccess.getDateTimePeriodAccess().getDateTimePeriodValueIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDateTimePeriodRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dateTimePeriodValue",
                    							lv_dateTimePeriodValue_2_0,
                    							"io.thlaegler.edifact.Edilang.ID");
                    					

                    }


                    }

                    // InternalEdilang.g:7262:4: (this_COLON_3= RULE_COLON ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) ) )?
                    int alt185=2;
                    int LA185_0 = input.LA(1);

                    if ( (LA185_0==RULE_COLON) ) {
                        alt185=1;
                    }
                    switch (alt185) {
                        case 1 :
                            // InternalEdilang.g:7263:5: this_COLON_3= RULE_COLON ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) )
                            {
                            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); 

                            					newLeafNode(this_COLON_3, grammarAccess.getDateTimePeriodAccess().getCOLONTerminalRuleCall_1_2_0());
                            				
                            // InternalEdilang.g:7267:5: ( (lv_dateTimePeriodFormatCode_4_0= RULE_ID ) )
                            // InternalEdilang.g:7268:6: (lv_dateTimePeriodFormatCode_4_0= RULE_ID )
                            {
                            // InternalEdilang.g:7268:6: (lv_dateTimePeriodFormatCode_4_0= RULE_ID )
                            // InternalEdilang.g:7269:7: lv_dateTimePeriodFormatCode_4_0= RULE_ID
                            {
                            lv_dateTimePeriodFormatCode_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_dateTimePeriodFormatCode_4_0, grammarAccess.getDateTimePeriodAccess().getDateTimePeriodFormatCodeIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDateTimePeriodRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"dateTimePeriodFormatCode",
                            								lv_dateTimePeriodFormatCode_4_0,
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
    // $ANTLR end "ruleDateTimePeriod"

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000012L});

}