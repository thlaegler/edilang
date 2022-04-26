/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SEG Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.SEGSegment#getSegmentTagIdentifer <em>Segment Tag Identifer</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.SEGSegment#getDesignatedClassCode <em>Designated Class Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.SEGSegment#getMaintenanceOperationCode <em>Maintenance Operation Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getSEGSegment()
 * @model
 * @generated
 */
public interface SEGSegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Segment Tag Identifer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segment Tag Identifer</em>' attribute.
   * @see #setSegmentTagIdentifer(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getSEGSegment_SegmentTagIdentifer()
   * @model
   * @generated
   */
  String getSegmentTagIdentifer();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.SEGSegment#getSegmentTagIdentifer <em>Segment Tag Identifer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Segment Tag Identifer</em>' attribute.
   * @see #getSegmentTagIdentifer()
   * @generated
   */
  void setSegmentTagIdentifer(String value);

  /**
   * Returns the value of the '<em><b>Designated Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Designated Class Code</em>' attribute.
   * @see #setDesignatedClassCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getSEGSegment_DesignatedClassCode()
   * @model
   * @generated
   */
  String getDesignatedClassCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.SEGSegment#getDesignatedClassCode <em>Designated Class Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Designated Class Code</em>' attribute.
   * @see #getDesignatedClassCode()
   * @generated
   */
  void setDesignatedClassCode(String value);

  /**
   * Returns the value of the '<em><b>Maintenance Operation Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maintenance Operation Code</em>' attribute.
   * @see #setMaintenanceOperationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getSEGSegment_MaintenanceOperationCode()
   * @model
   * @generated
   */
  String getMaintenanceOperationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.SEGSegment#getMaintenanceOperationCode <em>Maintenance Operation Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maintenance Operation Code</em>' attribute.
   * @see #getMaintenanceOperationCode()
   * @generated
   */
  void setMaintenanceOperationCode(String value);

} // SEGSegment
