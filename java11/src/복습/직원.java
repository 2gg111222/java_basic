package 복습;

public class 직원 {
	public String name; // 같은 패키지 + 다른 패키지,즉 아무곳에서나 접근 가능 
		String address; //	같은패키지
		protected int salary; // 같은패키지서 + 상속 받을때만 다른 패키지에서 접근 가능  
		private int rrn; // 해당 클래스 안에서만 접근 가능 
		
		
		public int getRrn() { //getr (crtl + space)
			return rrn;
		}
}
