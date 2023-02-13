package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템2 {

	public static void main(String[] args) {
		// 극장 예매판 - 화면보여준는 형식 -  좌석 200 라벨 2 좌석 예매완료  버튼 클릭시 어떻게 변화는지 버튼 따로 라벨따로
		 
		
		JFrame f = new JFrame("극장예매시스템/t");
		FlowLayout flow = new FlowLayout();
		JButton[] b = new JButton[200];
		Font font = new Font("궁서", 1 , 20);
		f.setSize(1000, 800);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.black);

		JLabel l = new JLabel("예매 좌석 현황");
		f.add(l);

		JLabel l2 = new JLabel("결과 보이는 곳");
		
		l.setForeground(Color. green);
		l2.setForeground(Color. yellow);
		l.setFont(font);
		
		int seat[] = new int[b.length];
		
		for (int i = 0; i < b.length; i++) {
		
		b[i] = new JButton(i + "");
		b[i].setFont(font);
		f.add(b[i]);	
		f.add(l2);
		b[i].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = e.getActionCommand();
				System.out.println(text);
				int no = Integer.parseInt(text);
				
				if (seat[no] == 1) {
					l2.setText("불가.");
					l2.setBackground(Color.white);
					l2.setFont(font);
				}else {
					seat[no] = 1;
					l2.setText("예약되었습니다.");
					l2.setBackground(Color.white);
					b[no].setEnabled(false);
				}
				
				
			}
		});
		
		}
		f.add(l2);

		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);

		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					} 
				}
				JOptionPane.showMessageDialog(f, (count * 10000) + "원 결제하시면 됩니다.");
				
			}
		});
		
		
		
		
		
		f.setVisible(true);
		
		
	}

}
