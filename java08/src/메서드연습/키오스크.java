package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutFocusTraversalPolicy;

public class 키오스크 {

	public static void main(String[] args) {
		// 4개 버튼 라벨 3개
		String[] food = {"짬뽕", "우동", "짜장"};
		
		FlowLayout flow = new FlowLayout();
		
		
		JFrame f = new JFrame();
		f.setLayout(flow);
		f.setSize(500, 400);
		LayoutFocusTraversalPolicy name = new LayoutFocusTraversalPolicy();
		ImageIcon[] icon1 = {"006.png", "007.png", "008.png"};
		
		JLabel l2 = new JLabel();
		l2.setIcon(icon);;
		
		JButton btn1 = new JButton();
		btn1.setText("짬뽕");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				count++;
				
				
			}
		});
		
		
		JButton btn2 = new JButton();
		btn2.setText("우동");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				count++;
				
			}
		});
		
		JButton btn3 = new JButton();
		btn3.setText("짜장");

		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				count++;
				
			}
		});
		
		JLabel l1 = new JLabel();
		l1.setText("개수:");
		
		JButton btn4 = new JButton();
		btn4.setText("개수:");
		btn4.setBackground(Color.yellow);
		
		
		
		JLabel l3 = new JLabel();
		l1.setText("개수:");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(l1);
		f.add(btn4);
		
		f.setVisible(true);
	}
	

}
