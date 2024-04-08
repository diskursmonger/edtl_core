/*
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import su.nsk.iae.edtl.edtl.Abbr;
import su.nsk.iae.edtl.edtl.AndExpression;
import su.nsk.iae.edtl.edtl.CompExpression;
import su.nsk.iae.edtl.edtl.DeclVarInput;
import su.nsk.iae.edtl.edtl.DeclVarOutput;
import su.nsk.iae.edtl.edtl.EdtlPackage;
import su.nsk.iae.edtl.edtl.EquExpression;
import su.nsk.iae.edtl.edtl.Expression;
import su.nsk.iae.edtl.edtl.Macros;
import su.nsk.iae.edtl.edtl.Model;
import su.nsk.iae.edtl.edtl.ParamAssignmentElements;
import su.nsk.iae.edtl.edtl.PrimaryExpression;
import su.nsk.iae.edtl.edtl.Requirement;
import su.nsk.iae.edtl.edtl.TauExpression;
import su.nsk.iae.edtl.edtl.TimeLiteral;
import su.nsk.iae.edtl.edtl.UnExpression;
import su.nsk.iae.edtl.edtl.VarAssign;
import su.nsk.iae.edtl.edtl.VarDeclaration;
import su.nsk.iae.edtl.edtl.VarInit;
import su.nsk.iae.edtl.edtl.VarList;
import su.nsk.iae.edtl.edtl.Variable;
import su.nsk.iae.edtl.edtl.XorExpression;
import su.nsk.iae.edtl.services.EdtlGrammarAccess;

@SuppressWarnings("all")
public class EdtlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EdtlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EdtlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EdtlPackage.ABBR:
				sequence_Abbr(context, (Abbr) semanticObject); 
				return; 
			case EdtlPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case EdtlPackage.COMP_EXPRESSION:
				sequence_CompExpression(context, (CompExpression) semanticObject); 
				return; 
			case EdtlPackage.DECL_VAR_INPUT:
				sequence_DeclVarInput(context, (DeclVarInput) semanticObject); 
				return; 
			case EdtlPackage.DECL_VAR_OUTPUT:
				sequence_DeclVarOutput(context, (DeclVarOutput) semanticObject); 
				return; 
			case EdtlPackage.EQU_EXPRESSION:
				sequence_EquExpression(context, (EquExpression) semanticObject); 
				return; 
			case EdtlPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case EdtlPackage.MACROS:
				sequence_Macros(context, (Macros) semanticObject); 
				return; 
			case EdtlPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case EdtlPackage.PARAM_ASSIGNMENT_ELEMENTS:
				sequence_ParamAssignmentElements(context, (ParamAssignmentElements) semanticObject); 
				return; 
			case EdtlPackage.PRIMARY_EXPRESSION:
				sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
				return; 
			case EdtlPackage.REQUIREMENT:
				sequence_Requirement(context, (Requirement) semanticObject); 
				return; 
			case EdtlPackage.TAU_EXPRESSION:
				sequence_TauExpression(context, (TauExpression) semanticObject); 
				return; 
			case EdtlPackage.TIME_LITERAL:
				sequence_TimeLiteral(context, (TimeLiteral) semanticObject); 
				return; 
			case EdtlPackage.UN_EXPRESSION:
				sequence_UnExpression(context, (UnExpression) semanticObject); 
				return; 
			case EdtlPackage.VAR_ASSIGN:
				sequence_VarAssign(context, (VarAssign) semanticObject); 
				return; 
			case EdtlPackage.VAR_DECLARATION:
				sequence_VarDeclaration(context, (VarDeclaration) semanticObject); 
				return; 
			case EdtlPackage.VAR_INIT:
				sequence_VarInit(context, (VarInit) semanticObject); 
				return; 
			case EdtlPackage.VAR_LIST:
				sequence_VarList(context, (VarList) semanticObject); 
				return; 
			case EdtlPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case EdtlPackage.XOR_EXPRESSION:
				sequence_XorExpression(context, (XorExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Abbr returns Abbr
	 *     CrossVarAbbr returns Abbr
	 *
	 * Constraint:
	 *     (name=ID expr=Expression)
	 * </pre>
	 */
	protected void sequence_Abbr(ISerializationContext context, Abbr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.CROSS_VAR_ABBR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.CROSS_VAR_ABBR__NAME));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.ABBR__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.ABBR__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAbbrAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAbbrAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns AndExpression
	 *     Expression.Expression_1_0 returns AndExpression
	 *     XorExpression returns AndExpression
	 *     XorExpression.XorExpression_1_0 returns AndExpression
	 *     AndExpression returns AndExpression
	 *     AndExpression.AndExpression_1_0 returns AndExpression
	 *
	 * Constraint:
	 *     (left=AndExpression_AndExpression_1_0 andOp=AND_OPERATOR right=CompExpression)
	 * </pre>
	 */
	protected void sequence_AndExpression(ISerializationContext context, AndExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.AND_EXPRESSION__AND_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.AND_EXPRESSION__AND_OP));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0(), semanticObject.getAndOp());
		feeder.accept(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns CompExpression
	 *     Expression.Expression_1_0 returns CompExpression
	 *     XorExpression returns CompExpression
	 *     XorExpression.XorExpression_1_0 returns CompExpression
	 *     AndExpression returns CompExpression
	 *     AndExpression.AndExpression_1_0 returns CompExpression
	 *     CompExpression returns CompExpression
	 *     CompExpression.CompExpression_1_0 returns CompExpression
	 *
	 * Constraint:
	 *     (left=CompExpression_CompExpression_1_0 compOp=CompOperator right=AndExpression)
	 * </pre>
	 */
	protected void sequence_CompExpression(ISerializationContext context, CompExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.COMP_EXPRESSION__COMP_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.COMP_EXPRESSION__COMP_OP));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0(), semanticObject.getCompOp());
		feeder.accept(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclVarInput returns DeclVarInput
	 *
	 * Constraint:
	 *     (inputCounter=INTEGER? varDecls+=VarDeclaration*)
	 * </pre>
	 */
	protected void sequence_DeclVarInput(ISerializationContext context, DeclVarInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclVarOutput returns DeclVarOutput
	 *
	 * Constraint:
	 *     (outputCounter=INTEGER? varDecls+=VarDeclaration*)
	 * </pre>
	 */
	protected void sequence_DeclVarOutput(ISerializationContext context, DeclVarOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns EquExpression
	 *     Expression.Expression_1_0 returns EquExpression
	 *     XorExpression returns EquExpression
	 *     XorExpression.XorExpression_1_0 returns EquExpression
	 *     AndExpression returns EquExpression
	 *     AndExpression.AndExpression_1_0 returns EquExpression
	 *     CompExpression returns EquExpression
	 *     CompExpression.CompExpression_1_0 returns EquExpression
	 *     EquExpression returns EquExpression
	 *     EquExpression.EquExpression_1_0 returns EquExpression
	 *
	 * Constraint:
	 *     (left=EquExpression_EquExpression_1_0 equOp=EquOperator right=UnExpression)
	 * </pre>
	 */
	protected void sequence_EquExpression(ISerializationContext context, EquExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EQU_EXPRESSION__EQU_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EQU_EXPRESSION__EQU_OP));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0(), semanticObject.getEquOp());
		feeder.accept(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Expression
	 *     Expression.Expression_1_0 returns Expression
	 *
	 * Constraint:
	 *     (left=Expression_Expression_1_0 orOp=OR_OPERATOR right=XorExpression)
	 * </pre>
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__OR_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__OR_OP));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpressionAccess().getOrOpOR_OPERATORTerminalRuleCall_1_1_0(), semanticObject.getOrOp());
		feeder.accept(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Macros returns Macros
	 *
	 * Constraint:
	 *     (name=ID args=VarList? expr=Expression)
	 * </pre>
	 */
	protected void sequence_Macros(ISerializationContext context, Macros semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         declVarInput+=DeclVarInput | 
	 *         declVarOutput+=DeclVarOutput | 
	 *         varInits+=VarInit | 
	 *         abbrs+=Abbr | 
	 *         macroses+=Macros | 
	 *         reqs+=Requirement
	 *     )+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ParamAssignmentElements returns ParamAssignmentElements
	 *
	 * Constraint:
	 *     (elements+=[CrossVarAbbr|ID] elements+=[CrossVarAbbr|ID]*)
	 * </pre>
	 */
	protected void sequence_ParamAssignmentElements(ISerializationContext context, ParamAssignmentElements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns PrimaryExpression
	 *     Expression.Expression_1_0 returns PrimaryExpression
	 *     XorExpression returns PrimaryExpression
	 *     XorExpression.XorExpression_1_0 returns PrimaryExpression
	 *     AndExpression returns PrimaryExpression
	 *     AndExpression.AndExpression_1_0 returns PrimaryExpression
	 *     CompExpression returns PrimaryExpression
	 *     CompExpression.CompExpression_1_0 returns PrimaryExpression
	 *     EquExpression returns PrimaryExpression
	 *     EquExpression.EquExpression_1_0 returns PrimaryExpression
	 *     UnExpression returns PrimaryExpression
	 *     PrimaryExpression returns PrimaryExpression
	 *
	 * Constraint:
	 *     (constant=Constant | tau=TauExpression | v=[CrossVarAbbr|ID] | (macros=[Macros|ID] args=ParamAssignmentElements?) | nestExpr=Expression)
	 * </pre>
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, PrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Requirement returns Requirement
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (trigExpr=Expression nlTrig=STRING?)? 
	 *         (invExpr=Expression nlInv=STRING?)? 
	 *         (finalExpr=Expression nlFinal=STRING?)? 
	 *         (delayExpr=Expression nlDelay=STRING?)? 
	 *         (reacExpr=Expression nlReac=STRING?)? 
	 *         (relExpr=Expression nlRel=STRING?)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Requirement(ISerializationContext context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TauExpression returns TauExpression
	 *
	 * Constraint:
	 *     time=TimeLiteral
	 * </pre>
	 */
	protected void sequence_TauExpression(ISerializationContext context, TauExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.TAU_EXPRESSION__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.TAU_EXPRESSION__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TimeLiteral returns TimeLiteral
	 *
	 * Constraint:
	 *     interval=INTERVAL
	 * </pre>
	 */
	protected void sequence_TimeLiteral(ISerializationContext context, TimeLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.TIME_LITERAL__INTERVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.TIME_LITERAL__INTERVAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_1_0(), semanticObject.getInterval());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns UnExpression
	 *     Expression.Expression_1_0 returns UnExpression
	 *     XorExpression returns UnExpression
	 *     XorExpression.XorExpression_1_0 returns UnExpression
	 *     AndExpression returns UnExpression
	 *     AndExpression.AndExpression_1_0 returns UnExpression
	 *     CompExpression returns UnExpression
	 *     CompExpression.CompExpression_1_0 returns UnExpression
	 *     EquExpression returns UnExpression
	 *     EquExpression.EquExpression_1_0 returns UnExpression
	 *     UnExpression returns UnExpression
	 *
	 * Constraint:
	 *     (unOp=UnOperator right=PrimaryExpression)
	 * </pre>
	 */
	protected void sequence_UnExpression(ISerializationContext context, UnExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.UN_EXPRESSION__UN_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.UN_EXPRESSION__UN_OP));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0(), semanticObject.getUnOp());
		feeder.accept(grammarAccess.getUnExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VarAssign returns VarAssign
	 *
	 * Constraint:
	 *     (variable=[Variable|ID] (value=INTEGER | value=BOOLEAN_LITERAL))
	 * </pre>
	 */
	protected void sequence_VarAssign(ISerializationContext context, VarAssign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VarDeclaration returns VarDeclaration
	 *
	 * Constraint:
	 *     (v=Variable location=DIRECT_VARIABLE? type=VariableType)
	 * </pre>
	 */
	protected void sequence_VarDeclaration(ISerializationContext context, VarDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VarInit returns VarInit
	 *
	 * Constraint:
	 *     varAssign+=VarAssign*
	 * </pre>
	 */
	protected void sequence_VarInit(ISerializationContext context, VarInit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VarList returns VarList
	 *
	 * Constraint:
	 *     (vars+=Variable vars+=Variable*)
	 * </pre>
	 */
	protected void sequence_VarList(ISerializationContext context, VarList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Variable returns Variable
	 *     CrossVarAbbr returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.CROSS_VAR_ABBR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.CROSS_VAR_ABBR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns XorExpression
	 *     Expression.Expression_1_0 returns XorExpression
	 *     XorExpression returns XorExpression
	 *     XorExpression.XorExpression_1_0 returns XorExpression
	 *
	 * Constraint:
	 *     (left=XorExpression_XorExpression_1_0 right=AndExpression)
	 * </pre>
	 */
	protected void sequence_XorExpression(ISerializationContext context, XorExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdtlPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
}
