/**
 * generated by Xtext 2.26.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.TAXSegment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAX Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TAXSegmentImpl#getNum <em>Num</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TAXSegmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TAXSegmentImpl#getTodo1 <em>Todo1</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TAXSegmentImpl#getTodo2 <em>Todo2</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TAXSegmentImpl#getTodo3 <em>Todo3</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TAXSegmentImpl#getTodo4 <em>Todo4</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TAXSegmentImpl#getTodo5 <em>Todo5</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.TAXSegmentImpl#getTodo6 <em>Todo6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAXSegmentImpl extends AbstractEdiSegmentImpl implements TAXSegment
{
  /**
   * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected static final String NUM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected String num = NUM_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getTodo1() <em>Todo1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo1()
   * @generated
   * @ordered
   */
  protected static final String TODO1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTodo1() <em>Todo1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo1()
   * @generated
   * @ordered
   */
  protected String todo1 = TODO1_EDEFAULT;

  /**
   * The default value of the '{@link #getTodo2() <em>Todo2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo2()
   * @generated
   * @ordered
   */
  protected static final String TODO2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTodo2() <em>Todo2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo2()
   * @generated
   * @ordered
   */
  protected String todo2 = TODO2_EDEFAULT;

  /**
   * The default value of the '{@link #getTodo3() <em>Todo3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo3()
   * @generated
   * @ordered
   */
  protected static final String TODO3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTodo3() <em>Todo3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo3()
   * @generated
   * @ordered
   */
  protected String todo3 = TODO3_EDEFAULT;

  /**
   * The default value of the '{@link #getTodo4() <em>Todo4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo4()
   * @generated
   * @ordered
   */
  protected static final String TODO4_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTodo4() <em>Todo4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo4()
   * @generated
   * @ordered
   */
  protected String todo4 = TODO4_EDEFAULT;

  /**
   * The default value of the '{@link #getTodo5() <em>Todo5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo5()
   * @generated
   * @ordered
   */
  protected static final String TODO5_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTodo5() <em>Todo5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo5()
   * @generated
   * @ordered
   */
  protected String todo5 = TODO5_EDEFAULT;

  /**
   * The default value of the '{@link #getTodo6() <em>Todo6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo6()
   * @generated
   * @ordered
   */
  protected static final String TODO6_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTodo6() <em>Todo6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTodo6()
   * @generated
   * @ordered
   */
  protected String todo6 = TODO6_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TAXSegmentImpl()
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
    return EdilangPackage.Literals.TAX_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNum(String newNum)
  {
    String oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_SEGMENT__NUM, oldNum, num));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_SEGMENT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTodo1()
  {
    return todo1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTodo1(String newTodo1)
  {
    String oldTodo1 = todo1;
    todo1 = newTodo1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_SEGMENT__TODO1, oldTodo1, todo1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTodo2()
  {
    return todo2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTodo2(String newTodo2)
  {
    String oldTodo2 = todo2;
    todo2 = newTodo2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_SEGMENT__TODO2, oldTodo2, todo2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTodo3()
  {
    return todo3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTodo3(String newTodo3)
  {
    String oldTodo3 = todo3;
    todo3 = newTodo3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_SEGMENT__TODO3, oldTodo3, todo3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTodo4()
  {
    return todo4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTodo4(String newTodo4)
  {
    String oldTodo4 = todo4;
    todo4 = newTodo4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_SEGMENT__TODO4, oldTodo4, todo4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTodo5()
  {
    return todo5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTodo5(String newTodo5)
  {
    String oldTodo5 = todo5;
    todo5 = newTodo5;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_SEGMENT__TODO5, oldTodo5, todo5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTodo6()
  {
    return todo6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTodo6(String newTodo6)
  {
    String oldTodo6 = todo6;
    todo6 = newTodo6;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.TAX_SEGMENT__TODO6, oldTodo6, todo6));
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
      case EdilangPackage.TAX_SEGMENT__NUM:
        return getNum();
      case EdilangPackage.TAX_SEGMENT__TYPE:
        return getType();
      case EdilangPackage.TAX_SEGMENT__TODO1:
        return getTodo1();
      case EdilangPackage.TAX_SEGMENT__TODO2:
        return getTodo2();
      case EdilangPackage.TAX_SEGMENT__TODO3:
        return getTodo3();
      case EdilangPackage.TAX_SEGMENT__TODO4:
        return getTodo4();
      case EdilangPackage.TAX_SEGMENT__TODO5:
        return getTodo5();
      case EdilangPackage.TAX_SEGMENT__TODO6:
        return getTodo6();
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
      case EdilangPackage.TAX_SEGMENT__NUM:
        setNum((String)newValue);
        return;
      case EdilangPackage.TAX_SEGMENT__TYPE:
        setType((String)newValue);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO1:
        setTodo1((String)newValue);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO2:
        setTodo2((String)newValue);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO3:
        setTodo3((String)newValue);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO4:
        setTodo4((String)newValue);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO5:
        setTodo5((String)newValue);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO6:
        setTodo6((String)newValue);
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
      case EdilangPackage.TAX_SEGMENT__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case EdilangPackage.TAX_SEGMENT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO1:
        setTodo1(TODO1_EDEFAULT);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO2:
        setTodo2(TODO2_EDEFAULT);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO3:
        setTodo3(TODO3_EDEFAULT);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO4:
        setTodo4(TODO4_EDEFAULT);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO5:
        setTodo5(TODO5_EDEFAULT);
        return;
      case EdilangPackage.TAX_SEGMENT__TODO6:
        setTodo6(TODO6_EDEFAULT);
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
      case EdilangPackage.TAX_SEGMENT__NUM:
        return NUM_EDEFAULT == null ? num != null : !NUM_EDEFAULT.equals(num);
      case EdilangPackage.TAX_SEGMENT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case EdilangPackage.TAX_SEGMENT__TODO1:
        return TODO1_EDEFAULT == null ? todo1 != null : !TODO1_EDEFAULT.equals(todo1);
      case EdilangPackage.TAX_SEGMENT__TODO2:
        return TODO2_EDEFAULT == null ? todo2 != null : !TODO2_EDEFAULT.equals(todo2);
      case EdilangPackage.TAX_SEGMENT__TODO3:
        return TODO3_EDEFAULT == null ? todo3 != null : !TODO3_EDEFAULT.equals(todo3);
      case EdilangPackage.TAX_SEGMENT__TODO4:
        return TODO4_EDEFAULT == null ? todo4 != null : !TODO4_EDEFAULT.equals(todo4);
      case EdilangPackage.TAX_SEGMENT__TODO5:
        return TODO5_EDEFAULT == null ? todo5 != null : !TODO5_EDEFAULT.equals(todo5);
      case EdilangPackage.TAX_SEGMENT__TODO6:
        return TODO6_EDEFAULT == null ? todo6 != null : !TODO6_EDEFAULT.equals(todo6);
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
    result.append(" (num: ");
    result.append(num);
    result.append(", type: ");
    result.append(type);
    result.append(", todo1: ");
    result.append(todo1);
    result.append(", todo2: ");
    result.append(todo2);
    result.append(", todo3: ");
    result.append(todo3);
    result.append(", todo4: ");
    result.append(todo4);
    result.append(", todo5: ");
    result.append(todo5);
    result.append(", todo6: ");
    result.append(todo6);
    result.append(')');
    return result.toString();
  }

} //TAXSegmentImpl
