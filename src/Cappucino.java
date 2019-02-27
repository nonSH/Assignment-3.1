import tools.RandomGenerator;

// Class implementing Coffee interface, inherits drink() method
public class Cappucino implements Coffee {
	private int energy;
	private String drink = "Cappucino";

	public Cappucino() {
		// Uses RandomGenerator class
		energy = RandomGenerator.cappucinoEnergy();
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
