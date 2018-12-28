/**
 * generated by Xtext 2.16.0
 */
package com.ifs.lang.projection.projectionLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ifs.lang.projection.projectionLang.Model#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.ifs.lang.projection.projectionLang.ProjectionLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.ifs.lang.projection.projectionLang.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.ifs.lang.projection.projectionLang.ProjectionLangPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Type> getElements();

} // Model
