/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.DateAndTimeFunction;
import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.InterchangerFunction;
import io.thlaegler.edifact.edilang.UNBHeader;
import io.thlaegler.edifact.edilang.UNBSegment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UNB Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNBSegmentImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNBSegmentImpl#getInterchangeSender <em>Interchange Sender</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNBSegmentImpl#getInterchangeRecipient <em>Interchange Recipient</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNBSegmentImpl#getDateAndTime <em>Date And Time</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNBSegmentImpl#getInterchangeControlSenderRef <em>Interchange Control Sender Ref</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNBSegmentImpl#getInterchangeControlRecipientRef <em>Interchange Control Recipient Ref</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNBSegmentImpl#getFse <em>Fse</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNBSegmentImpl#getAssiciationCode <em>Assiciation Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UNBSegmentImpl extends AbstractEdiSegmentImpl implements UNBSegment
{
  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected UNBHeader header;

  /**
   * The cached value of the '{@link #getInterchangeSender() <em>Interchange Sender</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeSender()
   * @generated
   * @ordered
   */
  protected InterchangerFunction interchangeSender;

  /**
   * The cached value of the '{@link #getInterchangeRecipient() <em>Interchange Recipient</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeRecipient()
   * @generated
   * @ordered
   */
  protected InterchangerFunction interchangeRecipient;

  /**
   * The cached value of the '{@link #getDateAndTime() <em>Date And Time</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateAndTime()
   * @generated
   * @ordered
   */
  protected EList<DateAndTimeFunction> dateAndTime;

  /**
   * The default value of the '{@link #getInterchangeControlSenderRef() <em>Interchange Control Sender Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeControlSenderRef()
   * @generated
   * @ordered
   */
  protected static final String INTERCHANGE_CONTROL_SENDER_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterchangeControlSenderRef() <em>Interchange Control Sender Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeControlSenderRef()
   * @generated
   * @ordered
   */
  protected String interchangeControlSenderRef = INTERCHANGE_CONTROL_SENDER_REF_EDEFAULT;

  /**
   * The default value of the '{@link #getInterchangeControlRecipientRef() <em>Interchange Control Recipient Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeControlRecipientRef()
   * @generated
   * @ordered
   */
  protected static final String INTERCHANGE_CONTROL_RECIPIENT_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterchangeControlRecipientRef() <em>Interchange Control Recipient Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeControlRecipientRef()
   * @generated
   * @ordered
   */
  protected String interchangeControlRecipientRef = INTERCHANGE_CONTROL_RECIPIENT_REF_EDEFAULT;

  /**
   * The default value of the '{@link #getFse() <em>Fse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFse()
   * @generated
   * @ordered
   */
  protected static final String FSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFse() <em>Fse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFse()
   * @generated
   * @ordered
   */
  protected String fse = FSE_EDEFAULT;

  /**
   * The default value of the '{@link #getAssiciationCode() <em>Assiciation Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssiciationCode()
   * @generated
   * @ordered
   */
  protected static final String ASSICIATION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssiciationCode() <em>Assiciation Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssiciationCode()
   * @generated
   * @ordered
   */
  protected String assiciationCode = ASSICIATION_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UNBSegmentImpl()
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
    return EdilangPackage.Literals.UNB_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UNBHeader getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeader(UNBHeader newHeader, NotificationChain msgs)
  {
    UNBHeader oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__HEADER, oldHeader, newHeader);
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
  public void setHeader(UNBHeader newHeader)
  {
    if (newHeader != header)
    {
      NotificationChain msgs = null;
      if (header != null)
        msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.UNB_SEGMENT__HEADER, null, msgs);
      if (newHeader != null)
        msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.UNB_SEGMENT__HEADER, null, msgs);
      msgs = basicSetHeader(newHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__HEADER, newHeader, newHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InterchangerFunction getInterchangeSender()
  {
    return interchangeSender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterchangeSender(InterchangerFunction newInterchangeSender, NotificationChain msgs)
  {
    InterchangerFunction oldInterchangeSender = interchangeSender;
    interchangeSender = newInterchangeSender;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__INTERCHANGE_SENDER, oldInterchangeSender, newInterchangeSender);
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
  public void setInterchangeSender(InterchangerFunction newInterchangeSender)
  {
    if (newInterchangeSender != interchangeSender)
    {
      NotificationChain msgs = null;
      if (interchangeSender != null)
        msgs = ((InternalEObject)interchangeSender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.UNB_SEGMENT__INTERCHANGE_SENDER, null, msgs);
      if (newInterchangeSender != null)
        msgs = ((InternalEObject)newInterchangeSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.UNB_SEGMENT__INTERCHANGE_SENDER, null, msgs);
      msgs = basicSetInterchangeSender(newInterchangeSender, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__INTERCHANGE_SENDER, newInterchangeSender, newInterchangeSender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InterchangerFunction getInterchangeRecipient()
  {
    return interchangeRecipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterchangeRecipient(InterchangerFunction newInterchangeRecipient, NotificationChain msgs)
  {
    InterchangerFunction oldInterchangeRecipient = interchangeRecipient;
    interchangeRecipient = newInterchangeRecipient;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__INTERCHANGE_RECIPIENT, oldInterchangeRecipient, newInterchangeRecipient);
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
  public void setInterchangeRecipient(InterchangerFunction newInterchangeRecipient)
  {
    if (newInterchangeRecipient != interchangeRecipient)
    {
      NotificationChain msgs = null;
      if (interchangeRecipient != null)
        msgs = ((InternalEObject)interchangeRecipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.UNB_SEGMENT__INTERCHANGE_RECIPIENT, null, msgs);
      if (newInterchangeRecipient != null)
        msgs = ((InternalEObject)newInterchangeRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.UNB_SEGMENT__INTERCHANGE_RECIPIENT, null, msgs);
      msgs = basicSetInterchangeRecipient(newInterchangeRecipient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__INTERCHANGE_RECIPIENT, newInterchangeRecipient, newInterchangeRecipient));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DateAndTimeFunction> getDateAndTime()
  {
    if (dateAndTime == null)
    {
      dateAndTime = new EObjectContainmentEList<DateAndTimeFunction>(DateAndTimeFunction.class, this, EdilangPackage.UNB_SEGMENT__DATE_AND_TIME);
    }
    return dateAndTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInterchangeControlSenderRef()
  {
    return interchangeControlSenderRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInterchangeControlSenderRef(String newInterchangeControlSenderRef)
  {
    String oldInterchangeControlSenderRef = interchangeControlSenderRef;
    interchangeControlSenderRef = newInterchangeControlSenderRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_SENDER_REF, oldInterchangeControlSenderRef, interchangeControlSenderRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInterchangeControlRecipientRef()
  {
    return interchangeControlRecipientRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInterchangeControlRecipientRef(String newInterchangeControlRecipientRef)
  {
    String oldInterchangeControlRecipientRef = interchangeControlRecipientRef;
    interchangeControlRecipientRef = newInterchangeControlRecipientRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_RECIPIENT_REF, oldInterchangeControlRecipientRef, interchangeControlRecipientRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFse()
  {
    return fse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFse(String newFse)
  {
    String oldFse = fse;
    fse = newFse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__FSE, oldFse, fse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAssiciationCode()
  {
    return assiciationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssiciationCode(String newAssiciationCode)
  {
    String oldAssiciationCode = assiciationCode;
    assiciationCode = newAssiciationCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNB_SEGMENT__ASSICIATION_CODE, oldAssiciationCode, assiciationCode));
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
      case EdilangPackage.UNB_SEGMENT__HEADER:
        return basicSetHeader(null, msgs);
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_SENDER:
        return basicSetInterchangeSender(null, msgs);
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_RECIPIENT:
        return basicSetInterchangeRecipient(null, msgs);
      case EdilangPackage.UNB_SEGMENT__DATE_AND_TIME:
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
      case EdilangPackage.UNB_SEGMENT__HEADER:
        return getHeader();
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_SENDER:
        return getInterchangeSender();
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_RECIPIENT:
        return getInterchangeRecipient();
      case EdilangPackage.UNB_SEGMENT__DATE_AND_TIME:
        return getDateAndTime();
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_SENDER_REF:
        return getInterchangeControlSenderRef();
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_RECIPIENT_REF:
        return getInterchangeControlRecipientRef();
      case EdilangPackage.UNB_SEGMENT__FSE:
        return getFse();
      case EdilangPackage.UNB_SEGMENT__ASSICIATION_CODE:
        return getAssiciationCode();
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
      case EdilangPackage.UNB_SEGMENT__HEADER:
        setHeader((UNBHeader)newValue);
        return;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_SENDER:
        setInterchangeSender((InterchangerFunction)newValue);
        return;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_RECIPIENT:
        setInterchangeRecipient((InterchangerFunction)newValue);
        return;
      case EdilangPackage.UNB_SEGMENT__DATE_AND_TIME:
        getDateAndTime().clear();
        getDateAndTime().addAll((Collection<? extends DateAndTimeFunction>)newValue);
        return;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_SENDER_REF:
        setInterchangeControlSenderRef((String)newValue);
        return;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_RECIPIENT_REF:
        setInterchangeControlRecipientRef((String)newValue);
        return;
      case EdilangPackage.UNB_SEGMENT__FSE:
        setFse((String)newValue);
        return;
      case EdilangPackage.UNB_SEGMENT__ASSICIATION_CODE:
        setAssiciationCode((String)newValue);
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
      case EdilangPackage.UNB_SEGMENT__HEADER:
        setHeader((UNBHeader)null);
        return;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_SENDER:
        setInterchangeSender((InterchangerFunction)null);
        return;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_RECIPIENT:
        setInterchangeRecipient((InterchangerFunction)null);
        return;
      case EdilangPackage.UNB_SEGMENT__DATE_AND_TIME:
        getDateAndTime().clear();
        return;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_SENDER_REF:
        setInterchangeControlSenderRef(INTERCHANGE_CONTROL_SENDER_REF_EDEFAULT);
        return;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_RECIPIENT_REF:
        setInterchangeControlRecipientRef(INTERCHANGE_CONTROL_RECIPIENT_REF_EDEFAULT);
        return;
      case EdilangPackage.UNB_SEGMENT__FSE:
        setFse(FSE_EDEFAULT);
        return;
      case EdilangPackage.UNB_SEGMENT__ASSICIATION_CODE:
        setAssiciationCode(ASSICIATION_CODE_EDEFAULT);
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
      case EdilangPackage.UNB_SEGMENT__HEADER:
        return header != null;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_SENDER:
        return interchangeSender != null;
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_RECIPIENT:
        return interchangeRecipient != null;
      case EdilangPackage.UNB_SEGMENT__DATE_AND_TIME:
        return dateAndTime != null && !dateAndTime.isEmpty();
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_SENDER_REF:
        return INTERCHANGE_CONTROL_SENDER_REF_EDEFAULT == null ? interchangeControlSenderRef != null : !INTERCHANGE_CONTROL_SENDER_REF_EDEFAULT.equals(interchangeControlSenderRef);
      case EdilangPackage.UNB_SEGMENT__INTERCHANGE_CONTROL_RECIPIENT_REF:
        return INTERCHANGE_CONTROL_RECIPIENT_REF_EDEFAULT == null ? interchangeControlRecipientRef != null : !INTERCHANGE_CONTROL_RECIPIENT_REF_EDEFAULT.equals(interchangeControlRecipientRef);
      case EdilangPackage.UNB_SEGMENT__FSE:
        return FSE_EDEFAULT == null ? fse != null : !FSE_EDEFAULT.equals(fse);
      case EdilangPackage.UNB_SEGMENT__ASSICIATION_CODE:
        return ASSICIATION_CODE_EDEFAULT == null ? assiciationCode != null : !ASSICIATION_CODE_EDEFAULT.equals(assiciationCode);
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
    result.append(" (interchangeControlSenderRef: ");
    result.append(interchangeControlSenderRef);
    result.append(", interchangeControlRecipientRef: ");
    result.append(interchangeControlRecipientRef);
    result.append(", fse: ");
    result.append(fse);
    result.append(", assiciationCode: ");
    result.append(assiciationCode);
    result.append(')');
    return result.toString();
  }

} //UNBSegmentImpl
