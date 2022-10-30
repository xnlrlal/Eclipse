package kr.co.ezenac.templatemethod02;

public class Play {

	public static void main(String[] args) {

		Player bPlayer = new BeginnerLevel();
		bPlayer.go(1);

		Player aPlayer = new AdvancedLevel();
		aPlayer.go(2);

		Player sPlayer = new SuperLevel();
		sPlayer.go(3);

	}

}
