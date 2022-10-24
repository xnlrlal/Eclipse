package kr.co.ezenac.loop02;

/*
 *  ********
 *  *******
 *  ******
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 */
public class TriangleTest {

	public static void main(String[] args) {
//		int x = 0;
//		for (int i=0; i<8; i++) {					//8번의 횟수 실행.
//			for (int j=0; j<(8-x); j++) { 			//가로줄에 *이 8개 생성.
//				System.out.print("*");				
//			}
//			x++;									//계속해서 *의 개수가 줄어듦.
//			System.out.println();
//		}

		for (int i=0; i<8; i++) {
			for (int j=i; j<8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
