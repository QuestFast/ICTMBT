/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Aspect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aspect</em>'.
   * @generated
   */
  Aspect createAspect();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Aspect Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aspect Definition</em>'.
   * @generated
   */
  AspectDefinition createAspectDefinition();

  /**
   * Returns a new object of class '<em>Mapping Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Declaration</em>'.
   * @generated
   */
  Mapping_Declaration createMapping_Declaration();

  /**
   * Returns a new object of class '<em>Mapping Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Name</em>'.
   * @generated
   */
  MappingName createMappingName();

  /**
   * Returns a new object of class '<em>Pointcut Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pointcut Declaration</em>'.
   * @generated
   */
  Pointcut_Declaration createPointcut_Declaration();

  /**
   * Returns a new object of class '<em>AI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AI</em>'.
   * @generated
   */
  AI createAI();

  /**
   * Returns a new object of class '<em>Advice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Advice</em>'.
   * @generated
   */
  Advice createAdvice();

  /**
   * Returns a new object of class '<em>Advice Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Advice Type</em>'.
   * @generated
   */
  AdviceType createAdviceType();

  /**
   * Returns a new object of class '<em>Intro Advice Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intro Advice Query</em>'.
   * @generated
   */
  IntroAdviceQuery createIntroAdviceQuery();

  /**
   * Returns a new object of class '<em>Intro</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intro</em>'.
   * @generated
   */
  Intro createIntro();

  /**
   * Returns a new object of class '<em>Intro Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intro Type</em>'.
   * @generated
   */
  IntroType createIntroType();

  /**
   * Returns a new object of class '<em>Intro Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intro Query</em>'.
   * @generated
   */
  IntroQuery createIntroQuery();

  /**
   * Returns a new object of class '<em>Query Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Declaration</em>'.
   * @generated
   */
  QueryDeclaration createQueryDeclaration();

  /**
   * Returns a new object of class '<em>Query Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Body</em>'.
   * @generated
   */
  QueryBody createQueryBody();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Ocl Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Expression</em>'.
   * @generated
   */
  OclExpression createOclExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
