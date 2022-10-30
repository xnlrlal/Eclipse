package kr.co.ezenac.object;

/*
 *  날짜를 구현한 클래스 MyDate가 있습니다.
 *  날짜가 같으면 equals() 메서드 결과가 true가 되도록 구현하시오.
 *  
 *  hashCode() 메서드도 구현해보시오.
 */

class MyDate_t {

	int day;
	int month;
	int year;

	public MyDate_t(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate_t) {
			MyDate_t date = (MyDate_t) obj;
			if (this.day == date.day && this.month == date.month && this.year == date.year)
				return true;
			return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return day*10 + month*101 + year*1001;
	}
}

public class MyDateTest_t {

	public static void main(String[] args) {

		MyDate_t date1 = new MyDate_t(5, 9, 2022);
		MyDate_t date2 = new MyDate_t(5, 9, 2022);

		System.out.println(date1.equals(date2));
		
//		System.out.println(date1.hashCode());
//		System.out.println(date2.hashCode());

	}

}
