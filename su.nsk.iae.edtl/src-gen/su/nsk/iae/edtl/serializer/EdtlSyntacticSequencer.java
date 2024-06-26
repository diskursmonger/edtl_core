/*
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import su.nsk.iae.edtl.services.EdtlGrammarAccess;

@SuppressWarnings("all")
public class EdtlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EdtlGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EdtlGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDECL_SYMBRule())
			return getDECL_SYMBToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTIME_PREF_LITERALRule())
			return getTIME_PREF_LITERALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getXOR_OPERATORRule())
			return getXOR_OPERATORToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal DECL_SYMB:
	 * 	':=';
	 */
	protected String getDECL_SYMBToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	
	/**
	 * TIME_PREF_LITERAL returns ecore::EString:
	 * 	'#T';
	 */
	protected String getTIME_PREF_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#T";
	}
	
	/**
	 * XOR_OPERATOR:
	 * 	'XOR';
	 */
	protected String getXOR_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "XOR";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
