package 복습;

public class Mask사용 {

	public static void main(String[] args) {
		Mask mask1 = new Mask("하얀색", 1000,3);

		//멤버변수값을 매번준다. 변수가 많아지면 일일이 타이핑 힘들어 질 수 있다.
		// ==>객체 생성시 멤버변수값을 자동으로 무조건 넣어주는 처리를 하고 싶다.
		//mask1.color = "하얀색";
		//mask1.price = 1000;	==> 이 내용들을 new mask() 안쪽에 넣고
		//mask1.count = 3;			Mask클래스에서 변수값을 확인 할 수 있게 처리한다. 
		
		//System.out.println(mask1.color);
		//System.out.println(mask1.price);
		//System.out.println(mask1.count);
		//이렇게 3개 일일히 쓰면 분량 많아지면 힘듬
		//더 쉽게 쓸 수 없을까
		// System.out.println(mask1); - 바로 이렇게 쓰면 주소가 찍힘
		//Mask 클래스에서 toString 써놓기, 상속내용의 개념 
		//그러면 입력내용 출력
		System.out.println(mask1);
	}

}
