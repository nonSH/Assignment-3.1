import tools.RandomGenerator;

// Class implementing Coffee interface, inherits drink() method
public class Latte implements Coffee {
	private int energy;
	private String drink = "Latte";

	public Latte() {
		// Uses RandomGenerator class
		energy = RandomGenerator.latteEnergy();
	}

	@Override
	public int drink() {
		return energy;
	}
	@Override
	public String drinkType() {
		return drink;
	}


}
