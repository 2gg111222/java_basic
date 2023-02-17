package 복습;

public class FlyCar extends Car{
	boolean fly; 
	public void fly() {
			System.out.println("하늘에서 운전하다.");
	}
	@Override
	public String toString() {
		return "FlyCar [fly=" + fly + ", color=" + color + "]";
	}
	
		
}
