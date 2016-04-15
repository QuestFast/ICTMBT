/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Advice;
import org.xtext.example.mydsl.myDsl.AdviceType;
import org.xtext.example.mydsl.myDsl.IntroAdviceQuery;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AdviceImpl#getAdvicetype <em>Advicetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AdviceImpl#getIntroadvicequery <em>Introadvicequery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdviceImpl extends AIImpl implements Advice
{
  /**
   * The cached value of the '{@link #getAdvicetype() <em>Advicetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvicetype()
   * @generated
   * @ordered
   */
  protected AdviceType advicetype;

  /**
   * The cached value of the '{@link #getIntroadvicequery() <em>Introadvicequery</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntroadvicequery()
   * @generated
   * @ordered
   */
  protected IntroAdviceQuery introadvicequery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdviceImpl()
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
    return MyDslPackage.Literals.ADVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdviceType getAdvicetype()
  {
    return advicetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdvicetype(AdviceType newAdvicetype, NotificationChain msgs)
  {
    AdviceType oldAdvicetype = advicetype;
    advicetype = newAdvicetype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ADVICE__ADVICETYPE, oldAdvicetype, newAdvicetype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdvicetype(AdviceType newAdvicetype)
  {
    if (newAdvicetype != advicetype)
    {
      NotificationChain msgs = null;
      if (advicetype != null)
        msgs = ((InternalEObject)advicetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADVICE__ADVICETYPE, null, msgs);
      if (newAdvicetype != null)
        msgs = ((InternalEObject)newAdvicetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADVICE__ADVICETYPE, null, msgs);
      msgs = basicSetAdvicetype(newAdvicetype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ADVICE__ADVICETYPE, newAdvicetype, newAdvicetype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntroAdviceQuery getIntroadvicequery()
  {
    return introadvicequery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntroadvicequery(IntroAdviceQuery newIntroadvicequery, NotificationChain msgs)
  {
    IntroAdviceQuery oldIntroadvicequery = introadvicequery;
    introadvicequery = newIntroadvicequery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ADVICE__INTROADVICEQUERY, oldIntroadvicequery, newIntroadvicequery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntroadvicequery(IntroAdviceQuery newIntroadvicequery)
  {
    if (newIntroadvicequery != introadvicequery)
    {
      NotificationChain msgs = null;
      if (introadvicequery != null)
        msgs = ((InternalEObject)introadvicequery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADVICE__INTROADVICEQUERY, null, msgs);
      if (newIntroadvicequery != null)
        msgs = ((InternalEObject)newIntroadvicequery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADVICE__INTROADVICEQUERY, null, msgs);
      msgs = basicSetIntroadvicequery(newIntroadvicequery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ADVICE__INTROADVICEQUERY, newIntroadvicequery, newIntroadvicequery));
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
      case MyDslPackage.ADVICE__ADVICETYPE:
        return basicSetAdvicetype(null, msgs);
      case MyDslPackage.ADVICE__INTROADVICEQUERY:
        return basicSetIntroadvicequery(null, msgs);
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
      case MyDslPackage.ADVICE__ADVICETYPE:
        return getAdvicetype();
      case MyDslPackage.ADVICE__INTROADVICEQUERY:
        return getIntroadvicequery();
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
      case MyDslPackage.ADVICE__ADVICETYPE:
        setAdvicetype((AdviceType)newValue);
        return;
      case MyDslPackage.ADVICE__INTROADVICEQUERY:
        setIntroadvicequery((IntroAdviceQuery)newValue);
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
      case MyDslPackage.ADVICE__ADVICETYPE:
        setAdvicetype((AdviceType)null);
        return;
      case MyDslPackage.ADVICE__INTROADVICEQUERY:
        setIntroadvicequery((IntroAdviceQuery)null);
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
      case MyDslPackage.ADVICE__ADVICETYPE:
        return advicetype != null;
      case MyDslPackage.ADVICE__INTROADVICEQUERY:
        return introadvicequery != null;
    }
    return super.eIsSet(featureID);
  }

} //AdviceImpl
