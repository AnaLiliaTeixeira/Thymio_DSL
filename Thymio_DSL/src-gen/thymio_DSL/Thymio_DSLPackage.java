/**
 */
package thymio_DSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see thymio_DSL.Thymio_DSLFactory
 * @model kind="package"
 * @generated
 */
public interface Thymio_DSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thymio_DSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/thymio_DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "thymio_DSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Thymio_DSLPackage eINSTANCE = thymio_DSL.impl.Thymio_DSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.StatementImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Ifstatement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IFSTATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.ThymioDSLImpl <em>Thymio DSL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.ThymioDSLImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getThymioDSL()
	 * @generated
	 */
	int THYMIO_DSL = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THYMIO_DSL__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Thymio DSL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THYMIO_DSL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Thymio DSL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THYMIO_DSL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.ActionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.ColorBottomActionImpl <em>Color Bottom Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.ColorBottomActionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getColorBottomAction()
	 * @generated
	 */
	int COLOR_BOTTOM_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BOTTOM_ACTION__COLOR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Bottom Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BOTTOM_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Color Bottom Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BOTTOM_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.SoundActionImpl <em>Sound Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.SoundActionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getSoundAction()
	 * @generated
	 */
	int SOUND_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_ACTION__SOUND = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sound Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sound Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.MovementActionImpl <em>Movement Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.MovementActionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getMovementAction()
	 * @generated
	 */
	int MOVEMENT_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_ACTION__DIRECTION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_ACTION__SPEED = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Movement Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Movement Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.ColorTopActionImpl <em>Color Top Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.ColorTopActionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getColorTopAction()
	 * @generated
	 */
	int COLOR_TOP_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TOP_ACTION__COLOR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Top Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TOP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Color Top Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TOP_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.EventImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 10;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.ClapEventImpl <em>Clap Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.ClapEventImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getClapEvent()
	 * @generated
	 */
	int CLAP_EVENT = 7;

	/**
	 * The number of structural features of the '<em>Clap Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAP_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clap Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAP_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.UpperEventImpl <em>Upper Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.UpperEventImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getUpperEvent()
	 * @generated
	 */
	int UPPER_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_EVENT__BUTTONS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_EVENT__STATE = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Upper Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Upper Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.TapEventImpl <em>Tap Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.TapEventImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getTapEvent()
	 * @generated
	 */
	int TAP_EVENT = 9;

	/**
	 * The number of structural features of the '<em>Tap Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tap Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.SensorImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 11;

	/**
	 * The feature id for the '<em><b>Sensor type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.ProxEventImpl <em>Prox Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.ProxEventImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getProxEvent()
	 * @generated
	 */
	int PROX_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROX_EVENT__SENSOR = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prox Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROX_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Prox Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROX_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.IfStatementImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 13;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ACTION = 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.ConditionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Booleanexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BOOLEANEXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Logicalexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LOGICALEXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.BooleanExpressionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Comparisonexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__COMPARISONEXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.LogicalExpressionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__RIGHT = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.ComparisonExpressionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getComparisonExpression()
	 * @generated
	 */
	int COMPARISON_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__RIGHT = 2;

	/**
	 * The number of structural features of the '<em>Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thymio_DSL.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thymio_DSL.impl.ArithmeticExpressionImpl
	 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__LEFT = 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link thymio_DSL.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see thymio_DSL.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link thymio_DSL.Statement#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see thymio_DSL.Statement#getAction()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Action();

	/**
	 * Returns the meta object for the containment reference '{@link thymio_DSL.Statement#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see thymio_DSL.Statement#getEvent()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link thymio_DSL.Statement#getIfstatement <em>Ifstatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ifstatement</em>'.
	 * @see thymio_DSL.Statement#getIfstatement()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Ifstatement();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.ThymioDSL <em>Thymio DSL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thymio DSL</em>'.
	 * @see thymio_DSL.ThymioDSL
	 * @generated
	 */
	EClass getThymioDSL();

	/**
	 * Returns the meta object for the containment reference list '{@link thymio_DSL.ThymioDSL#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see thymio_DSL.ThymioDSL#getStatement()
	 * @see #getThymioDSL()
	 * @generated
	 */
	EReference getThymioDSL_Statement();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.ColorBottomAction <em>Color Bottom Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Bottom Action</em>'.
	 * @see thymio_DSL.ColorBottomAction
	 * @generated
	 */
	EClass getColorBottomAction();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.ColorBottomAction#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see thymio_DSL.ColorBottomAction#getColor()
	 * @see #getColorBottomAction()
	 * @generated
	 */
	EAttribute getColorBottomAction_Color();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.SoundAction <em>Sound Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Action</em>'.
	 * @see thymio_DSL.SoundAction
	 * @generated
	 */
	EClass getSoundAction();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.SoundAction#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sound</em>'.
	 * @see thymio_DSL.SoundAction#getSound()
	 * @see #getSoundAction()
	 * @generated
	 */
	EAttribute getSoundAction_Sound();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.MovementAction <em>Movement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement Action</em>'.
	 * @see thymio_DSL.MovementAction
	 * @generated
	 */
	EClass getMovementAction();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.MovementAction#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see thymio_DSL.MovementAction#getDirection()
	 * @see #getMovementAction()
	 * @generated
	 */
	EAttribute getMovementAction_Direction();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.MovementAction#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see thymio_DSL.MovementAction#getSpeed()
	 * @see #getMovementAction()
	 * @generated
	 */
	EAttribute getMovementAction_Speed();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.ColorTopAction <em>Color Top Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Top Action</em>'.
	 * @see thymio_DSL.ColorTopAction
	 * @generated
	 */
	EClass getColorTopAction();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.ColorTopAction#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see thymio_DSL.ColorTopAction#getColor()
	 * @see #getColorTopAction()
	 * @generated
	 */
	EAttribute getColorTopAction_Color();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see thymio_DSL.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.ClapEvent <em>Clap Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clap Event</em>'.
	 * @see thymio_DSL.ClapEvent
	 * @generated
	 */
	EClass getClapEvent();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.UpperEvent <em>Upper Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Event</em>'.
	 * @see thymio_DSL.UpperEvent
	 * @generated
	 */
	EClass getUpperEvent();

	/**
	 * Returns the meta object for the attribute list '{@link thymio_DSL.UpperEvent#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Buttons</em>'.
	 * @see thymio_DSL.UpperEvent#getButtons()
	 * @see #getUpperEvent()
	 * @generated
	 */
	EAttribute getUpperEvent_Buttons();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.UpperEvent#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see thymio_DSL.UpperEvent#getState()
	 * @see #getUpperEvent()
	 * @generated
	 */
	EAttribute getUpperEvent_State();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.TapEvent <em>Tap Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Event</em>'.
	 * @see thymio_DSL.TapEvent
	 * @generated
	 */
	EClass getTapEvent();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see thymio_DSL.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see thymio_DSL.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.Sensor#getSensor_type <em>Sensor type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor type</em>'.
	 * @see thymio_DSL.Sensor#getSensor_type()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Sensor_type();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.Sensor#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see thymio_DSL.Sensor#getDirection()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Direction();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.ProxEvent <em>Prox Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prox Event</em>'.
	 * @see thymio_DSL.ProxEvent
	 * @generated
	 */
	EClass getProxEvent();

	/**
	 * Returns the meta object for the containment reference '{@link thymio_DSL.ProxEvent#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensor</em>'.
	 * @see thymio_DSL.ProxEvent#getSensor()
	 * @see #getProxEvent()
	 * @generated
	 */
	EReference getProxEvent_Sensor();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see thymio_DSL.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link thymio_DSL.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see thymio_DSL.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link thymio_DSL.IfStatement#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see thymio_DSL.IfStatement#getAction()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Action();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see thymio_DSL.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link thymio_DSL.Condition#getBooleanexpression <em>Booleanexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booleanexpression</em>'.
	 * @see thymio_DSL.Condition#getBooleanexpression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Booleanexpression();

	/**
	 * Returns the meta object for the reference '{@link thymio_DSL.Condition#getLogicalexpression <em>Logicalexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logicalexpression</em>'.
	 * @see thymio_DSL.Condition#getLogicalexpression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Logicalexpression();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see thymio_DSL.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the reference '{@link thymio_DSL.BooleanExpression#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see thymio_DSL.BooleanExpression#getSensor()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Sensor();

	/**
	 * Returns the meta object for the reference '{@link thymio_DSL.BooleanExpression#getComparisonexpression <em>Comparisonexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comparisonexpression</em>'.
	 * @see thymio_DSL.BooleanExpression#getComparisonexpression()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Comparisonexpression();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see thymio_DSL.LogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link thymio_DSL.LogicalExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see thymio_DSL.LogicalExpression#getRight()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_Right();

	/**
	 * Returns the meta object for the containment reference '{@link thymio_DSL.LogicalExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see thymio_DSL.LogicalExpression#getLeft()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_Left();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.LogicalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see thymio_DSL.LogicalExpression#getOperator()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EAttribute getLogicalExpression_Operator();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.ComparisonExpression <em>Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Expression</em>'.
	 * @see thymio_DSL.ComparisonExpression
	 * @generated
	 */
	EClass getComparisonExpression();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.ComparisonExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see thymio_DSL.ComparisonExpression#getOperator()
	 * @see #getComparisonExpression()
	 * @generated
	 */
	EAttribute getComparisonExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link thymio_DSL.ComparisonExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see thymio_DSL.ComparisonExpression#getLeft()
	 * @see #getComparisonExpression()
	 * @generated
	 */
	EReference getComparisonExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link thymio_DSL.ComparisonExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see thymio_DSL.ComparisonExpression#getRight()
	 * @see #getComparisonExpression()
	 * @generated
	 */
	EReference getComparisonExpression_Right();

	/**
	 * Returns the meta object for class '{@link thymio_DSL.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see thymio_DSL.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.ArithmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see thymio_DSL.ArithmeticExpression#getOperator()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Operator();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.ArithmeticExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see thymio_DSL.ArithmeticExpression#getRight()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link thymio_DSL.ArithmeticExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see thymio_DSL.ArithmeticExpression#getLeft()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Left();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Thymio_DSLFactory getThymio_DSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.StatementImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__ACTION = eINSTANCE.getStatement_Action();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__EVENT = eINSTANCE.getStatement_Event();

		/**
		 * The meta object literal for the '<em><b>Ifstatement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__IFSTATEMENT = eINSTANCE.getStatement_Ifstatement();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.ThymioDSLImpl <em>Thymio DSL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.ThymioDSLImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getThymioDSL()
		 * @generated
		 */
		EClass THYMIO_DSL = eINSTANCE.getThymioDSL();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THYMIO_DSL__STATEMENT = eINSTANCE.getThymioDSL_Statement();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.ColorBottomActionImpl <em>Color Bottom Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.ColorBottomActionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getColorBottomAction()
		 * @generated
		 */
		EClass COLOR_BOTTOM_ACTION = eINSTANCE.getColorBottomAction();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_BOTTOM_ACTION__COLOR = eINSTANCE.getColorBottomAction_Color();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.SoundActionImpl <em>Sound Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.SoundActionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getSoundAction()
		 * @generated
		 */
		EClass SOUND_ACTION = eINSTANCE.getSoundAction();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUND_ACTION__SOUND = eINSTANCE.getSoundAction_Sound();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.MovementActionImpl <em>Movement Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.MovementActionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getMovementAction()
		 * @generated
		 */
		EClass MOVEMENT_ACTION = eINSTANCE.getMovementAction();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEMENT_ACTION__DIRECTION = eINSTANCE.getMovementAction_Direction();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEMENT_ACTION__SPEED = eINSTANCE.getMovementAction_Speed();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.ColorTopActionImpl <em>Color Top Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.ColorTopActionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getColorTopAction()
		 * @generated
		 */
		EClass COLOR_TOP_ACTION = eINSTANCE.getColorTopAction();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TOP_ACTION__COLOR = eINSTANCE.getColorTopAction_Color();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.ActionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.ClapEventImpl <em>Clap Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.ClapEventImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getClapEvent()
		 * @generated
		 */
		EClass CLAP_EVENT = eINSTANCE.getClapEvent();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.UpperEventImpl <em>Upper Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.UpperEventImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getUpperEvent()
		 * @generated
		 */
		EClass UPPER_EVENT = eINSTANCE.getUpperEvent();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPPER_EVENT__BUTTONS = eINSTANCE.getUpperEvent_Buttons();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPPER_EVENT__STATE = eINSTANCE.getUpperEvent_State();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.TapEventImpl <em>Tap Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.TapEventImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getTapEvent()
		 * @generated
		 */
		EClass TAP_EVENT = eINSTANCE.getTapEvent();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.EventImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.SensorImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SENSOR_TYPE = eINSTANCE.getSensor_Sensor_type();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__DIRECTION = eINSTANCE.getSensor_Direction();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.ProxEventImpl <em>Prox Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.ProxEventImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getProxEvent()
		 * @generated
		 */
		EClass PROX_EVENT = eINSTANCE.getProxEvent();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROX_EVENT__SENSOR = eINSTANCE.getProxEvent_Sensor();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.IfStatementImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ACTION = eINSTANCE.getIfStatement_Action();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.ConditionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Booleanexpression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__BOOLEANEXPRESSION = eINSTANCE.getCondition_Booleanexpression();

		/**
		 * The meta object literal for the '<em><b>Logicalexpression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__LOGICALEXPRESSION = eINSTANCE.getCondition_Logicalexpression();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.BooleanExpressionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__SENSOR = eINSTANCE.getBooleanExpression_Sensor();

		/**
		 * The meta object literal for the '<em><b>Comparisonexpression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__COMPARISONEXPRESSION = eINSTANCE.getBooleanExpression_Comparisonexpression();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.LogicalExpressionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__RIGHT = eINSTANCE.getLogicalExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__LEFT = eINSTANCE.getLogicalExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_EXPRESSION__OPERATOR = eINSTANCE.getLogicalExpression_Operator();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.ComparisonExpressionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getComparisonExpression()
		 * @generated
		 */
		EClass COMPARISON_EXPRESSION = eINSTANCE.getComparisonExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_EXPRESSION__OPERATOR = eINSTANCE.getComparisonExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_EXPRESSION__LEFT = eINSTANCE.getComparisonExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_EXPRESSION__RIGHT = eINSTANCE.getComparisonExpression_Right();

		/**
		 * The meta object literal for the '{@link thymio_DSL.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thymio_DSL.impl.ArithmeticExpressionImpl
		 * @see thymio_DSL.impl.Thymio_DSLPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getArithmeticExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__RIGHT = eINSTANCE.getArithmeticExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__LEFT = eINSTANCE.getArithmeticExpression_Left();

	}

} //Thymio_DSLPackage
