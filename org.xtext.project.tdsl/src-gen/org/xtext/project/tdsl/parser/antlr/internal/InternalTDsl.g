/*
 * generated by Xtext 2.34.0
 */
grammar InternalTDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.project.tdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.project.tdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.project.tdsl.services.TDslGrammarAccess;

}

@parser::members {

 	private TDslGrammarAccess grammarAccess;

    public InternalTDslParser(TokenStream input, TDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ThymioDSL";
   	}

   	@Override
   	protected TDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleThymioDSL
entryRuleThymioDSL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getThymioDSLRule()); }
	iv_ruleThymioDSL=ruleThymioDSL
	{ $current=$iv_ruleThymioDSL.current; }
	EOF;

// Rule ThymioDSL
ruleThymioDSL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getThymioDSLAccess().getStatementStatementParserRuleCall_0());
			}
			lv_statement_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getThymioDSLRule());
				}
				add(
					$current,
					"statement",
					lv_statement_0_0,
					"org.xtext.project.tdsl.TDsl.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='-'
		{
			newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getHyphenMinusKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0());
				}
				lv_event_1_0=ruleEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"event",
						lv_event_1_0,
						"org.xtext.project.tdsl.TDsl.Event");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getIfstatementIfStatementParserRuleCall_2_0_0());
					}
					lv_ifstatement_2_0=ruleIfStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						add(
							$current,
							"ifstatement",
							lv_ifstatement_2_0,
							"org.xtext.project.tdsl.TDsl.IfStatement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getActionActionParserRuleCall_2_1_0());
					}
					lv_action_3_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						add(
							$current,
							"action",
							lv_action_3_0,
							"org.xtext.project.tdsl.TDsl.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEventAccess().getUpperEventParserRuleCall_0());
		}
		this_UpperEvent_0=ruleUpperEvent
		{
			$current = $this_UpperEvent_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEventAccess().getProxEventParserRuleCall_1());
		}
		this_ProxEvent_1=ruleProxEvent
		{
			$current = $this_ProxEvent_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEventAccess().getTapEventParserRuleCall_2());
		}
		this_TapEvent_2=ruleTapEvent
		{
			$current = $this_TapEvent_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEventAccess().getClapEventParserRuleCall_3());
		}
		this_ClapEvent_3=ruleClapEvent
		{
			$current = $this_ClapEvent_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='-'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getHyphenMinusKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getActionAccess().getMovementActionParserRuleCall_1_0());
			}
			this_MovementAction_1=ruleMovementAction
			{
				$current = $this_MovementAction_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getActionAccess().getSoundActionParserRuleCall_1_1());
			}
			this_SoundAction_2=ruleSoundAction
			{
				$current = $this_SoundAction_2.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getActionAccess().getColorBottomActionParserRuleCall_1_2());
			}
			this_ColorBottomAction_3=ruleColorBottomAction
			{
				$current = $this_ColorBottomAction_3.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getActionAccess().getColorTopActionParserRuleCall_1_3());
			}
			this_ColorTopAction_4=ruleColorTopAction
			{
				$current = $this_ColorTopAction_4.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleMovementAction
entryRuleMovementAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMovementActionRule()); }
	iv_ruleMovementAction=ruleMovementAction
	{ $current=$iv_ruleMovementAction.current; }
	EOF;

