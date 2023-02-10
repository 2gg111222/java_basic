package 조건문;

import java.util.Scanner;

public class 콘솔연습2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나에 대한 정보");
		
		System.out.print("나의 이름 입력 ");
		String data = sc.next();
		
		System.out.print("나의 나이는? ");
		String data1 = sc.next();
		
		System.out.print("나의 키는?");
		double data2 = sc.nextDouble();
		
		System.out.print("나의 몸무게는?");
		double data3 = sc.nextDouble();
		
		System.out.print("나는 저녁을 먹었나요");
		boolean data4 = sc.nextBoolean();
		
		System.out.print("나는 좌우명은?");
		sc.nextLine();
		String data5 = sc.nextLine();
		
		System.out.println("나의 이름은  " + data);
		System.out.println("나의 나이는  " + data1);
		System.out.println("나의 키는  " + data2);
		System.out.println("나의 몸무게는 " + data3);
		System.out.println("당신의 저녁 여부 는 " + data4);
		System.out.println("올해의 목표는  " + data5);
		
		
		System.out.println("=======================");
		System.out.println("내 이름은 " + data);
		System.out.println("내년 나이는 " + (data1 + 1));
		System.out.println("내년 키는 " + (data2 + 10));
		if (data4) {
			System.out.println("배가 부르시겠군요");
		} else {
			System.out.println("배가 고프시겠군요");
		}
		System.out.println("올해의 목표는 " + data5);
	
		sc.close();
	}

}
