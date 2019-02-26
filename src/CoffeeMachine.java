import java.util.ArrayList;

import tools.RandomGenerator;

public class CoffeeMachine {
	private ArrayList<Coffee> list;
	private CoffeeFactory factory;

	// Constructor
	public CoffeeMachine() {
		initiateCoffee();
	}
	
	// Create 20 cups of coffee and returns ArrayList to main
	private void initiateCoffee() {
		list = new ArrayList<>();
		factory = new CoffeeFactory();
		for (int i = 0; i < 20; i++) {
			list.add(factory.getCoffee(RandomGenerator.randomCoffeeType()));
		}
	}
	
	// Used to gain access to array from other parts of the program
	public ArrayList<Coffee> getArray() {
		return list;
	}

	// method for creating one bonus cup of coffee
	public Coffee coffeeCup() {

		Coffee c = factory.getCoffee(RandomGenerator.randomCoffeeType());
		return c;
	}
}
