/**
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.edtl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import su.nsk.iae.edtl.edtl.Abbr;
import su.nsk.iae.edtl.edtl.DeclVarInput;
import su.nsk.iae.edtl.edtl.DeclVarOutput;
import su.nsk.iae.edtl.edtl.EdtlPackage;
import su.nsk.iae.edtl.edtl.Macros;
import su.nsk.iae.edtl.edtl.Model;
import su.nsk.iae.edtl.edtl.Requirement;
import su.nsk.iae.edtl.edtl.VarInit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.ModelImpl#getDeclVarInput <em>Decl Var Input</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.ModelImpl#getDeclVarOutput <em>Decl Var Output</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.ModelImpl#getVarInits <em>Var Inits</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.ModelImpl#getAbbrs <em>Abbrs</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.ModelImpl#getMacroses <em>Macroses</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.ModelImpl#getReqs <em>Reqs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getDeclVarInput() <em>Decl Var Input</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclVarInput()
   * @generated
   * @ordered
   */
  protected EList<DeclVarInput> declVarInput;

  /**
   * The cached value of the '{@link #getDeclVarOutput() <em>Decl Var Output</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclVarOutput()
   * @generated
   * @ordered
   */
  protected EList<DeclVarOutput> declVarOutput;

  /**
   * The cached value of the '{@link #getVarInits() <em>Var Inits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarInits()
   * @generated
   * @ordered
   */
  protected EList<VarInit> varInits;

  /**
   * The cached value of the '{@link #getAbbrs() <em>Abbrs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbbrs()
   * @generated
   * @ordered
   */
  protected EList<Abbr> abbrs;

  /**
   * The cached value of the '{@link #getMacroses() <em>Macroses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacroses()
   * @generated
   * @ordered
   */
  protected EList<Macros> macroses;

  /**
   * The cached value of the '{@link #getReqs() <em>Reqs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqs()
   * @generated
   * @ordered
   */
  protected EList<Requirement> reqs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return EdtlPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DeclVarInput> getDeclVarInput()
  {
    if (declVarInput == null)
    {
      declVarInput = new EObjectContainmentEList<DeclVarInput>(DeclVarInput.class, this, EdtlPackage.MODEL__DECL_VAR_INPUT);
    }
    return declVarInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DeclVarOutput> getDeclVarOutput()
  {
    if (declVarOutput == null)
    {
      declVarOutput = new EObjectContainmentEList<DeclVarOutput>(DeclVarOutput.class, this, EdtlPackage.MODEL__DECL_VAR_OUTPUT);
    }
    return declVarOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VarInit> getVarInits()
  {
    if (varInits == null)
    {
      varInits = new EObjectContainmentEList<VarInit>(VarInit.class, this, EdtlPackage.MODEL__VAR_INITS);
    }
    return varInits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Abbr> getAbbrs()
  {
    if (abbrs == null)
    {
      abbrs = new EObjectContainmentEList<Abbr>(Abbr.class, this, EdtlPackage.MODEL__ABBRS);
    }
    return abbrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Macros> getMacroses()
  {
    if (macroses == null)
    {
      macroses = new EObjectContainmentEList<Macros>(Macros.class, this, EdtlPackage.MODEL__MACROSES);
    }
    return macroses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Requirement> getReqs()
  {
    if (reqs == null)
    {
      reqs = new EObjectContainmentEList<Requirement>(Requirement.class, this, EdtlPackage.MODEL__REQS);
    }
    return reqs;
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
      case EdtlPackage.MODEL__DECL_VAR_INPUT:
        return ((InternalEList<?>)getDeclVarInput()).basicRemove(otherEnd, msgs);
      case EdtlPackage.MODEL__DECL_VAR_OUTPUT:
        return ((InternalEList<?>)getDeclVarOutput()).basicRemove(otherEnd, msgs);
      case EdtlPackage.MODEL__VAR_INITS:
        return ((InternalEList<?>)getVarInits()).basicRemove(otherEnd, msgs);
      case EdtlPackage.MODEL__ABBRS:
        return ((InternalEList<?>)getAbbrs()).basicRemove(otherEnd, msgs);
      case EdtlPackage.MODEL__MACROSES:
        return ((InternalEList<?>)getMacroses()).basicRemove(otherEnd, msgs);
      case EdtlPackage.MODEL__REQS:
        return ((InternalEList<?>)getReqs()).basicRemove(otherEnd, msgs);
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
      case EdtlPackage.MODEL__DECL_VAR_INPUT:
        return getDeclVarInput();
      case EdtlPackage.MODEL__DECL_VAR_OUTPUT:
        return getDeclVarOutput();
      case EdtlPackage.MODEL__VAR_INITS:
        return getVarInits();
      case EdtlPackage.MODEL__ABBRS:
        return getAbbrs();
      case EdtlPackage.MODEL__MACROSES:
        return getMacroses();
      case EdtlPackage.MODEL__REQS:
        return getReqs();
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
      case EdtlPackage.MODEL__DECL_VAR_INPUT:
        getDeclVarInput().clear();
        getDeclVarInput().addAll((Collection<? extends DeclVarInput>)newValue);
        return;
      case EdtlPackage.MODEL__DECL_VAR_OUTPUT:
        getDeclVarOutput().clear();
        getDeclVarOutput().addAll((Collection<? extends DeclVarOutput>)newValue);
        return;
      case EdtlPackage.MODEL__VAR_INITS:
        getVarInits().clear();
        getVarInits().addAll((Collection<? extends VarInit>)newValue);
        return;
      case EdtlPackage.MODEL__ABBRS:
        getAbbrs().clear();
        getAbbrs().addAll((Collection<? extends Abbr>)newValue);
        return;
      case EdtlPackage.MODEL__MACROSES:
        getMacroses().clear();
        getMacroses().addAll((Collection<? extends Macros>)newValue);
        return;
      case EdtlPackage.MODEL__REQS:
        getReqs().clear();
        getReqs().addAll((Collection<? extends Requirement>)newValue);
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
      case EdtlPackage.MODEL__DECL_VAR_INPUT:
        getDeclVarInput().clear();
        return;
      case EdtlPackage.MODEL__DECL_VAR_OUTPUT:
        getDeclVarOutput().clear();
        return;
      case EdtlPackage.MODEL__VAR_INITS:
        getVarInits().clear();
        return;
      case EdtlPackage.MODEL__ABBRS:
        getAbbrs().clear();
        return;
      case EdtlPackage.MODEL__MACROSES:
        getMacroses().clear();
        return;
      case EdtlPackage.MODEL__REQS:
        getReqs().clear();
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
      case EdtlPackage.MODEL__DECL_VAR_INPUT:
        return declVarInput != null && !declVarInput.isEmpty();
      case EdtlPackage.MODEL__DECL_VAR_OUTPUT:
        return declVarOutput != null && !declVarOutput.isEmpty();
      case EdtlPackage.MODEL__VAR_INITS:
        return varInits != null && !varInits.isEmpty();
      case EdtlPackage.MODEL__ABBRS:
        return abbrs != null && !abbrs.isEmpty();
      case EdtlPackage.MODEL__MACROSES:
        return macroses != null && !macroses.isEmpty();
      case EdtlPackage.MODEL__REQS:
        return reqs != null && !reqs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
