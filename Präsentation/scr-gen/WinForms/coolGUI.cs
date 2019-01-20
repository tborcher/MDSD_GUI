using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ns_coolGUI {
	public partial class coolGUI : Form {
		public coolGUI() {
			InitializeComponent();
		}
		
		public void addCallbacks() {
			this.myButton1.Click += new System.EventHandler(this.myButton1_Click);
			this.myButton2.Click += new System.EventHandler(this.myButton2_Click);
			this.myCheckBox.CheckedChanged += new System.EventHandler(this.myCheckBox_CheckedChanged);
			this.myRB1.CheckedChanged += new System.EventHandler(this.myRB1_CheckedChanged);
			this.myRB2.CheckedChanged += new System.EventHandler(this.myRB2_CheckedChanged);
			this.myRB3.CheckedChanged += new System.EventHandler(this.myRB3_CheckedChanged);
		}
		
		private void myButton1_Click(object sender, EventArgs e) {
			MessageBox.Show("Hello World von Button 1", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
		}
		private void myButton2_Click(object sender, EventArgs e) {
			MessageBox.Show("Hello World von Button 2", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
		}
		private void myCheckBox_CheckedChanged(object sender, EventArgs e) {
			var chk = (CheckBox) sender;
			if (chk.Checked)
				MessageBox.Show("Checked", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
			else
				MessageBox.Show("Unchecked", "InputBox", MessageBoxButtons.OK, MessageBoxIcon.Information);
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