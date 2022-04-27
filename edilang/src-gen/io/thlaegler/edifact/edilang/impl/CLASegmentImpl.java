/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.CLASegment;
import io.thlaegler.edifact.edilang.ClauseName;
import io.thlaegler.edifact.edilang.EdilangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLA Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CLASegmentImpl#getClauseCodeQualifier <em>Clause Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CLASegmentImpl#getClauseName <em>Clause Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASegmentImpl extends AbstractEdiSegmentImpl implements CLASegment
{
  /**
   * The default value of the '{@link #getClauseCodeQualifier() <em>Clause Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClauseCodeQualifier()
   * @generated
   * @ordered
   */
  protected static final String CLAUSE_CODE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClauseCodeQualifier() <em>Clause Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClauseCodeQualifier()
   * @generated
   * @ordered
   */
  protected String clauseCodeQualifier = CLAUSE_CODE_QUALIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getClauseName() <em>Clause Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClauseName()
   * @generated
   * @ordered
   */
  protected ClauseName clauseName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CLASegmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EdilangPackage.eINSTANCE.getCLASegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getClauseCodeQualifier()
  {
    return clauseCodeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClauseCodeQualifier(String newClauseCodeQualifier)
  {
    String oldClauseCodeQualifier = clauseCodeQualifier;
    clauseCodeQualifier = newClauseCodeQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CLA_SEGMENT__CLAUSE_CODE_QUALIFIER, oldClauseCodeQualifier, clauseCodeQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClauseName getClauseName()
  {
    return clauseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClauseName(ClauseName newClauseName, NotificationChain msgs)
  {
    ClauseName oldClauseName = clauseName;
    clauseName = newClauseName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.CLA_SEGMENT__CLAUSE_NAME, oldClauseName, newClauseName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClauseName(ClauseName newClauseName)
  {
    if (newClauseName != clauseName)
    {
      NotificationChain msgs = null;
      if (clauseName != null)
        msgs = ((InternalEObject)clauseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CLA_SEGMENT__CLAUSE_NAME, null, msgs);
      if (newClauseName != null)
        msgs = ((InternalEObject)newClauseName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CLA_SEGMENT__CLAUSE_NAME, null, msgs);
      msgs = basicSetClauseName(newClauseName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CLA_SEGMENT__CLAUSE_NAME, newClauseName, newClauseName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EdilangPackage.CLA_SEGMENT__CLAUSE_NAME:
        return basicSetClauseName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EdilangPackage.CLA_SEGMENT__CLAUSE_CODE_QUALIFIER:
        return getClauseCodeQualifier();
      case EdilangPackage.CLA_SEGMENT__CLAUSE_NAME:
        return getClauseName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdilangPackage.CLA_SEGMENT__CLAUSE_CODE_QUALIFIER:
        setClauseCodeQualifier((String)newValue);
        return;
      case EdilangPackage.CLA_SEGMENT__CLAUSE_NAME:
        setClauseName((ClauseName)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EdilangPackage.CLA_SEGMENT__CLAUSE_CODE_QUALIFIER:
        setClauseCodeQualifier(CLAUSE_CODE_QUALIFIER_EDEFAULT);
        return;
      case EdilangPackage.CLA_SEGMENT__CLAUSE_NAME:
        setClauseName((ClauseName)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EdilangPackage.CLA_SEGMENT__CLAUSE_CODE_QUALIFIER:
        return CLAUSE_CODE_QUALIFIER_EDEFAULT == null ? clauseCodeQualifier != null : !CLAUSE_CODE_QUALIFIER_EDEFAULT.equals(clauseCodeQualifier);
      case EdilangPackage.CLA_SEGMENT__CLAUSE_NAME:
        return clauseName != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (clauseCodeQualifier: ");
    result.append(clauseCodeQualifier);
    result.append(')');
    return result.toString();
  }

} //CLASegmentImpl
