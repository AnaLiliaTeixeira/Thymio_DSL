/**
 */
package thymio_DSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upper Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.UpperEvent#getButtons <em>Buttons</em>}</li>
 *   <li>{@link thymio_DSL.UpperEvent#getState <em>State</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getUpperEvent()
 * @model
 * @generated
 */
public interface UpperEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' attribute list.
	 * @see thymio_DSL.Thymio_DSLPackage#getUpperEvent_Buttons()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getButtons();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see thymio_DSL.Thymio_DSLPackage#getUpperEvent_State()
	 * @model required="true"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link thymio_DSL.UpperEvent#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // UpperEvent
