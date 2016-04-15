/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Mapping;
import org.xtext.example.mydsl.myDsl.MappingName;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MappingImpl#getMappingname <em>Mappingname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends AspectImpl implements Mapping
{
  /**
   * The cached value of the '{@link #getMappingname() <em>Mappingname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingname()
   * @generated
   * @ordered
   */
  protected MappingName mappingname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return MyDslPackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingName getMappingname()
  {
    return mappingname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMappingname(MappingName newMappingname, NotificationChain msgs)
  {
    MappingName oldMappingname = mappingname;
    mappingname = newMappingname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MAPPING__MAPPINGNAME, oldMappingname, newMappingname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappingname(MappingName newMappingname)
  {
    if (newMappingname != mappingname)
    {
      NotificationChain msgs = null;
      if (mappingname != null)
        msgs = ((InternalEObject)mappingname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAPPING__MAPPINGNAME, null, msgs);
      if (newMappingname != null)
        msgs = ((InternalEObject)newMappingname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAPPING__MAPPINGNAME, null, msgs);
      msgs = basicSetMappingname(newMappingname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MAPPING__MAPPINGNAME, newMappingname, newMappingname));
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
      case MyDslPackage.MAPPING__MAPPINGNAME:
        return basicSetMappingname(null, msgs);
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
      case MyDslPackage.MAPPING__MAPPINGNAME:
        return getMappingname();
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
      case MyDslPackage.MAPPING__MAPPINGNAME:
        setMappingname((MappingName)newValue);
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
      case MyDslPackage.MAPPING__MAPPINGNAME:
        setMappingname((MappingName)null);
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
      case MyDslPackage.MAPPING__MAPPINGNAME:
        return mappingname != null;
    }
    return super.eIsSet(featureID);
  }

} //MappingImpl
