/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MappingName;
import org.xtext.example.mydsl.myDsl.Mapping_Declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Mapping_DeclarationImpl#getReference_mappingname <em>Reference mappingname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Mapping_DeclarationImpl extends MinimalEObjectImpl.Container implements Mapping_Declaration
{
  /**
   * The cached value of the '{@link #getReference_mappingname() <em>Reference mappingname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference_mappingname()
   * @generated
   * @ordered
   */
  protected MappingName reference_mappingname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Mapping_DeclarationImpl()
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
    return MyDslPackage.Literals.MAPPING_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingName getReference_mappingname()
  {
    if (reference_mappingname != null && reference_mappingname.eIsProxy())
    {
      InternalEObject oldReference_mappingname = (InternalEObject)reference_mappingname;
      reference_mappingname = (MappingName)eResolveProxy(oldReference_mappingname);
      if (reference_mappingname != oldReference_mappingname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.MAPPING_DECLARATION__REFERENCE_MAPPINGNAME, oldReference_mappingname, reference_mappingname));
      }
    }
    return reference_mappingname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingName basicGetReference_mappingname()
  {
    return reference_mappingname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference_mappingname(MappingName newReference_mappingname)
  {
    MappingName oldReference_mappingname = reference_mappingname;
    reference_mappingname = newReference_mappingname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MAPPING_DECLARATION__REFERENCE_MAPPINGNAME, oldReference_mappingname, reference_mappingname));
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
      case MyDslPackage.MAPPING_DECLARATION__REFERENCE_MAPPINGNAME:
        if (resolve) return getReference_mappingname();
        return basicGetReference_mappingname();
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
      case MyDslPackage.MAPPING_DECLARATION__REFERENCE_MAPPINGNAME:
        setReference_mappingname((MappingName)newValue);
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
      case MyDslPackage.MAPPING_DECLARATION__REFERENCE_MAPPINGNAME:
        setReference_mappingname((MappingName)null);
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
      case MyDslPackage.MAPPING_DECLARATION__REFERENCE_MAPPINGNAME:
        return reference_mappingname != null;
    }
    return super.eIsSet(featureID);
  }

} //Mapping_DeclarationImpl
