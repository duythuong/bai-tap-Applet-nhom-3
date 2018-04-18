package test_applet;

import javax.swing.JApplet;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class bai3 extends JApplet {
	public bai3() {
	}
	private JTextField t1;
	private JTextField t2;
    int a,b;
    float d,c;
    int t;
    float y;
    int f = 0;
    private JTextField t3;
	public void init() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNhpSTh = new JLabel("Nh\u1EADp a");
		lblNhpSTh.setFont(new Font("SansSerif", Font.PLAIN, 20));
		getContentPane().add(lblNhpSTh);
		
		t1 = new JTextField();
		getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNhpSTh_1 = new JLabel("Nh\u1EADp b");
		lblNhpSTh_1.setFont(new Font("SansSerif", Font.PLAIN, 20));
		getContentPane().add(lblNhpSTh_1);
		
		t2 = new JTextField();
		getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton nhan = new JButton("nh\u00E2n");
		nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Integer.parseInt(t1.getText());
				b = Integer.parseInt(t2.getText());
				t = a * b;
				f = 3;
			}
		});
		
		JLabel lblKtQu = new JLabel("k\u1EBFt qu\u1EA3");
		lblKtQu.setFont(new Font("SansSerif", Font.PLAIN, 20));
		getContentPane().add(lblKtQu);
		
		t3 = new JTextField();
		getContentPane().add(t3);
		t3.setColumns(10);
		getContentPane().add(nhan);
		
		JButton chia = new JButton("chia");
		chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				d = Float.parseFloat(t1.getText());
			    c = Float.parseFloat(t2.getText());
				y = d / c;
				f = 4;
			}
		});
		getContentPane().add(chia);
		
		JButton cong = new JButton("c\u1ED9ng");
		cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Integer.parseInt(t1.getText());
				b = Integer.parseInt(t2.getText());
				t = a + b;
				f = 1;
			}
		});
		getContentPane().add(cong);
		
		JButton tru = new JButton("tr\u1EEB");
		tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Integer.parseInt(t1.getText());
				b = Integer.parseInt(t2.getText());
				t = a - b;
				f = 2;
			}
		});
		getContentPane().add(tru);
		
		JButton button = new JButton("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(f) {
				case 1:t3.setText(String.valueOf(t)); break;
				case 2:t3.setText(String.valueOf(t)); break;
				case 3:t3.setText(String.valueOf(t)); break;
				case 4:t3.setText(String.valueOf(y)); break;
				}
			}
		});
		getContentPane().add(button);

	}

}
