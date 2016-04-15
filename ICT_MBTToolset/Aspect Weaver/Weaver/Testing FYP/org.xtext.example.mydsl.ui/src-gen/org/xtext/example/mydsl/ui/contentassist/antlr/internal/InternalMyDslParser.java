package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Boolean'", "'String'", "'int'", "'float'", "'double'", "'pre'", "'post'", "'inv'", "'and'", "'or'", "'xor'", "'mapping'", "'{'", "'}'", "'let'", "':'", "','", "'->'", "'::'", "'aspect'", "'import_mapping'", "'pointcut'", "'context'", "'('", "')'", "'advice'", "'intro'", "'select'", "'exp:OCLExpression'", "'|'", "'exp.oclIsTypeOf(thenExp)'", "'exp.oclIsTypeOf(ifExp)'", "'exp.condition.refferedVariable'", "'='"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__AspectAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Model__AspectAssignment ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__AspectAssignment ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__AspectAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__AspectAssignment )
            {
             before(grammarAccess.getModelAccess().getAspectAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__AspectAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Model__AspectAssignment
            {
            pushFollow(FOLLOW_rule__Model__AspectAssignment_in_ruleModel94);
            rule__Model__AspectAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAspectAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAspect"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleAspect EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleAspect EOF
            {
             before(grammarAccess.getAspectRule()); 
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect121);
            ruleAspect();

            state._fsp--;

             after(grammarAccess.getAspectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect128); 

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
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleAspect : ( ( rule__Aspect__Alternatives ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Aspect__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Aspect__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Aspect__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Aspect__Alternatives )
            {
             before(grammarAccess.getAspectAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Aspect__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Aspect__Alternatives
            {
            pushFollow(FOLLOW_rule__Aspect__Alternatives_in_ruleAspect154);
            rule__Aspect__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAspectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleMapping"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleMapping EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping181);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping188); 

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Mapping__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Mapping__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping214);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleletExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleletExpression : ruleletExpression EOF ;
    public final void entryRuleletExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleletExpression EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleletExpression EOF
            {
             before(grammarAccess.getLetExpressionRule()); 
            pushFollow(FOLLOW_ruleletExpression_in_entryRuleletExpression241);
            ruleletExpression();

            state._fsp--;

             after(grammarAccess.getLetExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletExpression248); 

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
    // $ANTLR end "entryRuleletExpression"


    // $ANTLR start "ruleletExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleletExpression : ( ( rule__LetExpression__Alternatives ) ) ;
    public final void ruleletExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__LetExpression__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__LetExpression__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__LetExpression__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__LetExpression__Alternatives )
            {
             before(grammarAccess.getLetExpressionAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__LetExpression__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__LetExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__LetExpression__Alternatives_in_ruleletExpression274);
            rule__LetExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleletExpression"


    // $ANTLR start "entryRuleCOA"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleCOA : ruleCOA EOF ;
    public final void entryRuleCOA() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleCOA EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleCOA EOF
            {
             before(grammarAccess.getCOARule()); 
            pushFollow(FOLLOW_ruleCOA_in_entryRuleCOA301);
            ruleCOA();

            state._fsp--;

             after(grammarAccess.getCOARule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOA308); 

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
    // $ANTLR end "entryRuleCOA"


    // $ANTLR start "ruleCOA"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleCOA : ( ruleOperation ) ;
    public final void ruleCOA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ruleOperation ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ruleOperation )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ruleOperation )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ruleOperation
            {
             before(grammarAccess.getCOAAccess().getOperationParserRuleCall()); 
            pushFollow(FOLLOW_ruleOperation_in_ruleCOA334);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getCOAAccess().getOperationParserRuleCall()); 

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
    // $ANTLR end "ruleCOA"


    // $ANTLR start "entryRuleSCOA"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleSCOA : ruleSCOA EOF ;
    public final void entryRuleSCOA() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleSCOA EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleSCOA EOF
            {
             before(grammarAccess.getSCOARule()); 
            pushFollow(FOLLOW_ruleSCOA_in_entryRuleSCOA360);
            ruleSCOA();

            state._fsp--;

             after(grammarAccess.getSCOARule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCOA367); 

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
    // $ANTLR end "entryRuleSCOA"


    // $ANTLR start "ruleSCOA"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleSCOA : ( ruleOperation ) ;
    public final void ruleSCOA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ruleOperation ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ruleOperation )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ruleOperation )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ruleOperation
            {
             before(grammarAccess.getSCOAAccess().getOperationParserRuleCall()); 
            pushFollow(FOLLOW_ruleOperation_in_ruleSCOA393);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getSCOAAccess().getOperationParserRuleCall()); 

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
    // $ANTLR end "ruleSCOA"


    // $ANTLR start "entryRuleAttributeContext"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleAttributeContext : ruleAttributeContext EOF ;
    public final void entryRuleAttributeContext() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleAttributeContext EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleAttributeContext EOF
            {
             before(grammarAccess.getAttributeContextRule()); 
            pushFollow(FOLLOW_ruleAttributeContext_in_entryRuleAttributeContext419);
            ruleAttributeContext();

            state._fsp--;

             after(grammarAccess.getAttributeContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeContext426); 

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
    // $ANTLR end "entryRuleAttributeContext"


    // $ANTLR start "ruleAttributeContext"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleAttributeContext : ( ( rule__AttributeContext__Group__0 ) ) ;
    public final void ruleAttributeContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__AttributeContext__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__AttributeContext__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__AttributeContext__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__AttributeContext__Group__0 )
            {
             before(grammarAccess.getAttributeContextAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__AttributeContext__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__AttributeContext__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeContext__Group__0_in_ruleAttributeContext452);
            rule__AttributeContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeContextAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeContext"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleOperation EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation479);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation486); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Operation__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Operation__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation512);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleletVarNameArray"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleletVarNameArray : ruleletVarNameArray EOF ;
    public final void entryRuleletVarNameArray() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleletVarNameArray EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleletVarNameArray EOF
            {
             before(grammarAccess.getLetVarNameArrayRule()); 
            pushFollow(FOLLOW_ruleletVarNameArray_in_entryRuleletVarNameArray539);
            ruleletVarNameArray();

            state._fsp--;

             after(grammarAccess.getLetVarNameArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletVarNameArray546); 

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
    // $ANTLR end "entryRuleletVarNameArray"


    // $ANTLR start "ruleletVarNameArray"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleletVarNameArray : ( ( rule__LetVarNameArray__Group__0 ) ) ;
    public final void ruleletVarNameArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__LetVarNameArray__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__LetVarNameArray__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__LetVarNameArray__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__LetVarNameArray__Group__0 )
            {
             before(grammarAccess.getLetVarNameArrayAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__LetVarNameArray__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__LetVarNameArray__Group__0
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group__0_in_ruleletVarNameArray572);
            rule__LetVarNameArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetVarNameArrayAccess().getGroup()); 

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
    // $ANTLR end "ruleletVarNameArray"


    // $ANTLR start "entryRuleletVarName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleletVarName : ruleletVarName EOF ;
    public final void entryRuleletVarName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleletVarName EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleletVarName EOF
            {
             before(grammarAccess.getLetVarNameRule()); 
            pushFollow(FOLLOW_ruleletVarName_in_entryRuleletVarName599);
            ruleletVarName();

            state._fsp--;

             after(grammarAccess.getLetVarNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleletVarName606); 

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
    // $ANTLR end "entryRuleletVarName"


    // $ANTLR start "ruleletVarName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleletVarName : ( ruleNameChar ) ;
    public final void ruleletVarName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ruleNameChar ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ruleNameChar )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ruleNameChar )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ruleNameChar
            {
             before(grammarAccess.getLetVarNameAccess().getNameCharParserRuleCall()); 
            pushFollow(FOLLOW_ruleNameChar_in_ruleletVarName632);
            ruleNameChar();

            state._fsp--;

             after(grammarAccess.getLetVarNameAccess().getNameCharParserRuleCall()); 

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
    // $ANTLR end "ruleletVarName"


    // $ANTLR start "entryRuleAspectDefinition"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleAspectDefinition : ruleAspectDefinition EOF ;
    public final void entryRuleAspectDefinition() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleAspectDefinition EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleAspectDefinition EOF
            {
             before(grammarAccess.getAspectDefinitionRule()); 
            pushFollow(FOLLOW_ruleAspectDefinition_in_entryRuleAspectDefinition658);
            ruleAspectDefinition();

            state._fsp--;

             after(grammarAccess.getAspectDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspectDefinition665); 

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
    // $ANTLR end "entryRuleAspectDefinition"


    // $ANTLR start "ruleAspectDefinition"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleAspectDefinition : ( ( rule__AspectDefinition__Group__0 ) ) ;
    public final void ruleAspectDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__AspectDefinition__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__AspectDefinition__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__AspectDefinition__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__AspectDefinition__Group__0 )
            {
             before(grammarAccess.getAspectDefinitionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__AspectDefinition__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__AspectDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__0_in_ruleAspectDefinition691);
            rule__AspectDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAspectDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleAspectDefinition"


    // $ANTLR start "entryRuleAspectName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleAspectName : ruleAspectName EOF ;
    public final void entryRuleAspectName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleAspectName EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleAspectName EOF
            {
             before(grammarAccess.getAspectNameRule()); 
            pushFollow(FOLLOW_ruleAspectName_in_entryRuleAspectName718);
            ruleAspectName();

            state._fsp--;

             after(grammarAccess.getAspectNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspectName725); 

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
    // $ANTLR end "entryRuleAspectName"


    // $ANTLR start "ruleAspectName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleAspectName : ( ruleNameChar ) ;
    public final void ruleAspectName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ruleNameChar ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ruleNameChar )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ruleNameChar )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ruleNameChar
            {
             before(grammarAccess.getAspectNameAccess().getNameCharParserRuleCall()); 
            pushFollow(FOLLOW_ruleNameChar_in_ruleAspectName751);
            ruleNameChar();

            state._fsp--;

             after(grammarAccess.getAspectNameAccess().getNameCharParserRuleCall()); 

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
    // $ANTLR end "ruleAspectName"


    // $ANTLR start "entryRuleMapping_Declaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleMapping_Declaration : ruleMapping_Declaration EOF ;
    public final void entryRuleMapping_Declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleMapping_Declaration EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleMapping_Declaration EOF
            {
             before(grammarAccess.getMapping_DeclarationRule()); 
            pushFollow(FOLLOW_ruleMapping_Declaration_in_entryRuleMapping_Declaration777);
            ruleMapping_Declaration();

            state._fsp--;

             after(grammarAccess.getMapping_DeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping_Declaration784); 

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
    // $ANTLR end "entryRuleMapping_Declaration"


    // $ANTLR start "ruleMapping_Declaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleMapping_Declaration : ( ( rule__Mapping_Declaration__Group__0 ) ) ;
    public final void ruleMapping_Declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__Mapping_Declaration__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Mapping_Declaration__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Mapping_Declaration__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__Mapping_Declaration__Group__0 )
            {
             before(grammarAccess.getMapping_DeclarationAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__Mapping_Declaration__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__Mapping_Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping_Declaration__Group__0_in_ruleMapping_Declaration810);
            rule__Mapping_Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapping_DeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleMapping_Declaration"


    // $ANTLR start "entryRuleMappingName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleMappingName : ruleMappingName EOF ;
    public final void entryRuleMappingName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleMappingName EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleMappingName EOF
            {
             before(grammarAccess.getMappingNameRule()); 
            pushFollow(FOLLOW_ruleMappingName_in_entryRuleMappingName837);
            ruleMappingName();

            state._fsp--;

             after(grammarAccess.getMappingNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingName844); 

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
    // $ANTLR end "entryRuleMappingName"


    // $ANTLR start "ruleMappingName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleMappingName : ( ( rule__MappingName__NameAssignment ) ) ;
    public final void ruleMappingName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__MappingName__NameAssignment ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__MappingName__NameAssignment ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__MappingName__NameAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__MappingName__NameAssignment )
            {
             before(grammarAccess.getMappingNameAccess().getNameAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__MappingName__NameAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__MappingName__NameAssignment
            {
            pushFollow(FOLLOW_rule__MappingName__NameAssignment_in_ruleMappingName870);
            rule__MappingName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMappingNameAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleMappingName"


    // $ANTLR start "entryRulePointcut_Declaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRulePointcut_Declaration : rulePointcut_Declaration EOF ;
    public final void entryRulePointcut_Declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( rulePointcut_Declaration EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: rulePointcut_Declaration EOF
            {
             before(grammarAccess.getPointcut_DeclarationRule()); 
            pushFollow(FOLLOW_rulePointcut_Declaration_in_entryRulePointcut_Declaration897);
            rulePointcut_Declaration();

            state._fsp--;

             after(grammarAccess.getPointcut_DeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointcut_Declaration904); 

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
    // $ANTLR end "entryRulePointcut_Declaration"


    // $ANTLR start "rulePointcut_Declaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: rulePointcut_Declaration : ( ( rule__Pointcut_Declaration__Group__0 ) ) ;
    public final void rulePointcut_Declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__Pointcut_Declaration__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Pointcut_Declaration__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Pointcut_Declaration__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__Pointcut_Declaration__Group__0 )
            {
             before(grammarAccess.getPointcut_DeclarationAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__Pointcut_Declaration__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__Pointcut_Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Pointcut_Declaration__Group__0_in_rulePointcut_Declaration930);
            rule__Pointcut_Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointcut_DeclarationAccess().getGroup()); 

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
    // $ANTLR end "rulePointcut_Declaration"


    // $ANTLR start "entryRuleContextDeclaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: entryRuleContextDeclaration : ruleContextDeclaration EOF ;
    public final void entryRuleContextDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ( ruleContextDeclaration EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ruleContextDeclaration EOF
            {
             before(grammarAccess.getContextDeclarationRule()); 
            pushFollow(FOLLOW_ruleContextDeclaration_in_entryRuleContextDeclaration959);
            ruleContextDeclaration();

            state._fsp--;

             after(grammarAccess.getContextDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDeclaration966); 

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
    // $ANTLR end "entryRuleContextDeclaration"


    // $ANTLR start "ruleContextDeclaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: ruleContextDeclaration : ( ( rule__ContextDeclaration__Group__0 ) ) ;
    public final void ruleContextDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:2: ( ( ( rule__ContextDeclaration__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__ContextDeclaration__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__ContextDeclaration__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__ContextDeclaration__Group__0 )
            {
             before(grammarAccess.getContextDeclarationAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__ContextDeclaration__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:2: rule__ContextDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ContextDeclaration__Group__0_in_ruleContextDeclaration992);
            rule__ContextDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleContextDeclaration"


    // $ANTLR start "entryRuleClassifierContext"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: entryRuleClassifierContext : ruleClassifierContext EOF ;
    public final void entryRuleClassifierContext() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( ruleClassifierContext EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: ruleClassifierContext EOF
            {
             before(grammarAccess.getClassifierContextRule()); 
            pushFollow(FOLLOW_ruleClassifierContext_in_entryRuleClassifierContext1019);
            ruleClassifierContext();

            state._fsp--;

             after(grammarAccess.getClassifierContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifierContext1026); 

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
    // $ANTLR end "entryRuleClassifierContext"


    // $ANTLR start "ruleClassifierContext"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: ruleClassifierContext : ( ruleNameChar ) ;
    public final void ruleClassifierContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:2: ( ( ruleNameChar ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( ruleNameChar )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( ruleNameChar )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ruleNameChar
            {
             before(grammarAccess.getClassifierContextAccess().getNameCharParserRuleCall()); 
            pushFollow(FOLLOW_ruleNameChar_in_ruleClassifierContext1052);
            ruleNameChar();

            state._fsp--;

             after(grammarAccess.getClassifierContextAccess().getNameCharParserRuleCall()); 

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
    // $ANTLR end "ruleClassifierContext"


    // $ANTLR start "entryRuleOperationContext"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: entryRuleOperationContext : ruleOperationContext EOF ;
    public final void entryRuleOperationContext() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( ruleOperationContext EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: ruleOperationContext EOF
            {
             before(grammarAccess.getOperationContextRule()); 
            pushFollow(FOLLOW_ruleOperationContext_in_entryRuleOperationContext1078);
            ruleOperationContext();

            state._fsp--;

             after(grammarAccess.getOperationContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationContext1085); 

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
    // $ANTLR end "entryRuleOperationContext"


    // $ANTLR start "ruleOperationContext"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ruleOperationContext : ( ( rule__OperationContext__Group__0 ) ) ;
    public final void ruleOperationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:2: ( ( ( rule__OperationContext__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( rule__OperationContext__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( rule__OperationContext__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rule__OperationContext__Group__0 )
            {
             before(grammarAccess.getOperationContextAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( rule__OperationContext__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:554:2: rule__OperationContext__Group__0
            {
            pushFollow(FOLLOW_rule__OperationContext__Group__0_in_ruleOperationContext1111);
            rule__OperationContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationContextAccess().getGroup()); 

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
    // $ANTLR end "ruleOperationContext"


    // $ANTLR start "entryRuleOperationName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: entryRuleOperationName : ruleOperationName EOF ;
    public final void entryRuleOperationName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ( ruleOperationName EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ruleOperationName EOF
            {
             before(grammarAccess.getOperationNameRule()); 
            pushFollow(FOLLOW_ruleOperationName_in_entryRuleOperationName1138);
            ruleOperationName();

            state._fsp--;

             after(grammarAccess.getOperationNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationName1145); 

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
    // $ANTLR end "entryRuleOperationName"


    // $ANTLR start "ruleOperationName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ruleOperationName : ( ruleNameChar ) ;
    public final void ruleOperationName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:2: ( ( ruleNameChar ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( ruleNameChar )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( ruleNameChar )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ruleNameChar
            {
             before(grammarAccess.getOperationNameAccess().getNameCharParserRuleCall()); 
            pushFollow(FOLLOW_ruleNameChar_in_ruleOperationName1171);
            ruleNameChar();

            state._fsp--;

             after(grammarAccess.getOperationNameAccess().getNameCharParserRuleCall()); 

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
    // $ANTLR end "ruleOperationName"


    // $ANTLR start "entryRuleArguments"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ( ruleArguments EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ruleArguments EOF
            {
             before(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments1197);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getArgumentsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments1204); 

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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:1: ruleArguments : ( ruleNameChar ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:2: ( ( ruleNameChar ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ruleNameChar )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ruleNameChar )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ruleNameChar
            {
             before(grammarAccess.getArgumentsAccess().getNameCharParserRuleCall()); 
            pushFollow(FOLLOW_ruleNameChar_in_ruleArguments1230);
            ruleNameChar();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getNameCharParserRuleCall()); 

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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleReturntype"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: entryRuleReturntype : ruleReturntype EOF ;
    public final void entryRuleReturntype() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( ruleReturntype EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ruleReturntype EOF
            {
             before(grammarAccess.getReturntypeRule()); 
            pushFollow(FOLLOW_ruleReturntype_in_entryRuleReturntype1256);
            ruleReturntype();

            state._fsp--;

             after(grammarAccess.getReturntypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturntype1263); 

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
    // $ANTLR end "entryRuleReturntype"


    // $ANTLR start "ruleReturntype"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ruleReturntype : ( ( rule__Returntype__Alternatives ) ) ;
    public final void ruleReturntype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:2: ( ( ( rule__Returntype__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( rule__Returntype__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( rule__Returntype__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( rule__Returntype__Alternatives )
            {
             before(grammarAccess.getReturntypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( rule__Returntype__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:2: rule__Returntype__Alternatives
            {
            pushFollow(FOLLOW_rule__Returntype__Alternatives_in_ruleReturntype1289);
            rule__Returntype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReturntypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReturntype"


    // $ANTLR start "entryRuleAI"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: entryRuleAI : ruleAI EOF ;
    public final void entryRuleAI() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( ruleAI EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ruleAI EOF
            {
             before(grammarAccess.getAIRule()); 
            pushFollow(FOLLOW_ruleAI_in_entryRuleAI1316);
            ruleAI();

            state._fsp--;

             after(grammarAccess.getAIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAI1323); 

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
    // $ANTLR end "entryRuleAI"


    // $ANTLR start "ruleAI"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ruleAI : ( ( rule__AI__Alternatives ) ) ;
    public final void ruleAI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:2: ( ( ( rule__AI__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__AI__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__AI__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( rule__AI__Alternatives )
            {
             before(grammarAccess.getAIAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( rule__AI__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:2: rule__AI__Alternatives
            {
            pushFollow(FOLLOW_rule__AI__Alternatives_in_ruleAI1349);
            rule__AI__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAIAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAI"


    // $ANTLR start "entryRuleAdvice"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: entryRuleAdvice : ruleAdvice EOF ;
    public final void entryRuleAdvice() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ruleAdvice EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ruleAdvice EOF
            {
             before(grammarAccess.getAdviceRule()); 
            pushFollow(FOLLOW_ruleAdvice_in_entryRuleAdvice1376);
            ruleAdvice();

            state._fsp--;

             after(grammarAccess.getAdviceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdvice1383); 

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
    // $ANTLR end "entryRuleAdvice"


    // $ANTLR start "ruleAdvice"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ruleAdvice : ( ( rule__Advice__Group__0 ) ) ;
    public final void ruleAdvice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:2: ( ( ( rule__Advice__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( ( rule__Advice__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( ( rule__Advice__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( rule__Advice__Group__0 )
            {
             before(grammarAccess.getAdviceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:1: ( rule__Advice__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:2: rule__Advice__Group__0
            {
            pushFollow(FOLLOW_rule__Advice__Group__0_in_ruleAdvice1409);
            rule__Advice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdviceAccess().getGroup()); 

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
    // $ANTLR end "ruleAdvice"


    // $ANTLR start "entryRuleAdviceDeclaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: entryRuleAdviceDeclaration : ruleAdviceDeclaration EOF ;
    public final void entryRuleAdviceDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( ruleAdviceDeclaration EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ruleAdviceDeclaration EOF
            {
             before(grammarAccess.getAdviceDeclarationRule()); 
            pushFollow(FOLLOW_ruleAdviceDeclaration_in_entryRuleAdviceDeclaration1436);
            ruleAdviceDeclaration();

            state._fsp--;

             after(grammarAccess.getAdviceDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdviceDeclaration1443); 

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
    // $ANTLR end "entryRuleAdviceDeclaration"


    // $ANTLR start "ruleAdviceDeclaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ruleAdviceDeclaration : ( ( rule__AdviceDeclaration__Group__0 ) ) ;
    public final void ruleAdviceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:2: ( ( ( rule__AdviceDeclaration__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( ( rule__AdviceDeclaration__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( ( rule__AdviceDeclaration__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( rule__AdviceDeclaration__Group__0 )
            {
             before(grammarAccess.getAdviceDeclarationAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: ( rule__AdviceDeclaration__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:2: rule__AdviceDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__AdviceDeclaration__Group__0_in_ruleAdviceDeclaration1469);
            rule__AdviceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdviceDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleAdviceDeclaration"


    // $ANTLR start "entryRuleQueryType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: entryRuleQueryType : ruleQueryType EOF ;
    public final void entryRuleQueryType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( ruleQueryType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ruleQueryType EOF
            {
             before(grammarAccess.getQueryTypeRule()); 
            pushFollow(FOLLOW_ruleQueryType_in_entryRuleQueryType1496);
            ruleQueryType();

            state._fsp--;

             after(grammarAccess.getQueryTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryType1503); 

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
    // $ANTLR end "entryRuleQueryType"


    // $ANTLR start "ruleQueryType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ruleQueryType : ( ( rule__QueryType__Alternatives ) ) ;
    public final void ruleQueryType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:2: ( ( ( rule__QueryType__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( ( rule__QueryType__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( ( rule__QueryType__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( rule__QueryType__Alternatives )
            {
             before(grammarAccess.getQueryTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( rule__QueryType__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:2: rule__QueryType__Alternatives
            {
            pushFollow(FOLLOW_rule__QueryType__Alternatives_in_ruleQueryType1529);
            rule__QueryType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQueryType"


    // $ANTLR start "entryRuleAdviceType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: entryRuleAdviceType : ruleAdviceType EOF ;
    public final void entryRuleAdviceType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( ruleAdviceType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ruleAdviceType EOF
            {
             before(grammarAccess.getAdviceTypeRule()); 
            pushFollow(FOLLOW_ruleAdviceType_in_entryRuleAdviceType1556);
            ruleAdviceType();

            state._fsp--;

             after(grammarAccess.getAdviceTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdviceType1563); 

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
    // $ANTLR end "entryRuleAdviceType"


    // $ANTLR start "ruleAdviceType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ruleAdviceType : ( ( rule__AdviceType__Group__0 ) ) ;
    public final void ruleAdviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:2: ( ( ( rule__AdviceType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( ( rule__AdviceType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( ( rule__AdviceType__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ( rule__AdviceType__Group__0 )
            {
             before(grammarAccess.getAdviceTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: ( rule__AdviceType__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:778:2: rule__AdviceType__Group__0
            {
            pushFollow(FOLLOW_rule__AdviceType__Group__0_in_ruleAdviceType1589);
            rule__AdviceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdviceTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleAdviceType"


    // $ANTLR start "entryRuleIntroAdviceQuery"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: entryRuleIntroAdviceQuery : ruleIntroAdviceQuery EOF ;
    public final void entryRuleIntroAdviceQuery() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( ruleIntroAdviceQuery EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: ruleIntroAdviceQuery EOF
            {
             before(grammarAccess.getIntroAdviceQueryRule()); 
            pushFollow(FOLLOW_ruleIntroAdviceQuery_in_entryRuleIntroAdviceQuery1616);
            ruleIntroAdviceQuery();

            state._fsp--;

             after(grammarAccess.getIntroAdviceQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntroAdviceQuery1623); 

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
    // $ANTLR end "entryRuleIntroAdviceQuery"


    // $ANTLR start "ruleIntroAdviceQuery"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: ruleIntroAdviceQuery : ( ( rule__IntroAdviceQuery__NameAssignment ) ) ;
    public final void ruleIntroAdviceQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:2: ( ( ( rule__IntroAdviceQuery__NameAssignment ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( ( rule__IntroAdviceQuery__NameAssignment ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( ( rule__IntroAdviceQuery__NameAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ( rule__IntroAdviceQuery__NameAssignment )
            {
             before(grammarAccess.getIntroAdviceQueryAccess().getNameAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ( rule__IntroAdviceQuery__NameAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:2: rule__IntroAdviceQuery__NameAssignment
            {
            pushFollow(FOLLOW_rule__IntroAdviceQuery__NameAssignment_in_ruleIntroAdviceQuery1649);
            rule__IntroAdviceQuery__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntroAdviceQueryAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleIntroAdviceQuery"


    // $ANTLR start "entryRuleIntro"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: entryRuleIntro : ruleIntro EOF ;
    public final void entryRuleIntro() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: ( ruleIntro EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ruleIntro EOF
            {
             before(grammarAccess.getIntroRule()); 
            pushFollow(FOLLOW_ruleIntro_in_entryRuleIntro1676);
            ruleIntro();

            state._fsp--;

             after(grammarAccess.getIntroRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntro1683); 

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
    // $ANTLR end "entryRuleIntro"


    // $ANTLR start "ruleIntro"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ruleIntro : ( ( rule__Intro__Group__0 ) ) ;
    public final void ruleIntro() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:2: ( ( ( rule__Intro__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( ( rule__Intro__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( ( rule__Intro__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( rule__Intro__Group__0 )
            {
             before(grammarAccess.getIntroAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ( rule__Intro__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:2: rule__Intro__Group__0
            {
            pushFollow(FOLLOW_rule__Intro__Group__0_in_ruleIntro1709);
            rule__Intro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntroAccess().getGroup()); 

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
    // $ANTLR end "ruleIntro"


    // $ANTLR start "entryRuleIntroDeclaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: entryRuleIntroDeclaration : ruleIntroDeclaration EOF ;
    public final void entryRuleIntroDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: ( ruleIntroDeclaration EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: ruleIntroDeclaration EOF
            {
             before(grammarAccess.getIntroDeclarationRule()); 
            pushFollow(FOLLOW_ruleIntroDeclaration_in_entryRuleIntroDeclaration1736);
            ruleIntroDeclaration();

            state._fsp--;

             after(grammarAccess.getIntroDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntroDeclaration1743); 

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
    // $ANTLR end "entryRuleIntroDeclaration"


    // $ANTLR start "ruleIntroDeclaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ruleIntroDeclaration : ( ( rule__IntroDeclaration__Group__0 ) ) ;
    public final void ruleIntroDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:2: ( ( ( rule__IntroDeclaration__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( ( rule__IntroDeclaration__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( ( rule__IntroDeclaration__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( rule__IntroDeclaration__Group__0 )
            {
             before(grammarAccess.getIntroDeclarationAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( rule__IntroDeclaration__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:2: rule__IntroDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__IntroDeclaration__Group__0_in_ruleIntroDeclaration1769);
            rule__IntroDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntroDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleIntroDeclaration"


    // $ANTLR start "entryRuleIntroType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: entryRuleIntroType : ruleIntroType EOF ;
    public final void entryRuleIntroType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( ruleIntroType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: ruleIntroType EOF
            {
             before(grammarAccess.getIntroTypeRule()); 
            pushFollow(FOLLOW_ruleIntroType_in_entryRuleIntroType1796);
            ruleIntroType();

            state._fsp--;

             after(grammarAccess.getIntroTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntroType1803); 

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
    // $ANTLR end "entryRuleIntroType"


    // $ANTLR start "ruleIntroType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ruleIntroType : ( ( rule__IntroType__Group__0 ) ) ;
    public final void ruleIntroType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:2: ( ( ( rule__IntroType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( ( rule__IntroType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( ( rule__IntroType__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: ( rule__IntroType__Group__0 )
            {
             before(grammarAccess.getIntroTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( rule__IntroType__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:2: rule__IntroType__Group__0
            {
            pushFollow(FOLLOW_rule__IntroType__Group__0_in_ruleIntroType1829);
            rule__IntroType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntroTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleIntroType"


    // $ANTLR start "entryRuleIntroQuery"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: entryRuleIntroQuery : ruleIntroQuery EOF ;
    public final void entryRuleIntroQuery() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: ( ruleIntroQuery EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ruleIntroQuery EOF
            {
             before(grammarAccess.getIntroQueryRule()); 
            pushFollow(FOLLOW_ruleIntroQuery_in_entryRuleIntroQuery1856);
            ruleIntroQuery();

            state._fsp--;

             after(grammarAccess.getIntroQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntroQuery1863); 

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
    // $ANTLR end "entryRuleIntroQuery"


    // $ANTLR start "ruleIntroQuery"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ruleIntroQuery : ( ( rule__IntroQuery__NameAssignment ) ) ;
    public final void ruleIntroQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:2: ( ( ( rule__IntroQuery__NameAssignment ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( ( rule__IntroQuery__NameAssignment ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( ( rule__IntroQuery__NameAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: ( rule__IntroQuery__NameAssignment )
            {
             before(grammarAccess.getIntroQueryAccess().getNameAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( rule__IntroQuery__NameAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:2: rule__IntroQuery__NameAssignment
            {
            pushFollow(FOLLOW_rule__IntroQuery__NameAssignment_in_ruleIntroQuery1889);
            rule__IntroQuery__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntroQueryAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleIntroQuery"


    // $ANTLR start "entryRuleQueryDeclaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: entryRuleQueryDeclaration : ruleQueryDeclaration EOF ;
    public final void entryRuleQueryDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ruleQueryDeclaration EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ruleQueryDeclaration EOF
            {
             before(grammarAccess.getQueryDeclarationRule()); 
            pushFollow(FOLLOW_ruleQueryDeclaration_in_entryRuleQueryDeclaration1916);
            ruleQueryDeclaration();

            state._fsp--;

             after(grammarAccess.getQueryDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryDeclaration1923); 

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
    // $ANTLR end "entryRuleQueryDeclaration"


    // $ANTLR start "ruleQueryDeclaration"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ruleQueryDeclaration : ( ( rule__QueryDeclaration__Group__0 ) ) ;
    public final void ruleQueryDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:943:2: ( ( ( rule__QueryDeclaration__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( ( rule__QueryDeclaration__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( ( rule__QueryDeclaration__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( rule__QueryDeclaration__Group__0 )
            {
             before(grammarAccess.getQueryDeclarationAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( rule__QueryDeclaration__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:2: rule__QueryDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__QueryDeclaration__Group__0_in_ruleQueryDeclaration1949);
            rule__QueryDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleQueryDeclaration"


    // $ANTLR start "entryRuleQueryBody"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: entryRuleQueryBody : ruleQueryBody EOF ;
    public final void entryRuleQueryBody() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: ( ruleQueryBody EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ruleQueryBody EOF
            {
             before(grammarAccess.getQueryBodyRule()); 
            pushFollow(FOLLOW_ruleQueryBody_in_entryRuleQueryBody1976);
            ruleQueryBody();

            state._fsp--;

             after(grammarAccess.getQueryBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryBody1983); 

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
    // $ANTLR end "entryRuleQueryBody"


    // $ANTLR start "ruleQueryBody"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ruleQueryBody : ( ( rule__QueryBody__Group__0 ) ) ;
    public final void ruleQueryBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:971:2: ( ( ( rule__QueryBody__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( ( rule__QueryBody__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( ( rule__QueryBody__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( rule__QueryBody__Group__0 )
            {
             before(grammarAccess.getQueryBodyAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( rule__QueryBody__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:2: rule__QueryBody__Group__0
            {
            pushFollow(FOLLOW_rule__QueryBody__Group__0_in_ruleQueryBody2009);
            rule__QueryBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleQueryBody"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:987:1: ( ruleExpression EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2036);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2043); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:999:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:1: ( ( rule__Expression__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( rule__Expression__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression2069);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOclExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: entryRuleOclExpression : ruleOclExpression EOF ;
    public final void entryRuleOclExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( ruleOclExpression EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: ruleOclExpression EOF
            {
             before(grammarAccess.getOclExpressionRule()); 
            pushFollow(FOLLOW_ruleOclExpression_in_entryRuleOclExpression2096);
            ruleOclExpression();

            state._fsp--;

             after(grammarAccess.getOclExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclExpression2103); 

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
    // $ANTLR end "entryRuleOclExpression"


    // $ANTLR start "ruleOclExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ruleOclExpression : ( ( rule__OclExpression__ValueAssignment ) ) ;
    public final void ruleOclExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:2: ( ( ( rule__OclExpression__ValueAssignment ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( ( rule__OclExpression__ValueAssignment ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( ( rule__OclExpression__ValueAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( rule__OclExpression__ValueAssignment )
            {
             before(grammarAccess.getOclExpressionAccess().getValueAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( rule__OclExpression__ValueAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:2: rule__OclExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__OclExpression__ValueAssignment_in_ruleOclExpression2129);
            rule__OclExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOclExpressionAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleOclExpression"


    // $ANTLR start "entryRuleNameChar"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: entryRuleNameChar : ruleNameChar EOF ;
    public final void entryRuleNameChar() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( ruleNameChar EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ruleNameChar EOF
            {
             before(grammarAccess.getNameCharRule()); 
            pushFollow(FOLLOW_ruleNameChar_in_entryRuleNameChar2156);
            ruleNameChar();

            state._fsp--;

             after(grammarAccess.getNameCharRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameChar2163); 

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
    // $ANTLR end "entryRuleNameChar"


    // $ANTLR start "ruleNameChar"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: ruleNameChar : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void ruleNameChar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: ( RULE_ID )
            {
             before(grammarAccess.getNameCharAccess().getIDTerminalRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameChar2192); 

            }

             after(grammarAccess.getNameCharAccess().getIDTerminalRuleCall()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( ( RULE_ID )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: ( RULE_ID )*
            {
             before(grammarAccess.getNameCharAccess().getIDTerminalRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:1: ( RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameChar2205); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getNameCharAccess().getIDTerminalRuleCall()); 

            }


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
    // $ANTLR end "ruleNameChar"


    // $ANTLR start "rule__Aspect__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: rule__Aspect__Alternatives : ( ( ruleMapping ) | ( ruleAspectDefinition ) );
    public final void rule__Aspect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( ( ruleMapping ) | ( ruleAspectDefinition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ruleMapping )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ruleMapping )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ruleMapping
                    {
                     before(grammarAccess.getAspectAccess().getMappingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMapping_in_rule__Aspect__Alternatives2244);
                    ruleMapping();

                    state._fsp--;

                     after(grammarAccess.getAspectAccess().getMappingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:6: ( ruleAspectDefinition )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:6: ( ruleAspectDefinition )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ruleAspectDefinition
                    {
                     before(grammarAccess.getAspectAccess().getAspectDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAspectDefinition_in_rule__Aspect__Alternatives2261);
                    ruleAspectDefinition();

                    state._fsp--;

                     after(grammarAccess.getAspectAccess().getAspectDefinitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Aspect__Alternatives"


    // $ANTLR start "rule__LetExpression__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: rule__LetExpression__Alternatives : ( ( ( rule__LetExpression__Group_0__0 ) ) | ( ( rule__LetExpression__Group_1__0 ) ) | ( ( rule__LetExpression__Group_2__0 ) ) );
    public final void rule__LetExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( ( ( rule__LetExpression__Group_0__0 ) ) | ( ( rule__LetExpression__Group_1__0 ) ) | ( ( rule__LetExpression__Group_2__0 ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( ( rule__LetExpression__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( ( rule__LetExpression__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( rule__LetExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLetExpressionAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( rule__LetExpression__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:2: rule__LetExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__LetExpression__Group_0__0_in_rule__LetExpression__Alternatives2293);
                    rule__LetExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLetExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:6: ( ( rule__LetExpression__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:6: ( ( rule__LetExpression__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( rule__LetExpression__Group_1__0 )
                    {
                     before(grammarAccess.getLetExpressionAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( rule__LetExpression__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:2: rule__LetExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LetExpression__Group_1__0_in_rule__LetExpression__Alternatives2311);
                    rule__LetExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLetExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:6: ( ( rule__LetExpression__Group_2__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:6: ( ( rule__LetExpression__Group_2__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( rule__LetExpression__Group_2__0 )
                    {
                     before(grammarAccess.getLetExpressionAccess().getGroup_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( rule__LetExpression__Group_2__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:2: rule__LetExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__LetExpression__Group_2__0_in_rule__LetExpression__Alternatives2329);
                    rule__LetExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLetExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__LetExpression__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: rule__Operation__Alternatives : ( ( ruleClassifierContext ) | ( ruleOperationContext ) | ( ruleAttributeContext ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( ( ruleClassifierContext ) | ( ruleOperationContext ) | ( ruleAttributeContext ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( ruleClassifierContext )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( ruleClassifierContext )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ruleClassifierContext
                    {
                     before(grammarAccess.getOperationAccess().getClassifierContextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClassifierContext_in_rule__Operation__Alternatives2362);
                    ruleClassifierContext();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getClassifierContextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:6: ( ruleOperationContext )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:6: ( ruleOperationContext )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ruleOperationContext
                    {
                     before(grammarAccess.getOperationAccess().getOperationContextParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOperationContext_in_rule__Operation__Alternatives2379);
                    ruleOperationContext();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getOperationContextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:6: ( ruleAttributeContext )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:6: ( ruleAttributeContext )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ruleAttributeContext
                    {
                     before(grammarAccess.getOperationAccess().getAttributeContextParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAttributeContext_in_rule__Operation__Alternatives2396);
                    ruleAttributeContext();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getAttributeContextParserRuleCall_2()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__ContextDeclaration__Alternatives_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: rule__ContextDeclaration__Alternatives_1 : ( ( ruleClassifierContext ) | ( ruleOperationContext ) );
    public final void rule__ContextDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( ( ruleClassifierContext ) | ( ruleOperationContext ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( ruleClassifierContext )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( ruleClassifierContext )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ruleClassifierContext
                    {
                     before(grammarAccess.getContextDeclarationAccess().getClassifierContextParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleClassifierContext_in_rule__ContextDeclaration__Alternatives_12428);
                    ruleClassifierContext();

                    state._fsp--;

                     after(grammarAccess.getContextDeclarationAccess().getClassifierContextParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:6: ( ruleOperationContext )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:6: ( ruleOperationContext )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ruleOperationContext
                    {
                     before(grammarAccess.getContextDeclarationAccess().getOperationContextParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleOperationContext_in_rule__ContextDeclaration__Alternatives_12445);
                    ruleOperationContext();

                    state._fsp--;

                     after(grammarAccess.getContextDeclarationAccess().getOperationContextParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__ContextDeclaration__Alternatives_1"


    // $ANTLR start "rule__Returntype__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: rule__Returntype__Alternatives : ( ( 'Boolean' ) | ( 'String' ) | ( 'int' ) | ( 'float' ) | ( 'double' ) | ( ruleNameChar ) );
    public final void rule__Returntype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ( ( 'Boolean' ) | ( 'String' ) | ( 'int' ) | ( 'float' ) | ( 'double' ) | ( ruleNameChar ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case RULE_ID:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( 'Boolean' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( 'Boolean' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: 'Boolean'
                    {
                     before(grammarAccess.getReturntypeAccess().getBooleanKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Returntype__Alternatives2478); 
                     after(grammarAccess.getReturntypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:6: ( 'String' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:6: ( 'String' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: 'String'
                    {
                     before(grammarAccess.getReturntypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Returntype__Alternatives2498); 
                     after(grammarAccess.getReturntypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:6: ( 'int' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:6: ( 'int' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: 'int'
                    {
                     before(grammarAccess.getReturntypeAccess().getIntKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Returntype__Alternatives2518); 
                     after(grammarAccess.getReturntypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:6: ( 'float' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:6: ( 'float' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: 'float'
                    {
                     before(grammarAccess.getReturntypeAccess().getFloatKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Returntype__Alternatives2538); 
                     after(grammarAccess.getReturntypeAccess().getFloatKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:6: ( 'double' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:6: ( 'double' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: 'double'
                    {
                     before(grammarAccess.getReturntypeAccess().getDoubleKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Returntype__Alternatives2558); 
                     after(grammarAccess.getReturntypeAccess().getDoubleKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:6: ( ruleNameChar )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:6: ( ruleNameChar )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: ruleNameChar
                    {
                     before(grammarAccess.getReturntypeAccess().getNameCharParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleNameChar_in_rule__Returntype__Alternatives2577);
                    ruleNameChar();

                    state._fsp--;

                     after(grammarAccess.getReturntypeAccess().getNameCharParserRuleCall_5()); 

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
    // $ANTLR end "rule__Returntype__Alternatives"


    // $ANTLR start "rule__AI__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: rule__AI__Alternatives : ( ( ruleAdvice ) | ( ruleIntro ) );
    public final void rule__AI__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( ( ruleAdvice ) | ( ruleIntro ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( ruleAdvice )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( ruleAdvice )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:1: ruleAdvice
                    {
                     before(grammarAccess.getAIAccess().getAdviceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAdvice_in_rule__AI__Alternatives2609);
                    ruleAdvice();

                    state._fsp--;

                     after(grammarAccess.getAIAccess().getAdviceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:6: ( ruleIntro )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:6: ( ruleIntro )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ruleIntro
                    {
                     before(grammarAccess.getAIAccess().getIntroParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntro_in_rule__AI__Alternatives2626);
                    ruleIntro();

                    state._fsp--;

                     after(grammarAccess.getAIAccess().getIntroParserRuleCall_1()); 

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
    // $ANTLR end "rule__AI__Alternatives"


    // $ANTLR start "rule__QueryType__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:1: rule__QueryType__Alternatives : ( ( 'pre' ) | ( 'post' ) | ( 'inv' ) );
    public final void rule__QueryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( ( 'pre' ) | ( 'post' ) | ( 'inv' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( 'pre' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( 'pre' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: 'pre'
                    {
                     before(grammarAccess.getQueryTypeAccess().getPreKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__QueryType__Alternatives2659); 
                     after(grammarAccess.getQueryTypeAccess().getPreKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:6: ( 'post' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:6: ( 'post' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: 'post'
                    {
                     before(grammarAccess.getQueryTypeAccess().getPostKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__QueryType__Alternatives2679); 
                     after(grammarAccess.getQueryTypeAccess().getPostKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:6: ( 'inv' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:6: ( 'inv' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: 'inv'
                    {
                     before(grammarAccess.getQueryTypeAccess().getInvKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__QueryType__Alternatives2699); 
                     after(grammarAccess.getQueryTypeAccess().getInvKeyword_2()); 

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
    // $ANTLR end "rule__QueryType__Alternatives"


    // $ANTLR start "rule__AdviceType__Alternatives_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: rule__AdviceType__Alternatives_0 : ( ( 'and' ) | ( 'or' ) | ( 'xor' ) );
    public final void rule__AdviceType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( ( 'and' ) | ( 'or' ) | ( 'xor' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ( 'and' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ( 'and' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:1: 'and'
                    {
                     before(grammarAccess.getAdviceTypeAccess().getAndKeyword_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__AdviceType__Alternatives_02734); 
                     after(grammarAccess.getAdviceTypeAccess().getAndKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:6: ( 'or' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:6: ( 'or' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: 'or'
                    {
                     before(grammarAccess.getAdviceTypeAccess().getOrKeyword_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__AdviceType__Alternatives_02754); 
                     after(grammarAccess.getAdviceTypeAccess().getOrKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:6: ( 'xor' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:6: ( 'xor' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: 'xor'
                    {
                     before(grammarAccess.getAdviceTypeAccess().getXorKeyword_0_2()); 
                    match(input,21,FOLLOW_21_in_rule__AdviceType__Alternatives_02774); 
                     after(grammarAccess.getAdviceTypeAccess().getXorKeyword_0_2()); 

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
    // $ANTLR end "rule__AdviceType__Alternatives_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==40) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==41) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==42) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( ( rule__Expression__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( rule__Expression__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:2: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_0__0_in_rule__Expression__Alternatives2808);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:6: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:6: ( ( rule__Expression__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( rule__Expression__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives2826);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__02857);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__02860);
            rule__Mapping__Group__1();

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
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: rule__Mapping__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( 'mapping' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( 'mapping' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( 'mapping' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: 'mapping'
            {
             before(grammarAccess.getMappingAccess().getMappingKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Mapping__Group__0__Impl2888); 
             after(grammarAccess.getMappingAccess().getMappingKeyword_0()); 

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
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__12919);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__12922);
            rule__Mapping__Group__2();

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
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__MappingnameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: ( ( ( rule__Mapping__MappingnameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:1: ( ( rule__Mapping__MappingnameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:1: ( ( rule__Mapping__MappingnameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: ( rule__Mapping__MappingnameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getMappingnameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( rule__Mapping__MappingnameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:2: rule__Mapping__MappingnameAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__MappingnameAssignment_1_in_rule__Mapping__Group__1__Impl2949);
            rule__Mapping__MappingnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getMappingnameAssignment_1()); 

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
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__22979);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__22982);
            rule__Mapping__Group__3();

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
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: rule__Mapping__Group__2__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Mapping__Group__2__Impl3010); 
             after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__33041);
            rule__Mapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__33044);
            rule__Mapping__Group__4();

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
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: rule__Mapping__Group__3__Impl : ( ruleletExpression ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( ( ruleletExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( ruleletExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( ruleletExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ruleletExpression
            {
             before(grammarAccess.getMappingAccess().getLetExpressionParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleletExpression_in_rule__Mapping__Group__3__Impl3071);
            ruleletExpression();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getLetExpressionParserRuleCall_3()); 

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
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( rule__Mapping__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:2: rule__Mapping__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__43100);
            rule__Mapping__Group__4__Impl();

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
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: rule__Mapping__Group__4__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Mapping__Group__4__Impl3128); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__LetExpression__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: rule__LetExpression__Group_0__0 : rule__LetExpression__Group_0__0__Impl rule__LetExpression__Group_0__1 ;
    public final void rule__LetExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: ( rule__LetExpression__Group_0__0__Impl rule__LetExpression__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:2: rule__LetExpression__Group_0__0__Impl rule__LetExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0__0__Impl_in_rule__LetExpression__Group_0__03169);
            rule__LetExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_0__1_in_rule__LetExpression__Group_0__03172);
            rule__LetExpression__Group_0__1();

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
    // $ANTLR end "rule__LetExpression__Group_0__0"


    // $ANTLR start "rule__LetExpression__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: rule__LetExpression__Group_0__0__Impl : ( 'let' ) ;
    public final void rule__LetExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( ( 'let' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: ( 'let' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: ( 'let' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: 'let'
            {
             before(grammarAccess.getLetExpressionAccess().getLetKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__LetExpression__Group_0__0__Impl3200); 
             after(grammarAccess.getLetExpressionAccess().getLetKeyword_0_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_0__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: rule__LetExpression__Group_0__1 : rule__LetExpression__Group_0__1__Impl rule__LetExpression__Group_0__2 ;
    public final void rule__LetExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: ( rule__LetExpression__Group_0__1__Impl rule__LetExpression__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:2: rule__LetExpression__Group_0__1__Impl rule__LetExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0__1__Impl_in_rule__LetExpression__Group_0__13231);
            rule__LetExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_0__2_in_rule__LetExpression__Group_0__13234);
            rule__LetExpression__Group_0__2();

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
    // $ANTLR end "rule__LetExpression__Group_0__1"


    // $ANTLR start "rule__LetExpression__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: rule__LetExpression__Group_0__1__Impl : ( ruleletVarName ) ;
    public final void rule__LetExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: ( ( ruleletVarName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( ruleletVarName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( ruleletVarName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ruleletVarName
            {
             before(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleletVarName_in_rule__LetExpression__Group_0__1__Impl3261);
            ruleletVarName();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_0__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: rule__LetExpression__Group_0__2 : rule__LetExpression__Group_0__2__Impl rule__LetExpression__Group_0__3 ;
    public final void rule__LetExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( rule__LetExpression__Group_0__2__Impl rule__LetExpression__Group_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:2: rule__LetExpression__Group_0__2__Impl rule__LetExpression__Group_0__3
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0__2__Impl_in_rule__LetExpression__Group_0__23290);
            rule__LetExpression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_0__3_in_rule__LetExpression__Group_0__23293);
            rule__LetExpression__Group_0__3();

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
    // $ANTLR end "rule__LetExpression__Group_0__2"


    // $ANTLR start "rule__LetExpression__Group_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: rule__LetExpression__Group_0__2__Impl : ( ':' ) ;
    public final void rule__LetExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ':'
            {
             before(grammarAccess.getLetExpressionAccess().getColonKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__LetExpression__Group_0__2__Impl3321); 
             after(grammarAccess.getLetExpressionAccess().getColonKeyword_0_2()); 

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
    // $ANTLR end "rule__LetExpression__Group_0__2__Impl"


    // $ANTLR start "rule__LetExpression__Group_0__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: rule__LetExpression__Group_0__3 : rule__LetExpression__Group_0__3__Impl rule__LetExpression__Group_0__4 ;
    public final void rule__LetExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( rule__LetExpression__Group_0__3__Impl rule__LetExpression__Group_0__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:2: rule__LetExpression__Group_0__3__Impl rule__LetExpression__Group_0__4
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0__3__Impl_in_rule__LetExpression__Group_0__33352);
            rule__LetExpression__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_0__4_in_rule__LetExpression__Group_0__33355);
            rule__LetExpression__Group_0__4();

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
    // $ANTLR end "rule__LetExpression__Group_0__3"


    // $ANTLR start "rule__LetExpression__Group_0__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: rule__LetExpression__Group_0__3__Impl : ( '{' ) ;
    public final void rule__LetExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: '{'
            {
             before(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_0_3()); 
            match(input,23,FOLLOW_23_in_rule__LetExpression__Group_0__3__Impl3383); 
             after(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_0_3()); 

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
    // $ANTLR end "rule__LetExpression__Group_0__3__Impl"


    // $ANTLR start "rule__LetExpression__Group_0__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1629:1: rule__LetExpression__Group_0__4 : rule__LetExpression__Group_0__4__Impl rule__LetExpression__Group_0__5 ;
    public final void rule__LetExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( rule__LetExpression__Group_0__4__Impl rule__LetExpression__Group_0__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:2: rule__LetExpression__Group_0__4__Impl rule__LetExpression__Group_0__5
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0__4__Impl_in_rule__LetExpression__Group_0__43414);
            rule__LetExpression__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_0__5_in_rule__LetExpression__Group_0__43417);
            rule__LetExpression__Group_0__5();

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
    // $ANTLR end "rule__LetExpression__Group_0__4"


    // $ANTLR start "rule__LetExpression__Group_0__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1641:1: rule__LetExpression__Group_0__4__Impl : ( ( rule__LetExpression__Group_0_4__0 ) ) ;
    public final void rule__LetExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( ( ( rule__LetExpression__Group_0_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( ( rule__LetExpression__Group_0_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( ( rule__LetExpression__Group_0_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( rule__LetExpression__Group_0_4__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_0_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ( rule__LetExpression__Group_0_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:2: rule__LetExpression__Group_0_4__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0_4__0_in_rule__LetExpression__Group_0__4__Impl3444);
            rule__LetExpression__Group_0_4__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_0_4()); 

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
    // $ANTLR end "rule__LetExpression__Group_0__4__Impl"


    // $ANTLR start "rule__LetExpression__Group_0__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: rule__LetExpression__Group_0__5 : rule__LetExpression__Group_0__5__Impl ;
    public final void rule__LetExpression__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: ( rule__LetExpression__Group_0__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:2: rule__LetExpression__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0__5__Impl_in_rule__LetExpression__Group_0__53474);
            rule__LetExpression__Group_0__5__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_0__5"


    // $ANTLR start "rule__LetExpression__Group_0__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: rule__LetExpression__Group_0__5__Impl : ( '}' ) ;
    public final void rule__LetExpression__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: '}'
            {
             before(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,24,FOLLOW_24_in_rule__LetExpression__Group_0__5__Impl3502); 
             after(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_0_5()); 

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
    // $ANTLR end "rule__LetExpression__Group_0__5__Impl"


    // $ANTLR start "rule__LetExpression__Group_0_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: rule__LetExpression__Group_0_4__0 : rule__LetExpression__Group_0_4__0__Impl rule__LetExpression__Group_0_4__1 ;
    public final void rule__LetExpression__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( rule__LetExpression__Group_0_4__0__Impl rule__LetExpression__Group_0_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:2: rule__LetExpression__Group_0_4__0__Impl rule__LetExpression__Group_0_4__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0_4__0__Impl_in_rule__LetExpression__Group_0_4__03545);
            rule__LetExpression__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_0_4__1_in_rule__LetExpression__Group_0_4__03548);
            rule__LetExpression__Group_0_4__1();

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
    // $ANTLR end "rule__LetExpression__Group_0_4__0"


    // $ANTLR start "rule__LetExpression__Group_0_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: rule__LetExpression__Group_0_4__0__Impl : ( ruleOperation ) ;
    public final void rule__LetExpression__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1716:1: ( ( ruleOperation ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: ( ruleOperation )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: ( ruleOperation )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: ruleOperation
            {
             before(grammarAccess.getLetExpressionAccess().getOperationParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__LetExpression__Group_0_4__0__Impl3575);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getOperationParserRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_0_4__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_0_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: rule__LetExpression__Group_0_4__1 : rule__LetExpression__Group_0_4__1__Impl ;
    public final void rule__LetExpression__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:1: ( rule__LetExpression__Group_0_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:2: rule__LetExpression__Group_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0_4__1__Impl_in_rule__LetExpression__Group_0_4__13604);
            rule__LetExpression__Group_0_4__1__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_0_4__1"


    // $ANTLR start "rule__LetExpression__Group_0_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: rule__LetExpression__Group_0_4__1__Impl : ( ( rule__LetExpression__Group_0_4_1__0 )* ) ;
    public final void rule__LetExpression__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( ( ( rule__LetExpression__Group_0_4_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( ( rule__LetExpression__Group_0_4_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( ( rule__LetExpression__Group_0_4_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ( rule__LetExpression__Group_0_4_1__0 )*
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_0_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:1: ( rule__LetExpression__Group_0_4_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:2: rule__LetExpression__Group_0_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LetExpression__Group_0_4_1__0_in_rule__LetExpression__Group_0_4__1__Impl3631);
            	    rule__LetExpression__Group_0_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLetExpressionAccess().getGroup_0_4_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_0_4__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_0_4_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:1: rule__LetExpression__Group_0_4_1__0 : rule__LetExpression__Group_0_4_1__0__Impl rule__LetExpression__Group_0_4_1__1 ;
    public final void rule__LetExpression__Group_0_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( rule__LetExpression__Group_0_4_1__0__Impl rule__LetExpression__Group_0_4_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:2: rule__LetExpression__Group_0_4_1__0__Impl rule__LetExpression__Group_0_4_1__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0_4_1__0__Impl_in_rule__LetExpression__Group_0_4_1__03666);
            rule__LetExpression__Group_0_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_0_4_1__1_in_rule__LetExpression__Group_0_4_1__03669);
            rule__LetExpression__Group_0_4_1__1();

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
    // $ANTLR end "rule__LetExpression__Group_0_4_1__0"


    // $ANTLR start "rule__LetExpression__Group_0_4_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: rule__LetExpression__Group_0_4_1__0__Impl : ( ',' ) ;
    public final void rule__LetExpression__Group_0_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1777:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ','
            {
             before(grammarAccess.getLetExpressionAccess().getCommaKeyword_0_4_1_0()); 
            match(input,27,FOLLOW_27_in_rule__LetExpression__Group_0_4_1__0__Impl3697); 
             after(grammarAccess.getLetExpressionAccess().getCommaKeyword_0_4_1_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_0_4_1__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_0_4_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: rule__LetExpression__Group_0_4_1__1 : rule__LetExpression__Group_0_4_1__1__Impl ;
    public final void rule__LetExpression__Group_0_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:1: ( rule__LetExpression__Group_0_4_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:2: rule__LetExpression__Group_0_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_0_4_1__1__Impl_in_rule__LetExpression__Group_0_4_1__13728);
            rule__LetExpression__Group_0_4_1__1__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_0_4_1__1"


    // $ANTLR start "rule__LetExpression__Group_0_4_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: rule__LetExpression__Group_0_4_1__1__Impl : ( ruleOperation ) ;
    public final void rule__LetExpression__Group_0_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( ( ruleOperation ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( ruleOperation )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( ruleOperation )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ruleOperation
            {
             before(grammarAccess.getLetExpressionAccess().getOperationParserRuleCall_0_4_1_1()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__LetExpression__Group_0_4_1__1__Impl3755);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getOperationParserRuleCall_0_4_1_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_0_4_1__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: rule__LetExpression__Group_1__0 : rule__LetExpression__Group_1__0__Impl rule__LetExpression__Group_1__1 ;
    public final void rule__LetExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( rule__LetExpression__Group_1__0__Impl rule__LetExpression__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:2: rule__LetExpression__Group_1__0__Impl rule__LetExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__0__Impl_in_rule__LetExpression__Group_1__03788);
            rule__LetExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1__1_in_rule__LetExpression__Group_1__03791);
            rule__LetExpression__Group_1__1();

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
    // $ANTLR end "rule__LetExpression__Group_1__0"


    // $ANTLR start "rule__LetExpression__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: rule__LetExpression__Group_1__0__Impl : ( 'let' ) ;
    public final void rule__LetExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: ( ( 'let' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( 'let' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( 'let' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: 'let'
            {
             before(grammarAccess.getLetExpressionAccess().getLetKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__LetExpression__Group_1__0__Impl3819); 
             after(grammarAccess.getLetExpressionAccess().getLetKeyword_1_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: rule__LetExpression__Group_1__1 : rule__LetExpression__Group_1__1__Impl rule__LetExpression__Group_1__2 ;
    public final void rule__LetExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( rule__LetExpression__Group_1__1__Impl rule__LetExpression__Group_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:2: rule__LetExpression__Group_1__1__Impl rule__LetExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__1__Impl_in_rule__LetExpression__Group_1__13850);
            rule__LetExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1__2_in_rule__LetExpression__Group_1__13853);
            rule__LetExpression__Group_1__2();

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
    // $ANTLR end "rule__LetExpression__Group_1__1"


    // $ANTLR start "rule__LetExpression__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: rule__LetExpression__Group_1__1__Impl : ( ruleletVarName ) ;
    public final void rule__LetExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: ( ( ruleletVarName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( ruleletVarName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( ruleletVarName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:1: ruleletVarName
            {
             before(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleletVarName_in_rule__LetExpression__Group_1__1__Impl3880);
            ruleletVarName();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: rule__LetExpression__Group_1__2 : rule__LetExpression__Group_1__2__Impl rule__LetExpression__Group_1__3 ;
    public final void rule__LetExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: ( rule__LetExpression__Group_1__2__Impl rule__LetExpression__Group_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:2: rule__LetExpression__Group_1__2__Impl rule__LetExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__2__Impl_in_rule__LetExpression__Group_1__23909);
            rule__LetExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1__3_in_rule__LetExpression__Group_1__23912);
            rule__LetExpression__Group_1__3();

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
    // $ANTLR end "rule__LetExpression__Group_1__2"


    // $ANTLR start "rule__LetExpression__Group_1__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: rule__LetExpression__Group_1__2__Impl : ( '->' ) ;
    public final void rule__LetExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( ( '->' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( '->' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( '->' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: '->'
            {
             before(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_2()); 
            match(input,28,FOLLOW_28_in_rule__LetExpression__Group_1__2__Impl3940); 
             after(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_2()); 

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
    // $ANTLR end "rule__LetExpression__Group_1__2__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: rule__LetExpression__Group_1__3 : rule__LetExpression__Group_1__3__Impl rule__LetExpression__Group_1__4 ;
    public final void rule__LetExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( rule__LetExpression__Group_1__3__Impl rule__LetExpression__Group_1__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:2: rule__LetExpression__Group_1__3__Impl rule__LetExpression__Group_1__4
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__3__Impl_in_rule__LetExpression__Group_1__33971);
            rule__LetExpression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1__4_in_rule__LetExpression__Group_1__33974);
            rule__LetExpression__Group_1__4();

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
    // $ANTLR end "rule__LetExpression__Group_1__3"


    // $ANTLR start "rule__LetExpression__Group_1__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1927:1: rule__LetExpression__Group_1__3__Impl : ( ruleletVarName ) ;
    public final void rule__LetExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( ( ruleletVarName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( ruleletVarName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( ruleletVarName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ruleletVarName
            {
             before(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_1_3()); 
            pushFollow(FOLLOW_ruleletVarName_in_rule__LetExpression__Group_1__3__Impl4001);
            ruleletVarName();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_1_3()); 

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
    // $ANTLR end "rule__LetExpression__Group_1__3__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: rule__LetExpression__Group_1__4 : rule__LetExpression__Group_1__4__Impl rule__LetExpression__Group_1__5 ;
    public final void rule__LetExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( rule__LetExpression__Group_1__4__Impl rule__LetExpression__Group_1__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:2: rule__LetExpression__Group_1__4__Impl rule__LetExpression__Group_1__5
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__4__Impl_in_rule__LetExpression__Group_1__44030);
            rule__LetExpression__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1__5_in_rule__LetExpression__Group_1__44033);
            rule__LetExpression__Group_1__5();

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
    // $ANTLR end "rule__LetExpression__Group_1__4"


    // $ANTLR start "rule__LetExpression__Group_1__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: rule__LetExpression__Group_1__4__Impl : ( ':' ) ;
    public final void rule__LetExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ':'
            {
             before(grammarAccess.getLetExpressionAccess().getColonKeyword_1_4()); 
            match(input,26,FOLLOW_26_in_rule__LetExpression__Group_1__4__Impl4061); 
             after(grammarAccess.getLetExpressionAccess().getColonKeyword_1_4()); 

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
    // $ANTLR end "rule__LetExpression__Group_1__4__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: rule__LetExpression__Group_1__5 : rule__LetExpression__Group_1__5__Impl rule__LetExpression__Group_1__6 ;
    public final void rule__LetExpression__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: ( rule__LetExpression__Group_1__5__Impl rule__LetExpression__Group_1__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:2: rule__LetExpression__Group_1__5__Impl rule__LetExpression__Group_1__6
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__5__Impl_in_rule__LetExpression__Group_1__54092);
            rule__LetExpression__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1__6_in_rule__LetExpression__Group_1__54095);
            rule__LetExpression__Group_1__6();

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
    // $ANTLR end "rule__LetExpression__Group_1__5"


    // $ANTLR start "rule__LetExpression__Group_1__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: rule__LetExpression__Group_1__5__Impl : ( '{' ) ;
    public final void rule__LetExpression__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1993:1: '{'
            {
             before(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_1_5()); 
            match(input,23,FOLLOW_23_in_rule__LetExpression__Group_1__5__Impl4123); 
             after(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_1_5()); 

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
    // $ANTLR end "rule__LetExpression__Group_1__5__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: rule__LetExpression__Group_1__6 : rule__LetExpression__Group_1__6__Impl rule__LetExpression__Group_1__7 ;
    public final void rule__LetExpression__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( rule__LetExpression__Group_1__6__Impl rule__LetExpression__Group_1__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:2: rule__LetExpression__Group_1__6__Impl rule__LetExpression__Group_1__7
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__6__Impl_in_rule__LetExpression__Group_1__64154);
            rule__LetExpression__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1__7_in_rule__LetExpression__Group_1__64157);
            rule__LetExpression__Group_1__7();

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
    // $ANTLR end "rule__LetExpression__Group_1__6"


    // $ANTLR start "rule__LetExpression__Group_1__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: rule__LetExpression__Group_1__6__Impl : ( ( rule__LetExpression__Group_1_6__0 ) ) ;
    public final void rule__LetExpression__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: ( ( ( rule__LetExpression__Group_1_6__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: ( ( rule__LetExpression__Group_1_6__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: ( ( rule__LetExpression__Group_1_6__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ( rule__LetExpression__Group_1_6__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_1_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ( rule__LetExpression__Group_1_6__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:2: rule__LetExpression__Group_1_6__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_6__0_in_rule__LetExpression__Group_1__6__Impl4184);
            rule__LetExpression__Group_1_6__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_1_6()); 

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
    // $ANTLR end "rule__LetExpression__Group_1__6__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: rule__LetExpression__Group_1__7 : rule__LetExpression__Group_1__7__Impl rule__LetExpression__Group_1__8 ;
    public final void rule__LetExpression__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( rule__LetExpression__Group_1__7__Impl rule__LetExpression__Group_1__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:2: rule__LetExpression__Group_1__7__Impl rule__LetExpression__Group_1__8
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__7__Impl_in_rule__LetExpression__Group_1__74214);
            rule__LetExpression__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1__8_in_rule__LetExpression__Group_1__74217);
            rule__LetExpression__Group_1__8();

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
    // $ANTLR end "rule__LetExpression__Group_1__7"


    // $ANTLR start "rule__LetExpression__Group_1__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: rule__LetExpression__Group_1__7__Impl : ( ( rule__LetExpression__Group_1_7__0 )* ) ;
    public final void rule__LetExpression__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: ( ( ( rule__LetExpression__Group_1_7__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: ( ( rule__LetExpression__Group_1_7__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: ( ( rule__LetExpression__Group_1_7__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: ( rule__LetExpression__Group_1_7__0 )*
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_1_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: ( rule__LetExpression__Group_1_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:2: rule__LetExpression__Group_1_7__0
            	    {
            	    pushFollow(FOLLOW_rule__LetExpression__Group_1_7__0_in_rule__LetExpression__Group_1__7__Impl4244);
            	    rule__LetExpression__Group_1_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLetExpressionAccess().getGroup_1_7()); 

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
    // $ANTLR end "rule__LetExpression__Group_1__7__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: rule__LetExpression__Group_1__8 : rule__LetExpression__Group_1__8__Impl ;
    public final void rule__LetExpression__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( rule__LetExpression__Group_1__8__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:2: rule__LetExpression__Group_1__8__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__8__Impl_in_rule__LetExpression__Group_1__84275);
            rule__LetExpression__Group_1__8__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_1__8"


    // $ANTLR start "rule__LetExpression__Group_1__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: rule__LetExpression__Group_1__8__Impl : ( '}' ) ;
    public final void rule__LetExpression__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: '}'
            {
             before(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_1_8()); 
            match(input,24,FOLLOW_24_in_rule__LetExpression__Group_1__8__Impl4303); 
             after(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_1_8()); 

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
    // $ANTLR end "rule__LetExpression__Group_1__8__Impl"


    // $ANTLR start "rule__LetExpression__Group_1_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: rule__LetExpression__Group_1_6__0 : rule__LetExpression__Group_1_6__0__Impl rule__LetExpression__Group_1_6__1 ;
    public final void rule__LetExpression__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( rule__LetExpression__Group_1_6__0__Impl rule__LetExpression__Group_1_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:2: rule__LetExpression__Group_1_6__0__Impl rule__LetExpression__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_6__0__Impl_in_rule__LetExpression__Group_1_6__04352);
            rule__LetExpression__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1_6__1_in_rule__LetExpression__Group_1_6__04355);
            rule__LetExpression__Group_1_6__1();

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
    // $ANTLR end "rule__LetExpression__Group_1_6__0"


    // $ANTLR start "rule__LetExpression__Group_1_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:1: rule__LetExpression__Group_1_6__0__Impl : ( ruleCOA ) ;
    public final void rule__LetExpression__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: ( ( ruleCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ( ruleCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ( ruleCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ruleCOA
            {
             before(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_ruleCOA_in_rule__LetExpression__Group_1_6__0__Impl4382);
            ruleCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_1_6_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_1_6__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_1_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: rule__LetExpression__Group_1_6__1 : rule__LetExpression__Group_1_6__1__Impl rule__LetExpression__Group_1_6__2 ;
    public final void rule__LetExpression__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: ( rule__LetExpression__Group_1_6__1__Impl rule__LetExpression__Group_1_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:2: rule__LetExpression__Group_1_6__1__Impl rule__LetExpression__Group_1_6__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_6__1__Impl_in_rule__LetExpression__Group_1_6__14411);
            rule__LetExpression__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1_6__2_in_rule__LetExpression__Group_1_6__14414);
            rule__LetExpression__Group_1_6__2();

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
    // $ANTLR end "rule__LetExpression__Group_1_6__1"


    // $ANTLR start "rule__LetExpression__Group_1_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: rule__LetExpression__Group_1_6__1__Impl : ( '->' ) ;
    public final void rule__LetExpression__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: ( ( '->' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( '->' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( '->' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: '->'
            {
             before(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_6_1()); 
            match(input,28,FOLLOW_28_in_rule__LetExpression__Group_1_6__1__Impl4442); 
             after(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_6_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_1_6__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_1_6__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: rule__LetExpression__Group_1_6__2 : rule__LetExpression__Group_1_6__2__Impl ;
    public final void rule__LetExpression__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: ( rule__LetExpression__Group_1_6__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:2: rule__LetExpression__Group_1_6__2__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_6__2__Impl_in_rule__LetExpression__Group_1_6__24473);
            rule__LetExpression__Group_1_6__2__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_1_6__2"


    // $ANTLR start "rule__LetExpression__Group_1_6__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: rule__LetExpression__Group_1_6__2__Impl : ( ruleSCOA ) ;
    public final void rule__LetExpression__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:1: ( ( ruleSCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: ( ruleSCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: ( ruleSCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: ruleSCOA
            {
             before(grammarAccess.getLetExpressionAccess().getSCOAParserRuleCall_1_6_2()); 
            pushFollow(FOLLOW_ruleSCOA_in_rule__LetExpression__Group_1_6__2__Impl4500);
            ruleSCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getSCOAParserRuleCall_1_6_2()); 

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
    // $ANTLR end "rule__LetExpression__Group_1_6__2__Impl"


    // $ANTLR start "rule__LetExpression__Group_1_7__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: rule__LetExpression__Group_1_7__0 : rule__LetExpression__Group_1_7__0__Impl rule__LetExpression__Group_1_7__1 ;
    public final void rule__LetExpression__Group_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: ( rule__LetExpression__Group_1_7__0__Impl rule__LetExpression__Group_1_7__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:2: rule__LetExpression__Group_1_7__0__Impl rule__LetExpression__Group_1_7__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_7__0__Impl_in_rule__LetExpression__Group_1_7__04535);
            rule__LetExpression__Group_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1_7__1_in_rule__LetExpression__Group_1_7__04538);
            rule__LetExpression__Group_1_7__1();

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
    // $ANTLR end "rule__LetExpression__Group_1_7__0"


    // $ANTLR start "rule__LetExpression__Group_1_7__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: rule__LetExpression__Group_1_7__0__Impl : ( ',' ) ;
    public final void rule__LetExpression__Group_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: ','
            {
             before(grammarAccess.getLetExpressionAccess().getCommaKeyword_1_7_0()); 
            match(input,27,FOLLOW_27_in_rule__LetExpression__Group_1_7__0__Impl4566); 
             after(grammarAccess.getLetExpressionAccess().getCommaKeyword_1_7_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_1_7__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_1_7__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: rule__LetExpression__Group_1_7__1 : rule__LetExpression__Group_1_7__1__Impl ;
    public final void rule__LetExpression__Group_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( rule__LetExpression__Group_1_7__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:2: rule__LetExpression__Group_1_7__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_7__1__Impl_in_rule__LetExpression__Group_1_7__14597);
            rule__LetExpression__Group_1_7__1__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_1_7__1"


    // $ANTLR start "rule__LetExpression__Group_1_7__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: rule__LetExpression__Group_1_7__1__Impl : ( ( rule__LetExpression__Group_1_7_1__0 ) ) ;
    public final void rule__LetExpression__Group_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( ( ( rule__LetExpression__Group_1_7_1__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( ( rule__LetExpression__Group_1_7_1__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( ( rule__LetExpression__Group_1_7_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( rule__LetExpression__Group_1_7_1__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_1_7_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: ( rule__LetExpression__Group_1_7_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:2: rule__LetExpression__Group_1_7_1__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_7_1__0_in_rule__LetExpression__Group_1_7__1__Impl4624);
            rule__LetExpression__Group_1_7_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_1_7_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_1_7__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_1_7_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: rule__LetExpression__Group_1_7_1__0 : rule__LetExpression__Group_1_7_1__0__Impl rule__LetExpression__Group_1_7_1__1 ;
    public final void rule__LetExpression__Group_1_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: ( rule__LetExpression__Group_1_7_1__0__Impl rule__LetExpression__Group_1_7_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:2: rule__LetExpression__Group_1_7_1__0__Impl rule__LetExpression__Group_1_7_1__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_7_1__0__Impl_in_rule__LetExpression__Group_1_7_1__04658);
            rule__LetExpression__Group_1_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1_7_1__1_in_rule__LetExpression__Group_1_7_1__04661);
            rule__LetExpression__Group_1_7_1__1();

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
    // $ANTLR end "rule__LetExpression__Group_1_7_1__0"


    // $ANTLR start "rule__LetExpression__Group_1_7_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: rule__LetExpression__Group_1_7_1__0__Impl : ( ruleCOA ) ;
    public final void rule__LetExpression__Group_1_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2285:1: ( ( ruleCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: ( ruleCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: ( ruleCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: ruleCOA
            {
             before(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_1_7_1_0()); 
            pushFollow(FOLLOW_ruleCOA_in_rule__LetExpression__Group_1_7_1__0__Impl4688);
            ruleCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_1_7_1_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_1_7_1__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_1_7_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: rule__LetExpression__Group_1_7_1__1 : rule__LetExpression__Group_1_7_1__1__Impl rule__LetExpression__Group_1_7_1__2 ;
    public final void rule__LetExpression__Group_1_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( rule__LetExpression__Group_1_7_1__1__Impl rule__LetExpression__Group_1_7_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:2: rule__LetExpression__Group_1_7_1__1__Impl rule__LetExpression__Group_1_7_1__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_7_1__1__Impl_in_rule__LetExpression__Group_1_7_1__14717);
            rule__LetExpression__Group_1_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1_7_1__2_in_rule__LetExpression__Group_1_7_1__14720);
            rule__LetExpression__Group_1_7_1__2();

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
    // $ANTLR end "rule__LetExpression__Group_1_7_1__1"


    // $ANTLR start "rule__LetExpression__Group_1_7_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: rule__LetExpression__Group_1_7_1__1__Impl : ( '->' ) ;
    public final void rule__LetExpression__Group_1_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: ( ( '->' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: ( '->' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: ( '->' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: '->'
            {
             before(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_7_1_1()); 
            match(input,28,FOLLOW_28_in_rule__LetExpression__Group_1_7_1__1__Impl4748); 
             after(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_7_1_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_1_7_1__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_1_7_1__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: rule__LetExpression__Group_1_7_1__2 : rule__LetExpression__Group_1_7_1__2__Impl ;
    public final void rule__LetExpression__Group_1_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: ( rule__LetExpression__Group_1_7_1__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:2: rule__LetExpression__Group_1_7_1__2__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1_7_1__2__Impl_in_rule__LetExpression__Group_1_7_1__24779);
            rule__LetExpression__Group_1_7_1__2__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_1_7_1__2"


    // $ANTLR start "rule__LetExpression__Group_1_7_1__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: rule__LetExpression__Group_1_7_1__2__Impl : ( ruleSCOA ) ;
    public final void rule__LetExpression__Group_1_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: ( ( ruleSCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: ( ruleSCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: ( ruleSCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: ruleSCOA
            {
             before(grammarAccess.getLetExpressionAccess().getSCOAParserRuleCall_1_7_1_2()); 
            pushFollow(FOLLOW_ruleSCOA_in_rule__LetExpression__Group_1_7_1__2__Impl4806);
            ruleSCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getSCOAParserRuleCall_1_7_1_2()); 

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
    // $ANTLR end "rule__LetExpression__Group_1_7_1__2__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: rule__LetExpression__Group_2__0 : rule__LetExpression__Group_2__0__Impl rule__LetExpression__Group_2__1 ;
    public final void rule__LetExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: ( rule__LetExpression__Group_2__0__Impl rule__LetExpression__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:2: rule__LetExpression__Group_2__0__Impl rule__LetExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__0__Impl_in_rule__LetExpression__Group_2__04841);
            rule__LetExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2__1_in_rule__LetExpression__Group_2__04844);
            rule__LetExpression__Group_2__1();

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
    // $ANTLR end "rule__LetExpression__Group_2__0"


    // $ANTLR start "rule__LetExpression__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: rule__LetExpression__Group_2__0__Impl : ( 'let' ) ;
    public final void rule__LetExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( ( 'let' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: ( 'let' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: ( 'let' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: 'let'
            {
             before(grammarAccess.getLetExpressionAccess().getLetKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__LetExpression__Group_2__0__Impl4872); 
             after(grammarAccess.getLetExpressionAccess().getLetKeyword_2_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_2__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: rule__LetExpression__Group_2__1 : rule__LetExpression__Group_2__1__Impl rule__LetExpression__Group_2__2 ;
    public final void rule__LetExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: ( rule__LetExpression__Group_2__1__Impl rule__LetExpression__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:2: rule__LetExpression__Group_2__1__Impl rule__LetExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__1__Impl_in_rule__LetExpression__Group_2__14903);
            rule__LetExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2__2_in_rule__LetExpression__Group_2__14906);
            rule__LetExpression__Group_2__2();

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
    // $ANTLR end "rule__LetExpression__Group_2__1"


    // $ANTLR start "rule__LetExpression__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: rule__LetExpression__Group_2__1__Impl : ( ruleletVarName ) ;
    public final void rule__LetExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: ( ( ruleletVarName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: ( ruleletVarName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: ( ruleletVarName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: ruleletVarName
            {
             before(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleletVarName_in_rule__LetExpression__Group_2__1__Impl4933);
            ruleletVarName();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getLetVarNameParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_2__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: rule__LetExpression__Group_2__2 : rule__LetExpression__Group_2__2__Impl rule__LetExpression__Group_2__3 ;
    public final void rule__LetExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( rule__LetExpression__Group_2__2__Impl rule__LetExpression__Group_2__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:2: rule__LetExpression__Group_2__2__Impl rule__LetExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__2__Impl_in_rule__LetExpression__Group_2__24962);
            rule__LetExpression__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2__3_in_rule__LetExpression__Group_2__24965);
            rule__LetExpression__Group_2__3();

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
    // $ANTLR end "rule__LetExpression__Group_2__2"


    // $ANTLR start "rule__LetExpression__Group_2__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: rule__LetExpression__Group_2__2__Impl : ( '->' ) ;
    public final void rule__LetExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2439:1: ( ( '->' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: ( '->' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: ( '->' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: '->'
            {
             before(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_2()); 
            match(input,28,FOLLOW_28_in_rule__LetExpression__Group_2__2__Impl4993); 
             after(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_2()); 

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
    // $ANTLR end "rule__LetExpression__Group_2__2__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: rule__LetExpression__Group_2__3 : rule__LetExpression__Group_2__3__Impl rule__LetExpression__Group_2__4 ;
    public final void rule__LetExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: ( rule__LetExpression__Group_2__3__Impl rule__LetExpression__Group_2__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:2: rule__LetExpression__Group_2__3__Impl rule__LetExpression__Group_2__4
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__3__Impl_in_rule__LetExpression__Group_2__35024);
            rule__LetExpression__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2__4_in_rule__LetExpression__Group_2__35027);
            rule__LetExpression__Group_2__4();

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
    // $ANTLR end "rule__LetExpression__Group_2__3"


    // $ANTLR start "rule__LetExpression__Group_2__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: rule__LetExpression__Group_2__3__Impl : ( ruleletVarNameArray ) ;
    public final void rule__LetExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: ( ( ruleletVarNameArray ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( ruleletVarNameArray )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( ruleletVarNameArray )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: ruleletVarNameArray
            {
             before(grammarAccess.getLetExpressionAccess().getLetVarNameArrayParserRuleCall_2_3()); 
            pushFollow(FOLLOW_ruleletVarNameArray_in_rule__LetExpression__Group_2__3__Impl5054);
            ruleletVarNameArray();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getLetVarNameArrayParserRuleCall_2_3()); 

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
    // $ANTLR end "rule__LetExpression__Group_2__3__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: rule__LetExpression__Group_2__4 : rule__LetExpression__Group_2__4__Impl rule__LetExpression__Group_2__5 ;
    public final void rule__LetExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ( rule__LetExpression__Group_2__4__Impl rule__LetExpression__Group_2__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:2: rule__LetExpression__Group_2__4__Impl rule__LetExpression__Group_2__5
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__4__Impl_in_rule__LetExpression__Group_2__45083);
            rule__LetExpression__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2__5_in_rule__LetExpression__Group_2__45086);
            rule__LetExpression__Group_2__5();

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
    // $ANTLR end "rule__LetExpression__Group_2__4"


    // $ANTLR start "rule__LetExpression__Group_2__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: rule__LetExpression__Group_2__4__Impl : ( ':' ) ;
    public final void rule__LetExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:1: ':'
            {
             before(grammarAccess.getLetExpressionAccess().getColonKeyword_2_4()); 
            match(input,26,FOLLOW_26_in_rule__LetExpression__Group_2__4__Impl5114); 
             after(grammarAccess.getLetExpressionAccess().getColonKeyword_2_4()); 

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
    // $ANTLR end "rule__LetExpression__Group_2__4__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2514:1: rule__LetExpression__Group_2__5 : rule__LetExpression__Group_2__5__Impl rule__LetExpression__Group_2__6 ;
    public final void rule__LetExpression__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: ( rule__LetExpression__Group_2__5__Impl rule__LetExpression__Group_2__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:2: rule__LetExpression__Group_2__5__Impl rule__LetExpression__Group_2__6
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__5__Impl_in_rule__LetExpression__Group_2__55145);
            rule__LetExpression__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2__6_in_rule__LetExpression__Group_2__55148);
            rule__LetExpression__Group_2__6();

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
    // $ANTLR end "rule__LetExpression__Group_2__5"


    // $ANTLR start "rule__LetExpression__Group_2__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: rule__LetExpression__Group_2__5__Impl : ( '{' ) ;
    public final void rule__LetExpression__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:1: '{'
            {
             before(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_2_5()); 
            match(input,23,FOLLOW_23_in_rule__LetExpression__Group_2__5__Impl5176); 
             after(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_2_5()); 

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
    // $ANTLR end "rule__LetExpression__Group_2__5__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: rule__LetExpression__Group_2__6 : rule__LetExpression__Group_2__6__Impl rule__LetExpression__Group_2__7 ;
    public final void rule__LetExpression__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2549:1: ( rule__LetExpression__Group_2__6__Impl rule__LetExpression__Group_2__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:2: rule__LetExpression__Group_2__6__Impl rule__LetExpression__Group_2__7
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__6__Impl_in_rule__LetExpression__Group_2__65207);
            rule__LetExpression__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2__7_in_rule__LetExpression__Group_2__65210);
            rule__LetExpression__Group_2__7();

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
    // $ANTLR end "rule__LetExpression__Group_2__6"


    // $ANTLR start "rule__LetExpression__Group_2__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: rule__LetExpression__Group_2__6__Impl : ( ( rule__LetExpression__Group_2_6__0 ) ) ;
    public final void rule__LetExpression__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: ( ( ( rule__LetExpression__Group_2_6__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( ( rule__LetExpression__Group_2_6__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( ( rule__LetExpression__Group_2_6__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( rule__LetExpression__Group_2_6__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_2_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( rule__LetExpression__Group_2_6__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:2: rule__LetExpression__Group_2_6__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__0_in_rule__LetExpression__Group_2__6__Impl5237);
            rule__LetExpression__Group_2_6__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_2_6()); 

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
    // $ANTLR end "rule__LetExpression__Group_2__6__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: rule__LetExpression__Group_2__7 : rule__LetExpression__Group_2__7__Impl rule__LetExpression__Group_2__8 ;
    public final void rule__LetExpression__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( rule__LetExpression__Group_2__7__Impl rule__LetExpression__Group_2__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:2: rule__LetExpression__Group_2__7__Impl rule__LetExpression__Group_2__8
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__7__Impl_in_rule__LetExpression__Group_2__75267);
            rule__LetExpression__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2__8_in_rule__LetExpression__Group_2__75270);
            rule__LetExpression__Group_2__8();

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
    // $ANTLR end "rule__LetExpression__Group_2__7"


    // $ANTLR start "rule__LetExpression__Group_2__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: rule__LetExpression__Group_2__7__Impl : ( ( rule__LetExpression__Group_2_7__0 )* ) ;
    public final void rule__LetExpression__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( ( ( rule__LetExpression__Group_2_7__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( ( rule__LetExpression__Group_2_7__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( ( rule__LetExpression__Group_2_7__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: ( rule__LetExpression__Group_2_7__0 )*
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_2_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( rule__LetExpression__Group_2_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:2: rule__LetExpression__Group_2_7__0
            	    {
            	    pushFollow(FOLLOW_rule__LetExpression__Group_2_7__0_in_rule__LetExpression__Group_2__7__Impl5297);
            	    rule__LetExpression__Group_2_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getLetExpressionAccess().getGroup_2_7()); 

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
    // $ANTLR end "rule__LetExpression__Group_2__7__Impl"


    // $ANTLR start "rule__LetExpression__Group_2__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: rule__LetExpression__Group_2__8 : rule__LetExpression__Group_2__8__Impl ;
    public final void rule__LetExpression__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: ( rule__LetExpression__Group_2__8__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:2: rule__LetExpression__Group_2__8__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2__8__Impl_in_rule__LetExpression__Group_2__85328);
            rule__LetExpression__Group_2__8__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_2__8"


    // $ANTLR start "rule__LetExpression__Group_2__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: rule__LetExpression__Group_2__8__Impl : ( '}' ) ;
    public final void rule__LetExpression__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: '}'
            {
             before(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_2_8()); 
            match(input,24,FOLLOW_24_in_rule__LetExpression__Group_2__8__Impl5356); 
             after(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_2_8()); 

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
    // $ANTLR end "rule__LetExpression__Group_2__8__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: rule__LetExpression__Group_2_6__0 : rule__LetExpression__Group_2_6__0__Impl rule__LetExpression__Group_2_6__1 ;
    public final void rule__LetExpression__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ( rule__LetExpression__Group_2_6__0__Impl rule__LetExpression__Group_2_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:2: rule__LetExpression__Group_2_6__0__Impl rule__LetExpression__Group_2_6__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__0__Impl_in_rule__LetExpression__Group_2_6__05405);
            rule__LetExpression__Group_2_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__1_in_rule__LetExpression__Group_2_6__05408);
            rule__LetExpression__Group_2_6__1();

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
    // $ANTLR end "rule__LetExpression__Group_2_6__0"


    // $ANTLR start "rule__LetExpression__Group_2_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: rule__LetExpression__Group_2_6__0__Impl : ( ruleCOA ) ;
    public final void rule__LetExpression__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: ( ( ruleCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: ( ruleCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: ( ruleCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ruleCOA
            {
             before(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_6_0()); 
            pushFollow(FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_6__0__Impl5435);
            ruleCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_6_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_6__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2680:1: rule__LetExpression__Group_2_6__1 : rule__LetExpression__Group_2_6__1__Impl rule__LetExpression__Group_2_6__2 ;
    public final void rule__LetExpression__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: ( rule__LetExpression__Group_2_6__1__Impl rule__LetExpression__Group_2_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:2: rule__LetExpression__Group_2_6__1__Impl rule__LetExpression__Group_2_6__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__1__Impl_in_rule__LetExpression__Group_2_6__15464);
            rule__LetExpression__Group_2_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__2_in_rule__LetExpression__Group_2_6__15467);
            rule__LetExpression__Group_2_6__2();

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
    // $ANTLR end "rule__LetExpression__Group_2_6__1"


    // $ANTLR start "rule__LetExpression__Group_2_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: rule__LetExpression__Group_2_6__1__Impl : ( '->' ) ;
    public final void rule__LetExpression__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: ( ( '->' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:1: ( '->' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:1: ( '->' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: '->'
            {
             before(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_6_1()); 
            match(input,28,FOLLOW_28_in_rule__LetExpression__Group_2_6__1__Impl5495); 
             after(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_6_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_6__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_6__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: rule__LetExpression__Group_2_6__2 : rule__LetExpression__Group_2_6__2__Impl rule__LetExpression__Group_2_6__3 ;
    public final void rule__LetExpression__Group_2_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:1: ( rule__LetExpression__Group_2_6__2__Impl rule__LetExpression__Group_2_6__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:2: rule__LetExpression__Group_2_6__2__Impl rule__LetExpression__Group_2_6__3
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__2__Impl_in_rule__LetExpression__Group_2_6__25526);
            rule__LetExpression__Group_2_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__3_in_rule__LetExpression__Group_2_6__25529);
            rule__LetExpression__Group_2_6__3();

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
    // $ANTLR end "rule__LetExpression__Group_2_6__2"


    // $ANTLR start "rule__LetExpression__Group_2_6__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: rule__LetExpression__Group_2_6__2__Impl : ( '{' ) ;
    public final void rule__LetExpression__Group_2_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: '{'
            {
             before(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_2_6_2()); 
            match(input,23,FOLLOW_23_in_rule__LetExpression__Group_2_6__2__Impl5557); 
             after(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_2_6_2()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_6__2__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_6__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2742:1: rule__LetExpression__Group_2_6__3 : rule__LetExpression__Group_2_6__3__Impl rule__LetExpression__Group_2_6__4 ;
    public final void rule__LetExpression__Group_2_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: ( rule__LetExpression__Group_2_6__3__Impl rule__LetExpression__Group_2_6__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2747:2: rule__LetExpression__Group_2_6__3__Impl rule__LetExpression__Group_2_6__4
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__3__Impl_in_rule__LetExpression__Group_2_6__35588);
            rule__LetExpression__Group_2_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__4_in_rule__LetExpression__Group_2_6__35591);
            rule__LetExpression__Group_2_6__4();

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
    // $ANTLR end "rule__LetExpression__Group_2_6__3"


    // $ANTLR start "rule__LetExpression__Group_2_6__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: rule__LetExpression__Group_2_6__3__Impl : ( ( rule__LetExpression__Group_2_6_3__0 ) ) ;
    public final void rule__LetExpression__Group_2_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( ( ( rule__LetExpression__Group_2_6_3__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( ( rule__LetExpression__Group_2_6_3__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( ( rule__LetExpression__Group_2_6_3__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: ( rule__LetExpression__Group_2_6_3__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_2_6_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( rule__LetExpression__Group_2_6_3__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:2: rule__LetExpression__Group_2_6_3__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6_3__0_in_rule__LetExpression__Group_2_6__3__Impl5618);
            rule__LetExpression__Group_2_6_3__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_2_6_3()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_6__3__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_6__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: rule__LetExpression__Group_2_6__4 : rule__LetExpression__Group_2_6__4__Impl ;
    public final void rule__LetExpression__Group_2_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: ( rule__LetExpression__Group_2_6__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:2: rule__LetExpression__Group_2_6__4__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6__4__Impl_in_rule__LetExpression__Group_2_6__45648);
            rule__LetExpression__Group_2_6__4__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_2_6__4"


    // $ANTLR start "rule__LetExpression__Group_2_6__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2782:1: rule__LetExpression__Group_2_6__4__Impl : ( '}' ) ;
    public final void rule__LetExpression__Group_2_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: '}'
            {
             before(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_2_6_4()); 
            match(input,24,FOLLOW_24_in_rule__LetExpression__Group_2_6__4__Impl5676); 
             after(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_2_6_4()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_6__4__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_6_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2811:1: rule__LetExpression__Group_2_6_3__0 : rule__LetExpression__Group_2_6_3__0__Impl rule__LetExpression__Group_2_6_3__1 ;
    public final void rule__LetExpression__Group_2_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ( rule__LetExpression__Group_2_6_3__0__Impl rule__LetExpression__Group_2_6_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:2: rule__LetExpression__Group_2_6_3__0__Impl rule__LetExpression__Group_2_6_3__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6_3__0__Impl_in_rule__LetExpression__Group_2_6_3__05717);
            rule__LetExpression__Group_2_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_6_3__1_in_rule__LetExpression__Group_2_6_3__05720);
            rule__LetExpression__Group_2_6_3__1();

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
    // $ANTLR end "rule__LetExpression__Group_2_6_3__0"


    // $ANTLR start "rule__LetExpression__Group_2_6_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: rule__LetExpression__Group_2_6_3__0__Impl : ( ruleCOA ) ;
    public final void rule__LetExpression__Group_2_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: ( ( ruleCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: ( ruleCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: ( ruleCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: ruleCOA
            {
             before(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_6_3_0()); 
            pushFollow(FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_6_3__0__Impl5747);
            ruleCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_6_3_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_6_3__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_6_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:1: rule__LetExpression__Group_2_6_3__1 : rule__LetExpression__Group_2_6_3__1__Impl ;
    public final void rule__LetExpression__Group_2_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( rule__LetExpression__Group_2_6_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:2: rule__LetExpression__Group_2_6_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6_3__1__Impl_in_rule__LetExpression__Group_2_6_3__15776);
            rule__LetExpression__Group_2_6_3__1__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_2_6_3__1"


    // $ANTLR start "rule__LetExpression__Group_2_6_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: rule__LetExpression__Group_2_6_3__1__Impl : ( ( ( rule__LetExpression__Group_2_6_3_1__0 ) ) ( ( rule__LetExpression__Group_2_6_3_1__0 )* ) ) ;
    public final void rule__LetExpression__Group_2_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: ( ( ( ( rule__LetExpression__Group_2_6_3_1__0 ) ) ( ( rule__LetExpression__Group_2_6_3_1__0 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2856:1: ( ( ( rule__LetExpression__Group_2_6_3_1__0 ) ) ( ( rule__LetExpression__Group_2_6_3_1__0 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2856:1: ( ( ( rule__LetExpression__Group_2_6_3_1__0 ) ) ( ( rule__LetExpression__Group_2_6_3_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:1: ( ( rule__LetExpression__Group_2_6_3_1__0 ) ) ( ( rule__LetExpression__Group_2_6_3_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:1: ( ( rule__LetExpression__Group_2_6_3_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: ( rule__LetExpression__Group_2_6_3_1__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_2_6_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ( rule__LetExpression__Group_2_6_3_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:2: rule__LetExpression__Group_2_6_3_1__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6_3_1__0_in_rule__LetExpression__Group_2_6_3__1__Impl5805);
            rule__LetExpression__Group_2_6_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_2_6_3_1()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:1: ( ( rule__LetExpression__Group_2_6_3_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( rule__LetExpression__Group_2_6_3_1__0 )*
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_2_6_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( rule__LetExpression__Group_2_6_3_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:2: rule__LetExpression__Group_2_6_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LetExpression__Group_2_6_3_1__0_in_rule__LetExpression__Group_2_6_3__1__Impl5817);
            	    rule__LetExpression__Group_2_6_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getLetExpressionAccess().getGroup_2_6_3_1()); 

            }


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
    // $ANTLR end "rule__LetExpression__Group_2_6_3__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_6_3_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: rule__LetExpression__Group_2_6_3_1__0 : rule__LetExpression__Group_2_6_3_1__0__Impl rule__LetExpression__Group_2_6_3_1__1 ;
    public final void rule__LetExpression__Group_2_6_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( rule__LetExpression__Group_2_6_3_1__0__Impl rule__LetExpression__Group_2_6_3_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:2: rule__LetExpression__Group_2_6_3_1__0__Impl rule__LetExpression__Group_2_6_3_1__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6_3_1__0__Impl_in_rule__LetExpression__Group_2_6_3_1__05854);
            rule__LetExpression__Group_2_6_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_6_3_1__1_in_rule__LetExpression__Group_2_6_3_1__05857);
            rule__LetExpression__Group_2_6_3_1__1();

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
    // $ANTLR end "rule__LetExpression__Group_2_6_3_1__0"


    // $ANTLR start "rule__LetExpression__Group_2_6_3_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:1: rule__LetExpression__Group_2_6_3_1__0__Impl : ( ',' ) ;
    public final void rule__LetExpression__Group_2_6_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: ','
            {
             before(grammarAccess.getLetExpressionAccess().getCommaKeyword_2_6_3_1_0()); 
            match(input,27,FOLLOW_27_in_rule__LetExpression__Group_2_6_3_1__0__Impl5885); 
             after(grammarAccess.getLetExpressionAccess().getCommaKeyword_2_6_3_1_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_6_3_1__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_6_3_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: rule__LetExpression__Group_2_6_3_1__1 : rule__LetExpression__Group_2_6_3_1__1__Impl ;
    public final void rule__LetExpression__Group_2_6_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ( rule__LetExpression__Group_2_6_3_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:2: rule__LetExpression__Group_2_6_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_6_3_1__1__Impl_in_rule__LetExpression__Group_2_6_3_1__15916);
            rule__LetExpression__Group_2_6_3_1__1__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_2_6_3_1__1"


    // $ANTLR start "rule__LetExpression__Group_2_6_3_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: rule__LetExpression__Group_2_6_3_1__1__Impl : ( ruleCOA ) ;
    public final void rule__LetExpression__Group_2_6_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2925:1: ( ( ruleCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( ruleCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( ruleCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ruleCOA
            {
             before(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_6_3_1_1()); 
            pushFollow(FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_6_3_1__1__Impl5943);
            ruleCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_6_3_1_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_6_3_1__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:1: rule__LetExpression__Group_2_7__0 : rule__LetExpression__Group_2_7__0__Impl rule__LetExpression__Group_2_7__1 ;
    public final void rule__LetExpression__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2946:1: ( rule__LetExpression__Group_2_7__0__Impl rule__LetExpression__Group_2_7__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:2: rule__LetExpression__Group_2_7__0__Impl rule__LetExpression__Group_2_7__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7__0__Impl_in_rule__LetExpression__Group_2_7__05976);
            rule__LetExpression__Group_2_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_7__1_in_rule__LetExpression__Group_2_7__05979);
            rule__LetExpression__Group_2_7__1();

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
    // $ANTLR end "rule__LetExpression__Group_2_7__0"


    // $ANTLR start "rule__LetExpression__Group_2_7__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: rule__LetExpression__Group_2_7__0__Impl : ( ',' ) ;
    public final void rule__LetExpression__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:1: ','
            {
             before(grammarAccess.getLetExpressionAccess().getCommaKeyword_2_7_0()); 
            match(input,27,FOLLOW_27_in_rule__LetExpression__Group_2_7__0__Impl6007); 
             after(grammarAccess.getLetExpressionAccess().getCommaKeyword_2_7_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: rule__LetExpression__Group_2_7__1 : rule__LetExpression__Group_2_7__1__Impl ;
    public final void rule__LetExpression__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ( rule__LetExpression__Group_2_7__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:2: rule__LetExpression__Group_2_7__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7__1__Impl_in_rule__LetExpression__Group_2_7__16038);
            rule__LetExpression__Group_2_7__1__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_2_7__1"


    // $ANTLR start "rule__LetExpression__Group_2_7__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: rule__LetExpression__Group_2_7__1__Impl : ( ( rule__LetExpression__Group_2_7_1__0 ) ) ;
    public final void rule__LetExpression__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: ( ( ( rule__LetExpression__Group_2_7_1__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: ( ( rule__LetExpression__Group_2_7_1__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: ( ( rule__LetExpression__Group_2_7_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:1: ( rule__LetExpression__Group_2_7_1__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_2_7_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2991:1: ( rule__LetExpression__Group_2_7_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2991:2: rule__LetExpression__Group_2_7_1__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__0_in_rule__LetExpression__Group_2_7__1__Impl6065);
            rule__LetExpression__Group_2_7_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_2_7_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:1: rule__LetExpression__Group_2_7_1__0 : rule__LetExpression__Group_2_7_1__0__Impl rule__LetExpression__Group_2_7_1__1 ;
    public final void rule__LetExpression__Group_2_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( rule__LetExpression__Group_2_7_1__0__Impl rule__LetExpression__Group_2_7_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:2: rule__LetExpression__Group_2_7_1__0__Impl rule__LetExpression__Group_2_7_1__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__0__Impl_in_rule__LetExpression__Group_2_7_1__06099);
            rule__LetExpression__Group_2_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__1_in_rule__LetExpression__Group_2_7_1__06102);
            rule__LetExpression__Group_2_7_1__1();

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__0"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: rule__LetExpression__Group_2_7_1__0__Impl : ( ruleCOA ) ;
    public final void rule__LetExpression__Group_2_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: ( ( ruleCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: ( ruleCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: ( ruleCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: ruleCOA
            {
             before(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_7_1_0()); 
            pushFollow(FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_7_1__0__Impl6129);
            ruleCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_7_1_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: rule__LetExpression__Group_2_7_1__1 : rule__LetExpression__Group_2_7_1__1__Impl rule__LetExpression__Group_2_7_1__2 ;
    public final void rule__LetExpression__Group_2_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ( rule__LetExpression__Group_2_7_1__1__Impl rule__LetExpression__Group_2_7_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:2: rule__LetExpression__Group_2_7_1__1__Impl rule__LetExpression__Group_2_7_1__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__1__Impl_in_rule__LetExpression__Group_2_7_1__16158);
            rule__LetExpression__Group_2_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__2_in_rule__LetExpression__Group_2_7_1__16161);
            rule__LetExpression__Group_2_7_1__2();

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__1"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: rule__LetExpression__Group_2_7_1__1__Impl : ( '->' ) ;
    public final void rule__LetExpression__Group_2_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3050:1: ( ( '->' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: ( '->' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: ( '->' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: '->'
            {
             before(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_7_1_1()); 
            match(input,28,FOLLOW_28_in_rule__LetExpression__Group_2_7_1__1__Impl6189); 
             after(grammarAccess.getLetExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_7_1_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: rule__LetExpression__Group_2_7_1__2 : rule__LetExpression__Group_2_7_1__2__Impl rule__LetExpression__Group_2_7_1__3 ;
    public final void rule__LetExpression__Group_2_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( rule__LetExpression__Group_2_7_1__2__Impl rule__LetExpression__Group_2_7_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:2: rule__LetExpression__Group_2_7_1__2__Impl rule__LetExpression__Group_2_7_1__3
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__2__Impl_in_rule__LetExpression__Group_2_7_1__26220);
            rule__LetExpression__Group_2_7_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__3_in_rule__LetExpression__Group_2_7_1__26223);
            rule__LetExpression__Group_2_7_1__3();

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__2"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3077:1: rule__LetExpression__Group_2_7_1__2__Impl : ( '{' ) ;
    public final void rule__LetExpression__Group_2_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3083:1: '{'
            {
             before(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_2_7_1_2()); 
            match(input,23,FOLLOW_23_in_rule__LetExpression__Group_2_7_1__2__Impl6251); 
             after(grammarAccess.getLetExpressionAccess().getLeftCurlyBracketKeyword_2_7_1_2()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__2__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: rule__LetExpression__Group_2_7_1__3 : rule__LetExpression__Group_2_7_1__3__Impl rule__LetExpression__Group_2_7_1__4 ;
    public final void rule__LetExpression__Group_2_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ( rule__LetExpression__Group_2_7_1__3__Impl rule__LetExpression__Group_2_7_1__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:2: rule__LetExpression__Group_2_7_1__3__Impl rule__LetExpression__Group_2_7_1__4
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__3__Impl_in_rule__LetExpression__Group_2_7_1__36282);
            rule__LetExpression__Group_2_7_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__4_in_rule__LetExpression__Group_2_7_1__36285);
            rule__LetExpression__Group_2_7_1__4();

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__3"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: rule__LetExpression__Group_2_7_1__3__Impl : ( ( rule__LetExpression__Group_2_7_1_3__0 ) ) ;
    public final void rule__LetExpression__Group_2_7_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3112:1: ( ( ( rule__LetExpression__Group_2_7_1_3__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3113:1: ( ( rule__LetExpression__Group_2_7_1_3__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3113:1: ( ( rule__LetExpression__Group_2_7_1_3__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( rule__LetExpression__Group_2_7_1_3__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_2_7_1_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( rule__LetExpression__Group_2_7_1_3__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:2: rule__LetExpression__Group_2_7_1_3__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1_3__0_in_rule__LetExpression__Group_2_7_1__3__Impl6312);
            rule__LetExpression__Group_2_7_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_2_7_1_3()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__3__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3125:1: rule__LetExpression__Group_2_7_1__4 : rule__LetExpression__Group_2_7_1__4__Impl ;
    public final void rule__LetExpression__Group_2_7_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: ( rule__LetExpression__Group_2_7_1__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:2: rule__LetExpression__Group_2_7_1__4__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1__4__Impl_in_rule__LetExpression__Group_2_7_1__46342);
            rule__LetExpression__Group_2_7_1__4__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__4"


    // $ANTLR start "rule__LetExpression__Group_2_7_1__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: rule__LetExpression__Group_2_7_1__4__Impl : ( '}' ) ;
    public final void rule__LetExpression__Group_2_7_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3141:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3141:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3142:1: '}'
            {
             before(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_2_7_1_4()); 
            match(input,24,FOLLOW_24_in_rule__LetExpression__Group_2_7_1__4__Impl6370); 
             after(grammarAccess.getLetExpressionAccess().getRightCurlyBracketKeyword_2_7_1_4()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1__4__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7_1_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: rule__LetExpression__Group_2_7_1_3__0 : rule__LetExpression__Group_2_7_1_3__0__Impl rule__LetExpression__Group_2_7_1_3__1 ;
    public final void rule__LetExpression__Group_2_7_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3169:1: ( rule__LetExpression__Group_2_7_1_3__0__Impl rule__LetExpression__Group_2_7_1_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:2: rule__LetExpression__Group_2_7_1_3__0__Impl rule__LetExpression__Group_2_7_1_3__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1_3__0__Impl_in_rule__LetExpression__Group_2_7_1_3__06411);
            rule__LetExpression__Group_2_7_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1_3__1_in_rule__LetExpression__Group_2_7_1_3__06414);
            rule__LetExpression__Group_2_7_1_3__1();

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1_3__0"


    // $ANTLR start "rule__LetExpression__Group_2_7_1_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: rule__LetExpression__Group_2_7_1_3__0__Impl : ( ruleCOA ) ;
    public final void rule__LetExpression__Group_2_7_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:1: ( ( ruleCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: ( ruleCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: ( ruleCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3183:1: ruleCOA
            {
             before(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_7_1_3_0()); 
            pushFollow(FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_7_1_3__0__Impl6441);
            ruleCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_7_1_3_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1_3__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7_1_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: rule__LetExpression__Group_2_7_1_3__1 : rule__LetExpression__Group_2_7_1_3__1__Impl ;
    public final void rule__LetExpression__Group_2_7_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: ( rule__LetExpression__Group_2_7_1_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:2: rule__LetExpression__Group_2_7_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1_3__1__Impl_in_rule__LetExpression__Group_2_7_1_3__16470);
            rule__LetExpression__Group_2_7_1_3__1__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1_3__1"


    // $ANTLR start "rule__LetExpression__Group_2_7_1_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: rule__LetExpression__Group_2_7_1_3__1__Impl : ( ( ( rule__LetExpression__Group_2_7_1_3_1__0 ) ) ( ( rule__LetExpression__Group_2_7_1_3_1__0 )* ) ) ;
    public final void rule__LetExpression__Group_2_7_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( ( ( ( rule__LetExpression__Group_2_7_1_3_1__0 ) ) ( ( rule__LetExpression__Group_2_7_1_3_1__0 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: ( ( ( rule__LetExpression__Group_2_7_1_3_1__0 ) ) ( ( rule__LetExpression__Group_2_7_1_3_1__0 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: ( ( ( rule__LetExpression__Group_2_7_1_3_1__0 ) ) ( ( rule__LetExpression__Group_2_7_1_3_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:1: ( ( rule__LetExpression__Group_2_7_1_3_1__0 ) ) ( ( rule__LetExpression__Group_2_7_1_3_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:1: ( ( rule__LetExpression__Group_2_7_1_3_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3212:1: ( rule__LetExpression__Group_2_7_1_3_1__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_2_7_1_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: ( rule__LetExpression__Group_2_7_1_3_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:2: rule__LetExpression__Group_2_7_1_3_1__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1_3_1__0_in_rule__LetExpression__Group_2_7_1_3__1__Impl6499);
            rule__LetExpression__Group_2_7_1_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_2_7_1_3_1()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: ( ( rule__LetExpression__Group_2_7_1_3_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:1: ( rule__LetExpression__Group_2_7_1_3_1__0 )*
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_2_7_1_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( rule__LetExpression__Group_2_7_1_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:2: rule__LetExpression__Group_2_7_1_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1_3_1__0_in_rule__LetExpression__Group_2_7_1_3__1__Impl6511);
            	    rule__LetExpression__Group_2_7_1_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getLetExpressionAccess().getGroup_2_7_1_3_1()); 

            }


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
    // $ANTLR end "rule__LetExpression__Group_2_7_1_3__1__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7_1_3_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3233:1: rule__LetExpression__Group_2_7_1_3_1__0 : rule__LetExpression__Group_2_7_1_3_1__0__Impl rule__LetExpression__Group_2_7_1_3_1__1 ;
    public final void rule__LetExpression__Group_2_7_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ( rule__LetExpression__Group_2_7_1_3_1__0__Impl rule__LetExpression__Group_2_7_1_3_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:2: rule__LetExpression__Group_2_7_1_3_1__0__Impl rule__LetExpression__Group_2_7_1_3_1__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1_3_1__0__Impl_in_rule__LetExpression__Group_2_7_1_3_1__06548);
            rule__LetExpression__Group_2_7_1_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1_3_1__1_in_rule__LetExpression__Group_2_7_1_3_1__06551);
            rule__LetExpression__Group_2_7_1_3_1__1();

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1_3_1__0"


    // $ANTLR start "rule__LetExpression__Group_2_7_1_3_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:1: rule__LetExpression__Group_2_7_1_3_1__0__Impl : ( ',' ) ;
    public final void rule__LetExpression__Group_2_7_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ','
            {
             before(grammarAccess.getLetExpressionAccess().getCommaKeyword_2_7_1_3_1_0()); 
            match(input,27,FOLLOW_27_in_rule__LetExpression__Group_2_7_1_3_1__0__Impl6579); 
             after(grammarAccess.getLetExpressionAccess().getCommaKeyword_2_7_1_3_1_0()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1_3_1__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_2_7_1_3_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: rule__LetExpression__Group_2_7_1_3_1__1 : rule__LetExpression__Group_2_7_1_3_1__1__Impl ;
    public final void rule__LetExpression__Group_2_7_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:1: ( rule__LetExpression__Group_2_7_1_3_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:2: rule__LetExpression__Group_2_7_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_2_7_1_3_1__1__Impl_in_rule__LetExpression__Group_2_7_1_3_1__16610);
            rule__LetExpression__Group_2_7_1_3_1__1__Impl();

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1_3_1__1"


    // $ANTLR start "rule__LetExpression__Group_2_7_1_3_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3275:1: rule__LetExpression__Group_2_7_1_3_1__1__Impl : ( ruleCOA ) ;
    public final void rule__LetExpression__Group_2_7_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: ( ( ruleCOA ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( ruleCOA )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( ruleCOA )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ruleCOA
            {
             before(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_7_1_3_1_1()); 
            pushFollow(FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_7_1_3_1__1__Impl6637);
            ruleCOA();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getCOAParserRuleCall_2_7_1_3_1_1()); 

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
    // $ANTLR end "rule__LetExpression__Group_2_7_1_3_1__1__Impl"


    // $ANTLR start "rule__AttributeContext__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:1: rule__AttributeContext__Group__0 : rule__AttributeContext__Group__0__Impl rule__AttributeContext__Group__1 ;
    public final void rule__AttributeContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:1: ( rule__AttributeContext__Group__0__Impl rule__AttributeContext__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3301:2: rule__AttributeContext__Group__0__Impl rule__AttributeContext__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeContext__Group__0__Impl_in_rule__AttributeContext__Group__06670);
            rule__AttributeContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeContext__Group__1_in_rule__AttributeContext__Group__06673);
            rule__AttributeContext__Group__1();

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
    // $ANTLR end "rule__AttributeContext__Group__0"


    // $ANTLR start "rule__AttributeContext__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:1: rule__AttributeContext__Group__0__Impl : ( ruleClassifierContext ) ;
    public final void rule__AttributeContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: ( ( ruleClassifierContext ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( ruleClassifierContext )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( ruleClassifierContext )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ruleClassifierContext
            {
             before(grammarAccess.getAttributeContextAccess().getClassifierContextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassifierContext_in_rule__AttributeContext__Group__0__Impl6700);
            ruleClassifierContext();

            state._fsp--;

             after(grammarAccess.getAttributeContextAccess().getClassifierContextParserRuleCall_0()); 

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
    // $ANTLR end "rule__AttributeContext__Group__0__Impl"


    // $ANTLR start "rule__AttributeContext__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3325:1: rule__AttributeContext__Group__1 : rule__AttributeContext__Group__1__Impl rule__AttributeContext__Group__2 ;
    public final void rule__AttributeContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:1: ( rule__AttributeContext__Group__1__Impl rule__AttributeContext__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:2: rule__AttributeContext__Group__1__Impl rule__AttributeContext__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeContext__Group__1__Impl_in_rule__AttributeContext__Group__16729);
            rule__AttributeContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeContext__Group__2_in_rule__AttributeContext__Group__16732);
            rule__AttributeContext__Group__2();

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
    // $ANTLR end "rule__AttributeContext__Group__1"


    // $ANTLR start "rule__AttributeContext__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:1: rule__AttributeContext__Group__1__Impl : ( '::' ) ;
    public final void rule__AttributeContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: ( ( '::' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: ( '::' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: ( '::' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3343:1: '::'
            {
             before(grammarAccess.getAttributeContextAccess().getColonColonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__AttributeContext__Group__1__Impl6760); 
             after(grammarAccess.getAttributeContextAccess().getColonColonKeyword_1()); 

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
    // $ANTLR end "rule__AttributeContext__Group__1__Impl"


    // $ANTLR start "rule__AttributeContext__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: rule__AttributeContext__Group__2 : rule__AttributeContext__Group__2__Impl ;
    public final void rule__AttributeContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:1: ( rule__AttributeContext__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3361:2: rule__AttributeContext__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeContext__Group__2__Impl_in_rule__AttributeContext__Group__26791);
            rule__AttributeContext__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeContext__Group__2"


    // $ANTLR start "rule__AttributeContext__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: rule__AttributeContext__Group__2__Impl : ( ruleNameChar ) ;
    public final void rule__AttributeContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( ( ruleNameChar ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: ( ruleNameChar )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: ( ruleNameChar )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:1: ruleNameChar
            {
             before(grammarAccess.getAttributeContextAccess().getNameCharParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleNameChar_in_rule__AttributeContext__Group__2__Impl6818);
            ruleNameChar();

            state._fsp--;

             after(grammarAccess.getAttributeContextAccess().getNameCharParserRuleCall_2()); 

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
    // $ANTLR end "rule__AttributeContext__Group__2__Impl"


    // $ANTLR start "rule__LetVarNameArray__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: rule__LetVarNameArray__Group__0 : rule__LetVarNameArray__Group__0__Impl rule__LetVarNameArray__Group__1 ;
    public final void rule__LetVarNameArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3394:1: ( rule__LetVarNameArray__Group__0__Impl rule__LetVarNameArray__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:2: rule__LetVarNameArray__Group__0__Impl rule__LetVarNameArray__Group__1
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group__0__Impl_in_rule__LetVarNameArray__Group__06853);
            rule__LetVarNameArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetVarNameArray__Group__1_in_rule__LetVarNameArray__Group__06856);
            rule__LetVarNameArray__Group__1();

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
    // $ANTLR end "rule__LetVarNameArray__Group__0"


    // $ANTLR start "rule__LetVarNameArray__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:1: rule__LetVarNameArray__Group__0__Impl : ( '{' ) ;
    public final void rule__LetVarNameArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:1: '{'
            {
             before(grammarAccess.getLetVarNameArrayAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__LetVarNameArray__Group__0__Impl6884); 
             after(grammarAccess.getLetVarNameArrayAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__LetVarNameArray__Group__0__Impl"


    // $ANTLR start "rule__LetVarNameArray__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:1: rule__LetVarNameArray__Group__1 : rule__LetVarNameArray__Group__1__Impl rule__LetVarNameArray__Group__2 ;
    public final void rule__LetVarNameArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3425:1: ( rule__LetVarNameArray__Group__1__Impl rule__LetVarNameArray__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3426:2: rule__LetVarNameArray__Group__1__Impl rule__LetVarNameArray__Group__2
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group__1__Impl_in_rule__LetVarNameArray__Group__16915);
            rule__LetVarNameArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetVarNameArray__Group__2_in_rule__LetVarNameArray__Group__16918);
            rule__LetVarNameArray__Group__2();

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
    // $ANTLR end "rule__LetVarNameArray__Group__1"


    // $ANTLR start "rule__LetVarNameArray__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:1: rule__LetVarNameArray__Group__1__Impl : ( ( rule__LetVarNameArray__Group_1__0 ) ) ;
    public final void rule__LetVarNameArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3437:1: ( ( ( rule__LetVarNameArray__Group_1__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: ( ( rule__LetVarNameArray__Group_1__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: ( ( rule__LetVarNameArray__Group_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: ( rule__LetVarNameArray__Group_1__0 )
            {
             before(grammarAccess.getLetVarNameArrayAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: ( rule__LetVarNameArray__Group_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:2: rule__LetVarNameArray__Group_1__0
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group_1__0_in_rule__LetVarNameArray__Group__1__Impl6945);
            rule__LetVarNameArray__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLetVarNameArrayAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LetVarNameArray__Group__1__Impl"


    // $ANTLR start "rule__LetVarNameArray__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: rule__LetVarNameArray__Group__2 : rule__LetVarNameArray__Group__2__Impl ;
    public final void rule__LetVarNameArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3454:1: ( rule__LetVarNameArray__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:2: rule__LetVarNameArray__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group__2__Impl_in_rule__LetVarNameArray__Group__26975);
            rule__LetVarNameArray__Group__2__Impl();

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
    // $ANTLR end "rule__LetVarNameArray__Group__2"


    // $ANTLR start "rule__LetVarNameArray__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:1: rule__LetVarNameArray__Group__2__Impl : ( '}' ) ;
    public final void rule__LetVarNameArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3465:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3466:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3466:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: '}'
            {
             before(grammarAccess.getLetVarNameArrayAccess().getRightCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__LetVarNameArray__Group__2__Impl7003); 
             after(grammarAccess.getLetVarNameArrayAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__LetVarNameArray__Group__2__Impl"


    // $ANTLR start "rule__LetVarNameArray__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:1: rule__LetVarNameArray__Group_1__0 : rule__LetVarNameArray__Group_1__0__Impl rule__LetVarNameArray__Group_1__1 ;
    public final void rule__LetVarNameArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:1: ( rule__LetVarNameArray__Group_1__0__Impl rule__LetVarNameArray__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3491:2: rule__LetVarNameArray__Group_1__0__Impl rule__LetVarNameArray__Group_1__1
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group_1__0__Impl_in_rule__LetVarNameArray__Group_1__07040);
            rule__LetVarNameArray__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetVarNameArray__Group_1__1_in_rule__LetVarNameArray__Group_1__07043);
            rule__LetVarNameArray__Group_1__1();

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
    // $ANTLR end "rule__LetVarNameArray__Group_1__0"


    // $ANTLR start "rule__LetVarNameArray__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: rule__LetVarNameArray__Group_1__0__Impl : ( ruleletVarName ) ;
    public final void rule__LetVarNameArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3502:1: ( ( ruleletVarName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3503:1: ( ruleletVarName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3503:1: ( ruleletVarName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:1: ruleletVarName
            {
             before(grammarAccess.getLetVarNameArrayAccess().getLetVarNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleletVarName_in_rule__LetVarNameArray__Group_1__0__Impl7070);
            ruleletVarName();

            state._fsp--;

             after(grammarAccess.getLetVarNameArrayAccess().getLetVarNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LetVarNameArray__Group_1__0__Impl"


    // $ANTLR start "rule__LetVarNameArray__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3515:1: rule__LetVarNameArray__Group_1__1 : rule__LetVarNameArray__Group_1__1__Impl ;
    public final void rule__LetVarNameArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3519:1: ( rule__LetVarNameArray__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3520:2: rule__LetVarNameArray__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group_1__1__Impl_in_rule__LetVarNameArray__Group_1__17099);
            rule__LetVarNameArray__Group_1__1__Impl();

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
    // $ANTLR end "rule__LetVarNameArray__Group_1__1"


    // $ANTLR start "rule__LetVarNameArray__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3526:1: rule__LetVarNameArray__Group_1__1__Impl : ( ( ( rule__LetVarNameArray__Group_1_1__0 ) ) ( ( rule__LetVarNameArray__Group_1_1__0 )* ) ) ;
    public final void rule__LetVarNameArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: ( ( ( ( rule__LetVarNameArray__Group_1_1__0 ) ) ( ( rule__LetVarNameArray__Group_1_1__0 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:1: ( ( ( rule__LetVarNameArray__Group_1_1__0 ) ) ( ( rule__LetVarNameArray__Group_1_1__0 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:1: ( ( ( rule__LetVarNameArray__Group_1_1__0 ) ) ( ( rule__LetVarNameArray__Group_1_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: ( ( rule__LetVarNameArray__Group_1_1__0 ) ) ( ( rule__LetVarNameArray__Group_1_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: ( ( rule__LetVarNameArray__Group_1_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3533:1: ( rule__LetVarNameArray__Group_1_1__0 )
            {
             before(grammarAccess.getLetVarNameArrayAccess().getGroup_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: ( rule__LetVarNameArray__Group_1_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:2: rule__LetVarNameArray__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group_1_1__0_in_rule__LetVarNameArray__Group_1__1__Impl7128);
            rule__LetVarNameArray__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLetVarNameArrayAccess().getGroup_1_1()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( ( rule__LetVarNameArray__Group_1_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: ( rule__LetVarNameArray__Group_1_1__0 )*
            {
             before(grammarAccess.getLetVarNameArrayAccess().getGroup_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: ( rule__LetVarNameArray__Group_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:2: rule__LetVarNameArray__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LetVarNameArray__Group_1_1__0_in_rule__LetVarNameArray__Group_1__1__Impl7140);
            	    rule__LetVarNameArray__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getLetVarNameArrayAccess().getGroup_1_1()); 

            }


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
    // $ANTLR end "rule__LetVarNameArray__Group_1__1__Impl"


    // $ANTLR start "rule__LetVarNameArray__Group_1_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: rule__LetVarNameArray__Group_1_1__0 : rule__LetVarNameArray__Group_1_1__0__Impl rule__LetVarNameArray__Group_1_1__1 ;
    public final void rule__LetVarNameArray__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: ( rule__LetVarNameArray__Group_1_1__0__Impl rule__LetVarNameArray__Group_1_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:2: rule__LetVarNameArray__Group_1_1__0__Impl rule__LetVarNameArray__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group_1_1__0__Impl_in_rule__LetVarNameArray__Group_1_1__07177);
            rule__LetVarNameArray__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetVarNameArray__Group_1_1__1_in_rule__LetVarNameArray__Group_1_1__07180);
            rule__LetVarNameArray__Group_1_1__1();

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
    // $ANTLR end "rule__LetVarNameArray__Group_1_1__0"


    // $ANTLR start "rule__LetVarNameArray__Group_1_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: rule__LetVarNameArray__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__LetVarNameArray__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ','
            {
             before(grammarAccess.getLetVarNameArrayAccess().getCommaKeyword_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__LetVarNameArray__Group_1_1__0__Impl7208); 
             after(grammarAccess.getLetVarNameArrayAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__LetVarNameArray__Group_1_1__0__Impl"


    // $ANTLR start "rule__LetVarNameArray__Group_1_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: rule__LetVarNameArray__Group_1_1__1 : rule__LetVarNameArray__Group_1_1__1__Impl ;
    public final void rule__LetVarNameArray__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:1: ( rule__LetVarNameArray__Group_1_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3590:2: rule__LetVarNameArray__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LetVarNameArray__Group_1_1__1__Impl_in_rule__LetVarNameArray__Group_1_1__17239);
            rule__LetVarNameArray__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__LetVarNameArray__Group_1_1__1"


    // $ANTLR start "rule__LetVarNameArray__Group_1_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: rule__LetVarNameArray__Group_1_1__1__Impl : ( ruleletVarName ) ;
    public final void rule__LetVarNameArray__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ( ( ruleletVarName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ruleletVarName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ruleletVarName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ruleletVarName
            {
             before(grammarAccess.getLetVarNameArrayAccess().getLetVarNameParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_ruleletVarName_in_rule__LetVarNameArray__Group_1_1__1__Impl7266);
            ruleletVarName();

            state._fsp--;

             after(grammarAccess.getLetVarNameArrayAccess().getLetVarNameParserRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__LetVarNameArray__Group_1_1__1__Impl"


    // $ANTLR start "rule__AspectDefinition__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: rule__AspectDefinition__Group__0 : rule__AspectDefinition__Group__0__Impl rule__AspectDefinition__Group__1 ;
    public final void rule__AspectDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:1: ( rule__AspectDefinition__Group__0__Impl rule__AspectDefinition__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3622:2: rule__AspectDefinition__Group__0__Impl rule__AspectDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__0__Impl_in_rule__AspectDefinition__Group__07299);
            rule__AspectDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AspectDefinition__Group__1_in_rule__AspectDefinition__Group__07302);
            rule__AspectDefinition__Group__1();

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
    // $ANTLR end "rule__AspectDefinition__Group__0"


    // $ANTLR start "rule__AspectDefinition__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: rule__AspectDefinition__Group__0__Impl : ( 'aspect' ) ;
    public final void rule__AspectDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( ( 'aspect' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: ( 'aspect' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: ( 'aspect' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:1: 'aspect'
            {
             before(grammarAccess.getAspectDefinitionAccess().getAspectKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__AspectDefinition__Group__0__Impl7330); 
             after(grammarAccess.getAspectDefinitionAccess().getAspectKeyword_0()); 

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
    // $ANTLR end "rule__AspectDefinition__Group__0__Impl"


    // $ANTLR start "rule__AspectDefinition__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: rule__AspectDefinition__Group__1 : rule__AspectDefinition__Group__1__Impl rule__AspectDefinition__Group__2 ;
    public final void rule__AspectDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:1: ( rule__AspectDefinition__Group__1__Impl rule__AspectDefinition__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3653:2: rule__AspectDefinition__Group__1__Impl rule__AspectDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__1__Impl_in_rule__AspectDefinition__Group__17361);
            rule__AspectDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AspectDefinition__Group__2_in_rule__AspectDefinition__Group__17364);
            rule__AspectDefinition__Group__2();

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
    // $ANTLR end "rule__AspectDefinition__Group__1"


    // $ANTLR start "rule__AspectDefinition__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: rule__AspectDefinition__Group__1__Impl : ( ruleAspectName ) ;
    public final void rule__AspectDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ( ( ruleAspectName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: ( ruleAspectName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: ( ruleAspectName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:1: ruleAspectName
            {
             before(grammarAccess.getAspectDefinitionAccess().getAspectNameParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleAspectName_in_rule__AspectDefinition__Group__1__Impl7391);
            ruleAspectName();

            state._fsp--;

             after(grammarAccess.getAspectDefinitionAccess().getAspectNameParserRuleCall_1()); 

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
    // $ANTLR end "rule__AspectDefinition__Group__1__Impl"


    // $ANTLR start "rule__AspectDefinition__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: rule__AspectDefinition__Group__2 : rule__AspectDefinition__Group__2__Impl rule__AspectDefinition__Group__3 ;
    public final void rule__AspectDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( rule__AspectDefinition__Group__2__Impl rule__AspectDefinition__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:2: rule__AspectDefinition__Group__2__Impl rule__AspectDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__2__Impl_in_rule__AspectDefinition__Group__27420);
            rule__AspectDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AspectDefinition__Group__3_in_rule__AspectDefinition__Group__27423);
            rule__AspectDefinition__Group__3();

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
    // $ANTLR end "rule__AspectDefinition__Group__2"


    // $ANTLR start "rule__AspectDefinition__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: rule__AspectDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__AspectDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: '{'
            {
             before(grammarAccess.getAspectDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__AspectDefinition__Group__2__Impl7451); 
             after(grammarAccess.getAspectDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AspectDefinition__Group__2__Impl"


    // $ANTLR start "rule__AspectDefinition__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: rule__AspectDefinition__Group__3 : rule__AspectDefinition__Group__3__Impl rule__AspectDefinition__Group__4 ;
    public final void rule__AspectDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:1: ( rule__AspectDefinition__Group__3__Impl rule__AspectDefinition__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3713:2: rule__AspectDefinition__Group__3__Impl rule__AspectDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__3__Impl_in_rule__AspectDefinition__Group__37482);
            rule__AspectDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AspectDefinition__Group__4_in_rule__AspectDefinition__Group__37485);
            rule__AspectDefinition__Group__4();

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
    // $ANTLR end "rule__AspectDefinition__Group__3"


    // $ANTLR start "rule__AspectDefinition__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:1: rule__AspectDefinition__Group__3__Impl : ( ( rule__AspectDefinition__MappingdeclarartionAssignment_3 ) ) ;
    public final void rule__AspectDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ( ( ( rule__AspectDefinition__MappingdeclarartionAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: ( ( rule__AspectDefinition__MappingdeclarartionAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: ( ( rule__AspectDefinition__MappingdeclarartionAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:1: ( rule__AspectDefinition__MappingdeclarartionAssignment_3 )
            {
             before(grammarAccess.getAspectDefinitionAccess().getMappingdeclarartionAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3727:1: ( rule__AspectDefinition__MappingdeclarartionAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3727:2: rule__AspectDefinition__MappingdeclarartionAssignment_3
            {
            pushFollow(FOLLOW_rule__AspectDefinition__MappingdeclarartionAssignment_3_in_rule__AspectDefinition__Group__3__Impl7512);
            rule__AspectDefinition__MappingdeclarartionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAspectDefinitionAccess().getMappingdeclarartionAssignment_3()); 

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
    // $ANTLR end "rule__AspectDefinition__Group__3__Impl"


    // $ANTLR start "rule__AspectDefinition__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: rule__AspectDefinition__Group__4 : rule__AspectDefinition__Group__4__Impl rule__AspectDefinition__Group__5 ;
    public final void rule__AspectDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:1: ( rule__AspectDefinition__Group__4__Impl rule__AspectDefinition__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:2: rule__AspectDefinition__Group__4__Impl rule__AspectDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__4__Impl_in_rule__AspectDefinition__Group__47542);
            rule__AspectDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AspectDefinition__Group__5_in_rule__AspectDefinition__Group__47545);
            rule__AspectDefinition__Group__5();

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
    // $ANTLR end "rule__AspectDefinition__Group__4"


    // $ANTLR start "rule__AspectDefinition__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:1: rule__AspectDefinition__Group__4__Impl : ( ( rule__AspectDefinition__PointcutdeclarationAssignment_4 ) ) ;
    public final void rule__AspectDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3753:1: ( ( ( rule__AspectDefinition__PointcutdeclarationAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ( ( rule__AspectDefinition__PointcutdeclarationAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ( ( rule__AspectDefinition__PointcutdeclarationAssignment_4 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( rule__AspectDefinition__PointcutdeclarationAssignment_4 )
            {
             before(grammarAccess.getAspectDefinitionAccess().getPointcutdeclarationAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( rule__AspectDefinition__PointcutdeclarationAssignment_4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:2: rule__AspectDefinition__PointcutdeclarationAssignment_4
            {
            pushFollow(FOLLOW_rule__AspectDefinition__PointcutdeclarationAssignment_4_in_rule__AspectDefinition__Group__4__Impl7572);
            rule__AspectDefinition__PointcutdeclarationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAspectDefinitionAccess().getPointcutdeclarationAssignment_4()); 

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
    // $ANTLR end "rule__AspectDefinition__Group__4__Impl"


    // $ANTLR start "rule__AspectDefinition__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: rule__AspectDefinition__Group__5 : rule__AspectDefinition__Group__5__Impl rule__AspectDefinition__Group__6 ;
    public final void rule__AspectDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( rule__AspectDefinition__Group__5__Impl rule__AspectDefinition__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:2: rule__AspectDefinition__Group__5__Impl rule__AspectDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__5__Impl_in_rule__AspectDefinition__Group__57602);
            rule__AspectDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AspectDefinition__Group__6_in_rule__AspectDefinition__Group__57605);
            rule__AspectDefinition__Group__6();

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
    // $ANTLR end "rule__AspectDefinition__Group__5"


    // $ANTLR start "rule__AspectDefinition__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: rule__AspectDefinition__Group__5__Impl : ( ruleContextDeclaration ) ;
    public final void rule__AspectDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: ( ( ruleContextDeclaration ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( ruleContextDeclaration )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( ruleContextDeclaration )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: ruleContextDeclaration
            {
             before(grammarAccess.getAspectDefinitionAccess().getContextDeclarationParserRuleCall_5()); 
            pushFollow(FOLLOW_ruleContextDeclaration_in_rule__AspectDefinition__Group__5__Impl7632);
            ruleContextDeclaration();

            state._fsp--;

             after(grammarAccess.getAspectDefinitionAccess().getContextDeclarationParserRuleCall_5()); 

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
    // $ANTLR end "rule__AspectDefinition__Group__5__Impl"


    // $ANTLR start "rule__AspectDefinition__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: rule__AspectDefinition__Group__6 : rule__AspectDefinition__Group__6__Impl rule__AspectDefinition__Group__7 ;
    public final void rule__AspectDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:1: ( rule__AspectDefinition__Group__6__Impl rule__AspectDefinition__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:2: rule__AspectDefinition__Group__6__Impl rule__AspectDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__6__Impl_in_rule__AspectDefinition__Group__67661);
            rule__AspectDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AspectDefinition__Group__7_in_rule__AspectDefinition__Group__67664);
            rule__AspectDefinition__Group__7();

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
    // $ANTLR end "rule__AspectDefinition__Group__6"


    // $ANTLR start "rule__AspectDefinition__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:1: rule__AspectDefinition__Group__6__Impl : ( ( ruleQueryDeclaration )? ) ;
    public final void rule__AspectDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: ( ( ( ruleQueryDeclaration )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3812:1: ( ( ruleQueryDeclaration )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3812:1: ( ( ruleQueryDeclaration )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3813:1: ( ruleQueryDeclaration )?
            {
             before(grammarAccess.getAspectDefinitionAccess().getQueryDeclarationParserRuleCall_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3814:1: ( ruleQueryDeclaration )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=16 && LA17_0<=18)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3814:3: ruleQueryDeclaration
                    {
                    pushFollow(FOLLOW_ruleQueryDeclaration_in_rule__AspectDefinition__Group__6__Impl7692);
                    ruleQueryDeclaration();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAspectDefinitionAccess().getQueryDeclarationParserRuleCall_6()); 

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
    // $ANTLR end "rule__AspectDefinition__Group__6__Impl"


    // $ANTLR start "rule__AspectDefinition__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3824:1: rule__AspectDefinition__Group__7 : rule__AspectDefinition__Group__7__Impl rule__AspectDefinition__Group__8 ;
    public final void rule__AspectDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:1: ( rule__AspectDefinition__Group__7__Impl rule__AspectDefinition__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:2: rule__AspectDefinition__Group__7__Impl rule__AspectDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__7__Impl_in_rule__AspectDefinition__Group__77723);
            rule__AspectDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AspectDefinition__Group__8_in_rule__AspectDefinition__Group__77726);
            rule__AspectDefinition__Group__8();

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
    // $ANTLR end "rule__AspectDefinition__Group__7"


    // $ANTLR start "rule__AspectDefinition__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3836:1: rule__AspectDefinition__Group__7__Impl : ( ( rule__AspectDefinition__AIDeclarationAssignment_7 ) ) ;
    public final void rule__AspectDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:1: ( ( ( rule__AspectDefinition__AIDeclarationAssignment_7 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: ( ( rule__AspectDefinition__AIDeclarationAssignment_7 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: ( ( rule__AspectDefinition__AIDeclarationAssignment_7 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3842:1: ( rule__AspectDefinition__AIDeclarationAssignment_7 )
            {
             before(grammarAccess.getAspectDefinitionAccess().getAIDeclarationAssignment_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: ( rule__AspectDefinition__AIDeclarationAssignment_7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:2: rule__AspectDefinition__AIDeclarationAssignment_7
            {
            pushFollow(FOLLOW_rule__AspectDefinition__AIDeclarationAssignment_7_in_rule__AspectDefinition__Group__7__Impl7753);
            rule__AspectDefinition__AIDeclarationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAspectDefinitionAccess().getAIDeclarationAssignment_7()); 

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
    // $ANTLR end "rule__AspectDefinition__Group__7__Impl"


    // $ANTLR start "rule__AspectDefinition__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:1: rule__AspectDefinition__Group__8 : rule__AspectDefinition__Group__8__Impl ;
    public final void rule__AspectDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: ( rule__AspectDefinition__Group__8__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:2: rule__AspectDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__AspectDefinition__Group__8__Impl_in_rule__AspectDefinition__Group__87783);
            rule__AspectDefinition__Group__8__Impl();

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
    // $ANTLR end "rule__AspectDefinition__Group__8"


    // $ANTLR start "rule__AspectDefinition__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: rule__AspectDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__AspectDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3870:1: '}'
            {
             before(grammarAccess.getAspectDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__AspectDefinition__Group__8__Impl7811); 
             after(grammarAccess.getAspectDefinitionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__AspectDefinition__Group__8__Impl"


    // $ANTLR start "rule__Mapping_Declaration__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: rule__Mapping_Declaration__Group__0 : rule__Mapping_Declaration__Group__0__Impl rule__Mapping_Declaration__Group__1 ;
    public final void rule__Mapping_Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3905:1: ( rule__Mapping_Declaration__Group__0__Impl rule__Mapping_Declaration__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:2: rule__Mapping_Declaration__Group__0__Impl rule__Mapping_Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping_Declaration__Group__0__Impl_in_rule__Mapping_Declaration__Group__07860);
            rule__Mapping_Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping_Declaration__Group__1_in_rule__Mapping_Declaration__Group__07863);
            rule__Mapping_Declaration__Group__1();

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
    // $ANTLR end "rule__Mapping_Declaration__Group__0"


    // $ANTLR start "rule__Mapping_Declaration__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: rule__Mapping_Declaration__Group__0__Impl : ( 'import_mapping' ) ;
    public final void rule__Mapping_Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: ( ( 'import_mapping' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: ( 'import_mapping' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: ( 'import_mapping' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3919:1: 'import_mapping'
            {
             before(grammarAccess.getMapping_DeclarationAccess().getImport_mappingKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Mapping_Declaration__Group__0__Impl7891); 
             after(grammarAccess.getMapping_DeclarationAccess().getImport_mappingKeyword_0()); 

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
    // $ANTLR end "rule__Mapping_Declaration__Group__0__Impl"


    // $ANTLR start "rule__Mapping_Declaration__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: rule__Mapping_Declaration__Group__1 : rule__Mapping_Declaration__Group__1__Impl ;
    public final void rule__Mapping_Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3936:1: ( rule__Mapping_Declaration__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:2: rule__Mapping_Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mapping_Declaration__Group__1__Impl_in_rule__Mapping_Declaration__Group__17922);
            rule__Mapping_Declaration__Group__1__Impl();

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
    // $ANTLR end "rule__Mapping_Declaration__Group__1"


    // $ANTLR start "rule__Mapping_Declaration__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3943:1: rule__Mapping_Declaration__Group__1__Impl : ( ( rule__Mapping_Declaration__Reference_mappingnameAssignment_1 ) ) ;
    public final void rule__Mapping_Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:1: ( ( ( rule__Mapping_Declaration__Reference_mappingnameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: ( ( rule__Mapping_Declaration__Reference_mappingnameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: ( ( rule__Mapping_Declaration__Reference_mappingnameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3949:1: ( rule__Mapping_Declaration__Reference_mappingnameAssignment_1 )
            {
             before(grammarAccess.getMapping_DeclarationAccess().getReference_mappingnameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3950:1: ( rule__Mapping_Declaration__Reference_mappingnameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3950:2: rule__Mapping_Declaration__Reference_mappingnameAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping_Declaration__Reference_mappingnameAssignment_1_in_rule__Mapping_Declaration__Group__1__Impl7949);
            rule__Mapping_Declaration__Reference_mappingnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapping_DeclarationAccess().getReference_mappingnameAssignment_1()); 

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
    // $ANTLR end "rule__Mapping_Declaration__Group__1__Impl"


    // $ANTLR start "rule__Pointcut_Declaration__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: rule__Pointcut_Declaration__Group__0 : rule__Pointcut_Declaration__Group__0__Impl rule__Pointcut_Declaration__Group__1 ;
    public final void rule__Pointcut_Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3968:1: ( rule__Pointcut_Declaration__Group__0__Impl rule__Pointcut_Declaration__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3969:2: rule__Pointcut_Declaration__Group__0__Impl rule__Pointcut_Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Pointcut_Declaration__Group__0__Impl_in_rule__Pointcut_Declaration__Group__07983);
            rule__Pointcut_Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pointcut_Declaration__Group__1_in_rule__Pointcut_Declaration__Group__07986);
            rule__Pointcut_Declaration__Group__1();

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
    // $ANTLR end "rule__Pointcut_Declaration__Group__0"


    // $ANTLR start "rule__Pointcut_Declaration__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3976:1: rule__Pointcut_Declaration__Group__0__Impl : ( 'pointcut' ) ;
    public final void rule__Pointcut_Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3980:1: ( ( 'pointcut' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:1: ( 'pointcut' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:1: ( 'pointcut' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: 'pointcut'
            {
             before(grammarAccess.getPointcut_DeclarationAccess().getPointcutKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Pointcut_Declaration__Group__0__Impl8014); 
             after(grammarAccess.getPointcut_DeclarationAccess().getPointcutKeyword_0()); 

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
    // $ANTLR end "rule__Pointcut_Declaration__Group__0__Impl"


    // $ANTLR start "rule__Pointcut_Declaration__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:1: rule__Pointcut_Declaration__Group__1 : rule__Pointcut_Declaration__Group__1__Impl ;
    public final void rule__Pointcut_Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3999:1: ( rule__Pointcut_Declaration__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4000:2: rule__Pointcut_Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Pointcut_Declaration__Group__1__Impl_in_rule__Pointcut_Declaration__Group__18045);
            rule__Pointcut_Declaration__Group__1__Impl();

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
    // $ANTLR end "rule__Pointcut_Declaration__Group__1"


    // $ANTLR start "rule__Pointcut_Declaration__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: rule__Pointcut_Declaration__Group__1__Impl : ( ( rule__Pointcut_Declaration__NameAssignment_1 ) ) ;
    public final void rule__Pointcut_Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4010:1: ( ( ( rule__Pointcut_Declaration__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: ( ( rule__Pointcut_Declaration__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: ( ( rule__Pointcut_Declaration__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4012:1: ( rule__Pointcut_Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getPointcut_DeclarationAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:1: ( rule__Pointcut_Declaration__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:2: rule__Pointcut_Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Pointcut_Declaration__NameAssignment_1_in_rule__Pointcut_Declaration__Group__1__Impl8072);
            rule__Pointcut_Declaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointcut_DeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Pointcut_Declaration__Group__1__Impl"


    // $ANTLR start "rule__ContextDeclaration__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4027:1: rule__ContextDeclaration__Group__0 : rule__ContextDeclaration__Group__0__Impl rule__ContextDeclaration__Group__1 ;
    public final void rule__ContextDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4031:1: ( rule__ContextDeclaration__Group__0__Impl rule__ContextDeclaration__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:2: rule__ContextDeclaration__Group__0__Impl rule__ContextDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ContextDeclaration__Group__0__Impl_in_rule__ContextDeclaration__Group__08106);
            rule__ContextDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextDeclaration__Group__1_in_rule__ContextDeclaration__Group__08109);
            rule__ContextDeclaration__Group__1();

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
    // $ANTLR end "rule__ContextDeclaration__Group__0"


    // $ANTLR start "rule__ContextDeclaration__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: rule__ContextDeclaration__Group__0__Impl : ( 'context' ) ;
    public final void rule__ContextDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4043:1: ( ( 'context' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4044:1: ( 'context' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4044:1: ( 'context' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4045:1: 'context'
            {
             before(grammarAccess.getContextDeclarationAccess().getContextKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ContextDeclaration__Group__0__Impl8137); 
             after(grammarAccess.getContextDeclarationAccess().getContextKeyword_0()); 

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
    // $ANTLR end "rule__ContextDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ContextDeclaration__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4058:1: rule__ContextDeclaration__Group__1 : rule__ContextDeclaration__Group__1__Impl ;
    public final void rule__ContextDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:1: ( rule__ContextDeclaration__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:2: rule__ContextDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextDeclaration__Group__1__Impl_in_rule__ContextDeclaration__Group__18168);
            rule__ContextDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__ContextDeclaration__Group__1"


    // $ANTLR start "rule__ContextDeclaration__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4069:1: rule__ContextDeclaration__Group__1__Impl : ( ( rule__ContextDeclaration__Alternatives_1 ) ) ;
    public final void rule__ContextDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: ( ( ( rule__ContextDeclaration__Alternatives_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4074:1: ( ( rule__ContextDeclaration__Alternatives_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4074:1: ( ( rule__ContextDeclaration__Alternatives_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:1: ( rule__ContextDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getContextDeclarationAccess().getAlternatives_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4076:1: ( rule__ContextDeclaration__Alternatives_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4076:2: rule__ContextDeclaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ContextDeclaration__Alternatives_1_in_rule__ContextDeclaration__Group__1__Impl8195);
            rule__ContextDeclaration__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getContextDeclarationAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__ContextDeclaration__Group__1__Impl"


    // $ANTLR start "rule__OperationContext__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: rule__OperationContext__Group__0 : rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1 ;
    public final void rule__OperationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:1: ( rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4095:2: rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1
            {
            pushFollow(FOLLOW_rule__OperationContext__Group__0__Impl_in_rule__OperationContext__Group__08229);
            rule__OperationContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationContext__Group__1_in_rule__OperationContext__Group__08232);
            rule__OperationContext__Group__1();

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
    // $ANTLR end "rule__OperationContext__Group__0"


    // $ANTLR start "rule__OperationContext__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: rule__OperationContext__Group__0__Impl : ( ruleClassifierContext ) ;
    public final void rule__OperationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( ( ruleClassifierContext ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: ( ruleClassifierContext )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: ( ruleClassifierContext )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ruleClassifierContext
            {
             before(grammarAccess.getOperationContextAccess().getClassifierContextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassifierContext_in_rule__OperationContext__Group__0__Impl8259);
            ruleClassifierContext();

            state._fsp--;

             after(grammarAccess.getOperationContextAccess().getClassifierContextParserRuleCall_0()); 

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
    // $ANTLR end "rule__OperationContext__Group__0__Impl"


    // $ANTLR start "rule__OperationContext__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: rule__OperationContext__Group__1 : rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2 ;
    public final void rule__OperationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:2: rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2
            {
            pushFollow(FOLLOW_rule__OperationContext__Group__1__Impl_in_rule__OperationContext__Group__18288);
            rule__OperationContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationContext__Group__2_in_rule__OperationContext__Group__18291);
            rule__OperationContext__Group__2();

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
    // $ANTLR end "rule__OperationContext__Group__1"


    // $ANTLR start "rule__OperationContext__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: rule__OperationContext__Group__1__Impl : ( '::' ) ;
    public final void rule__OperationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:1: ( ( '::' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: ( '::' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: ( '::' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: '::'
            {
             before(grammarAccess.getOperationContextAccess().getColonColonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__OperationContext__Group__1__Impl8319); 
             after(grammarAccess.getOperationContextAccess().getColonColonKeyword_1()); 

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
    // $ANTLR end "rule__OperationContext__Group__1__Impl"


    // $ANTLR start "rule__OperationContext__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: rule__OperationContext__Group__2 : rule__OperationContext__Group__2__Impl rule__OperationContext__Group__3 ;
    public final void rule__OperationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:1: ( rule__OperationContext__Group__2__Impl rule__OperationContext__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:2: rule__OperationContext__Group__2__Impl rule__OperationContext__Group__3
            {
            pushFollow(FOLLOW_rule__OperationContext__Group__2__Impl_in_rule__OperationContext__Group__28350);
            rule__OperationContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationContext__Group__3_in_rule__OperationContext__Group__28353);
            rule__OperationContext__Group__3();

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
    // $ANTLR end "rule__OperationContext__Group__2"


    // $ANTLR start "rule__OperationContext__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:1: rule__OperationContext__Group__2__Impl : ( ruleOperationName ) ;
    public final void rule__OperationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: ( ( ruleOperationName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ( ruleOperationName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ( ruleOperationName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ruleOperationName
            {
             before(grammarAccess.getOperationContextAccess().getOperationNameParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleOperationName_in_rule__OperationContext__Group__2__Impl8380);
            ruleOperationName();

            state._fsp--;

             after(grammarAccess.getOperationContextAccess().getOperationNameParserRuleCall_2()); 

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
    // $ANTLR end "rule__OperationContext__Group__2__Impl"


    // $ANTLR start "rule__OperationContext__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4179:1: rule__OperationContext__Group__3 : rule__OperationContext__Group__3__Impl rule__OperationContext__Group__4 ;
    public final void rule__OperationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:1: ( rule__OperationContext__Group__3__Impl rule__OperationContext__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4184:2: rule__OperationContext__Group__3__Impl rule__OperationContext__Group__4
            {
            pushFollow(FOLLOW_rule__OperationContext__Group__3__Impl_in_rule__OperationContext__Group__38409);
            rule__OperationContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationContext__Group__4_in_rule__OperationContext__Group__38412);
            rule__OperationContext__Group__4();

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
    // $ANTLR end "rule__OperationContext__Group__3"


    // $ANTLR start "rule__OperationContext__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4191:1: rule__OperationContext__Group__3__Impl : ( '(' ) ;
    public final void rule__OperationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:1: '('
            {
             before(grammarAccess.getOperationContextAccess().getLeftParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__OperationContext__Group__3__Impl8440); 
             after(grammarAccess.getOperationContextAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__OperationContext__Group__3__Impl"


    // $ANTLR start "rule__OperationContext__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4210:1: rule__OperationContext__Group__4 : rule__OperationContext__Group__4__Impl rule__OperationContext__Group__5 ;
    public final void rule__OperationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( rule__OperationContext__Group__4__Impl rule__OperationContext__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:2: rule__OperationContext__Group__4__Impl rule__OperationContext__Group__5
            {
            pushFollow(FOLLOW_rule__OperationContext__Group__4__Impl_in_rule__OperationContext__Group__48471);
            rule__OperationContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationContext__Group__5_in_rule__OperationContext__Group__48474);
            rule__OperationContext__Group__5();

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
    // $ANTLR end "rule__OperationContext__Group__4"


    // $ANTLR start "rule__OperationContext__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:1: rule__OperationContext__Group__4__Impl : ( ( rule__OperationContext__Group_4__0 )? ) ;
    public final void rule__OperationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: ( ( ( rule__OperationContext__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: ( ( rule__OperationContext__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: ( ( rule__OperationContext__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4228:1: ( rule__OperationContext__Group_4__0 )?
            {
             before(grammarAccess.getOperationContextAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: ( rule__OperationContext__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:2: rule__OperationContext__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__OperationContext__Group_4__0_in_rule__OperationContext__Group__4__Impl8501);
                    rule__OperationContext__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationContextAccess().getGroup_4()); 

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
    // $ANTLR end "rule__OperationContext__Group__4__Impl"


    // $ANTLR start "rule__OperationContext__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4239:1: rule__OperationContext__Group__5 : rule__OperationContext__Group__5__Impl rule__OperationContext__Group__6 ;
    public final void rule__OperationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: ( rule__OperationContext__Group__5__Impl rule__OperationContext__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:2: rule__OperationContext__Group__5__Impl rule__OperationContext__Group__6
            {
            pushFollow(FOLLOW_rule__OperationContext__Group__5__Impl_in_rule__OperationContext__Group__58532);
            rule__OperationContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationContext__Group__6_in_rule__OperationContext__Group__58535);
            rule__OperationContext__Group__6();

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
    // $ANTLR end "rule__OperationContext__Group__5"


    // $ANTLR start "rule__OperationContext__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4251:1: rule__OperationContext__Group__5__Impl : ( ')' ) ;
    public final void rule__OperationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4255:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:1: ')'
            {
             before(grammarAccess.getOperationContextAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__OperationContext__Group__5__Impl8563); 
             after(grammarAccess.getOperationContextAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__OperationContext__Group__5__Impl"


    // $ANTLR start "rule__OperationContext__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: rule__OperationContext__Group__6 : rule__OperationContext__Group__6__Impl ;
    public final void rule__OperationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: ( rule__OperationContext__Group__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:2: rule__OperationContext__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__OperationContext__Group__6__Impl_in_rule__OperationContext__Group__68594);
            rule__OperationContext__Group__6__Impl();

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
    // $ANTLR end "rule__OperationContext__Group__6"


    // $ANTLR start "rule__OperationContext__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: rule__OperationContext__Group__6__Impl : ( ( rule__OperationContext__Group_6__0 )? ) ;
    public final void rule__OperationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4285:1: ( ( ( rule__OperationContext__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: ( ( rule__OperationContext__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: ( ( rule__OperationContext__Group_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: ( rule__OperationContext__Group_6__0 )?
            {
             before(grammarAccess.getOperationContextAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4288:1: ( rule__OperationContext__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4288:2: rule__OperationContext__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__OperationContext__Group_6__0_in_rule__OperationContext__Group__6__Impl8621);
                    rule__OperationContext__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationContextAccess().getGroup_6()); 

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
    // $ANTLR end "rule__OperationContext__Group__6__Impl"


    // $ANTLR start "rule__OperationContext__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: rule__OperationContext__Group_4__0 : rule__OperationContext__Group_4__0__Impl rule__OperationContext__Group_4__1 ;
    public final void rule__OperationContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:1: ( rule__OperationContext__Group_4__0__Impl rule__OperationContext__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:2: rule__OperationContext__Group_4__0__Impl rule__OperationContext__Group_4__1
            {
            pushFollow(FOLLOW_rule__OperationContext__Group_4__0__Impl_in_rule__OperationContext__Group_4__08666);
            rule__OperationContext__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationContext__Group_4__1_in_rule__OperationContext__Group_4__08669);
            rule__OperationContext__Group_4__1();

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
    // $ANTLR end "rule__OperationContext__Group_4__0"


    // $ANTLR start "rule__OperationContext__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4324:1: rule__OperationContext__Group_4__0__Impl : ( ruleArguments ) ;
    public final void rule__OperationContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:1: ( ( ruleArguments ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:1: ( ruleArguments )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:1: ( ruleArguments )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: ruleArguments
            {
             before(grammarAccess.getOperationContextAccess().getArgumentsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleArguments_in_rule__OperationContext__Group_4__0__Impl8696);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getOperationContextAccess().getArgumentsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__OperationContext__Group_4__0__Impl"


    // $ANTLR start "rule__OperationContext__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: rule__OperationContext__Group_4__1 : rule__OperationContext__Group_4__1__Impl ;
    public final void rule__OperationContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:1: ( rule__OperationContext__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4346:2: rule__OperationContext__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__OperationContext__Group_4__1__Impl_in_rule__OperationContext__Group_4__18725);
            rule__OperationContext__Group_4__1__Impl();

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
    // $ANTLR end "rule__OperationContext__Group_4__1"


    // $ANTLR start "rule__OperationContext__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4352:1: rule__OperationContext__Group_4__1__Impl : ( ( rule__OperationContext__Group_4_1__0 )* ) ;
    public final void rule__OperationContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4356:1: ( ( ( rule__OperationContext__Group_4_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4357:1: ( ( rule__OperationContext__Group_4_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4357:1: ( ( rule__OperationContext__Group_4_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( rule__OperationContext__Group_4_1__0 )*
            {
             before(grammarAccess.getOperationContextAccess().getGroup_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: ( rule__OperationContext__Group_4_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:2: rule__OperationContext__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OperationContext__Group_4_1__0_in_rule__OperationContext__Group_4__1__Impl8752);
            	    rule__OperationContext__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getOperationContextAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__OperationContext__Group_4__1__Impl"


    // $ANTLR start "rule__OperationContext__Group_4_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4373:1: rule__OperationContext__Group_4_1__0 : rule__OperationContext__Group_4_1__0__Impl rule__OperationContext__Group_4_1__1 ;
    public final void rule__OperationContext__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:1: ( rule__OperationContext__Group_4_1__0__Impl rule__OperationContext__Group_4_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4378:2: rule__OperationContext__Group_4_1__0__Impl rule__OperationContext__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__OperationContext__Group_4_1__0__Impl_in_rule__OperationContext__Group_4_1__08787);
            rule__OperationContext__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationContext__Group_4_1__1_in_rule__OperationContext__Group_4_1__08790);
            rule__OperationContext__Group_4_1__1();

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
    // $ANTLR end "rule__OperationContext__Group_4_1__0"


    // $ANTLR start "rule__OperationContext__Group_4_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: rule__OperationContext__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__OperationContext__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4389:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4390:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4390:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4391:1: ','
            {
             before(grammarAccess.getOperationContextAccess().getCommaKeyword_4_1_0()); 
            match(input,27,FOLLOW_27_in_rule__OperationContext__Group_4_1__0__Impl8818); 
             after(grammarAccess.getOperationContextAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__OperationContext__Group_4_1__0__Impl"


    // $ANTLR start "rule__OperationContext__Group_4_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: rule__OperationContext__Group_4_1__1 : rule__OperationContext__Group_4_1__1__Impl ;
    public final void rule__OperationContext__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4408:1: ( rule__OperationContext__Group_4_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4409:2: rule__OperationContext__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OperationContext__Group_4_1__1__Impl_in_rule__OperationContext__Group_4_1__18849);
            rule__OperationContext__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__OperationContext__Group_4_1__1"


    // $ANTLR start "rule__OperationContext__Group_4_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: rule__OperationContext__Group_4_1__1__Impl : ( ruleArguments ) ;
    public final void rule__OperationContext__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4419:1: ( ( ruleArguments ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: ( ruleArguments )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: ( ruleArguments )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4421:1: ruleArguments
            {
             before(grammarAccess.getOperationContextAccess().getArgumentsParserRuleCall_4_1_1()); 
            pushFollow(FOLLOW_ruleArguments_in_rule__OperationContext__Group_4_1__1__Impl8876);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getOperationContextAccess().getArgumentsParserRuleCall_4_1_1()); 

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
    // $ANTLR end "rule__OperationContext__Group_4_1__1__Impl"


    // $ANTLR start "rule__OperationContext__Group_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4436:1: rule__OperationContext__Group_6__0 : rule__OperationContext__Group_6__0__Impl rule__OperationContext__Group_6__1 ;
    public final void rule__OperationContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4440:1: ( rule__OperationContext__Group_6__0__Impl rule__OperationContext__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:2: rule__OperationContext__Group_6__0__Impl rule__OperationContext__Group_6__1
            {
            pushFollow(FOLLOW_rule__OperationContext__Group_6__0__Impl_in_rule__OperationContext__Group_6__08909);
            rule__OperationContext__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationContext__Group_6__1_in_rule__OperationContext__Group_6__08912);
            rule__OperationContext__Group_6__1();

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
    // $ANTLR end "rule__OperationContext__Group_6__0"


    // $ANTLR start "rule__OperationContext__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4448:1: rule__OperationContext__Group_6__0__Impl : ( ':' ) ;
    public final void rule__OperationContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4452:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ':'
            {
             before(grammarAccess.getOperationContextAccess().getColonKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__OperationContext__Group_6__0__Impl8940); 
             after(grammarAccess.getOperationContextAccess().getColonKeyword_6_0()); 

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
    // $ANTLR end "rule__OperationContext__Group_6__0__Impl"


    // $ANTLR start "rule__OperationContext__Group_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: rule__OperationContext__Group_6__1 : rule__OperationContext__Group_6__1__Impl ;
    public final void rule__OperationContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:1: ( rule__OperationContext__Group_6__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:2: rule__OperationContext__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__OperationContext__Group_6__1__Impl_in_rule__OperationContext__Group_6__18971);
            rule__OperationContext__Group_6__1__Impl();

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
    // $ANTLR end "rule__OperationContext__Group_6__1"


    // $ANTLR start "rule__OperationContext__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:1: rule__OperationContext__Group_6__1__Impl : ( ruleReturntype ) ;
    public final void rule__OperationContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4482:1: ( ( ruleReturntype ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ( ruleReturntype )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ( ruleReturntype )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: ruleReturntype
            {
             before(grammarAccess.getOperationContextAccess().getReturntypeParserRuleCall_6_1()); 
            pushFollow(FOLLOW_ruleReturntype_in_rule__OperationContext__Group_6__1__Impl8998);
            ruleReturntype();

            state._fsp--;

             after(grammarAccess.getOperationContextAccess().getReturntypeParserRuleCall_6_1()); 

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
    // $ANTLR end "rule__OperationContext__Group_6__1__Impl"


    // $ANTLR start "rule__Advice__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: rule__Advice__Group__0 : rule__Advice__Group__0__Impl rule__Advice__Group__1 ;
    public final void rule__Advice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4503:1: ( rule__Advice__Group__0__Impl rule__Advice__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:2: rule__Advice__Group__0__Impl rule__Advice__Group__1
            {
            pushFollow(FOLLOW_rule__Advice__Group__0__Impl_in_rule__Advice__Group__09031);
            rule__Advice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Advice__Group__1_in_rule__Advice__Group__09034);
            rule__Advice__Group__1();

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
    // $ANTLR end "rule__Advice__Group__0"


    // $ANTLR start "rule__Advice__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4511:1: rule__Advice__Group__0__Impl : ( ruleAdviceDeclaration ) ;
    public final void rule__Advice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4515:1: ( ( ruleAdviceDeclaration ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: ( ruleAdviceDeclaration )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: ( ruleAdviceDeclaration )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4517:1: ruleAdviceDeclaration
            {
             before(grammarAccess.getAdviceAccess().getAdviceDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAdviceDeclaration_in_rule__Advice__Group__0__Impl9061);
            ruleAdviceDeclaration();

            state._fsp--;

             after(grammarAccess.getAdviceAccess().getAdviceDeclarationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Advice__Group__0__Impl"


    // $ANTLR start "rule__Advice__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:1: rule__Advice__Group__1 : rule__Advice__Group__1__Impl rule__Advice__Group__2 ;
    public final void rule__Advice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: ( rule__Advice__Group__1__Impl rule__Advice__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:2: rule__Advice__Group__1__Impl rule__Advice__Group__2
            {
            pushFollow(FOLLOW_rule__Advice__Group__1__Impl_in_rule__Advice__Group__19090);
            rule__Advice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Advice__Group__2_in_rule__Advice__Group__19093);
            rule__Advice__Group__2();

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
    // $ANTLR end "rule__Advice__Group__1"


    // $ANTLR start "rule__Advice__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4540:1: rule__Advice__Group__1__Impl : ( ( rule__Advice__AdvicetypeAssignment_1 ) ) ;
    public final void rule__Advice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:1: ( ( ( rule__Advice__AdvicetypeAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4545:1: ( ( rule__Advice__AdvicetypeAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4545:1: ( ( rule__Advice__AdvicetypeAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4546:1: ( rule__Advice__AdvicetypeAssignment_1 )
            {
             before(grammarAccess.getAdviceAccess().getAdvicetypeAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4547:1: ( rule__Advice__AdvicetypeAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4547:2: rule__Advice__AdvicetypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Advice__AdvicetypeAssignment_1_in_rule__Advice__Group__1__Impl9120);
            rule__Advice__AdvicetypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAdviceAccess().getAdvicetypeAssignment_1()); 

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
    // $ANTLR end "rule__Advice__Group__1__Impl"


    // $ANTLR start "rule__Advice__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4557:1: rule__Advice__Group__2 : rule__Advice__Group__2__Impl ;
    public final void rule__Advice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4561:1: ( rule__Advice__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:2: rule__Advice__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Advice__Group__2__Impl_in_rule__Advice__Group__29150);
            rule__Advice__Group__2__Impl();

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
    // $ANTLR end "rule__Advice__Group__2"


    // $ANTLR start "rule__Advice__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: rule__Advice__Group__2__Impl : ( ( rule__Advice__IntroadvicequeryAssignment_2 ) ) ;
    public final void rule__Advice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4572:1: ( ( ( rule__Advice__IntroadvicequeryAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:1: ( ( rule__Advice__IntroadvicequeryAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:1: ( ( rule__Advice__IntroadvicequeryAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4574:1: ( rule__Advice__IntroadvicequeryAssignment_2 )
            {
             before(grammarAccess.getAdviceAccess().getIntroadvicequeryAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:1: ( rule__Advice__IntroadvicequeryAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:2: rule__Advice__IntroadvicequeryAssignment_2
            {
            pushFollow(FOLLOW_rule__Advice__IntroadvicequeryAssignment_2_in_rule__Advice__Group__2__Impl9177);
            rule__Advice__IntroadvicequeryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdviceAccess().getIntroadvicequeryAssignment_2()); 

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
    // $ANTLR end "rule__Advice__Group__2__Impl"


    // $ANTLR start "rule__AdviceDeclaration__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4591:1: rule__AdviceDeclaration__Group__0 : rule__AdviceDeclaration__Group__0__Impl rule__AdviceDeclaration__Group__1 ;
    public final void rule__AdviceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:1: ( rule__AdviceDeclaration__Group__0__Impl rule__AdviceDeclaration__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4596:2: rule__AdviceDeclaration__Group__0__Impl rule__AdviceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__AdviceDeclaration__Group__0__Impl_in_rule__AdviceDeclaration__Group__09213);
            rule__AdviceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdviceDeclaration__Group__1_in_rule__AdviceDeclaration__Group__09216);
            rule__AdviceDeclaration__Group__1();

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
    // $ANTLR end "rule__AdviceDeclaration__Group__0"


    // $ANTLR start "rule__AdviceDeclaration__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4603:1: rule__AdviceDeclaration__Group__0__Impl : ( 'advice' ) ;
    public final void rule__AdviceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4607:1: ( ( 'advice' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: ( 'advice' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: ( 'advice' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4609:1: 'advice'
            {
             before(grammarAccess.getAdviceDeclarationAccess().getAdviceKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__AdviceDeclaration__Group__0__Impl9244); 
             after(grammarAccess.getAdviceDeclarationAccess().getAdviceKeyword_0()); 

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
    // $ANTLR end "rule__AdviceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__AdviceDeclaration__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4622:1: rule__AdviceDeclaration__Group__1 : rule__AdviceDeclaration__Group__1__Impl rule__AdviceDeclaration__Group__2 ;
    public final void rule__AdviceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4626:1: ( rule__AdviceDeclaration__Group__1__Impl rule__AdviceDeclaration__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:2: rule__AdviceDeclaration__Group__1__Impl rule__AdviceDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__AdviceDeclaration__Group__1__Impl_in_rule__AdviceDeclaration__Group__19275);
            rule__AdviceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdviceDeclaration__Group__2_in_rule__AdviceDeclaration__Group__19278);
            rule__AdviceDeclaration__Group__2();

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
    // $ANTLR end "rule__AdviceDeclaration__Group__1"


    // $ANTLR start "rule__AdviceDeclaration__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:1: rule__AdviceDeclaration__Group__1__Impl : ( ruleQueryType ) ;
    public final void rule__AdviceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4638:1: ( ( ruleQueryType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4639:1: ( ruleQueryType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4639:1: ( ruleQueryType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4640:1: ruleQueryType
            {
             before(grammarAccess.getAdviceDeclarationAccess().getQueryTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleQueryType_in_rule__AdviceDeclaration__Group__1__Impl9305);
            ruleQueryType();

            state._fsp--;

             after(grammarAccess.getAdviceDeclarationAccess().getQueryTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AdviceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__AdviceDeclaration__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4651:1: rule__AdviceDeclaration__Group__2 : rule__AdviceDeclaration__Group__2__Impl ;
    public final void rule__AdviceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4655:1: ( rule__AdviceDeclaration__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4656:2: rule__AdviceDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AdviceDeclaration__Group__2__Impl_in_rule__AdviceDeclaration__Group__29334);
            rule__AdviceDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__AdviceDeclaration__Group__2"


    // $ANTLR start "rule__AdviceDeclaration__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: rule__AdviceDeclaration__Group__2__Impl : ( ':' ) ;
    public final void rule__AdviceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4666:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4667:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4667:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4668:1: ':'
            {
             before(grammarAccess.getAdviceDeclarationAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__AdviceDeclaration__Group__2__Impl9362); 
             after(grammarAccess.getAdviceDeclarationAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__AdviceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__AdviceType__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4687:1: rule__AdviceType__Group__0 : rule__AdviceType__Group__0__Impl rule__AdviceType__Group__1 ;
    public final void rule__AdviceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: ( rule__AdviceType__Group__0__Impl rule__AdviceType__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:2: rule__AdviceType__Group__0__Impl rule__AdviceType__Group__1
            {
            pushFollow(FOLLOW_rule__AdviceType__Group__0__Impl_in_rule__AdviceType__Group__09399);
            rule__AdviceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdviceType__Group__1_in_rule__AdviceType__Group__09402);
            rule__AdviceType__Group__1();

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
    // $ANTLR end "rule__AdviceType__Group__0"


    // $ANTLR start "rule__AdviceType__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4699:1: rule__AdviceType__Group__0__Impl : ( ( rule__AdviceType__Alternatives_0 ) ) ;
    public final void rule__AdviceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:1: ( ( ( rule__AdviceType__Alternatives_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: ( ( rule__AdviceType__Alternatives_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: ( ( rule__AdviceType__Alternatives_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4705:1: ( rule__AdviceType__Alternatives_0 )
            {
             before(grammarAccess.getAdviceTypeAccess().getAlternatives_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: ( rule__AdviceType__Alternatives_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:2: rule__AdviceType__Alternatives_0
            {
            pushFollow(FOLLOW_rule__AdviceType__Alternatives_0_in_rule__AdviceType__Group__0__Impl9429);
            rule__AdviceType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAdviceTypeAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__AdviceType__Group__0__Impl"


    // $ANTLR start "rule__AdviceType__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4716:1: rule__AdviceType__Group__1 : rule__AdviceType__Group__1__Impl ;
    public final void rule__AdviceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:1: ( rule__AdviceType__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4721:2: rule__AdviceType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdviceType__Group__1__Impl_in_rule__AdviceType__Group__19459);
            rule__AdviceType__Group__1__Impl();

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
    // $ANTLR end "rule__AdviceType__Group__1"


    // $ANTLR start "rule__AdviceType__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:1: rule__AdviceType__Group__1__Impl : ( ( rule__AdviceType__NameAssignment_1 ) ) ;
    public final void rule__AdviceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: ( ( ( rule__AdviceType__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4732:1: ( ( rule__AdviceType__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4732:1: ( ( rule__AdviceType__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4733:1: ( rule__AdviceType__NameAssignment_1 )
            {
             before(grammarAccess.getAdviceTypeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:1: ( rule__AdviceType__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:2: rule__AdviceType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AdviceType__NameAssignment_1_in_rule__AdviceType__Group__1__Impl9486);
            rule__AdviceType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAdviceTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AdviceType__Group__1__Impl"


    // $ANTLR start "rule__Intro__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:1: rule__Intro__Group__0 : rule__Intro__Group__0__Impl rule__Intro__Group__1 ;
    public final void rule__Intro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:1: ( rule__Intro__Group__0__Impl rule__Intro__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:2: rule__Intro__Group__0__Impl rule__Intro__Group__1
            {
            pushFollow(FOLLOW_rule__Intro__Group__0__Impl_in_rule__Intro__Group__09520);
            rule__Intro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Intro__Group__1_in_rule__Intro__Group__09523);
            rule__Intro__Group__1();

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
    // $ANTLR end "rule__Intro__Group__0"


    // $ANTLR start "rule__Intro__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4760:1: rule__Intro__Group__0__Impl : ( ruleIntroDeclaration ) ;
    public final void rule__Intro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4764:1: ( ( ruleIntroDeclaration ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: ( ruleIntroDeclaration )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: ( ruleIntroDeclaration )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4766:1: ruleIntroDeclaration
            {
             before(grammarAccess.getIntroAccess().getIntroDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleIntroDeclaration_in_rule__Intro__Group__0__Impl9550);
            ruleIntroDeclaration();

            state._fsp--;

             after(grammarAccess.getIntroAccess().getIntroDeclarationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Intro__Group__0__Impl"


    // $ANTLR start "rule__Intro__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4777:1: rule__Intro__Group__1 : rule__Intro__Group__1__Impl rule__Intro__Group__2 ;
    public final void rule__Intro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4781:1: ( rule__Intro__Group__1__Impl rule__Intro__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:2: rule__Intro__Group__1__Impl rule__Intro__Group__2
            {
            pushFollow(FOLLOW_rule__Intro__Group__1__Impl_in_rule__Intro__Group__19579);
            rule__Intro__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Intro__Group__2_in_rule__Intro__Group__19582);
            rule__Intro__Group__2();

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
    // $ANTLR end "rule__Intro__Group__1"


    // $ANTLR start "rule__Intro__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:1: rule__Intro__Group__1__Impl : ( ( rule__Intro__IntrotypeAssignment_1 ) ) ;
    public final void rule__Intro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4793:1: ( ( ( rule__Intro__IntrotypeAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: ( ( rule__Intro__IntrotypeAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: ( ( rule__Intro__IntrotypeAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( rule__Intro__IntrotypeAssignment_1 )
            {
             before(grammarAccess.getIntroAccess().getIntrotypeAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( rule__Intro__IntrotypeAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:2: rule__Intro__IntrotypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Intro__IntrotypeAssignment_1_in_rule__Intro__Group__1__Impl9609);
            rule__Intro__IntrotypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntroAccess().getIntrotypeAssignment_1()); 

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
    // $ANTLR end "rule__Intro__Group__1__Impl"


    // $ANTLR start "rule__Intro__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4806:1: rule__Intro__Group__2 : rule__Intro__Group__2__Impl ;
    public final void rule__Intro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4810:1: ( rule__Intro__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4811:2: rule__Intro__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Intro__Group__2__Impl_in_rule__Intro__Group__29639);
            rule__Intro__Group__2__Impl();

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
    // $ANTLR end "rule__Intro__Group__2"


    // $ANTLR start "rule__Intro__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: rule__Intro__Group__2__Impl : ( ( rule__Intro__IntroqueyAssignment_2 ) ) ;
    public final void rule__Intro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4821:1: ( ( ( rule__Intro__IntroqueyAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4822:1: ( ( rule__Intro__IntroqueyAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4822:1: ( ( rule__Intro__IntroqueyAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4823:1: ( rule__Intro__IntroqueyAssignment_2 )
            {
             before(grammarAccess.getIntroAccess().getIntroqueyAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4824:1: ( rule__Intro__IntroqueyAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4824:2: rule__Intro__IntroqueyAssignment_2
            {
            pushFollow(FOLLOW_rule__Intro__IntroqueyAssignment_2_in_rule__Intro__Group__2__Impl9666);
            rule__Intro__IntroqueyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntroAccess().getIntroqueyAssignment_2()); 

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
    // $ANTLR end "rule__Intro__Group__2__Impl"


    // $ANTLR start "rule__IntroDeclaration__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4840:1: rule__IntroDeclaration__Group__0 : rule__IntroDeclaration__Group__0__Impl rule__IntroDeclaration__Group__1 ;
    public final void rule__IntroDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4844:1: ( rule__IntroDeclaration__Group__0__Impl rule__IntroDeclaration__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:2: rule__IntroDeclaration__Group__0__Impl rule__IntroDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__IntroDeclaration__Group__0__Impl_in_rule__IntroDeclaration__Group__09702);
            rule__IntroDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntroDeclaration__Group__1_in_rule__IntroDeclaration__Group__09705);
            rule__IntroDeclaration__Group__1();

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
    // $ANTLR end "rule__IntroDeclaration__Group__0"


    // $ANTLR start "rule__IntroDeclaration__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4852:1: rule__IntroDeclaration__Group__0__Impl : ( 'intro' ) ;
    public final void rule__IntroDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:1: ( ( 'intro' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: ( 'intro' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: ( 'intro' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: 'intro'
            {
             before(grammarAccess.getIntroDeclarationAccess().getIntroKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__IntroDeclaration__Group__0__Impl9733); 
             after(grammarAccess.getIntroDeclarationAccess().getIntroKeyword_0()); 

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
    // $ANTLR end "rule__IntroDeclaration__Group__0__Impl"


    // $ANTLR start "rule__IntroDeclaration__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: rule__IntroDeclaration__Group__1 : rule__IntroDeclaration__Group__1__Impl ;
    public final void rule__IntroDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: ( rule__IntroDeclaration__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4876:2: rule__IntroDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntroDeclaration__Group__1__Impl_in_rule__IntroDeclaration__Group__19764);
            rule__IntroDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__IntroDeclaration__Group__1"


    // $ANTLR start "rule__IntroDeclaration__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4882:1: rule__IntroDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__IntroDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4887:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4887:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: ':'
            {
             before(grammarAccess.getIntroDeclarationAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__IntroDeclaration__Group__1__Impl9792); 
             after(grammarAccess.getIntroDeclarationAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__IntroDeclaration__Group__1__Impl"


    // $ANTLR start "rule__IntroType__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:1: rule__IntroType__Group__0 : rule__IntroType__Group__0__Impl rule__IntroType__Group__1 ;
    public final void rule__IntroType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:1: ( rule__IntroType__Group__0__Impl rule__IntroType__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:2: rule__IntroType__Group__0__Impl rule__IntroType__Group__1
            {
            pushFollow(FOLLOW_rule__IntroType__Group__0__Impl_in_rule__IntroType__Group__09827);
            rule__IntroType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntroType__Group__1_in_rule__IntroType__Group__09830);
            rule__IntroType__Group__1();

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
    // $ANTLR end "rule__IntroType__Group__0"


    // $ANTLR start "rule__IntroType__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: rule__IntroType__Group__0__Impl : ( ruleQueryType ) ;
    public final void rule__IntroType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: ( ( ruleQueryType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:1: ( ruleQueryType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:1: ( ruleQueryType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: ruleQueryType
            {
             before(grammarAccess.getIntroTypeAccess().getQueryTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQueryType_in_rule__IntroType__Group__0__Impl9857);
            ruleQueryType();

            state._fsp--;

             after(grammarAccess.getIntroTypeAccess().getQueryTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__IntroType__Group__0__Impl"


    // $ANTLR start "rule__IntroType__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4934:1: rule__IntroType__Group__1 : rule__IntroType__Group__1__Impl ;
    public final void rule__IntroType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: ( rule__IntroType__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4939:2: rule__IntroType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntroType__Group__1__Impl_in_rule__IntroType__Group__19886);
            rule__IntroType__Group__1__Impl();

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
    // $ANTLR end "rule__IntroType__Group__1"


    // $ANTLR start "rule__IntroType__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4945:1: rule__IntroType__Group__1__Impl : ( ( rule__IntroType__NameAssignment_1 ) ) ;
    public final void rule__IntroType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4949:1: ( ( ( rule__IntroType__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:1: ( ( rule__IntroType__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:1: ( ( rule__IntroType__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4951:1: ( rule__IntroType__NameAssignment_1 )
            {
             before(grammarAccess.getIntroTypeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4952:1: ( rule__IntroType__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4952:2: rule__IntroType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__IntroType__NameAssignment_1_in_rule__IntroType__Group__1__Impl9913);
            rule__IntroType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntroTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__IntroType__Group__1__Impl"


    // $ANTLR start "rule__QueryDeclaration__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: rule__QueryDeclaration__Group__0 : rule__QueryDeclaration__Group__0__Impl rule__QueryDeclaration__Group__1 ;
    public final void rule__QueryDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: ( rule__QueryDeclaration__Group__0__Impl rule__QueryDeclaration__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:2: rule__QueryDeclaration__Group__0__Impl rule__QueryDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__QueryDeclaration__Group__0__Impl_in_rule__QueryDeclaration__Group__09947);
            rule__QueryDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryDeclaration__Group__1_in_rule__QueryDeclaration__Group__09950);
            rule__QueryDeclaration__Group__1();

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
    // $ANTLR end "rule__QueryDeclaration__Group__0"


    // $ANTLR start "rule__QueryDeclaration__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: rule__QueryDeclaration__Group__0__Impl : ( ruleQueryType ) ;
    public final void rule__QueryDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4982:1: ( ( ruleQueryType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ruleQueryType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ruleQueryType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ruleQueryType
            {
             before(grammarAccess.getQueryDeclarationAccess().getQueryTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQueryType_in_rule__QueryDeclaration__Group__0__Impl9977);
            ruleQueryType();

            state._fsp--;

             after(grammarAccess.getQueryDeclarationAccess().getQueryTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__QueryDeclaration__Group__0__Impl"


    // $ANTLR start "rule__QueryDeclaration__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4995:1: rule__QueryDeclaration__Group__1 : rule__QueryDeclaration__Group__1__Impl rule__QueryDeclaration__Group__2 ;
    public final void rule__QueryDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: ( rule__QueryDeclaration__Group__1__Impl rule__QueryDeclaration__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:2: rule__QueryDeclaration__Group__1__Impl rule__QueryDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__QueryDeclaration__Group__1__Impl_in_rule__QueryDeclaration__Group__110006);
            rule__QueryDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryDeclaration__Group__2_in_rule__QueryDeclaration__Group__110009);
            rule__QueryDeclaration__Group__2();

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
    // $ANTLR end "rule__QueryDeclaration__Group__1"


    // $ANTLR start "rule__QueryDeclaration__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:1: rule__QueryDeclaration__Group__1__Impl : ( '->' ) ;
    public final void rule__QueryDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5011:1: ( ( '->' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5012:1: ( '->' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5012:1: ( '->' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: '->'
            {
             before(grammarAccess.getQueryDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__QueryDeclaration__Group__1__Impl10037); 
             after(grammarAccess.getQueryDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__QueryDeclaration__Group__1__Impl"


    // $ANTLR start "rule__QueryDeclaration__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5026:1: rule__QueryDeclaration__Group__2 : rule__QueryDeclaration__Group__2__Impl rule__QueryDeclaration__Group__3 ;
    public final void rule__QueryDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5030:1: ( rule__QueryDeclaration__Group__2__Impl rule__QueryDeclaration__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:2: rule__QueryDeclaration__Group__2__Impl rule__QueryDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__QueryDeclaration__Group__2__Impl_in_rule__QueryDeclaration__Group__210068);
            rule__QueryDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryDeclaration__Group__3_in_rule__QueryDeclaration__Group__210071);
            rule__QueryDeclaration__Group__3();

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
    // $ANTLR end "rule__QueryDeclaration__Group__2"


    // $ANTLR start "rule__QueryDeclaration__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5038:1: rule__QueryDeclaration__Group__2__Impl : ( 'select' ) ;
    public final void rule__QueryDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5042:1: ( ( 'select' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: ( 'select' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: ( 'select' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5044:1: 'select'
            {
             before(grammarAccess.getQueryDeclarationAccess().getSelectKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__QueryDeclaration__Group__2__Impl10099); 
             after(grammarAccess.getQueryDeclarationAccess().getSelectKeyword_2()); 

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
    // $ANTLR end "rule__QueryDeclaration__Group__2__Impl"


    // $ANTLR start "rule__QueryDeclaration__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5057:1: rule__QueryDeclaration__Group__3 : rule__QueryDeclaration__Group__3__Impl ;
    public final void rule__QueryDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: ( rule__QueryDeclaration__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:2: rule__QueryDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__QueryDeclaration__Group__3__Impl_in_rule__QueryDeclaration__Group__310130);
            rule__QueryDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__QueryDeclaration__Group__3"


    // $ANTLR start "rule__QueryDeclaration__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:1: rule__QueryDeclaration__Group__3__Impl : ( ruleQueryBody ) ;
    public final void rule__QueryDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5072:1: ( ( ruleQueryBody ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5073:1: ( ruleQueryBody )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5073:1: ( ruleQueryBody )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5074:1: ruleQueryBody
            {
             before(grammarAccess.getQueryDeclarationAccess().getQueryBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleQueryBody_in_rule__QueryDeclaration__Group__3__Impl10157);
            ruleQueryBody();

            state._fsp--;

             after(grammarAccess.getQueryDeclarationAccess().getQueryBodyParserRuleCall_3()); 

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
    // $ANTLR end "rule__QueryDeclaration__Group__3__Impl"


    // $ANTLR start "rule__QueryBody__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: rule__QueryBody__Group__0 : rule__QueryBody__Group__0__Impl rule__QueryBody__Group__1 ;
    public final void rule__QueryBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( rule__QueryBody__Group__0__Impl rule__QueryBody__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:2: rule__QueryBody__Group__0__Impl rule__QueryBody__Group__1
            {
            pushFollow(FOLLOW_rule__QueryBody__Group__0__Impl_in_rule__QueryBody__Group__010194);
            rule__QueryBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryBody__Group__1_in_rule__QueryBody__Group__010197);
            rule__QueryBody__Group__1();

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
    // $ANTLR end "rule__QueryBody__Group__0"


    // $ANTLR start "rule__QueryBody__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5105:1: rule__QueryBody__Group__0__Impl : ( '(' ) ;
    public final void rule__QueryBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5110:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5110:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5111:1: '('
            {
             before(grammarAccess.getQueryBodyAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__QueryBody__Group__0__Impl10225); 
             after(grammarAccess.getQueryBodyAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__QueryBody__Group__0__Impl"


    // $ANTLR start "rule__QueryBody__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5124:1: rule__QueryBody__Group__1 : rule__QueryBody__Group__1__Impl rule__QueryBody__Group__2 ;
    public final void rule__QueryBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( rule__QueryBody__Group__1__Impl rule__QueryBody__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:2: rule__QueryBody__Group__1__Impl rule__QueryBody__Group__2
            {
            pushFollow(FOLLOW_rule__QueryBody__Group__1__Impl_in_rule__QueryBody__Group__110256);
            rule__QueryBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryBody__Group__2_in_rule__QueryBody__Group__110259);
            rule__QueryBody__Group__2();

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
    // $ANTLR end "rule__QueryBody__Group__1"


    // $ANTLR start "rule__QueryBody__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5136:1: rule__QueryBody__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__QueryBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5140:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5141:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5141:1: ( ruleExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5142:1: ruleExpression
            {
             before(grammarAccess.getQueryBodyAccess().getExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__QueryBody__Group__1__Impl10286);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQueryBodyAccess().getExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__QueryBody__Group__1__Impl"


    // $ANTLR start "rule__QueryBody__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: rule__QueryBody__Group__2 : rule__QueryBody__Group__2__Impl ;
    public final void rule__QueryBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5157:1: ( rule__QueryBody__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5158:2: rule__QueryBody__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QueryBody__Group__2__Impl_in_rule__QueryBody__Group__210315);
            rule__QueryBody__Group__2__Impl();

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
    // $ANTLR end "rule__QueryBody__Group__2"


    // $ANTLR start "rule__QueryBody__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5164:1: rule__QueryBody__Group__2__Impl : ( ')' ) ;
    public final void rule__QueryBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5169:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5169:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5170:1: ')'
            {
             before(grammarAccess.getQueryBodyAccess().getRightParenthesisKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__QueryBody__Group__2__Impl10343); 
             after(grammarAccess.getQueryBodyAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__QueryBody__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5194:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_0__0__Impl_in_rule__Expression__Group_0__010380);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_0__1_in_rule__Expression__Group_0__010383);
            rule__Expression__Group_0__1();

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
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5201:1: rule__Expression__Group_0__0__Impl : ( 'exp:OCLExpression' ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( ( 'exp:OCLExpression' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: ( 'exp:OCLExpression' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: ( 'exp:OCLExpression' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5207:1: 'exp:OCLExpression'
            {
             before(grammarAccess.getExpressionAccess().getExpOCLExpressionKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Expression__Group_0__0__Impl10411); 
             after(grammarAccess.getExpressionAccess().getExpOCLExpressionKeyword_0_0()); 

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
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5220:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:1: ( rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5225:2: rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_0__1__Impl_in_rule__Expression__Group_0__110442);
            rule__Expression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_0__2_in_rule__Expression__Group_0__110445);
            rule__Expression__Group_0__2();

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
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5232:1: rule__Expression__Group_0__1__Impl : ( '|' ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: ( ( '|' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: ( '|' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: ( '|' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5238:1: '|'
            {
             before(grammarAccess.getExpressionAccess().getVerticalLineKeyword_0_1()); 
            match(input,40,FOLLOW_40_in_rule__Expression__Group_0__1__Impl10473); 
             after(grammarAccess.getExpressionAccess().getVerticalLineKeyword_0_1()); 

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
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:1: rule__Expression__Group_0__2 : rule__Expression__Group_0__2__Impl ;
    public final void rule__Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5255:1: ( rule__Expression__Group_0__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5256:2: rule__Expression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_0__2__Impl_in_rule__Expression__Group_0__210504);
            rule__Expression__Group_0__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_0__2"


    // $ANTLR start "rule__Expression__Group_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:1: rule__Expression__Group_0__2__Impl : ( 'exp.oclIsTypeOf(thenExp)' ) ;
    public final void rule__Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( ( 'exp.oclIsTypeOf(thenExp)' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: ( 'exp.oclIsTypeOf(thenExp)' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: ( 'exp.oclIsTypeOf(thenExp)' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:1: 'exp.oclIsTypeOf(thenExp)'
            {
             before(grammarAccess.getExpressionAccess().getExpOclIsTypeOfThenExpKeyword_0_2()); 
            match(input,41,FOLLOW_41_in_rule__Expression__Group_0__2__Impl10532); 
             after(grammarAccess.getExpressionAccess().getExpOclIsTypeOfThenExpKeyword_0_2()); 

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
    // $ANTLR end "rule__Expression__Group_0__2__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5287:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5291:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5292:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__010569);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__010572);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Group_1_0__0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5303:1: ( ( ( rule__Expression__Group_1_0__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5304:1: ( ( rule__Expression__Group_1_0__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5304:1: ( ( rule__Expression__Group_1_0__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5305:1: ( rule__Expression__Group_1_0__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5306:1: ( rule__Expression__Group_1_0__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5306:2: rule__Expression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0__0_in_rule__Expression__Group_1__0__Impl10599);
            rule__Expression__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5316:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5320:1: ( rule__Expression__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5321:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__110629);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__NameAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5331:1: ( ( ( rule__Expression__NameAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5332:1: ( ( rule__Expression__NameAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5332:1: ( ( rule__Expression__NameAssignment_1_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5333:1: ( rule__Expression__NameAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5334:1: ( rule__Expression__NameAssignment_1_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5334:2: rule__Expression__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__NameAssignment_1_1_in_rule__Expression__Group_1__1__Impl10656);
            rule__Expression__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5348:1: rule__Expression__Group_1_0__0 : rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 ;
    public final void rule__Expression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5352:1: ( rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5353:2: rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0__0__Impl_in_rule__Expression__Group_1_0__010690);
            rule__Expression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1_0__1_in_rule__Expression__Group_1_0__010693);
            rule__Expression__Group_1_0__1();

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
    // $ANTLR end "rule__Expression__Group_1_0__0"


    // $ANTLR start "rule__Expression__Group_1_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5360:1: rule__Expression__Group_1_0__0__Impl : ( 'exp:OCLExpression' ) ;
    public final void rule__Expression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5364:1: ( ( 'exp:OCLExpression' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5365:1: ( 'exp:OCLExpression' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5365:1: ( 'exp:OCLExpression' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5366:1: 'exp:OCLExpression'
            {
             before(grammarAccess.getExpressionAccess().getExpOCLExpressionKeyword_1_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Expression__Group_1_0__0__Impl10721); 
             after(grammarAccess.getExpressionAccess().getExpOCLExpressionKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Expression__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5379:1: rule__Expression__Group_1_0__1 : rule__Expression__Group_1_0__1__Impl rule__Expression__Group_1_0__2 ;
    public final void rule__Expression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5383:1: ( rule__Expression__Group_1_0__1__Impl rule__Expression__Group_1_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5384:2: rule__Expression__Group_1_0__1__Impl rule__Expression__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0__1__Impl_in_rule__Expression__Group_1_0__110752);
            rule__Expression__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1_0__2_in_rule__Expression__Group_1_0__110755);
            rule__Expression__Group_1_0__2();

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
    // $ANTLR end "rule__Expression__Group_1_0__1"


    // $ANTLR start "rule__Expression__Group_1_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: rule__Expression__Group_1_0__1__Impl : ( '|' ) ;
    public final void rule__Expression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5395:1: ( ( '|' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5396:1: ( '|' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5396:1: ( '|' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5397:1: '|'
            {
             before(grammarAccess.getExpressionAccess().getVerticalLineKeyword_1_0_1()); 
            match(input,40,FOLLOW_40_in_rule__Expression__Group_1_0__1__Impl10783); 
             after(grammarAccess.getExpressionAccess().getVerticalLineKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Expression__Group_1_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5410:1: rule__Expression__Group_1_0__2 : rule__Expression__Group_1_0__2__Impl rule__Expression__Group_1_0__3 ;
    public final void rule__Expression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5414:1: ( rule__Expression__Group_1_0__2__Impl rule__Expression__Group_1_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5415:2: rule__Expression__Group_1_0__2__Impl rule__Expression__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0__2__Impl_in_rule__Expression__Group_1_0__210814);
            rule__Expression__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1_0__3_in_rule__Expression__Group_1_0__210817);
            rule__Expression__Group_1_0__3();

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
    // $ANTLR end "rule__Expression__Group_1_0__2"


    // $ANTLR start "rule__Expression__Group_1_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: rule__Expression__Group_1_0__2__Impl : ( 'exp.oclIsTypeOf(ifExp)' ) ;
    public final void rule__Expression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5426:1: ( ( 'exp.oclIsTypeOf(ifExp)' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: ( 'exp.oclIsTypeOf(ifExp)' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: ( 'exp.oclIsTypeOf(ifExp)' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5428:1: 'exp.oclIsTypeOf(ifExp)'
            {
             before(grammarAccess.getExpressionAccess().getExpOclIsTypeOfIfExpKeyword_1_0_2()); 
            match(input,42,FOLLOW_42_in_rule__Expression__Group_1_0__2__Impl10845); 
             after(grammarAccess.getExpressionAccess().getExpOclIsTypeOfIfExpKeyword_1_0_2()); 

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
    // $ANTLR end "rule__Expression__Group_1_0__2__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5441:1: rule__Expression__Group_1_0__3 : rule__Expression__Group_1_0__3__Impl rule__Expression__Group_1_0__4 ;
    public final void rule__Expression__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5445:1: ( rule__Expression__Group_1_0__3__Impl rule__Expression__Group_1_0__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:2: rule__Expression__Group_1_0__3__Impl rule__Expression__Group_1_0__4
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0__3__Impl_in_rule__Expression__Group_1_0__310876);
            rule__Expression__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1_0__4_in_rule__Expression__Group_1_0__310879);
            rule__Expression__Group_1_0__4();

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
    // $ANTLR end "rule__Expression__Group_1_0__3"


    // $ANTLR start "rule__Expression__Group_1_0__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5453:1: rule__Expression__Group_1_0__3__Impl : ( 'and' ) ;
    public final void rule__Expression__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: ( ( 'and' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:1: ( 'and' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:1: ( 'and' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5459:1: 'and'
            {
             before(grammarAccess.getExpressionAccess().getAndKeyword_1_0_3()); 
            match(input,19,FOLLOW_19_in_rule__Expression__Group_1_0__3__Impl10907); 
             after(grammarAccess.getExpressionAccess().getAndKeyword_1_0_3()); 

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
    // $ANTLR end "rule__Expression__Group_1_0__3__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: rule__Expression__Group_1_0__4 : rule__Expression__Group_1_0__4__Impl rule__Expression__Group_1_0__5 ;
    public final void rule__Expression__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: ( rule__Expression__Group_1_0__4__Impl rule__Expression__Group_1_0__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5477:2: rule__Expression__Group_1_0__4__Impl rule__Expression__Group_1_0__5
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0__4__Impl_in_rule__Expression__Group_1_0__410938);
            rule__Expression__Group_1_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1_0__5_in_rule__Expression__Group_1_0__410941);
            rule__Expression__Group_1_0__5();

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
    // $ANTLR end "rule__Expression__Group_1_0__4"


    // $ANTLR start "rule__Expression__Group_1_0__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5484:1: rule__Expression__Group_1_0__4__Impl : ( 'exp.condition.refferedVariable' ) ;
    public final void rule__Expression__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5488:1: ( ( 'exp.condition.refferedVariable' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5489:1: ( 'exp.condition.refferedVariable' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5489:1: ( 'exp.condition.refferedVariable' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5490:1: 'exp.condition.refferedVariable'
            {
             before(grammarAccess.getExpressionAccess().getExpConditionRefferedVariableKeyword_1_0_4()); 
            match(input,43,FOLLOW_43_in_rule__Expression__Group_1_0__4__Impl10969); 
             after(grammarAccess.getExpressionAccess().getExpConditionRefferedVariableKeyword_1_0_4()); 

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
    // $ANTLR end "rule__Expression__Group_1_0__4__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: rule__Expression__Group_1_0__5 : rule__Expression__Group_1_0__5__Impl ;
    public final void rule__Expression__Group_1_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5507:1: ( rule__Expression__Group_1_0__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:2: rule__Expression__Group_1_0__5__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0__5__Impl_in_rule__Expression__Group_1_0__511000);
            rule__Expression__Group_1_0__5__Impl();

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
    // $ANTLR end "rule__Expression__Group_1_0__5"


    // $ANTLR start "rule__Expression__Group_1_0__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5514:1: rule__Expression__Group_1_0__5__Impl : ( '=' ) ;
    public final void rule__Expression__Group_1_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5518:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5519:1: ( '=' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5519:1: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5520:1: '='
            {
             before(grammarAccess.getExpressionAccess().getEqualsSignKeyword_1_0_5()); 
            match(input,44,FOLLOW_44_in_rule__Expression__Group_1_0__5__Impl11028); 
             after(grammarAccess.getExpressionAccess().getEqualsSignKeyword_1_0_5()); 

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
    // $ANTLR end "rule__Expression__Group_1_0__5__Impl"


    // $ANTLR start "rule__Model__AspectAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5546:1: rule__Model__AspectAssignment : ( ruleAspect ) ;
    public final void rule__Model__AspectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5550:1: ( ( ruleAspect ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: ( ruleAspect )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: ( ruleAspect )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ruleAspect
            {
             before(grammarAccess.getModelAccess().getAspectAspectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAspect_in_rule__Model__AspectAssignment11076);
            ruleAspect();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAspectAspectParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__AspectAssignment"


    // $ANTLR start "rule__Mapping__MappingnameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5561:1: rule__Mapping__MappingnameAssignment_1 : ( ruleMappingName ) ;
    public final void rule__Mapping__MappingnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5565:1: ( ( ruleMappingName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5566:1: ( ruleMappingName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5566:1: ( ruleMappingName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5567:1: ruleMappingName
            {
             before(grammarAccess.getMappingAccess().getMappingnameMappingNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMappingName_in_rule__Mapping__MappingnameAssignment_111107);
            ruleMappingName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getMappingnameMappingNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Mapping__MappingnameAssignment_1"


    // $ANTLR start "rule__AspectDefinition__MappingdeclarartionAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5576:1: rule__AspectDefinition__MappingdeclarartionAssignment_3 : ( ruleMapping_Declaration ) ;
    public final void rule__AspectDefinition__MappingdeclarartionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5580:1: ( ( ruleMapping_Declaration ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: ( ruleMapping_Declaration )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: ( ruleMapping_Declaration )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:1: ruleMapping_Declaration
            {
             before(grammarAccess.getAspectDefinitionAccess().getMappingdeclarartionMapping_DeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMapping_Declaration_in_rule__AspectDefinition__MappingdeclarartionAssignment_311138);
            ruleMapping_Declaration();

            state._fsp--;

             after(grammarAccess.getAspectDefinitionAccess().getMappingdeclarartionMapping_DeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AspectDefinition__MappingdeclarartionAssignment_3"


    // $ANTLR start "rule__AspectDefinition__PointcutdeclarationAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5591:1: rule__AspectDefinition__PointcutdeclarationAssignment_4 : ( rulePointcut_Declaration ) ;
    public final void rule__AspectDefinition__PointcutdeclarationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5595:1: ( ( rulePointcut_Declaration ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5596:1: ( rulePointcut_Declaration )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5596:1: ( rulePointcut_Declaration )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5597:1: rulePointcut_Declaration
            {
             before(grammarAccess.getAspectDefinitionAccess().getPointcutdeclarationPointcut_DeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePointcut_Declaration_in_rule__AspectDefinition__PointcutdeclarationAssignment_411169);
            rulePointcut_Declaration();

            state._fsp--;

             after(grammarAccess.getAspectDefinitionAccess().getPointcutdeclarationPointcut_DeclarationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AspectDefinition__PointcutdeclarationAssignment_4"


    // $ANTLR start "rule__AspectDefinition__AIDeclarationAssignment_7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5606:1: rule__AspectDefinition__AIDeclarationAssignment_7 : ( ruleAI ) ;
    public final void rule__AspectDefinition__AIDeclarationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5610:1: ( ( ruleAI ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: ( ruleAI )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: ( ruleAI )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5612:1: ruleAI
            {
             before(grammarAccess.getAspectDefinitionAccess().getAIDeclarationAIParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleAI_in_rule__AspectDefinition__AIDeclarationAssignment_711200);
            ruleAI();

            state._fsp--;

             after(grammarAccess.getAspectDefinitionAccess().getAIDeclarationAIParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__AspectDefinition__AIDeclarationAssignment_7"


    // $ANTLR start "rule__Mapping_Declaration__Reference_mappingnameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5621:1: rule__Mapping_Declaration__Reference_mappingnameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mapping_Declaration__Reference_mappingnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5625:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5627:1: ( RULE_ID )
            {
             before(grammarAccess.getMapping_DeclarationAccess().getReference_mappingnameMappingNameCrossReference_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5628:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5629:1: RULE_ID
            {
             before(grammarAccess.getMapping_DeclarationAccess().getReference_mappingnameMappingNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mapping_Declaration__Reference_mappingnameAssignment_111235); 
             after(grammarAccess.getMapping_DeclarationAccess().getReference_mappingnameMappingNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMapping_DeclarationAccess().getReference_mappingnameMappingNameCrossReference_1_0()); 

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
    // $ANTLR end "rule__Mapping_Declaration__Reference_mappingnameAssignment_1"


    // $ANTLR start "rule__MappingName__NameAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5640:1: rule__MappingName__NameAssignment : ( RULE_ID ) ;
    public final void rule__MappingName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5644:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: RULE_ID
            {
             before(grammarAccess.getMappingNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MappingName__NameAssignment11270); 
             after(grammarAccess.getMappingNameAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__MappingName__NameAssignment"


    // $ANTLR start "rule__Pointcut_Declaration__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5655:1: rule__Pointcut_Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pointcut_Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5659:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: RULE_ID
            {
             before(grammarAccess.getPointcut_DeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pointcut_Declaration__NameAssignment_111301); 
             after(grammarAccess.getPointcut_DeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Pointcut_Declaration__NameAssignment_1"


    // $ANTLR start "rule__Advice__AdvicetypeAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5670:1: rule__Advice__AdvicetypeAssignment_1 : ( ruleAdviceType ) ;
    public final void rule__Advice__AdvicetypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5674:1: ( ( ruleAdviceType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5675:1: ( ruleAdviceType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5675:1: ( ruleAdviceType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ruleAdviceType
            {
             before(grammarAccess.getAdviceAccess().getAdvicetypeAdviceTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAdviceType_in_rule__Advice__AdvicetypeAssignment_111332);
            ruleAdviceType();

            state._fsp--;

             after(grammarAccess.getAdviceAccess().getAdvicetypeAdviceTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Advice__AdvicetypeAssignment_1"


    // $ANTLR start "rule__Advice__IntroadvicequeryAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5685:1: rule__Advice__IntroadvicequeryAssignment_2 : ( ruleIntroAdviceQuery ) ;
    public final void rule__Advice__IntroadvicequeryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5689:1: ( ( ruleIntroAdviceQuery ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:1: ( ruleIntroAdviceQuery )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:1: ( ruleIntroAdviceQuery )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ruleIntroAdviceQuery
            {
             before(grammarAccess.getAdviceAccess().getIntroadvicequeryIntroAdviceQueryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntroAdviceQuery_in_rule__Advice__IntroadvicequeryAssignment_211363);
            ruleIntroAdviceQuery();

            state._fsp--;

             after(grammarAccess.getAdviceAccess().getIntroadvicequeryIntroAdviceQueryParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Advice__IntroadvicequeryAssignment_2"


    // $ANTLR start "rule__AdviceType__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5700:1: rule__AdviceType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AdviceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5704:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5705:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5705:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: RULE_ID
            {
             before(grammarAccess.getAdviceTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AdviceType__NameAssignment_111394); 
             after(grammarAccess.getAdviceTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AdviceType__NameAssignment_1"


    // $ANTLR start "rule__IntroAdviceQuery__NameAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5715:1: rule__IntroAdviceQuery__NameAssignment : ( ruleOclExpression ) ;
    public final void rule__IntroAdviceQuery__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5719:1: ( ( ruleOclExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5720:1: ( ruleOclExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5720:1: ( ruleOclExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5721:1: ruleOclExpression
            {
             before(grammarAccess.getIntroAdviceQueryAccess().getNameOclExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOclExpression_in_rule__IntroAdviceQuery__NameAssignment11425);
            ruleOclExpression();

            state._fsp--;

             after(grammarAccess.getIntroAdviceQueryAccess().getNameOclExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__IntroAdviceQuery__NameAssignment"


    // $ANTLR start "rule__Intro__IntrotypeAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5730:1: rule__Intro__IntrotypeAssignment_1 : ( ruleIntroType ) ;
    public final void rule__Intro__IntrotypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5734:1: ( ( ruleIntroType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5735:1: ( ruleIntroType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5735:1: ( ruleIntroType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ruleIntroType
            {
             before(grammarAccess.getIntroAccess().getIntrotypeIntroTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIntroType_in_rule__Intro__IntrotypeAssignment_111456);
            ruleIntroType();

            state._fsp--;

             after(grammarAccess.getIntroAccess().getIntrotypeIntroTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Intro__IntrotypeAssignment_1"


    // $ANTLR start "rule__Intro__IntroqueyAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5745:1: rule__Intro__IntroqueyAssignment_2 : ( ruleIntroQuery ) ;
    public final void rule__Intro__IntroqueyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5749:1: ( ( ruleIntroQuery ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5750:1: ( ruleIntroQuery )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5750:1: ( ruleIntroQuery )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:1: ruleIntroQuery
            {
             before(grammarAccess.getIntroAccess().getIntroqueyIntroQueryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntroQuery_in_rule__Intro__IntroqueyAssignment_211487);
            ruleIntroQuery();

            state._fsp--;

             after(grammarAccess.getIntroAccess().getIntroqueyIntroQueryParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Intro__IntroqueyAssignment_2"


    // $ANTLR start "rule__IntroType__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5760:1: rule__IntroType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IntroType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5764:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5766:1: RULE_ID
            {
             before(grammarAccess.getIntroTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntroType__NameAssignment_111518); 
             after(grammarAccess.getIntroTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IntroType__NameAssignment_1"


    // $ANTLR start "rule__IntroQuery__NameAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5775:1: rule__IntroQuery__NameAssignment : ( ruleOclExpression ) ;
    public final void rule__IntroQuery__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5779:1: ( ( ruleOclExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5780:1: ( ruleOclExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5780:1: ( ruleOclExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5781:1: ruleOclExpression
            {
             before(grammarAccess.getIntroQueryAccess().getNameOclExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOclExpression_in_rule__IntroQuery__NameAssignment11549);
            ruleOclExpression();

            state._fsp--;

             after(grammarAccess.getIntroQueryAccess().getNameOclExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__IntroQuery__NameAssignment"


    // $ANTLR start "rule__Expression__NameAssignment_1_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5790:1: rule__Expression__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5794:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5795:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5795:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_1_111580); 
             after(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression__NameAssignment_1_1"


    // $ANTLR start "rule__OclExpression__ValueAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5805:1: rule__OclExpression__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__OclExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5809:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5810:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5810:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5811:1: RULE_STRING
            {
             before(grammarAccess.getOclExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OclExpression__ValueAssignment11611); 
             after(grammarAccess.getOclExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__OclExpression__ValueAssignment"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA3_eotS =
        "\10\uffff";
    static final String DFA3_eofS =
        "\10\uffff";
    static final String DFA3_minS =
        "\1\31\4\4\3\uffff";
    static final String DFA3_maxS =
        "\1\31\1\4\2\34\1\27\3\uffff";
    static final String DFA3_acceptS =
        "\5\uffff\1\1\1\2\1\3";
    static final String DFA3_specialS =
        "\10\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\25\uffff\1\5\1\uffff\1\4",
            "\1\3\25\uffff\1\5\1\uffff\1\4",
            "\1\6\22\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1099:1: rule__LetExpression__Alternatives : ( ( ( rule__LetExpression__Group_0__0 ) ) | ( ( rule__LetExpression__Group_1__0 ) ) | ( ( rule__LetExpression__Group_2__0 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\11\uffff";
    static final String DFA4_eofS =
        "\1\uffff\2\3\2\uffff\2\7\2\uffff";
    static final String DFA4_minS =
        "\3\4\1\uffff\3\4\2\uffff";
    static final String DFA4_maxS =
        "\1\4\2\35\1\uffff\1\4\2\42\2\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\1\3\uffff\1\3\1\2";
    static final String DFA4_specialS =
        "\11\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2\23\uffff\1\3\2\uffff\2\3\1\4",
            "\1\2\23\uffff\1\3\2\uffff\2\3\1\4",
            "",
            "\1\5",
            "\1\6\23\uffff\1\7\2\uffff\2\7\5\uffff\1\10",
            "\1\6\23\uffff\1\7\2\uffff\2\7\5\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1127:1: rule__Operation__Alternatives : ( ( ruleClassifierContext ) | ( ruleOperationContext ) | ( ruleAttributeContext ) );";
        }
    }
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA5_minS =
        "\3\4\2\uffff";
    static final String DFA5_maxS =
        "\1\4\2\45\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2\13\uffff\3\3\12\uffff\1\4\6\uffff\2\3",
            "\1\2\13\uffff\3\3\12\uffff\1\4\6\uffff\2\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1155:1: rule__ContextDeclaration__Alternatives_1 : ( ( ruleClassifierContext ) | ( ruleOperationContext ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AspectAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Alternatives_in_ruleAspect154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletExpression_in_entryRuleletExpression241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletExpression248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Alternatives_in_ruleletExpression274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_entryRuleCOA301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOA308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleCOA334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCOA_in_entryRuleSCOA360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCOA367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleSCOA393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeContext_in_entryRuleAttributeContext419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeContext426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeContext__Group__0_in_ruleAttributeContext452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarNameArray_in_entryRuleletVarNameArray539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletVarNameArray546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group__0_in_ruleletVarNameArray572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarName_in_entryRuleletVarName599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleletVarName606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleletVarName632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectDefinition_in_entryRuleAspectDefinition658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspectDefinition665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__0_in_ruleAspectDefinition691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectName_in_entryRuleAspectName718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspectName725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleAspectName751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_Declaration_in_entryRuleMapping_Declaration777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping_Declaration784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping_Declaration__Group__0_in_ruleMapping_Declaration810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingName_in_entryRuleMappingName837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingName844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingName__NameAssignment_in_ruleMappingName870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointcut_Declaration_in_entryRulePointcut_Declaration897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointcut_Declaration904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pointcut_Declaration__Group__0_in_rulePointcut_Declaration930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDeclaration_in_entryRuleContextDeclaration959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDeclaration966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextDeclaration__Group__0_in_ruleContextDeclaration992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_entryRuleClassifierContext1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifierContext1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleClassifierContext1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationContext_in_entryRuleOperationContext1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationContext1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__0_in_ruleOperationContext1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationName_in_entryRuleOperationName1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationName1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleOperationName1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments1197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_ruleArguments1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturntype_in_entryRuleReturntype1256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturntype1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Returntype__Alternatives_in_ruleReturntype1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAI_in_entryRuleAI1316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAI1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AI__Alternatives_in_ruleAI1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdvice_in_entryRuleAdvice1376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdvice1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Advice__Group__0_in_ruleAdvice1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdviceDeclaration_in_entryRuleAdviceDeclaration1436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdviceDeclaration1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdviceDeclaration__Group__0_in_ruleAdviceDeclaration1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryType_in_entryRuleQueryType1496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryType1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryType__Alternatives_in_ruleQueryType1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdviceType_in_entryRuleAdviceType1556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdviceType1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdviceType__Group__0_in_ruleAdviceType1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroAdviceQuery_in_entryRuleIntroAdviceQuery1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntroAdviceQuery1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntroAdviceQuery__NameAssignment_in_ruleIntroAdviceQuery1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntro_in_entryRuleIntro1676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntro1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intro__Group__0_in_ruleIntro1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroDeclaration_in_entryRuleIntroDeclaration1736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntroDeclaration1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntroDeclaration__Group__0_in_ruleIntroDeclaration1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroType_in_entryRuleIntroType1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntroType1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntroType__Group__0_in_ruleIntroType1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroQuery_in_entryRuleIntroQuery1856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntroQuery1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntroQuery__NameAssignment_in_ruleIntroQuery1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryDeclaration_in_entryRuleQueryDeclaration1916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryDeclaration1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryDeclaration__Group__0_in_ruleQueryDeclaration1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryBody_in_entryRuleQueryBody1976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryBody1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryBody__Group__0_in_ruleQueryBody2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_entryRuleOclExpression2096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclExpression2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OclExpression__ValueAssignment_in_ruleOclExpression2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_entryRuleNameChar2156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameChar2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameChar2192 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameChar2205 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Aspect__Alternatives2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectDefinition_in_rule__Aspect__Alternatives2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__0_in_rule__LetExpression__Alternatives2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__0_in_rule__LetExpression__Alternatives2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__0_in_rule__LetExpression__Alternatives2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_rule__Operation__Alternatives2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationContext_in_rule__Operation__Alternatives2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeContext_in_rule__Operation__Alternatives2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_rule__ContextDeclaration__Alternatives_12428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationContext_in_rule__ContextDeclaration__Alternatives_12445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Returntype__Alternatives2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Returntype__Alternatives2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Returntype__Alternatives2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Returntype__Alternatives2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Returntype__Alternatives2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_rule__Returntype__Alternatives2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdvice_in_rule__AI__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntro_in_rule__AI__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QueryType__Alternatives2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QueryType__Alternatives2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QueryType__Alternatives2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AdviceType__Alternatives_02734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AdviceType__Alternatives_02754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AdviceType__Alternatives_02774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__0_in_rule__Expression__Alternatives2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__02857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__02860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Mapping__Group__0__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__12919 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__12922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__MappingnameAssignment_1_in_rule__Mapping__Group__1__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__22979 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__22982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Mapping__Group__2__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__33041 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__33044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletExpression_in_rule__Mapping__Group__3__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__43100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mapping__Group__4__Impl3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__0__Impl_in_rule__LetExpression__Group_0__03169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__1_in_rule__LetExpression__Group_0__03172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LetExpression__Group_0__0__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__1__Impl_in_rule__LetExpression__Group_0__13231 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__2_in_rule__LetExpression__Group_0__13234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarName_in_rule__LetExpression__Group_0__1__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__2__Impl_in_rule__LetExpression__Group_0__23290 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__3_in_rule__LetExpression__Group_0__23293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LetExpression__Group_0__2__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__3__Impl_in_rule__LetExpression__Group_0__33352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__4_in_rule__LetExpression__Group_0__33355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LetExpression__Group_0__3__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__4__Impl_in_rule__LetExpression__Group_0__43414 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__5_in_rule__LetExpression__Group_0__43417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0_4__0_in_rule__LetExpression__Group_0__4__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0__5__Impl_in_rule__LetExpression__Group_0__53474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LetExpression__Group_0__5__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0_4__0__Impl_in_rule__LetExpression__Group_0_4__03545 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0_4__1_in_rule__LetExpression__Group_0_4__03548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__LetExpression__Group_0_4__0__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0_4__1__Impl_in_rule__LetExpression__Group_0_4__13604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0_4_1__0_in_rule__LetExpression__Group_0_4__1__Impl3631 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0_4_1__0__Impl_in_rule__LetExpression__Group_0_4_1__03666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0_4_1__1_in_rule__LetExpression__Group_0_4_1__03669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LetExpression__Group_0_4_1__0__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_0_4_1__1__Impl_in_rule__LetExpression__Group_0_4_1__13728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__LetExpression__Group_0_4_1__1__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__0__Impl_in_rule__LetExpression__Group_1__03788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__1_in_rule__LetExpression__Group_1__03791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LetExpression__Group_1__0__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__1__Impl_in_rule__LetExpression__Group_1__13850 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__2_in_rule__LetExpression__Group_1__13853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarName_in_rule__LetExpression__Group_1__1__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__2__Impl_in_rule__LetExpression__Group_1__23909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__3_in_rule__LetExpression__Group_1__23912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LetExpression__Group_1__2__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__3__Impl_in_rule__LetExpression__Group_1__33971 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__4_in_rule__LetExpression__Group_1__33974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarName_in_rule__LetExpression__Group_1__3__Impl4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__4__Impl_in_rule__LetExpression__Group_1__44030 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__5_in_rule__LetExpression__Group_1__44033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LetExpression__Group_1__4__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__5__Impl_in_rule__LetExpression__Group_1__54092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__6_in_rule__LetExpression__Group_1__54095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LetExpression__Group_1__5__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__6__Impl_in_rule__LetExpression__Group_1__64154 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__7_in_rule__LetExpression__Group_1__64157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_6__0_in_rule__LetExpression__Group_1__6__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__7__Impl_in_rule__LetExpression__Group_1__74214 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__8_in_rule__LetExpression__Group_1__74217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7__0_in_rule__LetExpression__Group_1__7__Impl4244 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__8__Impl_in_rule__LetExpression__Group_1__84275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LetExpression__Group_1__8__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_6__0__Impl_in_rule__LetExpression__Group_1_6__04352 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_6__1_in_rule__LetExpression__Group_1_6__04355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_rule__LetExpression__Group_1_6__0__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_6__1__Impl_in_rule__LetExpression__Group_1_6__14411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_6__2_in_rule__LetExpression__Group_1_6__14414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LetExpression__Group_1_6__1__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_6__2__Impl_in_rule__LetExpression__Group_1_6__24473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCOA_in_rule__LetExpression__Group_1_6__2__Impl4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7__0__Impl_in_rule__LetExpression__Group_1_7__04535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7__1_in_rule__LetExpression__Group_1_7__04538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LetExpression__Group_1_7__0__Impl4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7__1__Impl_in_rule__LetExpression__Group_1_7__14597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7_1__0_in_rule__LetExpression__Group_1_7__1__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7_1__0__Impl_in_rule__LetExpression__Group_1_7_1__04658 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7_1__1_in_rule__LetExpression__Group_1_7_1__04661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_rule__LetExpression__Group_1_7_1__0__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7_1__1__Impl_in_rule__LetExpression__Group_1_7_1__14717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7_1__2_in_rule__LetExpression__Group_1_7_1__14720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LetExpression__Group_1_7_1__1__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1_7_1__2__Impl_in_rule__LetExpression__Group_1_7_1__24779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCOA_in_rule__LetExpression__Group_1_7_1__2__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__0__Impl_in_rule__LetExpression__Group_2__04841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__1_in_rule__LetExpression__Group_2__04844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LetExpression__Group_2__0__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__1__Impl_in_rule__LetExpression__Group_2__14903 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__2_in_rule__LetExpression__Group_2__14906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarName_in_rule__LetExpression__Group_2__1__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__2__Impl_in_rule__LetExpression__Group_2__24962 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__3_in_rule__LetExpression__Group_2__24965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LetExpression__Group_2__2__Impl4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__3__Impl_in_rule__LetExpression__Group_2__35024 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__4_in_rule__LetExpression__Group_2__35027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarNameArray_in_rule__LetExpression__Group_2__3__Impl5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__4__Impl_in_rule__LetExpression__Group_2__45083 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__5_in_rule__LetExpression__Group_2__45086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LetExpression__Group_2__4__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__5__Impl_in_rule__LetExpression__Group_2__55145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__6_in_rule__LetExpression__Group_2__55148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LetExpression__Group_2__5__Impl5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__6__Impl_in_rule__LetExpression__Group_2__65207 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__7_in_rule__LetExpression__Group_2__65210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__0_in_rule__LetExpression__Group_2__6__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__7__Impl_in_rule__LetExpression__Group_2__75267 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__8_in_rule__LetExpression__Group_2__75270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7__0_in_rule__LetExpression__Group_2__7__Impl5297 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2__8__Impl_in_rule__LetExpression__Group_2__85328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LetExpression__Group_2__8__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__0__Impl_in_rule__LetExpression__Group_2_6__05405 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__1_in_rule__LetExpression__Group_2_6__05408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_6__0__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__1__Impl_in_rule__LetExpression__Group_2_6__15464 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__2_in_rule__LetExpression__Group_2_6__15467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LetExpression__Group_2_6__1__Impl5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__2__Impl_in_rule__LetExpression__Group_2_6__25526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__3_in_rule__LetExpression__Group_2_6__25529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LetExpression__Group_2_6__2__Impl5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__3__Impl_in_rule__LetExpression__Group_2_6__35588 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__4_in_rule__LetExpression__Group_2_6__35591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6_3__0_in_rule__LetExpression__Group_2_6__3__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6__4__Impl_in_rule__LetExpression__Group_2_6__45648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LetExpression__Group_2_6__4__Impl5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6_3__0__Impl_in_rule__LetExpression__Group_2_6_3__05717 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6_3__1_in_rule__LetExpression__Group_2_6_3__05720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_6_3__0__Impl5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6_3__1__Impl_in_rule__LetExpression__Group_2_6_3__15776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6_3_1__0_in_rule__LetExpression__Group_2_6_3__1__Impl5805 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6_3_1__0_in_rule__LetExpression__Group_2_6_3__1__Impl5817 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6_3_1__0__Impl_in_rule__LetExpression__Group_2_6_3_1__05854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6_3_1__1_in_rule__LetExpression__Group_2_6_3_1__05857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LetExpression__Group_2_6_3_1__0__Impl5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_6_3_1__1__Impl_in_rule__LetExpression__Group_2_6_3_1__15916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_6_3_1__1__Impl5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7__0__Impl_in_rule__LetExpression__Group_2_7__05976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7__1_in_rule__LetExpression__Group_2_7__05979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LetExpression__Group_2_7__0__Impl6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7__1__Impl_in_rule__LetExpression__Group_2_7__16038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__0_in_rule__LetExpression__Group_2_7__1__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__0__Impl_in_rule__LetExpression__Group_2_7_1__06099 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__1_in_rule__LetExpression__Group_2_7_1__06102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_7_1__0__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__1__Impl_in_rule__LetExpression__Group_2_7_1__16158 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__2_in_rule__LetExpression__Group_2_7_1__16161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LetExpression__Group_2_7_1__1__Impl6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__2__Impl_in_rule__LetExpression__Group_2_7_1__26220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__3_in_rule__LetExpression__Group_2_7_1__26223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LetExpression__Group_2_7_1__2__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__3__Impl_in_rule__LetExpression__Group_2_7_1__36282 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__4_in_rule__LetExpression__Group_2_7_1__36285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1_3__0_in_rule__LetExpression__Group_2_7_1__3__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1__4__Impl_in_rule__LetExpression__Group_2_7_1__46342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LetExpression__Group_2_7_1__4__Impl6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1_3__0__Impl_in_rule__LetExpression__Group_2_7_1_3__06411 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1_3__1_in_rule__LetExpression__Group_2_7_1_3__06414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_7_1_3__0__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1_3__1__Impl_in_rule__LetExpression__Group_2_7_1_3__16470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1_3_1__0_in_rule__LetExpression__Group_2_7_1_3__1__Impl6499 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1_3_1__0_in_rule__LetExpression__Group_2_7_1_3__1__Impl6511 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1_3_1__0__Impl_in_rule__LetExpression__Group_2_7_1_3_1__06548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1_3_1__1_in_rule__LetExpression__Group_2_7_1_3_1__06551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LetExpression__Group_2_7_1_3_1__0__Impl6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_2_7_1_3_1__1__Impl_in_rule__LetExpression__Group_2_7_1_3_1__16610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOA_in_rule__LetExpression__Group_2_7_1_3_1__1__Impl6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeContext__Group__0__Impl_in_rule__AttributeContext__Group__06670 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AttributeContext__Group__1_in_rule__AttributeContext__Group__06673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_rule__AttributeContext__Group__0__Impl6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeContext__Group__1__Impl_in_rule__AttributeContext__Group__16729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributeContext__Group__2_in_rule__AttributeContext__Group__16732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AttributeContext__Group__1__Impl6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeContext__Group__2__Impl_in_rule__AttributeContext__Group__26791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameChar_in_rule__AttributeContext__Group__2__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group__0__Impl_in_rule__LetVarNameArray__Group__06853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group__1_in_rule__LetVarNameArray__Group__06856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LetVarNameArray__Group__0__Impl6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group__1__Impl_in_rule__LetVarNameArray__Group__16915 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group__2_in_rule__LetVarNameArray__Group__16918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group_1__0_in_rule__LetVarNameArray__Group__1__Impl6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group__2__Impl_in_rule__LetVarNameArray__Group__26975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LetVarNameArray__Group__2__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group_1__0__Impl_in_rule__LetVarNameArray__Group_1__07040 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group_1__1_in_rule__LetVarNameArray__Group_1__07043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarName_in_rule__LetVarNameArray__Group_1__0__Impl7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group_1__1__Impl_in_rule__LetVarNameArray__Group_1__17099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group_1_1__0_in_rule__LetVarNameArray__Group_1__1__Impl7128 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group_1_1__0_in_rule__LetVarNameArray__Group_1__1__Impl7140 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group_1_1__0__Impl_in_rule__LetVarNameArray__Group_1_1__07177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group_1_1__1_in_rule__LetVarNameArray__Group_1_1__07180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LetVarNameArray__Group_1_1__0__Impl7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetVarNameArray__Group_1_1__1__Impl_in_rule__LetVarNameArray__Group_1_1__17239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleletVarName_in_rule__LetVarNameArray__Group_1_1__1__Impl7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__0__Impl_in_rule__AspectDefinition__Group__07299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__1_in_rule__AspectDefinition__Group__07302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AspectDefinition__Group__0__Impl7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__1__Impl_in_rule__AspectDefinition__Group__17361 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__2_in_rule__AspectDefinition__Group__17364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectName_in_rule__AspectDefinition__Group__1__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__2__Impl_in_rule__AspectDefinition__Group__27420 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__3_in_rule__AspectDefinition__Group__27423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AspectDefinition__Group__2__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__3__Impl_in_rule__AspectDefinition__Group__37482 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__4_in_rule__AspectDefinition__Group__37485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__MappingdeclarartionAssignment_3_in_rule__AspectDefinition__Group__3__Impl7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__4__Impl_in_rule__AspectDefinition__Group__47542 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__5_in_rule__AspectDefinition__Group__47545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__PointcutdeclarationAssignment_4_in_rule__AspectDefinition__Group__4__Impl7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__5__Impl_in_rule__AspectDefinition__Group__57602 = new BitSet(new long[]{0x0000003000070000L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__6_in_rule__AspectDefinition__Group__57605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDeclaration_in_rule__AspectDefinition__Group__5__Impl7632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__6__Impl_in_rule__AspectDefinition__Group__67661 = new BitSet(new long[]{0x0000003000070000L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__7_in_rule__AspectDefinition__Group__67664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryDeclaration_in_rule__AspectDefinition__Group__6__Impl7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__7__Impl_in_rule__AspectDefinition__Group__77723 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__8_in_rule__AspectDefinition__Group__77726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__AIDeclarationAssignment_7_in_rule__AspectDefinition__Group__7__Impl7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectDefinition__Group__8__Impl_in_rule__AspectDefinition__Group__87783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AspectDefinition__Group__8__Impl7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping_Declaration__Group__0__Impl_in_rule__Mapping_Declaration__Group__07860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapping_Declaration__Group__1_in_rule__Mapping_Declaration__Group__07863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Mapping_Declaration__Group__0__Impl7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping_Declaration__Group__1__Impl_in_rule__Mapping_Declaration__Group__17922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping_Declaration__Reference_mappingnameAssignment_1_in_rule__Mapping_Declaration__Group__1__Impl7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pointcut_Declaration__Group__0__Impl_in_rule__Pointcut_Declaration__Group__07983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pointcut_Declaration__Group__1_in_rule__Pointcut_Declaration__Group__07986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Pointcut_Declaration__Group__0__Impl8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pointcut_Declaration__Group__1__Impl_in_rule__Pointcut_Declaration__Group__18045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pointcut_Declaration__NameAssignment_1_in_rule__Pointcut_Declaration__Group__1__Impl8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextDeclaration__Group__0__Impl_in_rule__ContextDeclaration__Group__08106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContextDeclaration__Group__1_in_rule__ContextDeclaration__Group__08109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ContextDeclaration__Group__0__Impl8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextDeclaration__Group__1__Impl_in_rule__ContextDeclaration__Group__18168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextDeclaration__Alternatives_1_in_rule__ContextDeclaration__Group__1__Impl8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__0__Impl_in_rule__OperationContext__Group__08229 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__1_in_rule__OperationContext__Group__08232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierContext_in_rule__OperationContext__Group__0__Impl8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__1__Impl_in_rule__OperationContext__Group__18288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__2_in_rule__OperationContext__Group__18291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__OperationContext__Group__1__Impl8319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__2__Impl_in_rule__OperationContext__Group__28350 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__3_in_rule__OperationContext__Group__28353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationName_in_rule__OperationContext__Group__2__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__3__Impl_in_rule__OperationContext__Group__38409 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__4_in_rule__OperationContext__Group__38412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OperationContext__Group__3__Impl8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__4__Impl_in_rule__OperationContext__Group__48471 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__5_in_rule__OperationContext__Group__48474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_4__0_in_rule__OperationContext__Group__4__Impl8501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__5__Impl_in_rule__OperationContext__Group__58532 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__6_in_rule__OperationContext__Group__58535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OperationContext__Group__5__Impl8563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group__6__Impl_in_rule__OperationContext__Group__68594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_6__0_in_rule__OperationContext__Group__6__Impl8621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_4__0__Impl_in_rule__OperationContext__Group_4__08666 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_4__1_in_rule__OperationContext__Group_4__08669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_rule__OperationContext__Group_4__0__Impl8696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_4__1__Impl_in_rule__OperationContext__Group_4__18725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_4_1__0_in_rule__OperationContext__Group_4__1__Impl8752 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_4_1__0__Impl_in_rule__OperationContext__Group_4_1__08787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_4_1__1_in_rule__OperationContext__Group_4_1__08790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OperationContext__Group_4_1__0__Impl8818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_4_1__1__Impl_in_rule__OperationContext__Group_4_1__18849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_rule__OperationContext__Group_4_1__1__Impl8876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_6__0__Impl_in_rule__OperationContext__Group_6__08909 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_6__1_in_rule__OperationContext__Group_6__08912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__OperationContext__Group_6__0__Impl8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationContext__Group_6__1__Impl_in_rule__OperationContext__Group_6__18971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturntype_in_rule__OperationContext__Group_6__1__Impl8998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Advice__Group__0__Impl_in_rule__Advice__Group__09031 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__Advice__Group__1_in_rule__Advice__Group__09034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdviceDeclaration_in_rule__Advice__Group__0__Impl9061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Advice__Group__1__Impl_in_rule__Advice__Group__19090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Advice__Group__2_in_rule__Advice__Group__19093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Advice__AdvicetypeAssignment_1_in_rule__Advice__Group__1__Impl9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Advice__Group__2__Impl_in_rule__Advice__Group__29150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Advice__IntroadvicequeryAssignment_2_in_rule__Advice__Group__2__Impl9177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdviceDeclaration__Group__0__Impl_in_rule__AdviceDeclaration__Group__09213 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__AdviceDeclaration__Group__1_in_rule__AdviceDeclaration__Group__09216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AdviceDeclaration__Group__0__Impl9244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdviceDeclaration__Group__1__Impl_in_rule__AdviceDeclaration__Group__19275 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AdviceDeclaration__Group__2_in_rule__AdviceDeclaration__Group__19278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryType_in_rule__AdviceDeclaration__Group__1__Impl9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdviceDeclaration__Group__2__Impl_in_rule__AdviceDeclaration__Group__29334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AdviceDeclaration__Group__2__Impl9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdviceType__Group__0__Impl_in_rule__AdviceType__Group__09399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AdviceType__Group__1_in_rule__AdviceType__Group__09402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdviceType__Alternatives_0_in_rule__AdviceType__Group__0__Impl9429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdviceType__Group__1__Impl_in_rule__AdviceType__Group__19459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdviceType__NameAssignment_1_in_rule__AdviceType__Group__1__Impl9486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intro__Group__0__Impl_in_rule__Intro__Group__09520 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Intro__Group__1_in_rule__Intro__Group__09523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroDeclaration_in_rule__Intro__Group__0__Impl9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intro__Group__1__Impl_in_rule__Intro__Group__19579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Intro__Group__2_in_rule__Intro__Group__19582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intro__IntrotypeAssignment_1_in_rule__Intro__Group__1__Impl9609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intro__Group__2__Impl_in_rule__Intro__Group__29639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intro__IntroqueyAssignment_2_in_rule__Intro__Group__2__Impl9666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntroDeclaration__Group__0__Impl_in_rule__IntroDeclaration__Group__09702 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IntroDeclaration__Group__1_in_rule__IntroDeclaration__Group__09705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__IntroDeclaration__Group__0__Impl9733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntroDeclaration__Group__1__Impl_in_rule__IntroDeclaration__Group__19764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IntroDeclaration__Group__1__Impl9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntroType__Group__0__Impl_in_rule__IntroType__Group__09827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IntroType__Group__1_in_rule__IntroType__Group__09830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryType_in_rule__IntroType__Group__0__Impl9857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntroType__Group__1__Impl_in_rule__IntroType__Group__19886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntroType__NameAssignment_1_in_rule__IntroType__Group__1__Impl9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryDeclaration__Group__0__Impl_in_rule__QueryDeclaration__Group__09947 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QueryDeclaration__Group__1_in_rule__QueryDeclaration__Group__09950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryType_in_rule__QueryDeclaration__Group__0__Impl9977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryDeclaration__Group__1__Impl_in_rule__QueryDeclaration__Group__110006 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__QueryDeclaration__Group__2_in_rule__QueryDeclaration__Group__110009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QueryDeclaration__Group__1__Impl10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryDeclaration__Group__2__Impl_in_rule__QueryDeclaration__Group__210068 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__QueryDeclaration__Group__3_in_rule__QueryDeclaration__Group__210071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__QueryDeclaration__Group__2__Impl10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryDeclaration__Group__3__Impl_in_rule__QueryDeclaration__Group__310130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryBody_in_rule__QueryDeclaration__Group__3__Impl10157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryBody__Group__0__Impl_in_rule__QueryBody__Group__010194 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QueryBody__Group__1_in_rule__QueryBody__Group__010197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__QueryBody__Group__0__Impl10225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryBody__Group__1__Impl_in_rule__QueryBody__Group__110256 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__QueryBody__Group__2_in_rule__QueryBody__Group__110259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__QueryBody__Group__1__Impl10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryBody__Group__2__Impl_in_rule__QueryBody__Group__210315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__QueryBody__Group__2__Impl10343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__0__Impl_in_rule__Expression__Group_0__010380 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__1_in_rule__Expression__Group_0__010383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Expression__Group_0__0__Impl10411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__1__Impl_in_rule__Expression__Group_0__110442 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__2_in_rule__Expression__Group_0__110445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Expression__Group_0__1__Impl10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__2__Impl_in_rule__Expression__Group_0__210504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Expression__Group_0__2__Impl10532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__010569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__010572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__0_in_rule__Expression__Group_1__0__Impl10599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__110629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__NameAssignment_1_1_in_rule__Expression__Group_1__1__Impl10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__0__Impl_in_rule__Expression__Group_1_0__010690 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__1_in_rule__Expression__Group_1_0__010693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Expression__Group_1_0__0__Impl10721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__1__Impl_in_rule__Expression__Group_1_0__110752 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__2_in_rule__Expression__Group_1_0__110755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Expression__Group_1_0__1__Impl10783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__2__Impl_in_rule__Expression__Group_1_0__210814 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__3_in_rule__Expression__Group_1_0__210817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Expression__Group_1_0__2__Impl10845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__3__Impl_in_rule__Expression__Group_1_0__310876 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__4_in_rule__Expression__Group_1_0__310879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Expression__Group_1_0__3__Impl10907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__4__Impl_in_rule__Expression__Group_1_0__410938 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__5_in_rule__Expression__Group_1_0__410941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Expression__Group_1_0__4__Impl10969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0__5__Impl_in_rule__Expression__Group_1_0__511000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Expression__Group_1_0__5__Impl11028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_rule__Model__AspectAssignment11076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingName_in_rule__Mapping__MappingnameAssignment_111107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_Declaration_in_rule__AspectDefinition__MappingdeclarartionAssignment_311138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointcut_Declaration_in_rule__AspectDefinition__PointcutdeclarationAssignment_411169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAI_in_rule__AspectDefinition__AIDeclarationAssignment_711200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mapping_Declaration__Reference_mappingnameAssignment_111235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MappingName__NameAssignment11270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pointcut_Declaration__NameAssignment_111301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdviceType_in_rule__Advice__AdvicetypeAssignment_111332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroAdviceQuery_in_rule__Advice__IntroadvicequeryAssignment_211363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AdviceType__NameAssignment_111394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_rule__IntroAdviceQuery__NameAssignment11425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroType_in_rule__Intro__IntrotypeAssignment_111456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntroQuery_in_rule__Intro__IntroqueyAssignment_211487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntroType__NameAssignment_111518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_rule__IntroQuery__NameAssignment11549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_1_111580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OclExpression__ValueAssignment11611 = new BitSet(new long[]{0x0000000000000002L});

}