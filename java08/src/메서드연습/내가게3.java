package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal = new 계산기3();
		int price = 7000;
		int count1 = 5; //오전에 온 손님 수
		int count2= 4; //오후에 온 손님 수
		
		//계산기 3을 이용해주세요
		//1.
		int result = cal.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + result + "입니다." );
		
		//2
		int result2 = cal.m(count1, count2);
		
		System.out.println("오전과 오후의 손님 수 차이는 " + result2 + "입니다." );
		//Math.하고 절대값  적용 System.out.println("손님 수 차이는" +Math.abs(result2) +"입니다.");
		//이건 올림  System.out.println(Math.ceil(3.334));
		//3
		int result3 = cal.a(count1, price);
		System.out.println("오전에 들어온 손님의 결제 금액은 " + result3 + "입니다." );
		
		int result4 = cal.b(count2, price);
		System.out.println("오후에 들어온 손님의 결제 금액은 " + result4 + "입니다." );
		
		int result5 = cal.c(result3, result4);
		System.out.println("오전과 오후에 들어온 손님의  총 결제 금액은 " + result5 + "입니다." );
		
		int result6 = cal.d(result5, result);
		System.out.println("손님의 1인당 결제 금액은 " + result6 + "입니다." );
	}
}
