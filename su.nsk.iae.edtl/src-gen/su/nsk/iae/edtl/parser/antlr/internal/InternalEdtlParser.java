package su.nsk.iae.edtl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import su.nsk.iae.edtl.services.EdtlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEdtlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECL_SYMB", "RULE_INTEGER", "RULE_DIRECT_VARIABLE", "RULE_ID", "RULE_BOOLEAN_LITERAL", "RULE_STRING", "RULE_OR_OPERATOR", "RULE_INTERVAL", "RULE_DIRECT_TYPE_PREFIX", "RULE_DIRECT_SIZE_PREFIX", "RULE_OCTAL_DIGIT", "RULE_DIGIT", "RULE_LETTER", "RULE_BIT", "RULE_HEX_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'BOOL'", "'INT'", "'VAR_INPUT'", "'INPUT_PORTS_COUNTER'", "';'", "'END_VAR'", "'VAR_OUTPUT'", "'OUTPUT_PORTS_COUNTER'", "'AT'", "':'", "'VAR_INIT'", "'ABBR'", "'END_ABBR'", "'MACROS'", "'('", "')'", "'END_MACROS'", "','", "'REQ'", "'TRIGGER'", "'NL:'", "'INVARIANT'", "'FINAL'", "'DELAY'", "'REACTION'", "'RELEASE'", "'END_REQ'", "'XOR'", "'&&'", "'AND'", "'FE'", "'RE'", "'HIGH'", "'LOW'", "'NOT'", "'!'", "'TAU'", "'#T'", "'=='", "'<>'", "'<'", "'>'", "'<='", "'>='"
    };
    public static final int T__50=50;
    public static final int RULE_INTERVAL=11;
    public static final int RULE_DECL_SYMB=4;
    public static final int RULE_BIT=17;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_DIRECT_SIZE_PREFIX=13;
    public static final int RULE_ID=7;
    public static final int RULE_BOOLEAN_LITERAL=8;
    public static final int RULE_DIGIT=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DIRECT_VARIABLE=6;
    public static final int RULE_DIRECT_TYPE_PREFIX=12;
    public static final int RULE_STRING=9;
    public static final int RULE_OR_OPERATOR=10;
    public static final int RULE_SL_COMMENT=20;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=14;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=21;
    public static final int RULE_LETTER=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=18;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEdtlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEdtlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEdtlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEdtl.g"; }



     	private EdtlGrammarAccess grammarAccess;

        public InternalEdtlParser(TokenStream input, EdtlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EdtlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEdtl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEdtl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalEdtl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEdtl.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_varInits_2_0= ruleVarInit ) ) | ( (lv_abbrs_3_0= ruleAbbr ) ) | ( (lv_macroses_4_0= ruleMacros ) ) | ( (lv_reqs_5_0= ruleRequirement ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declVarInput_0_0 = null;

        EObject lv_declVarOutput_1_0 = null;

        EObject lv_varInits_2_0 = null;

        EObject lv_abbrs_3_0 = null;

        EObject lv_macroses_4_0 = null;

        EObject lv_reqs_5_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:78:2: ( ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_varInits_2_0= ruleVarInit ) ) | ( (lv_abbrs_3_0= ruleAbbr ) ) | ( (lv_macroses_4_0= ruleMacros ) ) | ( (lv_reqs_5_0= ruleRequirement ) ) )* )
            // InternalEdtl.g:79:2: ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_varInits_2_0= ruleVarInit ) ) | ( (lv_abbrs_3_0= ruleAbbr ) ) | ( (lv_macroses_4_0= ruleMacros ) ) | ( (lv_reqs_5_0= ruleRequirement ) ) )*
            {
            // InternalEdtl.g:79:2: ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_varInits_2_0= ruleVarInit ) ) | ( (lv_abbrs_3_0= ruleAbbr ) ) | ( (lv_macroses_4_0= ruleMacros ) ) | ( (lv_reqs_5_0= ruleRequirement ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt1=1;
                    }
                    break;
                case 28:
                    {
                    alt1=2;
                    }
                    break;
                case 32:
                    {
                    alt1=3;
                    }
                    break;
                case 33:
                    {
                    alt1=4;
                    }
                    break;
                case 35:
                    {
                    alt1=5;
                    }
                    break;
                case 40:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalEdtl.g:80:3: ( (lv_declVarInput_0_0= ruleDeclVarInput ) )
            	    {
            	    // InternalEdtl.g:80:3: ( (lv_declVarInput_0_0= ruleDeclVarInput ) )
            	    // InternalEdtl.g:81:4: (lv_declVarInput_0_0= ruleDeclVarInput )
            	    {
            	    // InternalEdtl.g:81:4: (lv_declVarInput_0_0= ruleDeclVarInput )
            	    // InternalEdtl.g:82:5: lv_declVarInput_0_0= ruleDeclVarInput
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDeclVarInputDeclVarInputParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_declVarInput_0_0=ruleDeclVarInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declVarInput",
            	    						lv_declVarInput_0_0,
            	    						"su.nsk.iae.edtl.Edtl.DeclVarInput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEdtl.g:100:3: ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) )
            	    {
            	    // InternalEdtl.g:100:3: ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) )
            	    // InternalEdtl.g:101:4: (lv_declVarOutput_1_0= ruleDeclVarOutput )
            	    {
            	    // InternalEdtl.g:101:4: (lv_declVarOutput_1_0= ruleDeclVarOutput )
            	    // InternalEdtl.g:102:5: lv_declVarOutput_1_0= ruleDeclVarOutput
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDeclVarOutputDeclVarOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_declVarOutput_1_0=ruleDeclVarOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declVarOutput",
            	    						lv_declVarOutput_1_0,
            	    						"su.nsk.iae.edtl.Edtl.DeclVarOutput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEdtl.g:120:3: ( (lv_varInits_2_0= ruleVarInit ) )
            	    {
            	    // InternalEdtl.g:120:3: ( (lv_varInits_2_0= ruleVarInit ) )
            	    // InternalEdtl.g:121:4: (lv_varInits_2_0= ruleVarInit )
            	    {
            	    // InternalEdtl.g:121:4: (lv_varInits_2_0= ruleVarInit )
            	    // InternalEdtl.g:122:5: lv_varInits_2_0= ruleVarInit
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVarInitsVarInitParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_varInits_2_0=ruleVarInit();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"varInits",
            	    						lv_varInits_2_0,
            	    						"su.nsk.iae.edtl.Edtl.VarInit");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEdtl.g:140:3: ( (lv_abbrs_3_0= ruleAbbr ) )
            	    {
            	    // InternalEdtl.g:140:3: ( (lv_abbrs_3_0= ruleAbbr ) )
            	    // InternalEdtl.g:141:4: (lv_abbrs_3_0= ruleAbbr )
            	    {
            	    // InternalEdtl.g:141:4: (lv_abbrs_3_0= ruleAbbr )
            	    // InternalEdtl.g:142:5: lv_abbrs_3_0= ruleAbbr
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAbbrsAbbrParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_abbrs_3_0=ruleAbbr();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abbrs",
            	    						lv_abbrs_3_0,
            	    						"su.nsk.iae.edtl.Edtl.Abbr");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalEdtl.g:160:3: ( (lv_macroses_4_0= ruleMacros ) )
            	    {
            	    // InternalEdtl.g:160:3: ( (lv_macroses_4_0= ruleMacros ) )
            	    // InternalEdtl.g:161:4: (lv_macroses_4_0= ruleMacros )
            	    {
            	    // InternalEdtl.g:161:4: (lv_macroses_4_0= ruleMacros )
            	    // InternalEdtl.g:162:5: lv_macroses_4_0= ruleMacros
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMacrosesMacrosParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_macroses_4_0=ruleMacros();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"macroses",
            	    						lv_macroses_4_0,
            	    						"su.nsk.iae.edtl.Edtl.Macros");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalEdtl.g:180:3: ( (lv_reqs_5_0= ruleRequirement ) )
            	    {
            	    // InternalEdtl.g:180:3: ( (lv_reqs_5_0= ruleRequirement ) )
            	    // InternalEdtl.g:181:4: (lv_reqs_5_0= ruleRequirement )
            	    {
            	    // InternalEdtl.g:181:4: (lv_reqs_5_0= ruleRequirement )
            	    // InternalEdtl.g:182:5: lv_reqs_5_0= ruleRequirement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getReqsRequirementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_reqs_5_0=ruleRequirement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reqs",
            	    						lv_reqs_5_0,
            	    						"su.nsk.iae.edtl.Edtl.Requirement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariableType"
    // InternalEdtl.g:203:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // InternalEdtl.g:203:52: (iv_ruleVariableType= ruleVariableType EOF )
            // InternalEdtl.g:204:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
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
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalEdtl.g:210:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'INT' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:216:2: ( (kw= 'BOOL' | kw= 'INT' ) )
            // InternalEdtl.g:217:2: (kw= 'BOOL' | kw= 'INT' )
            {
            // InternalEdtl.g:217:2: (kw= 'BOOL' | kw= 'INT' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEdtl.g:218:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:224:3: kw= 'INT'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTKeyword_1());
                    		

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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleDeclVarInput"
    // InternalEdtl.g:233:1: entryRuleDeclVarInput returns [EObject current=null] : iv_ruleDeclVarInput= ruleDeclVarInput EOF ;
    public final EObject entryRuleDeclVarInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarInput = null;


        try {
            // InternalEdtl.g:233:53: (iv_ruleDeclVarInput= ruleDeclVarInput EOF )
            // InternalEdtl.g:234:2: iv_ruleDeclVarInput= ruleDeclVarInput EOF
            {
             newCompositeNode(grammarAccess.getDeclVarInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVarInput=ruleDeclVarInput();

            state._fsp--;

             current =iv_ruleDeclVarInput; 
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
    // $ANTLR end "entryRuleDeclVarInput"


    // $ANTLR start "ruleDeclVarInput"
    // InternalEdtl.g:240:1: ruleDeclVarInput returns [EObject current=null] : ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) ;
    public final EObject ruleDeclVarInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_DECL_SYMB_3=null;
        Token lv_inputCounter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_varDecls_6_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:246:2: ( ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) )
            // InternalEdtl.g:247:2: ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            {
            // InternalEdtl.g:247:2: ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            // InternalEdtl.g:248:3: () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR'
            {
            // InternalEdtl.g:248:3: ()
            // InternalEdtl.g:249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1());
            		
            // InternalEdtl.g:259:3: (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEdtl.g:260:4: otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeclVarInputAccess().getINPUT_PORTS_COUNTERKeyword_2_0());
                    			
                    this_DECL_SYMB_3=(Token)match(input,RULE_DECL_SYMB,FOLLOW_6); 

                    				newLeafNode(this_DECL_SYMB_3, grammarAccess.getDeclVarInputAccess().getDECL_SYMBTerminalRuleCall_2_1());
                    			
                    // InternalEdtl.g:268:4: ( (lv_inputCounter_4_0= RULE_INTEGER ) )
                    // InternalEdtl.g:269:5: (lv_inputCounter_4_0= RULE_INTEGER )
                    {
                    // InternalEdtl.g:269:5: (lv_inputCounter_4_0= RULE_INTEGER )
                    // InternalEdtl.g:270:6: lv_inputCounter_4_0= RULE_INTEGER
                    {
                    lv_inputCounter_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_7); 

                    						newLeafNode(lv_inputCounter_4_0, grammarAccess.getDeclVarInputAccess().getInputCounterINTEGERTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclVarInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"inputCounter",
                    							lv_inputCounter_4_0,
                    							"su.nsk.iae.edtl.Edtl.INTEGER");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalEdtl.g:291:3: ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEdtl.g:292:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';'
            	    {
            	    // InternalEdtl.g:292:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) )
            	    // InternalEdtl.g:293:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    {
            	    // InternalEdtl.g:293:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    // InternalEdtl.g:294:6: lv_varDecls_6_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarInputAccess().getVarDeclsVarDeclarationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_varDecls_6_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDecls",
            	    							lv_varDecls_6_0,
            	    							"su.nsk.iae.edtl.Edtl.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,26,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeclVarInputAccess().getEND_VARKeyword_4());
            		

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
    // $ANTLR end "ruleDeclVarInput"


    // $ANTLR start "entryRuleDeclVarOutput"
    // InternalEdtl.g:324:1: entryRuleDeclVarOutput returns [EObject current=null] : iv_ruleDeclVarOutput= ruleDeclVarOutput EOF ;
    public final EObject entryRuleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarOutput = null;


        try {
            // InternalEdtl.g:324:54: (iv_ruleDeclVarOutput= ruleDeclVarOutput EOF )
            // InternalEdtl.g:325:2: iv_ruleDeclVarOutput= ruleDeclVarOutput EOF
            {
             newCompositeNode(grammarAccess.getDeclVarOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVarOutput=ruleDeclVarOutput();

            state._fsp--;

             current =iv_ruleDeclVarOutput; 
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
    // $ANTLR end "entryRuleDeclVarOutput"


    // $ANTLR start "ruleDeclVarOutput"
    // InternalEdtl.g:331:1: ruleDeclVarOutput returns [EObject current=null] : ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) ;
    public final EObject ruleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_DECL_SYMB_3=null;
        Token lv_outputCounter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_varDecls_6_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:337:2: ( ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) )
            // InternalEdtl.g:338:2: ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            {
            // InternalEdtl.g:338:2: ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            // InternalEdtl.g:339:3: () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR'
            {
            // InternalEdtl.g:339:3: ()
            // InternalEdtl.g:340:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1());
            		
            // InternalEdtl.g:350:3: (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEdtl.g:351:4: otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeclVarOutputAccess().getOUTPUT_PORTS_COUNTERKeyword_2_0());
                    			
                    this_DECL_SYMB_3=(Token)match(input,RULE_DECL_SYMB,FOLLOW_6); 

                    				newLeafNode(this_DECL_SYMB_3, grammarAccess.getDeclVarOutputAccess().getDECL_SYMBTerminalRuleCall_2_1());
                    			
                    // InternalEdtl.g:359:4: ( (lv_outputCounter_4_0= RULE_INTEGER ) )
                    // InternalEdtl.g:360:5: (lv_outputCounter_4_0= RULE_INTEGER )
                    {
                    // InternalEdtl.g:360:5: (lv_outputCounter_4_0= RULE_INTEGER )
                    // InternalEdtl.g:361:6: lv_outputCounter_4_0= RULE_INTEGER
                    {
                    lv_outputCounter_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_7); 

                    						newLeafNode(lv_outputCounter_4_0, grammarAccess.getDeclVarOutputAccess().getOutputCounterINTEGERTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclVarOutputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"outputCounter",
                    							lv_outputCounter_4_0,
                    							"su.nsk.iae.edtl.Edtl.INTEGER");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalEdtl.g:382:3: ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEdtl.g:383:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';'
            	    {
            	    // InternalEdtl.g:383:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) )
            	    // InternalEdtl.g:384:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    {
            	    // InternalEdtl.g:384:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    // InternalEdtl.g:385:6: lv_varDecls_6_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarOutputAccess().getVarDeclsVarDeclarationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_varDecls_6_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarOutputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDecls",
            	    							lv_varDecls_6_0,
            	    							"su.nsk.iae.edtl.Edtl.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,26,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeclVarOutputAccess().getEND_VARKeyword_4());
            		

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
    // $ANTLR end "ruleDeclVarOutput"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalEdtl.g:415:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalEdtl.g:415:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalEdtl.g:416:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalEdtl.g:422:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_location_2_0=null;
        Token otherlv_3=null;
        EObject lv_v_0_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:428:2: ( ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) ) )
            // InternalEdtl.g:429:2: ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) )
            {
            // InternalEdtl.g:429:2: ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) )
            // InternalEdtl.g:430:3: ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) )
            {
            // InternalEdtl.g:430:3: ( (lv_v_0_0= ruleVariable ) )
            // InternalEdtl.g:431:4: (lv_v_0_0= ruleVariable )
            {
            // InternalEdtl.g:431:4: (lv_v_0_0= ruleVariable )
            // InternalEdtl.g:432:5: lv_v_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_v_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"v",
            						lv_v_0_0,
            						"su.nsk.iae.edtl.Edtl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdtl.g:449:3: (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEdtl.g:450:4: otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getATKeyword_1_0());
                    			
                    // InternalEdtl.g:454:4: ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) )
                    // InternalEdtl.g:455:5: (lv_location_2_0= RULE_DIRECT_VARIABLE )
                    {
                    // InternalEdtl.g:455:5: (lv_location_2_0= RULE_DIRECT_VARIABLE )
                    // InternalEdtl.g:456:6: lv_location_2_0= RULE_DIRECT_VARIABLE
                    {
                    lv_location_2_0=(Token)match(input,RULE_DIRECT_VARIABLE,FOLLOW_12); 

                    						newLeafNode(lv_location_2_0, grammarAccess.getVarDeclarationAccess().getLocationDIRECT_VARIABLETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_2_0,
                    							"su.nsk.iae.edtl.Edtl.DIRECT_VARIABLE");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getColonKeyword_2());
            		
            // InternalEdtl.g:477:3: ( (lv_type_4_0= ruleVariableType ) )
            // InternalEdtl.g:478:4: (lv_type_4_0= ruleVariableType )
            {
            // InternalEdtl.g:478:4: (lv_type_4_0= ruleVariableType )
            // InternalEdtl.g:479:5: lv_type_4_0= ruleVariableType
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVariableTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"su.nsk.iae.edtl.Edtl.VariableType");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVarInit"
    // InternalEdtl.g:500:1: entryRuleVarInit returns [EObject current=null] : iv_ruleVarInit= ruleVarInit EOF ;
    public final EObject entryRuleVarInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInit = null;


        try {
            // InternalEdtl.g:500:48: (iv_ruleVarInit= ruleVarInit EOF )
            // InternalEdtl.g:501:2: iv_ruleVarInit= ruleVarInit EOF
            {
             newCompositeNode(grammarAccess.getVarInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarInit=ruleVarInit();

            state._fsp--;

             current =iv_ruleVarInit; 
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
    // $ANTLR end "entryRuleVarInit"


    // $ANTLR start "ruleVarInit"
    // InternalEdtl.g:507:1: ruleVarInit returns [EObject current=null] : ( () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' ) ;
    public final EObject ruleVarInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_varAssign_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:513:2: ( ( () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' ) )
            // InternalEdtl.g:514:2: ( () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' )
            {
            // InternalEdtl.g:514:2: ( () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' )
            // InternalEdtl.g:515:3: () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR'
            {
            // InternalEdtl.g:515:3: ()
            // InternalEdtl.g:516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarInitAccess().getVarInitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVarInitAccess().getVAR_INITKeyword_1());
            		
            // InternalEdtl.g:526:3: ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEdtl.g:527:4: ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';'
            	    {
            	    // InternalEdtl.g:527:4: ( (lv_varAssign_2_0= ruleVarAssign ) )
            	    // InternalEdtl.g:528:5: (lv_varAssign_2_0= ruleVarAssign )
            	    {
            	    // InternalEdtl.g:528:5: (lv_varAssign_2_0= ruleVarAssign )
            	    // InternalEdtl.g:529:6: lv_varAssign_2_0= ruleVarAssign
            	    {

            	    						newCompositeNode(grammarAccess.getVarInitAccess().getVarAssignVarAssignParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_varAssign_2_0=ruleVarAssign();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarInitRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varAssign",
            	    							lv_varAssign_2_0,
            	    							"su.nsk.iae.edtl.Edtl.VarAssign");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,26,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getVarInitAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVarInitAccess().getEND_VARKeyword_3());
            		

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
    // $ANTLR end "ruleVarInit"


    // $ANTLR start "entryRuleVarAssign"
    // InternalEdtl.g:559:1: entryRuleVarAssign returns [EObject current=null] : iv_ruleVarAssign= ruleVarAssign EOF ;
    public final EObject entryRuleVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssign = null;


        try {
            // InternalEdtl.g:559:50: (iv_ruleVarAssign= ruleVarAssign EOF )
            // InternalEdtl.g:560:2: iv_ruleVarAssign= ruleVarAssign EOF
            {
             newCompositeNode(grammarAccess.getVarAssignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarAssign=ruleVarAssign();

            state._fsp--;

             current =iv_ruleVarAssign; 
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
    // $ANTLR end "entryRuleVarAssign"


    // $ANTLR start "ruleVarAssign"
    // InternalEdtl.g:566:1: ruleVarAssign returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) ) ) ;
    public final EObject ruleVarAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DECL_SYMB_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalEdtl.g:572:2: ( ( ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) ) ) )
            // InternalEdtl.g:573:2: ( ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) ) )
            {
            // InternalEdtl.g:573:2: ( ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) ) )
            // InternalEdtl.g:574:3: ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) )
            {
            // InternalEdtl.g:574:3: ( (otherlv_0= RULE_ID ) )
            // InternalEdtl.g:575:4: (otherlv_0= RULE_ID )
            {
            // InternalEdtl.g:575:4: (otherlv_0= RULE_ID )
            // InternalEdtl.g:576:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarAssignRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getVarAssignAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            this_DECL_SYMB_1=(Token)match(input,RULE_DECL_SYMB,FOLLOW_14); 

            			newLeafNode(this_DECL_SYMB_1, grammarAccess.getVarAssignAccess().getDECL_SYMBTerminalRuleCall_1());
            		
            // InternalEdtl.g:591:3: ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) )
            // InternalEdtl.g:592:4: ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) )
            {
            // InternalEdtl.g:592:4: ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) )
            // InternalEdtl.g:593:5: (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL )
            {
            // InternalEdtl.g:593:5: (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INTEGER) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_BOOLEAN_LITERAL) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEdtl.g:594:6: lv_value_2_1= RULE_INTEGER
                    {
                    lv_value_2_1=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getVarAssignAccess().getValueINTEGERTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarAssignRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"su.nsk.iae.edtl.Edtl.INTEGER");
                    					

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:609:6: lv_value_2_2= RULE_BOOLEAN_LITERAL
                    {
                    lv_value_2_2=(Token)match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getVarAssignAccess().getValueBOOLEAN_LITERALTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarAssignRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_2,
                    							"su.nsk.iae.edtl.Edtl.BOOLEAN_LITERAL");
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleVarAssign"


    // $ANTLR start "entryRuleAbbr"
    // InternalEdtl.g:630:1: entryRuleAbbr returns [EObject current=null] : iv_ruleAbbr= ruleAbbr EOF ;
    public final EObject entryRuleAbbr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbbr = null;


        try {
            // InternalEdtl.g:630:45: (iv_ruleAbbr= ruleAbbr EOF )
            // InternalEdtl.g:631:2: iv_ruleAbbr= ruleAbbr EOF
            {
             newCompositeNode(grammarAccess.getAbbrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbbr=ruleAbbr();

            state._fsp--;

             current =iv_ruleAbbr; 
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
    // $ANTLR end "entryRuleAbbr"


    // $ANTLR start "ruleAbbr"
    // InternalEdtl.g:637:1: ruleAbbr returns [EObject current=null] : (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' ) ;
    public final EObject ruleAbbr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:643:2: ( (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' ) )
            // InternalEdtl.g:644:2: (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' )
            {
            // InternalEdtl.g:644:2: (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' )
            // InternalEdtl.g:645:3: otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAbbrAccess().getABBRKeyword_0());
            		
            // InternalEdtl.g:649:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:650:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:650:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:651:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbbrAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbbrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.edtl.Edtl.ID");
            				

            }


            }

            // InternalEdtl.g:667:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEdtl.g:668:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEdtl.g:668:4: (lv_expr_2_0= ruleExpression )
            // InternalEdtl.g:669:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAbbrAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbbrRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"su.nsk.iae.edtl.Edtl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAbbrAccess().getEND_ABBRKeyword_3());
            		

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
    // $ANTLR end "ruleAbbr"


    // $ANTLR start "entryRuleMacros"
    // InternalEdtl.g:694:1: entryRuleMacros returns [EObject current=null] : iv_ruleMacros= ruleMacros EOF ;
    public final EObject entryRuleMacros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacros = null;


        try {
            // InternalEdtl.g:694:47: (iv_ruleMacros= ruleMacros EOF )
            // InternalEdtl.g:695:2: iv_ruleMacros= ruleMacros EOF
            {
             newCompositeNode(grammarAccess.getMacrosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacros=ruleMacros();

            state._fsp--;

             current =iv_ruleMacros; 
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
    // $ANTLR end "entryRuleMacros"


    // $ANTLR start "ruleMacros"
    // InternalEdtl.g:701:1: ruleMacros returns [EObject current=null] : (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' ) ;
    public final EObject ruleMacros() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_expr_5_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:707:2: ( (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' ) )
            // InternalEdtl.g:708:2: (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' )
            {
            // InternalEdtl.g:708:2: (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' )
            // InternalEdtl.g:709:3: otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMacrosAccess().getMACROSKeyword_0());
            		
            // InternalEdtl.g:713:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:714:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:714:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:715:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMacrosAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacrosRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.edtl.Edtl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getMacrosAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEdtl.g:735:3: ( (lv_args_3_0= ruleVarList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEdtl.g:736:4: (lv_args_3_0= ruleVarList )
                    {
                    // InternalEdtl.g:736:4: (lv_args_3_0= ruleVarList )
                    // InternalEdtl.g:737:5: lv_args_3_0= ruleVarList
                    {

                    					newCompositeNode(grammarAccess.getMacrosAccess().getArgsVarListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_args_3_0=ruleVarList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMacrosRule());
                    					}
                    					set(
                    						current,
                    						"args",
                    						lv_args_3_0,
                    						"su.nsk.iae.edtl.Edtl.VarList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getMacrosAccess().getRightParenthesisKeyword_4());
            		
            // InternalEdtl.g:758:3: ( (lv_expr_5_0= ruleExpression ) )
            // InternalEdtl.g:759:4: (lv_expr_5_0= ruleExpression )
            {
            // InternalEdtl.g:759:4: (lv_expr_5_0= ruleExpression )
            // InternalEdtl.g:760:5: lv_expr_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMacrosAccess().getExprExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_expr_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMacrosRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_5_0,
            						"su.nsk.iae.edtl.Edtl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMacrosAccess().getEND_MACROSKeyword_6());
            		

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
    // $ANTLR end "ruleMacros"


    // $ANTLR start "entryRuleVarList"
    // InternalEdtl.g:785:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalEdtl.g:785:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalEdtl.g:786:2: iv_ruleVarList= ruleVarList EOF
            {
             newCompositeNode(grammarAccess.getVarListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarList=ruleVarList();

            state._fsp--;

             current =iv_ruleVarList; 
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
    // $ANTLR end "entryRuleVarList"


    // $ANTLR start "ruleVarList"
    // InternalEdtl.g:792:1: ruleVarList returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) ;
    public final EObject ruleVarList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:798:2: ( ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) )
            // InternalEdtl.g:799:2: ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* )
            {
            // InternalEdtl.g:799:2: ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* )
            // InternalEdtl.g:800:3: ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            {
            // InternalEdtl.g:800:3: ( (lv_vars_0_0= ruleVariable ) )
            // InternalEdtl.g:801:4: (lv_vars_0_0= ruleVariable )
            {
            // InternalEdtl.g:801:4: (lv_vars_0_0= ruleVariable )
            // InternalEdtl.g:802:5: lv_vars_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getVarsVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_vars_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarListRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"su.nsk.iae.edtl.Edtl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdtl.g:819:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEdtl.g:820:4: otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalEdtl.g:824:4: ( (lv_vars_2_0= ruleVariable ) )
            	    // InternalEdtl.g:825:5: (lv_vars_2_0= ruleVariable )
            	    {
            	    // InternalEdtl.g:825:5: (lv_vars_2_0= ruleVariable )
            	    // InternalEdtl.g:826:6: lv_vars_2_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarListAccess().getVarsVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_vars_2_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"su.nsk.iae.edtl.Edtl.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleVarList"


    // $ANTLR start "entryRuleRequirement"
    // InternalEdtl.g:848:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalEdtl.g:848:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalEdtl.g:849:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalEdtl.g:855:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' ( (lv_nlTrig_7_0= RULE_STRING ) ) otherlv_8= ';' )? )? (otherlv_9= 'INVARIANT' this_DECL_SYMB_10= RULE_DECL_SYMB ( (lv_invExpr_11_0= ruleExpression ) ) otherlv_12= ';' (otherlv_13= 'NL:' ( (lv_nlInv_14_0= RULE_STRING ) ) otherlv_15= ';' )? )? (otherlv_16= 'FINAL' this_DECL_SYMB_17= RULE_DECL_SYMB ( (lv_finalExpr_18_0= ruleExpression ) ) otherlv_19= ';' (otherlv_20= 'NL:' ( (lv_nlFinal_21_0= RULE_STRING ) ) otherlv_22= ';' )? )? (otherlv_23= 'DELAY' this_DECL_SYMB_24= RULE_DECL_SYMB ( (lv_delayExpr_25_0= ruleExpression ) ) otherlv_26= ';' (otherlv_27= 'NL:' ( (lv_nlDelay_28_0= RULE_STRING ) ) otherlv_29= ';' )? )? (otherlv_30= 'REACTION' this_DECL_SYMB_31= RULE_DECL_SYMB ( (lv_reacExpr_32_0= ruleExpression ) ) otherlv_33= ';' (otherlv_34= 'NL:' ( (lv_nlReac_35_0= RULE_STRING ) ) otherlv_36= ';' )? )? (otherlv_37= 'RELEASE' this_DECL_SYMB_38= RULE_DECL_SYMB ( (lv_relExpr_39_0= ruleExpression ) ) otherlv_40= ';' (otherlv_41= 'NL:' ( (lv_nlRel_42_0= RULE_STRING ) ) otherlv_43= ';' )? )? otherlv_44= 'END_REQ' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_DECL_SYMB_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_nlTrig_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_DECL_SYMB_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_nlInv_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token this_DECL_SYMB_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_nlFinal_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token this_DECL_SYMB_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_nlDelay_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token this_DECL_SYMB_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_nlReac_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token this_DECL_SYMB_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token lv_nlRel_42_0=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        EObject lv_trigExpr_4_0 = null;

        EObject lv_invExpr_11_0 = null;

        EObject lv_finalExpr_18_0 = null;

        EObject lv_delayExpr_25_0 = null;

        EObject lv_reacExpr_32_0 = null;

        EObject lv_relExpr_39_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:861:2: ( (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' ( (lv_nlTrig_7_0= RULE_STRING ) ) otherlv_8= ';' )? )? (otherlv_9= 'INVARIANT' this_DECL_SYMB_10= RULE_DECL_SYMB ( (lv_invExpr_11_0= ruleExpression ) ) otherlv_12= ';' (otherlv_13= 'NL:' ( (lv_nlInv_14_0= RULE_STRING ) ) otherlv_15= ';' )? )? (otherlv_16= 'FINAL' this_DECL_SYMB_17= RULE_DECL_SYMB ( (lv_finalExpr_18_0= ruleExpression ) ) otherlv_19= ';' (otherlv_20= 'NL:' ( (lv_nlFinal_21_0= RULE_STRING ) ) otherlv_22= ';' )? )? (otherlv_23= 'DELAY' this_DECL_SYMB_24= RULE_DECL_SYMB ( (lv_delayExpr_25_0= ruleExpression ) ) otherlv_26= ';' (otherlv_27= 'NL:' ( (lv_nlDelay_28_0= RULE_STRING ) ) otherlv_29= ';' )? )? (otherlv_30= 'REACTION' this_DECL_SYMB_31= RULE_DECL_SYMB ( (lv_reacExpr_32_0= ruleExpression ) ) otherlv_33= ';' (otherlv_34= 'NL:' ( (lv_nlReac_35_0= RULE_STRING ) ) otherlv_36= ';' )? )? (otherlv_37= 'RELEASE' this_DECL_SYMB_38= RULE_DECL_SYMB ( (lv_relExpr_39_0= ruleExpression ) ) otherlv_40= ';' (otherlv_41= 'NL:' ( (lv_nlRel_42_0= RULE_STRING ) ) otherlv_43= ';' )? )? otherlv_44= 'END_REQ' ) )
            // InternalEdtl.g:862:2: (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' ( (lv_nlTrig_7_0= RULE_STRING ) ) otherlv_8= ';' )? )? (otherlv_9= 'INVARIANT' this_DECL_SYMB_10= RULE_DECL_SYMB ( (lv_invExpr_11_0= ruleExpression ) ) otherlv_12= ';' (otherlv_13= 'NL:' ( (lv_nlInv_14_0= RULE_STRING ) ) otherlv_15= ';' )? )? (otherlv_16= 'FINAL' this_DECL_SYMB_17= RULE_DECL_SYMB ( (lv_finalExpr_18_0= ruleExpression ) ) otherlv_19= ';' (otherlv_20= 'NL:' ( (lv_nlFinal_21_0= RULE_STRING ) ) otherlv_22= ';' )? )? (otherlv_23= 'DELAY' this_DECL_SYMB_24= RULE_DECL_SYMB ( (lv_delayExpr_25_0= ruleExpression ) ) otherlv_26= ';' (otherlv_27= 'NL:' ( (lv_nlDelay_28_0= RULE_STRING ) ) otherlv_29= ';' )? )? (otherlv_30= 'REACTION' this_DECL_SYMB_31= RULE_DECL_SYMB ( (lv_reacExpr_32_0= ruleExpression ) ) otherlv_33= ';' (otherlv_34= 'NL:' ( (lv_nlReac_35_0= RULE_STRING ) ) otherlv_36= ';' )? )? (otherlv_37= 'RELEASE' this_DECL_SYMB_38= RULE_DECL_SYMB ( (lv_relExpr_39_0= ruleExpression ) ) otherlv_40= ';' (otherlv_41= 'NL:' ( (lv_nlRel_42_0= RULE_STRING ) ) otherlv_43= ';' )? )? otherlv_44= 'END_REQ' )
            {
            // InternalEdtl.g:862:2: (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' ( (lv_nlTrig_7_0= RULE_STRING ) ) otherlv_8= ';' )? )? (otherlv_9= 'INVARIANT' this_DECL_SYMB_10= RULE_DECL_SYMB ( (lv_invExpr_11_0= ruleExpression ) ) otherlv_12= ';' (otherlv_13= 'NL:' ( (lv_nlInv_14_0= RULE_STRING ) ) otherlv_15= ';' )? )? (otherlv_16= 'FINAL' this_DECL_SYMB_17= RULE_DECL_SYMB ( (lv_finalExpr_18_0= ruleExpression ) ) otherlv_19= ';' (otherlv_20= 'NL:' ( (lv_nlFinal_21_0= RULE_STRING ) ) otherlv_22= ';' )? )? (otherlv_23= 'DELAY' this_DECL_SYMB_24= RULE_DECL_SYMB ( (lv_delayExpr_25_0= ruleExpression ) ) otherlv_26= ';' (otherlv_27= 'NL:' ( (lv_nlDelay_28_0= RULE_STRING ) ) otherlv_29= ';' )? )? (otherlv_30= 'REACTION' this_DECL_SYMB_31= RULE_DECL_SYMB ( (lv_reacExpr_32_0= ruleExpression ) ) otherlv_33= ';' (otherlv_34= 'NL:' ( (lv_nlReac_35_0= RULE_STRING ) ) otherlv_36= ';' )? )? (otherlv_37= 'RELEASE' this_DECL_SYMB_38= RULE_DECL_SYMB ( (lv_relExpr_39_0= ruleExpression ) ) otherlv_40= ';' (otherlv_41= 'NL:' ( (lv_nlRel_42_0= RULE_STRING ) ) otherlv_43= ';' )? )? otherlv_44= 'END_REQ' )
            // InternalEdtl.g:863:3: otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' ( (lv_nlTrig_7_0= RULE_STRING ) ) otherlv_8= ';' )? )? (otherlv_9= 'INVARIANT' this_DECL_SYMB_10= RULE_DECL_SYMB ( (lv_invExpr_11_0= ruleExpression ) ) otherlv_12= ';' (otherlv_13= 'NL:' ( (lv_nlInv_14_0= RULE_STRING ) ) otherlv_15= ';' )? )? (otherlv_16= 'FINAL' this_DECL_SYMB_17= RULE_DECL_SYMB ( (lv_finalExpr_18_0= ruleExpression ) ) otherlv_19= ';' (otherlv_20= 'NL:' ( (lv_nlFinal_21_0= RULE_STRING ) ) otherlv_22= ';' )? )? (otherlv_23= 'DELAY' this_DECL_SYMB_24= RULE_DECL_SYMB ( (lv_delayExpr_25_0= ruleExpression ) ) otherlv_26= ';' (otherlv_27= 'NL:' ( (lv_nlDelay_28_0= RULE_STRING ) ) otherlv_29= ';' )? )? (otherlv_30= 'REACTION' this_DECL_SYMB_31= RULE_DECL_SYMB ( (lv_reacExpr_32_0= ruleExpression ) ) otherlv_33= ';' (otherlv_34= 'NL:' ( (lv_nlReac_35_0= RULE_STRING ) ) otherlv_36= ';' )? )? (otherlv_37= 'RELEASE' this_DECL_SYMB_38= RULE_DECL_SYMB ( (lv_relExpr_39_0= ruleExpression ) ) otherlv_40= ';' (otherlv_41= 'NL:' ( (lv_nlRel_42_0= RULE_STRING ) ) otherlv_43= ';' )? )? otherlv_44= 'END_REQ'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getREQKeyword_0());
            		
            // InternalEdtl.g:867:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:868:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:868:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:869:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.edtl.Edtl.ID");
            				

            }


            }

            // InternalEdtl.g:885:3: (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' ( (lv_nlTrig_7_0= RULE_STRING ) ) otherlv_8= ';' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEdtl.g:886:4: otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' ( (lv_nlTrig_7_0= RULE_STRING ) ) otherlv_8= ';' )?
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getTRIGGERKeyword_2_0());
                    			
                    this_DECL_SYMB_3=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

                    				newLeafNode(this_DECL_SYMB_3, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_2_1());
                    			
                    // InternalEdtl.g:894:4: ( (lv_trigExpr_4_0= ruleExpression ) )
                    // InternalEdtl.g:895:5: (lv_trigExpr_4_0= ruleExpression )
                    {
                    // InternalEdtl.g:895:5: (lv_trigExpr_4_0= ruleExpression )
                    // InternalEdtl.g:896:6: lv_trigExpr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getTrigExprExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_trigExpr_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"trigExpr",
                    							lv_trigExpr_4_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_3());
                    			
                    // InternalEdtl.g:917:4: (otherlv_6= 'NL:' ( (lv_nlTrig_7_0= RULE_STRING ) ) otherlv_8= ';' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==42) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEdtl.g:918:5: otherlv_6= 'NL:' ( (lv_nlTrig_7_0= RULE_STRING ) ) otherlv_8= ';'
                            {
                            otherlv_6=(Token)match(input,42,FOLLOW_25); 

                            					newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getNLKeyword_2_4_0());
                            				
                            // InternalEdtl.g:922:5: ( (lv_nlTrig_7_0= RULE_STRING ) )
                            // InternalEdtl.g:923:6: (lv_nlTrig_7_0= RULE_STRING )
                            {
                            // InternalEdtl.g:923:6: (lv_nlTrig_7_0= RULE_STRING )
                            // InternalEdtl.g:924:7: lv_nlTrig_7_0= RULE_STRING
                            {
                            lv_nlTrig_7_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            							newLeafNode(lv_nlTrig_7_0, grammarAccess.getRequirementAccess().getNlTrigSTRINGTerminalRuleCall_2_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlTrig",
                            								lv_nlTrig_7_0,
                            								"su.nsk.iae.edtl.Edtl.STRING");
                            						

                            }


                            }

                            otherlv_8=(Token)match(input,26,FOLLOW_26); 

                            					newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:946:3: (otherlv_9= 'INVARIANT' this_DECL_SYMB_10= RULE_DECL_SYMB ( (lv_invExpr_11_0= ruleExpression ) ) otherlv_12= ';' (otherlv_13= 'NL:' ( (lv_nlInv_14_0= RULE_STRING ) ) otherlv_15= ';' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEdtl.g:947:4: otherlv_9= 'INVARIANT' this_DECL_SYMB_10= RULE_DECL_SYMB ( (lv_invExpr_11_0= ruleExpression ) ) otherlv_12= ';' (otherlv_13= 'NL:' ( (lv_nlInv_14_0= RULE_STRING ) ) otherlv_15= ';' )?
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getINVARIANTKeyword_3_0());
                    			
                    this_DECL_SYMB_10=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

                    				newLeafNode(this_DECL_SYMB_10, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_3_1());
                    			
                    // InternalEdtl.g:955:4: ( (lv_invExpr_11_0= ruleExpression ) )
                    // InternalEdtl.g:956:5: (lv_invExpr_11_0= ruleExpression )
                    {
                    // InternalEdtl.g:956:5: (lv_invExpr_11_0= ruleExpression )
                    // InternalEdtl.g:957:6: lv_invExpr_11_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getInvExprExpressionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_invExpr_11_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"invExpr",
                    							lv_invExpr_11_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getSemicolonKeyword_3_3());
                    			
                    // InternalEdtl.g:978:4: (otherlv_13= 'NL:' ( (lv_nlInv_14_0= RULE_STRING ) ) otherlv_15= ';' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==42) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEdtl.g:979:5: otherlv_13= 'NL:' ( (lv_nlInv_14_0= RULE_STRING ) ) otherlv_15= ';'
                            {
                            otherlv_13=(Token)match(input,42,FOLLOW_25); 

                            					newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getNLKeyword_3_4_0());
                            				
                            // InternalEdtl.g:983:5: ( (lv_nlInv_14_0= RULE_STRING ) )
                            // InternalEdtl.g:984:6: (lv_nlInv_14_0= RULE_STRING )
                            {
                            // InternalEdtl.g:984:6: (lv_nlInv_14_0= RULE_STRING )
                            // InternalEdtl.g:985:7: lv_nlInv_14_0= RULE_STRING
                            {
                            lv_nlInv_14_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            							newLeafNode(lv_nlInv_14_0, grammarAccess.getRequirementAccess().getNlInvSTRINGTerminalRuleCall_3_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlInv",
                            								lv_nlInv_14_0,
                            								"su.nsk.iae.edtl.Edtl.STRING");
                            						

                            }


                            }

                            otherlv_15=(Token)match(input,26,FOLLOW_28); 

                            					newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getSemicolonKeyword_3_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:1007:3: (otherlv_16= 'FINAL' this_DECL_SYMB_17= RULE_DECL_SYMB ( (lv_finalExpr_18_0= ruleExpression ) ) otherlv_19= ';' (otherlv_20= 'NL:' ( (lv_nlFinal_21_0= RULE_STRING ) ) otherlv_22= ';' )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEdtl.g:1008:4: otherlv_16= 'FINAL' this_DECL_SYMB_17= RULE_DECL_SYMB ( (lv_finalExpr_18_0= ruleExpression ) ) otherlv_19= ';' (otherlv_20= 'NL:' ( (lv_nlFinal_21_0= RULE_STRING ) ) otherlv_22= ';' )?
                    {
                    otherlv_16=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getFINALKeyword_4_0());
                    			
                    this_DECL_SYMB_17=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

                    				newLeafNode(this_DECL_SYMB_17, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_4_1());
                    			
                    // InternalEdtl.g:1016:4: ( (lv_finalExpr_18_0= ruleExpression ) )
                    // InternalEdtl.g:1017:5: (lv_finalExpr_18_0= ruleExpression )
                    {
                    // InternalEdtl.g:1017:5: (lv_finalExpr_18_0= ruleExpression )
                    // InternalEdtl.g:1018:6: lv_finalExpr_18_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getFinalExprExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_finalExpr_18_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"finalExpr",
                    							lv_finalExpr_18_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getSemicolonKeyword_4_3());
                    			
                    // InternalEdtl.g:1039:4: (otherlv_20= 'NL:' ( (lv_nlFinal_21_0= RULE_STRING ) ) otherlv_22= ';' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==42) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEdtl.g:1040:5: otherlv_20= 'NL:' ( (lv_nlFinal_21_0= RULE_STRING ) ) otherlv_22= ';'
                            {
                            otherlv_20=(Token)match(input,42,FOLLOW_25); 

                            					newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getNLKeyword_4_4_0());
                            				
                            // InternalEdtl.g:1044:5: ( (lv_nlFinal_21_0= RULE_STRING ) )
                            // InternalEdtl.g:1045:6: (lv_nlFinal_21_0= RULE_STRING )
                            {
                            // InternalEdtl.g:1045:6: (lv_nlFinal_21_0= RULE_STRING )
                            // InternalEdtl.g:1046:7: lv_nlFinal_21_0= RULE_STRING
                            {
                            lv_nlFinal_21_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            							newLeafNode(lv_nlFinal_21_0, grammarAccess.getRequirementAccess().getNlFinalSTRINGTerminalRuleCall_4_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlFinal",
                            								lv_nlFinal_21_0,
                            								"su.nsk.iae.edtl.Edtl.STRING");
                            						

                            }


                            }

                            otherlv_22=(Token)match(input,26,FOLLOW_30); 

                            					newLeafNode(otherlv_22, grammarAccess.getRequirementAccess().getSemicolonKeyword_4_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:1068:3: (otherlv_23= 'DELAY' this_DECL_SYMB_24= RULE_DECL_SYMB ( (lv_delayExpr_25_0= ruleExpression ) ) otherlv_26= ';' (otherlv_27= 'NL:' ( (lv_nlDelay_28_0= RULE_STRING ) ) otherlv_29= ';' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEdtl.g:1069:4: otherlv_23= 'DELAY' this_DECL_SYMB_24= RULE_DECL_SYMB ( (lv_delayExpr_25_0= ruleExpression ) ) otherlv_26= ';' (otherlv_27= 'NL:' ( (lv_nlDelay_28_0= RULE_STRING ) ) otherlv_29= ';' )?
                    {
                    otherlv_23=(Token)match(input,45,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getDELAYKeyword_5_0());
                    			
                    this_DECL_SYMB_24=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

                    				newLeafNode(this_DECL_SYMB_24, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_5_1());
                    			
                    // InternalEdtl.g:1077:4: ( (lv_delayExpr_25_0= ruleExpression ) )
                    // InternalEdtl.g:1078:5: (lv_delayExpr_25_0= ruleExpression )
                    {
                    // InternalEdtl.g:1078:5: (lv_delayExpr_25_0= ruleExpression )
                    // InternalEdtl.g:1079:6: lv_delayExpr_25_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDelayExprExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_delayExpr_25_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"delayExpr",
                    							lv_delayExpr_25_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,26,FOLLOW_31); 

                    				newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getSemicolonKeyword_5_3());
                    			
                    // InternalEdtl.g:1100:4: (otherlv_27= 'NL:' ( (lv_nlDelay_28_0= RULE_STRING ) ) otherlv_29= ';' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==42) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalEdtl.g:1101:5: otherlv_27= 'NL:' ( (lv_nlDelay_28_0= RULE_STRING ) ) otherlv_29= ';'
                            {
                            otherlv_27=(Token)match(input,42,FOLLOW_25); 

                            					newLeafNode(otherlv_27, grammarAccess.getRequirementAccess().getNLKeyword_5_4_0());
                            				
                            // InternalEdtl.g:1105:5: ( (lv_nlDelay_28_0= RULE_STRING ) )
                            // InternalEdtl.g:1106:6: (lv_nlDelay_28_0= RULE_STRING )
                            {
                            // InternalEdtl.g:1106:6: (lv_nlDelay_28_0= RULE_STRING )
                            // InternalEdtl.g:1107:7: lv_nlDelay_28_0= RULE_STRING
                            {
                            lv_nlDelay_28_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            							newLeafNode(lv_nlDelay_28_0, grammarAccess.getRequirementAccess().getNlDelaySTRINGTerminalRuleCall_5_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlDelay",
                            								lv_nlDelay_28_0,
                            								"su.nsk.iae.edtl.Edtl.STRING");
                            						

                            }


                            }

                            otherlv_29=(Token)match(input,26,FOLLOW_32); 

                            					newLeafNode(otherlv_29, grammarAccess.getRequirementAccess().getSemicolonKeyword_5_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:1129:3: (otherlv_30= 'REACTION' this_DECL_SYMB_31= RULE_DECL_SYMB ( (lv_reacExpr_32_0= ruleExpression ) ) otherlv_33= ';' (otherlv_34= 'NL:' ( (lv_nlReac_35_0= RULE_STRING ) ) otherlv_36= ';' )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEdtl.g:1130:4: otherlv_30= 'REACTION' this_DECL_SYMB_31= RULE_DECL_SYMB ( (lv_reacExpr_32_0= ruleExpression ) ) otherlv_33= ';' (otherlv_34= 'NL:' ( (lv_nlReac_35_0= RULE_STRING ) ) otherlv_36= ';' )?
                    {
                    otherlv_30=(Token)match(input,46,FOLLOW_5); 

                    				newLeafNode(otherlv_30, grammarAccess.getRequirementAccess().getREACTIONKeyword_6_0());
                    			
                    this_DECL_SYMB_31=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

                    				newLeafNode(this_DECL_SYMB_31, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_6_1());
                    			
                    // InternalEdtl.g:1138:4: ( (lv_reacExpr_32_0= ruleExpression ) )
                    // InternalEdtl.g:1139:5: (lv_reacExpr_32_0= ruleExpression )
                    {
                    // InternalEdtl.g:1139:5: (lv_reacExpr_32_0= ruleExpression )
                    // InternalEdtl.g:1140:6: lv_reacExpr_32_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getReacExprExpressionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_reacExpr_32_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"reacExpr",
                    							lv_reacExpr_32_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,26,FOLLOW_33); 

                    				newLeafNode(otherlv_33, grammarAccess.getRequirementAccess().getSemicolonKeyword_6_3());
                    			
                    // InternalEdtl.g:1161:4: (otherlv_34= 'NL:' ( (lv_nlReac_35_0= RULE_STRING ) ) otherlv_36= ';' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==42) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalEdtl.g:1162:5: otherlv_34= 'NL:' ( (lv_nlReac_35_0= RULE_STRING ) ) otherlv_36= ';'
                            {
                            otherlv_34=(Token)match(input,42,FOLLOW_25); 

                            					newLeafNode(otherlv_34, grammarAccess.getRequirementAccess().getNLKeyword_6_4_0());
                            				
                            // InternalEdtl.g:1166:5: ( (lv_nlReac_35_0= RULE_STRING ) )
                            // InternalEdtl.g:1167:6: (lv_nlReac_35_0= RULE_STRING )
                            {
                            // InternalEdtl.g:1167:6: (lv_nlReac_35_0= RULE_STRING )
                            // InternalEdtl.g:1168:7: lv_nlReac_35_0= RULE_STRING
                            {
                            lv_nlReac_35_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            							newLeafNode(lv_nlReac_35_0, grammarAccess.getRequirementAccess().getNlReacSTRINGTerminalRuleCall_6_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlReac",
                            								lv_nlReac_35_0,
                            								"su.nsk.iae.edtl.Edtl.STRING");
                            						

                            }


                            }

                            otherlv_36=(Token)match(input,26,FOLLOW_34); 

                            					newLeafNode(otherlv_36, grammarAccess.getRequirementAccess().getSemicolonKeyword_6_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:1190:3: (otherlv_37= 'RELEASE' this_DECL_SYMB_38= RULE_DECL_SYMB ( (lv_relExpr_39_0= ruleExpression ) ) otherlv_40= ';' (otherlv_41= 'NL:' ( (lv_nlRel_42_0= RULE_STRING ) ) otherlv_43= ';' )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEdtl.g:1191:4: otherlv_37= 'RELEASE' this_DECL_SYMB_38= RULE_DECL_SYMB ( (lv_relExpr_39_0= ruleExpression ) ) otherlv_40= ';' (otherlv_41= 'NL:' ( (lv_nlRel_42_0= RULE_STRING ) ) otherlv_43= ';' )?
                    {
                    otherlv_37=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_37, grammarAccess.getRequirementAccess().getRELEASEKeyword_7_0());
                    			
                    this_DECL_SYMB_38=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

                    				newLeafNode(this_DECL_SYMB_38, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_7_1());
                    			
                    // InternalEdtl.g:1199:4: ( (lv_relExpr_39_0= ruleExpression ) )
                    // InternalEdtl.g:1200:5: (lv_relExpr_39_0= ruleExpression )
                    {
                    // InternalEdtl.g:1200:5: (lv_relExpr_39_0= ruleExpression )
                    // InternalEdtl.g:1201:6: lv_relExpr_39_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getRelExprExpressionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_relExpr_39_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"relExpr",
                    							lv_relExpr_39_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,26,FOLLOW_35); 

                    				newLeafNode(otherlv_40, grammarAccess.getRequirementAccess().getSemicolonKeyword_7_3());
                    			
                    // InternalEdtl.g:1222:4: (otherlv_41= 'NL:' ( (lv_nlRel_42_0= RULE_STRING ) ) otherlv_43= ';' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==42) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalEdtl.g:1223:5: otherlv_41= 'NL:' ( (lv_nlRel_42_0= RULE_STRING ) ) otherlv_43= ';'
                            {
                            otherlv_41=(Token)match(input,42,FOLLOW_25); 

                            					newLeafNode(otherlv_41, grammarAccess.getRequirementAccess().getNLKeyword_7_4_0());
                            				
                            // InternalEdtl.g:1227:5: ( (lv_nlRel_42_0= RULE_STRING ) )
                            // InternalEdtl.g:1228:6: (lv_nlRel_42_0= RULE_STRING )
                            {
                            // InternalEdtl.g:1228:6: (lv_nlRel_42_0= RULE_STRING )
                            // InternalEdtl.g:1229:7: lv_nlRel_42_0= RULE_STRING
                            {
                            lv_nlRel_42_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            							newLeafNode(lv_nlRel_42_0, grammarAccess.getRequirementAccess().getNlRelSTRINGTerminalRuleCall_7_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlRel",
                            								lv_nlRel_42_0,
                            								"su.nsk.iae.edtl.Edtl.STRING");
                            						

                            }


                            }

                            otherlv_43=(Token)match(input,26,FOLLOW_36); 

                            					newLeafNode(otherlv_43, grammarAccess.getRequirementAccess().getSemicolonKeyword_7_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_44=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_44, grammarAccess.getRequirementAccess().getEND_REQKeyword_8());
            		

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleVariable"
    // InternalEdtl.g:1259:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEdtl.g:1259:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEdtl.g:1260:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalEdtl.g:1266:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEdtl.g:1272:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEdtl.g:1273:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEdtl.g:1273:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEdtl.g:1274:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEdtl.g:1274:3: (lv_name_0_0= RULE_ID )
            // InternalEdtl.g:1275:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"su.nsk.iae.edtl.Edtl.ID");
            			

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalEdtl.g:1294:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEdtl.g:1294:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEdtl.g:1295:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEdtl.g:1301:1: ruleExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_orOp_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1307:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalEdtl.g:1308:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalEdtl.g:1308:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalEdtl.g:1309:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1317:3: ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_OR_OPERATOR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEdtl.g:1318:4: () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalEdtl.g:1318:4: ()
            	    // InternalEdtl.g:1319:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1325:4: ( (lv_orOp_2_0= RULE_OR_OPERATOR ) )
            	    // InternalEdtl.g:1326:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    {
            	    // InternalEdtl.g:1326:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    // InternalEdtl.g:1327:6: lv_orOp_2_0= RULE_OR_OPERATOR
            	    {
            	    lv_orOp_2_0=(Token)match(input,RULE_OR_OPERATOR,FOLLOW_16); 

            	    						newLeafNode(lv_orOp_2_0, grammarAccess.getExpressionAccess().getOrOpOR_OPERATORTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExpressionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"orOp",
            	    							lv_orOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.OR_OPERATOR");
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1343:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalEdtl.g:1344:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalEdtl.g:1344:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalEdtl.g:1345:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.XorExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalEdtl.g:1367:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalEdtl.g:1367:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalEdtl.g:1368:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression; 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalEdtl.g:1374:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1380:2: ( (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEdtl.g:1381:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEdtl.g:1381:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEdtl.g:1382:3: this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1390:3: ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEdtl.g:1391:4: () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEdtl.g:1391:4: ()
            	    // InternalEdtl.g:1392:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_16);
            	    ruleXOR_OPERATOR();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalEdtl.g:1405:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEdtl.g:1406:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEdtl.g:1406:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEdtl.g:1407:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXOR_OPERATOR"
    // InternalEdtl.g:1429:1: entryRuleXOR_OPERATOR returns [String current=null] : iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF ;
    public final String entryRuleXOR_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXOR_OPERATOR = null;


        try {
            // InternalEdtl.g:1429:52: (iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF )
            // InternalEdtl.g:1430:2: iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getXOR_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXOR_OPERATOR=ruleXOR_OPERATOR();

            state._fsp--;

             current =iv_ruleXOR_OPERATOR.getText(); 
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
    // $ANTLR end "entryRuleXOR_OPERATOR"


    // $ANTLR start "ruleXOR_OPERATOR"
    // InternalEdtl.g:1436:1: ruleXOR_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'XOR' ;
    public final AntlrDatatypeRuleToken ruleXOR_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1442:2: (kw= 'XOR' )
            // InternalEdtl.g:1443:2: kw= 'XOR'
            {
            kw=(Token)match(input,49,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getXOR_OPERATORAccess().getXORKeyword());
            	

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
    // $ANTLR end "ruleXOR_OPERATOR"


    // $ANTLR start "entryRuleAndExpression"
    // InternalEdtl.g:1451:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalEdtl.g:1451:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalEdtl.g:1452:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalEdtl.g:1458:1: ruleAndExpression returns [EObject current=null] : (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompExpression_0 = null;

        AntlrDatatypeRuleToken lv_andOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1464:2: ( (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) )
            // InternalEdtl.g:1465:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            {
            // InternalEdtl.g:1465:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            // InternalEdtl.g:1466:3: this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_CompExpression_0=ruleCompExpression();

            state._fsp--;


            			current = this_CompExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1474:3: ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }
                else if ( (LA26_0==51) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEdtl.g:1475:4: () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) )
            	    {
            	    // InternalEdtl.g:1475:4: ()
            	    // InternalEdtl.g:1476:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1482:4: ( (lv_andOp_2_0= ruleAND_OPERATOR ) )
            	    // InternalEdtl.g:1483:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    {
            	    // InternalEdtl.g:1483:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    // InternalEdtl.g:1484:6: lv_andOp_2_0= ruleAND_OPERATOR
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_andOp_2_0=ruleAND_OPERATOR();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"andOp",
            	    							lv_andOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.AND_OPERATOR");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1501:4: ( (lv_right_3_0= ruleCompExpression ) )
            	    // InternalEdtl.g:1502:5: (lv_right_3_0= ruleCompExpression )
            	    {
            	    // InternalEdtl.g:1502:5: (lv_right_3_0= ruleCompExpression )
            	    // InternalEdtl.g:1503:6: lv_right_3_0= ruleCompExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleCompExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.CompExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAND_OPERATOR"
    // InternalEdtl.g:1525:1: entryRuleAND_OPERATOR returns [String current=null] : iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF ;
    public final String entryRuleAND_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAND_OPERATOR = null;


        try {
            // InternalEdtl.g:1525:52: (iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF )
            // InternalEdtl.g:1526:2: iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getAND_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAND_OPERATOR=ruleAND_OPERATOR();

            state._fsp--;

             current =iv_ruleAND_OPERATOR.getText(); 
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
    // $ANTLR end "entryRuleAND_OPERATOR"


    // $ANTLR start "ruleAND_OPERATOR"
    // InternalEdtl.g:1532:1: ruleAND_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= 'AND' ) ;
    public final AntlrDatatypeRuleToken ruleAND_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1538:2: ( (kw= '&&' | kw= 'AND' ) )
            // InternalEdtl.g:1539:2: (kw= '&&' | kw= 'AND' )
            {
            // InternalEdtl.g:1539:2: (kw= '&&' | kw= 'AND' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            else if ( (LA27_0==51) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalEdtl.g:1540:3: kw= '&&'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1546:3: kw= 'AND'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getANDKeyword_1());
                    		

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
    // $ANTLR end "ruleAND_OPERATOR"


    // $ANTLR start "entryRuleCompExpression"
    // InternalEdtl.g:1555:1: entryRuleCompExpression returns [EObject current=null] : iv_ruleCompExpression= ruleCompExpression EOF ;
    public final EObject entryRuleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpression = null;


        try {
            // InternalEdtl.g:1555:55: (iv_ruleCompExpression= ruleCompExpression EOF )
            // InternalEdtl.g:1556:2: iv_ruleCompExpression= ruleCompExpression EOF
            {
             newCompositeNode(grammarAccess.getCompExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompExpression=ruleCompExpression();

            state._fsp--;

             current =iv_ruleCompExpression; 
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
    // $ANTLR end "entryRuleCompExpression"


    // $ANTLR start "ruleCompExpression"
    // InternalEdtl.g:1562:1: ruleCompExpression returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EquExpression_0 = null;

        Enumerator lv_compOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1568:2: ( (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEdtl.g:1569:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEdtl.g:1569:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEdtl.g:1570:3: this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;


            			current = this_EquExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1578:3: ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case 62:
                    {
                    alt28=1;
                    }
                    break;
                case 63:
                    {
                    alt28=1;
                    }
                    break;
                case 64:
                    {
                    alt28=1;
                    }
                    break;
                case 65:
                    {
                    alt28=1;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // InternalEdtl.g:1579:4: () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEdtl.g:1579:4: ()
            	    // InternalEdtl.g:1580:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1586:4: ( (lv_compOp_2_0= ruleCompOperator ) )
            	    // InternalEdtl.g:1587:5: (lv_compOp_2_0= ruleCompOperator )
            	    {
            	    // InternalEdtl.g:1587:5: (lv_compOp_2_0= ruleCompOperator )
            	    // InternalEdtl.g:1588:6: lv_compOp_2_0= ruleCompOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_compOp_2_0=ruleCompOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"compOp",
            	    							lv_compOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.CompOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1605:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEdtl.g:1606:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEdtl.g:1606:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEdtl.g:1607:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleCompExpression"


    // $ANTLR start "entryRuleEquExpression"
    // InternalEdtl.g:1629:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalEdtl.g:1629:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalEdtl.g:1630:2: iv_ruleEquExpression= ruleEquExpression EOF
            {
             newCompositeNode(grammarAccess.getEquExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquExpression=ruleEquExpression();

            state._fsp--;

             current =iv_ruleEquExpression; 
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
    // $ANTLR end "entryRuleEquExpression"


    // $ANTLR start "ruleEquExpression"
    // InternalEdtl.g:1636:1: ruleEquExpression returns [EObject current=null] : (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) ;
    public final EObject ruleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnExpression_0 = null;

        Enumerator lv_equOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1642:2: ( (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) )
            // InternalEdtl.g:1643:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            {
            // InternalEdtl.g:1643:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            // InternalEdtl.g:1644:3: this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_UnExpression_0=ruleUnExpression();

            state._fsp--;


            			current = this_UnExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1652:3: ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=60 && LA29_0<=61)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEdtl.g:1653:4: () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) )
            	    {
            	    // InternalEdtl.g:1653:4: ()
            	    // InternalEdtl.g:1654:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1660:4: ( (lv_equOp_2_0= ruleEquOperator ) )
            	    // InternalEdtl.g:1661:5: (lv_equOp_2_0= ruleEquOperator )
            	    {
            	    // InternalEdtl.g:1661:5: (lv_equOp_2_0= ruleEquOperator )
            	    // InternalEdtl.g:1662:6: lv_equOp_2_0= ruleEquOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_equOp_2_0=ruleEquOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"equOp",
            	    							lv_equOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.EquOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1679:4: ( (lv_right_3_0= ruleUnExpression ) )
            	    // InternalEdtl.g:1680:5: (lv_right_3_0= ruleUnExpression )
            	    {
            	    // InternalEdtl.g:1680:5: (lv_right_3_0= ruleUnExpression )
            	    // InternalEdtl.g:1681:6: lv_right_3_0= ruleUnExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleUnExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.UnExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleUnOperator"
    // InternalEdtl.g:1703:1: entryRuleUnOperator returns [String current=null] : iv_ruleUnOperator= ruleUnOperator EOF ;
    public final String entryRuleUnOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnOperator = null;


        try {
            // InternalEdtl.g:1703:50: (iv_ruleUnOperator= ruleUnOperator EOF )
            // InternalEdtl.g:1704:2: iv_ruleUnOperator= ruleUnOperator EOF
            {
             newCompositeNode(grammarAccess.getUnOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnOperator=ruleUnOperator();

            state._fsp--;

             current =iv_ruleUnOperator.getText(); 
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
    // $ANTLR end "entryRuleUnOperator"


    // $ANTLR start "ruleUnOperator"
    // InternalEdtl.g:1710:1: ruleUnOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) ;
    public final AntlrDatatypeRuleToken ruleUnOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NotOperator_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1716:2: ( (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) )
            // InternalEdtl.g:1717:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            {
            // InternalEdtl.g:1717:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 56:
            case 57:
                {
                alt30=1;
                }
                break;
            case 52:
                {
                alt30=2;
                }
                break;
            case 53:
                {
                alt30=3;
                }
                break;
            case 54:
                {
                alt30=4;
                }
                break;
            case 55:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalEdtl.g:1718:3: this_NotOperator_0= ruleNotOperator
                    {

                    			newCompositeNode(grammarAccess.getUnOperatorAccess().getNotOperatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotOperator_0=ruleNotOperator();

                    state._fsp--;


                    			current.merge(this_NotOperator_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1729:3: kw= 'FE'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getFEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEdtl.g:1735:3: kw= 'RE'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getREKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalEdtl.g:1741:3: kw= 'HIGH'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getHIGHKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalEdtl.g:1747:3: kw= 'LOW'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getLOWKeyword_4());
                    		

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
    // $ANTLR end "ruleUnOperator"


    // $ANTLR start "entryRuleNotOperator"
    // InternalEdtl.g:1756:1: entryRuleNotOperator returns [String current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final String entryRuleNotOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotOperator = null;


        try {
            // InternalEdtl.g:1756:51: (iv_ruleNotOperator= ruleNotOperator EOF )
            // InternalEdtl.g:1757:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
             newCompositeNode(grammarAccess.getNotOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;

             current =iv_ruleNotOperator.getText(); 
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
    // $ANTLR end "entryRuleNotOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalEdtl.g:1763:1: ruleNotOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NOT' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleNotOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1769:2: ( (kw= 'NOT' | kw= '!' ) )
            // InternalEdtl.g:1770:2: (kw= 'NOT' | kw= '!' )
            {
            // InternalEdtl.g:1770:2: (kw= 'NOT' | kw= '!' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==56) ) {
                alt31=1;
            }
            else if ( (LA31_0==57) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalEdtl.g:1771:3: kw= 'NOT'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getNOTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1777:3: kw= '!'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1());
                    		

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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "entryRuleUnExpression"
    // InternalEdtl.g:1786:1: entryRuleUnExpression returns [EObject current=null] : iv_ruleUnExpression= ruleUnExpression EOF ;
    public final EObject entryRuleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnExpression = null;


        try {
            // InternalEdtl.g:1786:53: (iv_ruleUnExpression= ruleUnExpression EOF )
            // InternalEdtl.g:1787:2: iv_ruleUnExpression= ruleUnExpression EOF
            {
             newCompositeNode(grammarAccess.getUnExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnExpression=ruleUnExpression();

            state._fsp--;

             current =iv_ruleUnExpression; 
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
    // $ANTLR end "entryRuleUnExpression"


    // $ANTLR start "ruleUnExpression"
    // InternalEdtl.g:1793:1: ruleUnExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1799:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) )
            // InternalEdtl.g:1800:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            {
            // InternalEdtl.g:1800:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INTEGER||(LA32_0>=RULE_ID && LA32_0<=RULE_BOOLEAN_LITERAL)||LA32_0==36||LA32_0==58) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=52 && LA32_0<=57)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalEdtl.g:1801:3: this_PrimaryExpression_0= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnExpressionAccess().getPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1810:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    {
                    // InternalEdtl.g:1810:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    // InternalEdtl.g:1811:4: ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) )
                    {
                    // InternalEdtl.g:1811:4: ( (lv_unOp_1_0= ruleUnOperator ) )
                    // InternalEdtl.g:1812:5: (lv_unOp_1_0= ruleUnOperator )
                    {
                    // InternalEdtl.g:1812:5: (lv_unOp_1_0= ruleUnOperator )
                    // InternalEdtl.g:1813:6: lv_unOp_1_0= ruleUnOperator
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_unOp_1_0=ruleUnOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnExpressionRule());
                    						}
                    						set(
                    							current,
                    							"unOp",
                    							lv_unOp_1_0,
                    							"su.nsk.iae.edtl.Edtl.UnOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEdtl.g:1830:4: ( (lv_right_2_0= rulePrimaryExpression ) )
                    // InternalEdtl.g:1831:5: (lv_right_2_0= rulePrimaryExpression )
                    {
                    // InternalEdtl.g:1831:5: (lv_right_2_0= rulePrimaryExpression )
                    // InternalEdtl.g:1832:6: lv_right_2_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"su.nsk.iae.edtl.Edtl.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleUnExpression"


    // $ANTLR start "entryRuleTauExpression"
    // InternalEdtl.g:1854:1: entryRuleTauExpression returns [EObject current=null] : iv_ruleTauExpression= ruleTauExpression EOF ;
    public final EObject entryRuleTauExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTauExpression = null;


        try {
            // InternalEdtl.g:1854:54: (iv_ruleTauExpression= ruleTauExpression EOF )
            // InternalEdtl.g:1855:2: iv_ruleTauExpression= ruleTauExpression EOF
            {
             newCompositeNode(grammarAccess.getTauExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTauExpression=ruleTauExpression();

            state._fsp--;

             current =iv_ruleTauExpression; 
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
    // $ANTLR end "entryRuleTauExpression"


    // $ANTLR start "ruleTauExpression"
    // InternalEdtl.g:1861:1: ruleTauExpression returns [EObject current=null] : (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleTauExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1867:2: ( (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) )
            // InternalEdtl.g:1868:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            {
            // InternalEdtl.g:1868:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            // InternalEdtl.g:1869:3: otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getTauExpressionAccess().getTAUKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEdtl.g:1877:3: ( (lv_time_2_0= ruleTimeLiteral ) )
            // InternalEdtl.g:1878:4: (lv_time_2_0= ruleTimeLiteral )
            {
            // InternalEdtl.g:1878:4: (lv_time_2_0= ruleTimeLiteral )
            // InternalEdtl.g:1879:5: lv_time_2_0= ruleTimeLiteral
            {

            					newCompositeNode(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_time_2_0=ruleTimeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTauExpressionRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_2_0,
            						"su.nsk.iae.edtl.Edtl.TimeLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTauExpressionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTauExpression"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalEdtl.g:1904:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalEdtl.g:1904:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalEdtl.g:1905:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
            {
             newCompositeNode(grammarAccess.getTimeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeLiteral=ruleTimeLiteral();

            state._fsp--;

             current =iv_ruleTimeLiteral; 
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
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalEdtl.g:1911:1: ruleTimeLiteral returns [EObject current=null] : ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_interval_1_0=null;


        	enterRule();

        try {
            // InternalEdtl.g:1917:2: ( ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) )
            // InternalEdtl.g:1918:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            {
            // InternalEdtl.g:1918:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            // InternalEdtl.g:1919:3: ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) )
            {

            			newCompositeNode(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            ruleTIME_PREF_LITERAL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1926:3: ( (lv_interval_1_0= RULE_INTERVAL ) )
            // InternalEdtl.g:1927:4: (lv_interval_1_0= RULE_INTERVAL )
            {
            // InternalEdtl.g:1927:4: (lv_interval_1_0= RULE_INTERVAL )
            // InternalEdtl.g:1928:5: lv_interval_1_0= RULE_INTERVAL
            {
            lv_interval_1_0=(Token)match(input,RULE_INTERVAL,FOLLOW_2); 

            					newLeafNode(lv_interval_1_0, grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interval",
            						lv_interval_1_0,
            						"su.nsk.iae.edtl.Edtl.INTERVAL");
            				

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
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleTIME_PREF_LITERAL"
    // InternalEdtl.g:1948:1: entryRuleTIME_PREF_LITERAL returns [String current=null] : iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF ;
    public final String entryRuleTIME_PREF_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME_PREF_LITERAL = null;


        try {
            // InternalEdtl.g:1948:57: (iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF )
            // InternalEdtl.g:1949:2: iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getTIME_PREF_LITERALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTIME_PREF_LITERAL=ruleTIME_PREF_LITERAL();

            state._fsp--;

             current =iv_ruleTIME_PREF_LITERAL.getText(); 
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
    // $ANTLR end "entryRuleTIME_PREF_LITERAL"


    // $ANTLR start "ruleTIME_PREF_LITERAL"
    // InternalEdtl.g:1955:1: ruleTIME_PREF_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#T' ;
    public final AntlrDatatypeRuleToken ruleTIME_PREF_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1961:2: (kw= '#T' )
            // InternalEdtl.g:1962:2: kw= '#T'
            {
            kw=(Token)match(input,59,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTIME_PREF_LITERALAccess().getTKeyword());
            	

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
    // $ANTLR end "ruleTIME_PREF_LITERAL"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalEdtl.g:1970:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalEdtl.g:1970:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalEdtl.g:1971:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalEdtl.g:1977:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_constant_0_0 = null;

        EObject lv_tau_1_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_nestExpr_8_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1983:2: ( ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) )
            // InternalEdtl.g:1984:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            {
            // InternalEdtl.g:1984:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            int alt34=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
                {
                alt34=1;
                }
                break;
            case 58:
                {
                alt34=2;
                }
                break;
            case RULE_ID:
                {
                int LA34_3 = input.LA(2);

                if ( (LA34_3==36) ) {
                    alt34=4;
                }
                else if ( (LA34_3==EOF||LA34_3==RULE_OR_OPERATOR||LA34_3==26||LA34_3==34||(LA34_3>=37 && LA34_3<=38)||(LA34_3>=49 && LA34_3<=51)||(LA34_3>=60 && LA34_3<=65)) ) {
                    alt34=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalEdtl.g:1985:3: ( (lv_constant_0_0= ruleConstant ) )
                    {
                    // InternalEdtl.g:1985:3: ( (lv_constant_0_0= ruleConstant ) )
                    // InternalEdtl.g:1986:4: (lv_constant_0_0= ruleConstant )
                    {
                    // InternalEdtl.g:1986:4: (lv_constant_0_0= ruleConstant )
                    // InternalEdtl.g:1987:5: lv_constant_0_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantConstantParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constant_0_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_0_0,
                    						"su.nsk.iae.edtl.Edtl.Constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2005:3: ( (lv_tau_1_0= ruleTauExpression ) )
                    {
                    // InternalEdtl.g:2005:3: ( (lv_tau_1_0= ruleTauExpression ) )
                    // InternalEdtl.g:2006:4: (lv_tau_1_0= ruleTauExpression )
                    {
                    // InternalEdtl.g:2006:4: (lv_tau_1_0= ruleTauExpression )
                    // InternalEdtl.g:2007:5: lv_tau_1_0= ruleTauExpression
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tau_1_0=ruleTauExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"tau",
                    						lv_tau_1_0,
                    						"su.nsk.iae.edtl.Edtl.TauExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEdtl.g:2025:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalEdtl.g:2025:3: ( (otherlv_2= RULE_ID ) )
                    // InternalEdtl.g:2026:4: (otherlv_2= RULE_ID )
                    {
                    // InternalEdtl.g:2026:4: (otherlv_2= RULE_ID )
                    // InternalEdtl.g:2027:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getVCrossVarAbbrCrossReference_2_0());
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEdtl.g:2039:3: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' )
                    {
                    // InternalEdtl.g:2039:3: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' )
                    // InternalEdtl.g:2040:4: ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')'
                    {
                    // InternalEdtl.g:2040:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEdtl.g:2041:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEdtl.g:2041:5: (otherlv_3= RULE_ID )
                    // InternalEdtl.g:2042:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getMacrosMacrosCrossReference_3_0_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,36,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalEdtl.g:2057:4: ( (lv_args_5_0= ruleParamAssignmentElements ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalEdtl.g:2058:5: (lv_args_5_0= ruleParamAssignmentElements )
                            {
                            // InternalEdtl.g:2058:5: (lv_args_5_0= ruleParamAssignmentElements )
                            // InternalEdtl.g:2059:6: lv_args_5_0= ruleParamAssignmentElements
                            {

                            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsParamAssignmentElementsParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_20);
                            lv_args_5_0=ruleParamAssignmentElements();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            						}
                            						set(
                            							current,
                            							"args",
                            							lv_args_5_0,
                            							"su.nsk.iae.edtl.Edtl.ParamAssignmentElements");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEdtl.g:2082:3: (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    {
                    // InternalEdtl.g:2082:3: (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    // InternalEdtl.g:2083:4: otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalEdtl.g:2087:4: ( (lv_nestExpr_8_0= ruleExpression ) )
                    // InternalEdtl.g:2088:5: (lv_nestExpr_8_0= ruleExpression )
                    {
                    // InternalEdtl.g:2088:5: (lv_nestExpr_8_0= ruleExpression )
                    // InternalEdtl.g:2089:6: lv_nestExpr_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_nestExpr_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"nestExpr",
                    							lv_nestExpr_8_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
                    			

                    }


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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleConstant"
    // InternalEdtl.g:2115:1: entryRuleConstant returns [String current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final String entryRuleConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstant = null;


        try {
            // InternalEdtl.g:2115:48: (iv_ruleConstant= ruleConstant EOF )
            // InternalEdtl.g:2116:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant.getText(); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalEdtl.g:2122:1: ruleConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL ) ;
    public final AntlrDatatypeRuleToken ruleConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_0=null;
        Token this_BOOLEAN_LITERAL_1=null;


        	enterRule();

        try {
            // InternalEdtl.g:2128:2: ( (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL ) )
            // InternalEdtl.g:2129:2: (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL )
            {
            // InternalEdtl.g:2129:2: (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INTEGER) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_BOOLEAN_LITERAL) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalEdtl.g:2130:3: this_INTEGER_0= RULE_INTEGER
                    {
                    this_INTEGER_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    			current.merge(this_INTEGER_0);
                    		

                    			newLeafNode(this_INTEGER_0, grammarAccess.getConstantAccess().getINTEGERTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2138:3: this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL
                    {
                    this_BOOLEAN_LITERAL_1=(Token)match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 

                    			current.merge(this_BOOLEAN_LITERAL_1);
                    		

                    			newLeafNode(this_BOOLEAN_LITERAL_1, grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleParamAssignmentElements"
    // InternalEdtl.g:2149:1: entryRuleParamAssignmentElements returns [EObject current=null] : iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF ;
    public final EObject entryRuleParamAssignmentElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamAssignmentElements = null;


        try {
            // InternalEdtl.g:2149:64: (iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF )
            // InternalEdtl.g:2150:2: iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF
            {
             newCompositeNode(grammarAccess.getParamAssignmentElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamAssignmentElements=ruleParamAssignmentElements();

            state._fsp--;

             current =iv_ruleParamAssignmentElements; 
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
    // $ANTLR end "entryRuleParamAssignmentElements"


    // $ANTLR start "ruleParamAssignmentElements"
    // InternalEdtl.g:2156:1: ruleParamAssignmentElements returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleParamAssignmentElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEdtl.g:2162:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalEdtl.g:2163:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalEdtl.g:2163:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalEdtl.g:2164:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalEdtl.g:2164:3: ( (otherlv_0= RULE_ID ) )
            // InternalEdtl.g:2165:4: (otherlv_0= RULE_ID )
            {
            // InternalEdtl.g:2165:4: (otherlv_0= RULE_ID )
            // InternalEdtl.g:2166:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamAssignmentElementsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getParamAssignmentElementsAccess().getElementsCrossVarAbbrCrossReference_0_0());
            				

            }


            }

            // InternalEdtl.g:2177:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==39) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalEdtl.g:2178:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamAssignmentElementsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalEdtl.g:2182:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalEdtl.g:2183:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalEdtl.g:2183:5: (otherlv_2= RULE_ID )
            	    // InternalEdtl.g:2184:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParamAssignmentElementsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_2, grammarAccess.getParamAssignmentElementsAccess().getElementsCrossVarAbbrCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleParamAssignmentElements"


    // $ANTLR start "ruleEquOperator"
    // InternalEdtl.g:2200:1: ruleEquOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEquOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEdtl.g:2206:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // InternalEdtl.g:2207:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalEdtl.g:2207:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==60) ) {
                alt37=1;
            }
            else if ( (LA37_0==61) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalEdtl.g:2208:3: (enumLiteral_0= '==' )
                    {
                    // InternalEdtl.g:2208:3: (enumLiteral_0= '==' )
                    // InternalEdtl.g:2209:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2216:3: (enumLiteral_1= '<>' )
                    {
                    // InternalEdtl.g:2216:3: (enumLiteral_1= '<>' )
                    // InternalEdtl.g:2217:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleEquOperator"


    // $ANTLR start "ruleCompOperator"
    // InternalEdtl.g:2227:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEdtl.g:2233:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalEdtl.g:2234:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalEdtl.g:2234:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt38=1;
                }
                break;
            case 63:
                {
                alt38=2;
                }
                break;
            case 64:
                {
                alt38=3;
                }
                break;
            case 65:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalEdtl.g:2235:3: (enumLiteral_0= '<' )
                    {
                    // InternalEdtl.g:2235:3: (enumLiteral_0= '<' )
                    // InternalEdtl.g:2236:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2243:3: (enumLiteral_1= '>' )
                    {
                    // InternalEdtl.g:2243:3: (enumLiteral_1= '>' )
                    // InternalEdtl.g:2244:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEdtl.g:2251:3: (enumLiteral_2= '<=' )
                    {
                    // InternalEdtl.g:2251:3: (enumLiteral_2= '<=' )
                    // InternalEdtl.g:2252:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEdtl.g:2259:3: (enumLiteral_3= '>=' )
                    {
                    // InternalEdtl.g:2259:3: (enumLiteral_3= '>=' )
                    // InternalEdtl.g:2260:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleCompOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010B11000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000A000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000028000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x07F00010000001A0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001FA0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001FC0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001F80000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001F40000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001E40000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001C40000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001840000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x04000010000001A0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000800L});

}