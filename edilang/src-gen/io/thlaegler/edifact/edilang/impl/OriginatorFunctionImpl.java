/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.OriginatorFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Originator Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.OriginatorFunctionImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.OriginatorFunctionImpl#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.OriginatorFunctionImpl#getLanguageCode <em>Language Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OriginatorFunctionImpl extends AbstractEdiFunctionImpl implements OriginatorFunction
{
  /**
   * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountryCode()
   * @generated
   * @ordered
   */
  protected static final String COUNTRY_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountryCode()
   * @generated
   * @ordered
   */
  protected String countryCode = COUNTRY_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCurrencyCode() <em>Currency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrencyCode()
   * @generated
   * @ordered
   */
  protected static final String CURRENCY_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCurrencyCode() <em>Currency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrencyCode()
   * @generated
   * @ordered
   */
  protected String currencyCode = CURRENCY_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguageCode()
   * @generated
   * @ordered
   */
  protected static final String LANGUAGE_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguageCode()
   * @generated
   * @ordered
   */
  protected String languageCode = LANGUAGE_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OriginatorFunctionImpl()
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
    return EdilangPackage.Literals.ORIGINATOR_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCountryCode()
  {
    return countryCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCountryCode(String newCountryCode)
  {
    String oldCountryCode = countryCode;
    countryCode = newCountryCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORIGINATOR_FUNCTION__COUNTRY_CODE, oldCountryCode, countryCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCurrencyCode()
  {
    return currencyCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCurrencyCode(String newCurrencyCode)
  {
    String oldCurrencyCode = currencyCode;
    currencyCode = newCurrencyCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORIGINATOR_FUNCTION__CURRENCY_CODE, oldCurrencyCode, currencyCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLanguageCode()
  {
    return languageCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLanguageCode(String newLanguageCode)
  {
    String oldLanguageCode = languageCode;
    languageCode = newLanguageCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORIGINATOR_FUNCTION__LANGUAGE_CODE, oldLanguageCode, languageCode));
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
      case EdilangPackage.ORIGINATOR_FUNCTION__COUNTRY_CODE:
        return getCountryCode();
      case EdilangPackage.ORIGINATOR_FUNCTION__CURRENCY_CODE:
        return getCurrencyCode();
      case EdilangPackage.ORIGINATOR_FUNCTION__LANGUAGE_CODE:
        return getLanguageCode();
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
      case EdilangPackage.ORIGINATOR_FUNCTION__COUNTRY_CODE:
        setCountryCode((String)newValue);
        return;
      case EdilangPackage.ORIGINATOR_FUNCTION__CURRENCY_CODE:
        setCurrencyCode((String)newValue);
        return;
      case EdilangPackage.ORIGINATOR_FUNCTION__LANGUAGE_CODE:
        setLanguageCode((String)newValue);
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
      case EdilangPackage.ORIGINATOR_FUNCTION__COUNTRY_CODE:
        setCountryCode(COUNTRY_CODE_EDEFAULT);
        return;
      case EdilangPackage.ORIGINATOR_FUNCTION__CURRENCY_CODE:
        setCurrencyCode(CURRENCY_CODE_EDEFAULT);
        return;
      case EdilangPackage.ORIGINATOR_FUNCTION__LANGUAGE_CODE:
        setLanguageCode(LANGUAGE_CODE_EDEFAULT);
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
      case EdilangPackage.ORIGINATOR_FUNCTION__COUNTRY_CODE:
        return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
      case EdilangPackage.ORIGINATOR_FUNCTION__CURRENCY_CODE:
        return CURRENCY_CODE_EDEFAULT == null ? currencyCode != null : !CURRENCY_CODE_EDEFAULT.equals(currencyCode);
      case EdilangPackage.ORIGINATOR_FUNCTION__LANGUAGE_CODE:
        return LANGUAGE_CODE_EDEFAULT == null ? languageCode != null : !LANGUAGE_CODE_EDEFAULT.equals(languageCode);
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
    result.append(" (countryCode: ");
    result.append(countryCode);
    result.append(", currencyCode: ");
    result.append(currencyCode);
    result.append(", languageCode: ");
    result.append(languageCode);
    result.append(')');
    return result.toString();
  }

} //OriginatorFunctionImpl
