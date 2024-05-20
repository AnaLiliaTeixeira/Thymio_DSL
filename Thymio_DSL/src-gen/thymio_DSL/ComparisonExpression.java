/**
 */
package thymio_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.ComparisonExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link thymio_DSL.ComparisonExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link thymio_DSL.ComparisonExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getComparisonExpression()
 * @model
 * @generated
 */
public interface ComparisonExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see thymio_DSL.Thymio_DSLPackage#getComparisonExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link thymio_DSL.ComparisonExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ArithmeticExpression)
	 * @see thymio_DSL.Thymio_DSLPackage#getComparisonExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpression getLeft();

	/**
	 * Sets the value of the '{@link thymio_DSL.ComparisonExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ArithmeticExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ArithmeticExpression)
	 * @see thymio_DSL.Thymio_DSLPackage#getComparisonExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpression getRight();

	/**
	 * Sets the value of the '{@link thymio_DSL.ComparisonExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ArithmeticExpression value);

} // ComparisonExpression
