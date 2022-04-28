/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Set Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.CodeSetIdentification#getSimpleDataElementTagIdentifier <em>Simple Data Element Tag Identifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CodeSetIdentification#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CodeSetIdentification#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getCodeSetIdentification()
 * @model
 * @generated
 */
public interface CodeSetIdentification extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Simple Data Element Tag Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Data Element Tag Identifier</em>' attribute.
   * @see #setSimpleDataElementTagIdentifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCodeSetIdentification_SimpleDataElementTagIdentifier()
   * @model
   * @generated
   */
  String getSimpleDataElementTagIdentifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CodeSetIdentification#getSimpleDataElementTagIdentifier <em>Simple Data Element Tag Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Data Element Tag Identifier</em>' attribute.
   * @see #getSimpleDataElementTagIdentifier()
   * @generated
   */
  void setSimpleDataElementTagIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCodeSetIdentification_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CodeSetIdentification#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
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
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCodeSetIdentification_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CodeSetIdentification#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

} // CodeSetIdentification
