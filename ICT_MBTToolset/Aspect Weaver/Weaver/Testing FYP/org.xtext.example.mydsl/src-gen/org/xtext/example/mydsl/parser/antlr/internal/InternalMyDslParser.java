package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mapping'", "'{'", "'}'", "'let'", "':'", "','", "'->'", "'::'", "'aspect'", "'import_mapping'", "'pointcut'", "'context'", "'('", "')'", "'Boolean'", "'String'", "'int'", "'float'", "'double'", "'advice'", "'pre'", "'post'", "'inv'", "'and'", "'or'", "'xor'", "'intro'", "'select'", "'exp:OCLExpression'", "'|'", "'exp.oclIsTypeOf(thenExp)'", "'exp.oclIsTypeOf(ifExp)'", "'exp.condition.refferedVariable'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_aspect_0_0= ruleAspect ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_aspect_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_aspect_0_0= ruleAspect ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_aspect_0_0= ruleAspect ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_aspect_0_0= ruleAspect ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_aspect_0_0= ruleAspect )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_aspect_0_0= ruleAspect )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:3: lv_aspect_0_0= ruleAspect
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getAspectAspectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAspect_in_ruleModel130);
            lv_aspect_0_0=ruleAspect();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"aspect",
                    		lv_aspect_0_0, 
                    		"Aspect");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAspect"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:106:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:2: (iv_ruleAspect= ruleAspect EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:2: iv_ruleAspect= ruleAspect EOF
            {
             newCompositeNode(grammarAccess.getAspectRule()); 
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect165);
            iv_ruleAspect=ruleAspect();

            state._fsp--;

             current =iv_ruleAspect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect175); 

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
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: ruleAspect returns [EObject current=null] : (this_Mapping_0= ruleMapping | this_AspectDefinition_1= ruleAspectDefinition ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        EObject this_Mapping_0 = null;

        EObject this_AspectDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:28: ( (this_Mapping_0= ruleMapping | this_AspectDefinition_1= ruleAspectDefinition ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: (this_Mapping_0= ruleMapping | this_AspectDefinition_1= ruleAspectDefinition )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: (this_Mapping_0= ruleMapping | this_AspectDefinition_1= ruleAspectDefinition )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:5: this_Mapping_0= ruleMapping
                    {
                     
                            newCompositeNode(grammarAccess.getAspectAccess().getMappingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMapping_in_ruleAspect222);
                    this_Mapping_0=ruleMapping();

                    state._fsp--;

                     
                            current = this_Mapping_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:130:5: this_AspectDefinition_1= ruleAspectDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getAspectAccess().getAspectDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAspectDefinition_in_ruleAspect249);
                    this_AspectDefinition_1=ruleAspectDefinition();

                    state._fsp--;

                     
                            current = this_AspectDefinition_1; 
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
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleMapping"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:146:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping284);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping294); 

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:155:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' ( (lv_mappingname_1_0= ruleMappingName ) ) otherlv_2= '{' ruleletExpression otherlv_4= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappingname_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:28: ( (otherlv_0= 'mapping' ( (lv_mappingname_1_0= ruleMappingName ) ) otherlv_2= '{' ruleletExpression otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:159:1: (otherlv_0= 'mapping' ( (lv_mappingname_1_0= ruleMappingName ) ) otherlv_2= '{' ruleletExpression otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:159:1: (otherlv_0= 'mapping' ( (lv_mappingname_1_0= ruleMappingName ) ) otherlv_2= '{' ruleletExpression otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:159:3: otherlv_0= 'mapping' ( (lv_mappingname_1_0= ruleMappingName ) ) otherlv_2= '{' ruleletExpression otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMapping331); 

                	newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:1: ( (lv_mappingname_1_0= ruleMappingName ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:164:1: (lv_mappingname_1_0= ruleMappingName )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:164:1: (lv_mappingname_1_0= ruleMappingName )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:165:3: lv_mappingname_1_0= ruleMappingName
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getMappingnameMappingNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMappingName_in_ruleMapping352);
            lv_mappingname_1_0=ruleMappingName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	        }
                   		set(
                   			current, 
                   			"mappingname",
                    		lv_mappingname_1_0, 
                    		"MappingName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMapping364); 

                	newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getMappingAccess().getLetExpressionParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleletExpression_in_ruleMapping380);
            ruleletExpression();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMapping391); 

                	newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleletExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:1: entryRuleletExpression returns [String current=null] : iv_ruleletExpression= ruleletExpression EOF ;
    public final String entryRuleletExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleletExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:206:2: (iv_ruleletExpression= ruleletExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:207:2: iv_ruleletExpression= ruleletExpression EOF
            {
             newCompositeNode(grammarAccess.getLetExpressionRule()); 
            pushFollow(FOLLOW_ruleletExpression_in_entryRuleletExpression428);
            iv_ruleletExpression=ruleletExpression();

            state._fsp--;

             current =iv_ruleletExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletExpression439); 

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
    // $ANTLR end "entryRuleletExpression"


    // $ANTLR start "ruleletExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:214:1: ruleletExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'let' this_letVarName_1= ruleletVarName kw= ':' kw= '{' (this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )* ) kw= '}' ) | (kw= 'let' this_letVarName_9= ruleletVarName kw= '->' this_letVarName_11= ruleletVarName kw= ':' kw= '{' (this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA ) (kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA ) )* kw= '}' ) | (kw= 'let' this_letVarName_23= ruleletVarName kw= '->' this_letVarNameArray_25= ruleletVarNameArray kw= ':' kw= '{' (this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}' ) (kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' ) )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleletExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_letVarName_1 = null;

        AntlrDatatypeRuleToken this_Operation_4 = null;

        AntlrDatatypeRuleToken this_Operation_6 = null;

        AntlrDatatypeRuleToken this_letVarName_9 = null;

        AntlrDatatypeRuleToken this_letVarName_11 = null;

        AntlrDatatypeRuleToken this_COA_14 = null;

        AntlrDatatypeRuleToken this_SCOA_16 = null;

        AntlrDatatypeRuleToken this_COA_18 = null;

        AntlrDatatypeRuleToken this_SCOA_20 = null;

        AntlrDatatypeRuleToken this_letVarName_23 = null;

        AntlrDatatypeRuleToken this_letVarNameArray_25 = null;

        AntlrDatatypeRuleToken this_COA_28 = null;

        AntlrDatatypeRuleToken this_COA_31 = null;

        AntlrDatatypeRuleToken this_COA_33 = null;

        AntlrDatatypeRuleToken this_COA_36 = null;

        AntlrDatatypeRuleToken this_COA_39 = null;

        AntlrDatatypeRuleToken this_COA_41 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:217:28: ( ( (kw= 'let' this_letVarName_1= ruleletVarName kw= ':' kw= '{' (this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )* ) kw= '}' ) | (kw= 'let' this_letVarName_9= ruleletVarName kw= '->' this_letVarName_11= ruleletVarName kw= ':' kw= '{' (this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA ) (kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA ) )* kw= '}' ) | (kw= 'let' this_letVarName_23= ruleletVarName kw= '->' this_letVarNameArray_25= ruleletVarNameArray kw= ':' kw= '{' (this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}' ) (kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' ) )* kw= '}' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:1: ( (kw= 'let' this_letVarName_1= ruleletVarName kw= ':' kw= '{' (this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )* ) kw= '}' ) | (kw= 'let' this_letVarName_9= ruleletVarName kw= '->' this_letVarName_11= ruleletVarName kw= ':' kw= '{' (this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA ) (kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA ) )* kw= '}' ) | (kw= 'let' this_letVarName_23= ruleletVarName kw= '->' this_letVarNameArray_25= ruleletVarNameArray kw= ':' kw= '{' (this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}' ) (kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' ) )* kw= '}' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:1: ( (kw= 'let' this_letVarName_1= ruleletVarName kw= ':' kw= '{' (this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )* ) kw= '}' ) | (kw= 'let' this_letVarName_9= ruleletVarName kw= '->' this_letVarName_11= ruleletVarName kw= ':' kw= '{' (this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA ) (kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA ) )* kw= '}' ) | (kw= 'let' this_letVarName_23= ruleletVarName kw= '->' this_letVarNameArray_25= ruleletVarNameArray kw= ':' kw= '{' (this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}' ) (kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' ) )* kw= '}' ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:2: (kw= 'let' this_letVarName_1= ruleletVarName kw= ':' kw= '{' (this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )* ) kw= '}' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:2: (kw= 'let' this_letVarName_1= ruleletVarName kw= ':' kw= '{' (this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )* ) kw= '}' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:2: kw= 'let' this_letVarName_1= ruleletVarName kw= ':' kw= '{' (this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )* ) kw= '}'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleletExpression478); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getLetKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleletVarName_in_ruleletExpression500);
                    this_letVarName_1=ruleletVarName();

                    state._fsp--;


                    		current.merge(this_letVarName_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleletExpression518); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getColonKeyword_0_2()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleletExpression531); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_0_3()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:1: (this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )* )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:5: this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )*
                    {
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getOperationParserRuleCall_0_4_0()); 
                        
                    pushFollow(FOLLOW_ruleOperation_in_ruleletExpression554);
                    this_Operation_4=ruleOperation();

                    state._fsp--;


                    		current.merge(this_Operation_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:258:1: (kw= ',' this_Operation_6= ruleOperation )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:259:2: kw= ',' this_Operation_6= ruleOperation
                    	    {
                    	    kw=(Token)match(input,16,FOLLOW_16_in_ruleletExpression573); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getCommaKeyword_0_4_1_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getLetExpressionAccess().getOperationParserRuleCall_0_4_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleOperation_in_ruleletExpression595);
                    	    this_Operation_6=ruleOperation();

                    	    state._fsp--;


                    	    		current.merge(this_Operation_6);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }

                    kw=(Token)match(input,13,FOLLOW_13_in_ruleletExpression616); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_0_5()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:282:6: (kw= 'let' this_letVarName_9= ruleletVarName kw= '->' this_letVarName_11= ruleletVarName kw= ':' kw= '{' (this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA ) (kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA ) )* kw= '}' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:282:6: (kw= 'let' this_letVarName_9= ruleletVarName kw= '->' this_letVarName_11= ruleletVarName kw= ':' kw= '{' (this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA ) (kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA ) )* kw= '}' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:2: kw= 'let' this_letVarName_9= ruleletVarName kw= '->' this_letVarName_11= ruleletVarName kw= ':' kw= '{' (this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA ) (kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA ) )* kw= '}'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleletExpression637); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getLetKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleletVarName_in_ruleletExpression659);
                    this_letVarName_9=ruleletVarName();

                    state._fsp--;


                    		current.merge(this_letVarName_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleletExpression677); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleletVarName_in_ruleletExpression699);
                    this_letVarName_11=ruleletVarName();

                    state._fsp--;


                    		current.merge(this_letVarName_11);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleletExpression717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getColonKeyword_1_4()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleletExpression730); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_1_5()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:328:1: (this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:329:5: this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA
                    {
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_1_6_0()); 
                        
                    pushFollow(FOLLOW_ruleCOA_in_ruleletExpression753);
                    this_COA_14=ruleCOA();

                    state._fsp--;


                    		current.merge(this_COA_14);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleletExpression771); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_6_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getSCOAParserRuleCall_1_6_2()); 
                        
                    pushFollow(FOLLOW_ruleSCOA_in_ruleletExpression793);
                    this_SCOA_16=ruleSCOA();

                    state._fsp--;


                    		current.merge(this_SCOA_16);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:2: (kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:2: kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA )
                    	    {
                    	    kw=(Token)match(input,16,FOLLOW_16_in_ruleletExpression813); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getCommaKeyword_1_7_0()); 
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:1: (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:5: this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_1_7_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleCOA_in_ruleletExpression836);
                    	    this_COA_18=ruleCOA();

                    	    state._fsp--;


                    	    		current.merge(this_COA_18);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    kw=(Token)match(input,17,FOLLOW_17_in_ruleletExpression854); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_7_1_1()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getLetExpressionAccess().getSCOAParserRuleCall_1_7_1_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSCOA_in_ruleletExpression876);
                    	    this_SCOA_20=ruleSCOA();

                    	    state._fsp--;


                    	    		current.merge(this_SCOA_20);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    kw=(Token)match(input,13,FOLLOW_13_in_ruleletExpression897); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_1_8()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:6: (kw= 'let' this_letVarName_23= ruleletVarName kw= '->' this_letVarNameArray_25= ruleletVarNameArray kw= ':' kw= '{' (this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}' ) (kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' ) )* kw= '}' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:6: (kw= 'let' this_letVarName_23= ruleletVarName kw= '->' this_letVarNameArray_25= ruleletVarNameArray kw= ':' kw= '{' (this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}' ) (kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' ) )* kw= '}' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:2: kw= 'let' this_letVarName_23= ruleletVarName kw= '->' this_letVarNameArray_25= ruleletVarNameArray kw= ':' kw= '{' (this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}' ) (kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' ) )* kw= '}'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleletExpression918); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getLetKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleletVarName_in_ruleletExpression940);
                    this_letVarName_23=ruleletVarName();

                    state._fsp--;


                    		current.merge(this_letVarName_23);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleletExpression958); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getLetVarNameArrayParserRuleCall_2_3()); 
                        
                    pushFollow(FOLLOW_ruleletVarNameArray_in_ruleletExpression980);
                    this_letVarNameArray_25=ruleletVarNameArray();

                    state._fsp--;


                    		current.merge(this_letVarNameArray_25);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleletExpression998); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getColonKeyword_2_4()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleletExpression1011); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_2_5()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:1: (this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:444:5: this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}'
                    {
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_6_0()); 
                        
                    pushFollow(FOLLOW_ruleCOA_in_ruleletExpression1034);
                    this_COA_28=ruleCOA();

                    state._fsp--;


                    		current.merge(this_COA_28);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleletExpression1052); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_6_1()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleletExpression1065); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_2_6_2()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:1: (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:467:5: this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+
                    {
                     
                            newCompositeNode(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_6_3_0()); 
                        
                    pushFollow(FOLLOW_ruleCOA_in_ruleletExpression1088);
                    this_COA_31=ruleCOA();

                    state._fsp--;


                    		current.merge(this_COA_31);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:1: (kw= ',' this_COA_33= ruleCOA )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:2: kw= ',' this_COA_33= ruleCOA
                    	    {
                    	    kw=(Token)match(input,16,FOLLOW_16_in_ruleletExpression1107); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getCommaKeyword_2_6_3_1_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_6_3_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleCOA_in_ruleletExpression1129);
                    	    this_COA_33=ruleCOA();

                    	    state._fsp--;


                    	    		current.merge(this_COA_33);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }

                    kw=(Token)match(input,13,FOLLOW_13_in_ruleletExpression1150); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_2_6_4()); 
                        

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:500:2: (kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:501:2: kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' )
                    	    {
                    	    kw=(Token)match(input,16,FOLLOW_16_in_ruleletExpression1165); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getCommaKeyword_2_7_0()); 
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:506:1: (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:507:5: this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}'
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_7_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleCOA_in_ruleletExpression1188);
                    	    this_COA_36=ruleCOA();

                    	    state._fsp--;


                    	    		current.merge(this_COA_36);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    kw=(Token)match(input,17,FOLLOW_17_in_ruleletExpression1206); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_7_1_1()); 
                    	        
                    	    kw=(Token)match(input,12,FOLLOW_12_in_ruleletExpression1219); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_2_7_1_2()); 
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:529:1: (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:530:5: this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_7_1_3_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleCOA_in_ruleletExpression1242);
                    	    this_COA_39=ruleCOA();

                    	    state._fsp--;


                    	    		current.merge(this_COA_39);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:540:1: (kw= ',' this_COA_41= ruleCOA )+
                    	    int cnt5=0;
                    	    loop5:
                    	    do {
                    	        int alt5=2;
                    	        int LA5_0 = input.LA(1);

                    	        if ( (LA5_0==16) ) {
                    	            alt5=1;
                    	        }


                    	        switch (alt5) {
                    	    	case 1 :
                    	    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:2: kw= ',' this_COA_41= ruleCOA
                    	    	    {
                    	    	    kw=(Token)match(input,16,FOLLOW_16_in_ruleletExpression1261); 

                    	    	            current.merge(kw);
                    	    	            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getCommaKeyword_2_7_1_3_1_0()); 
                    	    	        
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_7_1_3_1_1()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleCOA_in_ruleletExpression1283);
                    	    	    this_COA_41=ruleCOA();

                    	    	    state._fsp--;


                    	    	    		current.merge(this_COA_41);
                    	    	        
                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

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

                    	    kw=(Token)match(input,13,FOLLOW_13_in_ruleletExpression1304); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_2_7_1_4()); 
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    kw=(Token)match(input,13,FOLLOW_13_in_ruleletExpression1320); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_2_8()); 
                        

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
    // $ANTLR end "ruleletExpression"


    // $ANTLR start "entryRuleCOA"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:577:1: entryRuleCOA returns [String current=null] : iv_ruleCOA= ruleCOA EOF ;
    public final String entryRuleCOA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOA = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:578:2: (iv_ruleCOA= ruleCOA EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:2: iv_ruleCOA= ruleCOA EOF
            {
             newCompositeNode(grammarAccess.getCOARule()); 
            pushFollow(FOLLOW_ruleCOA_in_entryRuleCOA1362);
            iv_ruleCOA=ruleCOA();

            state._fsp--;

             current =iv_ruleCOA.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOA1373); 

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
    // $ANTLR end "entryRuleCOA"


    // $ANTLR start "ruleCOA"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:586:1: ruleCOA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Operation_0= ruleOperation ;
    public final AntlrDatatypeRuleToken ruleCOA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Operation_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:589:28: (this_Operation_0= ruleOperation )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:5: this_Operation_0= ruleOperation
            {
             
                    newCompositeNode(grammarAccess.getCOAAccess().getOperationParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOperation_in_ruleCOA1419);
            this_Operation_0=ruleOperation();

            state._fsp--;


            		current.merge(this_Operation_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleCOA"


    // $ANTLR start "entryRuleSCOA"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:609:1: entryRuleSCOA returns [String current=null] : iv_ruleSCOA= ruleSCOA EOF ;
    public final String entryRuleSCOA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCOA = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:2: (iv_ruleSCOA= ruleSCOA EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:2: iv_ruleSCOA= ruleSCOA EOF
            {
             newCompositeNode(grammarAccess.getSCOARule()); 
            pushFollow(FOLLOW_ruleSCOA_in_entryRuleSCOA1464);
            iv_ruleSCOA=ruleSCOA();

            state._fsp--;

             current =iv_ruleSCOA.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCOA1475); 

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
    // $ANTLR end "entryRuleSCOA"


    // $ANTLR start "ruleSCOA"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:618:1: ruleSCOA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Operation_0= ruleOperation ;
    public final AntlrDatatypeRuleToken ruleSCOA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Operation_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:621:28: (this_Operation_0= ruleOperation )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:5: this_Operation_0= ruleOperation
            {
             
                    newCompositeNode(grammarAccess.getSCOAAccess().getOperationParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOperation_in_ruleSCOA1521);
            this_Operation_0=ruleOperation();

            state._fsp--;


            		current.merge(this_Operation_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleSCOA"


    // $ANTLR start "entryRuleAttributeContext"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:1: entryRuleAttributeContext returns [String current=null] : iv_ruleAttributeContext= ruleAttributeContext EOF ;
    public final String entryRuleAttributeContext() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeContext = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:2: (iv_ruleAttributeContext= ruleAttributeContext EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:643:2: iv_ruleAttributeContext= ruleAttributeContext EOF
            {
             newCompositeNode(grammarAccess.getAttributeContextRule()); 
            pushFollow(FOLLOW_ruleAttributeContext_in_entryRuleAttributeContext1566);
            iv_ruleAttributeContext=ruleAttributeContext();

            state._fsp--;

             current =iv_ruleAttributeContext.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeContext1577); 

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
    // $ANTLR end "entryRuleAttributeContext"


    // $ANTLR start "ruleAttributeContext"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:1: ruleAttributeContext returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassifierContext_0= ruleClassifierContext kw= '::' this_NameChar_2= ruleNameChar ) ;
    public final AntlrDatatypeRuleToken ruleAttributeContext() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ClassifierContext_0 = null;

        AntlrDatatypeRuleToken this_NameChar_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:653:28: ( (this_ClassifierContext_0= ruleClassifierContext kw= '::' this_NameChar_2= ruleNameChar ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:1: (this_ClassifierContext_0= ruleClassifierContext kw= '::' this_NameChar_2= ruleNameChar )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:1: (this_ClassifierContext_0= ruleClassifierContext kw= '::' this_NameChar_2= ruleNameChar )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:5: this_ClassifierContext_0= ruleClassifierContext kw= '::' this_NameChar_2= ruleNameChar
            {
             
                    newCompositeNode(grammarAccess.getAttributeContextAccess().getClassifierContextParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassifierContext_in_ruleAttributeContext1624);
            this_ClassifierContext_0=ruleClassifierContext();

            state._fsp--;


            		current.merge(this_ClassifierContext_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,18,FOLLOW_18_in_ruleAttributeContext1642); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeContextAccess().getColonColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getAttributeContextAccess().getNameCharParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleNameChar_in_ruleAttributeContext1664);
            this_NameChar_2=ruleNameChar();

            state._fsp--;


            		current.merge(this_NameChar_2);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAttributeContext"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:1: entryRuleOperation returns [String current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final String entryRuleOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperation = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:692:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1710);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1721); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:1: ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassifierContext_0= ruleClassifierContext | this_OperationContext_1= ruleOperationContext | this_AttributeContext_2= ruleAttributeContext ) ;
    public final AntlrDatatypeRuleToken ruleOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ClassifierContext_0 = null;

        AntlrDatatypeRuleToken this_OperationContext_1 = null;

        AntlrDatatypeRuleToken this_AttributeContext_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:28: ( (this_ClassifierContext_0= ruleClassifierContext | this_OperationContext_1= ruleOperationContext | this_AttributeContext_2= ruleAttributeContext ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:1: (this_ClassifierContext_0= ruleClassifierContext | this_OperationContext_1= ruleOperationContext | this_AttributeContext_2= ruleAttributeContext )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:1: (this_ClassifierContext_0= ruleClassifierContext | this_OperationContext_1= ruleOperationContext | this_AttributeContext_2= ruleAttributeContext )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:704:5: this_ClassifierContext_0= ruleClassifierContext
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getClassifierContextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClassifierContext_in_ruleOperation1768);
                    this_ClassifierContext_0=ruleClassifierContext();

                    state._fsp--;


                    		current.merge(this_ClassifierContext_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:716:5: this_OperationContext_1= ruleOperationContext
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getOperationContextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOperationContext_in_ruleOperation1801);
                    this_OperationContext_1=ruleOperationContext();

                    state._fsp--;


                    		current.merge(this_OperationContext_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:728:5: this_AttributeContext_2= ruleAttributeContext
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getAttributeContextParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAttributeContext_in_ruleOperation1834);
                    this_AttributeContext_2=ruleAttributeContext();

                    state._fsp--;


                    		current.merge(this_AttributeContext_2);
                        
                     
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleletVarNameArray"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:746:1: entryRuleletVarNameArray returns [String current=null] : iv_ruleletVarNameArray= ruleletVarNameArray EOF ;
    public final String entryRuleletVarNameArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleletVarNameArray = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:747:2: (iv_ruleletVarNameArray= ruleletVarNameArray EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:748:2: iv_ruleletVarNameArray= ruleletVarNameArray EOF
            {
             newCompositeNode(grammarAccess.getLetVarNameArrayRule()); 
            pushFollow(FOLLOW_ruleletVarNameArray_in_entryRuleletVarNameArray1880);
            iv_ruleletVarNameArray=ruleletVarNameArray();

            state._fsp--;

             current =iv_ruleletVarNameArray.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletVarNameArray1891); 

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
    // $ANTLR end "entryRuleletVarNameArray"


    // $ANTLR start "ruleletVarNameArray"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:1: ruleletVarNameArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_letVarName_1= ruleletVarName (kw= ',' this_letVarName_3= ruleletVarName )+ ) kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleletVarNameArray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_letVarName_1 = null;

        AntlrDatatypeRuleToken this_letVarName_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:28: ( (kw= '{' (this_letVarName_1= ruleletVarName (kw= ',' this_letVarName_3= ruleletVarName )+ ) kw= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:759:1: (kw= '{' (this_letVarName_1= ruleletVarName (kw= ',' this_letVarName_3= ruleletVarName )+ ) kw= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:759:1: (kw= '{' (this_letVarName_1= ruleletVarName (kw= ',' this_letVarName_3= ruleletVarName )+ ) kw= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:2: kw= '{' (this_letVarName_1= ruleletVarName (kw= ',' this_letVarName_3= ruleletVarName )+ ) kw= '}'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleletVarNameArray1929); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLetVarNameArrayAccess().getLeftCurlyBracketKeyword_0()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:1: (this_letVarName_1= ruleletVarName (kw= ',' this_letVarName_3= ruleletVarName )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:5: this_letVarName_1= ruleletVarName (kw= ',' this_letVarName_3= ruleletVarName )+
            {
             
                    newCompositeNode(grammarAccess.getLetVarNameArrayAccess().getLetVarNameParserRuleCall_1_0()); 
                
            pushFollow(FOLLOW_ruleletVarName_in_ruleletVarNameArray1952);
            this_letVarName_1=ruleletVarName();

            state._fsp--;


            		current.merge(this_letVarName_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:1: (kw= ',' this_letVarName_3= ruleletVarName )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:2: kw= ',' this_letVarName_3= ruleletVarName
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleletVarNameArray1971); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLetVarNameArrayAccess().getCommaKeyword_1_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getLetVarNameArrayAccess().getLetVarNameParserRuleCall_1_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleletVarName_in_ruleletVarNameArray1993);
            	    this_letVarName_3=ruleletVarName();

            	    state._fsp--;


            	    		current.merge(this_letVarName_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            kw=(Token)match(input,13,FOLLOW_13_in_ruleletVarNameArray2014); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLetVarNameArrayAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // $ANTLR end "ruleletVarNameArray"


    // $ANTLR start "entryRuleletVarName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:1: entryRuleletVarName returns [String current=null] : iv_ruleletVarName= ruleletVarName EOF ;
    public final String entryRuleletVarName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleletVarName = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:2: (iv_ruleletVarName= ruleletVarName EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:2: iv_ruleletVarName= ruleletVarName EOF
            {
             newCompositeNode(grammarAccess.getLetVarNameRule()); 
            pushFollow(FOLLOW_ruleletVarName_in_entryRuleletVarName2055);
            iv_ruleletVarName=ruleletVarName();

            state._fsp--;

             current =iv_ruleletVarName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletVarName2066); 

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
    // $ANTLR end "entryRuleletVarName"


    // $ANTLR start "ruleletVarName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:816:1: ruleletVarName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameChar_0= ruleNameChar ;
    public final AntlrDatatypeRuleToken ruleletVarName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NameChar_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:819:28: (this_NameChar_0= ruleNameChar )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:5: this_NameChar_0= ruleNameChar
            {
             
                    newCompositeNode(grammarAccess.getLetVarNameAccess().getNameCharParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNameChar_in_ruleletVarName2112);
            this_NameChar_0=ruleNameChar();

            state._fsp--;


            		current.merge(this_NameChar_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleletVarName"


    // $ANTLR start "entryRuleAspectDefinition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:1: entryRuleAspectDefinition returns [EObject current=null] : iv_ruleAspectDefinition= ruleAspectDefinition EOF ;
    public final EObject entryRuleAspectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspectDefinition = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:840:2: (iv_ruleAspectDefinition= ruleAspectDefinition EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:841:2: iv_ruleAspectDefinition= ruleAspectDefinition EOF
            {
             newCompositeNode(grammarAccess.getAspectDefinitionRule()); 
            pushFollow(FOLLOW_ruleAspectDefinition_in_entryRuleAspectDefinition2156);
            iv_ruleAspectDefinition=ruleAspectDefinition();

            state._fsp--;

             current =iv_ruleAspectDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspectDefinition2166); 

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
    // $ANTLR end "entryRuleAspectDefinition"


    // $ANTLR start "ruleAspectDefinition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:848:1: ruleAspectDefinition returns [EObject current=null] : (otherlv_0= 'aspect' ruleAspectName otherlv_2= '{' ( (lv_mappingdeclarartion_3_0= ruleMapping_Declaration ) ) ( (lv_pointcutdeclaration_4_0= rulePointcut_Declaration ) ) ruleContextDeclaration (this_QueryDeclaration_6= ruleQueryDeclaration )? ( (lv_AIDeclaration_7_0= ruleAI ) ) otherlv_8= '}' ) ;
    public final EObject ruleAspectDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_mappingdeclarartion_3_0 = null;

        EObject lv_pointcutdeclaration_4_0 = null;

        EObject this_QueryDeclaration_6 = null;

        EObject lv_AIDeclaration_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:28: ( (otherlv_0= 'aspect' ruleAspectName otherlv_2= '{' ( (lv_mappingdeclarartion_3_0= ruleMapping_Declaration ) ) ( (lv_pointcutdeclaration_4_0= rulePointcut_Declaration ) ) ruleContextDeclaration (this_QueryDeclaration_6= ruleQueryDeclaration )? ( (lv_AIDeclaration_7_0= ruleAI ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (otherlv_0= 'aspect' ruleAspectName otherlv_2= '{' ( (lv_mappingdeclarartion_3_0= ruleMapping_Declaration ) ) ( (lv_pointcutdeclaration_4_0= rulePointcut_Declaration ) ) ruleContextDeclaration (this_QueryDeclaration_6= ruleQueryDeclaration )? ( (lv_AIDeclaration_7_0= ruleAI ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (otherlv_0= 'aspect' ruleAspectName otherlv_2= '{' ( (lv_mappingdeclarartion_3_0= ruleMapping_Declaration ) ) ( (lv_pointcutdeclaration_4_0= rulePointcut_Declaration ) ) ruleContextDeclaration (this_QueryDeclaration_6= ruleQueryDeclaration )? ( (lv_AIDeclaration_7_0= ruleAI ) ) otherlv_8= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:3: otherlv_0= 'aspect' ruleAspectName otherlv_2= '{' ( (lv_mappingdeclarartion_3_0= ruleMapping_Declaration ) ) ( (lv_pointcutdeclaration_4_0= rulePointcut_Declaration ) ) ruleContextDeclaration (this_QueryDeclaration_6= ruleQueryDeclaration )? ( (lv_AIDeclaration_7_0= ruleAI ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAspectDefinition2203); 

                	newLeafNode(otherlv_0, grammarAccess.getAspectDefinitionAccess().getAspectKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getAspectDefinitionAccess().getAspectNameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAspectName_in_ruleAspectDefinition2219);
            ruleAspectName();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAspectDefinition2230); 

                	newLeafNode(otherlv_2, grammarAccess.getAspectDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:868:1: ( (lv_mappingdeclarartion_3_0= ruleMapping_Declaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:869:1: (lv_mappingdeclarartion_3_0= ruleMapping_Declaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:869:1: (lv_mappingdeclarartion_3_0= ruleMapping_Declaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:3: lv_mappingdeclarartion_3_0= ruleMapping_Declaration
            {
             
            	        newCompositeNode(grammarAccess.getAspectDefinitionAccess().getMappingdeclarartionMapping_DeclarationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMapping_Declaration_in_ruleAspectDefinition2251);
            lv_mappingdeclarartion_3_0=ruleMapping_Declaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAspectDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"mappingdeclarartion",
                    		lv_mappingdeclarartion_3_0, 
                    		"Mapping_Declaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:886:2: ( (lv_pointcutdeclaration_4_0= rulePointcut_Declaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:887:1: (lv_pointcutdeclaration_4_0= rulePointcut_Declaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:887:1: (lv_pointcutdeclaration_4_0= rulePointcut_Declaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:3: lv_pointcutdeclaration_4_0= rulePointcut_Declaration
            {
             
            	        newCompositeNode(grammarAccess.getAspectDefinitionAccess().getPointcutdeclarationPointcut_DeclarationParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePointcut_Declaration_in_ruleAspectDefinition2272);
            lv_pointcutdeclaration_4_0=rulePointcut_Declaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAspectDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"pointcutdeclaration",
                    		lv_pointcutdeclaration_4_0, 
                    		"Pointcut_Declaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getAspectDefinitionAccess().getContextDeclarationParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleContextDeclaration_in_ruleAspectDefinition2288);
            ruleContextDeclaration();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:1: (this_QueryDeclaration_6= ruleQueryDeclaration )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=31 && LA10_0<=33)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:913:5: this_QueryDeclaration_6= ruleQueryDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getAspectDefinitionAccess().getQueryDeclarationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleQueryDeclaration_in_ruleAspectDefinition2310);
                    this_QueryDeclaration_6=ruleQueryDeclaration();

                    state._fsp--;

                     
                            current = this_QueryDeclaration_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:3: ( (lv_AIDeclaration_7_0= ruleAI ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:1: (lv_AIDeclaration_7_0= ruleAI )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:1: (lv_AIDeclaration_7_0= ruleAI )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:3: lv_AIDeclaration_7_0= ruleAI
            {
             
            	        newCompositeNode(grammarAccess.getAspectDefinitionAccess().getAIDeclarationAIParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleAI_in_ruleAspectDefinition2332);
            lv_AIDeclaration_7_0=ruleAI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAspectDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"AIDeclaration",
                    		lv_AIDeclaration_7_0, 
                    		"AI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleAspectDefinition2344); 

                	newLeafNode(otherlv_8, grammarAccess.getAspectDefinitionAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAspectDefinition"


    // $ANTLR start "entryRuleAspectName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:1: entryRuleAspectName returns [String current=null] : iv_ruleAspectName= ruleAspectName EOF ;
    public final String entryRuleAspectName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAspectName = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:952:2: (iv_ruleAspectName= ruleAspectName EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:953:2: iv_ruleAspectName= ruleAspectName EOF
            {
             newCompositeNode(grammarAccess.getAspectNameRule()); 
            pushFollow(FOLLOW_ruleAspectName_in_entryRuleAspectName2381);
            iv_ruleAspectName=ruleAspectName();

            state._fsp--;

             current =iv_ruleAspectName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspectName2392); 

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
    // $ANTLR end "entryRuleAspectName"


    // $ANTLR start "ruleAspectName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:1: ruleAspectName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameChar_0= ruleNameChar ;
    public final AntlrDatatypeRuleToken ruleAspectName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NameChar_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:28: (this_NameChar_0= ruleNameChar )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:5: this_NameChar_0= ruleNameChar
            {
             
                    newCompositeNode(grammarAccess.getAspectNameAccess().getNameCharParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNameChar_in_ruleAspectName2438);
            this_NameChar_0=ruleNameChar();

            state._fsp--;


            		current.merge(this_NameChar_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAspectName"


    // $ANTLR start "entryRuleMapping_Declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:983:1: entryRuleMapping_Declaration returns [EObject current=null] : iv_ruleMapping_Declaration= ruleMapping_Declaration EOF ;
    public final EObject entryRuleMapping_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping_Declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:2: (iv_ruleMapping_Declaration= ruleMapping_Declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:985:2: iv_ruleMapping_Declaration= ruleMapping_Declaration EOF
            {
             newCompositeNode(grammarAccess.getMapping_DeclarationRule()); 
            pushFollow(FOLLOW_ruleMapping_Declaration_in_entryRuleMapping_Declaration2482);
            iv_ruleMapping_Declaration=ruleMapping_Declaration();

            state._fsp--;

             current =iv_ruleMapping_Declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping_Declaration2492); 

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
    // $ANTLR end "entryRuleMapping_Declaration"


    // $ANTLR start "ruleMapping_Declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:1: ruleMapping_Declaration returns [EObject current=null] : (otherlv_0= 'import_mapping' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMapping_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:995:28: ( (otherlv_0= 'import_mapping' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:1: (otherlv_0= 'import_mapping' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:1: (otherlv_0= 'import_mapping' ( (otherlv_1= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:3: otherlv_0= 'import_mapping' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleMapping_Declaration2529); 

                	newLeafNode(otherlv_0, grammarAccess.getMapping_DeclarationAccess().getImport_mappingKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMapping_DeclarationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapping_Declaration2549); 

            		newLeafNode(otherlv_1, grammarAccess.getMapping_DeclarationAccess().getReference_mappingnameMappingNameCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleMapping_Declaration"


    // $ANTLR start "entryRuleMappingName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:1: entryRuleMappingName returns [EObject current=null] : iv_ruleMappingName= ruleMappingName EOF ;
    public final EObject entryRuleMappingName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingName = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1022:2: (iv_ruleMappingName= ruleMappingName EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1023:2: iv_ruleMappingName= ruleMappingName EOF
            {
             newCompositeNode(grammarAccess.getMappingNameRule()); 
            pushFollow(FOLLOW_ruleMappingName_in_entryRuleMappingName2585);
            iv_ruleMappingName=ruleMappingName();

            state._fsp--;

             current =iv_ruleMappingName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingName2595); 

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
    // $ANTLR end "entryRuleMappingName"


    // $ANTLR start "ruleMappingName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:1: ruleMappingName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMappingName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1033:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMappingName2636); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMappingNameAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleMappingName"


    // $ANTLR start "entryRulePointcut_Declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1060:1: entryRulePointcut_Declaration returns [EObject current=null] : iv_rulePointcut_Declaration= rulePointcut_Declaration EOF ;
    public final EObject entryRulePointcut_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointcut_Declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:2: (iv_rulePointcut_Declaration= rulePointcut_Declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:2: iv_rulePointcut_Declaration= rulePointcut_Declaration EOF
            {
             newCompositeNode(grammarAccess.getPointcut_DeclarationRule()); 
            pushFollow(FOLLOW_rulePointcut_Declaration_in_entryRulePointcut_Declaration2676);
            iv_rulePointcut_Declaration=rulePointcut_Declaration();

            state._fsp--;

             current =iv_rulePointcut_Declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointcut_Declaration2686); 

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
    // $ANTLR end "entryRulePointcut_Declaration"


    // $ANTLR start "rulePointcut_Declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1069:1: rulePointcut_Declaration returns [EObject current=null] : (otherlv_0= 'pointcut' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePointcut_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:28: ( (otherlv_0= 'pointcut' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:1: (otherlv_0= 'pointcut' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:1: (otherlv_0= 'pointcut' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:3: otherlv_0= 'pointcut' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePointcut_Declaration2723); 

                	newLeafNode(otherlv_0, grammarAccess.getPointcut_DeclarationAccess().getPointcutKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1078:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1078:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePointcut_Declaration2740); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPointcut_DeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointcut_DeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "rulePointcut_Declaration"


    // $ANTLR start "entryRuleContextDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1105:1: entryRuleContextDeclaration returns [String current=null] : iv_ruleContextDeclaration= ruleContextDeclaration EOF ;
    public final String entryRuleContextDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContextDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1106:2: (iv_ruleContextDeclaration= ruleContextDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1107:2: iv_ruleContextDeclaration= ruleContextDeclaration EOF
            {
             newCompositeNode(grammarAccess.getContextDeclarationRule()); 
            pushFollow(FOLLOW_ruleContextDeclaration_in_entryRuleContextDeclaration2784);
            iv_ruleContextDeclaration=ruleContextDeclaration();

            state._fsp--;

             current =iv_ruleContextDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDeclaration2795); 

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
    // $ANTLR end "entryRuleContextDeclaration"


    // $ANTLR start "ruleContextDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: ruleContextDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'context' (this_ClassifierContext_1= ruleClassifierContext | this_OperationContext_2= ruleOperationContext ) ) ;
    public final AntlrDatatypeRuleToken ruleContextDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ClassifierContext_1 = null;

        AntlrDatatypeRuleToken this_OperationContext_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1117:28: ( (kw= 'context' (this_ClassifierContext_1= ruleClassifierContext | this_OperationContext_2= ruleOperationContext ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1118:1: (kw= 'context' (this_ClassifierContext_1= ruleClassifierContext | this_OperationContext_2= ruleOperationContext ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1118:1: (kw= 'context' (this_ClassifierContext_1= ruleClassifierContext | this_OperationContext_2= ruleOperationContext ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1119:2: kw= 'context' (this_ClassifierContext_1= ruleClassifierContext | this_OperationContext_2= ruleOperationContext )
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleContextDeclaration2833); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getContextDeclarationAccess().getContextKeyword_0()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1124:1: (this_ClassifierContext_1= ruleClassifierContext | this_OperationContext_2= ruleOperationContext )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:5: this_ClassifierContext_1= ruleClassifierContext
                    {
                     
                            newCompositeNode(grammarAccess.getContextDeclarationAccess().getClassifierContextParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleClassifierContext_in_ruleContextDeclaration2856);
                    this_ClassifierContext_1=ruleClassifierContext();

                    state._fsp--;


                    		current.merge(this_ClassifierContext_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:5: this_OperationContext_2= ruleOperationContext
                    {
                     
                            newCompositeNode(grammarAccess.getContextDeclarationAccess().getOperationContextParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleOperationContext_in_ruleContextDeclaration2889);
                    this_OperationContext_2=ruleOperationContext();

                    state._fsp--;


                    		current.merge(this_OperationContext_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleContextDeclaration"


    // $ANTLR start "entryRuleClassifierContext"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1155:1: entryRuleClassifierContext returns [String current=null] : iv_ruleClassifierContext= ruleClassifierContext EOF ;
    public final String entryRuleClassifierContext() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassifierContext = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1156:2: (iv_ruleClassifierContext= ruleClassifierContext EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1157:2: iv_ruleClassifierContext= ruleClassifierContext EOF
            {
             newCompositeNode(grammarAccess.getClassifierContextRule()); 
            pushFollow(FOLLOW_ruleClassifierContext_in_entryRuleClassifierContext2936);
            iv_ruleClassifierContext=ruleClassifierContext();

            state._fsp--;

             current =iv_ruleClassifierContext.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifierContext2947); 

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
    // $ANTLR end "entryRuleClassifierContext"


    // $ANTLR start "ruleClassifierContext"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1164:1: ruleClassifierContext returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameChar_0= ruleNameChar ;
    public final AntlrDatatypeRuleToken ruleClassifierContext() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NameChar_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1167:28: (this_NameChar_0= ruleNameChar )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:5: this_NameChar_0= ruleNameChar
            {
             
                    newCompositeNode(grammarAccess.getClassifierContextAccess().getNameCharParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNameChar_in_ruleClassifierContext2993);
            this_NameChar_0=ruleNameChar();

            state._fsp--;


            		current.merge(this_NameChar_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleClassifierContext"


    // $ANTLR start "entryRuleOperationContext"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1187:1: entryRuleOperationContext returns [String current=null] : iv_ruleOperationContext= ruleOperationContext EOF ;
    public final String entryRuleOperationContext() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationContext = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:2: (iv_ruleOperationContext= ruleOperationContext EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1189:2: iv_ruleOperationContext= ruleOperationContext EOF
            {
             newCompositeNode(grammarAccess.getOperationContextRule()); 
            pushFollow(FOLLOW_ruleOperationContext_in_entryRuleOperationContext3038);
            iv_ruleOperationContext=ruleOperationContext();

            state._fsp--;

             current =iv_ruleOperationContext.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationContext3049); 

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
    // $ANTLR end "entryRuleOperationContext"


    // $ANTLR start "ruleOperationContext"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:1: ruleOperationContext returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassifierContext_0= ruleClassifierContext kw= '::' this_OperationName_2= ruleOperationName kw= '(' (this_Arguments_4= ruleArguments (kw= ',' this_Arguments_6= ruleArguments )* )? kw= ')' (kw= ':' this_Returntype_9= ruleReturntype )? ) ;
    public final AntlrDatatypeRuleToken ruleOperationContext() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ClassifierContext_0 = null;

        AntlrDatatypeRuleToken this_OperationName_2 = null;

        AntlrDatatypeRuleToken this_Arguments_4 = null;

        AntlrDatatypeRuleToken this_Arguments_6 = null;

        AntlrDatatypeRuleToken this_Returntype_9 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1199:28: ( (this_ClassifierContext_0= ruleClassifierContext kw= '::' this_OperationName_2= ruleOperationName kw= '(' (this_Arguments_4= ruleArguments (kw= ',' this_Arguments_6= ruleArguments )* )? kw= ')' (kw= ':' this_Returntype_9= ruleReturntype )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:1: (this_ClassifierContext_0= ruleClassifierContext kw= '::' this_OperationName_2= ruleOperationName kw= '(' (this_Arguments_4= ruleArguments (kw= ',' this_Arguments_6= ruleArguments )* )? kw= ')' (kw= ':' this_Returntype_9= ruleReturntype )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:1: (this_ClassifierContext_0= ruleClassifierContext kw= '::' this_OperationName_2= ruleOperationName kw= '(' (this_Arguments_4= ruleArguments (kw= ',' this_Arguments_6= ruleArguments )* )? kw= ')' (kw= ':' this_Returntype_9= ruleReturntype )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:5: this_ClassifierContext_0= ruleClassifierContext kw= '::' this_OperationName_2= ruleOperationName kw= '(' (this_Arguments_4= ruleArguments (kw= ',' this_Arguments_6= ruleArguments )* )? kw= ')' (kw= ':' this_Returntype_9= ruleReturntype )?
            {
             
                    newCompositeNode(grammarAccess.getOperationContextAccess().getClassifierContextParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassifierContext_in_ruleOperationContext3096);
            this_ClassifierContext_0=ruleClassifierContext();

            state._fsp--;


            		current.merge(this_ClassifierContext_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOperationContext3114); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOperationContextAccess().getColonColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getOperationContextAccess().getOperationNameParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleOperationName_in_ruleOperationContext3136);
            this_OperationName_2=ruleOperationName();

            state._fsp--;


            		current.merge(this_OperationName_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOperationContext3154); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOperationContextAccess().getLeftParenthesisKeyword_3()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:1: (this_Arguments_4= ruleArguments (kw= ',' this_Arguments_6= ruleArguments )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:5: this_Arguments_4= ruleArguments (kw= ',' this_Arguments_6= ruleArguments )*
                    {
                     
                            newCompositeNode(grammarAccess.getOperationContextAccess().getArgumentsParserRuleCall_4_0()); 
                        
                    pushFollow(FOLLOW_ruleArguments_in_ruleOperationContext3177);
                    this_Arguments_4=ruleArguments();

                    state._fsp--;


                    		current.merge(this_Arguments_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1245:1: (kw= ',' this_Arguments_6= ruleArguments )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1246:2: kw= ',' this_Arguments_6= ruleArguments
                    	    {
                    	    kw=(Token)match(input,16,FOLLOW_16_in_ruleOperationContext3196); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getOperationContextAccess().getCommaKeyword_4_1_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getOperationContextAccess().getArgumentsParserRuleCall_4_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleArguments_in_ruleOperationContext3218);
                    	    this_Arguments_6=ruleArguments();

                    	    state._fsp--;


                    	    		current.merge(this_Arguments_6);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,24,FOLLOW_24_in_ruleOperationContext3240); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOperationContextAccess().getRightParenthesisKeyword_5()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:1: (kw= ':' this_Returntype_9= ruleReturntype )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1269:2: kw= ':' this_Returntype_9= ruleReturntype
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOperationContext3254); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperationContextAccess().getColonKeyword_6_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getOperationContextAccess().getReturntypeParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleReturntype_in_ruleOperationContext3276);
                    this_Returntype_9=ruleReturntype();

                    state._fsp--;


                    		current.merge(this_Returntype_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleOperationContext"


    // $ANTLR start "entryRuleOperationName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1293:1: entryRuleOperationName returns [String current=null] : iv_ruleOperationName= ruleOperationName EOF ;
    public final String entryRuleOperationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationName = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:2: (iv_ruleOperationName= ruleOperationName EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:2: iv_ruleOperationName= ruleOperationName EOF
            {
             newCompositeNode(grammarAccess.getOperationNameRule()); 
            pushFollow(FOLLOW_ruleOperationName_in_entryRuleOperationName3324);
            iv_ruleOperationName=ruleOperationName();

            state._fsp--;

             current =iv_ruleOperationName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationName3335); 

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
    // $ANTLR end "entryRuleOperationName"


    // $ANTLR start "ruleOperationName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1302:1: ruleOperationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameChar_0= ruleNameChar ;
    public final AntlrDatatypeRuleToken ruleOperationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NameChar_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:28: (this_NameChar_0= ruleNameChar )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:5: this_NameChar_0= ruleNameChar
            {
             
                    newCompositeNode(grammarAccess.getOperationNameAccess().getNameCharParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNameChar_in_ruleOperationName3381);
            this_NameChar_0=ruleNameChar();

            state._fsp--;


            		current.merge(this_NameChar_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleOperationName"


    // $ANTLR start "entryRuleArguments"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:1: entryRuleArguments returns [String current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final String entryRuleArguments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArguments = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1326:2: (iv_ruleArguments= ruleArguments EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments3426);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments3437); 

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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:1: ruleArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameChar_0= ruleNameChar ;
    public final AntlrDatatypeRuleToken ruleArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NameChar_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1337:28: (this_NameChar_0= ruleNameChar )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1339:5: this_NameChar_0= ruleNameChar
            {
             
                    newCompositeNode(grammarAccess.getArgumentsAccess().getNameCharParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNameChar_in_ruleArguments3483);
            this_NameChar_0=ruleNameChar();

            state._fsp--;


            		current.merge(this_NameChar_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleReturntype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1357:1: entryRuleReturntype returns [String current=null] : iv_ruleReturntype= ruleReturntype EOF ;
    public final String entryRuleReturntype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturntype = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:2: (iv_ruleReturntype= ruleReturntype EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:2: iv_ruleReturntype= ruleReturntype EOF
            {
             newCompositeNode(grammarAccess.getReturntypeRule()); 
            pushFollow(FOLLOW_ruleReturntype_in_entryRuleReturntype3528);
            iv_ruleReturntype=ruleReturntype();

            state._fsp--;

             current =iv_ruleReturntype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturntype3539); 

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
    // $ANTLR end "entryRuleReturntype"


    // $ANTLR start "ruleReturntype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1366:1: ruleReturntype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'String' | kw= 'int' | kw= 'float' | kw= 'double' | this_NameChar_5= ruleNameChar ) ;
    public final AntlrDatatypeRuleToken ruleReturntype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NameChar_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1369:28: ( (kw= 'Boolean' | kw= 'String' | kw= 'int' | kw= 'float' | kw= 'double' | this_NameChar_5= ruleNameChar ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:1: (kw= 'Boolean' | kw= 'String' | kw= 'int' | kw= 'float' | kw= 'double' | this_NameChar_5= ruleNameChar )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:1: (kw= 'Boolean' | kw= 'String' | kw= 'int' | kw= 'float' | kw= 'double' | this_NameChar_5= ruleNameChar )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            case 28:
                {
                alt15=4;
                }
                break;
            case 29:
                {
                alt15=5;
                }
                break;
            case RULE_ID:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1371:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleReturntype3577); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturntypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:2: kw= 'String'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleReturntype3596); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturntypeAccess().getStringKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:2: kw= 'int'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleReturntype3615); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturntypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1392:2: kw= 'float'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleReturntype3634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturntypeAccess().getFloatKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1399:2: kw= 'double'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleReturntype3653); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturntypeAccess().getDoubleKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:5: this_NameChar_5= ruleNameChar
                    {
                     
                            newCompositeNode(grammarAccess.getReturntypeAccess().getNameCharParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleNameChar_in_ruleReturntype3681);
                    this_NameChar_5=ruleNameChar();

                    state._fsp--;


                    		current.merge(this_NameChar_5);
                        
                     
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
    // $ANTLR end "ruleReturntype"


    // $ANTLR start "entryRuleAI"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1424:1: entryRuleAI returns [EObject current=null] : iv_ruleAI= ruleAI EOF ;
    public final EObject entryRuleAI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAI = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1425:2: (iv_ruleAI= ruleAI EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1426:2: iv_ruleAI= ruleAI EOF
            {
             newCompositeNode(grammarAccess.getAIRule()); 
            pushFollow(FOLLOW_ruleAI_in_entryRuleAI3726);
            iv_ruleAI=ruleAI();

            state._fsp--;

             current =iv_ruleAI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAI3736); 

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
    // $ANTLR end "entryRuleAI"


    // $ANTLR start "ruleAI"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:1: ruleAI returns [EObject current=null] : (this_Advice_0= ruleAdvice | this_Intro_1= ruleIntro ) ;
    public final EObject ruleAI() throws RecognitionException {
        EObject current = null;

        EObject this_Advice_0 = null;

        EObject this_Intro_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1436:28: ( (this_Advice_0= ruleAdvice | this_Intro_1= ruleIntro ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:1: (this_Advice_0= ruleAdvice | this_Intro_1= ruleIntro )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:1: (this_Advice_0= ruleAdvice | this_Intro_1= ruleIntro )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==37) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:5: this_Advice_0= ruleAdvice
                    {
                     
                            newCompositeNode(grammarAccess.getAIAccess().getAdviceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAdvice_in_ruleAI3783);
                    this_Advice_0=ruleAdvice();

                    state._fsp--;

                     
                            current = this_Advice_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1448:5: this_Intro_1= ruleIntro
                    {
                     
                            newCompositeNode(grammarAccess.getAIAccess().getIntroParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntro_in_ruleAI3810);
                    this_Intro_1=ruleIntro();

                    state._fsp--;

                     
                            current = this_Intro_1; 
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
    // $ANTLR end "ruleAI"


    // $ANTLR start "entryRuleAdvice"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1464:1: entryRuleAdvice returns [EObject current=null] : iv_ruleAdvice= ruleAdvice EOF ;
    public final EObject entryRuleAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvice = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1465:2: (iv_ruleAdvice= ruleAdvice EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1466:2: iv_ruleAdvice= ruleAdvice EOF
            {
             newCompositeNode(grammarAccess.getAdviceRule()); 
            pushFollow(FOLLOW_ruleAdvice_in_entryRuleAdvice3845);
            iv_ruleAdvice=ruleAdvice();

            state._fsp--;

             current =iv_ruleAdvice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdvice3855); 

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
    // $ANTLR end "entryRuleAdvice"


    // $ANTLR start "ruleAdvice"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1473:1: ruleAdvice returns [EObject current=null] : ( ruleAdviceDeclaration ( (lv_advicetype_1_0= ruleAdviceType ) ) ( (lv_introadvicequery_2_0= ruleIntroAdviceQuery ) ) ) ;
    public final EObject ruleAdvice() throws RecognitionException {
        EObject current = null;

        EObject lv_advicetype_1_0 = null;

        EObject lv_introadvicequery_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1476:28: ( ( ruleAdviceDeclaration ( (lv_advicetype_1_0= ruleAdviceType ) ) ( (lv_introadvicequery_2_0= ruleIntroAdviceQuery ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1477:1: ( ruleAdviceDeclaration ( (lv_advicetype_1_0= ruleAdviceType ) ) ( (lv_introadvicequery_2_0= ruleIntroAdviceQuery ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1477:1: ( ruleAdviceDeclaration ( (lv_advicetype_1_0= ruleAdviceType ) ) ( (lv_introadvicequery_2_0= ruleIntroAdviceQuery ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1478:5: ruleAdviceDeclaration ( (lv_advicetype_1_0= ruleAdviceType ) ) ( (lv_introadvicequery_2_0= ruleIntroAdviceQuery ) )
            {
             
                    newCompositeNode(grammarAccess.getAdviceAccess().getAdviceDeclarationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAdviceDeclaration_in_ruleAdvice3896);
            ruleAdviceDeclaration();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1485:1: ( (lv_advicetype_1_0= ruleAdviceType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1486:1: (lv_advicetype_1_0= ruleAdviceType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1486:1: (lv_advicetype_1_0= ruleAdviceType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1487:3: lv_advicetype_1_0= ruleAdviceType
            {
             
            	        newCompositeNode(grammarAccess.getAdviceAccess().getAdvicetypeAdviceTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAdviceType_in_ruleAdvice3916);
            lv_advicetype_1_0=ruleAdviceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdviceRule());
            	        }
                   		set(
                   			current, 
                   			"advicetype",
                    		lv_advicetype_1_0, 
                    		"AdviceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1503:2: ( (lv_introadvicequery_2_0= ruleIntroAdviceQuery ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1504:1: (lv_introadvicequery_2_0= ruleIntroAdviceQuery )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1504:1: (lv_introadvicequery_2_0= ruleIntroAdviceQuery )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1505:3: lv_introadvicequery_2_0= ruleIntroAdviceQuery
            {
             
            	        newCompositeNode(grammarAccess.getAdviceAccess().getIntroadvicequeryIntroAdviceQueryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntroAdviceQuery_in_ruleAdvice3937);
            lv_introadvicequery_2_0=ruleIntroAdviceQuery();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdviceRule());
            	        }
                   		set(
                   			current, 
                   			"introadvicequery",
                    		lv_introadvicequery_2_0, 
                    		"IntroAdviceQuery");
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
    // $ANTLR end "ruleAdvice"


    // $ANTLR start "entryRuleAdviceDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1529:1: entryRuleAdviceDeclaration returns [String current=null] : iv_ruleAdviceDeclaration= ruleAdviceDeclaration EOF ;
    public final String entryRuleAdviceDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdviceDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:2: (iv_ruleAdviceDeclaration= ruleAdviceDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1531:2: iv_ruleAdviceDeclaration= ruleAdviceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAdviceDeclarationRule()); 
            pushFollow(FOLLOW_ruleAdviceDeclaration_in_entryRuleAdviceDeclaration3974);
            iv_ruleAdviceDeclaration=ruleAdviceDeclaration();

            state._fsp--;

             current =iv_ruleAdviceDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdviceDeclaration3985); 

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
    // $ANTLR end "entryRuleAdviceDeclaration"


    // $ANTLR start "ruleAdviceDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:1: ruleAdviceDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'advice' this_QueryType_1= ruleQueryType kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleAdviceDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QueryType_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1541:28: ( (kw= 'advice' this_QueryType_1= ruleQueryType kw= ':' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1542:1: (kw= 'advice' this_QueryType_1= ruleQueryType kw= ':' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1542:1: (kw= 'advice' this_QueryType_1= ruleQueryType kw= ':' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1543:2: kw= 'advice' this_QueryType_1= ruleQueryType kw= ':'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleAdviceDeclaration4023); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAdviceDeclarationAccess().getAdviceKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getAdviceDeclarationAccess().getQueryTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleQueryType_in_ruleAdviceDeclaration4045);
            this_QueryType_1=ruleQueryType();

            state._fsp--;


            		current.merge(this_QueryType_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleAdviceDeclaration4063); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAdviceDeclarationAccess().getColonKeyword_2()); 
                

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
    // $ANTLR end "ruleAdviceDeclaration"


    // $ANTLR start "entryRuleQueryType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1573:1: entryRuleQueryType returns [String current=null] : iv_ruleQueryType= ruleQueryType EOF ;
    public final String entryRuleQueryType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1574:2: (iv_ruleQueryType= ruleQueryType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:2: iv_ruleQueryType= ruleQueryType EOF
            {
             newCompositeNode(grammarAccess.getQueryTypeRule()); 
            pushFollow(FOLLOW_ruleQueryType_in_entryRuleQueryType4104);
            iv_ruleQueryType=ruleQueryType();

            state._fsp--;

             current =iv_ruleQueryType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryType4115); 

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
    // $ANTLR end "entryRuleQueryType"


    // $ANTLR start "ruleQueryType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1582:1: ruleQueryType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pre' | kw= 'post' | kw= 'inv' ) ;
    public final AntlrDatatypeRuleToken ruleQueryType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1585:28: ( (kw= 'pre' | kw= 'post' | kw= 'inv' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1586:1: (kw= 'pre' | kw= 'post' | kw= 'inv' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1586:1: (kw= 'pre' | kw= 'post' | kw= 'inv' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt17=1;
                }
                break;
            case 32:
                {
                alt17=2;
                }
                break;
            case 33:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1587:2: kw= 'pre'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleQueryType4153); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryTypeAccess().getPreKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1594:2: kw= 'post'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleQueryType4172); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryTypeAccess().getPostKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1601:2: kw= 'inv'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleQueryType4191); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryTypeAccess().getInvKeyword_2()); 
                        

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
    // $ANTLR end "ruleQueryType"


    // $ANTLR start "entryRuleAdviceType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:1: entryRuleAdviceType returns [EObject current=null] : iv_ruleAdviceType= ruleAdviceType EOF ;
    public final EObject entryRuleAdviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdviceType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1615:2: (iv_ruleAdviceType= ruleAdviceType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1616:2: iv_ruleAdviceType= ruleAdviceType EOF
            {
             newCompositeNode(grammarAccess.getAdviceTypeRule()); 
            pushFollow(FOLLOW_ruleAdviceType_in_entryRuleAdviceType4231);
            iv_ruleAdviceType=ruleAdviceType();

            state._fsp--;

             current =iv_ruleAdviceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdviceType4241); 

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
    // $ANTLR end "entryRuleAdviceType"


    // $ANTLR start "ruleAdviceType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1623:1: ruleAdviceType returns [EObject current=null] : ( (otherlv_0= 'and' | otherlv_1= 'or' | otherlv_2= 'xor' ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAdviceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1626:28: ( ( (otherlv_0= 'and' | otherlv_1= 'or' | otherlv_2= 'xor' ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1627:1: ( (otherlv_0= 'and' | otherlv_1= 'or' | otherlv_2= 'xor' ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1627:1: ( (otherlv_0= 'and' | otherlv_1= 'or' | otherlv_2= 'xor' ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1627:2: (otherlv_0= 'and' | otherlv_1= 'or' | otherlv_2= 'xor' ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1627:2: (otherlv_0= 'and' | otherlv_1= 'or' | otherlv_2= 'xor' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1627:4: otherlv_0= 'and'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleAdviceType4279); 

                        	newLeafNode(otherlv_0, grammarAccess.getAdviceTypeAccess().getAndKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:7: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleAdviceType4297); 

                        	newLeafNode(otherlv_1, grammarAccess.getAdviceTypeAccess().getOrKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1637:7: otherlv_2= 'xor'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleAdviceType4315); 

                        	newLeafNode(otherlv_2, grammarAccess.getAdviceTypeAccess().getXorKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1641:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1642:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1642:1: (lv_name_3_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1643:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAdviceType4333); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAdviceTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdviceTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleAdviceType"


    // $ANTLR start "entryRuleIntroAdviceQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:1: entryRuleIntroAdviceQuery returns [EObject current=null] : iv_ruleIntroAdviceQuery= ruleIntroAdviceQuery EOF ;
    public final EObject entryRuleIntroAdviceQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntroAdviceQuery = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:2: (iv_ruleIntroAdviceQuery= ruleIntroAdviceQuery EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:2: iv_ruleIntroAdviceQuery= ruleIntroAdviceQuery EOF
            {
             newCompositeNode(grammarAccess.getIntroAdviceQueryRule()); 
            pushFollow(FOLLOW_ruleIntroAdviceQuery_in_entryRuleIntroAdviceQuery4374);
            iv_ruleIntroAdviceQuery=ruleIntroAdviceQuery();

            state._fsp--;

             current =iv_ruleIntroAdviceQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntroAdviceQuery4384); 

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
    // $ANTLR end "entryRuleIntroAdviceQuery"


    // $ANTLR start "ruleIntroAdviceQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1676:1: ruleIntroAdviceQuery returns [EObject current=null] : ( (lv_name_0_0= ruleOclExpression ) ) ;
    public final EObject ruleIntroAdviceQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1679:28: ( ( (lv_name_0_0= ruleOclExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1680:1: ( (lv_name_0_0= ruleOclExpression ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1680:1: ( (lv_name_0_0= ruleOclExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1681:1: (lv_name_0_0= ruleOclExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1681:1: (lv_name_0_0= ruleOclExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1682:3: lv_name_0_0= ruleOclExpression
            {
             
            	        newCompositeNode(grammarAccess.getIntroAdviceQueryAccess().getNameOclExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleOclExpression_in_ruleIntroAdviceQuery4429);
            lv_name_0_0=ruleOclExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntroAdviceQueryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"OclExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleIntroAdviceQuery"


    // $ANTLR start "entryRuleIntro"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1706:1: entryRuleIntro returns [EObject current=null] : iv_ruleIntro= ruleIntro EOF ;
    public final EObject entryRuleIntro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntro = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1707:2: (iv_ruleIntro= ruleIntro EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:2: iv_ruleIntro= ruleIntro EOF
            {
             newCompositeNode(grammarAccess.getIntroRule()); 
            pushFollow(FOLLOW_ruleIntro_in_entryRuleIntro4464);
            iv_ruleIntro=ruleIntro();

            state._fsp--;

             current =iv_ruleIntro; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntro4474); 

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
    // $ANTLR end "entryRuleIntro"


    // $ANTLR start "ruleIntro"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1715:1: ruleIntro returns [EObject current=null] : ( ruleIntroDeclaration ( (lv_introtype_1_0= ruleIntroType ) ) ( (lv_introquey_2_0= ruleIntroQuery ) ) ) ;
    public final EObject ruleIntro() throws RecognitionException {
        EObject current = null;

        EObject lv_introtype_1_0 = null;

        EObject lv_introquey_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1718:28: ( ( ruleIntroDeclaration ( (lv_introtype_1_0= ruleIntroType ) ) ( (lv_introquey_2_0= ruleIntroQuery ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1719:1: ( ruleIntroDeclaration ( (lv_introtype_1_0= ruleIntroType ) ) ( (lv_introquey_2_0= ruleIntroQuery ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1719:1: ( ruleIntroDeclaration ( (lv_introtype_1_0= ruleIntroType ) ) ( (lv_introquey_2_0= ruleIntroQuery ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1720:5: ruleIntroDeclaration ( (lv_introtype_1_0= ruleIntroType ) ) ( (lv_introquey_2_0= ruleIntroQuery ) )
            {
             
                    newCompositeNode(grammarAccess.getIntroAccess().getIntroDeclarationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIntroDeclaration_in_ruleIntro4515);
            ruleIntroDeclaration();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1727:1: ( (lv_introtype_1_0= ruleIntroType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1728:1: (lv_introtype_1_0= ruleIntroType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1728:1: (lv_introtype_1_0= ruleIntroType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1729:3: lv_introtype_1_0= ruleIntroType
            {
             
            	        newCompositeNode(grammarAccess.getIntroAccess().getIntrotypeIntroTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIntroType_in_ruleIntro4535);
            lv_introtype_1_0=ruleIntroType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntroRule());
            	        }
                   		set(
                   			current, 
                   			"introtype",
                    		lv_introtype_1_0, 
                    		"IntroType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1745:2: ( (lv_introquey_2_0= ruleIntroQuery ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1746:1: (lv_introquey_2_0= ruleIntroQuery )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1746:1: (lv_introquey_2_0= ruleIntroQuery )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:3: lv_introquey_2_0= ruleIntroQuery
            {
             
            	        newCompositeNode(grammarAccess.getIntroAccess().getIntroqueyIntroQueryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntroQuery_in_ruleIntro4556);
            lv_introquey_2_0=ruleIntroQuery();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntroRule());
            	        }
                   		set(
                   			current, 
                   			"introquey",
                    		lv_introquey_2_0, 
                    		"IntroQuery");
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
    // $ANTLR end "ruleIntro"


    // $ANTLR start "entryRuleIntroDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1771:1: entryRuleIntroDeclaration returns [String current=null] : iv_ruleIntroDeclaration= ruleIntroDeclaration EOF ;
    public final String entryRuleIntroDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntroDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1772:2: (iv_ruleIntroDeclaration= ruleIntroDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:2: iv_ruleIntroDeclaration= ruleIntroDeclaration EOF
            {
             newCompositeNode(grammarAccess.getIntroDeclarationRule()); 
            pushFollow(FOLLOW_ruleIntroDeclaration_in_entryRuleIntroDeclaration4593);
            iv_ruleIntroDeclaration=ruleIntroDeclaration();

            state._fsp--;

             current =iv_ruleIntroDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntroDeclaration4604); 

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
    // $ANTLR end "entryRuleIntroDeclaration"


    // $ANTLR start "ruleIntroDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1780:1: ruleIntroDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'intro' kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleIntroDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1783:28: ( (kw= 'intro' kw= ':' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1784:1: (kw= 'intro' kw= ':' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1784:1: (kw= 'intro' kw= ':' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1785:2: kw= 'intro' kw= ':'
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleIntroDeclaration4642); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIntroDeclarationAccess().getIntroKeyword_0()); 
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleIntroDeclaration4655); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIntroDeclarationAccess().getColonKeyword_1()); 
                

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
    // $ANTLR end "ruleIntroDeclaration"


    // $ANTLR start "entryRuleIntroType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1804:1: entryRuleIntroType returns [EObject current=null] : iv_ruleIntroType= ruleIntroType EOF ;
    public final EObject entryRuleIntroType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntroType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1805:2: (iv_ruleIntroType= ruleIntroType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1806:2: iv_ruleIntroType= ruleIntroType EOF
            {
             newCompositeNode(grammarAccess.getIntroTypeRule()); 
            pushFollow(FOLLOW_ruleIntroType_in_entryRuleIntroType4695);
            iv_ruleIntroType=ruleIntroType();

            state._fsp--;

             current =iv_ruleIntroType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntroType4705); 

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
    // $ANTLR end "entryRuleIntroType"


    // $ANTLR start "ruleIntroType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:1: ruleIntroType returns [EObject current=null] : ( ruleQueryType ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIntroType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1816:28: ( ( ruleQueryType ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1817:1: ( ruleQueryType ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1817:1: ( ruleQueryType ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1818:5: ruleQueryType ( (lv_name_1_0= RULE_ID ) )
            {
             
                    newCompositeNode(grammarAccess.getIntroTypeAccess().getQueryTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQueryType_in_ruleIntroType4746);
            ruleQueryType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1825:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1827:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntroType4762); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIntroTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntroTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleIntroType"


    // $ANTLR start "entryRuleIntroQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1851:1: entryRuleIntroQuery returns [EObject current=null] : iv_ruleIntroQuery= ruleIntroQuery EOF ;
    public final EObject entryRuleIntroQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntroQuery = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1852:2: (iv_ruleIntroQuery= ruleIntroQuery EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1853:2: iv_ruleIntroQuery= ruleIntroQuery EOF
            {
             newCompositeNode(grammarAccess.getIntroQueryRule()); 
            pushFollow(FOLLOW_ruleIntroQuery_in_entryRuleIntroQuery4803);
            iv_ruleIntroQuery=ruleIntroQuery();

            state._fsp--;

             current =iv_ruleIntroQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntroQuery4813); 

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
    // $ANTLR end "entryRuleIntroQuery"


    // $ANTLR start "ruleIntroQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1860:1: ruleIntroQuery returns [EObject current=null] : ( (lv_name_0_0= ruleOclExpression ) ) ;
    public final EObject ruleIntroQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1863:28: ( ( (lv_name_0_0= ruleOclExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1864:1: ( (lv_name_0_0= ruleOclExpression ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1864:1: ( (lv_name_0_0= ruleOclExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1865:1: (lv_name_0_0= ruleOclExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1865:1: (lv_name_0_0= ruleOclExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1866:3: lv_name_0_0= ruleOclExpression
            {
             
            	        newCompositeNode(grammarAccess.getIntroQueryAccess().getNameOclExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleOclExpression_in_ruleIntroQuery4858);
            lv_name_0_0=ruleOclExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntroQueryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"OclExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleIntroQuery"


    // $ANTLR start "entryRuleQueryDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1890:1: entryRuleQueryDeclaration returns [EObject current=null] : iv_ruleQueryDeclaration= ruleQueryDeclaration EOF ;
    public final EObject entryRuleQueryDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1891:2: (iv_ruleQueryDeclaration= ruleQueryDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1892:2: iv_ruleQueryDeclaration= ruleQueryDeclaration EOF
            {
             newCompositeNode(grammarAccess.getQueryDeclarationRule()); 
            pushFollow(FOLLOW_ruleQueryDeclaration_in_entryRuleQueryDeclaration4893);
            iv_ruleQueryDeclaration=ruleQueryDeclaration();

            state._fsp--;

             current =iv_ruleQueryDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryDeclaration4903); 

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
    // $ANTLR end "entryRuleQueryDeclaration"


    // $ANTLR start "ruleQueryDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1899:1: ruleQueryDeclaration returns [EObject current=null] : ( ruleQueryType otherlv_1= '->' otherlv_2= 'select' this_QueryBody_3= ruleQueryBody ) ;
    public final EObject ruleQueryDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_QueryBody_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1902:28: ( ( ruleQueryType otherlv_1= '->' otherlv_2= 'select' this_QueryBody_3= ruleQueryBody ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: ( ruleQueryType otherlv_1= '->' otherlv_2= 'select' this_QueryBody_3= ruleQueryBody )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: ( ruleQueryType otherlv_1= '->' otherlv_2= 'select' this_QueryBody_3= ruleQueryBody )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:5: ruleQueryType otherlv_1= '->' otherlv_2= 'select' this_QueryBody_3= ruleQueryBody
            {
             
                    newCompositeNode(grammarAccess.getQueryDeclarationAccess().getQueryTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQueryType_in_ruleQueryDeclaration4944);
            ruleQueryType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleQueryDeclaration4955); 

                	newLeafNode(otherlv_1, grammarAccess.getQueryDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleQueryDeclaration4967); 

                	newLeafNode(otherlv_2, grammarAccess.getQueryDeclarationAccess().getSelectKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getQueryDeclarationAccess().getQueryBodyParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleQueryBody_in_ruleQueryDeclaration4989);
            this_QueryBody_3=ruleQueryBody();

            state._fsp--;

             
                    current = this_QueryBody_3; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleQueryDeclaration"


    // $ANTLR start "entryRuleQueryBody"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1936:1: entryRuleQueryBody returns [EObject current=null] : iv_ruleQueryBody= ruleQueryBody EOF ;
    public final EObject entryRuleQueryBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryBody = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1937:2: (iv_ruleQueryBody= ruleQueryBody EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1938:2: iv_ruleQueryBody= ruleQueryBody EOF
            {
             newCompositeNode(grammarAccess.getQueryBodyRule()); 
            pushFollow(FOLLOW_ruleQueryBody_in_entryRuleQueryBody5024);
            iv_ruleQueryBody=ruleQueryBody();

            state._fsp--;

             current =iv_ruleQueryBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryBody5034); 

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
    // $ANTLR end "entryRuleQueryBody"


    // $ANTLR start "ruleQueryBody"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1945:1: ruleQueryBody returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleQueryBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1948:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1949:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1949:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1949:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleQueryBody5071); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryBodyAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getQueryBodyAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleQueryBody5093);
            this_Expression_1=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleQueryBody5104); 

                	newLeafNode(otherlv_2, grammarAccess.getQueryBodyAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleQueryBody"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1974:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1976:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5140);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5150); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1983:1: ruleExpression returns [EObject current=null] : ( (otherlv_0= 'exp:OCLExpression' otherlv_1= '|' otherlv_2= 'exp.oclIsTypeOf(thenExp)' ) | ( (otherlv_3= 'exp:OCLExpression' otherlv_4= '|' otherlv_5= 'exp.oclIsTypeOf(ifExp)' otherlv_6= 'and' otherlv_7= 'exp.condition.refferedVariable' otherlv_8= '=' ) ( (lv_name_9_0= RULE_ID ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1986:28: ( ( (otherlv_0= 'exp:OCLExpression' otherlv_1= '|' otherlv_2= 'exp.oclIsTypeOf(thenExp)' ) | ( (otherlv_3= 'exp:OCLExpression' otherlv_4= '|' otherlv_5= 'exp.oclIsTypeOf(ifExp)' otherlv_6= 'and' otherlv_7= 'exp.condition.refferedVariable' otherlv_8= '=' ) ( (lv_name_9_0= RULE_ID ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1987:1: ( (otherlv_0= 'exp:OCLExpression' otherlv_1= '|' otherlv_2= 'exp.oclIsTypeOf(thenExp)' ) | ( (otherlv_3= 'exp:OCLExpression' otherlv_4= '|' otherlv_5= 'exp.oclIsTypeOf(ifExp)' otherlv_6= 'and' otherlv_7= 'exp.condition.refferedVariable' otherlv_8= '=' ) ( (lv_name_9_0= RULE_ID ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1987:1: ( (otherlv_0= 'exp:OCLExpression' otherlv_1= '|' otherlv_2= 'exp.oclIsTypeOf(thenExp)' ) | ( (otherlv_3= 'exp:OCLExpression' otherlv_4= '|' otherlv_5= 'exp.oclIsTypeOf(ifExp)' otherlv_6= 'and' otherlv_7= 'exp.condition.refferedVariable' otherlv_8= '=' ) ( (lv_name_9_0= RULE_ID ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==40) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==42) ) {
                        alt19=2;
                    }
                    else if ( (LA19_2==41) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1987:2: (otherlv_0= 'exp:OCLExpression' otherlv_1= '|' otherlv_2= 'exp.oclIsTypeOf(thenExp)' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1987:2: (otherlv_0= 'exp:OCLExpression' otherlv_1= '|' otherlv_2= 'exp.oclIsTypeOf(thenExp)' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1987:4: otherlv_0= 'exp:OCLExpression' otherlv_1= '|' otherlv_2= 'exp.oclIsTypeOf(thenExp)'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleExpression5188); 

                        	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExpOCLExpressionKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleExpression5200); 

                        	newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getVerticalLineKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleExpression5212); 

                        	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getExpOclIsTypeOfThenExpKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2000:6: ( (otherlv_3= 'exp:OCLExpression' otherlv_4= '|' otherlv_5= 'exp.oclIsTypeOf(ifExp)' otherlv_6= 'and' otherlv_7= 'exp.condition.refferedVariable' otherlv_8= '=' ) ( (lv_name_9_0= RULE_ID ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2000:6: ( (otherlv_3= 'exp:OCLExpression' otherlv_4= '|' otherlv_5= 'exp.oclIsTypeOf(ifExp)' otherlv_6= 'and' otherlv_7= 'exp.condition.refferedVariable' otherlv_8= '=' ) ( (lv_name_9_0= RULE_ID ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2000:7: (otherlv_3= 'exp:OCLExpression' otherlv_4= '|' otherlv_5= 'exp.oclIsTypeOf(ifExp)' otherlv_6= 'and' otherlv_7= 'exp.condition.refferedVariable' otherlv_8= '=' ) ( (lv_name_9_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2000:7: (otherlv_3= 'exp:OCLExpression' otherlv_4= '|' otherlv_5= 'exp.oclIsTypeOf(ifExp)' otherlv_6= 'and' otherlv_7= 'exp.condition.refferedVariable' otherlv_8= '=' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2000:9: otherlv_3= 'exp:OCLExpression' otherlv_4= '|' otherlv_5= 'exp.oclIsTypeOf(ifExp)' otherlv_6= 'and' otherlv_7= 'exp.condition.refferedVariable' otherlv_8= '='
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleExpression5233); 

                        	newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getExpOCLExpressionKeyword_1_0_0());
                        
                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleExpression5245); 

                        	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getVerticalLineKeyword_1_0_1());
                        
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleExpression5257); 

                        	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getExpOclIsTypeOfIfExpKeyword_1_0_2());
                        
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleExpression5269); 

                        	newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getAndKeyword_1_0_3());
                        
                    otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleExpression5281); 

                        	newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getExpConditionRefferedVariableKeyword_1_0_4());
                        
                    otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleExpression5293); 

                        	newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getEqualsSignKeyword_1_0_5());
                        

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2024:2: ( (lv_name_9_0= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2025:1: (lv_name_9_0= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2025:1: (lv_name_9_0= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2026:3: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression5311); 

                    			newLeafNode(lv_name_9_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_9_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOclExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2050:1: entryRuleOclExpression returns [EObject current=null] : iv_ruleOclExpression= ruleOclExpression EOF ;
    public final EObject entryRuleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2051:2: (iv_ruleOclExpression= ruleOclExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2052:2: iv_ruleOclExpression= ruleOclExpression EOF
            {
             newCompositeNode(grammarAccess.getOclExpressionRule()); 
            pushFollow(FOLLOW_ruleOclExpression_in_entryRuleOclExpression5353);
            iv_ruleOclExpression=ruleOclExpression();

            state._fsp--;

             current =iv_ruleOclExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclExpression5363); 

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
    // $ANTLR end "entryRuleOclExpression"


    // $ANTLR start "ruleOclExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2059:1: ruleOclExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleOclExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2062:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2064:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2064:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2065:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOclExpression5404); 

            			newLeafNode(lv_value_0_0, grammarAccess.getOclExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOclExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleOclExpression"


    // $ANTLR start "entryRuleNameChar"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2089:1: entryRuleNameChar returns [String current=null] : iv_ruleNameChar= ruleNameChar EOF ;
    public final String entryRuleNameChar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameChar = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2090:2: (iv_ruleNameChar= ruleNameChar EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2091:2: iv_ruleNameChar= ruleNameChar EOF
            {
             newCompositeNode(grammarAccess.getNameCharRule()); 
            pushFollow(FOLLOW_ruleNameChar_in_entryRuleNameChar5445);
            iv_ruleNameChar=ruleNameChar();

            state._fsp--;

             current =iv_ruleNameChar.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameChar5456); 

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
    // $ANTLR end "entryRuleNameChar"


    // $ANTLR start "ruleNameChar"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2098:1: ruleNameChar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleNameChar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2101:28: ( (this_ID_0= RULE_ID )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:1: (this_ID_0= RULE_ID )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:1: (this_ID_0= RULE_ID )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameChar5496); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getNameCharAccess().getIDTerminalRuleCall()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // $ANTLR end "ruleNameChar"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA7_eotS =
        "\7\uffff";
    static final String DFA7_eofS =
        "\7\uffff";
    static final String DFA7_minS =
        "\1\16\2\4\1\uffff\1\4\2\uffff";
    static final String DFA7_maxS =
        "\1\16\1\4\1\21\1\uffff\1\14\2\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\1\1\uffff\1\3\1\2";
    static final String DFA7_specialS =
        "\7\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\2\12\uffff\1\3\1\uffff\1\4",
            "",
            "\1\6\7\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "218:1: ( (kw= 'let' this_letVarName_1= ruleletVarName kw= ':' kw= '{' (this_Operation_4= ruleOperation (kw= ',' this_Operation_6= ruleOperation )* ) kw= '}' ) | (kw= 'let' this_letVarName_9= ruleletVarName kw= '->' this_letVarName_11= ruleletVarName kw= ':' kw= '{' (this_COA_14= ruleCOA kw= '->' this_SCOA_16= ruleSCOA ) (kw= ',' (this_COA_18= ruleCOA kw= '->' this_SCOA_20= ruleSCOA ) )* kw= '}' ) | (kw= 'let' this_letVarName_23= ruleletVarName kw= '->' this_letVarNameArray_25= ruleletVarNameArray kw= ':' kw= '{' (this_COA_28= ruleCOA kw= '->' kw= '{' (this_COA_31= ruleCOA (kw= ',' this_COA_33= ruleCOA )+ ) kw= '}' ) (kw= ',' (this_COA_36= ruleCOA kw= '->' kw= '{' (this_COA_39= ruleCOA (kw= ',' this_COA_41= ruleCOA )+ ) kw= '}' ) )* kw= '}' ) )";
        }
    }
    static final String DFA8_eotS =
        "\7\uffff";
    static final String DFA8_eofS =
        "\1\uffff\1\3\2\uffff\1\6\2\uffff";
    static final String DFA8_minS =
        "\3\4\1\uffff\1\4\2\uffff";
    static final String DFA8_maxS =
        "\1\4\1\22\1\4\1\uffff\1\27\2\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\1\3";
    static final String DFA8_specialS =
        "\7\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\1\10\uffff\1\3\2\uffff\2\3\1\2",
            "\1\4",
            "",
            "\1\4\10\uffff\1\6\2\uffff\2\6\5\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "703:1: (this_ClassifierContext_0= ruleClassifierContext | this_OperationContext_1= ruleOperationContext | this_AttributeContext_2= ruleAttributeContext )";
        }
    }
    static final String DFA11_eotS =
        "\4\uffff";
    static final String DFA11_eofS =
        "\1\uffff\1\3\2\uffff";
    static final String DFA11_minS =
        "\2\4\2\uffff";
    static final String DFA11_maxS =
        "\1\4\1\45\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\1\15\uffff\1\2\13\uffff\4\3\3\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1124:1: (this_ClassifierContext_1= ruleClassifierContext | this_OperationContext_2= ruleOperationContext )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleAspect222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectDefinition_in_ruleAspect249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMapping331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMappingName_in_ruleMapping352 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMapping364 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleletExpression_in_ruleMapping380 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapping391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletExpression_in_entryRuleletExpression428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletExpression439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleletExpression478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleletVarName_in_ruleletExpression500 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleletExpression518 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleletExpression531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleletExpression554 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleletExpression573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleletExpression595 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleletExpression616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleletExpression637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleletVarName_in_ruleletExpression659 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleletExpression677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleletVarName_in_ruleletExpression699 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleletExpression717 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleletExpression730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCOA_in_ruleletExpression753 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleletExpression771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSCOA_in_ruleletExpression793 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleletExpression813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCOA_in_ruleletExpression836 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleletExpression854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSCOA_in_ruleletExpression876 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleletExpression897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleletExpression918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleletVarName_in_ruleletExpression940 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleletExpression958 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleletVarNameArray_in_ruleletExpression980 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleletExpression998 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleletExpression1011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCOA_in_ruleletExpression1034 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleletExpression1052 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleletExpression1065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCOA_in_ruleletExpression1088 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleletExpression1107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCOA_in_ruleletExpression1129 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleletExpression1150 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleletExpression1165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCOA_in_ruleletExpression1188 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleletExpression1206 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleletExpression1219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCOA_in_ruleletExpression1242 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleletExpression1261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCOA_in_ruleletExpression1283 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleletExpression1304 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleletExpression1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_entryRuleCOA1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOA1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleCOA1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCOA_in_entryRuleSCOA1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCOA1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleSCOA1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeContext_in_entryRuleAttributeContext1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeContext1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_ruleAttributeContext1624 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttributeContext1642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleAttributeContext1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_ruleOperation1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationContext_in_ruleOperation1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeContext_in_ruleOperation1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarNameArray_in_entryRuleletVarNameArray1880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletVarNameArray1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleletVarNameArray1929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleletVarName_in_ruleletVarNameArray1952 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleletVarNameArray1971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleletVarName_in_ruleletVarNameArray1993 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleletVarNameArray2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarName_in_entryRuleletVarName2055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletVarName2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleletVarName2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectDefinition_in_entryRuleAspectDefinition2156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspectDefinition2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAspectDefinition2203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAspectName_in_ruleAspectDefinition2219 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAspectDefinition2230 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleMapping_Declaration_in_ruleAspectDefinition2251 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rulePointcut_Declaration_in_ruleAspectDefinition2272 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleContextDeclaration_in_ruleAspectDefinition2288 = new BitSet(new long[]{0x00000023C0000000L});
    public static final BitSet FOLLOW_ruleQueryDeclaration_in_ruleAspectDefinition2310 = new BitSet(new long[]{0x00000023C0000000L});
    public static final BitSet FOLLOW_ruleAI_in_ruleAspectDefinition2332 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAspectDefinition2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectName_in_entryRuleAspectName2381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspectName2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleAspectName2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_Declaration_in_entryRuleMapping_Declaration2482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping_Declaration2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMapping_Declaration2529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapping_Declaration2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingName_in_entryRuleMappingName2585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingName2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMappingName2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointcut_Declaration_in_entryRulePointcut_Declaration2676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointcut_Declaration2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePointcut_Declaration2723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePointcut_Declaration2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDeclaration_in_entryRuleContextDeclaration2784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDeclaration2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleContextDeclaration2833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_ruleContextDeclaration2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationContext_in_ruleContextDeclaration2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_entryRuleClassifierContext2936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifierContext2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleClassifierContext2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationContext_in_entryRuleOperationContext3038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationContext3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_ruleOperationContext3096 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOperationContext3114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperationName_in_ruleOperationContext3136 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperationContext3154 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleOperationContext3177 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_16_in_ruleOperationContext3196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleOperationContext3218 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_24_in_ruleOperationContext3240 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOperationContext3254 = new BitSet(new long[]{0x000000003E000010L});
    public static final BitSet FOLLOW_ruleReturntype_in_ruleOperationContext3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationName_in_entryRuleOperationName3324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationName3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleOperationName3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments3426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleArguments3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturntype_in_entryRuleReturntype3528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturntype3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleReturntype3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReturntype3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleReturntype3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleReturntype3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleReturntype3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleReturntype3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAI_in_entryRuleAI3726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAI3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdvice_in_ruleAI3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntro_in_ruleAI3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdvice_in_entryRuleAdvice3845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdvice3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdviceDeclaration_in_ruleAdvice3896 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleAdviceType_in_ruleAdvice3916 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIntroAdviceQuery_in_ruleAdvice3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdviceDeclaration_in_entryRuleAdviceDeclaration3974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdviceDeclaration3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAdviceDeclaration4023 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleQueryType_in_ruleAdviceDeclaration4045 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAdviceDeclaration4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryType_in_entryRuleQueryType4104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryType4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleQueryType4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleQueryType4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleQueryType4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdviceType_in_entryRuleAdviceType4231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdviceType4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAdviceType4279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_35_in_ruleAdviceType4297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36_in_ruleAdviceType4315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAdviceType4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroAdviceQuery_in_entryRuleIntroAdviceQuery4374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntroAdviceQuery4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleIntroAdviceQuery4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntro_in_entryRuleIntro4464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntro4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroDeclaration_in_ruleIntro4515 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleIntroType_in_ruleIntro4535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIntroQuery_in_ruleIntro4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroDeclaration_in_entryRuleIntroDeclaration4593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntroDeclaration4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleIntroDeclaration4642 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIntroDeclaration4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroType_in_entryRuleIntroType4695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntroType4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryType_in_ruleIntroType4746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntroType4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroQuery_in_entryRuleIntroQuery4803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntroQuery4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleIntroQuery4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryDeclaration_in_entryRuleQueryDeclaration4893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryDeclaration4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryType_in_ruleQueryDeclaration4944 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQueryDeclaration4955 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleQueryDeclaration4967 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleQueryBody_in_ruleQueryDeclaration4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryBody_in_entryRuleQueryBody5024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryBody5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleQueryBody5071 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleQueryBody5093 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQueryBody5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExpression5188 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleExpression5200 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExpression5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExpression5233 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleExpression5245 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExpression5257 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleExpression5269 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExpression5281 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExpression5293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_entryRuleOclExpression5353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclExpression5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOclExpression5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_entryRuleNameChar5445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameChar5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameChar5496 = new BitSet(new long[]{0x0000000000000012L});

}