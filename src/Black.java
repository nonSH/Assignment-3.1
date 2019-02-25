import java.util.Random;
import tools.RandomGenerator;

public class Black implements Coffee {
	private int energy;
	private String drink = "Black coffee";
	
	public Black() {
		energy = RandomGenerator.blackEnergy();
	}
	@Override
	public void drink() {
		// return energy level so person drinking it can....
	}

}
