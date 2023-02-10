package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		String Exercise = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String Day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		// System.out.println(Day+"에 저는"+ " "+ Exercise +"를 합니다.");
		
		String result = Day +"에 저는 "+ Exercise +"를 합니다.";
		
		System.out.println(result);
	}
}