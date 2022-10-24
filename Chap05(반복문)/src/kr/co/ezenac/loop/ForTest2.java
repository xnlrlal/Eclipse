package kr.co.ezenac.loop;

public class ForTest2 {

	public static void main(String[] args) {
		
		int sum = 0;
		//1~20까지 중 2의 배수 또는 3의 배수를 뺀 합을 구하는 반복문
		for (int i=1; i<=20; i++) {
			 
			 if (i%2 == 0 || i%3 == 0)	{
				 sum *= 1;
			 } else {
			 sum += i;
			 }
//			 System.out.println("sum : " + sum);
		}
		System.out.println("1~20까지 중 2의 배수 또는 3의 배수를 뺀 합 : " + sum);

	}

}
