/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.LocationFunction;
import io.thlaegler.edifact.edilang.ORGSegment;
import io.thlaegler.edifact.edilang.OriginatorFunction;
import io.thlaegler.edifact.edilang.OriginatorIdentificationFunction;
import io.thlaegler.edifact.edilang.SystemDetailFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORG Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ORGSegmentImpl#getSystemDetail1 <em>System Detail1</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ORGSegmentImpl#getOriginatorIdentification <em>Originator Identification</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ORGSegmentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ORGSegmentImpl#getSystemDetail2 <em>System Detail2</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ORGSegmentImpl#getOriginatorTypeCode <em>Originator Type Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ORGSegmentImpl#getOriginator <em>Originator</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ORGSegmentImpl#getOriginatorsAuthorityRequestCode <em>Originators Authority Request Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ORGSegmentImpl#getCommunicationNumber <em>Communication Number</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ORGSegmentImpl#getPartyIdIdentification <em>Party Id Identification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORGSegmentImpl extends AbstractEdiSegmentImpl implements ORGSegment
{
  /**
   * The cached value of the '{@link #getSystemDetail1() <em>System Detail1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemDetail1()
   * @generated
   * @ordered
   */
  protected SystemDetailFunction systemDetail1;

  /**
   * The cached value of the '{@link #getOriginatorIdentification() <em>Originator Identification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginatorIdentification()
   * @generated
   * @ordered
   */
  protected OriginatorIdentificationFunction originatorIdentification;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected LocationFunction location;

  /**
   * The cached value of the '{@link #getSystemDetail2() <em>System Detail2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemDetail2()
   * @generated
   * @ordered
   */
  protected SystemDetailFunction systemDetail2;

  /**
   * The default value of the '{@link #getOriginatorTypeCode() <em>Originator Type Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginatorTypeCode()
   * @generated
   * @ordered
   */
  protected static final String ORIGINATOR_TYPE_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOriginatorTypeCode() <em>Originator Type Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginatorTypeCode()
   * @generated
   * @ordered
   */
  protected String originatorTypeCode = ORIGINATOR_TYPE_CODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOriginator() <em>Originator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginator()
   * @generated
   * @ordered
   */
  protected OriginatorFunction originator;

  /**
   * The default value of the '{@link #getOriginatorsAuthorityRequestCode() <em>Originators Authority Request Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginatorsAuthorityRequestCode()
   * @generated
   * @ordered
   */
  protected static final String ORIGINATORS_AUTHORITY_REQUEST_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOriginatorsAuthorityRequestCode() <em>Originators Authority Request Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginatorsAuthorityRequestCode()
   * @generated
   * @ordered
   */
  protected String originatorsAuthorityRequestCode = ORIGINATORS_AUTHORITY_REQUEST_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCommunicationNumber() <em>Communication Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommunicationNumber()
   * @generated
   * @ordered
   */
  protected static final String COMMUNICATION_NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCommunicationNumber() <em>Communication Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommunicationNumber()
   * @generated
   * @ordered
   */
  protected String communicationNumber = COMMUNICATION_NUMBER_EDEFAULT;

  /**
   * The default value of the '{@link #getPartyIdIdentification() <em>Party Id Identification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartyIdIdentification()
   * @generated
   * @ordered
   */
  protected static final String PARTY_ID_IDENTIFICATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPartyIdIdentification() <em>Party Id Identification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartyIdIdentification()
   * @generated
   * @ordered
   */
  protected String partyIdIdentification = PARTY_ID_IDENTIFICATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ORGSegmentImpl()
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
    return EdilangPackage.eINSTANCE.getORGSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SystemDetailFunction getSystemDetail1()
  {
    return systemDetail1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystemDetail1(SystemDetailFunction newSystemDetail1, NotificationChain msgs)
  {
    SystemDetailFunction oldSystemDetail1 = systemDetail1;
    systemDetail1 = newSystemDetail1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL1, oldSystemDetail1, newSystemDetail1);
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
  public void setSystemDetail1(SystemDetailFunction newSystemDetail1)
  {
    if (newSystemDetail1 != systemDetail1)
    {
      NotificationChain msgs = null;
      if (systemDetail1 != null)
        msgs = ((InternalEObject)systemDetail1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL1, null, msgs);
      if (newSystemDetail1 != null)
        msgs = ((InternalEObject)newSystemDetail1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL1, null, msgs);
      msgs = basicSetSystemDetail1(newSystemDetail1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL1, newSystemDetail1, newSystemDetail1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OriginatorIdentificationFunction getOriginatorIdentification()
  {
    return originatorIdentification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOriginatorIdentification(OriginatorIdentificationFunction newOriginatorIdentification, NotificationChain msgs)
  {
    OriginatorIdentificationFunction oldOriginatorIdentification = originatorIdentification;
    originatorIdentification = newOriginatorIdentification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__ORIGINATOR_IDENTIFICATION, oldOriginatorIdentification, newOriginatorIdentification);
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
  public void setOriginatorIdentification(OriginatorIdentificationFunction newOriginatorIdentification)
  {
    if (newOriginatorIdentification != originatorIdentification)
    {
      NotificationChain msgs = null;
      if (originatorIdentification != null)
        msgs = ((InternalEObject)originatorIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__ORIGINATOR_IDENTIFICATION, null, msgs);
      if (newOriginatorIdentification != null)
        msgs = ((InternalEObject)newOriginatorIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__ORIGINATOR_IDENTIFICATION, null, msgs);
      msgs = basicSetOriginatorIdentification(newOriginatorIdentification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__ORIGINATOR_IDENTIFICATION, newOriginatorIdentification, newOriginatorIdentification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocationFunction getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation(LocationFunction newLocation, NotificationChain msgs)
  {
    LocationFunction oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__LOCATION, oldLocation, newLocation);
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
  public void setLocation(LocationFunction newLocation)
  {
    if (newLocation != location)
    {
      NotificationChain msgs = null;
      if (location != null)
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__LOCATION, newLocation, newLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SystemDetailFunction getSystemDetail2()
  {
    return systemDetail2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystemDetail2(SystemDetailFunction newSystemDetail2, NotificationChain msgs)
  {
    SystemDetailFunction oldSystemDetail2 = systemDetail2;
    systemDetail2 = newSystemDetail2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL2, oldSystemDetail2, newSystemDetail2);
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
  public void setSystemDetail2(SystemDetailFunction newSystemDetail2)
  {
    if (newSystemDetail2 != systemDetail2)
    {
      NotificationChain msgs = null;
      if (systemDetail2 != null)
        msgs = ((InternalEObject)systemDetail2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL2, null, msgs);
      if (newSystemDetail2 != null)
        msgs = ((InternalEObject)newSystemDetail2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL2, null, msgs);
      msgs = basicSetSystemDetail2(newSystemDetail2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL2, newSystemDetail2, newSystemDetail2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOriginatorTypeCode()
  {
    return originatorTypeCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOriginatorTypeCode(String newOriginatorTypeCode)
  {
    String oldOriginatorTypeCode = originatorTypeCode;
    originatorTypeCode = newOriginatorTypeCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__ORIGINATOR_TYPE_CODE, oldOriginatorTypeCode, originatorTypeCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OriginatorFunction getOriginator()
  {
    return originator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOriginator(OriginatorFunction newOriginator, NotificationChain msgs)
  {
    OriginatorFunction oldOriginator = originator;
    originator = newOriginator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__ORIGINATOR, oldOriginator, newOriginator);
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
  public void setOriginator(OriginatorFunction newOriginator)
  {
    if (newOriginator != originator)
    {
      NotificationChain msgs = null;
      if (originator != null)
        msgs = ((InternalEObject)originator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__ORIGINATOR, null, msgs);
      if (newOriginator != null)
        msgs = ((InternalEObject)newOriginator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.ORG_SEGMENT__ORIGINATOR, null, msgs);
      msgs = basicSetOriginator(newOriginator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__ORIGINATOR, newOriginator, newOriginator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOriginatorsAuthorityRequestCode()
  {
    return originatorsAuthorityRequestCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOriginatorsAuthorityRequestCode(String newOriginatorsAuthorityRequestCode)
  {
    String oldOriginatorsAuthorityRequestCode = originatorsAuthorityRequestCode;
    originatorsAuthorityRequestCode = newOriginatorsAuthorityRequestCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__ORIGINATORS_AUTHORITY_REQUEST_CODE, oldOriginatorsAuthorityRequestCode, originatorsAuthorityRequestCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCommunicationNumber()
  {
    return communicationNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCommunicationNumber(String newCommunicationNumber)
  {
    String oldCommunicationNumber = communicationNumber;
    communicationNumber = newCommunicationNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__COMMUNICATION_NUMBER, oldCommunicationNumber, communicationNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPartyIdIdentification()
  {
    return partyIdIdentification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPartyIdIdentification(String newPartyIdIdentification)
  {
    String oldPartyIdIdentification = partyIdIdentification;
    partyIdIdentification = newPartyIdIdentification;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ORG_SEGMENT__PARTY_ID_IDENTIFICATION, oldPartyIdIdentification, partyIdIdentification));
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
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL1:
        return basicSetSystemDetail1(null, msgs);
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR_IDENTIFICATION:
        return basicSetOriginatorIdentification(null, msgs);
      case EdilangPackage.ORG_SEGMENT__LOCATION:
        return basicSetLocation(null, msgs);
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL2:
        return basicSetSystemDetail2(null, msgs);
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR:
        return basicSetOriginator(null, msgs);
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
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL1:
        return getSystemDetail1();
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR_IDENTIFICATION:
        return getOriginatorIdentification();
      case EdilangPackage.ORG_SEGMENT__LOCATION:
        return getLocation();
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL2:
        return getSystemDetail2();
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR_TYPE_CODE:
        return getOriginatorTypeCode();
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR:
        return getOriginator();
      case EdilangPackage.ORG_SEGMENT__ORIGINATORS_AUTHORITY_REQUEST_CODE:
        return getOriginatorsAuthorityRequestCode();
      case EdilangPackage.ORG_SEGMENT__COMMUNICATION_NUMBER:
        return getCommunicationNumber();
      case EdilangPackage.ORG_SEGMENT__PARTY_ID_IDENTIFICATION:
        return getPartyIdIdentification();
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
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL1:
        setSystemDetail1((SystemDetailFunction)newValue);
        return;
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR_IDENTIFICATION:
        setOriginatorIdentification((OriginatorIdentificationFunction)newValue);
        return;
      case EdilangPackage.ORG_SEGMENT__LOCATION:
        setLocation((LocationFunction)newValue);
        return;
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL2:
        setSystemDetail2((SystemDetailFunction)newValue);
        return;
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR_TYPE_CODE:
        setOriginatorTypeCode((String)newValue);
        return;
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR:
        setOriginator((OriginatorFunction)newValue);
        return;
      case EdilangPackage.ORG_SEGMENT__ORIGINATORS_AUTHORITY_REQUEST_CODE:
        setOriginatorsAuthorityRequestCode((String)newValue);
        return;
      case EdilangPackage.ORG_SEGMENT__COMMUNICATION_NUMBER:
        setCommunicationNumber((String)newValue);
        return;
      case EdilangPackage.ORG_SEGMENT__PARTY_ID_IDENTIFICATION:
        setPartyIdIdentification((String)newValue);
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
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL1:
        setSystemDetail1((SystemDetailFunction)null);
        return;
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR_IDENTIFICATION:
        setOriginatorIdentification((OriginatorIdentificationFunction)null);
        return;
      case EdilangPackage.ORG_SEGMENT__LOCATION:
        setLocation((LocationFunction)null);
        return;
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL2:
        setSystemDetail2((SystemDetailFunction)null);
        return;
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR_TYPE_CODE:
        setOriginatorTypeCode(ORIGINATOR_TYPE_CODE_EDEFAULT);
        return;
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR:
        setOriginator((OriginatorFunction)null);
        return;
      case EdilangPackage.ORG_SEGMENT__ORIGINATORS_AUTHORITY_REQUEST_CODE:
        setOriginatorsAuthorityRequestCode(ORIGINATORS_AUTHORITY_REQUEST_CODE_EDEFAULT);
        return;
      case EdilangPackage.ORG_SEGMENT__COMMUNICATION_NUMBER:
        setCommunicationNumber(COMMUNICATION_NUMBER_EDEFAULT);
        return;
      case EdilangPackage.ORG_SEGMENT__PARTY_ID_IDENTIFICATION:
        setPartyIdIdentification(PARTY_ID_IDENTIFICATION_EDEFAULT);
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
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL1:
        return systemDetail1 != null;
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR_IDENTIFICATION:
        return originatorIdentification != null;
      case EdilangPackage.ORG_SEGMENT__LOCATION:
        return location != null;
      case EdilangPackage.ORG_SEGMENT__SYSTEM_DETAIL2:
        return systemDetail2 != null;
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR_TYPE_CODE:
        return ORIGINATOR_TYPE_CODE_EDEFAULT == null ? originatorTypeCode != null : !ORIGINATOR_TYPE_CODE_EDEFAULT.equals(originatorTypeCode);
      case EdilangPackage.ORG_SEGMENT__ORIGINATOR:
        return originator != null;
      case EdilangPackage.ORG_SEGMENT__ORIGINATORS_AUTHORITY_REQUEST_CODE:
        return ORIGINATORS_AUTHORITY_REQUEST_CODE_EDEFAULT == null ? originatorsAuthorityRequestCode != null : !ORIGINATORS_AUTHORITY_REQUEST_CODE_EDEFAULT.equals(originatorsAuthorityRequestCode);
      case EdilangPackage.ORG_SEGMENT__COMMUNICATION_NUMBER:
        return COMMUNICATION_NUMBER_EDEFAULT == null ? communicationNumber != null : !COMMUNICATION_NUMBER_EDEFAULT.equals(communicationNumber);
      case EdilangPackage.ORG_SEGMENT__PARTY_ID_IDENTIFICATION:
        return PARTY_ID_IDENTIFICATION_EDEFAULT == null ? partyIdIdentification != null : !PARTY_ID_IDENTIFICATION_EDEFAULT.equals(partyIdIdentification);
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
    result.append(" (originatorTypeCode: ");
    result.append(originatorTypeCode);
    result.append(", originatorsAuthorityRequestCode: ");
    result.append(originatorsAuthorityRequestCode);
    result.append(", communicationNumber: ");
    result.append(communicationNumber);
    result.append(", partyIdIdentification: ");
    result.append(partyIdIdentification);
    result.append(')');
    return result.toString();
  }

} //ORGSegmentImpl
