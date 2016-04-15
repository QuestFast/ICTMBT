/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ASPECT = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AspectImpl <em>Aspect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AspectImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAspect()
   * @generated
   */
  int ASPECT = 1;

  /**
   * The number of structural features of the '<em>Aspect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MappingImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 2;

  /**
   * The feature id for the '<em><b>Mappingname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__MAPPINGNAME = ASPECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = ASPECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AspectDefinitionImpl <em>Aspect Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AspectDefinitionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAspectDefinition()
   * @generated
   */
  int ASPECT_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Mappingdeclarartion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_DEFINITION__MAPPINGDECLARARTION = ASPECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pointcutdeclaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_DEFINITION__POINTCUTDECLARATION = ASPECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>AI Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_DEFINITION__AI_DECLARATION = ASPECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Aspect Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_DEFINITION_FEATURE_COUNT = ASPECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Mapping_DeclarationImpl <em>Mapping Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Mapping_DeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMapping_Declaration()
   * @generated
   */
  int MAPPING_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Reference mappingname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DECLARATION__REFERENCE_MAPPINGNAME = 0;

  /**
   * The number of structural features of the '<em>Mapping Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MappingNameImpl <em>Mapping Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MappingNameImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMappingName()
   * @generated
   */
  int MAPPING_NAME = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Mapping Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Pointcut_DeclarationImpl <em>Pointcut Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Pointcut_DeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPointcut_Declaration()
   * @generated
   */
  int POINTCUT_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Pointcut Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AIImpl <em>AI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AIImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAI()
   * @generated
   */
  int AI = 7;

  /**
   * The number of structural features of the '<em>AI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AI_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AdviceImpl <em>Advice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AdviceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAdvice()
   * @generated
   */
  int ADVICE = 8;

  /**
   * The feature id for the '<em><b>Advicetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__ADVICETYPE = AI_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Introadvicequery</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__INTROADVICEQUERY = AI_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Advice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_FEATURE_COUNT = AI_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AdviceTypeImpl <em>Advice Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AdviceTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAdviceType()
   * @generated
   */
  int ADVICE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Advice Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IntroAdviceQueryImpl <em>Intro Advice Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IntroAdviceQueryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntroAdviceQuery()
   * @generated
   */
  int INTRO_ADVICE_QUERY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRO_ADVICE_QUERY__NAME = 0;

  /**
   * The number of structural features of the '<em>Intro Advice Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRO_ADVICE_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IntroImpl <em>Intro</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IntroImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntro()
   * @generated
   */
  int INTRO = 11;

  /**
   * The feature id for the '<em><b>Introtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRO__INTROTYPE = AI_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Introquey</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRO__INTROQUEY = AI_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Intro</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRO_FEATURE_COUNT = AI_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IntroTypeImpl <em>Intro Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IntroTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntroType()
   * @generated
   */
  int INTRO_TYPE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRO_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Intro Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRO_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IntroQueryImpl <em>Intro Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IntroQueryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntroQuery()
   * @generated
   */
  int INTRO_QUERY = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRO_QUERY__NAME = 0;

  /**
   * The number of structural features of the '<em>Intro Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRO_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryDeclarationImpl <em>Query Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.QueryDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQueryDeclaration()
   * @generated
   */
  int QUERY_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Mappingdeclarartion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_DECLARATION__MAPPINGDECLARARTION = ASPECT_DEFINITION__MAPPINGDECLARARTION;

  /**
   * The feature id for the '<em><b>Pointcutdeclaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_DECLARATION__POINTCUTDECLARATION = ASPECT_DEFINITION__POINTCUTDECLARATION;

  /**
   * The feature id for the '<em><b>AI Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_DECLARATION__AI_DECLARATION = ASPECT_DEFINITION__AI_DECLARATION;

  /**
   * The number of structural features of the '<em>Query Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_DECLARATION_FEATURE_COUNT = ASPECT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryBodyImpl <em>Query Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.QueryBodyImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQueryBody()
   * @generated
   */
  int QUERY_BODY = 15;

  /**
   * The feature id for the '<em><b>Mappingdeclarartion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_BODY__MAPPINGDECLARARTION = QUERY_DECLARATION__MAPPINGDECLARARTION;

  /**
   * The feature id for the '<em><b>Pointcutdeclaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_BODY__POINTCUTDECLARATION = QUERY_DECLARATION__POINTCUTDECLARATION;

  /**
   * The feature id for the '<em><b>AI Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_BODY__AI_DECLARATION = QUERY_DECLARATION__AI_DECLARATION;

  /**
   * The number of structural features of the '<em>Query Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_BODY_FEATURE_COUNT = QUERY_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Mappingdeclarartion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__MAPPINGDECLARARTION = QUERY_BODY__MAPPINGDECLARARTION;

  /**
   * The feature id for the '<em><b>Pointcutdeclaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__POINTCUTDECLARATION = QUERY_BODY__POINTCUTDECLARATION;

  /**
   * The feature id for the '<em><b>AI Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__AI_DECLARATION = QUERY_BODY__AI_DECLARATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NAME = QUERY_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = QUERY_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OclExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOclExpression()
   * @generated
   */
  int OCL_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_EXPRESSION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Ocl Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_EXPRESSION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getAspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aspect</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getAspect()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Aspect();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Aspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect</em>'.
   * @see org.xtext.example.mydsl.myDsl.Aspect
   * @generated
   */
  EClass getAspect();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see org.xtext.example.mydsl.myDsl.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Mapping#getMappingname <em>Mappingname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mappingname</em>'.
   * @see org.xtext.example.mydsl.myDsl.Mapping#getMappingname()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Mappingname();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AspectDefinition <em>Aspect Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect Definition</em>'.
   * @see org.xtext.example.mydsl.myDsl.AspectDefinition
   * @generated
   */
  EClass getAspectDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.AspectDefinition#getMappingdeclarartion <em>Mappingdeclarartion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mappingdeclarartion</em>'.
   * @see org.xtext.example.mydsl.myDsl.AspectDefinition#getMappingdeclarartion()
   * @see #getAspectDefinition()
   * @generated
   */
  EReference getAspectDefinition_Mappingdeclarartion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.AspectDefinition#getPointcutdeclaration <em>Pointcutdeclaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointcutdeclaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.AspectDefinition#getPointcutdeclaration()
   * @see #getAspectDefinition()
   * @generated
   */
  EReference getAspectDefinition_Pointcutdeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.AspectDefinition#getAIDeclaration <em>AI Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>AI Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.AspectDefinition#getAIDeclaration()
   * @see #getAspectDefinition()
   * @generated
   */
  EReference getAspectDefinition_AIDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Mapping_Declaration <em>Mapping Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Mapping_Declaration
   * @generated
   */
  EClass getMapping_Declaration();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Mapping_Declaration#getReference_mappingname <em>Reference mappingname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference mappingname</em>'.
   * @see org.xtext.example.mydsl.myDsl.Mapping_Declaration#getReference_mappingname()
   * @see #getMapping_Declaration()
   * @generated
   */
  EReference getMapping_Declaration_Reference_mappingname();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MappingName <em>Mapping Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.MappingName
   * @generated
   */
  EClass getMappingName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MappingName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.MappingName#getName()
   * @see #getMappingName()
   * @generated
   */
  EAttribute getMappingName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Pointcut_Declaration <em>Pointcut Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Pointcut_Declaration
   * @generated
   */
  EClass getPointcut_Declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Pointcut_Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Pointcut_Declaration#getName()
   * @see #getPointcut_Declaration()
   * @generated
   */
  EAttribute getPointcut_Declaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AI <em>AI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AI</em>'.
   * @see org.xtext.example.mydsl.myDsl.AI
   * @generated
   */
  EClass getAI();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Advice <em>Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Advice</em>'.
   * @see org.xtext.example.mydsl.myDsl.Advice
   * @generated
   */
  EClass getAdvice();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Advice#getAdvicetype <em>Advicetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Advicetype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Advice#getAdvicetype()
   * @see #getAdvice()
   * @generated
   */
  EReference getAdvice_Advicetype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Advice#getIntroadvicequery <em>Introadvicequery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Introadvicequery</em>'.
   * @see org.xtext.example.mydsl.myDsl.Advice#getIntroadvicequery()
   * @see #getAdvice()
   * @generated
   */
  EReference getAdvice_Introadvicequery();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AdviceType <em>Advice Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Advice Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.AdviceType
   * @generated
   */
  EClass getAdviceType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AdviceType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.AdviceType#getName()
   * @see #getAdviceType()
   * @generated
   */
  EAttribute getAdviceType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.IntroAdviceQuery <em>Intro Advice Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intro Advice Query</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntroAdviceQuery
   * @generated
   */
  EClass getIntroAdviceQuery();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.IntroAdviceQuery#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntroAdviceQuery#getName()
   * @see #getIntroAdviceQuery()
   * @generated
   */
  EReference getIntroAdviceQuery_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Intro <em>Intro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intro</em>'.
   * @see org.xtext.example.mydsl.myDsl.Intro
   * @generated
   */
  EClass getIntro();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Intro#getIntrotype <em>Introtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Introtype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Intro#getIntrotype()
   * @see #getIntro()
   * @generated
   */
  EReference getIntro_Introtype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Intro#getIntroquey <em>Introquey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Introquey</em>'.
   * @see org.xtext.example.mydsl.myDsl.Intro#getIntroquey()
   * @see #getIntro()
   * @generated
   */
  EReference getIntro_Introquey();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.IntroType <em>Intro Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intro Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntroType
   * @generated
   */
  EClass getIntroType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.IntroType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntroType#getName()
   * @see #getIntroType()
   * @generated
   */
  EAttribute getIntroType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.IntroQuery <em>Intro Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intro Query</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntroQuery
   * @generated
   */
  EClass getIntroQuery();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.IntroQuery#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntroQuery#getName()
   * @see #getIntroQuery()
   * @generated
   */
  EReference getIntroQuery_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.QueryDeclaration <em>Query Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.QueryDeclaration
   * @generated
   */
  EClass getQueryDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.QueryBody <em>Query Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Body</em>'.
   * @see org.xtext.example.mydsl.myDsl.QueryBody
   * @generated
   */
  EClass getQueryBody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getName()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.OclExpression <em>Ocl Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.OclExpression
   * @generated
   */
  EClass getOclExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.OclExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.OclExpression#getValue()
   * @see #getOclExpression()
   * @generated
   */
  EAttribute getOclExpression_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Aspect</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ASPECT = eINSTANCE.getModel_Aspect();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AspectImpl <em>Aspect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AspectImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAspect()
     * @generated
     */
    EClass ASPECT = eINSTANCE.getAspect();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MappingImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Mappingname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__MAPPINGNAME = eINSTANCE.getMapping_Mappingname();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AspectDefinitionImpl <em>Aspect Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AspectDefinitionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAspectDefinition()
     * @generated
     */
    EClass ASPECT_DEFINITION = eINSTANCE.getAspectDefinition();

    /**
     * The meta object literal for the '<em><b>Mappingdeclarartion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_DEFINITION__MAPPINGDECLARARTION = eINSTANCE.getAspectDefinition_Mappingdeclarartion();

    /**
     * The meta object literal for the '<em><b>Pointcutdeclaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_DEFINITION__POINTCUTDECLARATION = eINSTANCE.getAspectDefinition_Pointcutdeclaration();

    /**
     * The meta object literal for the '<em><b>AI Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_DEFINITION__AI_DECLARATION = eINSTANCE.getAspectDefinition_AIDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Mapping_DeclarationImpl <em>Mapping Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Mapping_DeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMapping_Declaration()
     * @generated
     */
    EClass MAPPING_DECLARATION = eINSTANCE.getMapping_Declaration();

    /**
     * The meta object literal for the '<em><b>Reference mappingname</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_DECLARATION__REFERENCE_MAPPINGNAME = eINSTANCE.getMapping_Declaration_Reference_mappingname();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MappingNameImpl <em>Mapping Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MappingNameImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMappingName()
     * @generated
     */
    EClass MAPPING_NAME = eINSTANCE.getMappingName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_NAME__NAME = eINSTANCE.getMappingName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Pointcut_DeclarationImpl <em>Pointcut Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Pointcut_DeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPointcut_Declaration()
     * @generated
     */
    EClass POINTCUT_DECLARATION = eINSTANCE.getPointcut_Declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTCUT_DECLARATION__NAME = eINSTANCE.getPointcut_Declaration_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AIImpl <em>AI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AIImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAI()
     * @generated
     */
    EClass AI = eINSTANCE.getAI();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AdviceImpl <em>Advice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AdviceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAdvice()
     * @generated
     */
    EClass ADVICE = eINSTANCE.getAdvice();

    /**
     * The meta object literal for the '<em><b>Advicetype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVICE__ADVICETYPE = eINSTANCE.getAdvice_Advicetype();

    /**
     * The meta object literal for the '<em><b>Introadvicequery</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVICE__INTROADVICEQUERY = eINSTANCE.getAdvice_Introadvicequery();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AdviceTypeImpl <em>Advice Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AdviceTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAdviceType()
     * @generated
     */
    EClass ADVICE_TYPE = eINSTANCE.getAdviceType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADVICE_TYPE__NAME = eINSTANCE.getAdviceType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IntroAdviceQueryImpl <em>Intro Advice Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IntroAdviceQueryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntroAdviceQuery()
     * @generated
     */
    EClass INTRO_ADVICE_QUERY = eINSTANCE.getIntroAdviceQuery();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTRO_ADVICE_QUERY__NAME = eINSTANCE.getIntroAdviceQuery_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IntroImpl <em>Intro</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IntroImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntro()
     * @generated
     */
    EClass INTRO = eINSTANCE.getIntro();

    /**
     * The meta object literal for the '<em><b>Introtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTRO__INTROTYPE = eINSTANCE.getIntro_Introtype();

    /**
     * The meta object literal for the '<em><b>Introquey</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTRO__INTROQUEY = eINSTANCE.getIntro_Introquey();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IntroTypeImpl <em>Intro Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IntroTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntroType()
     * @generated
     */
    EClass INTRO_TYPE = eINSTANCE.getIntroType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTRO_TYPE__NAME = eINSTANCE.getIntroType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IntroQueryImpl <em>Intro Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IntroQueryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntroQuery()
     * @generated
     */
    EClass INTRO_QUERY = eINSTANCE.getIntroQuery();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTRO_QUERY__NAME = eINSTANCE.getIntroQuery_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryDeclarationImpl <em>Query Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.QueryDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQueryDeclaration()
     * @generated
     */
    EClass QUERY_DECLARATION = eINSTANCE.getQueryDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryBodyImpl <em>Query Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.QueryBodyImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQueryBody()
     * @generated
     */
    EClass QUERY_BODY = eINSTANCE.getQueryBody();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OclExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOclExpression()
     * @generated
     */
    EClass OCL_EXPRESSION = eINSTANCE.getOclExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_EXPRESSION__VALUE = eINSTANCE.getOclExpression_Value();

  }

} //MyDslPackage
