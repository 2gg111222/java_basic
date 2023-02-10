package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

	public class 부품만들기2 {	
	
		public static void main(String[] args) {
		
		JFrame f = new JFrame();	
		f.setSize(300, 500);	
		
		
		ImageIcon icon = new ImageIcon("016.png");
		
		JLabel a = new JLabel();
		a.setIcon(icon);
		
		JLabel a1 = new JLabel();
		a1.setText("아이디 입력");
		JLabel a2 = new JLabel();
		a2.setText("패스워드 입력");
		JLabel a3 = new JLabel();
		a3.setText("이름 입력");
		JLabel a4 = new JLabel();
		a4.setText("전화번호 입력");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton();
		
		
		Font name = new Font("궁서", 1 , 20);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(a);
		f.add(a1);
		f.add(t1);
		f.add(a2);
		f.add(t2);
		f.add(a3);
		f.add(t3);
		f.add(a4);
		f.add(t4);
		
		}}