// Rule MovementAction
ruleMovementAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='drive'
			{
				newLeafNode(otherlv_0, grammarAccess.getMovementActionAccess().getDriveKeyword_0_0());
			}
			(
				(
					(
						lv_direction_1_1='forward'
						{
							newLeafNode(lv_direction_1_1, grammarAccess.getMovementActionAccess().getDirectionForwardKeyword_0_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMovementActionRule());
							}
							setWithLastConsumed($current, "direction", lv_direction_1_1, null);
						}
						    |
						lv_direction_1_2='backward'
						{
							newLeafNode(lv_direction_1_2, grammarAccess.getMovementActionAccess().getDirectionBackwardKeyword_0_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMovementActionRule());
							}
							setWithLastConsumed($current, "direction", lv_direction_1_2, null);
						}
					)
				)
			)
			(
				otherlv_2='with'
				{
					newLeafNode(otherlv_2, grammarAccess.getMovementActionAccess().getWithKeyword_0_2_0());
				}
				otherlv_3='speed'
				{
					newLeafNode(otherlv_3, grammarAccess.getMovementActionAccess().getSpeedKeyword_0_2_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMovementActionAccess().getSpeedArithmeticExpressionParserRuleCall_0_2_2_0());
						}
						lv_speed_4_0=ruleArithmeticExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMovementActionRule());
							}
							set(
								$current,
								"speed",
								lv_speed_4_0,
								"org.xtext.project.tdsl.TDsl.ArithmeticExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)
		    |
		(
			otherlv_5='turn'
			{
				newLeafNode(otherlv_5, grammarAccess.getMovementActionAccess().getTurnKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMovementActionAccess().getDirectionRightLeftParserRuleCall_1_1_0());
					}
					lv_direction_6_0=ruleRightLeft
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMovementActionRule());
						}
						set(
							$current,
							"direction",
							lv_direction_6_0,
							"org.xtext.project.tdsl.TDsl.RightLeft");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getMovementActionAccess().getMovementActionAction_2_0(),
						$current);
				}
			)
			otherlv_8='stop'
			{
				newLeafNode(otherlv_8, grammarAccess.getMovementActionAccess().getStopKeyword_2_1());
			}
			otherlv_9='driving'
			{
				newLeafNode(otherlv_9, grammarAccess.getMovementActionAccess().getDrivingKeyword_2_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getMovementActionAccess().getMovementActionAction_3_0(),
						$current);
				}
			)
			otherlv_11='stop'
			{
				newLeafNode(otherlv_11, grammarAccess.getMovementActionAccess().getStopKeyword_3_1());
			}
			otherlv_12='turning'
			{
				newLeafNode(otherlv_12, grammarAccess.getMovementActionAccess().getTurningKeyword_3_2());
			}
		)
	)
;

// Entry rule entryRuleSoundAction
entryRuleSoundAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSoundActionRule()); }
	iv_ruleSoundAction=ruleSoundAction
	{ $current=$iv_ruleSoundAction.current; }
	EOF;

// Rule SoundAction
ruleSoundAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='play'
			{
				newLeafNode(otherlv_0, grammarAccess.getSoundActionAccess().getPlayKeyword_0_0());
			}
			otherlv_1='sound'
			{
				newLeafNode(otherlv_1, grammarAccess.getSoundActionAccess().getSoundKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSoundActionAccess().getSoundSoundParserRuleCall_0_2_0());
					}
					lv_sound_2_0=ruleSound
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSoundActionRule());
						}
						set(
							$current,
							"sound",
							lv_sound_2_0,
							"org.xtext.project.tdsl.TDsl.Sound");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSoundActionAccess().getSoundActionAction_1_0(),
						$current);
				}
			)
			otherlv_4='stop'
			{
				newLeafNode(otherlv_4, grammarAccess.getSoundActionAccess().getStopKeyword_1_1());
			}
			otherlv_5='playing'
			{
				newLeafNode(otherlv_5, grammarAccess.getSoundActionAccess().getPlayingKeyword_1_2());
			}
			otherlv_6='sound'
			{
				newLeafNode(otherlv_6, grammarAccess.getSoundActionAccess().getSoundKeyword_1_3());
			}
		)
	)
;

// Entry rule entryRuleColorBottomAction
entryRuleColorBottomAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorBottomActionRule()); }
	iv_ruleColorBottomAction=ruleColorBottomAction
	{ $current=$iv_ruleColorBottomAction.current; }
	EOF;

// Rule ColorBottomAction
ruleColorBottomAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='set'
			{
				newLeafNode(otherlv_0, grammarAccess.getColorBottomActionAccess().getSetKeyword_0_0());
			}
			otherlv_1='bottom'
			{
				newLeafNode(otherlv_1, grammarAccess.getColorBottomActionAccess().getBottomKeyword_0_1());
			}
			otherlv_2='color'
			{
				newLeafNode(otherlv_2, grammarAccess.getColorBottomActionAccess().getColorKeyword_0_2());
			}
			otherlv_3='to'
			{
				newLeafNode(otherlv_3, grammarAccess.getColorBottomActionAccess().getToKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getColorBottomActionAccess().getColorColorParserRuleCall_0_4_0());
					}
					lv_color_4_0=ruleColor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getColorBottomActionRule());
						}
						set(
							$current,
							"color",
							lv_color_4_0,
							"org.xtext.project.tdsl.TDsl.Color");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getColorBottomActionAccess().getColorBottomActionAction_1_0(),
						$current);
				}
			)
			otherlv_6='Turn'
			{
				newLeafNode(otherlv_6, grammarAccess.getColorBottomActionAccess().getTurnKeyword_1_1());
			}
			otherlv_7='off'
			{
				newLeafNode(otherlv_7, grammarAccess.getColorBottomActionAccess().getOffKeyword_1_2());
			}
			otherlv_8='bottom'
			{
				newLeafNode(otherlv_8, grammarAccess.getColorBottomActionAccess().getBottomKeyword_1_3());
			}
			otherlv_9='leds'
			{
				newLeafNode(otherlv_9, grammarAccess.getColorBottomActionAccess().getLedsKeyword_1_4());
			}
		)
	)
