import java.util.ArrayList;

import tools.RandomGenerator;

public class CoffeeMachine {
	ArrayList<Coffee> list;
	CoffeeFactory factory;

	// Constructor. Creates 20 cups of coffee and returns ArrayList to main
	public CoffeeMachine() {
		list = new ArrayList<>();
		factory = new CoffeeFactory();
		for (int i = 0; i < 20; i++) {
			list.add(factory.getCoffee(RandomGenerator.randomCoffeeType()));
		}
	}

	public ArrayList<Coffee> getArray() {
		return list;
	}

	// method to create bonus coffee cup
	public Coffee coffeeCup() {

		Coffee c = factory.getCoffee(RandomGenerator.randomCoffeeType());
		System.out.println(c);
		return c;
	}
}
