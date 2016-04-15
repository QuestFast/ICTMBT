/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Intro#getIntrotype <em>Introtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Intro#getIntroquey <em>Introquey</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIntro()
 * @model
 * @generated
 */
public interface Intro extends AI
{
  /**
   * Returns the value of the '<em><b>Introtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Introtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Introtype</em>' containment reference.
   * @see #setIntrotype(IntroType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIntro_Introtype()
   * @model containment="true"
   * @generated
   */
  IntroType getIntrotype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Intro#getIntrotype <em>Introtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Introtype</em>' containment reference.
   * @see #getIntrotype()
   * @generated
   */
  void setIntrotype(IntroType value);

  /**
   * Returns the value of the '<em><b>Introquey</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Introquey</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Introquey</em>' containment reference.
   * @see #setIntroquey(IntroQuery)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIntro_Introquey()
   * @model containment="true"
   * @generated
   */
  IntroQuery getIntroquey();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Intro#getIntroquey <em>Introquey</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Introquey</em>' containment reference.
   * @see #getIntroquey()
   * @generated
   */
  void setIntroquey(IntroQuery value);

} // Intro
