package kr.co.ezenac.abstractclass;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();

		NoteBook myNote = new MyNoteBook();
		myNote.typing();
	}

}
