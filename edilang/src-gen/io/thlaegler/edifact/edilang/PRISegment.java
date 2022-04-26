/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRI Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.PRISegment#getPriceInformation <em>Price Information</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.PRISegment#getSubLineItemPriceChangeOperationCode <em>Sub Line Item Price Change Operation Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getPRISegment()
 * @model
 * @generated
 */
public interface PRISegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Price Information</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price Information</em>' containment reference.
   * @see #setPriceInformation(PriceInformation)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPRISegment_PriceInformation()
   * @model containment="true"
   * @generated
   */
  PriceInformation getPriceInformation();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PRISegment#getPriceInformation <em>Price Information</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price Information</em>' containment reference.
   * @see #getPriceInformation()
   * @generated
   */
  void setPriceInformation(PriceInformation value);

  /**
   * Returns the value of the '<em><b>Sub Line Item Price Change Operation Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Line Item Price Change Operation Code</em>' attribute.
   * @see #setSubLineItemPriceChangeOperationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPRISegment_SubLineItemPriceChangeOperationCode()
   * @model
   * @generated
   */
  String getSubLineItemPriceChangeOperationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PRISegment#getSubLineItemPriceChangeOperationCode <em>Sub Line Item Price Change Operation Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Line Item Price Change Operation Code</em>' attribute.
   * @see #getSubLineItemPriceChangeOperationCode()
   * @generated
   */
  void setSubLineItemPriceChangeOperationCode(String value);

} // PRISegment
