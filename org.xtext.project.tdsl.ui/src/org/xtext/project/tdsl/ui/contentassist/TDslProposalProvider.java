/*
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See
 * https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class TDslProposalProvider extends AbstractTDslProposalProvider {

	@Override
	public void complete_Statement(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("->", context));

	}

	@Override
	public void complete_Event(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	
		boolean hasOnKeyword = context.getPrefix().contains("On");
		
		if (!hasOnKeyword) {
			acceptor.accept(createCompletionProposal("On", context));
		}
	}

	@Override
	public void complete_UpperEvent(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	}

	@Override
	public void completeThymioDSL_Statement(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	
	}

	@Override
	public void completeStatement_Event(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	

	}

	@Override
	public void completeStatement_Ifstatement(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

	}

	@Override
	public void completeStatement_Action(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

	}

	@Override
	public void completeMovementAction_Direction(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	
	}

	@Override
	public void completeMovementAction_Speed(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	

	}

	@Override
	public void completeSoundAction_Sound(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	

	}

	@Override
	public void completeColorBottomAction_Color(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

	}

	@Override
	public void completeColorTopAction_Color(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	

	}

	@Override
	public void completeIfStatement_Condition(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	
	}

	@Override
	public void completeIfStatement_Action(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		
		acceptor.accept(createCompletionProposal("End if", context));

	}

	@Override
	public void completeUpperEvent_Button(EObject model, Assignment assignment, ContentAssistContext context,
	                                      ICompletionProposalAcceptor acceptor) {
	    
	        acceptor.accept(createCompletionProposal("center button", context));
	        acceptor.accept(createCompletionProposal("right button", context));
	        acceptor.accept(createCompletionProposal("left button", context));
	        acceptor.accept(createCompletionProposal("forward button", context));
	        acceptor.accept(createCompletionProposal("backward button", context));
	   
	}
	@Override
	public void completeUpperEvent_State(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

	}

	@Override
	public void completeButton_Name(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	

	}

	@Override
	public void completeProxEvent_Sensor(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	
		

	}

	@Override
	public void completeSensor_Direction(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {


	}

	@Override
	public void completeSensor_Sensor_type(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		
	}

	@Override
	public void completeSensor_State(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	
	}

	@Override
	public void completeCondition_LeftSensor(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("front left/middle horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("front right horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("front right/middle horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("front middle horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("backward left horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("backward right horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("left ground sensor detecting", context));
		acceptor.accept(createCompletionProposal("right ground sensor detecting", context));
	}

	@Override
	public void completeCondition_Operator(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("and", context));
		acceptor.accept(createCompletionProposal("or", context));
		acceptor.accept(createCompletionProposal(":", context));

	}

	@Override
	public void completeCondition_RightSensor(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("front left/middle horizontal sensor detecting :", context));
		acceptor.accept(createCompletionProposal("front right horizontal sensor detecting :", context));
		acceptor.accept(createCompletionProposal("front right/middle horizontal sensor detecting :", context));
		acceptor.accept(createCompletionProposal("front middle horizontal sensor detecting :", context));
		acceptor.accept(createCompletionProposal("backward left horizontal sensor detecting :", context));
		acceptor.accept(createCompletionProposal("backward right horizontal sensor detecting :", context));
		acceptor.accept(createCompletionProposal("left ground sensor detecting :", context));
		acceptor.accept(createCompletionProposal("right ground sensor detecting :", context));
	}

	@Override
	public void completeArithmeticExpression_Operator(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("+", context));
		acceptor.accept(createCompletionProposal("-", context));
		acceptor.accept(createCompletionProposal("/", context));
		acceptor.accept(createCompletionProposal("*", context));
		acceptor.accept(createCompletionProposal("mod", context));

	}

	@Override
	public void complete_ThymioDSL(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

	}

	@Override
	public void complete_Action(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("-", context));

	}

	@Override
	public void complete_MovementAction(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("drive forward", context));
		acceptor.accept(createCompletionProposal("drive forward with speed", context));
		acceptor.accept(createCompletionProposal("drive backward", context));
		acceptor.accept(createCompletionProposal("drive backward with speed", context));
		acceptor.accept(createCompletionProposal("turn left", context));
		acceptor.accept(createCompletionProposal("turn right", context));
		acceptor.accept(createCompletionProposal("stop driving", context));
		acceptor.accept(createCompletionProposal("stop turning", context));

	}

	@Override
	public void complete_SoundAction(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("play", context));
	}

	@Override
	public void complete_ColorBottomAction(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("set top color to", context));
		acceptor.accept(createCompletionProposal("turn off bottom leds", context));
	}

	@Override
	public void complete_ColorTopAction(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("set bottom color to", context));
		acceptor.accept(createCompletionProposal("turn off top leds", context));
	}

	@Override
	public void complete_IfStatement(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("If", context));
	}

	@Override
	public void complete_Button(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	}

	@Override
	public void complete_ProxEvent(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

	}

	@Override
	public void complete_Sensor(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("front left/middle horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("front right horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("front right/middle horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("front middle horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("backward left horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("backward right horizontal sensor detecting", context));
		acceptor.accept(createCompletionProposal("left ground sensor detecting", context));
		acceptor.accept(createCompletionProposal("right ground sensor detecting", context));
	}

	@Override
	public void complete_TapEvent(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("tap do :\n", context));
	

	}

	@Override
	public void complete_ClapEvent(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		
		acceptor.accept(createCompletionProposal("clap do :\n", context));
	}

	@Override
	public void complete_Condition(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
	}

	@Override
	public void complete_Color(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("red", context));
		acceptor.accept(createCompletionProposal("green", context));
		acceptor.accept(createCompletionProposal("blue", context));
		acceptor.accept(createCompletionProposal("black", context));
		acceptor.accept(createCompletionProposal("white", context));
		acceptor.accept(createCompletionProposal("yellow", context));
		acceptor.accept(createCompletionProposal("pink", context));
		acceptor.accept(createCompletionProposal("orange", context));

	}

	@Override
	public void complete_Sound(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("sound1", context));
		acceptor.accept(createCompletionProposal("sound2", context));
		acceptor.accept(createCompletionProposal("sound3", context));
		acceptor.accept(createCompletionProposal("sound4", context));
	}

	@Override
	public void complete_State_Horizontal_Sensor(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("proximity", context));
		acceptor.accept(createCompletionProposal("no proximity", context));
	}

	@Override
	public void complete_State_Ground_Sensor(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("proximity", context));
		acceptor.accept(createCompletionProposal("no proximity", context));
		acceptor.accept(createCompletionProposal("black", context));
		acceptor.accept(createCompletionProposal("white", context));
	}

	@Override
	public void complete_State(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		acceptor.accept(createCompletionProposal("touched do : \n", context));
		acceptor.accept(createCompletionProposal("released do : \n", context));
	}
}