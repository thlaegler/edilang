/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.CompanyIdentification;
import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.Location;
import io.thlaegler.edifact.edilang.ProductDateTime;
import io.thlaegler.edifact.edilang.ProductIdentificationDetail;
import io.thlaegler.edifact.edilang.SequenceNumberDetail;
import io.thlaegler.edifact.edilang.TVLSegment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TVL Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getProductDateTime <em>Product Date Time</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getLocation1 <em>Location1</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getLocation2 <em>Location2</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getCompanyIdentification <em>Company Identification</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getProductIdentificationDetails <em>Product Identification Details</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getSequenceNumberDetails <em>Sequence Number Details</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getLineItemIdentifier <em>Line Item Identifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TVLSegmentImpl#getProcessingIndicatorDescriptionCode <em>Processing Indicator Description Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TVLSegmentImpl extends AbstractEdiSegmentImpl implements TVLSegment
{
  /**
   * The cached value of the '{@link #getProductDateTime() <em>Product Date Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductDateTime()
   * @generated
   * @ordered
   */
  protected ProductDateTime productDateTime;

  /**
   * The cached value of the '{@link #getLocation1() <em>Location1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation1()
   * @generated
   * @ordered
   */
  protected Location location1;

  /**
   * The cached value of the '{@link #getLocation2() <em>Location2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation2()
   * @generated
   * @ordered
   */
  protected Location location2;

  /**
   * The cached value of the '{@link #getCompanyIdentification() <em>Company Identification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompanyIdentification()
   * @generated
   * @ordered
   */
  protected CompanyIdentification companyIdentification;

  /**
   * The cached value of the '{@link #getProductIdentificationDetails() <em>Product Identification Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductIdentificationDetails()
   * @generated
   * @ordered
   */
  protected ProductIdentificationDetail productIdentificationDetails;

  /**
   * The cached value of the '{@link #getSequenceNumberDetails() <em>Sequence Number Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequenceNumberDetails()
   * @generated
   * @ordered
   */
  protected SequenceNumberDetail sequenceNumberDetails;

  /**
   * The default value of the '{@link #getLineItemIdentifier() <em>Line Item Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineItemIdentifier()
   * @generated
   * @ordered
   */
  protected static final String LINE_ITEM_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLineItemIdentifier() <em>Line Item Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineItemIdentifier()
   * @generated
   * @ordered
   */
  protected String lineItemIdentifier = LINE_ITEM_IDENTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getProcessingIndicatorDescriptionCode() <em>Processing Indicator Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessingIndicatorDescriptionCode()
   * @generated
   * @ordered
   */
  protected static final String PROCESSING_INDICATOR_DESCRIPTION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessingIndicatorDescriptionCode() <em>Processing Indicator Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessingIndicatorDescriptionCode()
   * @generated
   * @ordered
   */
  protected String processingIndicatorDescriptionCode = PROCESSING_INDICATOR_DESCRIPTION_CODE_EDEFAULT;

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
    return EdilangPackage.eINSTANCE.getTVLSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductDateTime getProductDateTime()
  {
    return productDateTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProductDateTime(ProductDateTime newProductDateTime, NotificationChain msgs)
  {
    ProductDateTime oldProductDateTime = productDateTime;
    productDateTime = newProductDateTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__PRODUCT_DATE_TIME, oldProductDateTime, newProductDateTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProductDateTime(ProductDateTime newProductDateTime)
  {
    if (newProductDateTime != productDateTime)
    {
      NotificationChain msgs = null;
      if (productDateTime != null)
        msgs = ((InternalEObject)productDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__PRODUCT_DATE_TIME, null, msgs);
      if (newProductDateTime != null)
        msgs = ((InternalEObject)newProductDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__PRODUCT_DATE_TIME, null, msgs);
      msgs = basicSetProductDateTime(newProductDateTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__PRODUCT_DATE_TIME, newProductDateTime, newProductDateTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Location getLocation1()
  {
    return location1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation1(Location newLocation1, NotificationChain msgs)
  {
    Location oldLocation1 = location1;
    location1 = newLocation1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__LOCATION1, oldLocation1, newLocation1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocation1(Location newLocation1)
  {
    if (newLocation1 != location1)
    {
      NotificationChain msgs = null;
      if (location1 != null)
        msgs = ((InternalEObject)location1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__LOCATION1, null, msgs);
      if (newLocation1 != null)
        msgs = ((InternalEObject)newLocation1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__LOCATION1, null, msgs);
      msgs = basicSetLocation1(newLocation1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__LOCATION1, newLocation1, newLocation1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Location getLocation2()
  {
    return location2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation2(Location newLocation2, NotificationChain msgs)
  {
    Location oldLocation2 = location2;
    location2 = newLocation2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__LOCATION2, oldLocation2, newLocation2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocation2(Location newLocation2)
  {
    if (newLocation2 != location2)
    {
      NotificationChain msgs = null;
      if (location2 != null)
        msgs = ((InternalEObject)location2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__LOCATION2, null, msgs);
      if (newLocation2 != null)
        msgs = ((InternalEObject)newLocation2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__LOCATION2, null, msgs);
      msgs = basicSetLocation2(newLocation2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__LOCATION2, newLocation2, newLocation2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompanyIdentification getCompanyIdentification()
  {
    return companyIdentification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompanyIdentification(CompanyIdentification newCompanyIdentification, NotificationChain msgs)
  {
    CompanyIdentification oldCompanyIdentification = companyIdentification;
    companyIdentification = newCompanyIdentification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__COMPANY_IDENTIFICATION, oldCompanyIdentification, newCompanyIdentification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCompanyIdentification(CompanyIdentification newCompanyIdentification)
  {
    if (newCompanyIdentification != companyIdentification)
    {
      NotificationChain msgs = null;
      if (companyIdentification != null)
        msgs = ((InternalEObject)companyIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__COMPANY_IDENTIFICATION, null, msgs);
      if (newCompanyIdentification != null)
        msgs = ((InternalEObject)newCompanyIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__COMPANY_IDENTIFICATION, null, msgs);
      msgs = basicSetCompanyIdentification(newCompanyIdentification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__COMPANY_IDENTIFICATION, newCompanyIdentification, newCompanyIdentification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductIdentificationDetail getProductIdentificationDetails()
  {
    return productIdentificationDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProductIdentificationDetails(ProductIdentificationDetail newProductIdentificationDetails, NotificationChain msgs)
  {
    ProductIdentificationDetail oldProductIdentificationDetails = productIdentificationDetails;
    productIdentificationDetails = newProductIdentificationDetails;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__PRODUCT_IDENTIFICATION_DETAILS, oldProductIdentificationDetails, newProductIdentificationDetails);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProductIdentificationDetails(ProductIdentificationDetail newProductIdentificationDetails)
  {
    if (newProductIdentificationDetails != productIdentificationDetails)
    {
      NotificationChain msgs = null;
      if (productIdentificationDetails != null)
        msgs = ((InternalEObject)productIdentificationDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__PRODUCT_IDENTIFICATION_DETAILS, null, msgs);
      if (newProductIdentificationDetails != null)
        msgs = ((InternalEObject)newProductIdentificationDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__PRODUCT_IDENTIFICATION_DETAILS, null, msgs);
      msgs = basicSetProductIdentificationDetails(newProductIdentificationDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__PRODUCT_IDENTIFICATION_DETAILS, newProductIdentificationDetails, newProductIdentificationDetails));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SequenceNumberDetail getSequenceNumberDetails()
  {
    return sequenceNumberDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSequenceNumberDetails(SequenceNumberDetail newSequenceNumberDetails, NotificationChain msgs)
  {
    SequenceNumberDetail oldSequenceNumberDetails = sequenceNumberDetails;
    sequenceNumberDetails = newSequenceNumberDetails;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__SEQUENCE_NUMBER_DETAILS, oldSequenceNumberDetails, newSequenceNumberDetails);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSequenceNumberDetails(SequenceNumberDetail newSequenceNumberDetails)
  {
    if (newSequenceNumberDetails != sequenceNumberDetails)
    {
      NotificationChain msgs = null;
      if (sequenceNumberDetails != null)
        msgs = ((InternalEObject)sequenceNumberDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__SEQUENCE_NUMBER_DETAILS, null, msgs);
      if (newSequenceNumberDetails != null)
        msgs = ((InternalEObject)newSequenceNumberDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.TVL_SEGMENT__SEQUENCE_NUMBER_DETAILS, null, msgs);
      msgs = basicSetSequenceNumberDetails(newSequenceNumberDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__SEQUENCE_NUMBER_DETAILS, newSequenceNumberDetails, newSequenceNumberDetails));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLineItemIdentifier()
  {
    return lineItemIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLineItemIdentifier(String newLineItemIdentifier)
  {
    String oldLineItemIdentifier = lineItemIdentifier;
    lineItemIdentifier = newLineItemIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__LINE_ITEM_IDENTIFIER, oldLineItemIdentifier, lineItemIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProcessingIndicatorDescriptionCode()
  {
    return processingIndicatorDescriptionCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcessingIndicatorDescriptionCode(String newProcessingIndicatorDescriptionCode)
  {
    String oldProcessingIndicatorDescriptionCode = processingIndicatorDescriptionCode;
    processingIndicatorDescriptionCode = newProcessingIndicatorDescriptionCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_DESCRIPTION_CODE, oldProcessingIndicatorDescriptionCode, processingIndicatorDescriptionCode));
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
      case EdilangPackage.TVL_SEGMENT__PRODUCT_DATE_TIME:
        return basicSetProductDateTime(null, msgs);
      case EdilangPackage.TVL_SEGMENT__LOCATION1:
        return basicSetLocation1(null, msgs);
      case EdilangPackage.TVL_SEGMENT__LOCATION2:
        return basicSetLocation2(null, msgs);
      case EdilangPackage.TVL_SEGMENT__COMPANY_IDENTIFICATION:
        return basicSetCompanyIdentification(null, msgs);
      case EdilangPackage.TVL_SEGMENT__PRODUCT_IDENTIFICATION_DETAILS:
        return basicSetProductIdentificationDetails(null, msgs);
      case EdilangPackage.TVL_SEGMENT__SEQUENCE_NUMBER_DETAILS:
        return basicSetSequenceNumberDetails(null, msgs);
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
      case EdilangPackage.TVL_SEGMENT__PRODUCT_DATE_TIME:
        return getProductDateTime();
      case EdilangPackage.TVL_SEGMENT__LOCATION1:
        return getLocation1();
      case EdilangPackage.TVL_SEGMENT__LOCATION2:
        return getLocation2();
      case EdilangPackage.TVL_SEGMENT__COMPANY_IDENTIFICATION:
        return getCompanyIdentification();
      case EdilangPackage.TVL_SEGMENT__PRODUCT_IDENTIFICATION_DETAILS:
        return getProductIdentificationDetails();
      case EdilangPackage.TVL_SEGMENT__SEQUENCE_NUMBER_DETAILS:
        return getSequenceNumberDetails();
      case EdilangPackage.TVL_SEGMENT__LINE_ITEM_IDENTIFIER:
        return getLineItemIdentifier();
      case EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_DESCRIPTION_CODE:
        return getProcessingIndicatorDescriptionCode();
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
      case EdilangPackage.TVL_SEGMENT__PRODUCT_DATE_TIME:
        setProductDateTime((ProductDateTime)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__LOCATION1:
        setLocation1((Location)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__LOCATION2:
        setLocation2((Location)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__COMPANY_IDENTIFICATION:
        setCompanyIdentification((CompanyIdentification)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__PRODUCT_IDENTIFICATION_DETAILS:
        setProductIdentificationDetails((ProductIdentificationDetail)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__SEQUENCE_NUMBER_DETAILS:
        setSequenceNumberDetails((SequenceNumberDetail)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__LINE_ITEM_IDENTIFIER:
        setLineItemIdentifier((String)newValue);
        return;
      case EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_DESCRIPTION_CODE:
        setProcessingIndicatorDescriptionCode((String)newValue);
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
      case EdilangPackage.TVL_SEGMENT__PRODUCT_DATE_TIME:
        setProductDateTime((ProductDateTime)null);
        return;
      case EdilangPackage.TVL_SEGMENT__LOCATION1:
        setLocation1((Location)null);
        return;
      case EdilangPackage.TVL_SEGMENT__LOCATION2:
        setLocation2((Location)null);
        return;
      case EdilangPackage.TVL_SEGMENT__COMPANY_IDENTIFICATION:
        setCompanyIdentification((CompanyIdentification)null);
        return;
      case EdilangPackage.TVL_SEGMENT__PRODUCT_IDENTIFICATION_DETAILS:
        setProductIdentificationDetails((ProductIdentificationDetail)null);
        return;
      case EdilangPackage.TVL_SEGMENT__SEQUENCE_NUMBER_DETAILS:
        setSequenceNumberDetails((SequenceNumberDetail)null);
        return;
      case EdilangPackage.TVL_SEGMENT__LINE_ITEM_IDENTIFIER:
        setLineItemIdentifier(LINE_ITEM_IDENTIFIER_EDEFAULT);
        return;
      case EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_DESCRIPTION_CODE:
        setProcessingIndicatorDescriptionCode(PROCESSING_INDICATOR_DESCRIPTION_CODE_EDEFAULT);
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
      case EdilangPackage.TVL_SEGMENT__PRODUCT_DATE_TIME:
        return productDateTime != null;
      case EdilangPackage.TVL_SEGMENT__LOCATION1:
        return location1 != null;
      case EdilangPackage.TVL_SEGMENT__LOCATION2:
        return location2 != null;
      case EdilangPackage.TVL_SEGMENT__COMPANY_IDENTIFICATION:
        return companyIdentification != null;
      case EdilangPackage.TVL_SEGMENT__PRODUCT_IDENTIFICATION_DETAILS:
        return productIdentificationDetails != null;
      case EdilangPackage.TVL_SEGMENT__SEQUENCE_NUMBER_DETAILS:
        return sequenceNumberDetails != null;
      case EdilangPackage.TVL_SEGMENT__LINE_ITEM_IDENTIFIER:
        return LINE_ITEM_IDENTIFIER_EDEFAULT == null ? lineItemIdentifier != null : !LINE_ITEM_IDENTIFIER_EDEFAULT.equals(lineItemIdentifier);
      case EdilangPackage.TVL_SEGMENT__PROCESSING_INDICATOR_DESCRIPTION_CODE:
        return PROCESSING_INDICATOR_DESCRIPTION_CODE_EDEFAULT == null ? processingIndicatorDescriptionCode != null : !PROCESSING_INDICATOR_DESCRIPTION_CODE_EDEFAULT.equals(processingIndicatorDescriptionCode);
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
    result.append(" (lineItemIdentifier: ");
    result.append(lineItemIdentifier);
    result.append(", processingIndicatorDescriptionCode: ");
    result.append(processingIndicatorDescriptionCode);
    result.append(')');
    return result.toString();
  }

} //TVLSegmentImpl
