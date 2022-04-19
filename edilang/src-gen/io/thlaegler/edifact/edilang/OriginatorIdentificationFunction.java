/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Originator Identification Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.OriginatorIdentificationFunction#getTravelAgentId <em>Travel Agent Id</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.OriginatorIdentificationFunction#getInHouseId1 <em>In House Id1</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.OriginatorIdentificationFunction#getInHouseId2 <em>In House Id2</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getOriginatorIdentificationFunction()
 * @model
 * @generated
 */
public interface OriginatorIdentificationFunction extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Travel Agent Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Travel Agent Id</em>' attribute.
   * @see #setTravelAgentId(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getOriginatorIdentificationFunction_TravelAgentId()
   * @model
   * @generated
   */
  String getTravelAgentId();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.OriginatorIdentificationFunction#getTravelAgentId <em>Travel Agent Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Travel Agent Id</em>' attribute.
   * @see #getTravelAgentId()
   * @generated
   */
  void setTravelAgentId(String value);

  /**
   * Returns the value of the '<em><b>In House Id1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In House Id1</em>' attribute.
   * @see #setInHouseId1(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getOriginatorIdentificationFunction_InHouseId1()
   * @model
   * @generated
   */
  String getInHouseId1();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.OriginatorIdentificationFunction#getInHouseId1 <em>In House Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In House Id1</em>' attribute.
   * @see #getInHouseId1()
   * @generated
   */
  void setInHouseId1(String value);

  /**
   * Returns the value of the '<em><b>In House Id2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In House Id2</em>' attribute.
   * @see #setInHouseId2(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getOriginatorIdentificationFunction_InHouseId2()
   * @model
   * @generated
   */
  String getInHouseId2();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.OriginatorIdentificationFunction#getInHouseId2 <em>In House Id2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In House Id2</em>' attribute.
   * @see #getInHouseId2()
   * @generated
   */
  void setInHouseId2(String value);

} // OriginatorIdentificationFunction