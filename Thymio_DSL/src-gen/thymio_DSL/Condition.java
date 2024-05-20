/**
 */
package thymio_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.Condition#getBooleanexpression <em>Booleanexpression</em>}</li>
 *   <li>{@link thymio_DSL.Condition#getLogicalexpression <em>Logicalexpression</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Booleanexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpression</em>' reference.
	 * @see #setBooleanexpression(BooleanExpression)
	 * @see thymio_DSL.Thymio_DSLPackage#getCondition_Booleanexpression()
	 * @model
	 * @generated
	 */
	BooleanExpression getBooleanexpression();

	/**
	 * Sets the value of the '{@link thymio_DSL.Condition#getBooleanexpression <em>Booleanexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanexpression</em>' reference.
	 * @see #getBooleanexpression()
	 * @generated
	 */
	void setBooleanexpression(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Logicalexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logicalexpression</em>' reference.
	 * @see #setLogicalexpression(LogicalExpression)
	 * @see thymio_DSL.Thymio_DSLPackage#getCondition_Logicalexpression()
	 * @model
	 * @generated
	 */
	LogicalExpression getLogicalexpression();

	/**
	 * Sets the value of the '{@link thymio_DSL.Condition#getLogicalexpression <em>Logicalexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logicalexpression</em>' reference.
	 * @see #getLogicalexpression()
	 * @generated
	 */
	void setLogicalexpression(LogicalExpression value);

} // Condition
