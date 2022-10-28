package kr.co.ezenac.singleton02;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCarName("car1");

		Car car2 = new Car();
		car2.setCarName("car2");

		System.out.println(car1.getCarName() + ", " + car1.getCarId());
		System.out.println(car2.getCarName() + ", " + car2.getCarId());

		System.out.println(Car.carNumber);

		Car car3 = CarFactory.getInstance();
		Car car4 = CarFactory.getInstance();

		System.out.println(Car.carNumber);
//		System.out.println(Car.carNumber);
	}

}
