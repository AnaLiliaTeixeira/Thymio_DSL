/**
 */
package thymio_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.Sensor#getSensor_type <em>Sensor type</em>}</li>
 *   <li>{@link thymio_DSL.Sensor#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor type</em>' attribute.
	 * @see #setSensor_type(String)
	 * @see thymio_DSL.Thymio_DSLPackage#getSensor_Sensor_type()
	 * @model required="true"
	 * @generated
	 */
	String getSensor_type();

	/**
	 * Sets the value of the '{@link thymio_DSL.Sensor#getSensor_type <em>Sensor type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor type</em>' attribute.
	 * @see #getSensor_type()
	 * @generated
	 */
	void setSensor_type(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see thymio_DSL.Thymio_DSLPackage#getSensor_Direction()
	 * @model
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link thymio_DSL.Sensor#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

} // Sensor
