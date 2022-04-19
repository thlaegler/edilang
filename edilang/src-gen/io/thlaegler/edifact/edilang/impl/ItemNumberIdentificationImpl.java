/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.ItemNumberIdentification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Number Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ItemNumberIdentificationImpl#getItemIdentifier <em>Item Identifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ItemNumberIdentificationImpl#getItemTypeIdentificationCode <em>Item Type Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ItemNumberIdentificationImpl#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ItemNumberIdentificationImpl#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemNumberIdentificationImpl extends AbstractEdiFunctionImpl implements ItemNumberIdentification
{
  /**
   * The default value of the '{@link #getItemIdentifier() <em>Item Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemIdentifier()
   * @generated
   * @ordered
   */
  protected static final String ITEM_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getItemIdentifier() <em>Item Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemIdentifier()
   * @generated
   * @ordered
   */
  protected String itemIdentifier = ITEM_IDENTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getItemTypeIdentificationCode() <em>Item Type Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemTypeIdentificationCode()
   * @generated
   * @ordered
   */
  protected static final String ITEM_TYPE_IDENTIFICATION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getItemTypeIdentificationCode() <em>Item Type Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemTypeIdentificationCode()
   * @generated
   * @ordered
   */
  protected String itemTypeIdentificationCode = ITEM_TYPE_IDENTIFICATION_CODE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemNumberIdentificationImpl()
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
    return EdilangPackage.Literals.ITEM_NUMBER_IDENTIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getItemIdentifier()
  {
    return itemIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setItemIdentifier(String newItemIdentifier)
  {
    String oldItemIdentifier = itemIdentifier;
    itemIdentifier = newItemIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_IDENTIFIER, oldItemIdentifier, itemIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getItemTypeIdentificationCode()
  {
    return itemTypeIdentificationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setItemTypeIdentificationCode(String newItemTypeIdentificationCode)
  {
    String oldItemTypeIdentificationCode = itemTypeIdentificationCode;
    itemTypeIdentificationCode = newItemTypeIdentificationCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_TYPE_IDENTIFICATION_CODE, oldItemTypeIdentificationCode, itemTypeIdentificationCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_IDENTIFICATION_CODE, oldCodeListIdentificationCode, codeListIdentificationCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE, oldCodeListResponsibleAgencyCode, codeListResponsibleAgencyCode));
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
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_IDENTIFIER:
        return getItemIdentifier();
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_TYPE_IDENTIFICATION_CODE:
        return getItemTypeIdentificationCode();
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_IDENTIFICATION_CODE:
        return getCodeListIdentificationCode();
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return getCodeListResponsibleAgencyCode();
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
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_IDENTIFIER:
        setItemIdentifier((String)newValue);
        return;
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_TYPE_IDENTIFICATION_CODE:
        setItemTypeIdentificationCode((String)newValue);
        return;
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode((String)newValue);
        return;
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode((String)newValue);
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
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_IDENTIFIER:
        setItemIdentifier(ITEM_IDENTIFIER_EDEFAULT);
        return;
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_TYPE_IDENTIFICATION_CODE:
        setItemTypeIdentificationCode(ITEM_TYPE_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode(CODE_LIST_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode(CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT);
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
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_IDENTIFIER:
        return ITEM_IDENTIFIER_EDEFAULT == null ? itemIdentifier != null : !ITEM_IDENTIFIER_EDEFAULT.equals(itemIdentifier);
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__ITEM_TYPE_IDENTIFICATION_CODE:
        return ITEM_TYPE_IDENTIFICATION_CODE_EDEFAULT == null ? itemTypeIdentificationCode != null : !ITEM_TYPE_IDENTIFICATION_CODE_EDEFAULT.equals(itemTypeIdentificationCode);
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_IDENTIFICATION_CODE:
        return CODE_LIST_IDENTIFICATION_CODE_EDEFAULT == null ? codeListIdentificationCode != null : !CODE_LIST_IDENTIFICATION_CODE_EDEFAULT.equals(codeListIdentificationCode);
      case EdilangPackage.ITEM_NUMBER_IDENTIFICATION__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT == null ? codeListResponsibleAgencyCode != null : !CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT.equals(codeListResponsibleAgencyCode);
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
    result.append(" (itemIdentifier: ");
    result.append(itemIdentifier);
    result.append(", itemTypeIdentificationCode: ");
    result.append(itemTypeIdentificationCode);
    result.append(", codeListIdentificationCode: ");
    result.append(codeListIdentificationCode);
    result.append(", codeListResponsibleAgencyCode: ");
    result.append(codeListResponsibleAgencyCode);
    result.append(')');
    return result.toString();
  }

} //ItemNumberIdentificationImpl