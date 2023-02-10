package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[10]; // legnth: 10
		// index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음.
		// 0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		
		
		char[] gender = { '남', '여', '남', '여', '남', '여' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		String[] name = { "홍길동", "홍길동1", "홍길동2", "홍길동3", "홍길동4", "홍길동5" };
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		double[] eyes = { 1.0, 1.1, 1.2, 1.3, 1.4, 1.5 };
		for (int i = 0; i < eyes.length; i++) {
			System.out.print(eyes[i] + " ");
		}
		System.out.println();
		boolean[] lunch = { true, false, true, false, true, false };
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
	}
}