package a06_입력;

import java.util.Scanner;

/**
 * 
 * 사용자의 이름을 입력해 주세요: 윤나은 -> 문자열
 * 사용자의  아이디를 입력해 주세요 : naeun -> 문자열
 * 사용자의 비밀번호를 입력해 주세요 : 1234 -> 정수
 * 사용자의 이메일을 입력해 주세요 : purplena@naver.com -> 문자열
 * 
 * 
 * [입력한 사용자의 정보]
 * 이름: 윤나은
 * 아이디 : naeun
 * 비밀번호 : 1234
 * 이메일 : purplena@naver.com
 * @author ITPS
 *
 */

public class UserInfo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name;
		String id;
		int password;
		String email;
		
		System.out.println("사용자의 이름을 입력해 주세요: ");
		name = in.nextLine();
		System.out.println("사용자의 아이디를 입력해 주세요: ");
		id = in.nextLine();
		System.out.println("사용자의 비밀번호를 입력해 주세요:");
		password = in.nextInt();
		in.nextLine();
		
		System.out.println("사용자의 이메일을 입력해 주세요:");
		email = in.nextLine();
		
		System.out.println("\r\n[입력한 사용자의 정보]\r\n"
		+ "이름:" + name + "\r\n"
		+ "아이디:" + id + "\r\n"
		+ "비밀번호:" + password + "\r\n"
		+ "이메일:" + email + "\r\n");
		
		
	}

}

