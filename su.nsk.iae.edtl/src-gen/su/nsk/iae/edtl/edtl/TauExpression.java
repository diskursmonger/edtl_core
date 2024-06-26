/**
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.edtl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tau Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.TauExpression#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getTauExpression()
 * @model
 * @generated
 */
public interface TauExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(TimeLiteral)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getTauExpression_Time()
   * @model containment="true"
   * @generated
   */
  TimeLiteral getTime();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.TauExpression#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(TimeLiteral value);

} // TauExpression
