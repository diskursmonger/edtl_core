/**
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.edtl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.VarInit#getVarAssign <em>Var Assign</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getVarInit()
 * @model
 * @generated
 */
public interface VarInit extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Assign</b></em>' containment reference list.
   * The list contents are of type {@link su.nsk.iae.edtl.edtl.VarAssign}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Assign</em>' containment reference list.
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getVarInit_VarAssign()
   * @model containment="true"
   * @generated
   */
  EList<VarAssign> getVarAssign();

} // VarInit
