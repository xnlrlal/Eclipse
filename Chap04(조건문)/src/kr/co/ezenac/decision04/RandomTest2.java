package kr.co.ezenac.decision04;

public class RandomTest2 {

	public static void main(String[] args) {
		
		//로또: 1부터 45까지의 숫자 중 6개를 맞힘.
		int num = (int)(Math.random() * 45) + 1;
		System.out.print(num);
		
			
 	}

}
