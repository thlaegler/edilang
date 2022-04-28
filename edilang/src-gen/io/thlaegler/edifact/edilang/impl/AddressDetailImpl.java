/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.AddressDetail;
import io.thlaegler.edifact.edilang.EdilangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.AddressDetailImpl#getAddressFormatCode <em>Address Format Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.AddressDetailImpl#getAddressComponentDescriptions <em>Address Component Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressDetailImpl extends AbstractEdiFunctionImpl implements AddressDetail
{
  /**
   * The default value of the '{@link #getAddressFormatCode() <em>Address Format Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressFormatCode()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_FORMAT_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddressFormatCode() <em>Address Format Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressFormatCode()
   * @generated
   * @ordered
   */
  protected String addressFormatCode = ADDRESS_FORMAT_CODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAddressComponentDescriptions() <em>Address Component Descriptions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressComponentDescriptions()
   * @generated
   * @ordered
   */
  protected EList<String> addressComponentDescriptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddressDetailImpl()
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
    return EdilangPackage.eINSTANCE.getAddressDetail();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAddressFormatCode()
  {
    return addressFormatCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAddressFormatCode(String newAddressFormatCode)
  {
    String oldAddressFormatCode = addressFormatCode;
    addressFormatCode = newAddressFormatCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ADDRESS_DETAIL__ADDRESS_FORMAT_CODE, oldAddressFormatCode, addressFormatCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getAddressComponentDescriptions()
  {
    if (addressComponentDescriptions == null)
    {
      addressComponentDescriptions = new EDataTypeEList<String>(String.class, this, EdilangPackage.ADDRESS_DETAIL__ADDRESS_COMPONENT_DESCRIPTIONS);
    }
    return addressComponentDescriptions;
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
      case EdilangPackage.ADDRESS_DETAIL__ADDRESS_FORMAT_CODE:
        return getAddressFormatCode();
      case EdilangPackage.ADDRESS_DETAIL__ADDRESS_COMPONENT_DESCRIPTIONS:
        return getAddressComponentDescriptions();
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
      case EdilangPackage.ADDRESS_DETAIL__ADDRESS_FORMAT_CODE:
        setAddressFormatCode((String)newValue);
        return;
      case EdilangPackage.ADDRESS_DETAIL__ADDRESS_COMPONENT_DESCRIPTIONS:
        getAddressComponentDescriptions().clear();
        getAddressComponentDescriptions().addAll((Collection<? extends String>)newValue);
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
      case EdilangPackage.ADDRESS_DETAIL__ADDRESS_FORMAT_CODE:
        setAddressFormatCode(ADDRESS_FORMAT_CODE_EDEFAULT);
        return;
      case EdilangPackage.ADDRESS_DETAIL__ADDRESS_COMPONENT_DESCRIPTIONS:
        getAddressComponentDescriptions().clear();
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
      case EdilangPackage.ADDRESS_DETAIL__ADDRESS_FORMAT_CODE:
        return ADDRESS_FORMAT_CODE_EDEFAULT == null ? addressFormatCode != null : !ADDRESS_FORMAT_CODE_EDEFAULT.equals(addressFormatCode);
      case EdilangPackage.ADDRESS_DETAIL__ADDRESS_COMPONENT_DESCRIPTIONS:
        return addressComponentDescriptions != null && !addressComponentDescriptions.isEmpty();
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
    result.append(" (addressFormatCode: ");
    result.append(addressFormatCode);
    result.append(", addressComponentDescriptions: ");
    result.append(addressComponentDescriptions);
    result.append(')');
    return result.toString();
  }

} //AddressDetailImpl
