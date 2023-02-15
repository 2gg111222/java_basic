package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutFocusTraversalPolicy;

public class 키오스크 {
	static int count;
	static int count1;
	static int count2;
	static int count3;
	
	final static int price1 = 3000;
	final static int price2 = 4000;
	final static int price3 = 5000;
	
	
	public static void main(String[] args) {
		// 4개 버튼 라벨 3개
		계산기 cal = new 계산기();
		FlowLayout flow = new FlowLayout();
		
		JFrame f = new JFrame();
		f.setTitle("키오스크");
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.green);
		f.setSize(500, 500);
		Font font = new Font("궁서체",1,30);
		JButton btn1 = new JButton();
		btn1.setText("짬뽕");
		JButton btn2 = new JButton();
		btn2.setText("우동");
		JButton btn3 = new JButton();
		btn3.setText("짜장");
		
		JLabel text1 = new JLabel();
		text1.setText("개수");
		
		JLabel text12 = new JLabel();
		text12.setBackground(Color.lightGray);
		text12.setText("0");
		
		JLabel text2 = new JLabel();
		text2.setBackground(Color.lightGray);
		text2.setText("0");
		
		JLabel p = new JLabel();
		ImageIcon icon = new ImageIcon("home.png");
		p.setIcon(icon);
		
		JLabel text3 = new JLabel();
		text3.setText("결제금액 : " );
		
		JLabel text4 = new JLabel();
		text4.setText("전체 결제금액 : " );
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				count++;
				count1++;
				ImageIcon icon1 = new ImageIcon("006.png");
				p.setIcon(icon1);
				text2.setBackground(Color.lightGray);
				text12.setText(" 전체 주문 "+count + "개");
				text2.setText(" 단품 "+count1 + "");
				text3.setText("결제금액 : " +count1 * price1 +"원");
				text4.setText("전체 결제금액" + (count1 * price1 + count2 * price2 + count3 * price3) + "원");
				f.setTitle( "짬뽕 : " + count1 +" 우동 : " + count2 +" 짜장면 : " + count3 );
			}
		});
		
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				count2++;
				ImageIcon icon2 = new ImageIcon("007.png");
				
				p.setIcon(icon2);
				text2.setBackground(Color.lightGray);
				text12.setText(" 전체 주문 "+count + "개");
				text2.setText(" 단품 " + count2 + "");
				text3.setText("결제금액 : " +count2 * price2 +"원");
				text4.setText("전체 결제금액" + (count1 * price1 + count2 * price2 + count3 * price3) + "원");
				f.setTitle( "짬뽕 : " + count1 +" 우동 : " + count2 +" 짜장면 : " + count3 );
			}
		});
		

		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			count++;
			count3++;
			ImageIcon icon3 = new ImageIcon("008.png");
			
			p.setIcon(icon3);
			text2.setBackground(Color.lightGray);
			text12.setText(" 전체 주문 "+ count + "개");
			text2.setText(" 단품 " + count3 + "");
			text3.setText("결제금액 : " +count3 * price3 +"원");
			text4.setText("전체 결제금액" + (count1 * price1 + count2 * price2 + count3 * price3) + "원");
			f.setTitle( "짬뽕 : " + count1 +" 우동 : " + count2 +" 짜장면 : " + count3 );	
			}	
		});
		
		
		
		
		
		
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(text1);
		f.add(text12);
		f.add(text2);
		f.add(p);
		f.add(text3);
		f.add(text4);
		
		
		
		f.setVisible(true);
	}
	

}
