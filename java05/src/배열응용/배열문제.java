package 배열응용;

import java.util.Random;

public class 배열문제 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		Random r = new Random(42);
		int count = 0;
		int count1 = 0;
		double sum = 0;
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
			sum += jumsu[i];
			if (jumsu[i] == 0) {
				count++;
			} else if (jumsu[i] == 450) {
				count1++;
				System.out.println("만점자는 누구인가? " + i);
			} 
			
		}
		double avg = (double)sum / jumsu.length;
		int count2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if(avg-50<=jumsu[i] && jumsu[i]<= avg+50)
				count2++;
		
		}
		int count3 =0;
		double a = 0;
		
		
			
			
		System.out.println("평균은 " + avg);	
		System.out.println("만점자는 몇명인가? " + count1);
		System.out.println("0점자는 몇명인가? " + count);
		System.out.println("평균에서 +-50점인 학생의 숫자는 몇명인가? " +count2 );
		System.out.println("상위 30% 학생수는? " +count3 );
		
	}
}
