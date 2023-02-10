package 배열응용;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class 정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {	
		System.out.println("정수 10 20 30 40 50을 순서대로 넣어주세요");
		int a1 =  sc.nextInt();
		    a[i] = a1;
		    sum = a[0]+a[2];
		
		}	
		
		System.out.println(sum);
		
		String[] b = new String[3];
		for (int i = 0; i < b.length; i++) {
		System.out.println("자바 스프링 jsp를 순서대로 넣어주세요");
		String b1 = sc.next();
		 b[i]= b1;
		}
		 System.out.println(b[0] +" 보다는 " + b[2]);
		 
	}

}
