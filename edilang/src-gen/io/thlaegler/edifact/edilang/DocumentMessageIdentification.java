/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Message Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.DocumentMessageIdentification#getDocumentIdentifier <em>Document Identifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.DocumentMessageIdentification#getVersionIdentifier <em>Version Identifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.DocumentMessageIdentification#getRevisionIdentifier <em>Revision Identifier</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getDocumentMessageIdentification()
 * @model
 * @generated
 */
public interface DocumentMessageIdentification extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Document Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Document Identifier</em>' attribute.
   * @see #setDocumentIdentifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getDocumentMessageIdentification_DocumentIdentifier()
   * @model
   * @generated
   */
  String getDocumentIdentifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.DocumentMessageIdentification#getDocumentIdentifier <em>Document Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Document Identifier</em>' attribute.
   * @see #getDocumentIdentifier()
   * @generated
   */
  void setDocumentIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version Identifier</em>' attribute.
   * @see #setVersionIdentifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getDocumentMessageIdentification_VersionIdentifier()
   * @model
   * @generated
   */
  String getVersionIdentifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.DocumentMessageIdentification#getVersionIdentifier <em>Version Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version Identifier</em>' attribute.
   * @see #getVersionIdentifier()
   * @generated
   */
  void setVersionIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Revision Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Revision Identifier</em>' attribute.
   * @see #setRevisionIdentifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getDocumentMessageIdentification_RevisionIdentifier()
   * @model
   * @generated
   */
  String getRevisionIdentifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.DocumentMessageIdentification#getRevisionIdentifier <em>Revision Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Revision Identifier</em>' attribute.
   * @see #getRevisionIdentifier()
   * @generated
   */
  void setRevisionIdentifier(String value);

} // DocumentMessageIdentification
