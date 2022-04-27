/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLA Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.CLASegment#getClauseCodeQualifier <em>Clause Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CLASegment#getClauseName <em>Clause Name</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getCLASegment()
 * @model
 * @generated
 */
public interface CLASegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Clause Code Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause Code Qualifier</em>' attribute.
   * @see #setClauseCodeQualifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCLASegment_ClauseCodeQualifier()
   * @model
   * @generated
   */
  String getClauseCodeQualifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CLASegment#getClauseCodeQualifier <em>Clause Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause Code Qualifier</em>' attribute.
   * @see #getClauseCodeQualifier()
   * @generated
   */
  void setClauseCodeQualifier(String value);

  /**
   * Returns the value of the '<em><b>Clause Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause Name</em>' containment reference.
   * @see #setClauseName(ClauseName)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCLASegment_ClauseName()
   * @model containment="true"
   * @generated
   */
  ClauseName getClauseName();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CLASegment#getClauseName <em>Clause Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause Name</em>' containment reference.
   * @see #getClauseName()
   * @generated
   */
  void setClauseName(ClauseName value);

} // CLASegment
