package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(200,900);
		Font font = new Font("궁서",1,20);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel a1 = new JLabel();
		a1.setText("K -POP 인기투표");
		a1.setFont(font);
		JLabel a2 = new JLabel();
		a2.setText("IU");
		a2.setFont(font);
		
		JLabel a3 = new JLabel();
		a3.setText("BTS");
		a3.setFont(font);
		
		JLabel a4 = new JLabel();
		a4.setText("NEWJEANS");
		a4.setFont(font);
		
		JLabel a5 = new JLabel();
		JLabel a6 = new JLabel();
		JLabel a7 = new JLabel();
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();

		ImageIcon icon1 = new ImageIcon("밤편지.png");
		ImageIcon icon2 = new ImageIcon("FAKE LOVE.png");
		ImageIcon icon3 = new ImageIcon("Attention.png");
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		
		
		
		f.add(a1);
		f.add(b1);
		f.add(a2);
		f.add(a5);

		f.add(b2);
		f.add(a3);
		f.add(a6);

		f.add(b3);
		f.add(a4);
		f.add(a7);
		
		
		
		
		b1.addActionListener(new ActionListener() {
			int iu = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				iu++;
				a5.setText(iu +"표" );
			}
		});
			
			
				

		
		
		b2.addActionListener(new ActionListener() {
			int bt = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				
					
					bt++;
					a6.setText(bt + "표");
				
				
				}
			});
		
		
		b3.addActionListener(new ActionListener() {
			int i = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				
					
					i++;
					a7.setText(i + "표");
				
			}
		});	
		f.setVisible(true); //이게 있어야 실현됨
	}

}
