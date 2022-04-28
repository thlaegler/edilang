/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADI Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.ADISegment#getTodo <em>Todo</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getADISegment()
 * @model
 * @generated
 */
public interface ADISegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Todo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Todo</em>' attribute.
   * @see #setTodo(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getADISegment_Todo()
   * @model
   * @generated
   */
  String getTodo();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ADISegment#getTodo <em>Todo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Todo</em>' attribute.
   * @see #getTodo()
   * @generated
   */
  void setTodo(String value);

} // ADISegment
