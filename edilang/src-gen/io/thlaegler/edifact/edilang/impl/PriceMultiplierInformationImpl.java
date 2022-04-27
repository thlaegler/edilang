/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.PriceMultiplierInformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Price Multiplier Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PriceMultiplierInformationImpl#getPriceMultiplierRate <em>Price Multiplier Rate</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PriceMultiplierInformationImpl#getPriceMultiplierTypeCodeQualifier <em>Price Multiplier Type Code Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PriceMultiplierInformationImpl extends MinimalEObjectImpl.Container implements PriceMultiplierInformation
{
  /**
   * The default value of the '{@link #getPriceMultiplierRate() <em>Price Multiplier Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceMultiplierRate()
   * @generated
   * @ordered
   */
  protected static final String PRICE_MULTIPLIER_RATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriceMultiplierRate() <em>Price Multiplier Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceMultiplierRate()
   * @generated
   * @ordered
   */
  protected String priceMultiplierRate = PRICE_MULTIPLIER_RATE_EDEFAULT;

  /**
   * The default value of the '{@link #getPriceMultiplierTypeCodeQualifier() <em>Price Multiplier Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceMultiplierTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected static final String PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriceMultiplierTypeCodeQualifier() <em>Price Multiplier Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceMultiplierTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected String priceMultiplierTypeCodeQualifier = PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PriceMultiplierInformationImpl()
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
    return EdilangPackage.eINSTANCE.getPriceMultiplierInformation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPriceMultiplierRate()
  {
    return priceMultiplierRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPriceMultiplierRate(String newPriceMultiplierRate)
  {
    String oldPriceMultiplierRate = priceMultiplierRate;
    priceMultiplierRate = newPriceMultiplierRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_RATE, oldPriceMultiplierRate, priceMultiplierRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPriceMultiplierTypeCodeQualifier()
  {
    return priceMultiplierTypeCodeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPriceMultiplierTypeCodeQualifier(String newPriceMultiplierTypeCodeQualifier)
  {
    String oldPriceMultiplierTypeCodeQualifier = priceMultiplierTypeCodeQualifier;
    priceMultiplierTypeCodeQualifier = newPriceMultiplierTypeCodeQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER, oldPriceMultiplierTypeCodeQualifier, priceMultiplierTypeCodeQualifier));
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
      case EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_RATE:
        return getPriceMultiplierRate();
      case EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER:
        return getPriceMultiplierTypeCodeQualifier();
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
      case EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_RATE:
        setPriceMultiplierRate((String)newValue);
        return;
      case EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER:
        setPriceMultiplierTypeCodeQualifier((String)newValue);
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
      case EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_RATE:
        setPriceMultiplierRate(PRICE_MULTIPLIER_RATE_EDEFAULT);
        return;
      case EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER:
        setPriceMultiplierTypeCodeQualifier(PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER_EDEFAULT);
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
      case EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_RATE:
        return PRICE_MULTIPLIER_RATE_EDEFAULT == null ? priceMultiplierRate != null : !PRICE_MULTIPLIER_RATE_EDEFAULT.equals(priceMultiplierRate);
      case EdilangPackage.PRICE_MULTIPLIER_INFORMATION__PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER:
        return PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER_EDEFAULT == null ? priceMultiplierTypeCodeQualifier != null : !PRICE_MULTIPLIER_TYPE_CODE_QUALIFIER_EDEFAULT.equals(priceMultiplierTypeCodeQualifier);
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
    result.append(" (priceMultiplierRate: ");
    result.append(priceMultiplierRate);
    result.append(", priceMultiplierTypeCodeQualifier: ");
    result.append(priceMultiplierTypeCodeQualifier);
    result.append(')');
    return result.toString();
  }

} //PriceMultiplierInformationImpl
