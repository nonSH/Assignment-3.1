import tools.RandomGenerator;

public class Cappucino implements Coffee{
	private int energy;
	private String drink = "Black coffee";
	
	public Cappucino() {
		energy = RandomGenerator.cappucinoEnergy();
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

}
