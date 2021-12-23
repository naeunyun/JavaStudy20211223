package a05_문자열;

public class StringEx {

	public static void main(String[] args) {
		int num = 1;
		char c = 'a';
		String name = "윤나은";
		System.out.println("안녕하세요. " + name + " 입니다.");
		System.out.println("" + num + c + "안녕하세요" + 1 + 1);
		System.out.println(num + (c + "안녕하세요") + (1 + 1));
		// 괄호를 써서 연산자의 우선순위를 바꿔준다
	}

}
