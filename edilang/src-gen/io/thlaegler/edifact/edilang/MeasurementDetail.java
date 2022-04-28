/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.MeasurementDetail#getMeasuredAttributeCode <em>Measured Attribute Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.MeasurementDetail#getMeasurementSignificanceCode <em>Measurement Significance Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.MeasurementDetail#getNonDiscreteMeasurementNameCode <em>Non Discrete Measurement Name Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.MeasurementDetail#getNonDiscreteMeasurementName <em>Non Discrete Measurement Name</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getMeasurementDetail()
 * @model
 * @generated
 */
public interface MeasurementDetail extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Measured Attribute Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measured Attribute Code</em>' attribute.
   * @see #setMeasuredAttributeCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getMeasurementDetail_MeasuredAttributeCode()
   * @model
   * @generated
   */
  String getMeasuredAttributeCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.MeasurementDetail#getMeasuredAttributeCode <em>Measured Attribute Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measured Attribute Code</em>' attribute.
   * @see #getMeasuredAttributeCode()
   * @generated
   */
  void setMeasuredAttributeCode(String value);

  /**
   * Returns the value of the '<em><b>Measurement Significance Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurement Significance Code</em>' attribute.
   * @see #setMeasurementSignificanceCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getMeasurementDetail_MeasurementSignificanceCode()
   * @model
   * @generated
   */
  String getMeasurementSignificanceCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.MeasurementDetail#getMeasurementSignificanceCode <em>Measurement Significance Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measurement Significance Code</em>' attribute.
   * @see #getMeasurementSignificanceCode()
   * @generated
   */
  void setMeasurementSignificanceCode(String value);

  /**
   * Returns the value of the '<em><b>Non Discrete Measurement Name Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Non Discrete Measurement Name Code</em>' attribute.
   * @see #setNonDiscreteMeasurementNameCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getMeasurementDetail_NonDiscreteMeasurementNameCode()
   * @model
   * @generated
   */
  String getNonDiscreteMeasurementNameCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.MeasurementDetail#getNonDiscreteMeasurementNameCode <em>Non Discrete Measurement Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Non Discrete Measurement Name Code</em>' attribute.
   * @see #getNonDiscreteMeasurementNameCode()
   * @generated
   */
  void setNonDiscreteMeasurementNameCode(String value);

  /**
   * Returns the value of the '<em><b>Non Discrete Measurement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Non Discrete Measurement Name</em>' attribute.
   * @see #setNonDiscreteMeasurementName(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getMeasurementDetail_NonDiscreteMeasurementName()
   * @model
   * @generated
   */
  String getNonDiscreteMeasurementName();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.MeasurementDetail#getNonDiscreteMeasurementName <em>Non Discrete Measurement Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Non Discrete Measurement Name</em>' attribute.
   * @see #getNonDiscreteMeasurementName()
   * @generated
   */
  void setNonDiscreteMeasurementName(String value);

} // MeasurementDetail
