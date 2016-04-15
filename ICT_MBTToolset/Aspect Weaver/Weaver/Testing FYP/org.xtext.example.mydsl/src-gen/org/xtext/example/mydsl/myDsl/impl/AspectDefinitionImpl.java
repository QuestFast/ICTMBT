/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.AI;
import org.xtext.example.mydsl.myDsl.AspectDefinition;
import org.xtext.example.mydsl.myDsl.Mapping_Declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Pointcut_Declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AspectDefinitionImpl#getMappingdeclarartion <em>Mappingdeclarartion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AspectDefinitionImpl#getPointcutdeclaration <em>Pointcutdeclaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AspectDefinitionImpl#getAIDeclaration <em>AI Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectDefinitionImpl extends AspectImpl implements AspectDefinition
{
  /**
   * The cached value of the '{@link #getMappingdeclarartion() <em>Mappingdeclarartion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingdeclarartion()
   * @generated
   * @ordered
   */
  protected Mapping_Declaration mappingdeclarartion;

  /**
   * The cached value of the '{@link #getPointcutdeclaration() <em>Pointcutdeclaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcutdeclaration()
   * @generated
   * @ordered
   */
  protected Pointcut_Declaration pointcutdeclaration;

  /**
   * The cached value of the '{@link #getAIDeclaration() <em>AI Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAIDeclaration()
   * @generated
   * @ordered
   */
  protected AI aiDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AspectDefinitionImpl()
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
    return MyDslPackage.Literals.ASPECT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping_Declaration getMappingdeclarartion()
  {
    return mappingdeclarartion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMappingdeclarartion(Mapping_Declaration newMappingdeclarartion, NotificationChain msgs)
  {
    Mapping_Declaration oldMappingdeclarartion = mappingdeclarartion;
    mappingdeclarartion = newMappingdeclarartion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ASPECT_DEFINITION__MAPPINGDECLARARTION, oldMappingdeclarartion, newMappingdeclarartion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappingdeclarartion(Mapping_Declaration newMappingdeclarartion)
  {
    if (newMappingdeclarartion != mappingdeclarartion)
    {
      NotificationChain msgs = null;
      if (mappingdeclarartion != null)
        msgs = ((InternalEObject)mappingdeclarartion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ASPECT_DEFINITION__MAPPINGDECLARARTION, null, msgs);
      if (newMappingdeclarartion != null)
        msgs = ((InternalEObject)newMappingdeclarartion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ASPECT_DEFINITION__MAPPINGDECLARARTION, null, msgs);
      msgs = basicSetMappingdeclarartion(newMappingdeclarartion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ASPECT_DEFINITION__MAPPINGDECLARARTION, newMappingdeclarartion, newMappingdeclarartion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pointcut_Declaration getPointcutdeclaration()
  {
    return pointcutdeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointcutdeclaration(Pointcut_Declaration newPointcutdeclaration, NotificationChain msgs)
  {
    Pointcut_Declaration oldPointcutdeclaration = pointcutdeclaration;
    pointcutdeclaration = newPointcutdeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ASPECT_DEFINITION__POINTCUTDECLARATION, oldPointcutdeclaration, newPointcutdeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointcutdeclaration(Pointcut_Declaration newPointcutdeclaration)
  {
    if (newPointcutdeclaration != pointcutdeclaration)
    {
      NotificationChain msgs = null;
      if (pointcutdeclaration != null)
        msgs = ((InternalEObject)pointcutdeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ASPECT_DEFINITION__POINTCUTDECLARATION, null, msgs);
      if (newPointcutdeclaration != null)
        msgs = ((InternalEObject)newPointcutdeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ASPECT_DEFINITION__POINTCUTDECLARATION, null, msgs);
      msgs = basicSetPointcutdeclaration(newPointcutdeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ASPECT_DEFINITION__POINTCUTDECLARATION, newPointcutdeclaration, newPointcutdeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AI getAIDeclaration()
  {
    return aiDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAIDeclaration(AI newAIDeclaration, NotificationChain msgs)
  {
    AI oldAIDeclaration = aiDeclaration;
    aiDeclaration = newAIDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ASPECT_DEFINITION__AI_DECLARATION, oldAIDeclaration, newAIDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAIDeclaration(AI newAIDeclaration)
  {
    if (newAIDeclaration != aiDeclaration)
    {
      NotificationChain msgs = null;
      if (aiDeclaration != null)
        msgs = ((InternalEObject)aiDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ASPECT_DEFINITION__AI_DECLARATION, null, msgs);
      if (newAIDeclaration != null)
        msgs = ((InternalEObject)newAIDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ASPECT_DEFINITION__AI_DECLARATION, null, msgs);
      msgs = basicSetAIDeclaration(newAIDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ASPECT_DEFINITION__AI_DECLARATION, newAIDeclaration, newAIDeclaration));
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
      case MyDslPackage.ASPECT_DEFINITION__MAPPINGDECLARARTION:
        return basicSetMappingdeclarartion(null, msgs);
      case MyDslPackage.ASPECT_DEFINITION__POINTCUTDECLARATION:
        return basicSetPointcutdeclaration(null, msgs);
      case MyDslPackage.ASPECT_DEFINITION__AI_DECLARATION:
        return basicSetAIDeclaration(null, msgs);
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
      case MyDslPackage.ASPECT_DEFINITION__MAPPINGDECLARARTION:
        return getMappingdeclarartion();
      case MyDslPackage.ASPECT_DEFINITION__POINTCUTDECLARATION:
        return getPointcutdeclaration();
      case MyDslPackage.ASPECT_DEFINITION__AI_DECLARATION:
        return getAIDeclaration();
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
      case MyDslPackage.ASPECT_DEFINITION__MAPPINGDECLARARTION:
        setMappingdeclarartion((Mapping_Declaration)newValue);
        return;
      case MyDslPackage.ASPECT_DEFINITION__POINTCUTDECLARATION:
        setPointcutdeclaration((Pointcut_Declaration)newValue);
        return;
      case MyDslPackage.ASPECT_DEFINITION__AI_DECLARATION:
        setAIDeclaration((AI)newValue);
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
      case MyDslPackage.ASPECT_DEFINITION__MAPPINGDECLARARTION:
        setMappingdeclarartion((Mapping_Declaration)null);
        return;
      case MyDslPackage.ASPECT_DEFINITION__POINTCUTDECLARATION:
        setPointcutdeclaration((Pointcut_Declaration)null);
        return;
      case MyDslPackage.ASPECT_DEFINITION__AI_DECLARATION:
        setAIDeclaration((AI)null);
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
      case MyDslPackage.ASPECT_DEFINITION__MAPPINGDECLARARTION:
        return mappingdeclarartion != null;
      case MyDslPackage.ASPECT_DEFINITION__POINTCUTDECLARATION:
        return pointcutdeclaration != null;
      case MyDslPackage.ASPECT_DEFINITION__AI_DECLARATION:
        return aiDeclaration != null;
    }
    return super.eIsSet(featureID);
  }

} //AspectDefinitionImpl
