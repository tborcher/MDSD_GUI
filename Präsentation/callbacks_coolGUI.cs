using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace coolGUI {
    public partial class coolGUI : Form {
        public coolGUI() {
            InitializeComponent();
        }
        
        public void addCallbacks(Form 1) {
        	// this.NAME.click += new System.EventHandler(...);
			this.myButton1.click += new System.EventHandler(...)
			this.myButton2.click += new System.EventHandler(...)
			this.myLabel1.click += new System.EventHandler(...)
			this.myCheckBox.click += new System.EventHandler(...)
			this.myInput1.click += new System.EventHandler(...)
			this.myRB1.click += new System.EventHandler(...)
			this.myRB2.click += new System.EventHandler(...)
			this.myRB3.click += new System.EventHandler(...)
        }
		
private void myCheckBox_CheckedChanged(object sender, EventArgs e) {
    var chk = (CheckBox) sender;
    if (chk.Checked)
        MessageBox.Show("Checked", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
    else
        MessageBox.Show("Unchecked", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
}
private void myInput1_Click(object sender, EventArgs e) {
    MessageBox.Show("Hello World", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
}
private void myRB1_CheckedChanged(object sender, EventArgs e) {
    var rad = (RadioButton) sender;
    if (!rad.Checked) return;
    MessageBox.Show(rad.Text, "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
}
private void myRB2_CheckedChanged(object sender, EventArgs e) {
    var rad = (RadioButton) sender;
    if (!rad.Checked) return;
    MessageBox.Show(rad.Text, "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
}
private void myRB3_CheckedChanged(object sender, EventArgs e) {
    var rad = (RadioButton) sender;
    if (!rad.Checked) return;
    MessageBox.Show(rad.Text, "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
}
    }
}