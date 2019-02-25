import java.util.ArrayList;

public class BreakRoom {
	private static BreakRoom obj;
	ArrayList<Coffee> coffeeArray;
	CoffeeMachine machine;
	private BreakRoom() {
		coffeeArray = new ArrayList<>();
		machine = new CoffeeMachine();
		coffeeArray = machine.getArray();
		bonusCoffee();
		coffeeArray.get(0).drink();
		int i = 1;
		
	}
	// Add bonus coffee to machine
	private void bonusCoffee() {
		for (int i = 0; i < 5; i++) {
			coffeeArray.add(machine.coffeeCup());
		}
	}
	public static BreakRoom getBreakRoom() {
		if(obj==null) {
			obj = new BreakRoom();
		}
		return obj;
	}
}
