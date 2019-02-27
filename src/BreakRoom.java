import java.util.ArrayList;

import tools.RandomGenerator;

// Singleton class for interactions between coffee machine, coffee, and persons
public class BreakRoom {
	private static BreakRoom obj;
	private static ArrayList<Coffee> coffeeArray;
	private CoffeeMachine machine;

	// Constructor. Called by getBreakRoom()
	private BreakRoom() {
		initiateBreakroom();
	}

	private void initiateBreakroom() {
		coffeeArray = new ArrayList<>();
		machine = new CoffeeMachine();
		coffeeArray = machine.getArray();
	}

	// Add bonus coffee to machine
	public void bonusCoffee() {
		for (int i = 0; i < 5; i++) {
			coffeeArray.add(machine.coffeeCup());
		}
	}

	// Returns first drink in ArrayList and removes it from "machine"
	public synchronized Coffee serveCoffee() {
		Coffee coffee = coffeeArray.get(0);
		coffeeArray.remove(0);
		return coffee;
	}

	// Get amount of drinks remaining
	public int remainingCoffee() {
		return coffeeArray.size();
	}

	// Constructs a BreakRoom if one is not already instantiated
	// "Synchronized" prevents accidental duplicates
	public static synchronized BreakRoom getBreakRoom() {
		if (obj == null) {
			obj = new BreakRoom();
		}
		return obj;
	}
}
