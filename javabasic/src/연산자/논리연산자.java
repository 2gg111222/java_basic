package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		//기본형은 연산자(기호)를 이용해서 비교가능??
		//기본형 데이터는 비교연산자를 가지고 비교 가능
		//기본형 데이터가 아니면 비교연산자를 가지고 비교 불가능
		int id = 1111; //변수에 값을 넣을 때  = 대입 연산자, 할당 연산자
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		//아이디가 동일한지 비교! //비교할떄 사용 ==
		//컨트롤 + 알트 + 화살표 아래(한줄복사)
		System.out.println("id와 id2 같은지 비교"+(id == id2));
		System.out.println("pw와 pw2 같은지 비교"+ (pw == pw2));
		//&&, and조건, 두 조건이 모두 맞아야 맞다고 판단
		System.out.println(id == id2 && pw == pw2);
		
		
		int mem1 = 111; 
		int mem2 = 222;
		
		//||, or조건, 조건 중에서 한 조건만 맞아도 맞다라고 판단
		//로그인 처리
		System.out.println(mem1 == 111|| mem2 == 222);
		
	}
}