;

// Entry rule entryRuleColorTopAction
entryRuleColorTopAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorTopActionRule()); }
	iv_ruleColorTopAction=ruleColorTopAction
	{ $current=$iv_ruleColorTopAction.current; }
	EOF;

// Rule ColorTopAction
ruleColorTopAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='set'
			{
				newLeafNode(otherlv_0, grammarAccess.getColorTopActionAccess().getSetKeyword_0_0());
			}
			otherlv_1='top'
			{
				newLeafNode(otherlv_1, grammarAccess.getColorTopActionAccess().getTopKeyword_0_1());
			}
			otherlv_2='color'
			{
				newLeafNode(otherlv_2, grammarAccess.getColorTopActionAccess().getColorKeyword_0_2());
			}
			otherlv_3='to'
			{
				newLeafNode(otherlv_3, grammarAccess.getColorTopActionAccess().getToKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getColorTopActionAccess().getColorColorParserRuleCall_0_4_0());
					}
					lv_color_4_0=ruleColor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getColorTopActionRule());
						}
						set(
							$current,
							"color",
							lv_color_4_0,
							"org.xtext.project.tdsl.TDsl.Color");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getColorTopActionAccess().getColorTopActionAction_1_0(),
						$current);
				}
			)
			otherlv_6='Turn'
			{
				newLeafNode(otherlv_6, grammarAccess.getColorTopActionAccess().getTurnKeyword_1_1());
			}
			otherlv_7='off'
			{
				newLeafNode(otherlv_7, grammarAccess.getColorTopActionAccess().getOffKeyword_1_2());
			}
			otherlv_8='top'
			{
				newLeafNode(otherlv_8, grammarAccess.getColorTopActionAccess().getTopKeyword_1_3());
			}
			otherlv_9='leds'
			{
				newLeafNode(otherlv_9, grammarAccess.getColorTopActionAccess().getLedsKeyword_1_4());
			}
		)
	)
;

// Entry rule entryRuleIfStatement
entryRuleIfStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfStatementRule()); }
	iv_ruleIfStatement=ruleIfStatement
	{ $current=$iv_ruleIfStatement.current; }
	EOF;

// Rule IfStatement
ruleIfStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='If'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionConditionParserRuleCall_1_0());
				}
				lv_condition_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfStatementRule());
					}
					set(
						$current,
						"condition",
						lv_condition_1_0,
						"org.xtext.project.tdsl.TDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfStatementAccess().getActionActionParserRuleCall_3_0());
				}
				lv_action_3_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfStatementRule());
					}
					add(
						$current,
						"action",
						lv_action_3_0,
						"org.xtext.project.tdsl.TDsl.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='End'
		{
			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getEndKeyword_4());
		}
		otherlv_5='if'
		{
			newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getIfKeyword_5());
		}
	)
;

// Entry rule entryRuleUpperEvent
entryRuleUpperEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpperEventRule()); }
	iv_ruleUpperEvent=ruleUpperEvent
	{ $current=$iv_ruleUpperEvent.current; }
	EOF;

