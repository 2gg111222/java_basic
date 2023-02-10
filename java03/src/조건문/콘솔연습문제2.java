package 조건문;

import java.util.Scanner;

public class 콘솔연습문제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("시작값을 입력해주세요");
		
		int j = sc.nextInt();
		
		System.out.println("종료값을 입력해주세요");
		
		int k = sc.nextInt();
		int sum = 0;
		for (int i = j; i <= k; i++) {
			
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		System.out.println("시작값을 입력하시오");
		int f = sc.nextInt();
		System.out.println("종료값을 입력하시오");
		int l = sc.nextInt();
		System.out.println("점프값을 입력하시오");
		int j1 = sc.nextInt();
		
		int sum1 = 0;
		for (int i = f; i <= l; i=i + j1) {
			
			sum1 = sum1+ i ;
			if (sum1 >100) {
				System.exit(0);
			} 
			
		}
		System.out.println(sum1);
		
		sc.close();
		
	}

	
		
}
