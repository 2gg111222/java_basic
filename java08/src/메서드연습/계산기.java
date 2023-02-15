package 메서드연습;

public class 계산기 {
	public void 더하기(int x, int y) {//더하기ㅣ2-3]// 파라메터 매개변수
		//전달된 값을 저장하는 매개 역할을 수행, 중매 매 낄 개
		System.out.println("더하기 기능 처리 방법 내용....");
		System.out.println(x+y);
	}
	public void 곱하기(int x, int y, int z) {
	System.out.println("곱하기 기능 처리 방법 내용....");
	System.out.println(x*y*z);
	}	
	public int 빼기(int x, int y) {//매개변수(parameter)
		System.out.println("뺴기 기능 처리 방법 내용....");
		return  x - y;
		
	}
}