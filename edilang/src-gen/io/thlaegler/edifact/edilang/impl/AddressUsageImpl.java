/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.AddressUsage;
import io.thlaegler.edifact.edilang.EdilangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.AddressUsageImpl#getAddressPurposeCode <em>Address Purpose Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.AddressUsageImpl#getAddressTypeCode <em>Address Type Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.AddressUsageImpl#getAddressStatusCode <em>Address Status Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressUsageImpl extends AbstractEdiFunctionImpl implements AddressUsage
{
  /**
   * The default value of the '{@link #getAddressPurposeCode() <em>Address Purpose Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressPurposeCode()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_PURPOSE_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddressPurposeCode() <em>Address Purpose Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressPurposeCode()
   * @generated
   * @ordered
   */
  protected String addressPurposeCode = ADDRESS_PURPOSE_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getAddressTypeCode() <em>Address Type Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressTypeCode()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_TYPE_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddressTypeCode() <em>Address Type Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressTypeCode()
   * @generated
   * @ordered
   */
  protected String addressTypeCode = ADDRESS_TYPE_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getAddressStatusCode() <em>Address Status Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressStatusCode()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_STATUS_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddressStatusCode() <em>Address Status Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressStatusCode()
   * @generated
   * @ordered
   */
  protected String addressStatusCode = ADDRESS_STATUS_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddressUsageImpl()
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
    return EdilangPackage.eINSTANCE.getAddressUsage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAddressPurposeCode()
  {
    return addressPurposeCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAddressPurposeCode(String newAddressPurposeCode)
  {
    String oldAddressPurposeCode = addressPurposeCode;
    addressPurposeCode = newAddressPurposeCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ADDRESS_USAGE__ADDRESS_PURPOSE_CODE, oldAddressPurposeCode, addressPurposeCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAddressTypeCode()
  {
    return addressTypeCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAddressTypeCode(String newAddressTypeCode)
  {
    String oldAddressTypeCode = addressTypeCode;
    addressTypeCode = newAddressTypeCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ADDRESS_USAGE__ADDRESS_TYPE_CODE, oldAddressTypeCode, addressTypeCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAddressStatusCode()
  {
    return addressStatusCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAddressStatusCode(String newAddressStatusCode)
  {
    String oldAddressStatusCode = addressStatusCode;
    addressStatusCode = newAddressStatusCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ADDRESS_USAGE__ADDRESS_STATUS_CODE, oldAddressStatusCode, addressStatusCode));
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
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_PURPOSE_CODE:
        return getAddressPurposeCode();
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_TYPE_CODE:
        return getAddressTypeCode();
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_STATUS_CODE:
        return getAddressStatusCode();
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
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_PURPOSE_CODE:
        setAddressPurposeCode((String)newValue);
        return;
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_TYPE_CODE:
        setAddressTypeCode((String)newValue);
        return;
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_STATUS_CODE:
        setAddressStatusCode((String)newValue);
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
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_PURPOSE_CODE:
        setAddressPurposeCode(ADDRESS_PURPOSE_CODE_EDEFAULT);
        return;
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_TYPE_CODE:
        setAddressTypeCode(ADDRESS_TYPE_CODE_EDEFAULT);
        return;
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_STATUS_CODE:
        setAddressStatusCode(ADDRESS_STATUS_CODE_EDEFAULT);
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
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_PURPOSE_CODE:
        return ADDRESS_PURPOSE_CODE_EDEFAULT == null ? addressPurposeCode != null : !ADDRESS_PURPOSE_CODE_EDEFAULT.equals(addressPurposeCode);
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_TYPE_CODE:
        return ADDRESS_TYPE_CODE_EDEFAULT == null ? addressTypeCode != null : !ADDRESS_TYPE_CODE_EDEFAULT.equals(addressTypeCode);
      case EdilangPackage.ADDRESS_USAGE__ADDRESS_STATUS_CODE:
        return ADDRESS_STATUS_CODE_EDEFAULT == null ? addressStatusCode != null : !ADDRESS_STATUS_CODE_EDEFAULT.equals(addressStatusCode);
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
    result.append(" (addressPurposeCode: ");
    result.append(addressPurposeCode);
    result.append(", addressTypeCode: ");
    result.append(addressTypeCode);
    result.append(", addressStatusCode: ");
    result.append(addressStatusCode);
    result.append(')');
    return result.toString();
  }

} //AddressUsageImpl
