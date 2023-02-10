package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 콘솔연습문제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요!");
		String id = sc.next();
		
		System.out.println("비밀번호를 입력해주세요!");
		String pw = sc.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			JOptionPane.showMessageDialog(null,"로그인 성공");
			
		}else {
			JOptionPane.showMessageDialog(null,"로그인 실패");
			
		}
		
	
	
	System.out.println("사과 구매 갯수, 사과 한개당 가격입력");
	int a = sc.nextInt();
	int aP = sc.nextInt();
	
	int ar = a * aP;
	
	System.out.println("딸기 구매 갯수, 딸기 한개당 가격입력");
	int s = sc.nextInt();
	int sP = sc.nextInt();
	
	int sr = s * sP;
	
	int asr = ar + sr;
	
	System.out.println("사과 구매 가격은 " +ar+"원 입니다.");
	System.out.println("딸기 구매 가격은 " +sr+"원 입니다.");
	System.out.println("전체 구매 가격은 " +asr+"원 입니다.");
	
	}

}
