/**
 * generated by Xtext 2.15.0
 */
package gui_proj.gUI.impl;

import gui_proj.gUI.GUIElementDescription;
import gui_proj.gUI.GUIPackage;
import gui_proj.gUI.InputField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gui_proj.gUI.impl.InputFieldImpl#getInputFieldDescription <em>Input Field Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputFieldImpl extends GUIElementImpl implements InputField
{
  /**
   * The cached value of the '{@link #getInputFieldDescription() <em>Input Field Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputFieldDescription()
   * @generated
   * @ordered
   */
  protected GUIElementDescription inputFieldDescription;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputFieldImpl()
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
    return GUIPackage.Literals.INPUT_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GUIElementDescription getInputFieldDescription()
  {
    return inputFieldDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputFieldDescription(GUIElementDescription newInputFieldDescription, NotificationChain msgs)
  {
    GUIElementDescription oldInputFieldDescription = inputFieldDescription;
    inputFieldDescription = newInputFieldDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GUIPackage.INPUT_FIELD__INPUT_FIELD_DESCRIPTION, oldInputFieldDescription, newInputFieldDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputFieldDescription(GUIElementDescription newInputFieldDescription)
  {
    if (newInputFieldDescription != inputFieldDescription)
    {
      NotificationChain msgs = null;
      if (inputFieldDescription != null)
        msgs = ((InternalEObject)inputFieldDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GUIPackage.INPUT_FIELD__INPUT_FIELD_DESCRIPTION, null, msgs);
      if (newInputFieldDescription != null)
        msgs = ((InternalEObject)newInputFieldDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GUIPackage.INPUT_FIELD__INPUT_FIELD_DESCRIPTION, null, msgs);
      msgs = basicSetInputFieldDescription(newInputFieldDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GUIPackage.INPUT_FIELD__INPUT_FIELD_DESCRIPTION, newInputFieldDescription, newInputFieldDescription));
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
      case GUIPackage.INPUT_FIELD__INPUT_FIELD_DESCRIPTION:
        return basicSetInputFieldDescription(null, msgs);
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
      case GUIPackage.INPUT_FIELD__INPUT_FIELD_DESCRIPTION:
        return getInputFieldDescription();
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
      case GUIPackage.INPUT_FIELD__INPUT_FIELD_DESCRIPTION:
        setInputFieldDescription((GUIElementDescription)newValue);
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
      case GUIPackage.INPUT_FIELD__INPUT_FIELD_DESCRIPTION:
        setInputFieldDescription((GUIElementDescription)null);
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
      case GUIPackage.INPUT_FIELD__INPUT_FIELD_DESCRIPTION:
        return inputFieldDescription != null;
    }
    return super.eIsSet(featureID);
  }

} //InputFieldImpl