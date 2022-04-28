/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.AttributeType#getAttributeTypeDescriptionCode <em>Attribute Type Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.AttributeType#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.AttributeType#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.AttributeType#getAttributeTypeDescription <em>Attribute Type Description</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getAttributeType()
 * @model
 * @generated
 */
public interface AttributeType extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Attribute Type Description Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Type Description Code</em>' attribute.
   * @see #setAttributeTypeDescriptionCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAttributeType_AttributeTypeDescriptionCode()
   * @model
   * @generated
   */
  String getAttributeTypeDescriptionCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AttributeType#getAttributeTypeDescriptionCode <em>Attribute Type Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Type Description Code</em>' attribute.
   * @see #getAttributeTypeDescriptionCode()
   * @generated
   */
  void setAttributeTypeDescriptionCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAttributeType_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AttributeType#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
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
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAttributeType_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AttributeType#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

  /**
   * Returns the value of the '<em><b>Attribute Type Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Type Description</em>' attribute.
   * @see #setAttributeTypeDescription(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAttributeType_AttributeTypeDescription()
   * @model
   * @generated
   */
  String getAttributeTypeDescription();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AttributeType#getAttributeTypeDescription <em>Attribute Type Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Type Description</em>' attribute.
   * @see #getAttributeTypeDescription()
   * @generated
   */
  void setAttributeTypeDescription(String value);

} // AttributeType
