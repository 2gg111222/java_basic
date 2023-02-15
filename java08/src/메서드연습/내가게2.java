package 메서드연습;

public class 내가게2 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		int result1 = cal.add(300, 200);
		
		double result2 = cal.add(300, 22.2);
		
		double result3 = cal.add(11.1, 22.2);
		
		String result4 = cal.add("나는 오늘 몇시에", 1);
		// String result5 = cal.add("1", "나는 "); 순서 바뀌어도 에러
		//입력값의 종류, 개수, 순서가 메서드는 맞아야 한다.
		System.out.println(result1 - 1000);
		System.out.println(result2 - 1000);
		System.out.println(result3 - 1000);
		System.out.println(result4 + "너무 늦어!!");
		
	}

}
