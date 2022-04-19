/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.DateTimePeriod#getDateTimePeriodFunctionCodeQualifier <em>Date Time Period Function Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.DateTimePeriod#getDateTimePeriodValue <em>Date Time Period Value</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.DateTimePeriod#getDateTimePeriodFormatCode <em>Date Time Period Format Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getDateTimePeriod()
 * @model
 * @generated
 */
public interface DateTimePeriod extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Date Time Period Function Code Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Time Period Function Code Qualifier</em>' attribute.
   * @see #setDateTimePeriodFunctionCodeQualifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getDateTimePeriod_DateTimePeriodFunctionCodeQualifier()
   * @model
   * @generated
   */
  String getDateTimePeriodFunctionCodeQualifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.DateTimePeriod#getDateTimePeriodFunctionCodeQualifier <em>Date Time Period Function Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Time Period Function Code Qualifier</em>' attribute.
   * @see #getDateTimePeriodFunctionCodeQualifier()
   * @generated
   */
  void setDateTimePeriodFunctionCodeQualifier(String value);

  /**
   * Returns the value of the '<em><b>Date Time Period Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Time Period Value</em>' attribute.
   * @see #setDateTimePeriodValue(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getDateTimePeriod_DateTimePeriodValue()
   * @model
   * @generated
   */
  String getDateTimePeriodValue();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.DateTimePeriod#getDateTimePeriodValue <em>Date Time Period Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Time Period Value</em>' attribute.
   * @see #getDateTimePeriodValue()
   * @generated
   */
  void setDateTimePeriodValue(String value);

  /**
   * Returns the value of the '<em><b>Date Time Period Format Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Time Period Format Code</em>' attribute.
   * @see #setDateTimePeriodFormatCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getDateTimePeriod_DateTimePeriodFormatCode()
   * @model
   * @generated
   */
  String getDateTimePeriodFormatCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.DateTimePeriod#getDateTimePeriodFormatCode <em>Date Time Period Format Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Time Period Format Code</em>' attribute.
   * @see #getDateTimePeriodFormatCode()
   * @generated
   */
  void setDateTimePeriodFormatCode(String value);

} // DateTimePeriod
