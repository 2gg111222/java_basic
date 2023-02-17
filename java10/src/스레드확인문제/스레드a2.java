package 스레드확인문제;

import java.util.Date;

public class 스레드a2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {	
		Date date = new Date();
		System.out.println("타이머" + date);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("오류");
		}
		}
	}
}
