/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.LocationFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.LocationFunctionImpl#getLocationId <em>Location Id</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.LocationFunctionImpl#getLocationName <em>Location Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationFunctionImpl extends AbstractEdiFunctionImpl implements LocationFunction
{
  /**
   * The default value of the '{@link #getLocationId() <em>Location Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationId()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocationId() <em>Location Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationId()
   * @generated
   * @ordered
   */
  protected String locationId = LOCATION_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getLocationName() <em>Location Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationName()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocationName() <em>Location Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationName()
   * @generated
   * @ordered
   */
  protected String locationName = LOCATION_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationFunctionImpl()
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
    return EdilangPackage.Literals.LOCATION_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLocationId()
  {
    return locationId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocationId(String newLocationId)
  {
    String oldLocationId = locationId;
    locationId = newLocationId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.LOCATION_FUNCTION__LOCATION_ID, oldLocationId, locationId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLocationName()
  {
    return locationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocationName(String newLocationName)
  {
    String oldLocationName = locationName;
    locationName = newLocationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.LOCATION_FUNCTION__LOCATION_NAME, oldLocationName, locationName));
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
      case EdilangPackage.LOCATION_FUNCTION__LOCATION_ID:
        return getLocationId();
      case EdilangPackage.LOCATION_FUNCTION__LOCATION_NAME:
        return getLocationName();
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
      case EdilangPackage.LOCATION_FUNCTION__LOCATION_ID:
        setLocationId((String)newValue);
        return;
      case EdilangPackage.LOCATION_FUNCTION__LOCATION_NAME:
        setLocationName((String)newValue);
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
      case EdilangPackage.LOCATION_FUNCTION__LOCATION_ID:
        setLocationId(LOCATION_ID_EDEFAULT);
        return;
      case EdilangPackage.LOCATION_FUNCTION__LOCATION_NAME:
        setLocationName(LOCATION_NAME_EDEFAULT);
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
      case EdilangPackage.LOCATION_FUNCTION__LOCATION_ID:
        return LOCATION_ID_EDEFAULT == null ? locationId != null : !LOCATION_ID_EDEFAULT.equals(locationId);
      case EdilangPackage.LOCATION_FUNCTION__LOCATION_NAME:
        return LOCATION_NAME_EDEFAULT == null ? locationName != null : !LOCATION_NAME_EDEFAULT.equals(locationName);
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
    result.append(" (locationId: ");
    result.append(locationId);
    result.append(", locationName: ");
    result.append(locationName);
    result.append(')');
    return result.toString();
  }

} //LocationFunctionImpl