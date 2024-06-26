/**
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.edtl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import su.nsk.iae.edtl.edtl.DeclVarInput;
import su.nsk.iae.edtl.edtl.EdtlPackage;
import su.nsk.iae.edtl.edtl.VarDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decl Var Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.DeclVarInputImpl#getInputCounter <em>Input Counter</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.DeclVarInputImpl#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclVarInputImpl extends MinimalEObjectImpl.Container implements DeclVarInput
{
  /**
   * The default value of the '{@link #getInputCounter() <em>Input Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputCounter()
   * @generated
   * @ordered
   */
  protected static final String INPUT_COUNTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInputCounter() <em>Input Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputCounter()
   * @generated
   * @ordered
   */
  protected String inputCounter = INPUT_COUNTER_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarDecls() <em>Var Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarDecls()
   * @generated
   * @ordered
   */
  protected EList<VarDeclaration> varDecls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclVarInputImpl()
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
    return EdtlPackage.Literals.DECL_VAR_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInputCounter()
  {
    return inputCounter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInputCounter(String newInputCounter)
  {
    String oldInputCounter = inputCounter;
    inputCounter = newInputCounter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.DECL_VAR_INPUT__INPUT_COUNTER, oldInputCounter, inputCounter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VarDeclaration> getVarDecls()
  {
    if (varDecls == null)
    {
      varDecls = new EObjectContainmentEList<VarDeclaration>(VarDeclaration.class, this, EdtlPackage.DECL_VAR_INPUT__VAR_DECLS);
    }
    return varDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EdtlPackage.DECL_VAR_INPUT__VAR_DECLS:
        return ((InternalEList<?>)getVarDecls()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EdtlPackage.DECL_VAR_INPUT__INPUT_COUNTER:
        return getInputCounter();
      case EdtlPackage.DECL_VAR_INPUT__VAR_DECLS:
        return getVarDecls();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdtlPackage.DECL_VAR_INPUT__INPUT_COUNTER:
        setInputCounter((String)newValue);
        return;
      case EdtlPackage.DECL_VAR_INPUT__VAR_DECLS:
        getVarDecls().clear();
        getVarDecls().addAll((Collection<? extends VarDeclaration>)newValue);
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
      case EdtlPackage.DECL_VAR_INPUT__INPUT_COUNTER:
        setInputCounter(INPUT_COUNTER_EDEFAULT);
        return;
      case EdtlPackage.DECL_VAR_INPUT__VAR_DECLS:
        getVarDecls().clear();
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
      case EdtlPackage.DECL_VAR_INPUT__INPUT_COUNTER:
        return INPUT_COUNTER_EDEFAULT == null ? inputCounter != null : !INPUT_COUNTER_EDEFAULT.equals(inputCounter);
      case EdtlPackage.DECL_VAR_INPUT__VAR_DECLS:
        return varDecls != null && !varDecls.isEmpty();
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
    result.append(" (inputCounter: ");
    result.append(inputCounter);
    result.append(')');
    return result.toString();
  }

} //DeclVarInputImpl
