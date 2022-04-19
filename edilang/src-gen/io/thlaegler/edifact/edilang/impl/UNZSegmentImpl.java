/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.UNZSegment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UNZ Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNZSegmentImpl#getInterchangeControlCount <em>Interchange Control Count</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.UNZSegmentImpl#getInterchangeControlRef <em>Interchange Control Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UNZSegmentImpl extends AbstractEdiSegmentImpl implements UNZSegment
{
  /**
   * The default value of the '{@link #getInterchangeControlCount() <em>Interchange Control Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeControlCount()
   * @generated
   * @ordered
   */
  protected static final String INTERCHANGE_CONTROL_COUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterchangeControlCount() <em>Interchange Control Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeControlCount()
   * @generated
   * @ordered
   */
  protected String interchangeControlCount = INTERCHANGE_CONTROL_COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getInterchangeControlRef() <em>Interchange Control Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeControlRef()
   * @generated
   * @ordered
   */
  protected static final String INTERCHANGE_CONTROL_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterchangeControlRef() <em>Interchange Control Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchangeControlRef()
   * @generated
   * @ordered
   */
  protected String interchangeControlRef = INTERCHANGE_CONTROL_REF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UNZSegmentImpl()
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
    return EdilangPackage.Literals.UNZ_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInterchangeControlCount()
  {
    return interchangeControlCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInterchangeControlCount(String newInterchangeControlCount)
  {
    String oldInterchangeControlCount = interchangeControlCount;
    interchangeControlCount = newInterchangeControlCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_COUNT, oldInterchangeControlCount, interchangeControlCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInterchangeControlRef()
  {
    return interchangeControlRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInterchangeControlRef(String newInterchangeControlRef)
  {
    String oldInterchangeControlRef = interchangeControlRef;
    interchangeControlRef = newInterchangeControlRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_REF, oldInterchangeControlRef, interchangeControlRef));
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
      case EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_COUNT:
        return getInterchangeControlCount();
      case EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_REF:
        return getInterchangeControlRef();
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
      case EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_COUNT:
        setInterchangeControlCount((String)newValue);
        return;
      case EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_REF:
        setInterchangeControlRef((String)newValue);
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
      case EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_COUNT:
        setInterchangeControlCount(INTERCHANGE_CONTROL_COUNT_EDEFAULT);
        return;
      case EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_REF:
        setInterchangeControlRef(INTERCHANGE_CONTROL_REF_EDEFAULT);
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
      case EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_COUNT:
        return INTERCHANGE_CONTROL_COUNT_EDEFAULT == null ? interchangeControlCount != null : !INTERCHANGE_CONTROL_COUNT_EDEFAULT.equals(interchangeControlCount);
      case EdilangPackage.UNZ_SEGMENT__INTERCHANGE_CONTROL_REF:
        return INTERCHANGE_CONTROL_REF_EDEFAULT == null ? interchangeControlRef != null : !INTERCHANGE_CONTROL_REF_EDEFAULT.equals(interchangeControlRef);
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
    result.append(" (interchangeControlCount: ");
    result.append(interchangeControlCount);
    result.append(", interchangeControlRef: ");
    result.append(interchangeControlRef);
    result.append(')');
    return result.toString();
  }

} //UNZSegmentImpl
