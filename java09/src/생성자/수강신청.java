package 생성자;

public class 수강신청 {
	 String 과목; String 시간; String 이름;
	 // 객체 생성 한정 시킴, 이거 쓰자로 제한 걸어놓음
	public 수강신청(String 과목, String 시간, String 이름) {
		this.과목 = 과목;
		this.시간 = 시간;
		this.이름 = 이름;
	}

	@Override
	public String toString() {
		return "수강신청 [과목=" + 과목 + ", 시간=" + 시간 + ", 이름=" + 이름 + "]";
	}
	  
	

}
