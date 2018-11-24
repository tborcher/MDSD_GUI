/**
 * generated by Xtext 2.15.0
 */
package gui_proj.gUI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gui_proj.gUI.GUIFactory
 * @model kind="package"
 * @generated
 */
public interface GUIPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gUI";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.GUI.gui_proj";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gUI";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GUIPackage eINSTANCE = gui_proj.gUI.impl.GUIPackageImpl.init();

  /**
   * The meta object id for the '{@link gui_proj.gUI.impl.GuiImpl <em>Gui</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gui_proj.gUI.impl.GuiImpl
   * @see gui_proj.gUI.impl.GUIPackageImpl#getGui()
   * @generated
   */
  int GUI = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI__NAME = 0;

  /**
   * The feature id for the '<em><b>Titel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI__TITEL = 1;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI__HEIGHT = 2;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI__WIDTH = 3;

  /**
   * The feature id for the '<em><b>Gui Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI__GUI_OBJECTS = 4;

  /**
   * The number of structural features of the '<em>Gui</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link gui_proj.gUI.impl.GUIElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gui_proj.gUI.impl.GUIElementImpl
   * @see gui_proj.gUI.impl.GUIPackageImpl#getGUIElement()
   * @generated
   */
  int GUI_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gui_proj.gUI.impl.GUIElementDescriptionImpl <em>Element Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gui_proj.gUI.impl.GUIElementDescriptionImpl
   * @see gui_proj.gUI.impl.GUIPackageImpl#getGUIElementDescription()
   * @generated
   */
  int GUI_ELEMENT_DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Callback</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_ELEMENT_DESCRIPTION__CALLBACK = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_ELEMENT_DESCRIPTION__TEXT = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_ELEMENT_DESCRIPTION__LEFT = 2;

  /**
   * The feature id for the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_ELEMENT_DESCRIPTION__TOP = 3;

  /**
   * The feature id for the '<em><b>Heigth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_ELEMENT_DESCRIPTION__HEIGTH = 4;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_ELEMENT_DESCRIPTION__WIDTH = 5;

  /**
   * The number of structural features of the '<em>Element Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_ELEMENT_DESCRIPTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link gui_proj.gUI.impl.TextLabelImpl <em>Text Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gui_proj.gUI.impl.TextLabelImpl
   * @see gui_proj.gUI.impl.GUIPackageImpl#getTextLabel()
   * @generated
   */
  int TEXT_LABEL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LABEL__NAME = GUI_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Text Label Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LABEL__TEXT_LABEL_DESCRIPTION = GUI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LABEL_FEATURE_COUNT = GUI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gui_proj.gUI.impl.InputFieldImpl <em>Input Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gui_proj.gUI.impl.InputFieldImpl
   * @see gui_proj.gUI.impl.GUIPackageImpl#getInputField()
   * @generated
   */
  int INPUT_FIELD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FIELD__NAME = GUI_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Input Field Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FIELD__INPUT_FIELD_DESCRIPTION = GUI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FIELD_FEATURE_COUNT = GUI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gui_proj.gUI.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gui_proj.gUI.impl.ButtonImpl
   * @see gui_proj.gUI.impl.GUIPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = GUI_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Button Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__BUTTON_DESCRIPTION = GUI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = GUI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gui_proj.gUI.impl.RadioButtonImpl <em>Radio Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gui_proj.gUI.impl.RadioButtonImpl
   * @see gui_proj.gUI.impl.GUIPackageImpl#getRadioButton()
   * @generated
   */
  int RADIO_BUTTON = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__NAME = GUI_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Radio Button Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__RADIO_BUTTON_DESCRIPTION = GUI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Radio Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON_FEATURE_COUNT = GUI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gui_proj.gUI.impl.CheckBoxImpl <em>Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gui_proj.gUI.impl.CheckBoxImpl
   * @see gui_proj.gUI.impl.GUIPackageImpl#getCheckBox()
   * @generated
   */
  int CHECK_BOX = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__NAME = GUI_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Check Box Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__CHECK_BOX_DESCRIPTION = GUI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_FEATURE_COUNT = GUI_ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link gui_proj.gUI.Gui <em>Gui</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gui</em>'.
   * @see gui_proj.gUI.Gui
   * @generated
   */
  EClass getGui();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.Gui#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gui_proj.gUI.Gui#getName()
   * @see #getGui()
   * @generated
   */
  EAttribute getGui_Name();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.Gui#getTitel <em>Titel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Titel</em>'.
   * @see gui_proj.gUI.Gui#getTitel()
   * @see #getGui()
   * @generated
   */
  EAttribute getGui_Titel();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.Gui#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see gui_proj.gUI.Gui#getHeight()
   * @see #getGui()
   * @generated
   */
  EAttribute getGui_Height();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.Gui#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see gui_proj.gUI.Gui#getWidth()
   * @see #getGui()
   * @generated
   */
  EAttribute getGui_Width();

  /**
   * Returns the meta object for the containment reference list '{@link gui_proj.gUI.Gui#getGuiObjects <em>Gui Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Gui Objects</em>'.
   * @see gui_proj.gUI.Gui#getGuiObjects()
   * @see #getGui()
   * @generated
   */
  EReference getGui_GuiObjects();

  /**
   * Returns the meta object for class '{@link gui_proj.gUI.GUIElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see gui_proj.gUI.GUIElement
   * @generated
   */
  EClass getGUIElement();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.GUIElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gui_proj.gUI.GUIElement#getName()
   * @see #getGUIElement()
   * @generated
   */
  EAttribute getGUIElement_Name();

  /**
   * Returns the meta object for class '{@link gui_proj.gUI.GUIElementDescription <em>Element Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Description</em>'.
   * @see gui_proj.gUI.GUIElementDescription
   * @generated
   */
  EClass getGUIElementDescription();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.GUIElementDescription#getCallback <em>Callback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Callback</em>'.
   * @see gui_proj.gUI.GUIElementDescription#getCallback()
   * @see #getGUIElementDescription()
   * @generated
   */
  EAttribute getGUIElementDescription_Callback();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.GUIElementDescription#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see gui_proj.gUI.GUIElementDescription#getText()
   * @see #getGUIElementDescription()
   * @generated
   */
  EAttribute getGUIElementDescription_Text();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.GUIElementDescription#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see gui_proj.gUI.GUIElementDescription#getLeft()
   * @see #getGUIElementDescription()
   * @generated
   */
  EAttribute getGUIElementDescription_Left();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.GUIElementDescription#getTop <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Top</em>'.
   * @see gui_proj.gUI.GUIElementDescription#getTop()
   * @see #getGUIElementDescription()
   * @generated
   */
  EAttribute getGUIElementDescription_Top();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.GUIElementDescription#getHeigth <em>Heigth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Heigth</em>'.
   * @see gui_proj.gUI.GUIElementDescription#getHeigth()
   * @see #getGUIElementDescription()
   * @generated
   */
  EAttribute getGUIElementDescription_Heigth();

  /**
   * Returns the meta object for the attribute '{@link gui_proj.gUI.GUIElementDescription#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see gui_proj.gUI.GUIElementDescription#getWidth()
   * @see #getGUIElementDescription()
   * @generated
   */
  EAttribute getGUIElementDescription_Width();

  /**
   * Returns the meta object for class '{@link gui_proj.gUI.TextLabel <em>Text Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Label</em>'.
   * @see gui_proj.gUI.TextLabel
   * @generated
   */
  EClass getTextLabel();

  /**
   * Returns the meta object for the containment reference '{@link gui_proj.gUI.TextLabel#getTextLabelDescription <em>Text Label Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Label Description</em>'.
   * @see gui_proj.gUI.TextLabel#getTextLabelDescription()
   * @see #getTextLabel()
   * @generated
   */
  EReference getTextLabel_TextLabelDescription();

  /**
   * Returns the meta object for class '{@link gui_proj.gUI.InputField <em>Input Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Field</em>'.
   * @see gui_proj.gUI.InputField
   * @generated
   */
  EClass getInputField();

  /**
   * Returns the meta object for the containment reference '{@link gui_proj.gUI.InputField#getInputFieldDescription <em>Input Field Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Field Description</em>'.
   * @see gui_proj.gUI.InputField#getInputFieldDescription()
   * @see #getInputField()
   * @generated
   */
  EReference getInputField_InputFieldDescription();

  /**
   * Returns the meta object for class '{@link gui_proj.gUI.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see gui_proj.gUI.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the containment reference '{@link gui_proj.gUI.Button#getButtonDescription <em>Button Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Button Description</em>'.
   * @see gui_proj.gUI.Button#getButtonDescription()
   * @see #getButton()
   * @generated
   */
  EReference getButton_ButtonDescription();

  /**
   * Returns the meta object for class '{@link gui_proj.gUI.RadioButton <em>Radio Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radio Button</em>'.
   * @see gui_proj.gUI.RadioButton
   * @generated
   */
  EClass getRadioButton();

  /**
   * Returns the meta object for the containment reference '{@link gui_proj.gUI.RadioButton#getRadioButtonDescription <em>Radio Button Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Radio Button Description</em>'.
   * @see gui_proj.gUI.RadioButton#getRadioButtonDescription()
   * @see #getRadioButton()
   * @generated
   */
  EReference getRadioButton_RadioButtonDescription();

  /**
   * Returns the meta object for class '{@link gui_proj.gUI.CheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box</em>'.
   * @see gui_proj.gUI.CheckBox
   * @generated
   */
  EClass getCheckBox();

  /**
   * Returns the meta object for the containment reference '{@link gui_proj.gUI.CheckBox#getCheckBoxDescription <em>Check Box Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Check Box Description</em>'.
   * @see gui_proj.gUI.CheckBox#getCheckBoxDescription()
   * @see #getCheckBox()
   * @generated
   */
  EReference getCheckBox_CheckBoxDescription();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GUIFactory getGUIFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link gui_proj.gUI.impl.GuiImpl <em>Gui</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gui_proj.gUI.impl.GuiImpl
     * @see gui_proj.gUI.impl.GUIPackageImpl#getGui()
     * @generated
     */
    EClass GUI = eINSTANCE.getGui();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI__NAME = eINSTANCE.getGui_Name();

    /**
     * The meta object literal for the '<em><b>Titel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI__TITEL = eINSTANCE.getGui_Titel();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI__HEIGHT = eINSTANCE.getGui_Height();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI__WIDTH = eINSTANCE.getGui_Width();

    /**
     * The meta object literal for the '<em><b>Gui Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUI__GUI_OBJECTS = eINSTANCE.getGui_GuiObjects();

    /**
     * The meta object literal for the '{@link gui_proj.gUI.impl.GUIElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gui_proj.gUI.impl.GUIElementImpl
     * @see gui_proj.gUI.impl.GUIPackageImpl#getGUIElement()
     * @generated
     */
    EClass GUI_ELEMENT = eINSTANCE.getGUIElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_ELEMENT__NAME = eINSTANCE.getGUIElement_Name();

    /**
     * The meta object literal for the '{@link gui_proj.gUI.impl.GUIElementDescriptionImpl <em>Element Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gui_proj.gUI.impl.GUIElementDescriptionImpl
     * @see gui_proj.gUI.impl.GUIPackageImpl#getGUIElementDescription()
     * @generated
     */
    EClass GUI_ELEMENT_DESCRIPTION = eINSTANCE.getGUIElementDescription();

    /**
     * The meta object literal for the '<em><b>Callback</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_ELEMENT_DESCRIPTION__CALLBACK = eINSTANCE.getGUIElementDescription_Callback();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_ELEMENT_DESCRIPTION__TEXT = eINSTANCE.getGUIElementDescription_Text();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_ELEMENT_DESCRIPTION__LEFT = eINSTANCE.getGUIElementDescription_Left();

    /**
     * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_ELEMENT_DESCRIPTION__TOP = eINSTANCE.getGUIElementDescription_Top();

    /**
     * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_ELEMENT_DESCRIPTION__HEIGTH = eINSTANCE.getGUIElementDescription_Heigth();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_ELEMENT_DESCRIPTION__WIDTH = eINSTANCE.getGUIElementDescription_Width();

    /**
     * The meta object literal for the '{@link gui_proj.gUI.impl.TextLabelImpl <em>Text Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gui_proj.gUI.impl.TextLabelImpl
     * @see gui_proj.gUI.impl.GUIPackageImpl#getTextLabel()
     * @generated
     */
    EClass TEXT_LABEL = eINSTANCE.getTextLabel();

    /**
     * The meta object literal for the '<em><b>Text Label Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_LABEL__TEXT_LABEL_DESCRIPTION = eINSTANCE.getTextLabel_TextLabelDescription();

    /**
     * The meta object literal for the '{@link gui_proj.gUI.impl.InputFieldImpl <em>Input Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gui_proj.gUI.impl.InputFieldImpl
     * @see gui_proj.gUI.impl.GUIPackageImpl#getInputField()
     * @generated
     */
    EClass INPUT_FIELD = eINSTANCE.getInputField();

    /**
     * The meta object literal for the '<em><b>Input Field Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_FIELD__INPUT_FIELD_DESCRIPTION = eINSTANCE.getInputField_InputFieldDescription();

    /**
     * The meta object literal for the '{@link gui_proj.gUI.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gui_proj.gUI.impl.ButtonImpl
     * @see gui_proj.gUI.impl.GUIPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Button Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__BUTTON_DESCRIPTION = eINSTANCE.getButton_ButtonDescription();

    /**
     * The meta object literal for the '{@link gui_proj.gUI.impl.RadioButtonImpl <em>Radio Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gui_proj.gUI.impl.RadioButtonImpl
     * @see gui_proj.gUI.impl.GUIPackageImpl#getRadioButton()
     * @generated
     */
    EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

    /**
     * The meta object literal for the '<em><b>Radio Button Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIO_BUTTON__RADIO_BUTTON_DESCRIPTION = eINSTANCE.getRadioButton_RadioButtonDescription();

    /**
     * The meta object literal for the '{@link gui_proj.gUI.impl.CheckBoxImpl <em>Check Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gui_proj.gUI.impl.CheckBoxImpl
     * @see gui_proj.gUI.impl.GUIPackageImpl#getCheckBox()
     * @generated
     */
    EClass CHECK_BOX = eINSTANCE.getCheckBox();

    /**
     * The meta object literal for the '<em><b>Check Box Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_BOX__CHECK_BOX_DESCRIPTION = eINSTANCE.getCheckBox_CheckBoxDescription();

  }

} //GUIPackage
