package a07_조건;

public class IfTest {

	public static void main(String[] args) {
		int number = 9;
					
		if(number == 10) {
			System.out.println("number가 10입니다.");
		
		}else if(number == 9) {
			System.out.println("number가 9입니다.");
		}else if(number == 8) {
			System.out.println("number가 8입니다.");
		}else {
			System.out.println("number가 10, 9, 8 모두 아닙니다.");
		}
		
	
		// 명령을 두번 하고 싶으면 중괄호로 묶어줘야 실행이 된다
		// 왠만하면 중괄호로 묶어 주는 것이 좋다
		
		System.out.println("프로그램 종료");
		
		
		
		
		

	}
}

