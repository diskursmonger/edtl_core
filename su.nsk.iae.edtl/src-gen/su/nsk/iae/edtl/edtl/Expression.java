/**
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.edtl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.Expression#getLeft <em>Left</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.Expression#getOrOp <em>Or Op</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.Expression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.Expression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Or Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or Op</em>' attribute.
   * @see #setOrOp(String)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getExpression_OrOp()
   * @model
   * @generated
   */
  String getOrOp();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.Expression#getOrOp <em>Or Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or Op</em>' attribute.
   * @see #getOrOp()
   * @generated
   */
  void setOrOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(XorExpression)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  XorExpression getRight();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.Expression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(XorExpression value);

} // Expression
