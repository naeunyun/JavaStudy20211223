package a08_반복;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class GuGuDan {

	public static void main(String[] args) {
		// 2 x 2 ~ 9 x 9
		
		/*
		 * [2단]
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * 2 x 9 = 18
		 * 줄바꿈 한번
		 * [3단]
		 * 3 x 1 = 3
		 * 3 x 2 = 6
		 * ...
		 * 
		 * [9단]
		 * ...
		 * 9 x 9 = 81
		 * 
		 * 
		 *
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("시작 단수: ");
		int startDan = input.nextInt();
		input.nextLine();
		System.out.print("마지막 단수: ");
		int endDan = input.nextInt();
		input.nextLine();
		
					
				
		for(int dan = startDan; dan < (endDan + 1); dan++) {
			System.out.println("[" + dan + "단]");
			
			for(int num = 1; num < 10; num++)
				System.out.println(dan + " X " + num + " = " + (dan*num));
			{
			System.out.println();
			
					}

	}
}
}