// Rule UpperEvent
ruleUpperEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='On'
		{
			newLeafNode(otherlv_0, grammarAccess.getUpperEventAccess().getOnKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpperEventAccess().getButtonsButtonsParserRuleCall_1_0());
				}
				lv_buttons_1_0=ruleButtons
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpperEventRule());
					}
					add(
						$current,
						"buttons",
						lv_buttons_1_0,
						"org.xtext.project.tdsl.TDsl.Buttons");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='and'
			{
				newLeafNode(otherlv_2, grammarAccess.getUpperEventAccess().getAndKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUpperEventAccess().getButtonsButtonsParserRuleCall_2_1_0());
					}
					lv_buttons_3_0=ruleButtons
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUpperEventRule());
						}
						add(
							$current,
							"buttons",
							lv_buttons_3_0,
							"org.xtext.project.tdsl.TDsl.Buttons");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getUpperEventAccess().getStateStateParserRuleCall_3_0());
				}
				lv_state_4_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpperEventRule());
					}
					set(
						$current,
						"state",
						lv_state_4_0,
						"org.xtext.project.tdsl.TDsl.State");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='do'
		{
			newLeafNode(otherlv_5, grammarAccess.getUpperEventAccess().getDoKeyword_4());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getUpperEventAccess().getColonKeyword_5());
		}
	)
;

// Entry rule entryRuleProxEvent
entryRuleProxEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProxEventRule()); }
	iv_ruleProxEvent=ruleProxEvent
	{ $current=$iv_ruleProxEvent.current; }
	EOF;

// Rule ProxEvent
ruleProxEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='On'
		{
			newLeafNode(otherlv_0, grammarAccess.getProxEventAccess().getOnKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProxEventAccess().getSensorSensorParserRuleCall_1_0());
				}
				lv_sensor_1_0=ruleSensor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProxEventRule());
					}
					set(
						$current,
						"sensor",
						lv_sensor_1_0,
						"org.xtext.project.tdsl.TDsl.Sensor");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='do:'
		{
			newLeafNode(otherlv_2, grammarAccess.getProxEventAccess().getDoKeyword_2());
		}
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSensorAccess().getHorizontalSensorsParserRuleCall_0_0());
			}
			ruleHorizontalSensors
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					lv_sensor_type_1_0='horizontal'
					{
						newLeafNode(lv_sensor_type_1_0, grammarAccess.getSensorAccess().getSensor_typeHorizontalKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSensorRule());
						}
						setWithLastConsumed($current, "sensor_type", lv_sensor_type_1_0, "horizontal");
					}
				)
			)
			otherlv_2='sensor'
			{
				newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getSensorKeyword_0_2());
			}
			otherlv_3='detecting'
			{
				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getDetectingKeyword_0_3());
			}
			(
				otherlv_4='proximity'
				{
					newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getProximityKeyword_0_4_0());
				}
				    |
				(
					otherlv_5='no'
					{
						newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getNoKeyword_0_4_1_0());
					}
					otherlv_6='proximity'
					{
						newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getProximityKeyword_0_4_1_1());
					}
				)
			)
		)
		    |
		(
			{
				newCompositeNode(grammarAccess.getSensorAccess().getRightLeftParserRuleCall_1_0());
			}
			ruleRightLeft
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					lv_sensor_type_8_0='ground'
					{
						newLeafNode(lv_sensor_type_8_0, grammarAccess.getSensorAccess().getSensor_typeGroundKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSensorRule());
						}
						setWithLastConsumed($current, "sensor_type", lv_sensor_type_8_0, "ground");
					}
				)
			)
			otherlv_9='sensor'
			{
				newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getSensorKeyword_1_2());
			}
			otherlv_10='detecting'
			{
				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getDetectingKeyword_1_3());
			}
			(
				otherlv_11='proximity'
				{
					newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getProximityKeyword_1_4_0());
				}
				    |
				(
					otherlv_12='no'
					{
						newLeafNode(otherlv_12, grammarAccess.getSensorAccess().getNoKeyword_1_4_1_0());
					}
					otherlv_13='proximity'
					{
						newLeafNode(otherlv_13, grammarAccess.getSensorAccess().getProximityKeyword_1_4_1_1());
					}
				)
				    |
				otherlv_14='black'
				{
					newLeafNode(otherlv_14, grammarAccess.getSensorAccess().getBlackKeyword_1_4_2());
				}
				    |
				otherlv_15='white'
				{
					newLeafNode(otherlv_15, grammarAccess.getSensorAccess().getWhiteKeyword_1_4_3());
				}
			)
		)
	)
;

// Entry rule entryRuleTapEvent
entryRuleTapEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTapEventRule()); }
	iv_ruleTapEvent=ruleTapEvent
	{ $current=$iv_ruleTapEvent.current; }
	EOF;

