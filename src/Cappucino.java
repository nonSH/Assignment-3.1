import tools.RandomGenerator;

// Class implementing Coffee interface, inherits drink() method
public class Cappucino implements Coffee {
	private int energy;
	private String drink = "Black coffee";

	public Cappucino() {
		// Uses RandomGenerator class
		energy = RandomGenerator.cappucinoEnergy();
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub

	}

}
