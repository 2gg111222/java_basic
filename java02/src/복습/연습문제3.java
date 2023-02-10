package 복습;

import javax.swing.JOptionPane;

public class 연습문제3 {

	public static void main(String[] args) {
		// 1.   두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
		
		String a = JOptionPane.showInputDialog("수를 입력하시오");
		String b = JOptionPane.showInputDialog("다른 수를 입력하시오");
		String c = JOptionPane.showInputDialog("사칙연산자 하나를 입력하시오");
		
		double a1 = Double.parseDouble(a); 
		double b1 = Double.parseDouble(b);
		char c1 = c.charAt(0);
				switch (c1) {
				case '+':
					double result = a1 + b1;
					System.out.println(result);
					break;
				case '-':
					double result2 = a1 - b1;
					System.out.println(result2);
					break;
				case '*':
					double result3 = a1 * b1;
					System.out.println(result3);
					break;
				case '/':
					double result4 = a1 / b1;
					System.out.println(result4);
					break;
				default:
					System.out.println("사칙연산자를 입력하세요!");
					break;
				}
		
		//2. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
			
			String d = JOptionPane.showInputDialog("정수를 입력하시오");
			String e = JOptionPane.showInputDialog("다른 정수를 입력하시오");
			
				int d1 = Integer.parseInt(d);
				int e1 = Integer.parseInt(e);
				double rs = (double)d1 / e1 ;
				System.out.println(String.format("%.2f", rs));
				//
				
	}

}
