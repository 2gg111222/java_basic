package 클래스복습;

public class Car {
	//성질 : 변수로 구현, 멤버변수 = 내가 이 성질만 선택했다.
	String color; // 멤버변수는 선언된 위치가 생존의 위치!
				// 해당 변수를 포함하는{}안에서 생존 가능!
	//클래스 바로 아래 선언된 변수는 클래스 전체영역에서 사용 가능!
	// ==> 전역변수, 글로벌변수, 자동초기화가 되있음
	// ==> 자동초기화시 기본형이 아니므로 참조형은 모두 null로 초기화!
	//동작 : 기능, 멤버메서드, 함수(메서드, 방법)
	public void run() {//메서드(방법) ==> 이 달리다라는 기능이
		//어떤 방법으로 달릴지를 써주면 된다. 방법써주는 곳
		System.out.println("부릉부릉 달리다.");
	}
	public void up() {
		System.out.println("비싼 휘발유를 먹으며!! 미친듯이 속도up");
	}
}
