/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.QuantityDetail;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.QuantityDetailImpl#getQuantityTypeCodeQualifier <em>Quantity Type Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.QuantityDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.QuantityDetailImpl#getMeasurementUnitCode <em>Measurement Unit Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantityDetailImpl extends AbstractEdiFunctionImpl implements QuantityDetail
{
  /**
   * The default value of the '{@link #getQuantityTypeCodeQualifier() <em>Quantity Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantityTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected static final String QUANTITY_TYPE_CODE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuantityTypeCodeQualifier() <em>Quantity Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantityTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected String quantityTypeCodeQualifier = QUANTITY_TYPE_CODE_QUALIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantity()
   * @generated
   * @ordered
   */
  protected static final String QUANTITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantity()
   * @generated
   * @ordered
   */
  protected String quantity = QUANTITY_EDEFAULT;

  /**
   * The default value of the '{@link #getMeasurementUnitCode() <em>Measurement Unit Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementUnitCode()
   * @generated
   * @ordered
   */
  protected static final String MEASUREMENT_UNIT_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMeasurementUnitCode() <em>Measurement Unit Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementUnitCode()
   * @generated
   * @ordered
   */
  protected String measurementUnitCode = MEASUREMENT_UNIT_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantityDetailImpl()
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
    return EdilangPackage.Literals.QUANTITY_DETAIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getQuantityTypeCodeQualifier()
  {
    return quantityTypeCodeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQuantityTypeCodeQualifier(String newQuantityTypeCodeQualifier)
  {
    String oldQuantityTypeCodeQualifier = quantityTypeCodeQualifier;
    quantityTypeCodeQualifier = newQuantityTypeCodeQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.QUANTITY_DETAIL__QUANTITY_TYPE_CODE_QUALIFIER, oldQuantityTypeCodeQualifier, quantityTypeCodeQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getQuantity()
  {
    return quantity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQuantity(String newQuantity)
  {
    String oldQuantity = quantity;
    quantity = newQuantity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.QUANTITY_DETAIL__QUANTITY, oldQuantity, quantity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMeasurementUnitCode()
  {
    return measurementUnitCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMeasurementUnitCode(String newMeasurementUnitCode)
  {
    String oldMeasurementUnitCode = measurementUnitCode;
    measurementUnitCode = newMeasurementUnitCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.QUANTITY_DETAIL__MEASUREMENT_UNIT_CODE, oldMeasurementUnitCode, measurementUnitCode));
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
      case EdilangPackage.QUANTITY_DETAIL__QUANTITY_TYPE_CODE_QUALIFIER:
        return getQuantityTypeCodeQualifier();
      case EdilangPackage.QUANTITY_DETAIL__QUANTITY:
        return getQuantity();
      case EdilangPackage.QUANTITY_DETAIL__MEASUREMENT_UNIT_CODE:
        return getMeasurementUnitCode();
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
      case EdilangPackage.QUANTITY_DETAIL__QUANTITY_TYPE_CODE_QUALIFIER:
        setQuantityTypeCodeQualifier((String)newValue);
        return;
      case EdilangPackage.QUANTITY_DETAIL__QUANTITY:
        setQuantity((String)newValue);
        return;
      case EdilangPackage.QUANTITY_DETAIL__MEASUREMENT_UNIT_CODE:
        setMeasurementUnitCode((String)newValue);
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
      case EdilangPackage.QUANTITY_DETAIL__QUANTITY_TYPE_CODE_QUALIFIER:
        setQuantityTypeCodeQualifier(QUANTITY_TYPE_CODE_QUALIFIER_EDEFAULT);
        return;
      case EdilangPackage.QUANTITY_DETAIL__QUANTITY:
        setQuantity(QUANTITY_EDEFAULT);
        return;
      case EdilangPackage.QUANTITY_DETAIL__MEASUREMENT_UNIT_CODE:
        setMeasurementUnitCode(MEASUREMENT_UNIT_CODE_EDEFAULT);
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
      case EdilangPackage.QUANTITY_DETAIL__QUANTITY_TYPE_CODE_QUALIFIER:
        return QUANTITY_TYPE_CODE_QUALIFIER_EDEFAULT == null ? quantityTypeCodeQualifier != null : !QUANTITY_TYPE_CODE_QUALIFIER_EDEFAULT.equals(quantityTypeCodeQualifier);
      case EdilangPackage.QUANTITY_DETAIL__QUANTITY:
        return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
      case EdilangPackage.QUANTITY_DETAIL__MEASUREMENT_UNIT_CODE:
        return MEASUREMENT_UNIT_CODE_EDEFAULT == null ? measurementUnitCode != null : !MEASUREMENT_UNIT_CODE_EDEFAULT.equals(measurementUnitCode);
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
    result.append(" (quantityTypeCodeQualifier: ");
    result.append(quantityTypeCodeQualifier);
    result.append(", quantity: ");
    result.append(quantity);
    result.append(", measurementUnitCode: ");
    result.append(measurementUnitCode);
    result.append(')');
    return result.toString();
  }

} //QuantityDetailImpl