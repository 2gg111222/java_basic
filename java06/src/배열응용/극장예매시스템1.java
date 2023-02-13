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

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(1000, 800);
		f.getContentPane().setBackground(Color.lightGray);
		//배치해주는 부품 - FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		JButton[] btn = new JButton[200];
		// 반복해서 배열
		// 반복해서 f에 add해주세요.
		Font font = new Font("궁서", 1, 20);  
		Font font2 = new Font("궁서", 1, 20);  

		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);
		
		//예약 여부를 저장하는 배열을 만들어줍시다.!!
		int[] seat = new int[btn.length];//{0,0,0,0,0,0,0,0,0,0,0,0}
		//각 자리게 저장된 값이 0이면 아직 예약안되었음. 예약되면 1로 바꿈!
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i +"");
			btn[i].setFont(font);
			f.add(btn[i]);
			

			
			//버튼에 액션기능 add해보자
			//1) 액션 기능 추가
			//2) 클릭했을 때 어떤 부품이 담당할지 부품 생성
			//3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
					//e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약가능!!
					
					if (seat[no] == 1) {
						
						result.setText("이미 예약된 자리 예매불가");
						result.setBackground(Color.red);
						result.setFont(font2);
						
						
					}else {
						seat[no] = 1;  //예약좌석은 1로 변경
						result.setText(text +"번 예매완료");
						result.setFont(font);
						btn[no].setBackground(Color.blue);
						btn[no].setText("불가");
						btn[no].setEnabled(false);  //못누르게 하는거
					}
				}
			});
		}
		
		
		f.add(result);

		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		
		f.add(total);
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열에 몇개가 1인지 더해줌
				// 영화예매비 1장당 1만원, 결제금액 프린트
				  int count = 0;
				  String text = e.getActionCommand();
				  System.out.println(text);
				  for (int j : seat) {
					  if(j==1) {
					count++;
					  }
				}
				int  sum = 10000 * count;
			JOptionPane.showMessageDialog(f, sum);
			
			}
		});
		
		//맨 끝에 있어야 함.
		f.setVisible(true);
		
		
	}

}
