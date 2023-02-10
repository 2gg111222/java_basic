package 복습;

public class 기본형심화2 {

	public static void main(String[] args) {
		// 기본형 4가지
		// 정수, 실수, 문자1, 논리
		//int double char boolean
		//
		//정수형 변수 4가지
		//-128~127, 1바이트 byte
		//-3만~3만, 2바이트 short
		//-21억~21억, 4바이트 int
		//21억 이상, 8바이트 long
		
		double temp = 1.2;
		int floor = 3;
		char color = 'b';
		boolean juice = false;
		
		String location = "선릉역"; //스트링은 부품
		
		//syso, sysout 컨트롤 + 스페이스(윈도우)
		// 자주 사용하는 부품은 대문자로 바로 씁니다!!
		// System -컴퓨터,, out(출력장치) - 모니터
		//                 in(입력장치) - 키보드
		System.out.println("오늘 온도는" + temp + "도");
		System.out.println("층" + floor);
		System.out.println("색깔" + color);
		System.out.println("음료" + juice );
		
	}

}
