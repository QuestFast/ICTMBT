/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mapping#getMappingname <em>Mappingname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends Aspect
{
  /**
   * Returns the value of the '<em><b>Mappingname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappingname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappingname</em>' containment reference.
   * @see #setMappingname(MappingName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMapping_Mappingname()
   * @model containment="true"
   * @generated
   */
  MappingName getMappingname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mapping#getMappingname <em>Mappingname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mappingname</em>' containment reference.
   * @see #getMappingname()
   * @generated
   */
  void setMappingname(MappingName value);

} // Mapping
