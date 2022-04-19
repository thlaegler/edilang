/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.RPISegment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPI Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.RPISegmentImpl#getNumberOfPax <em>Number Of Pax</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.RPISegmentImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPISegmentImpl extends AbstractEdiSegmentImpl implements RPISegment
{
  /**
   * The default value of the '{@link #getNumberOfPax() <em>Number Of Pax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfPax()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_OF_PAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumberOfPax() <em>Number Of Pax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfPax()
   * @generated
   * @ordered
   */
  protected String numberOfPax = NUMBER_OF_PAX_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final String STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected String status = STATUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RPISegmentImpl()
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
    return EdilangPackage.Literals.RPI_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNumberOfPax()
  {
    return numberOfPax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumberOfPax(String newNumberOfPax)
  {
    String oldNumberOfPax = numberOfPax;
    numberOfPax = newNumberOfPax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.RPI_SEGMENT__NUMBER_OF_PAX, oldNumberOfPax, numberOfPax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStatus(String newStatus)
  {
    String oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.RPI_SEGMENT__STATUS, oldStatus, status));
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
      case EdilangPackage.RPI_SEGMENT__NUMBER_OF_PAX:
        return getNumberOfPax();
      case EdilangPackage.RPI_SEGMENT__STATUS:
        return getStatus();
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
      case EdilangPackage.RPI_SEGMENT__NUMBER_OF_PAX:
        setNumberOfPax((String)newValue);
        return;
      case EdilangPackage.RPI_SEGMENT__STATUS:
        setStatus((String)newValue);
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
      case EdilangPackage.RPI_SEGMENT__NUMBER_OF_PAX:
        setNumberOfPax(NUMBER_OF_PAX_EDEFAULT);
        return;
      case EdilangPackage.RPI_SEGMENT__STATUS:
        setStatus(STATUS_EDEFAULT);
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
      case EdilangPackage.RPI_SEGMENT__NUMBER_OF_PAX:
        return NUMBER_OF_PAX_EDEFAULT == null ? numberOfPax != null : !NUMBER_OF_PAX_EDEFAULT.equals(numberOfPax);
      case EdilangPackage.RPI_SEGMENT__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
    result.append(" (numberOfPax: ");
    result.append(numberOfPax);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //RPISegmentImpl
