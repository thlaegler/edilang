/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.CTASegment;
import io.thlaegler.edifact.edilang.DepartmentEmployeeDetail;
import io.thlaegler.edifact.edilang.EdilangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CTA Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CTASegmentImpl#getContactFunctionCode <em>Contact Function Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CTASegmentImpl#getDepartmentEmployeeDetails <em>Department Employee Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CTASegmentImpl extends AbstractEdiSegmentImpl implements CTASegment
{
  /**
   * The default value of the '{@link #getContactFunctionCode() <em>Contact Function Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContactFunctionCode()
   * @generated
   * @ordered
   */
  protected static final String CONTACT_FUNCTION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContactFunctionCode() <em>Contact Function Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContactFunctionCode()
   * @generated
   * @ordered
   */
  protected String contactFunctionCode = CONTACT_FUNCTION_CODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDepartmentEmployeeDetails() <em>Department Employee Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepartmentEmployeeDetails()
   * @generated
   * @ordered
   */
  protected DepartmentEmployeeDetail departmentEmployeeDetails;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CTASegmentImpl()
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
    return EdilangPackage.eINSTANCE.getCTASegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getContactFunctionCode()
  {
    return contactFunctionCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContactFunctionCode(String newContactFunctionCode)
  {
    String oldContactFunctionCode = contactFunctionCode;
    contactFunctionCode = newContactFunctionCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CTA_SEGMENT__CONTACT_FUNCTION_CODE, oldContactFunctionCode, contactFunctionCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DepartmentEmployeeDetail getDepartmentEmployeeDetails()
  {
    return departmentEmployeeDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDepartmentEmployeeDetails(DepartmentEmployeeDetail newDepartmentEmployeeDetails, NotificationChain msgs)
  {
    DepartmentEmployeeDetail oldDepartmentEmployeeDetails = departmentEmployeeDetails;
    departmentEmployeeDetails = newDepartmentEmployeeDetails;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.CTA_SEGMENT__DEPARTMENT_EMPLOYEE_DETAILS, oldDepartmentEmployeeDetails, newDepartmentEmployeeDetails);
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
  public void setDepartmentEmployeeDetails(DepartmentEmployeeDetail newDepartmentEmployeeDetails)
  {
    if (newDepartmentEmployeeDetails != departmentEmployeeDetails)
    {
      NotificationChain msgs = null;
      if (departmentEmployeeDetails != null)
        msgs = ((InternalEObject)departmentEmployeeDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CTA_SEGMENT__DEPARTMENT_EMPLOYEE_DETAILS, null, msgs);
      if (newDepartmentEmployeeDetails != null)
        msgs = ((InternalEObject)newDepartmentEmployeeDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CTA_SEGMENT__DEPARTMENT_EMPLOYEE_DETAILS, null, msgs);
      msgs = basicSetDepartmentEmployeeDetails(newDepartmentEmployeeDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CTA_SEGMENT__DEPARTMENT_EMPLOYEE_DETAILS, newDepartmentEmployeeDetails, newDepartmentEmployeeDetails));
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
      case EdilangPackage.CTA_SEGMENT__DEPARTMENT_EMPLOYEE_DETAILS:
        return basicSetDepartmentEmployeeDetails(null, msgs);
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
      case EdilangPackage.CTA_SEGMENT__CONTACT_FUNCTION_CODE:
        return getContactFunctionCode();
      case EdilangPackage.CTA_SEGMENT__DEPARTMENT_EMPLOYEE_DETAILS:
        return getDepartmentEmployeeDetails();
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
      case EdilangPackage.CTA_SEGMENT__CONTACT_FUNCTION_CODE:
        setContactFunctionCode((String)newValue);
        return;
      case EdilangPackage.CTA_SEGMENT__DEPARTMENT_EMPLOYEE_DETAILS:
        setDepartmentEmployeeDetails((DepartmentEmployeeDetail)newValue);
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
      case EdilangPackage.CTA_SEGMENT__CONTACT_FUNCTION_CODE:
        setContactFunctionCode(CONTACT_FUNCTION_CODE_EDEFAULT);
        return;
      case EdilangPackage.CTA_SEGMENT__DEPARTMENT_EMPLOYEE_DETAILS:
        setDepartmentEmployeeDetails((DepartmentEmployeeDetail)null);
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
      case EdilangPackage.CTA_SEGMENT__CONTACT_FUNCTION_CODE:
        return CONTACT_FUNCTION_CODE_EDEFAULT == null ? contactFunctionCode != null : !CONTACT_FUNCTION_CODE_EDEFAULT.equals(contactFunctionCode);
      case EdilangPackage.CTA_SEGMENT__DEPARTMENT_EMPLOYEE_DETAILS:
        return departmentEmployeeDetails != null;
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
    result.append(" (contactFunctionCode: ");
    result.append(contactFunctionCode);
    result.append(')');
    return result.toString();
  }

} //CTASegmentImpl
