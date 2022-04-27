/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.ApplicabilityType;
import io.thlaegler.edifact.edilang.EdilangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applicability Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ApplicabilityTypeImpl#getApplicabilityTypeDescriptionCode <em>Applicability Type Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ApplicabilityTypeImpl#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ApplicabilityTypeImpl#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ApplicabilityTypeImpl#getApplicabilityTypeDescriptions <em>Applicability Type Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicabilityTypeImpl extends MinimalEObjectImpl.Container implements ApplicabilityType
{
  /**
   * The default value of the '{@link #getApplicabilityTypeDescriptionCode() <em>Applicability Type Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicabilityTypeDescriptionCode()
   * @generated
   * @ordered
   */
  protected static final String APPLICABILITY_TYPE_DESCRIPTION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getApplicabilityTypeDescriptionCode() <em>Applicability Type Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicabilityTypeDescriptionCode()
   * @generated
   * @ordered
   */
  protected String applicabilityTypeDescriptionCode = APPLICABILITY_TYPE_DESCRIPTION_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCodeListIdentificationCode() <em>Code List Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListIdentificationCode()
   * @generated
   * @ordered
   */
  protected static final String CODE_LIST_IDENTIFICATION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodeListIdentificationCode() <em>Code List Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListIdentificationCode()
   * @generated
   * @ordered
   */
  protected String codeListIdentificationCode = CODE_LIST_IDENTIFICATION_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCodeListResponsibleAgencyCode() <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   * @ordered
   */
  protected static final String CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodeListResponsibleAgencyCode() <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   * @ordered
   */
  protected String codeListResponsibleAgencyCode = CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getApplicabilityTypeDescriptions() <em>Applicability Type Descriptions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicabilityTypeDescriptions()
   * @generated
   * @ordered
   */
  protected static final String APPLICABILITY_TYPE_DESCRIPTIONS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getApplicabilityTypeDescriptions() <em>Applicability Type Descriptions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicabilityTypeDescriptions()
   * @generated
   * @ordered
   */
  protected String applicabilityTypeDescriptions = APPLICABILITY_TYPE_DESCRIPTIONS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicabilityTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EdilangPackage.eINSTANCE.getApplicabilityType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getApplicabilityTypeDescriptionCode()
  {
    return applicabilityTypeDescriptionCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setApplicabilityTypeDescriptionCode(String newApplicabilityTypeDescriptionCode)
  {
    String oldApplicabilityTypeDescriptionCode = applicabilityTypeDescriptionCode;
    applicabilityTypeDescriptionCode = newApplicabilityTypeDescriptionCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTION_CODE, oldApplicabilityTypeDescriptionCode, applicabilityTypeDescriptionCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCodeListIdentificationCode()
  {
    return codeListIdentificationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCodeListIdentificationCode(String newCodeListIdentificationCode)
  {
    String oldCodeListIdentificationCode = codeListIdentificationCode;
    codeListIdentificationCode = newCodeListIdentificationCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_IDENTIFICATION_CODE, oldCodeListIdentificationCode, codeListIdentificationCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCodeListResponsibleAgencyCode()
  {
    return codeListResponsibleAgencyCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCodeListResponsibleAgencyCode(String newCodeListResponsibleAgencyCode)
  {
    String oldCodeListResponsibleAgencyCode = codeListResponsibleAgencyCode;
    codeListResponsibleAgencyCode = newCodeListResponsibleAgencyCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE, oldCodeListResponsibleAgencyCode, codeListResponsibleAgencyCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getApplicabilityTypeDescriptions()
  {
    return applicabilityTypeDescriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setApplicabilityTypeDescriptions(String newApplicabilityTypeDescriptions)
  {
    String oldApplicabilityTypeDescriptions = applicabilityTypeDescriptions;
    applicabilityTypeDescriptions = newApplicabilityTypeDescriptions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTIONS, oldApplicabilityTypeDescriptions, applicabilityTypeDescriptions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTION_CODE:
        return getApplicabilityTypeDescriptionCode();
      case EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_IDENTIFICATION_CODE:
        return getCodeListIdentificationCode();
      case EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return getCodeListResponsibleAgencyCode();
      case EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTIONS:
        return getApplicabilityTypeDescriptions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTION_CODE:
        setApplicabilityTypeDescriptionCode((String)newValue);
        return;
      case EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode((String)newValue);
        return;
      case EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode((String)newValue);
        return;
      case EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTIONS:
        setApplicabilityTypeDescriptions((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTION_CODE:
        setApplicabilityTypeDescriptionCode(APPLICABILITY_TYPE_DESCRIPTION_CODE_EDEFAULT);
        return;
      case EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode(CODE_LIST_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode(CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT);
        return;
      case EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTIONS:
        setApplicabilityTypeDescriptions(APPLICABILITY_TYPE_DESCRIPTIONS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTION_CODE:
        return APPLICABILITY_TYPE_DESCRIPTION_CODE_EDEFAULT == null ? applicabilityTypeDescriptionCode != null : !APPLICABILITY_TYPE_DESCRIPTION_CODE_EDEFAULT.equals(applicabilityTypeDescriptionCode);
      case EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_IDENTIFICATION_CODE:
        return CODE_LIST_IDENTIFICATION_CODE_EDEFAULT == null ? codeListIdentificationCode != null : !CODE_LIST_IDENTIFICATION_CODE_EDEFAULT.equals(codeListIdentificationCode);
      case EdilangPackage.APPLICABILITY_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT == null ? codeListResponsibleAgencyCode != null : !CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT.equals(codeListResponsibleAgencyCode);
      case EdilangPackage.APPLICABILITY_TYPE__APPLICABILITY_TYPE_DESCRIPTIONS:
        return APPLICABILITY_TYPE_DESCRIPTIONS_EDEFAULT == null ? applicabilityTypeDescriptions != null : !APPLICABILITY_TYPE_DESCRIPTIONS_EDEFAULT.equals(applicabilityTypeDescriptions);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (applicabilityTypeDescriptionCode: ");
    result.append(applicabilityTypeDescriptionCode);
    result.append(", codeListIdentificationCode: ");
    result.append(codeListIdentificationCode);
    result.append(", codeListResponsibleAgencyCode: ");
    result.append(codeListResponsibleAgencyCode);
    result.append(", applicabilityTypeDescriptions: ");
    result.append(applicabilityTypeDescriptions);
    result.append(')');
    return result.toString();
  }

} //ApplicabilityTypeImpl