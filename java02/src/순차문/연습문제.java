package 순차문;

//부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 연습문제 {	public static void main(String[] args) {
		//기본 순차문 == 입력--> 처리 --> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것!! 사용해보자.!
		//다이얼로그 곳에서 입력한 값은 컴퓨터는 무조건 String으로 인식!!
		String data1 = JOptionPane.showInputDialog("키를  입력-1");
		String data2 = JOptionPane.showInputDialog("몸무게를 입력-2");
		
		//처리 -> 숫자 더하기 연산
		//      String으로 int로 변경해주어야 함.
		
		double data11 = Double.parseDouble(data1);
		double data22 = Double.parseDouble(data2);
		
		double result = data11 / ( data22 * data22 ); //결과는 String
		
		double a = 18.5;
		double b = 23;
		double c = 25;
		double d = 30;
		
		if (result < a) {
			System.out.println("저체중입니다.");
		}else if (result < b) {
			System.out.println("정상입니다.");	
		}else if (result < c) {
			System.out.println("과체중입니다.");
		}else if (result < d) {
			System.out.println("비만입니다.");
		}else {
			System.out.println("고도비만입니다.");
		}
		
		
		
	}
}