// Rule TapEvent
ruleTapEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTapEventAccess().getEventAction_0(),
					$current);
			}
		)
		otherlv_1='On'
		{
			newLeafNode(otherlv_1, grammarAccess.getTapEventAccess().getOnKeyword_1());
		}
		otherlv_2='tap'
		{
			newLeafNode(otherlv_2, grammarAccess.getTapEventAccess().getTapKeyword_2());
		}
		otherlv_3='do'
		{
			newLeafNode(otherlv_3, grammarAccess.getTapEventAccess().getDoKeyword_3());
		}
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getTapEventAccess().getColonKeyword_4());
		}
	)
;

// Entry rule entryRuleClapEvent
entryRuleClapEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClapEventRule()); }
	iv_ruleClapEvent=ruleClapEvent
	{ $current=$iv_ruleClapEvent.current; }
	EOF;

// Rule ClapEvent
ruleClapEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getClapEventAccess().getEventAction_0(),
					$current);
			}
		)
		otherlv_1='On'
		{
			newLeafNode(otherlv_1, grammarAccess.getClapEventAccess().getOnKeyword_1());
		}
		otherlv_2='clap'
		{
			newLeafNode(otherlv_2, grammarAccess.getClapEventAccess().getClapKeyword_2());
		}
		otherlv_3='do'
		{
			newLeafNode(otherlv_3, grammarAccess.getClapEventAccess().getDoKeyword_3());
		}
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getClapEventAccess().getColonKeyword_4());
		}
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getLeftSensorSensorParserRuleCall_0_0());
				}
				lv_leftSensor_0_0=ruleSensor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"leftSensor",
						lv_leftSensor_0_0,
						"org.xtext.project.tdsl.TDsl.Sensor");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					(
						lv_operator_1_1='and'
						{
							newLeafNode(lv_operator_1_1, grammarAccess.getConditionAccess().getOperatorAndKeyword_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getConditionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_1_1, null);
						}
						    |
						lv_operator_1_2='or'
						{
							newLeafNode(lv_operator_1_2, grammarAccess.getConditionAccess().getOperatorOrKeyword_1_0_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getConditionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_1_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionAccess().getRightSensorSensorParserRuleCall_1_1_0());
					}
					lv_rightSensor_2_0=ruleSensor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionRule());
						}
						set(
							$current,
							"rightSensor",
							lv_rightSensor_2_0,
							"org.xtext.project.tdsl.TDsl.Sensor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleArithmeticExpression
entryRuleArithmeticExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArithmeticExpressionRule()); }
	iv_ruleArithmeticExpression=ruleArithmeticExpression
	{ $current=$iv_ruleArithmeticExpression.current; }
	EOF;

// Rule ArithmeticExpression
ruleArithmeticExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getLeftEIntegerObjectParserRuleCall_0_0());
				}
				lv_left_0_0=ruleEIntegerObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.xtext.project.tdsl.TDsl.EIntegerObject");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					(
						lv_operator_1_1='+'
						{
							newLeafNode(lv_operator_1_1, grammarAccess.getArithmeticExpressionAccess().getOperatorPlusSignKeyword_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getArithmeticExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_1_1, null);
						}
						    |
						lv_operator_1_2='-'
						{
							newLeafNode(lv_operator_1_2, grammarAccess.getArithmeticExpressionAccess().getOperatorHyphenMinusKeyword_1_0_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getArithmeticExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_1_2, null);
						}
						    |
						lv_operator_1_3='*'
						{
							newLeafNode(lv_operator_1_3, grammarAccess.getArithmeticExpressionAccess().getOperatorAsteriskKeyword_1_0_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getArithmeticExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_1_3, null);
						}
						    |
						lv_operator_1_4='/'
						{
							newLeafNode(lv_operator_1_4, grammarAccess.getArithmeticExpressionAccess().getOperatorSolidusKeyword_1_0_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getArithmeticExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_1_4, null);
						}
						    |
						lv_operator_1_5='mod'
						{
							newLeafNode(lv_operator_1_5, grammarAccess.getArithmeticExpressionAccess().getOperatorModKeyword_1_0_0_4());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getArithmeticExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_1_5, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getRightEIntegerObjectParserRuleCall_1_1_0());
					}
					lv_right_2_0=ruleEIntegerObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_2_0,
							"org.xtext.project.tdsl.TDsl.EIntegerObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleEIntegerObject
entryRuleEIntegerObject returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntegerObjectRule()); }
	iv_ruleEIntegerObject=ruleEIntegerObject
	{ $current=$iv_ruleEIntegerObject.current.getText(); }
	EOF;

