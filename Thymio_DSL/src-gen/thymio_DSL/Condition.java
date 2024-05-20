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
 *   <li>{@link thymio_DSL.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link thymio_DSL.Condition#getRightSensor <em>Right Sensor</em>}</li>
 *   <li>{@link thymio_DSL.Condition#getLeftSensor <em>Left Sensor</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see thymio_DSL.Thymio_DSLPackage#getCondition_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link thymio_DSL.Condition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Right Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Sensor</em>' containment reference.
	 * @see #setRightSensor(Sensor)
	 * @see thymio_DSL.Thymio_DSLPackage#getCondition_RightSensor()
	 * @model containment="true"
	 * @generated
	 */
	Sensor getRightSensor();

	/**
	 * Sets the value of the '{@link thymio_DSL.Condition#getRightSensor <em>Right Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Sensor</em>' containment reference.
	 * @see #getRightSensor()
	 * @generated
	 */
	void setRightSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Left Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Sensor</em>' containment reference.
	 * @see #setLeftSensor(Sensor)
	 * @see thymio_DSL.Thymio_DSLPackage#getCondition_LeftSensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sensor getLeftSensor();

	/**
	 * Sets the value of the '{@link thymio_DSL.Condition#getLeftSensor <em>Left Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Sensor</em>' containment reference.
	 * @see #getLeftSensor()
	 * @generated
	 */
	void setLeftSensor(Sensor value);

} // Condition
