package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트
		for (int i = 0; i <= 10; i++) {
			//i가 8이 되면 for문 종료
			if(i==8) {
				break; //for문 종료, for문 아래에 있는 내용이 이어서 실행!!
				//System.exit(0); //for문 밖에 내용들도 미실행, 완전 종료
			}
			
			if(i % 2 !=0){//홀수
				
				continue;// 이번i만 for문 안의 내용을 실행하지 말아라!
			}		
			/*if(i % 2 ==0){//짝수
				System.out.println(i);//짝수로 실행
			}*/	
			
			System.out.println(i);
		}
		System.out.println("for문이 끝났습니다.");
	}
	
}
