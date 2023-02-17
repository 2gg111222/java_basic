package 상속응용;

public class 별스레드 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
			for (int i = 0; i < 500000; i++) {
				System.out.println(i+"★");
			}
		
		super.run();
	}
	
}
