package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.StyledEditorKit.ItalicAction;

public class 카운터프로그램 {
	static int count;
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.getContentPane().setBackground(Color.black);
		f.setSize(300, 400);
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		
		Font font1 = new Font("궁서", 1 , 20);
		Font font2 = new Font("궁서", 1 , 300);
		
		JButton b1 = new JButton();
		b1.setBackground(Color.white);
		b1.setText("1더하기");
		JButton b2 = new JButton();
		b2.setText("0으로 초기화");
		b2.setBackground(Color.CYAN);
		JButton b3 = new JButton();
		b3.setText("1빼기");
		b3.setBackground(Color.red);
		
		JLabel l1 = new JLabel();
		l1.setFont(font2);
		l1.setText("0");
		l1.setForeground(Color.LIGHT_GRAY);
		
		
		
		b1.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				
				l1.setText(count +"");// "" settext count 숫자 넣기 
			}
		});
		
		b2.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				count = 0;
				l1.setText(count +"");// "" settext count 숫자 넣기 
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			count = count - 1;
			
			l1.setText(count +"");// "" settext count 숫자 넣기 
		}
	});
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		
		f.setVisible(true);
	}

}
