/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.AbstractEdiFunction;
import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.TVLSegment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TVL Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getDateAndTime <em>Date And Time</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getOriginCode <em>Origin Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getDestinationCode <em>Destination Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getCarrierId <em>Carrier Id</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getCharacteristicId <em>Characteristic Id</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getProductIdCharacteristic <em>Product Id Characteristic</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getDescriptionIds <em>Description Ids</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getLineItemNumber <em>Line Item Number</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getProcessingIndicatorCode <em>Processing Indicator Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TVLSegmentImpl extends AbstractEdiSegmentImpl implements TVLSegment
{
  /**
   * The cached value of the '{@link #getDateAndTime() <em>Date And Time</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateAndTime()
   * @generated
   * @ordered
   */
  protected EList<AbstractEdiFunction> dateAndTime;

  /**
   * The default value of the '{@link #getOriginCode() <em>Origin Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginCode()
   * @generated
   * @ordered
   */
  protected static final String ORIGIN_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOriginCode() <em>Origin Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginCode()
   * @generated
   * @ordered
   */
  protected String originCode = ORIGIN_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getDestinationCode() <em>Destination Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationCode()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestinationCode() <em>Destination Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationCode()
   * @generated
   * @ordered
   */
  protected String destinationCode = DESTINATION_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCarrierId() <em>Carrier Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarrierId()
   * @generated
   * @ordered
   */
  protected static final String CARRIER_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCarrierId() <em>Carrier Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarrierId()
   * @generated
   * @ordered
   */
  protected String carrierId = CARRIER_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductId()
   * @generated
   * @ordered
   */
  protected static final String PRODUCT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductId()
   * @generated
   * @ordered
   */
  protected String productId = PRODUCT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getCharacteristicId() <em>Characteristic Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicId()
   * @generated
   * @ordered
   */
  protected static final String CHARACTERISTIC_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCharacteristicId() <em>Characteristic Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicId()
   * @generated
   * @ordered
   */
  protected String characteristicId = CHARACTERISTIC_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getProductIdCharacteristic() <em>Product Id Characteristic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductIdCharacteristic()
   * @generated
   * @ordered
   */
  protected static final String PRODUCT_ID_CHARACTERISTIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProductIdCharacteristic() <em>Product Id Characteristic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductIdCharacteristic()
   * @generated
   * @ordered
   */
  protected String productIdCharacteristic = PRODUCT_ID_CHARACTERISTIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getDescriptionIds() <em>Description Ids</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptionIds()
   * @generated
   * @ordered
   */
  protected EList<String> descriptionIds;

  /**
   * The default value of the '{@link #getProductType() <em>Product Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductType()
   * @generated
   * @ordered
   */
  protected static final String PRODUCT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProductType() <em>Product Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductType()
   * @generated
   * @ordered
   */
  protected String productType = PRODUCT_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getLineItemNumber() <em>Line Item Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineItemNumber()
   * @generated
   * @ordered
   */
  protected static final String LINE_ITEM_NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLineItemNumber() <em>Line Item Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineItemNumber()
   * @generated
   * @ordered
   */
  protected String lineItemNumber = LINE_ITEM_NUMBER_EDEFAULT;

  /**
   * The default value of the '{@link #getProcessingIndicatorCode() <em>Processing Indicator Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessingIndicatorCode()
   * @generated
   * @ordered
   */
  protected static final String PROCESSING_INDICATOR_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessingIndicatorCode() <em>Processing Indicator Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessingIndicatorCode()
   * @generated
   * @ordered
   */
  protected String processingIndicatorCode = PROCESSING_INDICATOR_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TVLSegmentImpl()
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
    return EdilangPackage.Literals.TVL_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractEdiFunction> getDateAndTime()
  {
    if (dateAndTime == null)
    {
      dateAndTime = new EObjectContainmentEList<AbstractEdiFunction>(AbstractEdiFunction.class, this, EdilangPackage.TVL_SEGMENT__DATE_AND_TIME);
    }
    return dateAndTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOriginCode()
  {
    return originCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOriginCode(String newOriginCode)
  {
    String oldOriginCode = originCode;
    originCode = newOriginCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__ORIGIN_CODE, oldOriginCode, originCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDestinationCode()
  {
    return destinationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDestinationCode(String newDestinationCode)
  {
    String oldDestinationCode = destinationCode;
    destinationCode = newDestinationCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__DESTINATION_CODE, oldDestinationCode, destinationCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCarrierId()
  {
    return carrierId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCarrierId(String newCarrierId)
  {
    String oldCarrierId = carrierId;
    carrierId = newCarrierId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__CARRIER_ID, oldCarrierId, carrierId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProductId()
  {
    return productId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProductId(String newProductId)
  {
    String oldProductId = productId;
    productId = newProductId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__PRODUCT_ID, oldProductId, productId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCharacteristicId()
  {
    return characteristicId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharacteristicId(String newCharacteristicId)
  {
    String oldCharacteristicId = characteristicId;
    characteristicId = newCharacteristicId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__CHARACTERISTIC_ID, oldCharacteristicId, characteristicId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProductIdCharacteristic()
  {
    return productIdCharacteristic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProductIdCharacteristic(String newProductIdCharacteristic)
  {
    String oldProductIdCharacteristic = productIdCharacteristic;
    productIdCharacteristic = newProductIdCharacteristic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__PRODUCT_ID_CHARACTERISTIC, oldProductIdCharacteristic, productIdCharacteristic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getDescriptionIds()
  {
    if (descriptionIds == null)
    {
      descriptionIds = new EDataTypeEList<String>(String.class, this, EdilangPackage.TVL_SEGMENT__DESCRIPTION_IDS);
    }
    return descriptionIds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProductType()
  {
    return productType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProductType(String newProductType)
  {
    String oldProductType = productType;
    productType = newProductType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__PRODUCT_TYPE, oldProductType, productType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLineItemNumber()
  {
    return lineItemNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLineItemNumber(String newLineItemNumber)
  {
    String oldLineItemNumber = lineItemNumber;
    lineItemNumber = newLineItemNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__LINE_ITEM_NUMBER, oldLineItemNumber, lineItemNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProcessingIndicatorCode()
  {
    return processingIndicatorCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcessingIndicatorCode(String newProcessingIndicatorCode)
  {
    String oldProcessingIndicatorCode = processingIndicatorCode;
    processingIndicatorCode = newProcessingIndicatorCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_CODE, oldProcessingIndicatorCode, processingIndicatorCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EdilangPackage.TVL_SEGMENT__DATE_AND_TIME:
        return ((InternalEList<?>)getDateAndTime()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EdilangPackage.TVL_SEGMENT__DATE_AND_TIME:
        return getDateAndTime();
      case EdilangPackage.TVL_SEGMENT__ORIGIN_CODE:
        return getOriginCode();
      case EdilangPackage.TVL_SEGMENT__DESTINATION_CODE:
        return getDestinationCode();
      case EdilangPackage.TVL_SEGMENT__CARRIER_ID:
        return getCarrierId();
      case EdilangPackage.TVL_SEGMENT__PRODUCT_ID:
        return getProductId();
      case EdilangPackage.TVL_SEGMENT__CHARACTERISTIC_ID:
        return getCharacteristicId();
      case EdilangPackage.TVL_SEGMENT__PRODUCT_ID_CHARACTERISTIC:
        return getProductIdCharacteristic();
      case EdilangPackage.TVL_SEGMENT__DESCRIPTION_IDS:
        return getDescriptionIds();
      case EdilangPackage.TVL_SEGMENT__PRODUCT_TYPE:
        return getProductType();
      case EdilangPackage.TVL_SEGMENT__LINE_ITEM_NUMBER:
        return getLineItemNumber();
      case EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_CODE:
        return getProcessingIndicatorCode();
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
      case EdilangPackage.TVL_SEGMENT__DATE_AND_TIME:
        getDateAndTime().clear();
        getDateAndTime().addAll((Collection<? extends AbstractEdiFunction>)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__ORIGIN_CODE:
        setOriginCode((String)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__DESTINATION_CODE:
        setDestinationCode((String)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__CARRIER_ID:
        setCarrierId((String)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__PRODUCT_ID:
        setProductId((String)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__CHARACTERISTIC_ID:
        setCharacteristicId((String)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__PRODUCT_ID_CHARACTERISTIC:
        setProductIdCharacteristic((String)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__DESCRIPTION_IDS:
        getDescriptionIds().clear();
        getDescriptionIds().addAll((Collection<? extends String>)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__PRODUCT_TYPE:
        setProductType((String)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__LINE_ITEM_NUMBER:
        setLineItemNumber((String)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_CODE:
        setProcessingIndicatorCode((String)newValue);
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
      case EdilangPackage.TVL_SEGMENT__DATE_AND_TIME:
        getDateAndTime().clear();
        return;
      case EdilangPackage.TVL_SEGMENT__ORIGIN_CODE:
        setOriginCode(ORIGIN_CODE_EDEFAULT);
        return;
      case EdilangPackage.TVL_SEGMENT__DESTINATION_CODE:
        setDestinationCode(DESTINATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.TVL_SEGMENT__CARRIER_ID:
        setCarrierId(CARRIER_ID_EDEFAULT);
        return;
      case EdilangPackage.TVL_SEGMENT__PRODUCT_ID:
        setProductId(PRODUCT_ID_EDEFAULT);
        return;
      case EdilangPackage.TVL_SEGMENT__CHARACTERISTIC_ID:
        setCharacteristicId(CHARACTERISTIC_ID_EDEFAULT);
        return;
      case EdilangPackage.TVL_SEGMENT__PRODUCT_ID_CHARACTERISTIC:
        setProductIdCharacteristic(PRODUCT_ID_CHARACTERISTIC_EDEFAULT);
        return;
      case EdilangPackage.TVL_SEGMENT__DESCRIPTION_IDS:
        getDescriptionIds().clear();
        return;
      case EdilangPackage.TVL_SEGMENT__PRODUCT_TYPE:
        setProductType(PRODUCT_TYPE_EDEFAULT);
        return;
      case EdilangPackage.TVL_SEGMENT__LINE_ITEM_NUMBER:
        setLineItemNumber(LINE_ITEM_NUMBER_EDEFAULT);
        return;
      case EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_CODE:
        setProcessingIndicatorCode(PROCESSING_INDICATOR_CODE_EDEFAULT);
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
      case EdilangPackage.TVL_SEGMENT__DATE_AND_TIME:
        return dateAndTime != null && !dateAndTime.isEmpty();
      case EdilangPackage.TVL_SEGMENT__ORIGIN_CODE:
        return ORIGIN_CODE_EDEFAULT == null ? originCode != null : !ORIGIN_CODE_EDEFAULT.equals(originCode);
      case EdilangPackage.TVL_SEGMENT__DESTINATION_CODE:
        return DESTINATION_CODE_EDEFAULT == null ? destinationCode != null : !DESTINATION_CODE_EDEFAULT.equals(destinationCode);
      case EdilangPackage.TVL_SEGMENT__CARRIER_ID:
        return CARRIER_ID_EDEFAULT == null ? carrierId != null : !CARRIER_ID_EDEFAULT.equals(carrierId);
      case EdilangPackage.TVL_SEGMENT__PRODUCT_ID:
        return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
      case EdilangPackage.TVL_SEGMENT__CHARACTERISTIC_ID:
        return CHARACTERISTIC_ID_EDEFAULT == null ? characteristicId != null : !CHARACTERISTIC_ID_EDEFAULT.equals(characteristicId);
      case EdilangPackage.TVL_SEGMENT__PRODUCT_ID_CHARACTERISTIC:
        return PRODUCT_ID_CHARACTERISTIC_EDEFAULT == null ? productIdCharacteristic != null : !PRODUCT_ID_CHARACTERISTIC_EDEFAULT.equals(productIdCharacteristic);
      case EdilangPackage.TVL_SEGMENT__DESCRIPTION_IDS:
        return descriptionIds != null && !descriptionIds.isEmpty();
      case EdilangPackage.TVL_SEGMENT__PRODUCT_TYPE:
        return PRODUCT_TYPE_EDEFAULT == null ? productType != null : !PRODUCT_TYPE_EDEFAULT.equals(productType);
      case EdilangPackage.TVL_SEGMENT__LINE_ITEM_NUMBER:
        return LINE_ITEM_NUMBER_EDEFAULT == null ? lineItemNumber != null : !LINE_ITEM_NUMBER_EDEFAULT.equals(lineItemNumber);
      case EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_CODE:
        return PROCESSING_INDICATOR_CODE_EDEFAULT == null ? processingIndicatorCode != null : !PROCESSING_INDICATOR_CODE_EDEFAULT.equals(processingIndicatorCode);
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
    result.append(" (originCode: ");
    result.append(originCode);
    result.append(", destinationCode: ");
    result.append(destinationCode);
    result.append(", carrierId: ");
    result.append(carrierId);
    result.append(", productId: ");
    result.append(productId);
    result.append(", characteristicId: ");
    result.append(characteristicId);
    result.append(", productIdCharacteristic: ");
    result.append(productIdCharacteristic);
    result.append(", descriptionIds: ");
    result.append(descriptionIds);
    result.append(", productType: ");
    result.append(productType);
    result.append(", lineItemNumber: ");
    result.append(lineItemNumber);
    result.append(", processingIndicatorCode: ");
    result.append(processingIndicatorCode);
    result.append(')');
    return result.toString();
  }

} //TVLSegmentImpl
