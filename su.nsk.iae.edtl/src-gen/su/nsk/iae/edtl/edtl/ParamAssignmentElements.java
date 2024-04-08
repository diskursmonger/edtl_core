/**
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.edtl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Assignment Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.ParamAssignmentElements#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getParamAssignmentElements()
 * @model
 * @generated
 */
public interface ParamAssignmentElements extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link su.nsk.iae.edtl.edtl.CrossVarAbbr}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getParamAssignmentElements_Elements()
   * @model
   * @generated
   */
  EList<CrossVarAbbr> getElements();

} // ParamAssignmentElements
