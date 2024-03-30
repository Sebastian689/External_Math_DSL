/*
 * generated by Xtext 2.33.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
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
}

// Entry rule entryRuleMathExpression
entryRuleMathExpression
:
{ before(grammarAccess.getMathExpressionRule()); }
	 ruleMathExpression
{ after(grammarAccess.getMathExpressionRule()); } 
	 EOF 
;

// Rule MathExpression
ruleMathExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getMathExpressionAccess().getExpressionsAssignment()); }
			(rule__MathExpression__ExpressionsAssignment)
			{ after(grammarAccess.getMathExpressionAccess().getExpressionsAssignment()); }
		)
		(
			{ before(grammarAccess.getMathExpressionAccess().getExpressionsAssignment()); }
			(rule__MathExpression__ExpressionsAssignment)*
			{ after(grammarAccess.getMathExpressionAccess().getExpressionsAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMathExp
entryRuleMathExp
:
{ before(grammarAccess.getMathExpRule()); }
	 ruleMathExp
{ after(grammarAccess.getMathExpRule()); } 
	 EOF 
;

// Rule MathExp
ruleMathExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMathExpAccess().getGroup()); }
		(rule__MathExp__Group__0)
		{ after(grammarAccess.getMathExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExp
entryRuleExp
:
{ before(grammarAccess.getExpRule()); }
	 ruleExp
{ after(grammarAccess.getExpRule()); } 
	 EOF 
;

// Rule Exp
ruleExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpAccess().getGroup()); }
		(rule__Exp__Group__0)
		{ after(grammarAccess.getExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerm
entryRuleTerm
:
{ before(grammarAccess.getTermRule()); }
	 ruleTerm
{ after(grammarAccess.getTermRule()); } 
	 EOF 
;

// Rule Term
ruleTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTermAccess().getGroup()); }
		(rule__Term__Group__0)
		{ after(grammarAccess.getTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLet
entryRuleLet
:
{ before(grammarAccess.getLetRule()); }
	 ruleLet
{ after(grammarAccess.getLetRule()); } 
	 EOF 
;

// Rule Let
ruleLet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLetAccess().getGroup()); }
		(rule__Let__Group__0)
		{ after(grammarAccess.getLetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariableUse
entryRuleVariableUse
:
{ before(grammarAccess.getVariableUseRule()); }
	 ruleVariableUse
{ after(grammarAccess.getVariableUseRule()); } 
	 EOF 
;

// Rule VariableUse
ruleVariableUse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableUseAccess().getGroup()); }
		(rule__VariableUse__Group__0)
		{ after(grammarAccess.getVariableUseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getGroup_1_0()); }
		(rule__Exp__Group_1_0__0)
		{ after(grammarAccess.getExpAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpAccess().getGroup_1_1()); }
		(rule__Exp__Group_1_1__0)
		{ after(grammarAccess.getExpAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermAccess().getGroup_1_0()); }
		(rule__Term__Group_1_0__0)
		{ after(grammarAccess.getTermAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getTermAccess().getGroup_1_1()); }
		(rule__Term__Group_1_1__0)
		{ after(grammarAccess.getTermAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_0()); }
		(rule__Primary__Group_0__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_1()); }
		(rule__Primary__Group_1__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getLetParserRuleCall_2()); }
		ruleLet
		{ after(grammarAccess.getPrimaryAccess().getLetParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); }
		ruleVariableUse
		{ after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__0__Impl
	rule__MathExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getMathExpAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__1__Impl
	rule__MathExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getNameAssignment_1()); }
	(rule__MathExp__NameAssignment_1)
	{ after(grammarAccess.getMathExpAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__2__Impl
	rule__MathExp__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getExpAssignment_3()); }
	(rule__MathExp__ExpAssignment_3)
	{ after(grammarAccess.getMathExpAccess().getExpAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__0__Impl
	rule__Exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getTermParserRuleCall_0()); }
	ruleTerm
	{ after(grammarAccess.getExpAccess().getTermParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getAlternatives_1()); }
	(rule__Exp__Alternatives_1)*
	{ after(grammarAccess.getExpAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_0__0__Impl
	rule__Exp__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0()); }
	()
	{ after(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_0__1__Impl
	rule__Exp__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_1()); }
	'+'
	{ after(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getRightAssignment_1_0_2()); }
	(rule__Exp__RightAssignment_1_0_2)
	{ after(grammarAccess.getExpAccess().getRightAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_1__0__Impl
	rule__Exp__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getMinusLeftAction_1_1_0()); }
	()
	{ after(grammarAccess.getExpAccess().getMinusLeftAction_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_1__1__Impl
	rule__Exp__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_1_1()); }
	'-'
	{ after(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getRightAssignment_1_1_2()); }
	(rule__Exp__RightAssignment_1_1_2)
	{ after(grammarAccess.getExpAccess().getRightAssignment_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Term__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Term__Group__0__Impl
	rule__Term__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); }
	rulePrimary
	{ after(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Term__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermAccess().getAlternatives_1()); }
	(rule__Term__Alternatives_1)*
	{ after(grammarAccess.getTermAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Term__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Term__Group_1_0__0__Impl
	rule__Term__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); }
	()
	{ after(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Term__Group_1_0__1__Impl
	rule__Term__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); }
	'*'
	{ after(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Term__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); }
	(rule__Term__RightAssignment_1_0_2)
	{ after(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Term__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Term__Group_1_1__0__Impl
	rule__Term__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); }
	()
	{ after(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Term__Group_1_1__1__Impl
	rule__Term__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); }
	'/'
	{ after(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Term__Group_1_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); }
	(rule__Term__RightAssignment_1_1_2)
	{ after(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__0__Impl
	rule__Primary__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); }
	(rule__Primary__ValueAssignment_0_1)
	{ after(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__0__Impl
	rule__Primary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); }
	'('
	{ after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__1__Impl
	rule__Primary__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1()); }
	ruleExp
	{ after(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); }
	')'
	{ after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Let__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Let__Group__0__Impl
	rule__Let__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetAccess().getLetAction_0()); }
	()
	{ after(grammarAccess.getLetAccess().getLetAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Let__Group__1__Impl
	rule__Let__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetAccess().getLetKeyword_1()); }
	'let'
	{ after(grammarAccess.getLetAccess().getLetKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Let__Group__2__Impl
	rule__Let__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetAccess().getNameAssignment_2()); }
	(rule__Let__NameAssignment_2)
	{ after(grammarAccess.getLetAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Let__Group__3__Impl
	rule__Let__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetAccess().getEqualsSignKeyword_3()); }
	'='
	{ after(grammarAccess.getLetAccess().getEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Let__Group__4__Impl
	rule__Let__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetAccess().getBindAssignment_4()); }
	(rule__Let__BindAssignment_4)
	{ after(grammarAccess.getLetAccess().getBindAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Let__Group__5__Impl
	rule__Let__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetAccess().getInKeyword_5()); }
	'in'
	{ after(grammarAccess.getLetAccess().getInKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Let__Group__6__Impl
	rule__Let__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetAccess().getVarNameAssignment_6()); }
	(rule__Let__VarNameAssignment_6)
	{ after(grammarAccess.getLetAccess().getVarNameAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Let__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetAccess().getEndKeyword_7()); }
	'end'
	{ after(grammarAccess.getLetAccess().getEndKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VariableUse__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableUse__Group__0__Impl
	rule__VariableUse__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableUseAccess().getVariableUseAction_0()); }
	()
	{ after(grammarAccess.getVariableUseAccess().getVariableUseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableUse__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableUseAccess().getNameAssignment_1()); }
	(rule__VariableUse__NameAssignment_1)
	{ after(grammarAccess.getVariableUseAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExpression__ExpressionsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpressionAccess().getExpressionsMathExpParserRuleCall_0()); }
		ruleMathExp
		{ after(grammarAccess.getMathExpressionAccess().getExpressionsMathExpParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__ExpAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); }
		ruleExp
		{ after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__RightAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_0_2_0()); }
		ruleTerm
		{ after(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__RightAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_1_2_0()); }
		ruleTerm
		{ after(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__RightAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); }
		rulePrimary
		{ after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__RightAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); }
		rulePrimary
		{ after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__ValueAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); }
		RULE_INT
		{ after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__BindAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLetAccess().getBindExpParserRuleCall_4_0()); }
		ruleExp
		{ after(grammarAccess.getLetAccess().getBindExpParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Let__VarNameAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLetAccess().getVarNameExpParserRuleCall_6_0()); }
		ruleExp
		{ after(grammarAccess.getLetAccess().getVarNameExpParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableUseAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableUseAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
