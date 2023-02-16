package 스태틱;

public class 직원 {
	String 이름;
	int 나이;
	String 성별;
	static int count;
	static int sum;
	
	//객체생성하기 클래스 이름으로 바로 접근해서 아무때나 원할 떄 평균을 구하고 싶은 경우
	//static메서드로 만드러주세요!
	public static void getAvg() {
		count;
	}
	
	
	public 직원(String 이름, int 나이, String 성별) {
		
		count++;
		sum += 나이;   
		this.이름 = 이름;
		this.나이 = 나이;
		this.성별 = 성별;
	}
		
	@Override
	public String toString() {
		return "직원 [이름=" + 이름 + ", 나이=" + 나이 + ", 성별=" + 성별 + "]";
	}
	
		
	
}
