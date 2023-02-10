package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명2 {

	public static void main(String[] args) {
	
		
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표해봅시다!!");
			if (data.equals("a")) {
			 a= a+1;
			}else if (data.equals("b")) {
			 b= b+1;
			}else if (data.equals("c")) {
			 c= c+1;
			}
		}			
			System.out.println("아이유 좋아하는 사람" + a);
			System.out.println("bts 좋아하는 사람" + b);
			System.out.println("뉴진스 좋아하는 사람" + c);

	}
}