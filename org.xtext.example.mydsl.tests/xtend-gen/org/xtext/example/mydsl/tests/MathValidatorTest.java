package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.myDsl.MathExpression;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MathValidatorTest {
  @Inject
  @Extension
  private ParseHelper<MathExpression> _parseHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  @Test
  public void noRepeatedGlobalVarDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 1*2");
      _builder.newLine();
      _builder.append("var y = 42");
      _builder.newLine();
      _builder.append("var x = let i = y in i end");
      _builder.newLine();
      final MathExpression result = this._parseHelper.parse(_builder);
      int _size = this._validationTestHelper.validate(result.eResource()).size();
      boolean _greaterThan = (_size > 0);
      Assertions.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
