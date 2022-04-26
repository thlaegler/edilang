/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.SEGSegment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEG Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.SEGSegmentImpl#getSegmentTagIdentifer <em>Segment Tag Identifer</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.SEGSegmentImpl#getDesignatedClassCode <em>Designated Class Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.SEGSegmentImpl#getMaintenanceOperationCode <em>Maintenance Operation Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SEGSegmentImpl extends AbstractEdiSegmentImpl implements SEGSegment
{
  /**
   * The default value of the '{@link #getSegmentTagIdentifer() <em>Segment Tag Identifer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegmentTagIdentifer()
   * @generated
   * @ordered
   */
  protected static final String SEGMENT_TAG_IDENTIFER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSegmentTagIdentifer() <em>Segment Tag Identifer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegmentTagIdentifer()
   * @generated
   * @ordered
   */
  protected String segmentTagIdentifer = SEGMENT_TAG_IDENTIFER_EDEFAULT;

  /**
   * The default value of the '{@link #getDesignatedClassCode() <em>Designated Class Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesignatedClassCode()
   * @generated
   * @ordered
   */
  protected static final String DESIGNATED_CLASS_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesignatedClassCode() <em>Designated Class Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesignatedClassCode()
   * @generated
   * @ordered
   */
  protected String designatedClassCode = DESIGNATED_CLASS_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getMaintenanceOperationCode() <em>Maintenance Operation Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaintenanceOperationCode()
   * @generated
   * @ordered
   */
  protected static final String MAINTENANCE_OPERATION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaintenanceOperationCode() <em>Maintenance Operation Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaintenanceOperationCode()
   * @generated
   * @ordered
   */
  protected String maintenanceOperationCode = MAINTENANCE_OPERATION_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SEGSegmentImpl()
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
    return EdilangPackage.eINSTANCE.getSEGSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSegmentTagIdentifer()
  {
    return segmentTagIdentifer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSegmentTagIdentifer(String newSegmentTagIdentifer)
  {
    String oldSegmentTagIdentifer = segmentTagIdentifer;
    segmentTagIdentifer = newSegmentTagIdentifer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.SEG_SEGMENT__SEGMENT_TAG_IDENTIFER, oldSegmentTagIdentifer, segmentTagIdentifer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDesignatedClassCode()
  {
    return designatedClassCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDesignatedClassCode(String newDesignatedClassCode)
  {
    String oldDesignatedClassCode = designatedClassCode;
    designatedClassCode = newDesignatedClassCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.SEG_SEGMENT__DESIGNATED_CLASS_CODE, oldDesignatedClassCode, designatedClassCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMaintenanceOperationCode()
  {
    return maintenanceOperationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaintenanceOperationCode(String newMaintenanceOperationCode)
  {
    String oldMaintenanceOperationCode = maintenanceOperationCode;
    maintenanceOperationCode = newMaintenanceOperationCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.SEG_SEGMENT__MAINTENANCE_OPERATION_CODE, oldMaintenanceOperationCode, maintenanceOperationCode));
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
      case EdilangPackage.SEG_SEGMENT__SEGMENT_TAG_IDENTIFER:
        return getSegmentTagIdentifer();
      case EdilangPackage.SEG_SEGMENT__DESIGNATED_CLASS_CODE:
        return getDesignatedClassCode();
      case EdilangPackage.SEG_SEGMENT__MAINTENANCE_OPERATION_CODE:
        return getMaintenanceOperationCode();
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
      case EdilangPackage.SEG_SEGMENT__SEGMENT_TAG_IDENTIFER:
        setSegmentTagIdentifer((String)newValue);
        return;
      case EdilangPackage.SEG_SEGMENT__DESIGNATED_CLASS_CODE:
        setDesignatedClassCode((String)newValue);
        return;
      case EdilangPackage.SEG_SEGMENT__MAINTENANCE_OPERATION_CODE:
        setMaintenanceOperationCode((String)newValue);
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
      case EdilangPackage.SEG_SEGMENT__SEGMENT_TAG_IDENTIFER:
        setSegmentTagIdentifer(SEGMENT_TAG_IDENTIFER_EDEFAULT);
        return;
      case EdilangPackage.SEG_SEGMENT__DESIGNATED_CLASS_CODE:
        setDesignatedClassCode(DESIGNATED_CLASS_CODE_EDEFAULT);
        return;
      case EdilangPackage.SEG_SEGMENT__MAINTENANCE_OPERATION_CODE:
        setMaintenanceOperationCode(MAINTENANCE_OPERATION_CODE_EDEFAULT);
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
      case EdilangPackage.SEG_SEGMENT__SEGMENT_TAG_IDENTIFER:
        return SEGMENT_TAG_IDENTIFER_EDEFAULT == null ? segmentTagIdentifer != null : !SEGMENT_TAG_IDENTIFER_EDEFAULT.equals(segmentTagIdentifer);
      case EdilangPackage.SEG_SEGMENT__DESIGNATED_CLASS_CODE:
        return DESIGNATED_CLASS_CODE_EDEFAULT == null ? designatedClassCode != null : !DESIGNATED_CLASS_CODE_EDEFAULT.equals(designatedClassCode);
      case EdilangPackage.SEG_SEGMENT__MAINTENANCE_OPERATION_CODE:
        return MAINTENANCE_OPERATION_CODE_EDEFAULT == null ? maintenanceOperationCode != null : !MAINTENANCE_OPERATION_CODE_EDEFAULT.equals(maintenanceOperationCode);
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
    result.append(" (segmentTagIdentifer: ");
    result.append(segmentTagIdentifer);
    result.append(", designatedClassCode: ");
    result.append(designatedClassCode);
    result.append(", maintenanceOperationCode: ");
    result.append(maintenanceOperationCode);
    result.append(')');
    return result.toString();
  }

} //SEGSegmentImpl
