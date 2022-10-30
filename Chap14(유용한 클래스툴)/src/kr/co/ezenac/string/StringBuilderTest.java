package kr.co.ezenac.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String sql = new String("sql");

		StringBuilder buffer = new StringBuilder(java);
		// StringBuffer
		System.out.println(System.identityHashCode(buffer));
		buffer.append(sql);
		System.out.println(System.identityHashCode(buffer));

		System.out.println(buffer);
	}
}
