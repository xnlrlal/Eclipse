package kr.co.ezenac.templatemethod02;

public class BeginnerLevel extends Player {
	@Override
	public void level() {
		System.out.println("******초급자 레벨입니다******");

	}

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("jump 못합니다.");

	}

	@Override
	public void turn() {
		System.out.println("turn 못합니다.");

	}

}
