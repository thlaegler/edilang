/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.UNTSegment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UNT Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNTSegmentImpl#getSegmentCount <em>Segment Count</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNTSegmentImpl#getMessageReferenceNumber <em>Message Reference Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UNTSegmentImpl extends AbstractEdiSegmentImpl implements UNTSegment
{
  /**
   * The default value of the '{@link #getSegmentCount() <em>Segment Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegmentCount()
   * @generated
   * @ordered
   */
  protected static final String SEGMENT_COUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSegmentCount() <em>Segment Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegmentCount()
   * @generated
   * @ordered
   */
  protected String segmentCount = SEGMENT_COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getMessageReferenceNumber() <em>Message Reference Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageReferenceNumber()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_REFERENCE_NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessageReferenceNumber() <em>Message Reference Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageReferenceNumber()
   * @generated
   * @ordered
   */
  protected String messageReferenceNumber = MESSAGE_REFERENCE_NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UNTSegmentImpl()
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
    return EdilangPackage.Literals.UNT_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSegmentCount()
  {
    return segmentCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSegmentCount(String newSegmentCount)
  {
    String oldSegmentCount = segmentCount;
    segmentCount = newSegmentCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNT_SEGMENT__SEGMENT_COUNT, oldSegmentCount, segmentCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMessageReferenceNumber()
  {
    return messageReferenceNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMessageReferenceNumber(String newMessageReferenceNumber)
  {
    String oldMessageReferenceNumber = messageReferenceNumber;
    messageReferenceNumber = newMessageReferenceNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNT_SEGMENT__MESSAGE_REFERENCE_NUMBER, oldMessageReferenceNumber, messageReferenceNumber));
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
      case EdilangPackage.UNT_SEGMENT__SEGMENT_COUNT:
        return getSegmentCount();
      case EdilangPackage.UNT_SEGMENT__MESSAGE_REFERENCE_NUMBER:
        return getMessageReferenceNumber();
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
      case EdilangPackage.UNT_SEGMENT__SEGMENT_COUNT:
        setSegmentCount((String)newValue);
        return;
      case EdilangPackage.UNT_SEGMENT__MESSAGE_REFERENCE_NUMBER:
        setMessageReferenceNumber((String)newValue);
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
      case EdilangPackage.UNT_SEGMENT__SEGMENT_COUNT:
        setSegmentCount(SEGMENT_COUNT_EDEFAULT);
        return;
      case EdilangPackage.UNT_SEGMENT__MESSAGE_REFERENCE_NUMBER:
        setMessageReferenceNumber(MESSAGE_REFERENCE_NUMBER_EDEFAULT);
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
      case EdilangPackage.UNT_SEGMENT__SEGMENT_COUNT:
        return SEGMENT_COUNT_EDEFAULT == null ? segmentCount != null : !SEGMENT_COUNT_EDEFAULT.equals(segmentCount);
      case EdilangPackage.UNT_SEGMENT__MESSAGE_REFERENCE_NUMBER:
        return MESSAGE_REFERENCE_NUMBER_EDEFAULT == null ? messageReferenceNumber != null : !MESSAGE_REFERENCE_NUMBER_EDEFAULT.equals(messageReferenceNumber);
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
    result.append(" (segmentCount: ");
    result.append(segmentCount);
    result.append(", messageReferenceNumber: ");
    result.append(messageReferenceNumber);
    result.append(')');
    return result.toString();
  }

} //UNTSegmentImpl