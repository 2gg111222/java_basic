package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문정보시스템2 {
	static int count; //0으로 초기화, 전역변수!
	static int count1; //0으로 초기화, 전역변수!
	static int count2; //0으로 초기화, 전역변수!
	static int count3; //0으로 초기화, 전역변수!
	final static int price1 = 3500;
	final static int price2 = 3000;
	final static int price3 = 4000;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음식주문 프로그램" );
		f.setSize(680, 500);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("짬뽕");
		JButton b2 = new JButton("우동");
		JButton b3 = new JButton("짜장");
		Font font = new Font("궁서", Font.ITALIC, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b1.setBackground(Color.pink);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.cyan);

		JLabel textLabel = new JLabel("전체 개수: ");
		textLabel.setFont(font);
		JLabel countLabel1 = new JLabel("0개");
		countLabel1.setFont(font);
		JLabel textLabe2 = new JLabel("단품 개수: ");
		JLabel countLabel2 = new JLabel("0개");
		countLabel2.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("home.png");
		imgLabel.setIcon(icon);
		JLabel result1 = new JLabel("전체결제금액 0원");
		result1.setFont(font);
		JLabel result2 = new JLabel("결제금액 0원");
		result2.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("006.png");
				imgLabel.setIcon(icon);
				count++;
				count1++;
				countLabel1.setText(count + "개");
				countLabel2.setText(count1 + "개");
				result1.setText("전체 결제금액" + (count1 * price1 + count2 * price2 + count3 * price3) + "원");
				result2.setText("결제금액" + (count1 * price1) + "원");
				f.setTitle("짬뽕 : " + count1 +" 우동 : " + count2 +" 짜장면 : " + count3 );
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("007.png");
				imgLabel.setIcon(icon);
				count++;
				count2++;
				countLabel1.setText(count + "개");
				countLabel2.setText(count2 + "개");
				result1.setText("전체 결제금액" + (count1 * price1 + count2 * price2 + count3 * price3) + "원");
				result2.setText("결제금액" + (count2 * price2) + "원");
				f.setTitle("짬뽕 : " + count1 +" 우동 : " + count2 +" 짜장면 : " + count3 );
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("008.png");
				imgLabel.setIcon(icon);
				count++;
				count3++;
				countLabel1.setText(count + "개");
				countLabel2.setText(count3 + "개");
				result1.setText("전체 결제금액" + (count1 * price1 +count2 * price2 + count3 * price3) + "원");
				result2.setText("결제금액" + (count3 * price3) + "원");
				f.setTitle("짬뽕 : " + count1 +" 우동 : " + count2 +" 짜장면 : " + count3 );
			}	
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel1);
		f.add(textLabe2);
		f.add(countLabel2);
		f.add(imgLabel);
		f.add(result1);
		f.add(result2);

		f.setVisible(true);
	}
}