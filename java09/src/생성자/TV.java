package 생성자;

public class TV {
	// 멤버변수, 선언이 클래스 바로 아래에 되었기 떄문에
	// 클래스 전체 영역에서 이 변수를 사용 할 수 있음.
	// 전역변수(global 변수, 글로벌 변수)
	// 멤버변수는 자동초기화, 전역변수는 자동초기화
	public int ch; // 0
	public int vol; // 0
	public boolean onOff; // false

	// 기본 생성자(default constructor)
	// public TV() {
	// 자동으로 만들어지는 메서드(함수)
	// System.out.println("TV객체가 하나 생성됨.");
	// }
	// 객체 생성 할 때 마다 꼭 실행시키고 싶은 내용이 있으면 기본 생성자를 눈에 보이게
	// 다시 만들어주세요. ( 명시적으로!)
	// 만들떄 source - Generate constructor 방법도 있음

	// 다른 생성자 메서드가 없으면 부품만들때(객체생성) 자동으로 생성됨.

	//	public static void main(String[] args) {
	//		TV tv1 = new TV(10,9,true);
	//	}
	// 매개변수(파라메터) 있는 생성자
	//	public TV(int x, int y, boolean z) {
	//		//무더기 영역(힙영역)에 저장된 멤버변수에 값을 넣어주는 역할
	//		this.ch = x;
	//		this.vol = y;
	//		this.onOff = z;
	//	}
	public TV(int ch, int vol, boolean onOff) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}

		
	
	public void 채널을바꾸다() {

		int change = 1; // 지역변수, local변수, 로컬변수, 자동초기화X
		System.out.println(ch + "에서 " + change + "로 바꾸다.");

	}


	public void 유튜브보다() {// 메서드를 만드는 것 ==> 메서드 정의한다.
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}

}
