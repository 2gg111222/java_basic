package 배열응용;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class 입력받아배열에넣기확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] t1 = new String[3];
		String[] t2 = new String[3];
		int count = 0;
		for (int i = 0; i < t2.length; i++) {
			
			System.out.println("작년에 가고 싶었던 곳을 우선순위에 따라 입력하세요!");
			
			String data = sc.next();
			t1[i] = data;
			System.out.println("올해에 가고 싶었던 곳을 우선순위에 따라 입력하세요!");
			
			String data2 = sc.next();
			t2[i] = data2;
			if (t1[i].equals(t2[i])) {
				count++;
			}
		}
			System.out.println(count);
			
		
			
				
			}

}
