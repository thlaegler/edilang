/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Logical State Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PhysicalLogicalStateInformationImpl#getPhysicalLogicalStateDescriptionCode <em>Physical Logical State Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PhysicalLogicalStateInformationImpl#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PhysicalLogicalStateInformationImpl#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PhysicalLogicalStateInformationImpl#getPhysicalLogicalStateDescription <em>Physical Logical State Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalLogicalStateInformationImpl extends MinimalEObjectImpl.Container implements PhysicalLogicalStateInformation
{
  /**
   * The default value of the '{@link #getPhysicalLogicalStateDescriptionCode() <em>Physical Logical State Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalLogicalStateDescriptionCode()
   * @generated
   * @ordered
   */
  protected static final String PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPhysicalLogicalStateDescriptionCode() <em>Physical Logical State Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalLogicalStateDescriptionCode()
   * @generated
   * @ordered
   */
  protected String physicalLogicalStateDescriptionCode = PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE_EDEFAULT;

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
   * The default value of the '{@link #getPhysicalLogicalStateDescription() <em>Physical Logical State Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalLogicalStateDescription()
   * @generated
   * @ordered
   */
  protected static final String PHYSICAL_LOGICAL_STATE_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPhysicalLogicalStateDescription() <em>Physical Logical State Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalLogicalStateDescription()
   * @generated
   * @ordered
   */
  protected String physicalLogicalStateDescription = PHYSICAL_LOGICAL_STATE_DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhysicalLogicalStateInformationImpl()
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
    return EdilangPackage.eINSTANCE.getPhysicalLogicalStateInformation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPhysicalLogicalStateDescriptionCode()
  {
    return physicalLogicalStateDescriptionCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPhysicalLogicalStateDescriptionCode(String newPhysicalLogicalStateDescriptionCode)
  {
    String oldPhysicalLogicalStateDescriptionCode = physicalLogicalStateDescriptionCode;
    physicalLogicalStateDescriptionCode = newPhysicalLogicalStateDescriptionCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE, oldPhysicalLogicalStateDescriptionCode, physicalLogicalStateDescriptionCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_IDENTIFICATION_CODE, oldCodeListIdentificationCode, codeListIdentificationCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE, oldCodeListResponsibleAgencyCode, codeListResponsibleAgencyCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPhysicalLogicalStateDescription()
  {
    return physicalLogicalStateDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPhysicalLogicalStateDescription(String newPhysicalLogicalStateDescription)
  {
    String oldPhysicalLogicalStateDescription = physicalLogicalStateDescription;
    physicalLogicalStateDescription = newPhysicalLogicalStateDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION, oldPhysicalLogicalStateDescription, physicalLogicalStateDescription));
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
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE:
        return getPhysicalLogicalStateDescriptionCode();
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_IDENTIFICATION_CODE:
        return getCodeListIdentificationCode();
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return getCodeListResponsibleAgencyCode();
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION:
        return getPhysicalLogicalStateDescription();
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
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE:
        setPhysicalLogicalStateDescriptionCode((String)newValue);
        return;
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode((String)newValue);
        return;
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode((String)newValue);
        return;
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION:
        setPhysicalLogicalStateDescription((String)newValue);
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
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE:
        setPhysicalLogicalStateDescriptionCode(PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE_EDEFAULT);
        return;
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode(CODE_LIST_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode(CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT);
        return;
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION:
        setPhysicalLogicalStateDescription(PHYSICAL_LOGICAL_STATE_DESCRIPTION_EDEFAULT);
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
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE:
        return PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE_EDEFAULT == null ? physicalLogicalStateDescriptionCode != null : !PHYSICAL_LOGICAL_STATE_DESCRIPTION_CODE_EDEFAULT.equals(physicalLogicalStateDescriptionCode);
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_IDENTIFICATION_CODE:
        return CODE_LIST_IDENTIFICATION_CODE_EDEFAULT == null ? codeListIdentificationCode != null : !CODE_LIST_IDENTIFICATION_CODE_EDEFAULT.equals(codeListIdentificationCode);
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT == null ? codeListResponsibleAgencyCode != null : !CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT.equals(codeListResponsibleAgencyCode);
      case EdilangPackage.PHYSICAL_LOGICAL_STATE_INFORMATION__PHYSICAL_LOGICAL_STATE_DESCRIPTION:
        return PHYSICAL_LOGICAL_STATE_DESCRIPTION_EDEFAULT == null ? physicalLogicalStateDescription != null : !PHYSICAL_LOGICAL_STATE_DESCRIPTION_EDEFAULT.equals(physicalLogicalStateDescription);
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
    result.append(" (physicalLogicalStateDescriptionCode: ");
    result.append(physicalLogicalStateDescriptionCode);
    result.append(", codeListIdentificationCode: ");
    result.append(codeListIdentificationCode);
    result.append(", codeListResponsibleAgencyCode: ");
    result.append(codeListResponsibleAgencyCode);
    result.append(", physicalLogicalStateDescription: ");
    result.append(physicalLogicalStateDescription);
    result.append(')');
    return result.toString();
  }

} //PhysicalLogicalStateInformationImpl