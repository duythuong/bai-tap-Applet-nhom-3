package test_applet;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class bai1 extends JApplet {

	int n;
public void init() {
	String input;
	input = JOptionPane.showInputDialog("nhap N");
	n = Integer.parseInt(input);
}
public void paint(Graphics e) {

	for(int i=1;i<=n;i++) {
		e.drawString(""+i+"", i*15,100);
	}
	
}

}
