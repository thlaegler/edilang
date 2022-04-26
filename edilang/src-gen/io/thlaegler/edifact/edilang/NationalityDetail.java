/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nationality Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.NationalityDetail#getNationalityNameCode <em>Nationality Name Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NationalityDetail#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NationalityDetail#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NationalityDetail#getNationalityName <em>Nationality Name</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getNationalityDetail()
 * @model
 * @generated
 */
public interface NationalityDetail extends EObject
{
  /**
   * Returns the value of the '<em><b>Nationality Name Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nationality Name Code</em>' attribute.
   * @see #setNationalityNameCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNationalityDetail_NationalityNameCode()
   * @model
   * @generated
   */
  String getNationalityNameCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NationalityDetail#getNationalityNameCode <em>Nationality Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nationality Name Code</em>' attribute.
   * @see #getNationalityNameCode()
   * @generated
   */
  void setNationalityNameCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNationalityDetail_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NationalityDetail#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
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
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNationalityDetail_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NationalityDetail#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

  /**
   * Returns the value of the '<em><b>Nationality Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nationality Name</em>' attribute.
   * @see #setNationalityName(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNationalityDetail_NationalityName()
   * @model
   * @generated
   */
  String getNationalityName();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NationalityDetail#getNationalityName <em>Nationality Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nationality Name</em>' attribute.
   * @see #getNationalityName()
   * @generated
   */
  void setNationalityName(String value);

} // NationalityDetail
