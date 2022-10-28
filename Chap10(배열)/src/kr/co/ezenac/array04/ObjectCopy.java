package kr.co.ezenac.array04;

import kr.co.ezenac.array02.Book;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("혼자 공부하는 컴퓨터 구조+운영체제", "강민철");
		library[1] = new Book("혼자 공부하는 컴퓨터 구조+운영체제2", "강민철2");
		library[2] = new Book("혼자 공부하는 컴퓨터 구조+운영체제3", "강민철3");
		library[3] = new Book("혼자 공부하는 컴퓨터 구조+운영체제4", "강민철4");
		library[4] = new Book("혼자 공부하는 컴퓨터 구조+운영체제5", "강민철5");

		System.arraycopy(library, 0, copyLibrary, 0, 5);

//		for(Book book : copyLibrary)
//			book.showInfo();

		library[0].setTitle("구글 엔지니어는 이렇게 일한다");
		library[0].setAuthor("타이터스 윈터스");

		System.out.println();

		for (Book book : library)
			book.showInfo();

		System.out.println();

		for (Book book : copyLibrary)
			book.showInfo();

	}
}
