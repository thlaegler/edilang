/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.CDSSegment;
import io.thlaegler.edifact.edilang.CodeSetIdentification;
import io.thlaegler.edifact.edilang.EdilangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDS Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CDSSegmentImpl#getCodeSetIdentification <em>Code Set Identification</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CDSSegmentImpl#getDesignatedClassCode <em>Designated Class Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CDSSegmentImpl#getMaintenanceOperationCode <em>Maintenance Operation Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDSSegmentImpl extends AbstractEdiSegmentImpl implements CDSSegment
{
  /**
   * The cached value of the '{@link #getCodeSetIdentification() <em>Code Set Identification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeSetIdentification()
   * @generated
   * @ordered
   */
  protected CodeSetIdentification codeSetIdentification;

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
  protected CDSSegmentImpl()
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
    return EdilangPackage.eINSTANCE.getCDSSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CodeSetIdentification getCodeSetIdentification()
  {
    return codeSetIdentification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCodeSetIdentification(CodeSetIdentification newCodeSetIdentification, NotificationChain msgs)
  {
    CodeSetIdentification oldCodeSetIdentification = codeSetIdentification;
    codeSetIdentification = newCodeSetIdentification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.CDS_SEGMENT__CODE_SET_IDENTIFICATION, oldCodeSetIdentification, newCodeSetIdentification);
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
  public void setCodeSetIdentification(CodeSetIdentification newCodeSetIdentification)
  {
    if (newCodeSetIdentification != codeSetIdentification)
    {
      NotificationChain msgs = null;
      if (codeSetIdentification != null)
        msgs = ((InternalEObject)codeSetIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CDS_SEGMENT__CODE_SET_IDENTIFICATION, null, msgs);
      if (newCodeSetIdentification != null)
        msgs = ((InternalEObject)newCodeSetIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CDS_SEGMENT__CODE_SET_IDENTIFICATION, null, msgs);
      msgs = basicSetCodeSetIdentification(newCodeSetIdentification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CDS_SEGMENT__CODE_SET_IDENTIFICATION, newCodeSetIdentification, newCodeSetIdentification));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CDS_SEGMENT__DESIGNATED_CLASS_CODE, oldDesignatedClassCode, designatedClassCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CDS_SEGMENT__MAINTENANCE_OPERATION_CODE, oldMaintenanceOperationCode, maintenanceOperationCode));
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
      case EdilangPackage.CDS_SEGMENT__CODE_SET_IDENTIFICATION:
        return basicSetCodeSetIdentification(null, msgs);
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
      case EdilangPackage.CDS_SEGMENT__CODE_SET_IDENTIFICATION:
        return getCodeSetIdentification();
      case EdilangPackage.CDS_SEGMENT__DESIGNATED_CLASS_CODE:
        return getDesignatedClassCode();
      case EdilangPackage.CDS_SEGMENT__MAINTENANCE_OPERATION_CODE:
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
      case EdilangPackage.CDS_SEGMENT__CODE_SET_IDENTIFICATION:
        setCodeSetIdentification((CodeSetIdentification)newValue);
        return;
      case EdilangPackage.CDS_SEGMENT__DESIGNATED_CLASS_CODE:
        setDesignatedClassCode((String)newValue);
        return;
      case EdilangPackage.CDS_SEGMENT__MAINTENANCE_OPERATION_CODE:
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
      case EdilangPackage.CDS_SEGMENT__CODE_SET_IDENTIFICATION:
        setCodeSetIdentification((CodeSetIdentification)null);
        return;
      case EdilangPackage.CDS_SEGMENT__DESIGNATED_CLASS_CODE:
        setDesignatedClassCode(DESIGNATED_CLASS_CODE_EDEFAULT);
        return;
      case EdilangPackage.CDS_SEGMENT__MAINTENANCE_OPERATION_CODE:
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
      case EdilangPackage.CDS_SEGMENT__CODE_SET_IDENTIFICATION:
        return codeSetIdentification != null;
      case EdilangPackage.CDS_SEGMENT__DESIGNATED_CLASS_CODE:
        return DESIGNATED_CLASS_CODE_EDEFAULT == null ? designatedClassCode != null : !DESIGNATED_CLASS_CODE_EDEFAULT.equals(designatedClassCode);
      case EdilangPackage.CDS_SEGMENT__MAINTENANCE_OPERATION_CODE:
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
    result.append(" (designatedClassCode: ");
    result.append(designatedClassCode);
    result.append(", maintenanceOperationCode: ");
    result.append(maintenanceOperationCode);
    result.append(')');
    return result.toString();
  }

} //CDSSegmentImpl
