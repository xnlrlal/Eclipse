package kr.co.ezenac.singleton02;

public class CarFactory {

	private static Car instance = new Car();

	private CarFactory() {

	}

	public static Car getInstance() {
		if (instance == null)
			instance = new Car();

		return instance;
	}

}
