package 상속확인문제;

public class 내차들 {
	
	public static void main(String args[]) {
		
	
	Car c1 = new Car();	
	c1.kW = 500;
	System.out.println(c1.kW);
	c1.Drive();
	
	Truck c2 = new Truck();
	c2.cargo = 1000;
	System.out.println(c2.cargo);
	c2.짐();
	
	CoffeTruck c3 = new CoffeTruck();
	c3.짐();
	
	}
}
