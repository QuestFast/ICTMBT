/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.ASPECT: return createAspect();
      case MyDslPackage.MAPPING: return createMapping();
      case MyDslPackage.ASPECT_DEFINITION: return createAspectDefinition();
      case MyDslPackage.MAPPING_DECLARATION: return createMapping_Declaration();
      case MyDslPackage.MAPPING_NAME: return createMappingName();
      case MyDslPackage.POINTCUT_DECLARATION: return createPointcut_Declaration();
      case MyDslPackage.AI: return createAI();
      case MyDslPackage.ADVICE: return createAdvice();
      case MyDslPackage.ADVICE_TYPE: return createAdviceType();
      case MyDslPackage.INTRO_ADVICE_QUERY: return createIntroAdviceQuery();
      case MyDslPackage.INTRO: return createIntro();
      case MyDslPackage.INTRO_TYPE: return createIntroType();
      case MyDslPackage.INTRO_QUERY: return createIntroQuery();
      case MyDslPackage.QUERY_DECLARATION: return createQueryDeclaration();
      case MyDslPackage.QUERY_BODY: return createQueryBody();
      case MyDslPackage.EXPRESSION: return createExpression();
      case MyDslPackage.OCL_EXPRESSION: return createOclExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aspect createAspect()
  {
    AspectImpl aspect = new AspectImpl();
    return aspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectDefinition createAspectDefinition()
  {
    AspectDefinitionImpl aspectDefinition = new AspectDefinitionImpl();
    return aspectDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping_Declaration createMapping_Declaration()
  {
    Mapping_DeclarationImpl mapping_Declaration = new Mapping_DeclarationImpl();
    return mapping_Declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingName createMappingName()
  {
    MappingNameImpl mappingName = new MappingNameImpl();
    return mappingName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pointcut_Declaration createPointcut_Declaration()
  {
    Pointcut_DeclarationImpl pointcut_Declaration = new Pointcut_DeclarationImpl();
    return pointcut_Declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AI createAI()
  {
    AIImpl ai = new AIImpl();
    return ai;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Advice createAdvice()
  {
    AdviceImpl advice = new AdviceImpl();
    return advice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdviceType createAdviceType()
  {
    AdviceTypeImpl adviceType = new AdviceTypeImpl();
    return adviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntroAdviceQuery createIntroAdviceQuery()
  {
    IntroAdviceQueryImpl introAdviceQuery = new IntroAdviceQueryImpl();
    return introAdviceQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intro createIntro()
  {
    IntroImpl intro = new IntroImpl();
    return intro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntroType createIntroType()
  {
    IntroTypeImpl introType = new IntroTypeImpl();
    return introType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntroQuery createIntroQuery()
  {
    IntroQueryImpl introQuery = new IntroQueryImpl();
    return introQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryDeclaration createQueryDeclaration()
  {
    QueryDeclarationImpl queryDeclaration = new QueryDeclarationImpl();
    return queryDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryBody createQueryBody()
  {
    QueryBodyImpl queryBody = new QueryBodyImpl();
    return queryBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclExpression createOclExpression()
  {
    OclExpressionImpl oclExpression = new OclExpressionImpl();
    return oclExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
