package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 네이버주식정보시스템 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 400);
		f.getContentPane().setBackground(Color.cyan);
		f.setLayout(new FlowLayout());
		Font font = new Font("궁서", Font.BOLD, 30);

		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("LG에너지솔루션");
		JButton b3 = new JButton("SK하이닉스");
		JButton b4 = new JButton("크롤링 시작");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리 내용
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("005930");

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리 내용
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("373220");

			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리 내용
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("000660");

			}
		});
	
		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		b4.setBackground(Color.green);

		JLabel label = new JLabel("CODE");
		label.setFont(font);
		label.setBackground(Color.green);
		JTextField text = new JTextField(7);
		text.setFont(font);
		text.setForeground(Color.white);
		text.setBackground(Color.black);

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리 내용
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver(text.getText());

			}
		});

		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);

		f.setVisible(true);
	}
}
