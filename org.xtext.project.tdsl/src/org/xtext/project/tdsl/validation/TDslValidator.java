/*
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.xtext.validation.Check;

import thymio_DSL.Action;
import thymio_DSL.ArithmeticExpression;
import thymio_DSL.Button;
import thymio_DSL.ClapEvent;
import thymio_DSL.ColorBottomAction;
import thymio_DSL.ColorTopAction;
import thymio_DSL.Condition;
import thymio_DSL.Event;
import thymio_DSL.IfStatement;
import thymio_DSL.MovementAction;
import thymio_DSL.ProxEvent;
import thymio_DSL.Sensor;
import thymio_DSL.SoundAction;
import thymio_DSL.Statement;
import thymio_DSL.TapEvent;
import thymio_DSL.ThymioDSL;
import thymio_DSL.Thymio_DSLPackage;
import thymio_DSL.UpperEvent;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class TDslValidator extends AbstractTDslValidator {

	public static final String DUPLICATE_ACTION_WARNING = "duplicateActionWarning";

	@Check
	public void checkForDuplicateActions(Statement statement) {
		Set<Class<?>> seenActions = new HashSet<>();
		List<Action> actions = statement.getAction();
		for (int i = 0; i < actions.size(); i++) {
			Action action = actions.get(i);
			Class<?> actionClass = action.getClass();
			if (seenActions.contains(actionClass)) {
				warning("This action will not be executed as there is another action of the same type that will override it.",
						Thymio_DSLPackage.Literals.STATEMENT__ACTION, i, DUPLICATE_ACTION_WARNING,
						actionClass.getSimpleName());
			} else {
				seenActions.add(actionClass);
			}
		}
	}

	public static final String TURN_OFF_TOP_LEDS_WARNING = "turnOffTopLedsWarning";

	public static final String TURN_OFF_BOTTOM_LEDS_WARNING = "turnOffTopLedsWarning";

	@Check
	public void checkTurnOffTopLeds(ThymioDSL model) {
		boolean setTopColorSeen = false;

		// Iterate through all statements in the model
		for (Statement statement : model.getStatement()) {
			for (Action action : statement.getAction()) {
				if (action instanceof ColorTopAction) {
					ColorTopAction colorTopAction = (ColorTopAction) action;
					if (colorTopAction.getColor() != null) {
						setTopColorSeen = true;
					}
				}
			}
			if (setTopColorSeen) {
				break;
			}
		}

		// If no set top color action was found, check for turn off top leds actions
		if (!setTopColorSeen) {
			for (Statement statement : model.getStatement()) {
				for (Action action : statement.getAction()) {
					if (action instanceof ColorTopAction) {
						ColorTopAction colorTopAction = (ColorTopAction) action;
						if (colorTopAction.getColor() == null) {
							warning("Turning off top LEDs without setting the top color first.",
									Thymio_DSLPackage.Literals.THYMIO_DSL__STATEMENT, TURN_OFF_TOP_LEDS_WARNING,
									colorTopAction.getClass().getSimpleName());
						}
					}
				}
			}
		}
	}

	//////////////////////////////////////////////////////////////////////////////
	public static final String DUPLICATE_EVENT_WARNING = "duplicateEventWarning";

	@Check
	public void checkSameEvents(ThymioDSL model) {
		Set<Event> seenEvents = new HashSet<>();

		for (Statement statement : model.getStatement()) {
			Event event = statement.getEvent();

			if (event != null) {
				if (isDuplicateEvent(seenEvents, event)) {
					warning("This event will not be executed as there is another identical event that will override it.",
							Thymio_DSLPackage.Literals.THYMIO_DSL__STATEMENT, DUPLICATE_EVENT_WARNING);
				} else {
					seenEvents.add(event);
				}
			}
		}
	}

	private boolean isDuplicateEvent(Set<Event> seenEvents, Event newEvent) {
		for (Event seenEvent : seenEvents) {
			if (eventsAreEqual(seenEvent, newEvent)) {
				return true;
			}
		}
		return false;
	}

	private boolean eventsAreEqual(Event event1, Event event2) {
		if (event1.getClass() != event2.getClass()) {
			return false;
		}

		if (event1 instanceof UpperEvent && event2 instanceof UpperEvent) {
			return upperEventsAreEqual((UpperEvent) event1, (UpperEvent) event2);
		} else if (event1 instanceof ProxEvent && event2 instanceof ProxEvent) {
			return proxEventsAreEqual((ProxEvent) event1, (ProxEvent) event2);
		} else if (event1 instanceof TapEvent && event2 instanceof TapEvent) {
			return true;
		} else if (event1 instanceof ClapEvent && event2 instanceof ClapEvent) {
			return true;
		}

		return false;
	}

	private boolean upperEventsAreEqual(UpperEvent event1, UpperEvent event2) {
		List<Button> buttons1 = event1.getButton();
		List<Button> buttons2 = event2.getButton();

		if (buttons1.size() != buttons2.size()) {
			return false;
		}

		for (Button button1 : buttons1) {
			boolean foundMatch = false;
			for (Button button2 : buttons2) {
				if (button1.getName().equals(button2.getName())) {
					foundMatch = true;
					break;
				}
			}
			if (!foundMatch) {
				return false;
			}
		}
		return true;
	}

	private boolean proxEventsAreEqual(ProxEvent event1, ProxEvent event2) {
		return sensorsAreEqual(event1.getSensor(), event2.getSensor());
	}
	
	private boolean sensorsAreEqual(Sensor sensor1, Sensor sensor2) {
		return sensor1.getDirection().equals(sensor2.getDirection())
				&& sensor1.getState().equals(sensor2.getState())
				&& sensor1.getSensor_type().equals(sensor2.getSensor_type());

	}

	//////////////////////////////////////////////////////////////////////////////

	public static final String DUPLICATE_BUTTON_WARNING = "duplicateButtonWarning";

	@Check
	public void checkDuplicateButtons(UpperEvent upperEvent) {
	    Set<String> seenButtons = new HashSet<>();
	    for (Button button : upperEvent.getButton()) {
	        if (!seenButtons.add(button.getName())) {
	            int buttonIndex = upperEvent.getButton().indexOf(button);
	            warning("The button '" + button.getName()
	                    + "' is repeated and does not make any difference, so it is redundant.",
	                    Thymio_DSLPackage.Literals.UPPER_EVENT__BUTTON, DUPLICATE_BUTTON_WARNING, Integer.toString(buttonIndex));
	        }
	    }
	}

	public static final String NO_ACTIONS_ERROR = "noActionsError";

	@Check
	public void checkIfHasActions(Statement statement) {
		if (statement.getAction().isEmpty() && statement.getIfstatement().isEmpty())
			error("You should write at least one Action", Thymio_DSLPackage.Literals.STATEMENT__ACTION,
					NO_ACTIONS_ERROR);
	}

	public static final String DUPLICATE_SENSORIF_WARNING = "duplicateSensorIfWarning";

	@Check
	public void checkIfStatement(IfStatement ifStatement) {
		Sensor leftsensor = ifStatement.getCondition().getLeftSensor();
		Sensor rightsensor = ifStatement.getCondition().getRightSensor();
		if (ifStatement.getAction().isEmpty())
			error("You should write at least one Action", Thymio_DSLPackage.Literals.IF_STATEMENT__ACTION,
					NO_ACTIONS_ERROR);
		if (leftsensor == null && rightsensor == null) {
			error("You should write a condition", Thymio_DSLPackage.Literals.IF_STATEMENT__CONDITION);
		}
		if (leftsensor.getDirection().equals(rightsensor.getDirection()))
			if (leftsensor.getState().equals(rightsensor.getState()))
				warning("The sensor type:'" + leftsensor.getSensor_type() + "' with direction: '"
						+ leftsensor.getDirection() + "' is repeated and does not make any difference/detection",
						Thymio_DSLPackage.Literals.IF_STATEMENT__CONDITION, DUPLICATE_SENSORIF_WARNING);
			else if (contradictory(leftsensor.getState(), rightsensor.getState()))
				warning("This condition will never happen because the two sensors are contradictory",
						Thymio_DSLPackage.Literals.IF_STATEMENT__CONDITION, DUPLICATE_SENSORIF_WARNING);
	}

	@Check
	public void checkCondition(Condition condition) {
		Sensor leftsensor = condition.getLeftSensor();
		Sensor rightsensor = condition.getRightSensor();
		if (!checkIfDirectionCorrespondToType(rightsensor))
			error("The direction of the sensor doesn't match with the type " + rightsensor.getSensor_type()
					+ " sensor.", Thymio_DSLPackage.Literals.CONDITION__RIGHT_SENSOR);
		if (!checkIfDirectionCorrespondToType(leftsensor))
			error("The direction of the sensor doesn't match with the type " + leftsensor.getSensor_type()
					+ " sensor.", Thymio_DSLPackage.Literals.CONDITION__LEFT_SENSOR);
	
	}
	
	public static final String NEGATIVE_SPEED_WARNING = "negativeSpeedWarning";
	public static final String SPEED_GT_500_WARNING = "speedGreaterThan500Warning";

	@Check
	public void checkSpeed(MovementAction movementAction) {
		ArithmeticExpression speed = movementAction.getSpeed();
		if (speed.getOperator() == null)
			if (speed.getLeft() < 0) {		
				warning("The speed should be a positive number",
						Thymio_DSLPackage.Literals.MOVEMENT_ACTION__SPEED, NEGATIVE_SPEED_WARNING);
			}
			else if (speed.getLeft() > 500) {			
				warning("The speed should not exceed 500",
						Thymio_DSLPackage.Literals.MOVEMENT_ACTION__SPEED, SPEED_GT_500_WARNING);
			}
	}


	private boolean contradictory(String state, String state2) {
		return state.equals("proximity") && state2.equals("no proximity")
				|| state2.equals("proximity") && state.equals("no proximity")
				|| state.equals("white") && state2.equals("black") || state2.equals("white") && state.equals("black");
	}

	private boolean checkIfDirectionCorrespondToType(Sensor sensor) {
		if ("horizontal".equals(sensor.getSensor_type())) {
			String direction = sensor.getDirection();
			return direction.equals("front left") || direction.equals("front left/middle")
					|| direction.equals("front middle") || direction.equals("front right/middle")
					|| direction.equals("front right") || direction.equals("backward left")
					|| direction.equals("backward right");
		} else if ("ground".equals(sensor.getSensor_type())) {
			String direction = sensor.getDirection();
			return direction.equals("left") || direction.equals("right");
		}
		return false;
	}
	
	public static final String DUPLICATE_IF_STATEMENT_WARNING = "duplicateIfStatementWarning";

	@Check
	public void checkDuplicateIfStatements(Statement statement) {
	    
		Set<IfStatement> seenIfStatements = new HashSet<>();
		List<IfStatement> ifStatements = statement.getIfstatement();

		for (int i = 0; i < ifStatements.size(); i++) {
			IfStatement ifStatement = ifStatements.get(i);

			if (isDuplicateIfSatement(seenIfStatements, ifStatement)) {
				warning("The if statement is repeated and does not make any difference, so it is redundant.",
						Thymio_DSLPackage.Literals.STATEMENT__IFSTATEMENT, i, DUPLICATE_IF_STATEMENT_WARNING,
						ifStatement.getClass().getSimpleName());
			} else {
				seenIfStatements.add(ifStatement);
			}

		}   
	}
	
	private boolean isDuplicateIfSatement(Set<IfStatement> seenIfStatements, IfStatement newIfStatement) {

		for (IfStatement seenIfStatement : seenIfStatements) {
			if (ifStatementsAreEqual(seenIfStatement, newIfStatement))
				return true;
		}
		return false;
	}

	private boolean ifStatementsAreEqual(IfStatement if1, IfStatement if2) {
		return equalConditions(if1.getCondition(), if2.getCondition()) && equalActions(if1.getAction(), if2.getAction());
	}

	
	private boolean equalConditions(Condition cond1, Condition cond2) {

	    if (cond1.getOperator() == null && cond2.getOperator() == null)
	    	return sensorsAreEqual(cond1.getLeftSensor(), cond2.getLeftSensor()) ;

    	return cond1.getOperator().equals(cond2.getOperator())
    			 && sensorsAreEqual(cond1.getLeftSensor(), cond2.getLeftSensor())
    			 && sensorsAreEqual(cond1.getRightSensor(), cond2.getRightSensor());
	    	
	}

	
	private boolean equalActions(List<Action> actions1, List<Action> actions2) {

	    if (actions1.size() != actions2.size()) {
	        return false;
	    }
	    for (int i = 0; i < actions1.size(); i++) {
	        if (!actionsAreEqual(actions1.get(i), actions2.get(i)))
	            return false;
	    }
	    return true;
	}
	
	private boolean actionsAreEqual(Action action1, Action action2) {
		if (action1.getClass() != action2.getClass()) {
			return false;
		}

		if (action1 instanceof MovementAction && action2 instanceof MovementAction) {
			return movementActionsAreEqual((MovementAction) action1, (MovementAction) action2);
		} else if (action1 instanceof SoundAction && action2 instanceof SoundAction) {
			return soundActionsAreEqual((SoundAction) action1, (SoundAction) action2);
		} else if (action1 instanceof ColorBottomAction && action2 instanceof ColorBottomAction) {
			return bottomColorActionsAreEqual((ColorBottomAction) action1, (ColorBottomAction) action2);
		} else if (action1 instanceof ColorTopAction && action2 instanceof ColorTopAction) {
			return topColorActionsAreEqual((ColorTopAction) action1, (ColorTopAction) action2);
		}

		return false;
	}

	private boolean movementActionsAreEqual(MovementAction action1, MovementAction action2) {
		return action1.getDirection().equals(action2.getDirection())
				&& arithmeticExpressionAreEqual(action1.getSpeed(), action2.getSpeed());

	}
	
	private boolean arithmeticExpressionAreEqual(ArithmeticExpression speed1, ArithmeticExpression speed2) {
		
		if (speed1 == null && speed2 == null)
			return true;
		
	    if (speed1.getOperator() == null && speed2.getOperator() == null)
	    	return speed1.getLeft().equals(speed2.getLeft());

	    return speed1.getLeft().equals(speed2.getLeft()) && speed1.getRight().equals(speed2.getRight()) 
					&& speed1.getOperator().equals(speed2.getOperator());
		
	}
	
	private boolean soundActionsAreEqual(SoundAction action1, SoundAction action2) {
		if (action1.getSound() == null && action2.getSound() == null) 
			return true;
		return action1.getSound().equals(action2.getSound());

	}
	
	private boolean bottomColorActionsAreEqual(ColorBottomAction action1, ColorBottomAction action2) {
		if (action1.getColor() == null && action2.getColor() == null) 
			return true;
		return action1.getColor().equals(action2.getColor());

	}
	
	private boolean topColorActionsAreEqual(ColorTopAction action1, ColorTopAction action2) {
		if (action1.getColor() == null && action2.getColor() == null) 
			return true;
		return action1.getColor().equals(action2.getColor());
	}
	
}
