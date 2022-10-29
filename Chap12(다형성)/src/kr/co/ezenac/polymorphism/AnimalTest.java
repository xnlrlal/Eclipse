package kr.co.ezenac.polymorphism;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eat() {
		System.out.println("동물이 먹습니다.");
	}
}

class Dog extends Animal {
	@Override
	public void move() {
		System.out.println("개가 네 발로 걷습니다.");
	}

	public void playBall() {
		System.out.println("개가 견주가 던진 공을 물어옵니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {

	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}

	public void pickUp() {
		System.out.println("독수리가 물고기를 채갑니다.");
	}
}

public class AnimalTest {

	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public void checkDownCast(ArrayList<Animal> list) {

		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);

			if (animal instanceof Dog) {
				Dog danimal = (Dog) animal;
				danimal.playBall();
			} else if (animal instanceof Tiger) {
				Tiger tanimal = (Tiger) animal;
				tanimal.hunt();
			} else if (animal instanceof Eagle) {
				Eagle eanimal = (Eagle) animal;
				eanimal.pickUp();
			} else {
				System.out.println("error");
			}
		}
	}

	public static void main(String[] args) {
		Animal dAnimal = new Dog();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		AnimalTest test = new AnimalTest();

		test.moveAnimal(dAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);

		System.out.println();

		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(dAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);

		for (Animal animal : animalList) {
			animal.move();
		}

		System.out.println();

		test.checkDownCast(animalList);

	}
}
