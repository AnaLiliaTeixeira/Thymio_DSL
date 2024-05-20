/**
 */
package thymio_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prox Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.ProxEvent#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getProxEvent()
 * @model
 * @generated
 */
public interface ProxEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference.
	 * @see #setSensor(Sensor)
	 * @see thymio_DSL.Thymio_DSLPackage#getProxEvent_Sensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link thymio_DSL.ProxEvent#getSensor <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' containment reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // ProxEvent
