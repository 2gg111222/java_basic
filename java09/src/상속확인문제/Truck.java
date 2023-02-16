package 상속확인문제;

public class Truck extends Car{
		
		int cargo;
	
	 

	public void 짐() {
		 System.out.println("짐을 운반한다.");
	 }
	@Override
	public String toString() {
		return "Truck [cargo=" + cargo + "]";
	}
}
