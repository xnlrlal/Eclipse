package kr.co.ezenac.templatemethod02;

public class AdvancedLevel extends Player {
	
	@Override
	public void level() {
		System.out.println("******중급자 레벨입니다******");
		
	}

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("높이 jump 합니다.");

	}

	@Override
	public void turn() {
		System.out.println("turn 못합니다.");

	}


}
