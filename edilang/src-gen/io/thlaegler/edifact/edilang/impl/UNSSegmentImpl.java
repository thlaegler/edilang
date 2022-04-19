/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.UNSSegment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UNS Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNSSegmentImpl#getSegmentCount <em>Segment Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UNSSegmentImpl extends AbstractEdiSegmentImpl implements UNSSegment
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UNSSegmentImpl()
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
    return EdilangPackage.Literals.UNS_SEGMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNS_SEGMENT__SEGMENT_COUNT, oldSegmentCount, segmentCount));
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
      case EdilangPackage.UNS_SEGMENT__SEGMENT_COUNT:
        return getSegmentCount();
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
      case EdilangPackage.UNS_SEGMENT__SEGMENT_COUNT:
        setSegmentCount((String)newValue);
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
      case EdilangPackage.UNS_SEGMENT__SEGMENT_COUNT:
        setSegmentCount(SEGMENT_COUNT_EDEFAULT);
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
      case EdilangPackage.UNS_SEGMENT__SEGMENT_COUNT:
        return SEGMENT_COUNT_EDEFAULT == null ? segmentCount != null : !SEGMENT_COUNT_EDEFAULT.equals(segmentCount);
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
    result.append(')');
    return result.toString();
  }

} //UNSSegmentImpl
