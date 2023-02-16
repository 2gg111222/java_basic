package 상속확인문제;

public class Car extends Object {
			int kW; String color;
			
			public void Drive() {
				System.out.println("운전을 하다.");
			}

			

			@Override
			public String toString() {
				return "Car [kW=" + kW + "]";
			}
		
}
