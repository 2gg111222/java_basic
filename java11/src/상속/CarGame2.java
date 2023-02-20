package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CarGame2 extends JFrame{
	
	public static void main(String[] args) {
		CarGame2 f = new CarGame2();
	}
	
	public CarGame2(){
		setTitle("말");
		setSize(600,500);
		
		MyThread2 car1 = new MyThread2("01.jpg", 500, 0);
		MyThread2 car2 = new MyThread2("02.jpg", 500, 200);
		MyThread2 car3 = new MyThread2("03.jpg", 500, 400);
		
		car1.start();
		car2.start();
		car3.start();

		setVisible(true);
	}
	public class MyThread2 extends Thread{
		int x, y; 
		JLabel label;
		
		public MyThread2(String file, int x, int y) {
			
			this.x = x;
			this.y = y;
			label = new JLabel();
			ImageIcon icon = new ImageIcon(file);
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
			
		}
	
		@Override
		public void run() {
			
			Random r = new Random();
			for (int i = 0; i < 30; i++) {
				int move = r.nextInt(50);
				x = x - move; 
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


}
	
	

