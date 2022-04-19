/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Number Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.ItemNumberIdentification#getItemIdentifier <em>Item Identifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ItemNumberIdentification#getItemTypeIdentificationCode <em>Item Type Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ItemNumberIdentification#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ItemNumberIdentification#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getItemNumberIdentification()
 * @model
 * @generated
 */
public interface ItemNumberIdentification extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Item Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Identifier</em>' attribute.
   * @see #setItemIdentifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getItemNumberIdentification_ItemIdentifier()
   * @model
   * @generated
   */
  String getItemIdentifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ItemNumberIdentification#getItemIdentifier <em>Item Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Identifier</em>' attribute.
   * @see #getItemIdentifier()
   * @generated
   */
  void setItemIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Item Type Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Type Identification Code</em>' attribute.
   * @see #setItemTypeIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getItemNumberIdentification_ItemTypeIdentificationCode()
   * @model
   * @generated
   */
  String getItemTypeIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ItemNumberIdentification#getItemTypeIdentificationCode <em>Item Type Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Type Identification Code</em>' attribute.
   * @see #getItemTypeIdentificationCode()
   * @generated
   */
  void setItemTypeIdentificationCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getItemNumberIdentification_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ItemNumberIdentification#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
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
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getItemNumberIdentification_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ItemNumberIdentification#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

} // ItemNumberIdentification
