/*
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import su.nsk.iae.edtl.ide.contentassist.antlr.internal.InternalEdtlParser;
import su.nsk.iae.edtl.services.EdtlGrammarAccess;

public class EdtlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EdtlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EdtlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
			builder.put(grammarAccess.getVariableTypeAccess().getAlternatives(), "rule__VariableType__Alternatives");
			builder.put(grammarAccess.getVarAssignAccess().getValueAlternatives_2_0(), "rule__VarAssign__ValueAlternatives_2_0");
			builder.put(grammarAccess.getAND_OPERATORAccess().getAlternatives(), "rule__AND_OPERATOR__Alternatives");
			builder.put(grammarAccess.getUnOperatorAccess().getAlternatives(), "rule__UnOperator__Alternatives");
			builder.put(grammarAccess.getNotOperatorAccess().getAlternatives(), "rule__NotOperator__Alternatives");
			builder.put(grammarAccess.getUnExpressionAccess().getAlternatives(), "rule__UnExpression__Alternatives");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
			builder.put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
			builder.put(grammarAccess.getCrossVarAbbrAccess().getAlternatives(), "rule__CrossVarAbbr__Alternatives");
			builder.put(grammarAccess.getEquOperatorAccess().getAlternatives(), "rule__EquOperator__Alternatives");
			builder.put(grammarAccess.getCompOperatorAccess().getAlternatives(), "rule__CompOperator__Alternatives");
			builder.put(grammarAccess.getDeclVarInputAccess().getGroup(), "rule__DeclVarInput__Group__0");
			builder.put(grammarAccess.getDeclVarInputAccess().getGroup_2(), "rule__DeclVarInput__Group_2__0");
			builder.put(grammarAccess.getDeclVarInputAccess().getGroup_3(), "rule__DeclVarInput__Group_3__0");
			builder.put(grammarAccess.getDeclVarOutputAccess().getGroup(), "rule__DeclVarOutput__Group__0");
			builder.put(grammarAccess.getDeclVarOutputAccess().getGroup_2(), "rule__DeclVarOutput__Group_2__0");
			builder.put(grammarAccess.getDeclVarOutputAccess().getGroup_3(), "rule__DeclVarOutput__Group_3__0");
			builder.put(grammarAccess.getVarDeclarationAccess().getGroup(), "rule__VarDeclaration__Group__0");
			builder.put(grammarAccess.getVarDeclarationAccess().getGroup_1(), "rule__VarDeclaration__Group_1__0");
			builder.put(grammarAccess.getVarInitAccess().getGroup(), "rule__VarInit__Group__0");
			builder.put(grammarAccess.getVarInitAccess().getGroup_2(), "rule__VarInit__Group_2__0");
			builder.put(grammarAccess.getVarAssignAccess().getGroup(), "rule__VarAssign__Group__0");
			builder.put(grammarAccess.getAbbrAccess().getGroup(), "rule__Abbr__Group__0");
			builder.put(grammarAccess.getMacrosAccess().getGroup(), "rule__Macros__Group__0");
			builder.put(grammarAccess.getVarListAccess().getGroup(), "rule__VarList__Group__0");
			builder.put(grammarAccess.getVarListAccess().getGroup_1(), "rule__VarList__Group_1__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_2(), "rule__Requirement__Group_2__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_2_4(), "rule__Requirement__Group_2_4__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_3(), "rule__Requirement__Group_3__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_3_4(), "rule__Requirement__Group_3_4__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_4(), "rule__Requirement__Group_4__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_4_4(), "rule__Requirement__Group_4_4__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_5(), "rule__Requirement__Group_5__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_5_4(), "rule__Requirement__Group_5_4__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_6(), "rule__Requirement__Group_6__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_6_4(), "rule__Requirement__Group_6_4__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_7(), "rule__Requirement__Group_7__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup_7_4(), "rule__Requirement__Group_7_4__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getXorExpressionAccess().getGroup(), "rule__XorExpression__Group__0");
			builder.put(grammarAccess.getXorExpressionAccess().getGroup_1(), "rule__XorExpression__Group_1__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
			builder.put(grammarAccess.getCompExpressionAccess().getGroup(), "rule__CompExpression__Group__0");
			builder.put(grammarAccess.getCompExpressionAccess().getGroup_1(), "rule__CompExpression__Group_1__0");
			builder.put(grammarAccess.getEquExpressionAccess().getGroup(), "rule__EquExpression__Group__0");
			builder.put(grammarAccess.getEquExpressionAccess().getGroup_1(), "rule__EquExpression__Group_1__0");
			builder.put(grammarAccess.getUnExpressionAccess().getGroup_1(), "rule__UnExpression__Group_1__0");
			builder.put(grammarAccess.getTauExpressionAccess().getGroup(), "rule__TauExpression__Group__0");
			builder.put(grammarAccess.getTimeLiteralAccess().getGroup(), "rule__TimeLiteral__Group__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_3(), "rule__PrimaryExpression__Group_3__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_4(), "rule__PrimaryExpression__Group_4__0");
			builder.put(grammarAccess.getParamAssignmentElementsAccess().getGroup(), "rule__ParamAssignmentElements__Group__0");
			builder.put(grammarAccess.getParamAssignmentElementsAccess().getGroup_1(), "rule__ParamAssignmentElements__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getDeclVarInputAssignment_0(), "rule__Model__DeclVarInputAssignment_0");
			builder.put(grammarAccess.getModelAccess().getDeclVarOutputAssignment_1(), "rule__Model__DeclVarOutputAssignment_1");
			builder.put(grammarAccess.getModelAccess().getVarInitsAssignment_2(), "rule__Model__VarInitsAssignment_2");
			builder.put(grammarAccess.getModelAccess().getAbbrsAssignment_3(), "rule__Model__AbbrsAssignment_3");
			builder.put(grammarAccess.getModelAccess().getMacrosesAssignment_4(), "rule__Model__MacrosesAssignment_4");
			builder.put(grammarAccess.getModelAccess().getReqsAssignment_5(), "rule__Model__ReqsAssignment_5");
			builder.put(grammarAccess.getDeclVarInputAccess().getInputCounterAssignment_2_2(), "rule__DeclVarInput__InputCounterAssignment_2_2");
			builder.put(grammarAccess.getDeclVarInputAccess().getVarDeclsAssignment_3_0(), "rule__DeclVarInput__VarDeclsAssignment_3_0");
			builder.put(grammarAccess.getDeclVarOutputAccess().getOutputCounterAssignment_2_2(), "rule__DeclVarOutput__OutputCounterAssignment_2_2");
			builder.put(grammarAccess.getDeclVarOutputAccess().getVarDeclsAssignment_3_0(), "rule__DeclVarOutput__VarDeclsAssignment_3_0");
			builder.put(grammarAccess.getVarDeclarationAccess().getVAssignment_0(), "rule__VarDeclaration__VAssignment_0");
			builder.put(grammarAccess.getVarDeclarationAccess().getLocationAssignment_1_1(), "rule__VarDeclaration__LocationAssignment_1_1");
			builder.put(grammarAccess.getVarDeclarationAccess().getTypeAssignment_3(), "rule__VarDeclaration__TypeAssignment_3");
			builder.put(grammarAccess.getVarInitAccess().getVarAssignAssignment_2_0(), "rule__VarInit__VarAssignAssignment_2_0");
			builder.put(grammarAccess.getVarAssignAccess().getVariableAssignment_0(), "rule__VarAssign__VariableAssignment_0");
			builder.put(grammarAccess.getVarAssignAccess().getValueAssignment_2(), "rule__VarAssign__ValueAssignment_2");
			builder.put(grammarAccess.getAbbrAccess().getNameAssignment_1(), "rule__Abbr__NameAssignment_1");
			builder.put(grammarAccess.getAbbrAccess().getExprAssignment_2(), "rule__Abbr__ExprAssignment_2");
			builder.put(grammarAccess.getMacrosAccess().getNameAssignment_1(), "rule__Macros__NameAssignment_1");
			builder.put(grammarAccess.getMacrosAccess().getArgsAssignment_3(), "rule__Macros__ArgsAssignment_3");
			builder.put(grammarAccess.getMacrosAccess().getExprAssignment_5(), "rule__Macros__ExprAssignment_5");
			builder.put(grammarAccess.getVarListAccess().getVarsAssignment_0(), "rule__VarList__VarsAssignment_0");
			builder.put(grammarAccess.getVarListAccess().getVarsAssignment_1_1(), "rule__VarList__VarsAssignment_1_1");
			builder.put(grammarAccess.getRequirementAccess().getNameAssignment_1(), "rule__Requirement__NameAssignment_1");
			builder.put(grammarAccess.getRequirementAccess().getTrigExprAssignment_2_2(), "rule__Requirement__TrigExprAssignment_2_2");
			builder.put(grammarAccess.getRequirementAccess().getNlTrigAssignment_2_4_1(), "rule__Requirement__NlTrigAssignment_2_4_1");
			builder.put(grammarAccess.getRequirementAccess().getInvExprAssignment_3_2(), "rule__Requirement__InvExprAssignment_3_2");
			builder.put(grammarAccess.getRequirementAccess().getNlInvAssignment_3_4_1(), "rule__Requirement__NlInvAssignment_3_4_1");
			builder.put(grammarAccess.getRequirementAccess().getFinalExprAssignment_4_2(), "rule__Requirement__FinalExprAssignment_4_2");
			builder.put(grammarAccess.getRequirementAccess().getNlFinalAssignment_4_4_1(), "rule__Requirement__NlFinalAssignment_4_4_1");
			builder.put(grammarAccess.getRequirementAccess().getDelayExprAssignment_5_2(), "rule__Requirement__DelayExprAssignment_5_2");
			builder.put(grammarAccess.getRequirementAccess().getNlDelayAssignment_5_4_1(), "rule__Requirement__NlDelayAssignment_5_4_1");
			builder.put(grammarAccess.getRequirementAccess().getReacExprAssignment_6_2(), "rule__Requirement__ReacExprAssignment_6_2");
			builder.put(grammarAccess.getRequirementAccess().getNlReacAssignment_6_4_1(), "rule__Requirement__NlReacAssignment_6_4_1");
			builder.put(grammarAccess.getRequirementAccess().getRelExprAssignment_7_2(), "rule__Requirement__RelExprAssignment_7_2");
			builder.put(grammarAccess.getRequirementAccess().getNlRelAssignment_7_4_1(), "rule__Requirement__NlRelAssignment_7_4_1");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
			builder.put(grammarAccess.getExpressionAccess().getOrOpAssignment_1_1(), "rule__Expression__OrOpAssignment_1_1");
			builder.put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
			builder.put(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2(), "rule__XorExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getAndExpressionAccess().getAndOpAssignment_1_1(), "rule__AndExpression__AndOpAssignment_1_1");
			builder.put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getCompExpressionAccess().getCompOpAssignment_1_1(), "rule__CompExpression__CompOpAssignment_1_1");
			builder.put(grammarAccess.getCompExpressionAccess().getRightAssignment_1_2(), "rule__CompExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getEquExpressionAccess().getEquOpAssignment_1_1(), "rule__EquExpression__EquOpAssignment_1_1");
			builder.put(grammarAccess.getEquExpressionAccess().getRightAssignment_1_2(), "rule__EquExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getUnExpressionAccess().getUnOpAssignment_1_0(), "rule__UnExpression__UnOpAssignment_1_0");
			builder.put(grammarAccess.getUnExpressionAccess().getRightAssignment_1_1(), "rule__UnExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getTauExpressionAccess().getTimeAssignment_2(), "rule__TauExpression__TimeAssignment_2");
			builder.put(grammarAccess.getTimeLiteralAccess().getIntervalAssignment_1(), "rule__TimeLiteral__IntervalAssignment_1");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getConstantAssignment_0(), "rule__PrimaryExpression__ConstantAssignment_0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getTauAssignment_1(), "rule__PrimaryExpression__TauAssignment_1");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getVAssignment_2(), "rule__PrimaryExpression__VAssignment_2");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getMacrosAssignment_3_0(), "rule__PrimaryExpression__MacrosAssignment_3_0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_3_2(), "rule__PrimaryExpression__ArgsAssignment_3_2");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getNestExprAssignment_4_1(), "rule__PrimaryExpression__NestExprAssignment_4_1");
			builder.put(grammarAccess.getParamAssignmentElementsAccess().getElementsAssignment_0(), "rule__ParamAssignmentElements__ElementsAssignment_0");
			builder.put(grammarAccess.getParamAssignmentElementsAccess().getElementsAssignment_1_1(), "rule__ParamAssignmentElements__ElementsAssignment_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EdtlGrammarAccess grammarAccess;

	@Override
	protected InternalEdtlParser createParser() {
		InternalEdtlParser result = new InternalEdtlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EdtlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EdtlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
