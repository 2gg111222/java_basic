package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		// 
		int[] jumsu2 = new int[1000];
	
		Random r = new Random(42);
		
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) +2;
			
		}
	
		for (int x : jumsu2) {
			
			System.out.println(x);
		}
		int count = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i]>=15) {
				count++;
			}
		}//for
		
		System.out.println("15이상인 숫자의 갯수: " + count);
		int sum =0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i]>=15) {
				sum =sum + jumsu2[i];
				
			}
		}
		System.out.println("15이상인 숫자의 합: " + sum);
		System.out.println();
	}

}
