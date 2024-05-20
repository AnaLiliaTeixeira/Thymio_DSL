/**
 */
package thymio_DSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import thymio_DSL.BooleanExpression;
import thymio_DSL.ComparisonExpression;
import thymio_DSL.Sensor;
import thymio_DSL.Thymio_DSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.impl.BooleanExpressionImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link thymio_DSL.impl.BooleanExpressionImpl#getComparisonexpression <em>Comparisonexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanExpressionImpl extends MinimalEObjectImpl.Container implements BooleanExpression {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * The cached value of the '{@link #getComparisonexpression() <em>Comparisonexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonexpression()
	 * @generated
	 * @ordered
	 */
	protected ComparisonExpression comparisonexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Thymio_DSLPackage.Literals.BOOLEAN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject) sensor;
			sensor = (Sensor) eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Thymio_DSLPackage.BOOLEAN_EXPRESSION__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensor(Sensor newSensor) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thymio_DSLPackage.BOOLEAN_EXPRESSION__SENSOR,
					oldSensor, sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonExpression getComparisonexpression() {
		if (comparisonexpression != null && comparisonexpression.eIsProxy()) {
			InternalEObject oldComparisonexpression = (InternalEObject) comparisonexpression;
			comparisonexpression = (ComparisonExpression) eResolveProxy(oldComparisonexpression);
			if (comparisonexpression != oldComparisonexpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Thymio_DSLPackage.BOOLEAN_EXPRESSION__COMPARISONEXPRESSION, oldComparisonexpression,
							comparisonexpression));
			}
		}
		return comparisonexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonExpression basicGetComparisonexpression() {
		return comparisonexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparisonexpression(ComparisonExpression newComparisonexpression) {
		ComparisonExpression oldComparisonexpression = comparisonexpression;
		comparisonexpression = newComparisonexpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Thymio_DSLPackage.BOOLEAN_EXPRESSION__COMPARISONEXPRESSION, oldComparisonexpression,
					comparisonexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Thymio_DSLPackage.BOOLEAN_EXPRESSION__SENSOR:
			if (resolve)
				return getSensor();
			return basicGetSensor();
		case Thymio_DSLPackage.BOOLEAN_EXPRESSION__COMPARISONEXPRESSION:
			if (resolve)
				return getComparisonexpression();
			return basicGetComparisonexpression();
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
		case Thymio_DSLPackage.BOOLEAN_EXPRESSION__SENSOR:
			setSensor((Sensor) newValue);
			return;
		case Thymio_DSLPackage.BOOLEAN_EXPRESSION__COMPARISONEXPRESSION:
			setComparisonexpression((ComparisonExpression) newValue);
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
		case Thymio_DSLPackage.BOOLEAN_EXPRESSION__SENSOR:
			setSensor((Sensor) null);
			return;
		case Thymio_DSLPackage.BOOLEAN_EXPRESSION__COMPARISONEXPRESSION:
			setComparisonexpression((ComparisonExpression) null);
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
		case Thymio_DSLPackage.BOOLEAN_EXPRESSION__SENSOR:
			return sensor != null;
		case Thymio_DSLPackage.BOOLEAN_EXPRESSION__COMPARISONEXPRESSION:
			return comparisonexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanExpressionImpl
