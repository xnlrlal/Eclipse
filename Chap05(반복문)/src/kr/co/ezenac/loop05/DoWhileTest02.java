package kr.co.ezenac.loop05;

import java.util.Scanner;

/*
 * 
 * 메시지를 입력하세요.
 * 프로그램을 종료하려면, q를 입력하세요.
 * >이젠
 * 입력받은 메시지 : 이젠
 * >신논현역
 * 입력받은 메시지 : 신논현역
 * >q
 * 입력받은 메시지 : q
 * 프로그램을 종료합니다.
 * 
 */

public class DoWhileTest02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메시지를 입력하세요.\n" + "프로그램을 종료하려면, q를 입력하세요.");
		
		String str = null;
		
		do {
			System.out.print(">");
			str = scan.nextLine();
			System.out.println("입력받은 메시지: " + str);
			
		} while (!str.equals("q"));
		
		System.out.println("프로그램을 종료합니다.");
		
//		String msg;
		
//		do {
//		System.out.print(">");
//		msg = scan.nextLine();		
//		System.out.println("입력받은 메시지: "+msg);
		
//		} while(str msg != q);
		

		scan.close();
		
	}

}
