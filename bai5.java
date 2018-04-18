package test_applet;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
	
public class bai5 extends JApplet {
	public bai5() {
	}
	JButton t1;
	JButton t2;
	JButton t3;
	Panel p,p1,p2,p3;
	int w[][]= new int[100][100];
	int w1[][]= new int[100][100];
	int w2[][]= new int[100][100];
	JTextField t[][]= new JTextField[100][100];
	JTextField a[][]= new JTextField[100][100];
	JLabel y [][]= new JLabel[100][100];
    JLabel s;
    private JButton btnKetQua;
    private JButton btnMaTranChuyen;
     public void init() {
    	 p = new Panel();
    	 p1 = new Panel();
    	 p.setLayout(new GridLayout(6,6));		
 		p1.setLayout(new GridLayout(3,1));
 		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				y[i][j] = new JLabel(""+i+""+""+j+"");
 				t[i][j] = new JTextField();
 				p.add(y[i][j]);
 				p.add(t[i][j]);
 			}
 		}
 		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				y[i][j] = new JLabel(""+i+""+""+j+"");
 				a[i][j] = new JTextField();
 				p.add(y[i][j]);
 				p.add(a[i][j]);
 			}
 		}
 		t1 = new JButton("cong");
 		t1.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				cong();
 			}
 		});
 		t2 = new JButton("tru");
 		t2.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				tru();
 			}
 		});
 		t3 = new JButton("nhan");
 		t3.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				nhan();
 			}
 		});
 		p1.add(t1);
 		p1.add(t2);
 		p1.add(t3);
 		getContentPane().add(p,"North");
 		getContentPane().add(p1,"South");
 		getContentPane().add(p1,"South");
 		
 		btnKetQua = new JButton("ket qua");
 		btnKetQua.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				for(int i=0;i<3;i++) {
 		 			for(int j=0;j<3;j++) {
 		 				System.out.println(i+" "+j+": "+""+w2[i][j]+"");
 		 			}
 		 		}
 			}
 		});
 		
 		btnMaTranChuyen = new JButton("ma tran chuyen vi");
 		btnMaTranChuyen.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				w2[0][0]=w2[0][0];
 				w2[0][1]=w2[1][0];
 				w2[0][2]=w2[2][0];
 				w2[1][0]=w2[0][1];
 				w2[1][1]=w2[1][1];
 				w2[1][2]=w2[2][1];
 				w2[2][0]=w2[0][2];
 				w2[2][1]=w2[1][2];
 				w2[2][2]=w2[2][2];
 			}
 		});
 		p1.add(btnMaTranChuyen);
 		p1.add(btnKetQua);
     }
	private void tru() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				w[i][j]=Integer.parseInt(t[i][j].getText());
 			}
 		}
 		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				w1[i][j]=Integer.parseInt(a[i][j].getText());
 			}
 		}
 		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				w2[i][j]=w[i][j]-w1[i][j];
 			}
 		}
 		
	}
	private void nhan() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				w[i][j]=Integer.parseInt(t[i][j].getText());
 			}
 		}
 		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				w1[i][j]=Integer.parseInt(a[i][j].getText());
 			}
 		}
 		w2[0][0]=w[0][0]*w1[0][0]+w[1][0]*w1[0][1]+w[2][0]*w1[0][2];
 		
 		w2[0][1]=w[0][0]*w1[1][0]+w[1][0]*w1[1][1]+w[2][0]*w1[1][2];
 		
 		w2[0][2]=w[0][0]*w1[2][0]+w[1][0]*w1[2][1]+w[2][0]*w1[2][2];
 		
        w2[1][0]=w[0][1]*w1[0][0]+w[1][1]*w1[0][1]+w[2][1]*w1[0][2];
 		
 		w2[1][1]=w[0][1]*w1[1][0]+w[1][1]*w1[1][1]+w[2][1]*w1[1][2];
 		
 		w2[1][2]=w[0][1]*w1[2][0]+w[1][1]*w1[2][1]+w[2][1]*w1[2][2];
 		
        w2[2][0]=w[0][2]*w1[0][0]+w[1][2]*w1[0][1]+w[2][2]*w1[0][2];
 		
 		w2[2][1]=w[0][2]*w1[1][0]+w[1][2]*w1[1][1]+w[2][2]*w1[1][2];
 		
 		w2[2][2]=w[0][2]*w1[2][0]+w[1][2]*w1[2][1]+w[2][2]*w1[2][2];
 		
	}
	private void cong() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				w[i][j]=Integer.parseInt(t[i][j].getText());
 			}
 		}
 		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				w1[i][j]=Integer.parseInt(a[i][j].getText());
 			}
 		}
 		for(int i=0;i<3;i++) {
 			for(int j=0;j<3;j++) {
 				w2[i][j]=w[i][j]+w1[i][j];
 			}
 		}
	}
}
