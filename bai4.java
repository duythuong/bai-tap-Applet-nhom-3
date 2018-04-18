package test_applet;

import javax.swing.JApplet;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai4 extends JApplet {
	public JTextField textField;
	int t=0;
	public bai4() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(textField.getText());
				t++;
				if(a>=1 && a<=9) {
				if(t<4){
				if(a==7) {
					JOptionPane.showConfirmDialog(null, "congratulations", "thông báo", JOptionPane.CANCEL_OPTION);
				}
				if(a>7) {
					JOptionPane.showConfirmDialog(null, "bạn nhập số vào lớn hơn số cần tìm", "thông báo", JOptionPane.CANCEL_OPTION);
				}
				if(a<7) {
					JOptionPane.showConfirmDialog(null, "bạn nhập số vào nhỏ hơn số cần tìm", "thông báo", JOptionPane.CANCEL_OPTION);
				}
				}
				else {
					textField.setEditable(false);
					JOptionPane.showConfirmDialog(null, "bạn bạn đã nhập quá 3 lần", "thông báo", JOptionPane.CANCEL_OPTION);
				}
				}
			}
		});
		getContentPane().add(btnNewButton);
	}
}
