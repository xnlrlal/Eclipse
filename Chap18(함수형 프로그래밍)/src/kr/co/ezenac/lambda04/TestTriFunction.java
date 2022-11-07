package kr.co.ezenac.lambda04;

public class TestTriFunction {

	public static void main(String[] args) {
		
		TriFunction MyTriple = (x, y, z) -> x+y+z;
		
		System.out.println(MyTriple.TriNum(5, 27, 1));
	}
}
