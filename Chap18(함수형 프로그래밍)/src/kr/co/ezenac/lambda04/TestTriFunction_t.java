package kr.co.ezenac.lambda04;

public class TestTriFunction_t {

	public static void main(String[] args) {

		TriFunction_t<Integer, Integer, Integer, Integer> addTreeNums = (x, y, z) -> x + y + z;
		int result = addTreeNums.apply(3, 2, 5);
		System.out.println(result);
	}
}
