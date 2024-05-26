/*
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.project.tdsl.validation.TDslValidator
import thymio_DSL.ThymioDSL
import thymio_DSL.Thymio_DSLPackage

@ExtendWith(InjectionExtension)
@InjectWith(TDslInjectorProvider)
class TDslValidatorTest {
	@Inject
	ParseHelper<ThymioDSL> parseHelper
	
	@Inject
	ValidationTestHelper validator
	
	@BeforeEach
    def void setUp() {
        // Registrar o EPackage antes de executar os testes
        if (!EPackage.Registry.INSTANCE.containsKey(Thymio_DSLPackage.eNS_URI)) {
            EPackage.Registry.INSTANCE.put(Thymio_DSLPackage.eNS_URI, Thymio_DSLPackage.eINSTANCE);
        }
    }
    
	@Test
	def void testRepeatedButtons() {
		val result = parseHelper.parse('''s
			-> On center and center button touched do:
			- drive forward
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result, Thymio_DSLPackage::eINSTANCE.upperEvent, TDslValidator::DUPLICATE_BUTTON_WARNING,
			"The button 'center' is repeated and does not make any difference, so it is redundant."
		)
	}
}