// Rule EIntegerObject
ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleColor
entryRuleColor returns [String current=null]:
	{ newCompositeNode(grammarAccess.getColorRule()); }
	iv_ruleColor=ruleColor
	{ $current=$iv_ruleColor.current.getText(); }
	EOF;

// Rule Color
ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='light'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getColorAccess().getLightKeyword_0_0());
			}
			    |
			kw='dark'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getColorAccess().getDarkKeyword_0_1());
			}
		)?
		(
			kw='red'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getColorAccess().getRedKeyword_1_0());
			}
			    |
			kw='green'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getColorAccess().getGreenKeyword_1_1());
			}
			    |
			kw='blue'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getColorAccess().getBlueKeyword_1_2());
			}
			    |
			kw='black'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getColorAccess().getBlackKeyword_1_3());
			}
			    |
			kw='white'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getColorAccess().getWhiteKeyword_1_4());
			}
			    |
			kw='yellow'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getColorAccess().getYellowKeyword_1_5());
			}
		)
	)
;

// Entry rule entryRuleSound
entryRuleSound returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSoundRule()); }
	iv_ruleSound=ruleSound
	{ $current=$iv_ruleSound.current.getText(); }
	EOF;

// Rule Sound
ruleSound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='sound1'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSoundAccess().getSound1Keyword_0());
		}
		    |
		kw='sound2'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSoundAccess().getSound2Keyword_1());
		}
		    |
		kw='sound3'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSoundAccess().getSound3Keyword_2());
		}
		    |
		kw='sound4'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSoundAccess().getSound4Keyword_3());
		}
	)
;

// Entry rule entryRuleButtons
entryRuleButtons returns [String current=null]:
	{ newCompositeNode(grammarAccess.getButtonsRule()); }
	iv_ruleButtons=ruleButtons
	{ $current=$iv_ruleButtons.current.getText(); }
	EOF;

// Rule Buttons
ruleButtons returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='center'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getButtonsAccess().getCenterKeyword_0());
		}
		    |
		kw='right'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getButtonsAccess().getRightKeyword_1());
		}
		    |
		kw='left'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getButtonsAccess().getLeftKeyword_2());
		}
		    |
		kw='forward'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getButtonsAccess().getForwardKeyword_3());
		}
		    |
		kw='backward'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getButtonsAccess().getBackwardKeyword_4());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [String current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current.getText(); }
	EOF;

// Rule State
ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='touched'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getStateAccess().getTouchedKeyword_0());
		}
		    |
		kw='released'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getStateAccess().getReleasedKeyword_1());
		}
	)
;

// Entry rule entryRuleRightLeft
entryRuleRightLeft returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRightLeftRule()); }
	iv_ruleRightLeft=ruleRightLeft
	{ $current=$iv_ruleRightLeft.current.getText(); }
	EOF;

// Rule RightLeft
ruleRightLeft returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='left'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRightLeftAccess().getLeftKeyword_0());
		}
		    |
		kw='right'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRightLeftAccess().getRightKeyword_1());
		}
	)
;

// Entry rule entryRuleHorizontalSensors
entryRuleHorizontalSensors returns [String current=null]:
	{ newCompositeNode(grammarAccess.getHorizontalSensorsRule()); }
	iv_ruleHorizontalSensors=ruleHorizontalSensors
	{ $current=$iv_ruleHorizontalSensors.current.getText(); }
	EOF;

// Rule HorizontalSensors
ruleHorizontalSensors returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='front'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_0_0());
			}
			kw='left'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_0_1());
			}
		)
		    |
		(
			kw='front'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_1_0());
			}
			kw='left/middle'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getLeftMiddleKeyword_1_1());
			}
		)
		    |
		(
			kw='front'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_2_0());
			}
			kw='middle'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getMiddleKeyword_2_1());
			}
		)
		    |
		(
			kw='front'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_3_0());
			}
			kw='right/middle'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getRightMiddleKeyword_3_1());
			}
		)
		    |
		(
			kw='front'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_4_0());
			}
			kw='right'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getRightKeyword_4_1());
			}
		)
		    |
		(
			kw='backward'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getBackwardKeyword_5_0());
			}
			kw='left'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_5_1());
			}
		)
		    |
		(
			kw='backward'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getBackwardKeyword_6_0());
			}
			kw='right'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getRightKeyword_6_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
