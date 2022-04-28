/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.CharacteristicValue;
import io.thlaegler.edifact.edilang.EdilangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CharacteristicValueImpl#getCharacteristicValueDescriptionCode <em>Characteristic Value Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CharacteristicValueImpl#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CharacteristicValueImpl#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CharacteristicValueImpl#getCharacteristicValueDescription <em>Characteristic Value Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicValueImpl extends AbstractEdiFunctionImpl implements CharacteristicValue
{
  /**
   * The default value of the '{@link #getCharacteristicValueDescriptionCode() <em>Characteristic Value Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicValueDescriptionCode()
   * @generated
   * @ordered
   */
  protected static final String CHARACTERISTIC_VALUE_DESCRIPTION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCharacteristicValueDescriptionCode() <em>Characteristic Value Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicValueDescriptionCode()
   * @generated
   * @ordered
   */
  protected String characteristicValueDescriptionCode = CHARACTERISTIC_VALUE_DESCRIPTION_CODE_EDEFAULT;

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
   * The cached value of the '{@link #getCharacteristicValueDescription() <em>Characteristic Value Description</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicValueDescription()
   * @generated
   * @ordered
   */
  protected EList<String> characteristicValueDescription;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacteristicValueImpl()
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
    return EdilangPackage.eINSTANCE.getCharacteristicValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCharacteristicValueDescriptionCode()
  {
    return characteristicValueDescriptionCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharacteristicValueDescriptionCode(String newCharacteristicValueDescriptionCode)
  {
    String oldCharacteristicValueDescriptionCode = characteristicValueDescriptionCode;
    characteristicValueDescriptionCode = newCharacteristicValueDescriptionCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION_CODE, oldCharacteristicValueDescriptionCode, characteristicValueDescriptionCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_IDENTIFICATION_CODE, oldCodeListIdentificationCode, codeListIdentificationCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_RESPONSIBLE_AGENCY_CODE, oldCodeListResponsibleAgencyCode, codeListResponsibleAgencyCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getCharacteristicValueDescription()
  {
    if (characteristicValueDescription == null)
    {
      characteristicValueDescription = new EDataTypeEList<String>(String.class, this, EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION);
    }
    return characteristicValueDescription;
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
      case EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION_CODE:
        return getCharacteristicValueDescriptionCode();
      case EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_IDENTIFICATION_CODE:
        return getCodeListIdentificationCode();
      case EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return getCodeListResponsibleAgencyCode();
      case EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION:
        return getCharacteristicValueDescription();
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
      case EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION_CODE:
        setCharacteristicValueDescriptionCode((String)newValue);
        return;
      case EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode((String)newValue);
        return;
      case EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode((String)newValue);
        return;
      case EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION:
        getCharacteristicValueDescription().clear();
        getCharacteristicValueDescription().addAll((Collection<? extends String>)newValue);
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
      case EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION_CODE:
        setCharacteristicValueDescriptionCode(CHARACTERISTIC_VALUE_DESCRIPTION_CODE_EDEFAULT);
        return;
      case EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode(CODE_LIST_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode(CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT);
        return;
      case EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION:
        getCharacteristicValueDescription().clear();
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
      case EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION_CODE:
        return CHARACTERISTIC_VALUE_DESCRIPTION_CODE_EDEFAULT == null ? characteristicValueDescriptionCode != null : !CHARACTERISTIC_VALUE_DESCRIPTION_CODE_EDEFAULT.equals(characteristicValueDescriptionCode);
      case EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_IDENTIFICATION_CODE:
        return CODE_LIST_IDENTIFICATION_CODE_EDEFAULT == null ? codeListIdentificationCode != null : !CODE_LIST_IDENTIFICATION_CODE_EDEFAULT.equals(codeListIdentificationCode);
      case EdilangPackage.CHARACTERISTIC_VALUE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT == null ? codeListResponsibleAgencyCode != null : !CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT.equals(codeListResponsibleAgencyCode);
      case EdilangPackage.CHARACTERISTIC_VALUE__CHARACTERISTIC_VALUE_DESCRIPTION:
        return characteristicValueDescription != null && !characteristicValueDescription.isEmpty();
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
    result.append(" (characteristicValueDescriptionCode: ");
    result.append(characteristicValueDescriptionCode);
    result.append(", codeListIdentificationCode: ");
    result.append(codeListIdentificationCode);
    result.append(", codeListResponsibleAgencyCode: ");
    result.append(codeListResponsibleAgencyCode);
    result.append(", characteristicValueDescription: ");
    result.append(characteristicValueDescription);
    result.append(')');
    return result.toString();
  }

} //CharacteristicValueImpl
