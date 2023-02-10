package 제어문문제;

import java.util.Random;

public class 로또번호만들기 {

	public static void main(String[] args) {
		//아무 값이나 발생시키는 부품 ==> Ramdom
		//가짜랜덤?
		Random r = new Random(); // 씨앗값 Random() <-- 안에 아무 숫자나 넣으면 나오는 숫지 고정됨, 숫자에 따라 부여된 랜덤 값이 있음, 
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호: " + (r.nextInt(45)+1)); //0~9
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("2~10 사이 랜덤 " + (r.nextInt(9) + 2));
		//0~8 = 2 ~10
		}
			for (int i = 0; i < 6; i++) {
				System.out.println("3~30 사이 랜덤 " + (r.nextInt(28) + 3)); //3~30
		//0 ~27 =>3 ~ 30 		
		}
	}

}
