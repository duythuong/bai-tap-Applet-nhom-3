package test_applet;

import javax.swing.JApplet;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class bai7 extends JApplet {
	private JTextField textField;
    double n;
	/**
	 * Create the applet.
	 */
	public bai7() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(140, 28, 200, 13);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(119, 51, 221, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("cos");
		btnNewButton.setBounds(95, 141, 56, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "hãy nhập số vào ô", "thông báo", JOptionPane.CANCEL_OPTION);
					}
					else {
				n = Double.parseDouble(textField.getText());
				String q = "cos("+n+")";
				lblNewLabel.setText(q);
				double t = Math.toRadians(n);
				double t1 = Math.cos(t);
				textField.setText(String .valueOf(t1));
				}
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("sin");
		btnNewButton_1.setBounds(175, 141, 56, 21);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("")) {
				JOptionPane.showConfirmDialog(null, "hãy nhập số vào ô", "thông báo", JOptionPane.CANCEL_OPTION);
				}
				else {
				n = Double.parseDouble(textField.getText());
				String q = "sin("+n+")";
				lblNewLabel.setText(q);
				double t = Math.toRadians(n);
				double t1 = Math.cos(t);
				textField.setText(String .valueOf(t1));
				}
			}
		});
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("tan");
		btnNewButton_2.setBounds(251, 141, 56, 21);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "hãy nhập số vào ô", "thông báo", JOptionPane.CANCEL_OPTION);
					}
					else {
				n = Double.parseDouble(textField.getText());
				String q = "tan("+n+")";
				lblNewLabel.setText(q);
				double t = Math.toRadians(n);
				double t1 = Math.tan(t);
				textField.setText(String .valueOf(t1));
					}
			}
		});
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("cot");
		btnNewButton_3.setBounds(339, 141, 56, 21);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "hãy nhập số vào ô", "thông báo", JOptionPane.CANCEL_OPTION);
					}
					else {
				n = Double.parseDouble(textField.getText());
				String q = "cot("+n+")";
				lblNewLabel.setText(q);
				double t = Math.toRadians(n);
				double t1 = Math.cos(t)/Math.sin(t);
				textField.setText(String .valueOf(t1));
				}
			}
		});
		getContentPane().add(btnNewButton_3);
		JButton btnPhngTrnhBt = new JButton("phương trình bật 2");
		btnPhngTrnhBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String t[] = textField.getText().split("[]");
			
//		        if (a == 0) {
//		            if (b == 0) {
//		                System.out.println("Phương trình vô nghiệm!");
//		            } else {
//		                System.out.println("Phương trình có một nghiệm: "
//		                        + "x = " + (-c / b));
//		            }
//		            return;
//		        }
//		        // tính delta
//		        float delta = b*b - 4*a*c;
//		        float x1;
//		        float x2;
//		        // tính nghiệm
//		        if (delta > 0) {
//		            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
//		            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
//		            System.out.println("Phương trình có 2 nghiệm là: "
//		                    + "x1 = " + x1 + " và x2 = " + x2);
//		        } else if (delta == 0) {
//		            x1 = (-b / (2 * a));
//		            System.out.println("Phương trình có nghiệm kép: "
//		                    + "x1 = x2 = " + x1);
//		        } else {
//		            System.out.println("Phương trình vô nghiệm!");
//		        }
			}
		});
		btnPhngTrnhBt.setBounds(95, 194, 212, 21);
		getContentPane().add(btnPhngTrnhBt);

	}

}
