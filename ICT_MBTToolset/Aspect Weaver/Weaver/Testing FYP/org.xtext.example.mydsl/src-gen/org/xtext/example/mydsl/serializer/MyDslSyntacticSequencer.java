/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AdviceType_AndKeyword_0_0_or_OrKeyword_0_1_or_XorKeyword_0_2;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_AdviceType_AndKeyword_0_0_or_OrKeyword_0_1_or_XorKeyword_0_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAdviceTypeAccess().getAndKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getAdviceTypeAccess().getOrKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getAdviceTypeAccess().getXorKeyword_0_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAdviceDeclarationRule())
			return getAdviceDeclarationToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getAspectNameRule())
			return getAspectNameToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getContextDeclarationRule())
			return getContextDeclarationToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIntroDeclarationRule())
			return getIntroDeclarationToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQueryTypeRule())
			return getQueryTypeToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLetExpressionRule())
			return getletExpressionToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * AdviceDeclaration:
	 * 	'advice' QueryType ':' ;
	 */
	protected String getAdviceDeclarationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "advicepre:";
	}
	
	/**
	 * AspectName:
	 *   NameChar;
	 */
	protected String getAspectNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * ContextDeclaration:
	 * 	'context' (ClassifierContext|OperationContext);
	 */
	protected String getContextDeclarationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "context";
	}
	
	/**
	 * IntroDeclaration:
	 * 	'intro'  ':';
	 */
	protected String getIntroDeclarationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "intro:";
	}
	
	/**
	 * QueryType:
	 * 	'pre' |  'post' | 'inv';
	 */
	protected String getQueryTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "pre";
	}
	
	/**
	 * letExpression:
	 * 	( 'let' letVarName ':'
	 * 		'{'
	 * 			(Operation(','Operation)*)
	 * 		'}'
	 * 	)
	 * 	
	 * 	|
	 * 	(
	 * 		'let' letVarName '->' letVarName ':'
	 * 		'{'
	 * 			(COA '->' SCOA) (',' (COA '->' SCOA ))*
	 * 		
	 * 		'}'
	 * 		
	 * 	)
	 * 	
	 * 	|
	 * 	
	 * 	(
	 * 		'let' letVarName '->' letVarNameArray ':'
	 * 		'{'
	 * 		      (COA '->' '{' ( COA(','COA)+ )  '}')(','(COA '->' '{' ( COA(','COA)+ )  '}') )*	
	 * 		
	 * 		'}'
	 * 		
	 * 	);
	 */
	protected String getletExpressionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "let:{}";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AdviceType_AndKeyword_0_0_or_OrKeyword_0_1_or_XorKeyword_0_2.equals(syntax))
				emit_AdviceType_AndKeyword_0_0_or_OrKeyword_0_1_or_XorKeyword_0_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'and' | 'or' | 'xor'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_AdviceType_AndKeyword_0_0_or_OrKeyword_0_1_or_XorKeyword_0_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}