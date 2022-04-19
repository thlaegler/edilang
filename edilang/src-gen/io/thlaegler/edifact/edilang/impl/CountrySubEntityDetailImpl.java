/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.CountrySubEntityDetail;
import io.thlaegler.edifact.edilang.EdilangPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Sub Entity Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CountrySubEntityDetailImpl#getCountrySubEntityNameCode <em>Country Sub Entity Name Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CountrySubEntityDetailImpl#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CountrySubEntityDetailImpl#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CountrySubEntityDetailImpl#getCountrySubEntityName <em>Country Sub Entity Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountrySubEntityDetailImpl extends AbstractEdiFunctionImpl implements CountrySubEntityDetail
{
  /**
   * The cached value of the '{@link #getCountrySubEntityNameCode() <em>Country Sub Entity Name Code</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountrySubEntityNameCode()
   * @generated
   * @ordered
   */
  protected EList<String> countrySubEntityNameCode;

  /**
   * The cached value of the '{@link #getCodeListIdentificationCode() <em>Code List Identification Code</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListIdentificationCode()
   * @generated
   * @ordered
   */
  protected EList<String> codeListIdentificationCode;

  /**
   * The cached value of the '{@link #getCodeListResponsibleAgencyCode() <em>Code List Responsible Agency Code</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   * @ordered
   */
  protected EList<String> codeListResponsibleAgencyCode;

  /**
   * The cached value of the '{@link #getCountrySubEntityName() <em>Country Sub Entity Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountrySubEntityName()
   * @generated
   * @ordered
   */
  protected EList<String> countrySubEntityName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CountrySubEntityDetailImpl()
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
    return EdilangPackage.Literals.COUNTRY_SUB_ENTITY_DETAIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getCountrySubEntityNameCode()
  {
    if (countrySubEntityNameCode == null)
    {
      countrySubEntityNameCode = new EDataTypeEList<String>(String.class, this, EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME_CODE);
    }
    return countrySubEntityNameCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getCodeListIdentificationCode()
  {
    if (codeListIdentificationCode == null)
    {
      codeListIdentificationCode = new EDataTypeEList<String>(String.class, this, EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_IDENTIFICATION_CODE);
    }
    return codeListIdentificationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getCodeListResponsibleAgencyCode()
  {
    if (codeListResponsibleAgencyCode == null)
    {
      codeListResponsibleAgencyCode = new EDataTypeEList<String>(String.class, this, EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE);
    }
    return codeListResponsibleAgencyCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getCountrySubEntityName()
  {
    if (countrySubEntityName == null)
    {
      countrySubEntityName = new EDataTypeEList<String>(String.class, this, EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME);
    }
    return countrySubEntityName;
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
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME_CODE:
        return getCountrySubEntityNameCode();
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_IDENTIFICATION_CODE:
        return getCodeListIdentificationCode();
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return getCodeListResponsibleAgencyCode();
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME:
        return getCountrySubEntityName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME_CODE:
        getCountrySubEntityNameCode().clear();
        getCountrySubEntityNameCode().addAll((Collection<? extends String>)newValue);
        return;
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_IDENTIFICATION_CODE:
        getCodeListIdentificationCode().clear();
        getCodeListIdentificationCode().addAll((Collection<? extends String>)newValue);
        return;
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        getCodeListResponsibleAgencyCode().clear();
        getCodeListResponsibleAgencyCode().addAll((Collection<? extends String>)newValue);
        return;
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME:
        getCountrySubEntityName().clear();
        getCountrySubEntityName().addAll((Collection<? extends String>)newValue);
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
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME_CODE:
        getCountrySubEntityNameCode().clear();
        return;
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_IDENTIFICATION_CODE:
        getCodeListIdentificationCode().clear();
        return;
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        getCodeListResponsibleAgencyCode().clear();
        return;
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME:
        getCountrySubEntityName().clear();
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
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME_CODE:
        return countrySubEntityNameCode != null && !countrySubEntityNameCode.isEmpty();
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_IDENTIFICATION_CODE:
        return codeListIdentificationCode != null && !codeListIdentificationCode.isEmpty();
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return codeListResponsibleAgencyCode != null && !codeListResponsibleAgencyCode.isEmpty();
      case EdilangPackage.COUNTRY_SUB_ENTITY_DETAIL__COUNTRY_SUB_ENTITY_NAME:
        return countrySubEntityName != null && !countrySubEntityName.isEmpty();
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
    result.append(" (countrySubEntityNameCode: ");
    result.append(countrySubEntityNameCode);
    result.append(", codeListIdentificationCode: ");
    result.append(codeListIdentificationCode);
    result.append(", codeListResponsibleAgencyCode: ");
    result.append(codeListResponsibleAgencyCode);
    result.append(", countrySubEntityName: ");
    result.append(countrySubEntityName);
    result.append(')');
    return result.toString();
  }

} //CountrySubEntityDetailImpl
