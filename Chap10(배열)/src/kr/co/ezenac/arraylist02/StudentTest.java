package kr.co.ezenac.arraylist02;

/*
 *  Ezen 학원에 학생이 3명 있습니다.
 *  각 학생마다 읽은 책을 기록하고 있습니다.
 *  학생마다 읽은 책을 Student 클래스 내에 ArrayList를 생성하여 관리하도록 합니다.
 *  다음과 같이 출력되게 클래스를 만들어서 실행하시오.
 *  
 *  Lee 학생이 읽은 책은 : 운영체제1, 운영체제2 입니다.
 *  Shin 학생이 읽은 책은 : 딥러닝1, 딥러닝2, 딥러닝3 입니다.
 *  Kim 학생이 읽은 책은 : 머신러닝1, 머신러닝2, 머신러닝3, 머신러닝4, 머신러닝5, 머신러닝6 입니다.
 */

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentL = new Student("Lee");
		studentL.addBook("운영체제1");
		studentL.addBook("운영체제2");
		
		Student studentS = new Student("Shin");
		studentS.addBook("딥러닝1");
		studentS.addBook("딥러닝2");
		studentS.addBook("딥러닝3");
		
		Student studentK = new Student("Kim");
		studentK.addBook("머신러닝1");
		studentK.addBook("머신러닝2");
		studentK.addBook("머신러닝3");
		studentK.addBook("머신러닝4");
		studentK.addBook("머신러닝5");
		studentK.addBook("머신러닝6");
		
		studentL.showInfo();
		System.out.println();
		studentS.showInfo();
		System.out.println();
		studentK.showInfo();
		
	}

}
