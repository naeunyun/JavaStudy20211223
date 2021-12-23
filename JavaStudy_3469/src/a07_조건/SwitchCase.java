package a07_조건;

public class SwitchCase {

	public static void main(String[] args) {
		char select = 'G';
		
		switch(select) {
			case 'A' : 
				System.out.println("A");
				break;
			case 'B' : 
				System.out.println("B");
				break;
			case 'C' : 
				System.out.println("C");
				break;
			case 'D' : 
				System.out.println("D");
				break;
			case 'F' : 
				System.out.println("F");
				break;
			default:
				System.out.println("잘못된 성적");
				
		/* if에서 else는 switch에서 default이다
		 * default 에서는 break 할 필요가 없다
		 * 
		 * 명령한거 이후로 실행이 되기때문에 break;가 필요하다
		 * 
		 */
		}

	}

}
