/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Logical State Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation#getPhysicalLogicalStateDescriptionCode <em>Physical Logical State Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation#getPhysicalLogicalStateDescription <em>Physical Logical State Description</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getPhysicalLogicalStateInformation()
 * @model
 * @generated
 */
public interface PhysicalLogicalStateInformation extends EObject
{
  /**
   * Returns the value of the '<em><b>Physical Logical State Description Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Physical Logical State Description Code</em>' attribute.
   * @see #setPhysicalLogicalStateDescriptionCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPhysicalLogicalStateInformation_PhysicalLogicalStateDescriptionCode()
   * @model
   * @generated
   */
  String getPhysicalLogicalStateDescriptionCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation#getPhysicalLogicalStateDescriptionCode <em>Physical Logical State Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Physical Logical State Description Code</em>' attribute.
   * @see #getPhysicalLogicalStateDescriptionCode()
   * @generated
   */
  void setPhysicalLogicalStateDescriptionCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPhysicalLogicalStateInformation_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
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
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPhysicalLogicalStateInformation_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

  /**
   * Returns the value of the '<em><b>Physical Logical State Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Physical Logical State Description</em>' attribute.
   * @see #setPhysicalLogicalStateDescription(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPhysicalLogicalStateInformation_PhysicalLogicalStateDescription()
   * @model
   * @generated
   */
  String getPhysicalLogicalStateDescription();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation#getPhysicalLogicalStateDescription <em>Physical Logical State Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Physical Logical State Description</em>' attribute.
   * @see #getPhysicalLogicalStateDescription()
   * @generated
   */
  void setPhysicalLogicalStateDescription(String value);

} // PhysicalLogicalStateInformation
