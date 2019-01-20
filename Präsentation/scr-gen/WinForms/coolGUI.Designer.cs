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
	partial class coolGUI {
		/// <summary>
		/// Erforderliche Designervariable.
		/// </summary>
		private System.ComponentModel.IContainer components = null;

		/// <summary>
		/// Verwendete Ressourcen bereinigen.
		/// </summary>
		/// <param name="disposing">True, wenn verwaltete Ressourcen gel?scht werden sollen; andernfalls False.</param>
		protected override void Dispose(bool disposing) {
			if (disposing && (components != null)) {
				components.Dispose();
			}
			base.Dispose(disposing);
		}

		#region Vom Windows Form-Designer generierter Code

		/// <summary>
		/// Erforderliche Methode f?r die Designerunterst?tzung.
		/// Der Inhalt der Methode darf nicht mit dem Code-Editor ge?ndert werden.
		/// </summary>
		private void InitializeComponent() {
			this.myButton1 = new System.Windows.Forms.Button();
			this.myButton2 = new System.Windows.Forms.Button();
			this.myLabel1 = new System.Windows.Forms.Label();
			this.myCheckBox = new System.Windows.Forms.CheckBox();
			this.myInput1 = new System.Windows.Forms.TextBox();
			this.myRB1 = new System.Windows.Forms.RadioButton();
			this.myRB2 = new System.Windows.Forms.RadioButton();
			this.myRB3 = new System.Windows.Forms.RadioButton();
			this.SuspendLayout();
			// 
			// myButton1
			// 
			this.myButton1.Name = "myButton1";
			this.myButton1.Location = new System.Drawing.Point(10, 180);
			this.myButton1.AutoSize = true;
			this.myButton1.TabIndex = 0;
			this.myButton1.Text = "Button 1";
			this.Controls.Add(this.myButton1);
			// 
			// myButton2
			// 
			this.myButton2.Name = "myButton2";
			this.myButton2.Location = new System.Drawing.Point(80, 180);
			this.myButton2.AutoSize = true;
			this.myButton2.TabIndex = 1;
			this.myButton2.Text = "Button 2";
			this.Controls.Add(this.myButton2);
			// 
			// myLabel1
			// 
			this.myLabel1.Name = "myLabel1";
			this.myLabel1.Location = new System.Drawing.Point(10, 10);
			this.myLabel1.AutoSize = true;
			this.myLabel1.TabIndex = 2;
			this.myLabel1.Text = "Das ist eine Test GUI";
			this.Controls.Add(this.myLabel1);
			// 
			// myCheckBox
			// 
			this.myCheckBox.Name = "myCheckBox";
			this.myCheckBox.Location = new System.Drawing.Point(10, 50);
			this.myCheckBox.AutoSize = true;
			this.myCheckBox.TabIndex = 3;
			this.myCheckBox.Text = "Check Mich";
			this.Controls.Add(this.myCheckBox);
			// 
			// myInput1
			// 
			this.myInput1.Name = "myInput1";
			this.myInput1.Location = new System.Drawing.Point(10, 80);
			this.myInput1.AutoSize = true;
			this.myInput1.TabIndex = 4;
			this.myInput1.Text = "Schreib was";
			this.Controls.Add(this.myInput1);
			// 
			// myRB1
			// 
			this.myRB1.Name = "myRB1";
			this.myRB1.Location = new System.Drawing.Point(10, 110);
			this.myRB1.AutoSize = true;
			this.myRB1.TabIndex = 5;
			this.myRB1.Text = "1";
			this.Controls.Add(this.myRB1);
			// 
			// myRB2
			// 
			this.myRB2.Name = "myRB2";
			this.myRB2.Location = new System.Drawing.Point(10, 130);
			this.myRB2.AutoSize = true;
			this.myRB2.TabIndex = 6;
			this.myRB2.Text = "2";
			this.Controls.Add(this.myRB2);
			// 
			// myRB3
			// 
			this.myRB3.Name = "myRB3";
			this.myRB3.Location = new System.Drawing.Point(10, 150);
			this.myRB3.AutoSize = true;
			this.myRB3.TabIndex = 7;
			this.myRB3.Text = "3";
			this.Controls.Add(this.myRB3);
			// 
			// coolGUI
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(300, 210);
			this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
			this.Location = new System.Drawing.Point(200, 200);
			this.Name = "coolGUI";
			this.Text = "coolGUI";
			addCallbacks();
			this.ResumeLayout(false);
			this.PerformLayout();
		}

		#endregion

		private System.Windows.Forms.Button myButton1;
		private System.Windows.Forms.Button myButton2;
		private System.Windows.Forms.Label myLabel1;
		private System.Windows.Forms.CheckBox myCheckBox;
		private System.Windows.Forms.TextBox myInput1;
		private System.Windows.Forms.RadioButton myRB1;
		private System.Windows.Forms.RadioButton myRB2;
		private System.Windows.Forms.RadioButton myRB3;
	}
}