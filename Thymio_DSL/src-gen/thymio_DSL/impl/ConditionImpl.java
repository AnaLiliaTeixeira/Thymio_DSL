/**
 */
package thymio_DSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import thymio_DSL.BooleanExpression;
import thymio_DSL.Condition;
import thymio_DSL.LogicalExpression;
import thymio_DSL.Thymio_DSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.impl.ConditionImpl#getBooleanexpression <em>Booleanexpression</em>}</li>
 *   <li>{@link thymio_DSL.impl.ConditionImpl#getLogicalexpression <em>Logicalexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The cached value of the '{@link #getBooleanexpression() <em>Booleanexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanexpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression booleanexpression;

	/**
	 * The cached value of the '{@link #getLogicalexpression() <em>Logicalexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalexpression()
	 * @generated
	 * @ordered
	 */
	protected LogicalExpression logicalexpression;

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
	public BooleanExpression getBooleanexpression() {
		if (booleanexpression != null && booleanexpression.eIsProxy()) {
			InternalEObject oldBooleanexpression = (InternalEObject) booleanexpression;
			booleanexpression = (BooleanExpression) eResolveProxy(oldBooleanexpression);
			if (booleanexpression != oldBooleanexpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Thymio_DSLPackage.CONDITION__BOOLEANEXPRESSION, oldBooleanexpression, booleanexpression));
			}
		}
		return booleanexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression basicGetBooleanexpression() {
		return booleanexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanexpression(BooleanExpression newBooleanexpression) {
		BooleanExpression oldBooleanexpression = booleanexpression;
		booleanexpression = newBooleanexpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thymio_DSLPackage.CONDITION__BOOLEANEXPRESSION,
					oldBooleanexpression, booleanexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalExpression getLogicalexpression() {
		if (logicalexpression != null && logicalexpression.eIsProxy()) {
			InternalEObject oldLogicalexpression = (InternalEObject) logicalexpression;
			logicalexpression = (LogicalExpression) eResolveProxy(oldLogicalexpression);
			if (logicalexpression != oldLogicalexpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Thymio_DSLPackage.CONDITION__LOGICALEXPRESSION, oldLogicalexpression, logicalexpression));
			}
		}
		return logicalexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalExpression basicGetLogicalexpression() {
		return logicalexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalexpression(LogicalExpression newLogicalexpression) {
		LogicalExpression oldLogicalexpression = logicalexpression;
		logicalexpression = newLogicalexpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thymio_DSLPackage.CONDITION__LOGICALEXPRESSION,
					oldLogicalexpression, logicalexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Thymio_DSLPackage.CONDITION__BOOLEANEXPRESSION:
			if (resolve)
				return getBooleanexpression();
			return basicGetBooleanexpression();
		case Thymio_DSLPackage.CONDITION__LOGICALEXPRESSION:
			if (resolve)
				return getLogicalexpression();
			return basicGetLogicalexpression();
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
		case Thymio_DSLPackage.CONDITION__BOOLEANEXPRESSION:
			setBooleanexpression((BooleanExpression) newValue);
			return;
		case Thymio_DSLPackage.CONDITION__LOGICALEXPRESSION:
			setLogicalexpression((LogicalExpression) newValue);
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
		case Thymio_DSLPackage.CONDITION__BOOLEANEXPRESSION:
			setBooleanexpression((BooleanExpression) null);
			return;
		case Thymio_DSLPackage.CONDITION__LOGICALEXPRESSION:
			setLogicalexpression((LogicalExpression) null);
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
		case Thymio_DSLPackage.CONDITION__BOOLEANEXPRESSION:
			return booleanexpression != null;
		case Thymio_DSLPackage.CONDITION__LOGICALEXPRESSION:
			return logicalexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
