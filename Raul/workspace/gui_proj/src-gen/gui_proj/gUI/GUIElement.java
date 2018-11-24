/**
 * generated by Xtext 2.15.0
 */
package gui_proj.gUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gui_proj.gUI.GUIElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see gui_proj.gUI.GUIPackage#getGUIElement()
 * @model
 * @generated
 */
public interface GUIElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see gui_proj.gUI.GUIPackage#getGUIElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link gui_proj.gUI.GUIElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // GUIElement
