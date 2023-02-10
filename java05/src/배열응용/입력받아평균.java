package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 저장공간에 넣고 싶을 때 
		//1. 배열을 만들어주세요
		int[] jumsu = new int[5];
		int sum = 0;
		
		//배열에 값을 넣을 때는 index가 필요
		// jumsu[0] = 점수 0의 인덱스?
		
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("값을 입력하시오");
			jumsu[i] = Integer.parseInt(data);
		}
		//1. 전체 합계 구해서, 평균구해보시오.
		//평균 = 합계 / 전체 갯수
		for (int x : jumsu) {
			System.out.println(x + "");
			sum = sum +x; //sum += x;
			
		}
		System.out.println("전체합계 " + sum);
		double result = (double)sum / jumsu.length;
		System.out.println(result);
		//2. 300이상 되는 숫자만 찾아서, 합계를 구해보세요.
		//3.심화문제, 300이상 되는 위치인 index를 프린트
		//--> 해당 인덱스의 값이 300이상인지 조건체크 --> i를 프린트
		//==>3
		
		int sum1 = 0;
		
		for (int j = 0; j < jumsu.length; j++) {
			if (jumsu[j] >= 300) {
				sum1 = sum1 + jumsu[j];
				System.out.println("300이상인 값의 주소 " + j );
				
			}
			
		}
		
		System.out.println("300이상인 숫자의 합" + sum1);
		
	}
	

}
