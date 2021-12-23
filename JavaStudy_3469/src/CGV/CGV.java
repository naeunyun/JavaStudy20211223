package CGV;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg = "★어서오세요 CGV입니다.★\n";
		String menuMsg = "①예매하기\n②구매하기\n③나가기\n";
		String ageMsg = "[청소년 구매 불가 상품]\n나이를 입력하세요\n";
		String films = "①라이온킹(8:00)\n②스파이더맨(12:00)\n③사일런스(23:00)[청소년관람불가]\n④돌아가기\n";
		int choice = 0; 
		int age = 0;
		int money = 10_000_000;
		int point = 0;
		int t_price = 10_000;
		boolean t_check = true;
		
		
		while(true) {
			t_check = true;
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg + menuMsg));
			if (choice == 3) break;
			//잘못 입력했을때 continue
			if (!(choice == 1 || choice ==2)) continue;
					
		switch(choice) {
		case 1 :
			//변수의 재사용 - choice를 또 쓸수 있다, 메모리아낄수있다
			if(money - t_price < 0) {
				JOptionPane.showMessageDialog(null, "잔액이 부족합니다");
				continue;
				
				
			}
			
			choice = Integer.parseInt(JOptionPane.showInputDialog(films));
			if(choice == 1) {
				
				JOptionPane.showMessageDialog(null, "라이언킹 예매완료(8:00)");
			
			}else if(choice == 2) {
				JOptionPane.showMessageDialog(null, "스파이더맨 예매완료(12:00)");
				
			}else if(choice == 3) {
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
				if (age > 19) {	
						JOptionPane.showMessageDialog(null, "사일런스 예매완료(23:00)");
				}else 
					t_check = false;
					JOptionPane.showMessageDialog(null, "다시 시도해주세요");
			
			}else {
						
			
				JOptionPane.showMessageDialog(null,"메인 메뉴로 이동합니다.");
				continue;
			}
			if(t_check) {
				money -= t_price;
				JOptionPane.showMessageDialog(null,"현재 잔액:" + money + "원");
				break;
			}
		
			
			switch(choice) {
			case 2 :
				break;

	
			}
		
		}
		}

	}
}

	
