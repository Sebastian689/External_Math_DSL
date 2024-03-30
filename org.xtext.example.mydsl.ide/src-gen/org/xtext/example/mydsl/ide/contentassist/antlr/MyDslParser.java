/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpAccess().getAlternatives_1(), "rule__Exp__Alternatives_1");
			builder.put(grammarAccess.getTermAccess().getAlternatives_1(), "rule__Term__Alternatives_1");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getMathExpAccess().getGroup(), "rule__MathExp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0(), "rule__Exp__Group_1_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_1(), "rule__Exp__Group_1_1__0");
			builder.put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
			builder.put(grammarAccess.getTermAccess().getGroup_1_0(), "rule__Term__Group_1_0__0");
			builder.put(grammarAccess.getTermAccess().getGroup_1_1(), "rule__Term__Group_1_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getLetAccess().getGroup(), "rule__Let__Group__0");
			builder.put(grammarAccess.getVariableUseAccess().getGroup(), "rule__VariableUse__Group__0");
			builder.put(grammarAccess.getMathExpressionAccess().getExpressionsAssignment(), "rule__MathExpression__ExpressionsAssignment");
			builder.put(grammarAccess.getMathExpAccess().getNameAssignment_1(), "rule__MathExp__NameAssignment_1");
			builder.put(grammarAccess.getMathExpAccess().getExpAssignment_3(), "rule__MathExp__ExpAssignment_3");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_0_2(), "rule__Exp__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1_2(), "rule__Exp__RightAssignment_1_1_2");
			builder.put(grammarAccess.getTermAccess().getRightAssignment_1_0_2(), "rule__Term__RightAssignment_1_0_2");
			builder.put(grammarAccess.getTermAccess().getRightAssignment_1_1_2(), "rule__Term__RightAssignment_1_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getValueAssignment_0_1(), "rule__Primary__ValueAssignment_0_1");
			builder.put(grammarAccess.getLetAccess().getNameAssignment_2(), "rule__Let__NameAssignment_2");
			builder.put(grammarAccess.getLetAccess().getBindAssignment_4(), "rule__Let__BindAssignment_4");
			builder.put(grammarAccess.getLetAccess().getVarNameAssignment_6(), "rule__Let__VarNameAssignment_6");
			builder.put(grammarAccess.getVariableUseAccess().getNameAssignment_1(), "rule__VariableUse__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
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

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
