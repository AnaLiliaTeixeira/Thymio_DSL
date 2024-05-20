/**
 */
package thymio_DSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import thymio_DSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Thymio_DSLFactoryImpl extends EFactoryImpl implements Thymio_DSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Thymio_DSLFactory init() {
		try {
			Thymio_DSLFactory theThymio_DSLFactory = (Thymio_DSLFactory) EPackage.Registry.INSTANCE
					.getEFactory(Thymio_DSLPackage.eNS_URI);
			if (theThymio_DSLFactory != null) {
				return theThymio_DSLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Thymio_DSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thymio_DSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Thymio_DSLPackage.STATEMENT:
			return createStatement();
		case Thymio_DSLPackage.THYMIO_DSL:
			return createThymioDSL();
		case Thymio_DSLPackage.COLOR_BOTTOM_ACTION:
			return createColorBottomAction();
		case Thymio_DSLPackage.SOUND_ACTION:
			return createSoundAction();
		case Thymio_DSLPackage.MOVEMENT_ACTION:
			return createMovementAction();
		case Thymio_DSLPackage.COLOR_TOP_ACTION:
			return createColorTopAction();
		case Thymio_DSLPackage.ACTION:
			return createAction();
		case Thymio_DSLPackage.CLAP_EVENT:
			return createClapEvent();
		case Thymio_DSLPackage.UPPER_EVENT:
			return createUpperEvent();
		case Thymio_DSLPackage.TAP_EVENT:
			return createTapEvent();
		case Thymio_DSLPackage.EVENT:
			return createEvent();
		case Thymio_DSLPackage.SENSOR:
			return createSensor();
		case Thymio_DSLPackage.PROX_EVENT:
			return createProxEvent();
		case Thymio_DSLPackage.IF_STATEMENT:
			return createIfStatement();
		case Thymio_DSLPackage.CONDITION:
			return createCondition();
		case Thymio_DSLPackage.BOOLEAN_EXPRESSION:
			return createBooleanExpression();
		case Thymio_DSLPackage.LOGICAL_EXPRESSION:
			return createLogicalExpression();
		case Thymio_DSLPackage.COMPARISON_EXPRESSION:
			return createComparisonExpression();
		case Thymio_DSLPackage.ARITHMETIC_EXPRESSION:
			return createArithmeticExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThymioDSL createThymioDSL() {
		ThymioDSLImpl thymioDSL = new ThymioDSLImpl();
		return thymioDSL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorBottomAction createColorBottomAction() {
		ColorBottomActionImpl colorBottomAction = new ColorBottomActionImpl();
		return colorBottomAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoundAction createSoundAction() {
		SoundActionImpl soundAction = new SoundActionImpl();
		return soundAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MovementAction createMovementAction() {
		MovementActionImpl movementAction = new MovementActionImpl();
		return movementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorTopAction createColorTopAction() {
		ColorTopActionImpl colorTopAction = new ColorTopActionImpl();
		return colorTopAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClapEvent createClapEvent() {
		ClapEventImpl clapEvent = new ClapEventImpl();
		return clapEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpperEvent createUpperEvent() {
		UpperEventImpl upperEvent = new UpperEventImpl();
		return upperEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TapEvent createTapEvent() {
		TapEventImpl tapEvent = new TapEventImpl();
		return tapEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProxEvent createProxEvent() {
		ProxEventImpl proxEvent = new ProxEventImpl();
		return proxEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalExpression createLogicalExpression() {
		LogicalExpressionImpl logicalExpression = new LogicalExpressionImpl();
		return logicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonExpression createComparisonExpression() {
		ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
		return comparisonExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArithmeticExpression createArithmeticExpression() {
		ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
		return arithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Thymio_DSLPackage getThymio_DSLPackage() {
		return (Thymio_DSLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Thymio_DSLPackage getPackage() {
		return Thymio_DSLPackage.eINSTANCE;
	}

} //Thymio_DSLFactoryImpl
