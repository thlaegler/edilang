/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.ARRSegment;
import io.thlaegler.edifact.edilang.EdilangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARR Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ARRSegmentImpl#getTodo <em>Todo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARRSegmentImpl extends AbstractEdiSegmentImpl implements ARRSegment
{
  /**
   * The default value of the '{@link #getTodo() <em>Todo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo()
   * @generated
   * @ordered
   */
  protected static final String TODO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTodo() <em>Todo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo()
   * @generated
   * @ordered
   */
  protected String todo = TODO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ARRSegmentImpl()
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
    return EdilangPackage.eINSTANCE.getARRSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTodo()
  {
    return todo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTodo(String newTodo)
  {
    String oldTodo = todo;
    todo = newTodo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.ARR_SEGMENT__TODO, oldTodo, todo));
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
      case EdilangPackage.ARR_SEGMENT__TODO:
        return getTodo();
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
      case EdilangPackage.ARR_SEGMENT__TODO:
        setTodo((String)newValue);
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
      case EdilangPackage.ARR_SEGMENT__TODO:
        setTodo(TODO_EDEFAULT);
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
      case EdilangPackage.ARR_SEGMENT__TODO:
        return TODO_EDEFAULT == null ? todo != null : !TODO_EDEFAULT.equals(todo);
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
    result.append(" (todo: ");
    result.append(todo);
    result.append(')');
    return result.toString();
  }

} //ARRSegmentImpl
