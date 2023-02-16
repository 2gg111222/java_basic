package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		// 이탤릭체로 표현되는 건 static 변수, 누워있음 , 정적 움직이지(사라지지)않음 계속 사용됨
		//헷갈리지 않게 객체명칭이 안씀. 통일 해서 써짐
		Day day1 = new Day("자바공부", 8, "집");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		//static이 붙은 메서드나 변수는 객체 생성하지 않아도
		//클래스 이름으로 바로 접근해서 사용 가능!!
		
		
		Day day2 = new Day("자바공부", 8, "집");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3 = new Day("공부", 7, "집");
		System.out.println(Day.count);
		System.out.println(Day.sum);
	
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		//총 12개 다이나믹 생성, 멤버변수 ==> 객체생성 할 때마다 다이나믹하게 무더기영역(heap)에 생긴 변수
		//인스턴트 변수라고 부른다.

		
		
		
	}

}
