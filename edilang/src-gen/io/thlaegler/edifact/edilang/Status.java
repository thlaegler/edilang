/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.Status#getStatusDescriptionCode <em>Status Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.Status#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.Status#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.Status#getStatusDescription <em>Status Description</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getStatus()
 * @model
 * @generated
 */
public interface Status extends EObject
{
  /**
   * Returns the value of the '<em><b>Status Description Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status Description Code</em>' attribute.
   * @see #setStatusDescriptionCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getStatus_StatusDescriptionCode()
   * @model
   * @generated
   */
  String getStatusDescriptionCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.Status#getStatusDescriptionCode <em>Status Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status Description Code</em>' attribute.
   * @see #getStatusDescriptionCode()
   * @generated
   */
  void setStatusDescriptionCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getStatus_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.Status#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Identification Code</em>' attribute.
   * @see #getCodeListIdentificationCode()
   * @generated
   */
  void setCodeListIdentificationCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Responsible Agency Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #setCodeListResponsibleAgencyCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getStatus_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.Status#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

  /**
   * Returns the value of the '<em><b>Status Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status Description</em>' attribute.
   * @see #setStatusDescription(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getStatus_StatusDescription()
   * @model
   * @generated
   */
  String getStatusDescription();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.Status#getStatusDescription <em>Status Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status Description</em>' attribute.
   * @see #getStatusDescription()
   * @generated
   */
  void setStatusDescription(String value);

} // Status
