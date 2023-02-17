package 복습;

public class Mask {
		String color;
		int price;
		int count;
		//클래스 이름과 동일한 메서드를 만들어주면,
		//new를 가지고 객체생성시 자동호출
		//생성자메서드,생성자(메서드) ==> constructor(컨스트럭터)
		//더 쉽게 코드를 짜려고 생성자를 쓴다.
		public Mask(String color, int price, int count) {
			super();
			this.color = color; //this 통해 지역변수 인식이 아닌 전역변수 인식
			this.price = price;
			this.count = count;
		}
		@Override
		public String toString() {
			return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
		}
		
		
}
