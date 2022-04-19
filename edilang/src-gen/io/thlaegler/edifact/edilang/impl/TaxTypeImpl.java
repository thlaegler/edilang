/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.TaxType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TaxTypeImpl#getTaxTypeNameCode <em>Tax Type Name Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TaxTypeImpl#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TaxTypeImpl#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TaxTypeImpl#getTaxTypeName <em>Tax Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxTypeImpl extends AbstractEdiFunctionImpl implements TaxType
{
  /**
   * The default value of the '{@link #getTaxTypeNameCode() <em>Tax Type Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaxTypeNameCode()
   * @generated
   * @ordered
   */
  protected static final String TAX_TYPE_NAME_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTaxTypeNameCode() <em>Tax Type Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaxTypeNameCode()
   * @generated
   * @ordered
   */
  protected String taxTypeNameCode = TAX_TYPE_NAME_CODE_EDEFAULT;

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
   * The default value of the '{@link #getTaxTypeName() <em>Tax Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaxTypeName()
   * @generated
   * @ordered
   */
  protected static final String TAX_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTaxTypeName() <em>Tax Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaxTypeName()
   * @generated
   * @ordered
   */
  protected String taxTypeName = TAX_TYPE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaxTypeImpl()
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
    return EdilangPackage.Literals.TAX_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTaxTypeNameCode()
  {
    return taxTypeNameCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTaxTypeNameCode(String newTaxTypeNameCode)
  {
    String oldTaxTypeNameCode = taxTypeNameCode;
    taxTypeNameCode = newTaxTypeNameCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_TYPE__TAX_TYPE_NAME_CODE, oldTaxTypeNameCode, taxTypeNameCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_TYPE__CODE_LIST_IDENTIFICATION_CODE, oldCodeListIdentificationCode, codeListIdentificationCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE, oldCodeListResponsibleAgencyCode, codeListResponsibleAgencyCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTaxTypeName()
  {
    return taxTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTaxTypeName(String newTaxTypeName)
  {
    String oldTaxTypeName = taxTypeName;
    taxTypeName = newTaxTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_TYPE__TAX_TYPE_NAME, oldTaxTypeName, taxTypeName));
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
      case EdilangPackage.TAX_TYPE__TAX_TYPE_NAME_CODE:
        return getTaxTypeNameCode();
      case EdilangPackage.TAX_TYPE__CODE_LIST_IDENTIFICATION_CODE:
        return getCodeListIdentificationCode();
      case EdilangPackage.TAX_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return getCodeListResponsibleAgencyCode();
      case EdilangPackage.TAX_TYPE__TAX_TYPE_NAME:
        return getTaxTypeName();
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
      case EdilangPackage.TAX_TYPE__TAX_TYPE_NAME_CODE:
        setTaxTypeNameCode((String)newValue);
        return;
      case EdilangPackage.TAX_TYPE__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode((String)newValue);
        return;
      case EdilangPackage.TAX_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode((String)newValue);
        return;
      case EdilangPackage.TAX_TYPE__TAX_TYPE_NAME:
        setTaxTypeName((String)newValue);
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
      case EdilangPackage.TAX_TYPE__TAX_TYPE_NAME_CODE:
        setTaxTypeNameCode(TAX_TYPE_NAME_CODE_EDEFAULT);
        return;
      case EdilangPackage.TAX_TYPE__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode(CODE_LIST_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.TAX_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode(CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT);
        return;
      case EdilangPackage.TAX_TYPE__TAX_TYPE_NAME:
        setTaxTypeName(TAX_TYPE_NAME_EDEFAULT);
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
      case EdilangPackage.TAX_TYPE__TAX_TYPE_NAME_CODE:
        return TAX_TYPE_NAME_CODE_EDEFAULT == null ? taxTypeNameCode != null : !TAX_TYPE_NAME_CODE_EDEFAULT.equals(taxTypeNameCode);
      case EdilangPackage.TAX_TYPE__CODE_LIST_IDENTIFICATION_CODE:
        return CODE_LIST_IDENTIFICATION_CODE_EDEFAULT == null ? codeListIdentificationCode != null : !CODE_LIST_IDENTIFICATION_CODE_EDEFAULT.equals(codeListIdentificationCode);
      case EdilangPackage.TAX_TYPE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT == null ? codeListResponsibleAgencyCode != null : !CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT.equals(codeListResponsibleAgencyCode);
      case EdilangPackage.TAX_TYPE__TAX_TYPE_NAME:
        return TAX_TYPE_NAME_EDEFAULT == null ? taxTypeName != null : !TAX_TYPE_NAME_EDEFAULT.equals(taxTypeName);
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
    result.append(" (taxTypeNameCode: ");
    result.append(taxTypeNameCode);
    result.append(", codeListIdentificationCode: ");
    result.append(codeListIdentificationCode);
    result.append(", codeListResponsibleAgencyCode: ");
    result.append(codeListResponsibleAgencyCode);
    result.append(", taxTypeName: ");
    result.append(taxTypeName);
    result.append(')');
    return result.toString();
  }

} //TaxTypeImpl
