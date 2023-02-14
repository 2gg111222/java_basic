package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String n =  "   011-245-1234      ";
		String n2 = n.trim();
		String[] n3 = n2.split("-"); 
		String	n4 = n3[0];
		System.out.println(n3[0]);
		System.out.println(n3[1]);
		System.out.println(n3[2]);
	
			if (n4.equals("011")) {
				System.out.println("SK");
			}else if (n4.equals("019")) {
				System.out.println("LG");
			}else {
				System.out.println("Aplle");
			}
			//배열의 두번쨰 문자열을 길이 구분
			if (n3[1].length() >=4) {
				System.out.println("최신폰");
			}else {
				System.out.println("올드폰");
			}
				
			 int total = n3[0].length() + n3[1].length() +n3[2].length();
			 System.out.println(total);
				if (total >= 10) {
					System.out.println("유효한 전화번호");
				} else {
					System.out.println("유효하지 전화번호");
				}
				
				int total2 = 0;
				for (int i = 0; i < n3.length; i++) {
					total2 = total2 + n3[i].length();
				}
				System.out.println(total2);
					 /*
			 */
			
			
	}
			
}


