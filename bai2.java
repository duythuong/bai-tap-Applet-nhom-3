package test_applet;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class bai2 extends JApplet {
	int n;
public void init() {
	String t ;
	t = JOptionPane.showInputDialog("nhap so N ");
	n = Integer.parseInt(t);
}
public void paint(Graphics e) {
	String t="";
	for(int i = 1 ;i<=n;i++) {
		t = t + "*";
		e.drawString(t, 100, i*15);
	}
}

}
