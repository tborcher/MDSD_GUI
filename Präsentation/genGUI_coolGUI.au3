#Region include
;~ general
#include <GUIConstantsEx.au3>
#include <WindowsConstants.au3>

;~ ---spezific---
;~ buttons Checkbox
#include <ButtonConstants.au3>
;~ inputfield
#include <EditConstants.au3>
;~ Label
#include <StaticConstants.au3>
#EndRegion END include

Global $myButton1,$myButton2,$myLabel1,$myCheckBox,$myInput1,$myRB1,$myRB2,$myRB3

_initGUI()

GUISetState(@SW_SHOW)

While 1
	$nMsg = GUIGetMsg()
	Switch $nMsg
		Case $GUI_EVENT_CLOSE
			Exit

		Case $myButton1
			_myButton1Func()
		Case $myButton2
			_myButton2Func()
		Case $myLabel1
			_myLabel1Func()
		Case $myCheckBox
			_myCheckBoxFunc()
		Case $myRB1
			_myRB1Func()
		Case $myRB2
			_myRB2Func()
		Case $myRB3
			_myRB3Func()

	EndSwitch

WEnd



Func _initGUI()
	$coolGUI = GUICreate("Fancy GUI", 300, 210)
	$myButton1 = GUICtrlCreateButton("Button 1", 10, 180)
	$myButton2 = GUICtrlCreateButton("Button 2", 80, 180)
	$myLabel1 = GUICtrlCreateLabel("Das ist eine Test GUI", 10, 10)
	$myCheckBox = GUICtrlCreateCheckbox("Check Mich", 10, 50)
	$myInput1 = GUICtrlCreateInput("Schreib was", 10, 80)
	$myRB1 = GUICtrlCreateRadio("1", 10, 110)
	$myRB2 = GUICtrlCreateRadio("2", 10, 130)
	$myRB3 = GUICtrlCreateRadio("3", 10, 150)
EndFunc
