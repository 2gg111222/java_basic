package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"1","2","3"},
				{"4","5","6"},
				{"7","8","9"}
				};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println	(s[i][j]);
			}
		}
		
	}

}
