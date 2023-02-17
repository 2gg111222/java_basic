package 상속기본;

public class 볼펜Main {
	public static void main(String args[]) {
		볼펜 p = new 볼펜();
		p.price = 3000;
		System.out.println(p.price);
		p.company = "abcde";
		System.out.println(p.company);
		p.size = 3.5;
		System.out.println(p.size);
		p.buy();
		p.write();
		System.out.println(p);
	}
}
