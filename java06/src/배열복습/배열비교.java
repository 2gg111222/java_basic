package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		//입력: 많은 양의 저장공간(배열, 2개)
		//배열 하나당 990개의 저장공간 필요
		// ==> 실제 생성된 저장공간개수(990+1+1) *2
		//		랜덤으로 데이터를 입력(Random)
		// 		반복문으로 배열 위치(인덱스)를 옮기면서 데이터를 넣자.
		// 		
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
//		System.out.println(답안지.length);
//		System.out.println(내답안.length);
//		System.out.println(답안지);
//		System.out.println(내답안);
		
		Random r = new Random(42); // 
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] = r.nextInt(4) + 1;
			내답안[i] = r.nextInt(4) + 1;
			
			//답안지[i] = r.nextInt(i) + 1(1을 최저값으로 하기 위해서 1 더하기); //최저값을 0이 아닌 다른 값으로 하고 싶다!!
			
		}
		//확인!
		System.out.println("번호\t:\t답안\t\t내답");
		System.out.println("--------------------------");
		for (int i = 0; i < 내답안.length; i++) {
			
		System.out.println( i + ":\t" + 답안지[0] + "\t<->\t" + 내답안[0]);
		}
		
		
		//처리
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if(내답안[i] == 답안지[i]) {
				jumsu++;
			}//if
		}//for
			
		//출력
			System.out.println(jumsu);
		
	}

}
