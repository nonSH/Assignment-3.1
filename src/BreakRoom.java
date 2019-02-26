import java.util.ArrayList;

// Singleton class for interactions between coffee machine, coffee, and persons
public class BreakRoom {
	private static BreakRoom obj;
	private ArrayList<Coffee> coffeeArray;
	private CoffeeMachine machine;

	// Constructor. Called by getBreakRoom()
	private BreakRoom() {
		initiateBreakroom();
		coffeeArray.get(0).drink();
	}
	
	private void initiateBreakroom() {
		coffeeArray = new ArrayList<>();
		machine = new CoffeeMachine();
		coffeeArray = machine.getArray();
	}

	// Add bonus coffee to machine
	private void bonusCoffee() {
		for (int i = 0; i < 5; i++) {
			coffeeArray.add(machine.coffeeCup());
		}
	}

	// Constructs a BreakRoom if one is not already instantiated
	public static BreakRoom getBreakRoom() {
		if (obj == null) {
			obj = new BreakRoom();
		}
		return obj;
	}
}
