package 스레드확인문제;

public class 스레드a4 extends Thread {
	@Override
	public void run() {

		for (;;) {
			int i =0;
			i++;
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("오류");
			}

		}
	}
}
