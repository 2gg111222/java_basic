package 부품응용하기;

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

public class 로그인화면 {

	public static void main(String[] args) {
		// font, flowlayout
		// jframe, imageicon3개, imagelabel
		// idlabel, pwlabel, id입력값, pw입력값
		// 로그인버튼, reset버튼
		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(500, 600);
		f.getContentPane().setBackground(Color.cyan);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", 1, 30);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아  이  디  : ");
		JLabel pw = new JLabel("패 스 워 드 : ");
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("id.png");
		ImageIcon icon3 = new ImageIcon("pw.png");
		top.setIcon(icon1);

		JTextField idText = new JTextField(7);
		JTextField pwText = new JTextField(7);
		idText.setFont(font);
		pwText.setFont(font);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.cyan);
		reset.setBackground(Color.cyan);

		// 버튼 액션기능 더하기
		// 클릭했을 떄 어떤 부품이 처리를 담당할 지 "new로 만들어주세요."
		// 클릭했을 때 "어떻게 처리할지를" 써주세요.
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset 눌렀을 떄 idText, pwText에 공백을 넣어라!
				idText.setText("");
				pwText.setText("");
			}
		});
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// idText,pwText에 getText()
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					//일기장쓰기 부품의 open()기능 쓰자!
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false);
					
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});

		f.add(top);

		f.add(id);
		f.add(idText);

		f.add(pw);
		f.add(pwText);

		f.add(login);
		f.add(reset);

		f.setVisible(true);

	}


	

}