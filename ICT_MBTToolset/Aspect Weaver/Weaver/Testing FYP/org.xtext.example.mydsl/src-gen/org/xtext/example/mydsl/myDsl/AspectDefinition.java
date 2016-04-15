/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.AspectDefinition#getMappingdeclarartion <em>Mappingdeclarartion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.AspectDefinition#getPointcutdeclaration <em>Pointcutdeclaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.AspectDefinition#getAIDeclaration <em>AI Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAspectDefinition()
 * @model
 * @generated
 */
public interface AspectDefinition extends Aspect
{
  /**
   * Returns the value of the '<em><b>Mappingdeclarartion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappingdeclarartion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappingdeclarartion</em>' containment reference.
   * @see #setMappingdeclarartion(Mapping_Declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAspectDefinition_Mappingdeclarartion()
   * @model containment="true"
   * @generated
   */
  Mapping_Declaration getMappingdeclarartion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.AspectDefinition#getMappingdeclarartion <em>Mappingdeclarartion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mappingdeclarartion</em>' containment reference.
   * @see #getMappingdeclarartion()
   * @generated
   */
  void setMappingdeclarartion(Mapping_Declaration value);

  /**
   * Returns the value of the '<em><b>Pointcutdeclaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointcutdeclaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointcutdeclaration</em>' containment reference.
   * @see #setPointcutdeclaration(Pointcut_Declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAspectDefinition_Pointcutdeclaration()
   * @model containment="true"
   * @generated
   */
  Pointcut_Declaration getPointcutdeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.AspectDefinition#getPointcutdeclaration <em>Pointcutdeclaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointcutdeclaration</em>' containment reference.
   * @see #getPointcutdeclaration()
   * @generated
   */
  void setPointcutdeclaration(Pointcut_Declaration value);

  /**
   * Returns the value of the '<em><b>AI Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AI Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AI Declaration</em>' containment reference.
   * @see #setAIDeclaration(AI)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAspectDefinition_AIDeclaration()
   * @model containment="true"
   * @generated
   */
  AI getAIDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.AspectDefinition#getAIDeclaration <em>AI Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AI Declaration</em>' containment reference.
   * @see #getAIDeclaration()
   * @generated
   */
  void setAIDeclaration(AI value);

} // AspectDefinition
