package kr.co.ezenac.field02;

public class Fieldinit /* extends Object */ {

	byte byteField;				// 1byte
	short shortField;			// 2
	int intField;				// 4
	long longField;				// 8
	
	boolean booleanField;		// 1
	char charField;				// 2
	
	float floatField;			// 4
	double doubleField;			// 8
	
	// 참조형 변수
	int[] arrField;				// 4
	String strField;			// 4
	
	/*
	 * 클래스의 멤버 변수(필드)의 값들을 수시로 확인하고자 할 때나,
	 * 원하는 포맷으로 멤버변수들을 출력하고자 할 때 많이 사용함.
	 */
	@Override
	public String toString() {
		
		String str = " byteField: " + byteField +
					 "\n shortField: " + shortField +
					 "\n intField: " + intField +
					 "\n longField: " + longField +
					 "\n booleanField: " + booleanField +
					 "\n charField: " + charField +
					 "\n floatField: " + floatField +
					 "\n doubleField: " + doubleField +
					 "\n arrField: " + arrField +
					 "\n strField: " + strField;
		
		return str;
	}
	
}
