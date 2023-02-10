package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인기투표시스템");
		System.out.println("==========================");
		
		int iu = 0; 
		int bt = 0;
		int n = 0;
		
		while (true) {
			System.out.println("1)아이유 2)방탄 3)뉴진스 4)종료");
			int a = sc.nextInt();
			
			if (a == 1) {		
				iu++;//iu = iu+1;    
			}else if (a == 2) {
				bt++;//bt = bt+1;
			}else if (a == 3) {
				n++;//n= n+1;
			}else if (a==4) {
				break;
			}else {
				System.out.println("올바른 번호를 입력해주세요.");
			}
		}	
			
			System.out.println("아이유 " + iu + "표" );
			System.out.println("방탄 " + bt + "표" );
			System.out.println("뉴진스 " + n + "표" );
			
		sc.close();
	
	}

}
