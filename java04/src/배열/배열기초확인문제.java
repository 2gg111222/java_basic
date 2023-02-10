package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println("배열의 크기" +a.length);
		a[0] = 100;
		System.out.println("배열 첫번째 " + a[0] );

		a[4] = 500;
		System.out.println("배열 마지막 " + a[4] );

		a[2] = 200;
		System.out.println("배열 세번째 " + a[2] );
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");	
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(" 배열의 인덱스는 " + i +" 크기는 " + a[i] +"입니다. ");	
		}
		;
		
	}

}
