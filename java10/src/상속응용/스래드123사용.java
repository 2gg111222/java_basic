package 상속응용;

public class 스래드123사용 {

	public static void main(String[] args) {
		스레드1 a = new 스레드1();
		스레드2 b = new 스레드2();
		스레드3 c = new 스레드3();
		
		a.start();
		b.start();
		c.start();
	}

}
