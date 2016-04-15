/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Advice#getAdvicetype <em>Advicetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Advice#getIntroadvicequery <em>Introadvicequery</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAdvice()
 * @model
 * @generated
 */
public interface Advice extends AI
{
  /**
   * Returns the value of the '<em><b>Advicetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advicetype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Advicetype</em>' containment reference.
   * @see #setAdvicetype(AdviceType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAdvice_Advicetype()
   * @model containment="true"
   * @generated
   */
  AdviceType getAdvicetype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Advice#getAdvicetype <em>Advicetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Advicetype</em>' containment reference.
   * @see #getAdvicetype()
   * @generated
   */
  void setAdvicetype(AdviceType value);

  /**
   * Returns the value of the '<em><b>Introadvicequery</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Introadvicequery</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Introadvicequery</em>' containment reference.
   * @see #setIntroadvicequery(IntroAdviceQuery)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAdvice_Introadvicequery()
   * @model containment="true"
   * @generated
   */
  IntroAdviceQuery getIntroadvicequery();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Advice#getIntroadvicequery <em>Introadvicequery</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Introadvicequery</em>' containment reference.
   * @see #getIntroadvicequery()
   * @generated
   */
  void setIntroadvicequery(IntroAdviceQuery value);

} // Advice
