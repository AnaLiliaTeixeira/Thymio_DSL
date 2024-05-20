/*
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.project.tdsl.ide.contentassist.antlr.internal.InternalTDslParser;
import org.xtext.project.tdsl.services.TDslGrammarAccess;

public class TDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives_2(), "rule__Statement__Alternatives_2");
			builder.put(grammarAccess.getEventAccess().getAlternatives(), "rule__Event__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives_1(), "rule__Action__Alternatives_1");
			builder.put(grammarAccess.getMovementActionAccess().getAlternatives(), "rule__MovementAction__Alternatives");
			builder.put(grammarAccess.getMovementActionAccess().getDirectionAlternatives_0_1_0(), "rule__MovementAction__DirectionAlternatives_0_1_0");
			builder.put(grammarAccess.getSoundActionAccess().getAlternatives(), "rule__SoundAction__Alternatives");
			builder.put(grammarAccess.getColorBottomActionAccess().getAlternatives(), "rule__ColorBottomAction__Alternatives");
			builder.put(grammarAccess.getColorTopActionAccess().getAlternatives(), "rule__ColorTopAction__Alternatives");
			builder.put(grammarAccess.getSensorAccess().getAlternatives(), "rule__Sensor__Alternatives");
			builder.put(grammarAccess.getSensorAccess().getAlternatives_0_4(), "rule__Sensor__Alternatives_0_4");
			builder.put(grammarAccess.getSensorAccess().getAlternatives_1_4(), "rule__Sensor__Alternatives_1_4");
			builder.put(grammarAccess.getConditionAccess().getOperatorAlternatives_1_0_0(), "rule__Condition__OperatorAlternatives_1_0_0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getOperatorAlternatives_1_0_0(), "rule__ArithmeticExpression__OperatorAlternatives_1_0_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getColorAccess().getAlternatives_0(), "rule__Color__Alternatives_0");
			builder.put(grammarAccess.getColorAccess().getAlternatives_1(), "rule__Color__Alternatives_1");
			builder.put(grammarAccess.getSoundAccess().getAlternatives(), "rule__Sound__Alternatives");
			builder.put(grammarAccess.getButtonsAccess().getAlternatives(), "rule__Buttons__Alternatives");
			builder.put(grammarAccess.getStateAccess().getAlternatives(), "rule__State__Alternatives");
			builder.put(grammarAccess.getRightLeftAccess().getAlternatives(), "rule__RightLeft__Alternatives");
			builder.put(grammarAccess.getHorizontalSensorsAccess().getAlternatives(), "rule__HorizontalSensors__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getMovementActionAccess().getGroup_0(), "rule__MovementAction__Group_0__0");
			builder.put(grammarAccess.getMovementActionAccess().getGroup_0_2(), "rule__MovementAction__Group_0_2__0");
			builder.put(grammarAccess.getMovementActionAccess().getGroup_1(), "rule__MovementAction__Group_1__0");
			builder.put(grammarAccess.getMovementActionAccess().getGroup_2(), "rule__MovementAction__Group_2__0");
			builder.put(grammarAccess.getMovementActionAccess().getGroup_3(), "rule__MovementAction__Group_3__0");
			builder.put(grammarAccess.getSoundActionAccess().getGroup_0(), "rule__SoundAction__Group_0__0");
			builder.put(grammarAccess.getSoundActionAccess().getGroup_1(), "rule__SoundAction__Group_1__0");
			builder.put(grammarAccess.getColorBottomActionAccess().getGroup_0(), "rule__ColorBottomAction__Group_0__0");
			builder.put(grammarAccess.getColorBottomActionAccess().getGroup_1(), "rule__ColorBottomAction__Group_1__0");
			builder.put(grammarAccess.getColorTopActionAccess().getGroup_0(), "rule__ColorTopAction__Group_0__0");
			builder.put(grammarAccess.getColorTopActionAccess().getGroup_1(), "rule__ColorTopAction__Group_1__0");
			builder.put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
			builder.put(grammarAccess.getUpperEventAccess().getGroup(), "rule__UpperEvent__Group__0");
			builder.put(grammarAccess.getUpperEventAccess().getGroup_2(), "rule__UpperEvent__Group_2__0");
			builder.put(grammarAccess.getProxEventAccess().getGroup(), "rule__ProxEvent__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_0(), "rule__Sensor__Group_0__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_0_4_1(), "rule__Sensor__Group_0_4_1__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_1(), "rule__Sensor__Group_1__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_1_4_1(), "rule__Sensor__Group_1_4_1__0");
			builder.put(grammarAccess.getTapEventAccess().getGroup(), "rule__TapEvent__Group__0");
			builder.put(grammarAccess.getClapEventAccess().getGroup(), "rule__ClapEvent__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_1(), "rule__Condition__Group_1__0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getGroup(), "rule__ArithmeticExpression__Group__0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getGroup_1(), "rule__ArithmeticExpression__Group_1__0");
			builder.put(grammarAccess.getEIntegerObjectAccess().getGroup(), "rule__EIntegerObject__Group__0");
			builder.put(grammarAccess.getColorAccess().getGroup(), "rule__Color__Group__0");
			builder.put(grammarAccess.getHorizontalSensorsAccess().getGroup_0(), "rule__HorizontalSensors__Group_0__0");
			builder.put(grammarAccess.getHorizontalSensorsAccess().getGroup_1(), "rule__HorizontalSensors__Group_1__0");
			builder.put(grammarAccess.getHorizontalSensorsAccess().getGroup_2(), "rule__HorizontalSensors__Group_2__0");
			builder.put(grammarAccess.getHorizontalSensorsAccess().getGroup_3(), "rule__HorizontalSensors__Group_3__0");
			builder.put(grammarAccess.getHorizontalSensorsAccess().getGroup_4(), "rule__HorizontalSensors__Group_4__0");
			builder.put(grammarAccess.getHorizontalSensorsAccess().getGroup_5(), "rule__HorizontalSensors__Group_5__0");
			builder.put(grammarAccess.getHorizontalSensorsAccess().getGroup_6(), "rule__HorizontalSensors__Group_6__0");
			builder.put(grammarAccess.getThymioDSLAccess().getStatementAssignment(), "rule__ThymioDSL__StatementAssignment");
			builder.put(grammarAccess.getStatementAccess().getEventAssignment_1(), "rule__Statement__EventAssignment_1");
			builder.put(grammarAccess.getStatementAccess().getIfstatementAssignment_2_0(), "rule__Statement__IfstatementAssignment_2_0");
			builder.put(grammarAccess.getStatementAccess().getActionAssignment_2_1(), "rule__Statement__ActionAssignment_2_1");
			builder.put(grammarAccess.getMovementActionAccess().getDirectionAssignment_0_1(), "rule__MovementAction__DirectionAssignment_0_1");
			builder.put(grammarAccess.getMovementActionAccess().getSpeedAssignment_0_2_2(), "rule__MovementAction__SpeedAssignment_0_2_2");
			builder.put(grammarAccess.getMovementActionAccess().getDirectionAssignment_1_1(), "rule__MovementAction__DirectionAssignment_1_1");
			builder.put(grammarAccess.getSoundActionAccess().getSoundAssignment_0_2(), "rule__SoundAction__SoundAssignment_0_2");
			builder.put(grammarAccess.getColorBottomActionAccess().getColorAssignment_0_4(), "rule__ColorBottomAction__ColorAssignment_0_4");
			builder.put(grammarAccess.getColorTopActionAccess().getColorAssignment_0_4(), "rule__ColorTopAction__ColorAssignment_0_4");
			builder.put(grammarAccess.getIfStatementAccess().getConditionAssignment_1(), "rule__IfStatement__ConditionAssignment_1");
			builder.put(grammarAccess.getIfStatementAccess().getActionAssignment_3(), "rule__IfStatement__ActionAssignment_3");
			builder.put(grammarAccess.getUpperEventAccess().getButtonsAssignment_1(), "rule__UpperEvent__ButtonsAssignment_1");
			builder.put(grammarAccess.getUpperEventAccess().getButtonsAssignment_2_1(), "rule__UpperEvent__ButtonsAssignment_2_1");
			builder.put(grammarAccess.getUpperEventAccess().getStateAssignment_4(), "rule__UpperEvent__StateAssignment_4");
			builder.put(grammarAccess.getProxEventAccess().getSensorAssignment_1(), "rule__ProxEvent__SensorAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getDirectionAssignment_0_0(), "rule__Sensor__DirectionAssignment_0_0");
			builder.put(grammarAccess.getSensorAccess().getSensor_typeAssignment_0_1(), "rule__Sensor__Sensor_typeAssignment_0_1");
			builder.put(grammarAccess.getSensorAccess().getDirectionAssignment_1_0(), "rule__Sensor__DirectionAssignment_1_0");
			builder.put(grammarAccess.getSensorAccess().getSensor_typeAssignment_1_1(), "rule__Sensor__Sensor_typeAssignment_1_1");
			builder.put(grammarAccess.getConditionAccess().getLeftSensorAssignment_0(), "rule__Condition__LeftSensorAssignment_0");
			builder.put(grammarAccess.getConditionAccess().getOperatorAssignment_1_0(), "rule__Condition__OperatorAssignment_1_0");
			builder.put(grammarAccess.getConditionAccess().getRightSensorAssignment_1_1(), "rule__Condition__RightSensorAssignment_1_1");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getLeftAssignment_0(), "rule__ArithmeticExpression__LeftAssignment_0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getOperatorAssignment_1_0(), "rule__ArithmeticExpression__OperatorAssignment_1_0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getRightAssignment_1_1(), "rule__ArithmeticExpression__RightAssignment_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TDslGrammarAccess grammarAccess;

	@Override
	protected InternalTDslParser createParser() {
		InternalTDslParser result = new InternalTDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
