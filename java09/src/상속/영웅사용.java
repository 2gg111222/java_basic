package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();
		
		맨 m = new 맨();
		m.run();
	
		수퍼맨 s = new 수퍼맨();
		s.name = "클라크";
		s.power =  500000;
		s.fly = true;
		s.eat();
		s.run();
		s.space();
		
		우먼 w = new 우먼();
		w.run();
		
		원더우먼 ww = new 원더우먼();
		ww.name ="다이애나";
		ww.power = 500000;
		ww.talk = true;
		ww.run();
		ww.t();
		ww.pw();
	}

}