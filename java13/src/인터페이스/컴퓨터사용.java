package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		BananaComputer banana = new BananaComputer();
		
		apple.t();
		apple.coding();
		apple.search();
		
		banana.t();
		banana.coding();
		banana.search();
	}

}
