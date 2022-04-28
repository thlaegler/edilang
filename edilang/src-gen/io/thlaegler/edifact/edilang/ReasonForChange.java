/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reason For Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.ReasonForChange#getChangeReasonDescriptionCode <em>Change Reason Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ReasonForChange#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ReasonForChange#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ReasonForChange#getChangeReasonDescriptions <em>Change Reason Descriptions</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getReasonForChange()
 * @model
 * @generated
 */
public interface ReasonForChange extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Change Reason Description Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change Reason Description Code</em>' attribute.
   * @see #setChangeReasonDescriptionCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getReasonForChange_ChangeReasonDescriptionCode()
   * @model
   * @generated
   */
  String getChangeReasonDescriptionCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ReasonForChange#getChangeReasonDescriptionCode <em>Change Reason Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Change Reason Description Code</em>' attribute.
   * @see #getChangeReasonDescriptionCode()
   * @generated
   */
  void setChangeReasonDescriptionCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getReasonForChange_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ReasonForChange#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
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
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getReasonForChange_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ReasonForChange#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

  /**
   * Returns the value of the '<em><b>Change Reason Descriptions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change Reason Descriptions</em>' attribute.
   * @see #setChangeReasonDescriptions(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getReasonForChange_ChangeReasonDescriptions()
   * @model
   * @generated
   */
  String getChangeReasonDescriptions();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ReasonForChange#getChangeReasonDescriptions <em>Change Reason Descriptions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Change Reason Descriptions</em>' attribute.
   * @see #getChangeReasonDescriptions()
   * @generated
   */
  void setChangeReasonDescriptions(String value);

} // ReasonForChange
