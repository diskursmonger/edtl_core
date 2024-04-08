/**
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.edtl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.VarDeclaration#getV <em>V</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.VarDeclaration#getLocation <em>Location</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.VarDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getVarDeclaration()
 * @model
 * @generated
 */
public interface VarDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(Variable)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getVarDeclaration_V()
   * @model containment="true"
   * @generated
   */
  Variable getV();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.VarDeclaration#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(Variable value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getVarDeclaration_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.VarDeclaration#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getVarDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.VarDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // VarDeclaration
