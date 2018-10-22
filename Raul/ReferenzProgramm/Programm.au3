#include <MsgBoxConstants.au3>
#include "genGUI.au3"


Func _Button1Func()
	MsgBox($MB_SYSTEMMODAL, "InputBox", GUICtrlRead($Input1))
EndFunc

Func _RadioFunc($iRadioVal1)
	MsgBox($MB_SYSTEMMODAL, "InputBox", $iRadioVal1)
EndFunc

Func _Checkbox1Func()
	If GUICtrlRead($Checkbox1) = $GUI_CHECKED Then
		MsgBox($MB_SYSTEMMODAL, "InputBox", "Checked")
	Else
		MsgBox($MB_SYSTEMMODAL, "InputBox", "UnChecked")
	EndIf

EndFunc

