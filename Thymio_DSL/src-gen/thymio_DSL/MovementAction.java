/**
 */
package thymio_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movement Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.MovementAction#getDirection <em>Direction</em>}</li>
 *   <li>{@link thymio_DSL.MovementAction#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getMovementAction()
 * @model
 * @generated
 */
public interface MovementAction extends Action {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see thymio_DSL.Thymio_DSLPackage#getMovementAction_Direction()
	 * @model
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link thymio_DSL.MovementAction#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(Integer)
	 * @see thymio_DSL.Thymio_DSLPackage#getMovementAction_Speed()
	 * @model
	 * @generated
	 */
	Integer getSpeed();

	/**
	 * Sets the value of the '{@link thymio_DSL.MovementAction#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Integer value);

} // MovementAction
