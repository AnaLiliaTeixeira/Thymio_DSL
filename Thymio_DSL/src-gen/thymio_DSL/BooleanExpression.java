/**
 */
package thymio_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.BooleanExpression#getSensor <em>Sensor</em>}</li>
 *   <li>{@link thymio_DSL.BooleanExpression#getComparisonexpression <em>Comparisonexpression</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see thymio_DSL.Thymio_DSLPackage#getBooleanExpression_Sensor()
	 * @model
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link thymio_DSL.BooleanExpression#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Comparisonexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparisonexpression</em>' reference.
	 * @see #setComparisonexpression(ComparisonExpression)
	 * @see thymio_DSL.Thymio_DSLPackage#getBooleanExpression_Comparisonexpression()
	 * @model
	 * @generated
	 */
	ComparisonExpression getComparisonexpression();

	/**
	 * Sets the value of the '{@link thymio_DSL.BooleanExpression#getComparisonexpression <em>Comparisonexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparisonexpression</em>' reference.
	 * @see #getComparisonexpression()
	 * @generated
	 */
	void setComparisonexpression(ComparisonExpression value);

} // BooleanExpression
