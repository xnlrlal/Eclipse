package kr.co.ezenac.templatemethod02;

public abstract class Player {

	final public void go(int count) {
		level();
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

	public abstract void level();

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

}
