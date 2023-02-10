package 복습;

public class 배열만들기2 {

	public static void main(String[] args) {

		// 여행지 5개
		String[] x = { "a", "b", "c", "d", "e" };

		for (int i = 0; i < x.length; i++) {
			System.out.print(" " + x[i]);
		}

		System.out.println();

		for (String x1 : x) {
			System.out.print(" " + x1);
		}

		System.out.println();

		// 색깔 첫 글자 5개
		char[] y = { 'r', 'b', 'g', 'b', 'y' };

		for (int i = 0; i < y.length; i++) {

			System.out.print(" " + y[i]);
		}
		System.out.println();

		for (char y1 : y) {
			System.out.print(" " + y1);
		}
		System.out.println();
		// 사람 5명의 키
		double[] z = { 200.0, 190.0, 180.0, 170.0, 160.0 };

		for (int i = 0; i < z.length; i++) {
			System.out.print(" " + z[i]);
		}
		System.out.println();
		for (double z1 : z) {
			System.out.print(" " + z1);
		}

	}

}
