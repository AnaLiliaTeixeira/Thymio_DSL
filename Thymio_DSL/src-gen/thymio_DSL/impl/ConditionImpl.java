/**
 */
package thymio_DSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import thymio_DSL.Condition;
import thymio_DSL.Sensor;
import thymio_DSL.Thymio_DSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link thymio_DSL.impl.ConditionImpl#getRightSensor <em>Right Sensor</em>}</li>
 *   <li>{@link thymio_DSL.impl.ConditionImpl#getLeftSensor <em>Left Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightSensor() <em>Right Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor rightSensor;

	/**
	 * The cached value of the '{@link #getLeftSensor() <em>Left Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor leftSensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Thymio_DSLPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thymio_DSLPackage.CONDITION__OPERATOR, oldOperator,
					operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getRightSensor() {
		return rightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightSensor(Sensor newRightSensor, NotificationChain msgs) {
		Sensor oldRightSensor = rightSensor;
		rightSensor = newRightSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Thymio_DSLPackage.CONDITION__RIGHT_SENSOR, oldRightSensor, newRightSensor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightSensor(Sensor newRightSensor) {
		if (newRightSensor != rightSensor) {
			NotificationChain msgs = null;
			if (rightSensor != null)
				msgs = ((InternalEObject) rightSensor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Thymio_DSLPackage.CONDITION__RIGHT_SENSOR, null, msgs);
			if (newRightSensor != null)
				msgs = ((InternalEObject) newRightSensor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Thymio_DSLPackage.CONDITION__RIGHT_SENSOR, null, msgs);
			msgs = basicSetRightSensor(newRightSensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thymio_DSLPackage.CONDITION__RIGHT_SENSOR,
					newRightSensor, newRightSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getLeftSensor() {
		return leftSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftSensor(Sensor newLeftSensor, NotificationChain msgs) {
		Sensor oldLeftSensor = leftSensor;
		leftSensor = newLeftSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Thymio_DSLPackage.CONDITION__LEFT_SENSOR, oldLeftSensor, newLeftSensor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftSensor(Sensor newLeftSensor) {
		if (newLeftSensor != leftSensor) {
			NotificationChain msgs = null;
			if (leftSensor != null)
				msgs = ((InternalEObject) leftSensor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Thymio_DSLPackage.CONDITION__LEFT_SENSOR, null, msgs);
			if (newLeftSensor != null)
				msgs = ((InternalEObject) newLeftSensor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Thymio_DSLPackage.CONDITION__LEFT_SENSOR, null, msgs);
			msgs = basicSetLeftSensor(newLeftSensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thymio_DSLPackage.CONDITION__LEFT_SENSOR,
					newLeftSensor, newLeftSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Thymio_DSLPackage.CONDITION__RIGHT_SENSOR:
			return basicSetRightSensor(null, msgs);
		case Thymio_DSLPackage.CONDITION__LEFT_SENSOR:
			return basicSetLeftSensor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Thymio_DSLPackage.CONDITION__OPERATOR:
			return getOperator();
		case Thymio_DSLPackage.CONDITION__RIGHT_SENSOR:
			return getRightSensor();
		case Thymio_DSLPackage.CONDITION__LEFT_SENSOR:
			return getLeftSensor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Thymio_DSLPackage.CONDITION__OPERATOR:
			setOperator((String) newValue);
			return;
		case Thymio_DSLPackage.CONDITION__RIGHT_SENSOR:
			setRightSensor((Sensor) newValue);
			return;
		case Thymio_DSLPackage.CONDITION__LEFT_SENSOR:
			setLeftSensor((Sensor) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Thymio_DSLPackage.CONDITION__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case Thymio_DSLPackage.CONDITION__RIGHT_SENSOR:
			setRightSensor((Sensor) null);
			return;
		case Thymio_DSLPackage.CONDITION__LEFT_SENSOR:
			setLeftSensor((Sensor) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Thymio_DSLPackage.CONDITION__OPERATOR:
			return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
		case Thymio_DSLPackage.CONDITION__RIGHT_SENSOR:
			return rightSensor != null;
		case Thymio_DSLPackage.CONDITION__LEFT_SENSOR:
			return leftSensor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
