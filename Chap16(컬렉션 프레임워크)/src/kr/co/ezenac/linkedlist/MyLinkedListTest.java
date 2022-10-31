package kr.co.ezenac.linkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();

		list.insertElement(3, "D");
		list.printAll();

		list.removeElement(0);
		list.printAll();

		list.removeElement(1);
		list.printAll();

		list.insertElement(0, "A01");
		list.printAll();
		System.out.println(list.getSize());
	
		list.removeElement(0);
		list.printAll();
		System.out.println(list.getSize());
		
		list.removeAll();
		list.printAll();
		
		list.addElement("B");
		list.addElement("A");
		list.printAll();
	}
}
