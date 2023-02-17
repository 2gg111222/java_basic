package 스레드확인문제;

public class 스레드확인 {

	public static void main(String[] args) {
		스레드a a = new 스레드a();
		스레드a2 b = new 스레드a2();
		스레드a3 c = new 스레드a3();
		스레드a4 d = new 스레드a4();
		
		a.start();
		b.start();
		c.start();
		d.start();
	}

}
