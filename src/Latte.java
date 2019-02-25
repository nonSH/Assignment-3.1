import tools.RandomGenerator;

public class Latte implements Coffee{
	private int energy;
	private String drink = "Black coffee";
	
	public Latte() {
		energy = RandomGenerator.latteEnergy();
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

}
