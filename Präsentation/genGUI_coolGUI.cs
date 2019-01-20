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
	partial class coolGUI {
		/// <summary>
		/// Erforderliche Designervariable.
		/// </summary>
		private System.ComponentModel.IContainer components = null;

		/// <summary>
		/// Verwendete Ressourcen bereinigen.
		/// </summary>
		/// <param name="disposing">True, wenn verwaltete Ressourcen gelöscht werden sollen; andernfalls False.</param>
		protected override void Dispose(bool disposing) {
			if (disposing && (components != null)) {
				components.Dispose();
			}
			base.Dispose(disposing);
		}

		#region Vom Windows Form-Designer generierter Code

		/// <summary>
		/// Erforderliche Methode für die Designerunterstützung.
		/// Der Inhalt der Methode darf nicht mit dem Code-Editor geändert werden.
		/// </summary>
		private void InitializeComponent() {
			this.myButton1 = new System.Windows.Forms.Button();
			this.myButton2 = new System.Windows.Forms.Button();
			this.myLabel1 = new System.Windows.Forms.TextLabel();
			this.myCheckBox = new System.Windows.Forms.CheckBox();
			this.myInput1 = new System.Windows.Forms.InputField();
			this.myRB1 = new System.Windows.Forms.RadioButton();
			this.myRB2 = new System.Windows.Forms.RadioButton();
			this.myRB3 = new System.Windows.Forms.RadioButton();
			this.SuspendLayout();
			// 
			// myButton1
			// 
			this.myButton1.AutoSize = true;
			this.myButton1.Name = "myButton1";
			this.myButton1.Location = new System.Drawing.Point(10, 180);
			this.myButton1.Size = new System.Drawing.Size(0, 0);
			//this.myButton1.TabIndex = 0; // Running Sequence Number
			this.myButton1.Text = "Button 1";
			this.myButton1.UseVisualStyleBackColor = true;
			this.Controls.Add(this.myButton1);
			// 
			// myButton2
			// 
			this.myButton2.AutoSize = true;
			this.myButton2.Name = "myButton2";
			this.myButton2.Location = new System.Drawing.Point(80, 180);
			this.myButton2.Size = new System.Drawing.Size(0, 0);
			//this.myButton2.TabIndex = 0; // Running Sequence Number
			this.myButton2.Text = "Button 2";
			this.myButton2.UseVisualStyleBackColor = true;
			this.Controls.Add(this.myButton2);
			// 
			// myLabel1
			// 
			this.myLabel1.AutoSize = true;
			this.myLabel1.Name = "myLabel1";
			this.myLabel1.Location = new System.Drawing.Point(10, 10);
			this.myLabel1.Size = new System.Drawing.Size(0, 0);
			//this.myLabel1.TabIndex = 0; // Running Sequence Number
			this.myLabel1.Text = "Das ist eine Test GUI";
			this.myLabel1.UseVisualStyleBackColor = true;
			this.Controls.Add(this.myLabel1);
			// 
			// myCheckBox
			// 
			this.myCheckBox.AutoSize = true;
			this.myCheckBox.Name = "myCheckBox";
			this.myCheckBox.Location = new System.Drawing.Point(10, 50);
			this.myCheckBox.Size = new System.Drawing.Size(0, 0);
			//this.myCheckBox.TabIndex = 0; // Running Sequence Number
			this.myCheckBox.Text = "Check Mich";
			this.myCheckBox.UseVisualStyleBackColor = true;
			this.Controls.Add(this.myCheckBox);
			// 
			// myInput1
			// 
			this.myInput1.AutoSize = true;
			this.myInput1.Name = "myInput1";
			this.myInput1.Location = new System.Drawing.Point(10, 80);
			this.myInput1.Size = new System.Drawing.Size(0, 0);
			//this.myInput1.TabIndex = 0; // Running Sequence Number
			this.myInput1.Text = "Schreib was";
			this.myInput1.UseVisualStyleBackColor = true;
			this.Controls.Add(this.myInput1);
			// 
			// myRB1
			// 
			this.myRB1.AutoSize = true;
			this.myRB1.Name = "myRB1";
			this.myRB1.Location = new System.Drawing.Point(10, 110);
			this.myRB1.Size = new System.Drawing.Size(0, 0);
			//this.myRB1.TabIndex = 0; // Running Sequence Number
			this.myRB1.Text = "1";
			this.myRB1.UseVisualStyleBackColor = true;
			this.Controls.Add(this.myRB1);
			// 
			// myRB2
			// 
			this.myRB2.AutoSize = true;
			this.myRB2.Name = "myRB2";
			this.myRB2.Location = new System.Drawing.Point(10, 130);
			this.myRB2.Size = new System.Drawing.Size(0, 0);
			//this.myRB2.TabIndex = 0; // Running Sequence Number
			this.myRB2.Text = "2";
			this.myRB2.UseVisualStyleBackColor = true;
			this.Controls.Add(this.myRB2);
			// 
			// myRB3
			// 
			this.myRB3.AutoSize = true;
			this.myRB3.Name = "myRB3";
			this.myRB3.Location = new System.Drawing.Point(10, 150);
			this.myRB3.Size = new System.Drawing.Size(0, 0);
			//this.myRB3.TabIndex = 0; // Running Sequence Number
			this.myRB3.Text = "3";
			this.myRB3.UseVisualStyleBackColor = true;
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
			this.ResumeLayout(false);
			this.PerformLayout();
		}

		#endregion

		private System.Windows.Forms.Button myButton1;
		private System.Windows.Forms.Button myButton2;
		private System.Windows.Forms.TextLabel myLabel1;
		private System.Windows.Forms.CheckBox myCheckBox;
		private System.Windows.Forms.InputField myInput1;
		private System.Windows.Forms.RadioButton myRB1;
		private System.Windows.Forms.RadioButton myRB2;
		private System.Windows.Forms.RadioButton myRB3;
	}
}