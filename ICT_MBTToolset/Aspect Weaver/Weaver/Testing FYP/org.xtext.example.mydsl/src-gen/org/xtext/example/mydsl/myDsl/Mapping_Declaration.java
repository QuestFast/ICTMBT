/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mapping_Declaration#getReference_mappingname <em>Reference mappingname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMapping_Declaration()
 * @model
 * @generated
 */
public interface Mapping_Declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference mappingname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference mappingname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference mappingname</em>' reference.
   * @see #setReference_mappingname(MappingName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMapping_Declaration_Reference_mappingname()
   * @model
   * @generated
   */
  MappingName getReference_mappingname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mapping_Declaration#getReference_mappingname <em>Reference mappingname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference mappingname</em>' reference.
   * @see #getReference_mappingname()
   * @generated
   */
  void setReference_mappingname(MappingName value);

} // Mapping_Declaration
