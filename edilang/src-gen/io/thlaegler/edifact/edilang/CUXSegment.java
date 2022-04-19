/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CUX Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.CUXSegment#getNum <em>Num</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CUXSegment#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getCUXSegment()
 * @model
 * @generated
 */
public interface CUXSegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCUXSegment_Num()
   * @model
   * @generated
   */
  String getNum();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CUXSegment#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(String value);

  /**
   * Returns the value of the '<em><b>Currency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Currency</em>' attribute.
   * @see #setCurrency(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCUXSegment_Currency()
   * @model
   * @generated
   */
  String getCurrency();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CUXSegment#getCurrency <em>Currency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Currency</em>' attribute.
   * @see #getCurrency()
   * @generated
   */
  void setCurrency(String value);

} // CUXSegment