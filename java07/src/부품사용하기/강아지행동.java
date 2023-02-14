package 부품사용하기;

import java.awt.Color;

import 부품만들기.강아지;

public class 강아지행동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		강아지 d1 = new 강아지();
		d1.shape = "중형견";
		d1.color = "흰색";
		
		
		
		System.out.println(d1.shape + " 크기의 " + d1.color +"의  강아지");
		d1.간식먹기();

		강아지 d2 = new 강아지();
		d2.shape = "소형견";
		d2.color = "검은색";
		
		System.out.println(d2.shape +" 크기의 "+ d2.color +"의 강아지");
		
		d2.잠자기();
		
		
	}

}
