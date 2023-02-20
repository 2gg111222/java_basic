package 상속;

import 복습.직원;

public class 직원사용 {
		
	public static void main(String[] args) {
		직원 work = new 직원();
		work.name = "홍길동"; // 선언하면 어디든 사용가능
		work.address = "강남구";//default, 다른 패키지 사용불가
		work.salary = 100; // 상속받으면 사용 가능, 다른 패키지 사용가능
	}

}
