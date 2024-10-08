package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.generator.MyDslGenerator;
import org.xtext.example.mydsl.myDsl.MathExpression;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MathParsingTest {
  @Inject
  @Extension
  private ParseHelper<MathExpression> _parseHelper;

  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 42");
      final MathExpression result = this._parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void number() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 42");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(42, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void simpleAddition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 40 + 2");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(42, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void threeNumbersAddition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 22 + 18 + 2");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      System.out.println(variables.get("x"));
      Assertions.assertEquals(42, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void subtraction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 46 - 4");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(42, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void subtractionNonCommutative() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 4 - 46");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals((-42), variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void threeNumbersSubtraction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 42 - 4 - 80");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals((-42), variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void additionAndSubtraction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 100-20+10-3");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(87, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void multiplication() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 5*4");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(20, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void threeNumbersMultiplication() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 5*4*6");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(120, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void division() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 20/4");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(5, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void divisionNonCommutative() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 4 / 20");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(0, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void threeNumbersDivision() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 120/6/5");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(4, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void multiplicationAndDivision() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 100*20/10*3");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(600, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void multipleVariables() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 42");
      _builder.newLine();
      _builder.append("var y = 100-20+10-3");
      _builder.newLine();
      _builder.append("var z = 100*20/10*3");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(42, variables.get("x"));
      Assertions.assertEquals(87, variables.get("y"));
      Assertions.assertEquals(600, variables.get("z"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void parenthesis() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = (10+3)*7-4");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(87, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void precedence() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 10+3*4-12/3+3");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(21, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void letNumber() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = let y=42 in y end");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(42, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void letNumberExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = let y=10*8 in y+7 end");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(87, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void nestedLet() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = let y=2 in let z=3 in y*z end + y end + 79");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(87, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void letVariableShadowing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = let y=2 in let y=3 in y*y end + y end + 76");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(87, variables.get("x"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void referenceSingleVar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 42");
      _builder.newLine();
      _builder.append("var y = x");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(42, variables.get("x"));
      Assertions.assertEquals(42, variables.get("y"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void referenceExpressionVar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 40 + 2");
      _builder.newLine();
      _builder.append("var y = x * 2");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(42, variables.get("x"));
      Assertions.assertEquals(84, variables.get("y"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void letUseGlobalVariableBody() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 21");
      _builder.newLine();
      _builder.append("var y = let i = 2 in i*x end");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(42, variables.get("y"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void letUseGlobalVariableBinding() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 21");
      _builder.newLine();
      _builder.append("var y = let i = x in i*2 end");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(42, variables.get("y"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void letUseGlobalVariableShadowing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 20");
      _builder.newLine();
      _builder.append("var y = let x = 21 in x*2 end");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(20, variables.get("x"));
      Assertions.assertEquals(42, variables.get("y"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void letUseGlobalVariableBindingSameName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 21");
      _builder.newLine();
      _builder.append("var y = let x = x in x*2 end");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MyDslGenerator.compute(result);
      Assertions.assertEquals(21, variables.get("x"));
      Assertions.assertEquals(42, variables.get("y"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
