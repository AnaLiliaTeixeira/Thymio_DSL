/**
 */
package thymio_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.ArithmeticExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link thymio_DSL.ArithmeticExpression#getRight <em>Right</em>}</li>
 *   <li>{@link thymio_DSL.ArithmeticExpression#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getArithmeticExpression()
 * @model
 * @generated
 */
public interface ArithmeticExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see thymio_DSL.Thymio_DSLPackage#getArithmeticExpression_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link thymio_DSL.ArithmeticExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(Integer)
	 * @see thymio_DSL.Thymio_DSLPackage#getArithmeticExpression_Right()
	 * @model
	 * @generated
	 */
	Integer getRight();

	/**
	 * Sets the value of the '{@link thymio_DSL.ArithmeticExpression#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Integer value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(Integer)
	 * @see thymio_DSL.Thymio_DSLPackage#getArithmeticExpression_Left()
	 * @model required="true"
	 * @generated
	 */
	Integer getLeft();

	/**
	 * Sets the value of the '{@link thymio_DSL.ArithmeticExpression#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Integer value);

} // ArithmeticExpression
