package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.xtext.example.mydsl.myDsl.MathExpression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

@SuppressWarnings("all")
public class MathScopeTest {
  @Inject
  @Extension
  private ParseHelper<MathExpression> _parseHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  private final MyDslPackage epackage = MyDslPackage.eINSTANCE;

  @Test
  public void forwardReferenceLetError() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MyDslPackage");
  }

  @Test
  public void referenceOutsideLetError() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MyDslPackage");
  }

  @Test
  public void referenceNoVariable() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MyDslPackage");
  }

  @Test
  public void referenceCurrentVar() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MyDslPackage");
  }

  @Test
  public void referenceCurrentVarInLet() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MyDslPackage");
  }
}
