/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QTY Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.QTYSegment#getQuantityDetails <em>Quantity Details</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getQTYSegment()
 * @model
 * @generated
 */
public interface QTYSegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Quantity Details</b></em>' containment reference list.
   * The list contents are of type {@link io.thlaegler.edifact.edilang.QuantityDetail}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity Details</em>' containment reference list.
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getQTYSegment_QuantityDetails()
   * @model containment="true"
   * @generated
   */
  EList<QuantityDetail> getQuantityDetails();

} // QTYSegment
