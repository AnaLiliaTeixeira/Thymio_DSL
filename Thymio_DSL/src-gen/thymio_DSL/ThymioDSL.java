/**
 */
package thymio_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thymio DSL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thymio_DSL.ThymioDSL#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see thymio_DSL.Thymio_DSLPackage#getThymioDSL()
 * @model
 * @generated
 */
public interface ThymioDSL extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link thymio_DSL.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see thymio_DSL.Thymio_DSLPackage#getThymioDSL_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // ThymioDSL
