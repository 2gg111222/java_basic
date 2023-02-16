package Static확인문제;
public class 딸 {
	static int 아빠지갑 = 10000;
	static int 용돈 = 1000;	
	static int count;	
	public String name;
	public String gender;
	
	
	public 딸(String name, String gender) {
		아빠지갑 = 아빠지갑 -용돈;
		count++;
		this.name = name;
		this.gender = gender;
	}


	public void tv보다() {
		System.out.println("tv보다");
	}
	
	
	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}







}
