import tools.RandomGenerator;

// Class implementing Coffee interface, inherits drink() method
public class Latte implements Coffee {
	private int energy;
	private String drink = "Black coffee";

	public Latte() {
		// Uses RandomGenerator class
		energy = RandomGenerator.latteEnergy();
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub

	}

}
