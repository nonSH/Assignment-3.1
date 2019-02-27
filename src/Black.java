import tools.RandomGenerator;

//Class implementing Coffee interface, inherits drink() method
public class Black implements Coffee {
	private int energy;
	private String drink = "Black coffee";
	
	public Black() {
		//Uses RandomGenerator class
		energy = RandomGenerator.blackEnergy();
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
