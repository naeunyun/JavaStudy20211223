package a09_메소드;

public class MethodEx {
	
	
	//private String name; //파랑색 name
	// 매개변수 x, 반환값 x 
	public static void printInfo() {
		System.out.println("윤");
		System.out.println("나");
		System.out.println("은");
		System.out.println("입");
		System.out.println("니");
		System.out.println("다");
	}
	// 매개변수 o, 반환값 x
	public static void printName(String name) {
		System.out.println("이름: " + name); //갈색 name
		
	}
	
	//매개변수 x, 반환값 o
	public static String getName() {
		String name = "윤나은";
		return name;
	}
	// 매개변수 o, 반환값 o
	public static String transferName(String name) {
		String tName = name + "님";
		return tName;
	}
		
	public static String transferNamer2(String name, int number) {
		return number + "번 고객: " + name;
	}
	
	public static void main(String[] args) {
		printInfo();
		// 위에 printInfo 메소드를 호출한다
		
		System.out.println("프로그램 종료");
		
		String name = "윤나은";
		printName(name); //또는 printName("윤나은")만 적어준다
		
		String name2 = getName();
		System.out.println(name2);
		System.out.println(getName());
		
		String name3 = transferName("윤나은");
		System.out.println(name3);
		System.out.println((transferName("윤나은")));
		
		System.out.println(transferNamer2("윤나은", 1));
		
		
	}

}
