/*
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl.ui.quickfix;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.xtext.project.tdsl.validation.TDslValidator;

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
public class TDslQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(TDslValidator.DUPLICATE_EVENT_WARNING)
	public void removeDuplicateEvent(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove repeated event", "Removed repeated event", null, context -> {
			removeRepeated(context.getXtextDocument(), issue, "");
		});
	}
	
	@Fix(TDslValidator.DUPLICATE_ACTION_WARNING)
	public void removeDuplicateAction(final Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Remove repeated action", "Removed repeated action", null, context -> {
	    	removeRepeated(context.getXtextDocument(), issue, "");
	    });
	}

	@Fix(TDslValidator.DUPLICATE_SENSORIF_WARNING)
	public void removeDuplicateSensor(final Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Remove repeated sensor", "Removed repeated sensor", null, context -> {
	    	removeRepeated(context.getXtextDocument(), issue, "");
	    });
	}
	
	@Fix(TDslValidator.DUPLICATE_BUTTON_WARNING)
	public void removeDuplicateButtonSensor(final Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Remove repeated button", "Removed repeated button", null, context -> {
	    	removeRepeated(context.getXtextDocument(), issue, "");
	    });
	}
	
	@Fix(TDslValidator.SPEED_GT_500_WARNING)
	public void setSpeedTo500(final Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Set speed to 500", "Set speed to 500", null, context -> {
	    	removeRepeated(context.getXtextDocument(), issue, "500");
	    });
	}
	

	@Fix(TDslValidator.NEGATIVE_SPEED_WARNING)
	public void updateNegativeValues(final Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Insert a positive value", "Inserted a positive value", null, context -> {
	    	removeRepeated(context.getXtextDocument(), issue, removeMinus(context.getXtextDocument(),issue));
	    });
	}

	@Fix(TDslValidator.DUPLICATED_IF_STATEMENT_WARNING)
	public void removeDuplicateIfStatement(final Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Remove repeated if statement", "Removed repeated if statement", null, context -> {
	    	removeRepeated(context.getXtextDocument(), issue, "");
	    });
	}
	

	protected void removeRepeated(IXtextDocument iXtextDocument, Issue issue, String newSpecifier) throws BadLocationException {
        iXtextDocument.replace(issue.getOffset(), issue.getLength(), newSpecifier);
	}
	
	protected String removeMinus(IXtextDocument iXtextDocument, Issue issue) throws BadLocationException {
	    return iXtextDocument.get(issue.getOffset(), issue.getLength()).substring(1, issue.getLength());
	}	

}
