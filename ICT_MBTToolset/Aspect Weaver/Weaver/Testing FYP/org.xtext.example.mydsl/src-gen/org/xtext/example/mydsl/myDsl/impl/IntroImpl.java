/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Intro;
import org.xtext.example.mydsl.myDsl.IntroQuery;
import org.xtext.example.mydsl.myDsl.IntroType;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IntroImpl#getIntrotype <em>Introtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IntroImpl#getIntroquey <em>Introquey</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntroImpl extends AIImpl implements Intro
{
  /**
   * The cached value of the '{@link #getIntrotype() <em>Introtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntrotype()
   * @generated
   * @ordered
   */
  protected IntroType introtype;

  /**
   * The cached value of the '{@link #getIntroquey() <em>Introquey</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntroquey()
   * @generated
   * @ordered
   */
  protected IntroQuery introquey;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntroImpl()
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
    return MyDslPackage.Literals.INTRO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntroType getIntrotype()
  {
    return introtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntrotype(IntroType newIntrotype, NotificationChain msgs)
  {
    IntroType oldIntrotype = introtype;
    introtype = newIntrotype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INTRO__INTROTYPE, oldIntrotype, newIntrotype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntrotype(IntroType newIntrotype)
  {
    if (newIntrotype != introtype)
    {
      NotificationChain msgs = null;
      if (introtype != null)
        msgs = ((InternalEObject)introtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTRO__INTROTYPE, null, msgs);
      if (newIntrotype != null)
        msgs = ((InternalEObject)newIntrotype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTRO__INTROTYPE, null, msgs);
      msgs = basicSetIntrotype(newIntrotype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTRO__INTROTYPE, newIntrotype, newIntrotype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntroQuery getIntroquey()
  {
    return introquey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntroquey(IntroQuery newIntroquey, NotificationChain msgs)
  {
    IntroQuery oldIntroquey = introquey;
    introquey = newIntroquey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INTRO__INTROQUEY, oldIntroquey, newIntroquey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntroquey(IntroQuery newIntroquey)
  {
    if (newIntroquey != introquey)
    {
      NotificationChain msgs = null;
      if (introquey != null)
        msgs = ((InternalEObject)introquey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTRO__INTROQUEY, null, msgs);
      if (newIntroquey != null)
        msgs = ((InternalEObject)newIntroquey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTRO__INTROQUEY, null, msgs);
      msgs = basicSetIntroquey(newIntroquey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTRO__INTROQUEY, newIntroquey, newIntroquey));
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
      case MyDslPackage.INTRO__INTROTYPE:
        return basicSetIntrotype(null, msgs);
      case MyDslPackage.INTRO__INTROQUEY:
        return basicSetIntroquey(null, msgs);
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
      case MyDslPackage.INTRO__INTROTYPE:
        return getIntrotype();
      case MyDslPackage.INTRO__INTROQUEY:
        return getIntroquey();
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
      case MyDslPackage.INTRO__INTROTYPE:
        setIntrotype((IntroType)newValue);
        return;
      case MyDslPackage.INTRO__INTROQUEY:
        setIntroquey((IntroQuery)newValue);
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
      case MyDslPackage.INTRO__INTROTYPE:
        setIntrotype((IntroType)null);
        return;
      case MyDslPackage.INTRO__INTROQUEY:
        setIntroquey((IntroQuery)null);
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
      case MyDslPackage.INTRO__INTROTYPE:
        return introtype != null;
      case MyDslPackage.INTRO__INTROQUEY:
        return introquey != null;
    }
    return super.eIsSet(featureID);
  }

} //IntroImpl
