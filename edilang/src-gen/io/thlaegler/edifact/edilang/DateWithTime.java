/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date With Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.DateWithTime#getDate <em>Date</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.DateWithTime#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getDateWithTime()
 * @model
 * @generated
 */
public interface DateWithTime extends EObject
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getDateWithTime_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.DateWithTime#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getDateWithTime_Time()
   * @model
   * @generated
   */
  String getTime();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.DateWithTime#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(String value);

} // DateWithTime
