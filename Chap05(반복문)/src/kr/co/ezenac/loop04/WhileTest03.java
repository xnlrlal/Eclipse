package kr.co.ezenac.loop04;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int speed = 0;

		while (true) {
			System.out.println();
			System.out.println("=====================================");
			System.out.println("1. 음속     | 2. 감속     | 3. 중지     ");
			System.out.println("=====================================");
			System.out.print("입력 : ");

			int choice = scan.nextInt();
			
			if (choice == 1) {
				speed++;
				System.out.println("현재 속도: " + speed);

			} else if (choice == 2) {
				speed--;
				System.out.println("현재 속도: " + speed);
			} else if (choice == 3) {
				break;
				//run = false;
			} else {
				System.out.println("잘못입력된 값입니다.");
			}

		}
		System.out.println();

		scan.close();

	}

}
