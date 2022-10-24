package kr.co.ezenac.loop;

//누적합계가 2000이상일 때 i의 값을 출력하시오.

public class ForTest02 {

	public static void main(String[] args) {
		int sum = 0;
		int temp = 0;
		
		for (int i=1; i<=100; i++) {
			sum += i;
			if (sum > 2000) {
				temp = i;
//				System.out.println("sum 값은? " + sum);
//				System.out.println("i값은? " + temp);
				break;		//감싸고 있는 제어문의 블록을 빠져나오는 기능
			}
//			System.out.println("sum 값은? " + sum);
		}
		
		System.out.println("2000 이상일 때 sum 값은? " + sum);
		System.out.println("2000이일일 때 i 값은? " + temp);

	}

}
