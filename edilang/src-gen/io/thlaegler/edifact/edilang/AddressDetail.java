/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.AddressDetail#getAddressFormatCode <em>Address Format Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.AddressDetail#getAddressComponentDescriptions <em>Address Component Descriptions</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getAddressDetail()
 * @model
 * @generated
 */
public interface AddressDetail extends EObject
{
  /**
   * Returns the value of the '<em><b>Address Format Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address Format Code</em>' attribute.
   * @see #setAddressFormatCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAddressDetail_AddressFormatCode()
   * @model
   * @generated
   */
  String getAddressFormatCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AddressDetail#getAddressFormatCode <em>Address Format Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address Format Code</em>' attribute.
   * @see #getAddressFormatCode()
   * @generated
   */
  void setAddressFormatCode(String value);

  /**
   * Returns the value of the '<em><b>Address Component Descriptions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address Component Descriptions</em>' attribute list.
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAddressDetail_AddressComponentDescriptions()
   * @model unique="false"
   * @generated
   */
  EList<String> getAddressComponentDescriptions();

} // AddressDetail