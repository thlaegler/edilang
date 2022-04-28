/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Cell Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.ArrayCellDetail#getArrayCellDataDescription <em>Array Cell Data Description</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getArrayCellDetail()
 * @model
 * @generated
 */
public interface ArrayCellDetail extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Array Cell Data Description</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Cell Data Description</em>' attribute list.
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getArrayCellDetail_ArrayCellDataDescription()
   * @model unique="false"
   * @generated
   */
  EList<String> getArrayCellDataDescription();

} // ArrayCellDetail
