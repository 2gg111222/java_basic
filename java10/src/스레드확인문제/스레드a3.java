package 스레드확인문제;

public class 스레드a3 extends Thread {

	@Override
	public void run() {
		String[] a = { "a", "b", "c", "d", "e" };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println("오류");
			}
		}
	}
}
