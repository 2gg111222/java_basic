package 반복문;

public class for1 {

	public static void main(String[] args) {
		// 3번 반복
		for (int i = 0; i < 3; i++) {
			//for 지역{}안에서만 i변수는 사용 가능
			//지역변수(local)
			// i = 0;, i<3(true), 처리, i++
			System.out.println(i + " 내가 반복1");
		}
		
		for (int i = 0; i < 100; i++) {
			// i = 0;, i< 100(true), 처리, i++
			System.out.println(i + "내가 반복2");
			
		}
		
		for (int i = 0; i < 10; i++) {
			// i = 0;, i< 100(true), 처리, i++
			System.out.println("내가 반복2" + (i+1)+"번째 실행중" );
			
		}
	}

}
