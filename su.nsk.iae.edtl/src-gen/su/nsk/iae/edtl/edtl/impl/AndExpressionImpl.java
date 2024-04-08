/**
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.edtl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import su.nsk.iae.edtl.edtl.AndExpression;
import su.nsk.iae.edtl.edtl.EdtlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.AndExpressionImpl#getAndOp <em>And Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndExpressionImpl extends XorExpressionImpl implements AndExpression
{
  /**
   * The default value of the '{@link #getAndOp() <em>And Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAndOp()
   * @generated
   * @ordered
   */
  protected static final String AND_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAndOp() <em>And Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAndOp()
   * @generated
   * @ordered
   */
  protected String andOp = AND_OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EdtlPackage.Literals.AND_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAndOp()
  {
    return andOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAndOp(String newAndOp)
  {
    String oldAndOp = andOp;
    andOp = newAndOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.AND_EXPRESSION__AND_OP, oldAndOp, andOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EdtlPackage.AND_EXPRESSION__AND_OP:
        return getAndOp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdtlPackage.AND_EXPRESSION__AND_OP:
        setAndOp((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EdtlPackage.AND_EXPRESSION__AND_OP:
        setAndOp(AND_OP_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EdtlPackage.AND_EXPRESSION__AND_OP:
        return AND_OP_EDEFAULT == null ? andOp != null : !AND_OP_EDEFAULT.equals(andOp);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (andOp: ");
    result.append(andOp);
    result.append(')');
    return result.toString();
  }

} //AndExpressionImpl
