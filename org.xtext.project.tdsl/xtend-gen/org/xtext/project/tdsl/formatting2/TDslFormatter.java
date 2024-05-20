/**
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.project.tdsl.services.TDslGrammarAccess;
import thymio_DSL.Action;
import thymio_DSL.Event;
import thymio_DSL.IfStatement;
import thymio_DSL.Statement;
import thymio_DSL.ThymioDSL;

@SuppressWarnings("all")
public class TDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private TDslGrammarAccess _tDslGrammarAccess;

  protected void _format(final ThymioDSL thymioDSL, @Extension final IFormattableDocument document) {
    EList<Statement> _statement = thymioDSL.getStatement();
    for (final Statement statement : _statement) {
      document.<Statement>format(statement);
    }
  }

  protected void _format(final Statement statement, @Extension final IFormattableDocument document) {
    document.<Event>format(statement.getEvent());
    EList<IfStatement> _ifstatement = statement.getIfstatement();
    for (final IfStatement ifStatement : _ifstatement) {
      document.<IfStatement>format(ifStatement);
    }
    EList<Action> _action = statement.getAction();
    for (final Action action : _action) {
      document.<Action>format(action);
    }
  }

  public void format(final Object statement, final IFormattableDocument document) {
    if (statement instanceof XtextResource) {
      _format((XtextResource)statement, document);
      return;
    } else if (statement instanceof Statement) {
      _format((Statement)statement, document);
      return;
    } else if (statement instanceof ThymioDSL) {
      _format((ThymioDSL)statement, document);
      return;
    } else if (statement instanceof EObject) {
      _format((EObject)statement, document);
      return;
    } else if (statement == null) {
      _format((Void)null, document);
      return;
    } else if (statement != null) {
      _format(statement, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statement, document).toString());
    }
  }
}
