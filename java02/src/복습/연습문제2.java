package 복습;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {
		
		
		String pw = JOptionPane.showInputDialog("암호를 대시오!");
		
		if (pw.equals("pass")) {
			System.out.println("들어오세요");
			
		}else {
			System.out.println("나가세요");
		}
		String food = new String();
		   food = JOptionPane.showInputDialog("당신이 먹고싶은 저녁 메뉴는(자장면,라면,회에서 선택)!");
		if(food.equals("자장면")) {
			System.out.println("중국집으로 가요");
		}else if (food.equals("라면")) {
			System.out.println("중국집으로 가요");
		}else if(food.equals("회")) {
			System.out.println("횟집으로 가요");
		}else {
			System.out.println("그냥 안먹어요");
		}
		/*String food = new String();
		food = JOptionPane.showInputDialog("당신이 먹고싶은 저녁 메뉴는(자장면,라면,회에서 선택)!");
		switch (food) {
		case "자장면":
			System.out.println("중국집으로 가요");
			break;
		case "라면":
			System.out.println("중국집으로 가요");
			break;
		case "회":
			System.out.println("중국집으로 가요");
			break;
		default:
			System.out.println("그냥 안먹어요");
			break;
		}
		 */
		
		String a = JOptionPane.showInputDialog("정수를 입력하세요");
		String b = JOptionPane.showInputDialog("다른 정수를 입력하세요");
		
		
		int	a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		if (a1 > b1) {
			System.out.println(a1);
		}else if(a1 < b1) {
			System.out.println(b1);
		}else {
			System.out.println("서로 다른 값을 넣어주세요");
		}
		String no = new String();
		no = "A100EX";
		
		char x = no.charAt(0);
		switch (x) { //int, char, String만 사용가능
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
		case 'c':
			System.out.println("개발부");
		default:
			System.out.println("해당부서 없음");
			break;
		}
	}
}