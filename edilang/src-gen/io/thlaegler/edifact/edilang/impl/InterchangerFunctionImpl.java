/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.InterchangerFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interchanger Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.InterchangerFunctionImpl#getInterchange <em>Interchange</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.InterchangerFunctionImpl#getInterchange2 <em>Interchange2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterchangerFunctionImpl extends AbstractEdiFunctionImpl implements InterchangerFunction
{
  /**
   * The default value of the '{@link #getInterchange() <em>Interchange</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchange()
   * @generated
   * @ordered
   */
  protected static final String INTERCHANGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterchange() <em>Interchange</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchange()
   * @generated
   * @ordered
   */
  protected String interchange = INTERCHANGE_EDEFAULT;

  /**
   * The default value of the '{@link #getInterchange2() <em>Interchange2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchange2()
   * @generated
   * @ordered
   */
  protected static final String INTERCHANGE2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterchange2() <em>Interchange2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterchange2()
   * @generated
   * @ordered
   */
  protected String interchange2 = INTERCHANGE2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterchangerFunctionImpl()
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
    return EdilangPackage.Literals.INTERCHANGER_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInterchange()
  {
    return interchange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInterchange(String newInterchange)
  {
    String oldInterchange = interchange;
    interchange = newInterchange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE, oldInterchange, interchange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInterchange2()
  {
    return interchange2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInterchange2(String newInterchange2)
  {
    String oldInterchange2 = interchange2;
    interchange2 = newInterchange2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE2, oldInterchange2, interchange2));
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
      case EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE:
        return getInterchange();
      case EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE2:
        return getInterchange2();
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
      case EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE:
        setInterchange((String)newValue);
        return;
      case EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE2:
        setInterchange2((String)newValue);
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
      case EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE:
        setInterchange(INTERCHANGE_EDEFAULT);
        return;
      case EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE2:
        setInterchange2(INTERCHANGE2_EDEFAULT);
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
      case EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE:
        return INTERCHANGE_EDEFAULT == null ? interchange != null : !INTERCHANGE_EDEFAULT.equals(interchange);
      case EdilangPackage.INTERCHANGER_FUNCTION__INTERCHANGE2:
        return INTERCHANGE2_EDEFAULT == null ? interchange2 != null : !INTERCHANGE2_EDEFAULT.equals(interchange2);
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
    result.append(" (interchange: ");
    result.append(interchange);
    result.append(", interchange2: ");
    result.append(interchange2);
    result.append(')');
    return result.toString();
  }

} //InterchangerFunctionImpl