package 배열응용;


import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;


public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(2000, 1000);
		f.setLayout(null);
		
		f.getContentPane().setBackground(Color.blue);
				
		JButton[] b = new JButton[500]; 
		Random r = new Random();
		//colors[r.nextInt(colors.length)] //0~5
		Color[] colors = { Color.red, Color.yellow, Color.orange, Color.white, Color.gray, Color.green, };   
		
		for (int i = 0; i < b.length; i++) {
			 
			b[i] = new JButton("버튼"+ i);
			//b[i].setBackground(Color. yellow);
			 
			 int x = r.nextInt(1500);
			 int y = r.nextInt(1000);
			
			 b[i].setBounds(x, y, 100, 60);
			
			 b[i].setBackground(colors[r.nextInt(colors.length)]);
			 f.add(b[i]);
		
		}
		
		
		f.setVisible(true);
	}

}
