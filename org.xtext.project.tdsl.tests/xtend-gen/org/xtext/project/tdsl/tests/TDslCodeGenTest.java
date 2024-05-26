/**
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(TDslInjectorProvider.class)
@SuppressWarnings("all")
public class TDslCodeGenTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;

  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;

  @Test
  public void testJavaCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-> On center button touched do:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("- drive forward");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        it.getCompiledClasses();
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testRecipeName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-> On center button touched do:");
      _builder.newLine();
      _builder.append("- drive forward");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        try {
          final Object thymioDSL = it.getCompiledClass("ThymioDSL").getDeclaredConstructor().newInstance();
          Assertions.assertNotNull(thymioDSL);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
