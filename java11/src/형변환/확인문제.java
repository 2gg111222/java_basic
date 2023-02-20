package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class 확인문제 {

	public static void main(String[] args) {
		HashSet tour = new HashSet();
		
		tour.add("일본");
		tour.add("한국");
		tour.add("중국");
		tour.add("싱가폴");
		tour.add("미국");
		System.out.println(tour);
		
		/*for (int i = 0; tour.size() < 5; i++) {		
		String a = JOptionPane.showInputDialog("가고 싶은 곳을 넣어주세요.");
		place.add(a);
		}*/
		System.out.println(tour);
		
		HashMap room = new HashMap();
		room.put("안방", "tv");
		room.put("거실", "쇼파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		System.out.println(room);
		System.out.println(room.get("현관"));
		room.replace("거실", "책상");
		System.out.println(room);
		
		ArrayList rank = new ArrayList();
		
		rank.add("공부");
		rank.add("식사");
		rank.add("운동");
		rank.add("복습");
		rank.add("휴식");
		
		/*for (int i = 0; i < 5; i++) {
			String b = JOptionPane.showInputDialog("오늘 할 일 우선 순위 정해서 하나씩 넣기");
			rank.add(b);
		}*/
		System.out.println(rank);
		System.out.println(rank.get(0));
		System.out.println(rank.get(rank.size()-1));
		//위에 코드가 좋은 코드 System.out.println(rank.get(4));
		rank.add(1, "청소");
		System.out.println(rank);
		
	}

}
