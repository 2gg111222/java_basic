package 변수;

public class 변수선언 {


			public static void main(String[] args) {
				// 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을지 미리 결정
				//선언!! 타입 변수명!! ==> 변수가 생성됨!
				int num = 100; // 정수 변수
				double num2 = 22.2; //실수 변수, 22.0 22(정수를 넣을 수 있음)			char c = '한'; //글자 1글자 ==> ''
				char a = '가';	//문자 1개 값은 '' 사용
				boolean b = true; // false	
				String name = "홍길동"; //기본데이터X ==>너무 많이 쓰기 때문에 기본형처럼 기본데이터처럼 사용가능
				 // 여러글자를 쓸때는""/ 스트링.실!!, 바느질,
				
				num = 200;
				//b = 300;
				System.out.println("정수값은"+num);
				System.out.println("실수값은"+num2);
				System.out.println("문자 1개"+ a  );
				System.out.println(b);
				System.out.println(name);
			}
	}


