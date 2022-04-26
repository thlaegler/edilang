/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STS Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.STSSegment#getStatusCategory <em>Status Category</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.STSSegment#getStatus <em>Status</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.STSSegment#getStatusReasons <em>Status Reasons</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getSTSSegment()
 * @model
 * @generated
 */
public interface STSSegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Status Category</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status Category</em>' containment reference.
   * @see #setStatusCategory(StatusCategory)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getSTSSegment_StatusCategory()
   * @model containment="true"
   * @generated
   */
  StatusCategory getStatusCategory();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.STSSegment#getStatusCategory <em>Status Category</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status Category</em>' containment reference.
   * @see #getStatusCategory()
   * @generated
   */
  void setStatusCategory(StatusCategory value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' containment reference.
   * @see #setStatus(Status)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getSTSSegment_Status()
   * @model containment="true"
   * @generated
   */
  Status getStatus();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.STSSegment#getStatus <em>Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' containment reference.
   * @see #getStatus()
   * @generated
   */
  void setStatus(Status value);

  /**
   * Returns the value of the '<em><b>Status Reasons</b></em>' containment reference list.
   * The list contents are of type {@link io.thlaegler.edifact.edilang.StatusReason}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status Reasons</em>' containment reference list.
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getSTSSegment_StatusReasons()
   * @model containment="true"
   * @generated
   */
  EList<StatusReason> getStatusReasons();

} // STSSegment
