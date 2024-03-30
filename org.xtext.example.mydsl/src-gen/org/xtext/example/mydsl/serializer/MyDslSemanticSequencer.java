/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.serializer;

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
import org.xtext.example.mydsl.myDsl.Div;
import org.xtext.example.mydsl.myDsl.Let;
import org.xtext.example.mydsl.myDsl.MathExp;
import org.xtext.example.mydsl.myDsl.MathExpression;
import org.xtext.example.mydsl.myDsl.Minus;
import org.xtext.example.mydsl.myDsl.Mult;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.MyNumber;
import org.xtext.example.mydsl.myDsl.Plus;
import org.xtext.example.mydsl.myDsl.variableUse;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.DIV:
				sequence_Term(context, (Div) semanticObject); 
				return; 
			case MyDslPackage.LET:
				sequence_Let(context, (Let) semanticObject); 
				return; 
			case MyDslPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MyDslPackage.MATH_EXPRESSION:
				sequence_MathExpression(context, (MathExpression) semanticObject); 
				return; 
			case MyDslPackage.MINUS:
				sequence_Exp(context, (Minus) semanticObject); 
				return; 
			case MyDslPackage.MULT:
				sequence_Term(context, (Mult) semanticObject); 
				return; 
			case MyDslPackage.MY_NUMBER:
				sequence_Primary(context, (MyNumber) semanticObject); 
				return; 
			case MyDslPackage.PLUS:
				sequence_Exp(context, (Plus) semanticObject); 
				return; 
			case MyDslPackage.VARIABLE_USE:
				sequence_VariableUse(context, (variableUse) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Minus
	 *     Exp.Plus_1_0_0 returns Minus
	 *     Exp.Minus_1_1_0 returns Minus
	 *     Term returns Minus
	 *     Term.Mult_1_0_0 returns Minus
	 *     Term.Div_1_1_0 returns Minus
	 *     Primary returns Minus
	 *
	 * Constraint:
	 *     (left=Exp_Minus_1_1_0 right=Term)
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getMinusLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Plus
	 *     Exp.Plus_1_0_0 returns Plus
	 *     Exp.Minus_1_1_0 returns Plus
	 *     Term returns Plus
	 *     Term.Mult_1_0_0 returns Plus
	 *     Term.Div_1_1_0 returns Plus
	 *     Primary returns Plus
	 *
	 * Constraint:
	 *     (left=Exp_Plus_1_0_0 right=Term)
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Let
	 *     Exp.Plus_1_0_0 returns Let
	 *     Exp.Minus_1_1_0 returns Let
	 *     Term returns Let
	 *     Term.Mult_1_0_0 returns Let
	 *     Term.Div_1_1_0 returns Let
	 *     Primary returns Let
	 *     Let returns Let
	 *
	 * Constraint:
	 *     (name=ID bind=Exp varName=Exp)
	 * </pre>
	 */
	protected void sequence_Let(ISerializationContext context, Let semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LET__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LET__BIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LET__BIND));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LET__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LET__VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLetAccess().getBindExpParserRuleCall_4_0(), semanticObject.getBind());
		feeder.accept(grammarAccess.getLetAccess().getVarNameExpParserRuleCall_6_0(), semanticObject.getVarName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     (name=ID exp=Exp)
	 * </pre>
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MATH_EXP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MATH_EXP__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MATH_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MATH_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MathExpression returns MathExpression
	 *
	 * Constraint:
	 *     expressions+=MathExp+
	 * </pre>
	 */
	protected void sequence_MathExpression(ISerializationContext context, MathExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns MyNumber
	 *     Exp.Plus_1_0_0 returns MyNumber
	 *     Exp.Minus_1_1_0 returns MyNumber
	 *     Term returns MyNumber
	 *     Term.Mult_1_0_0 returns MyNumber
	 *     Term.Div_1_1_0 returns MyNumber
	 *     Primary returns MyNumber
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, MyNumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MY_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MY_NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Div
	 *     Exp.Plus_1_0_0 returns Div
	 *     Exp.Minus_1_1_0 returns Div
	 *     Term returns Div
	 *     Term.Mult_1_0_0 returns Div
	 *     Term.Div_1_1_0 returns Div
	 *     Primary returns Div
	 *
	 * Constraint:
	 *     (left=Term_Div_1_1_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_Term(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTermAccess().getDivLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Mult
	 *     Exp.Plus_1_0_0 returns Mult
	 *     Exp.Minus_1_1_0 returns Mult
	 *     Term returns Mult
	 *     Term.Mult_1_0_0 returns Mult
	 *     Term.Div_1_1_0 returns Mult
	 *     Primary returns Mult
	 *
	 * Constraint:
	 *     (left=Term_Mult_1_0_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_Term(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTermAccess().getMultLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns variableUse
	 *     Exp.Plus_1_0_0 returns variableUse
	 *     Exp.Minus_1_1_0 returns variableUse
	 *     Term returns variableUse
	 *     Term.Mult_1_0_0 returns variableUse
	 *     Term.Div_1_1_0 returns variableUse
	 *     Primary returns variableUse
	 *     VariableUse returns variableUse
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_VariableUse(ISerializationContext context, variableUse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VARIABLE_USE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VARIABLE_USE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableUseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
