package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.xtext.example.mydsl.myDsl.MathExpression
import org.xtext.example.mydsl.myDsl.MyDslPackage

import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.diagnostics.Diagnostic

class MathScopeTest {
	@Inject extension ParseHelper<MathExpression>
	@Inject extension ValidationTestHelper
	
	val epackage = MyDslPackage.eINSTANCE
	
	//T04 let binding
	
	@Test
	def void forwardReferenceLetError() {
		'''
			var z = let x=y in let y=3 in x*y end + x end + 0
		'''.parse.assertError(epackage.variableUse, 
            Diagnostic.LINKING_DIAGNOSTIC)
	}
	
	@Test
	def void referenceOutsideLetError() {
		'''
			var z = let x=4 in let y=3 in x*y end + y end + 0
		'''.parse.assertError(epackage.variableUse, 
            Diagnostic.LINKING_DIAGNOSTIC)
	}
	
	@Test
	def void referenceNoVariable() {
		'''
			var x = let i=4 in y end
		'''.parse.assertError(epackage.variableUse, 
            Diagnostic.LINKING_DIAGNOSTIC)
	}
	
	//T05 var binding
	@Test
	def void referenceCurrentVar() {
		'''
			var x = x
		'''.parse.assertError(epackage.variableUse, 
            Diagnostic.LINKING_DIAGNOSTIC)
	}
	
	@Test
	def void referenceCurrentVarInLet() {
		'''
			var x = let i = 2 in x end
		'''.parse.assertError(epackage.variableUse, 
            Diagnostic.LINKING_DIAGNOSTIC)
	}
}