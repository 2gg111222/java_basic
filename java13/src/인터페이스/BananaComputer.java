package 인터페이스;

public class BananaComputer implements ComputerInterface {

	@Override
	public void t() {
		// TODO Auto-generated method stub
		System.out.println("구동시키다.");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("바나나컴퓨터로 검색하다.");

	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		System.out.println("바나나컴퓨터로 코딩하다.");

	}

}
