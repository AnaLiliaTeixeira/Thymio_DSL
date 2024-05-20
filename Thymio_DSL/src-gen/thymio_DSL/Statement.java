/**
 */
package thymio_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.Statement#getAction <em>Action</em>}</li>
 *   <li>{@link thymio_DSL.Statement#getEvent <em>Event</em>}</li>
 *   <li>{@link thymio_DSL.Statement#getIfstatement <em>Ifstatement</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link thymio_DSL.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see thymio_DSL.Thymio_DSLPackage#getStatement_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see thymio_DSL.Thymio_DSLPackage#getStatement_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link thymio_DSL.Statement#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Ifstatement</b></em>' containment reference list.
	 * The list contents are of type {@link thymio_DSL.IfStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifstatement</em>' containment reference list.
	 * @see thymio_DSL.Thymio_DSLPackage#getStatement_Ifstatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfStatement> getIfstatement();

} // Statement
