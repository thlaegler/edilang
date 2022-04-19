/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.LocationFunction#getLocationId <em>Location Id</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.LocationFunction#getLocationName <em>Location Name</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getLocationFunction()
 * @model
 * @generated
 */
public interface LocationFunction extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Location Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location Id</em>' attribute.
   * @see #setLocationId(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getLocationFunction_LocationId()
   * @model
   * @generated
   */
  String getLocationId();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.LocationFunction#getLocationId <em>Location Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location Id</em>' attribute.
   * @see #getLocationId()
   * @generated
   */
  void setLocationId(String value);

  /**
   * Returns the value of the '<em><b>Location Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location Name</em>' attribute.
   * @see #setLocationName(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getLocationFunction_LocationName()
   * @model
   * @generated
   */
  String getLocationName();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.LocationFunction#getLocationName <em>Location Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location Name</em>' attribute.
   * @see #getLocationName()
   * @generated
   */
  void setLocationName(String value);

} // LocationFunction
