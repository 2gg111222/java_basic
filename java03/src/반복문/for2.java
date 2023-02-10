package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class for2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.getContentPane().setBackground(Color.blue);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("별10개");
		JButton b2 = new JButton();
		b2.setText("커피*5");
		JButton b3 = new JButton();
		b3.setText("커피*우유 3개");
		JButton b4 = new JButton();
		b4.setText("1:짱!");
		
		Font font = new Font("궁서", 1, 25);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
	
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		
		
		
		f.setVisible(true);
	}

}
