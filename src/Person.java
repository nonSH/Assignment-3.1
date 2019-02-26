import java.util.Random;

public class Person implements Runnable {
	private Names mName;
	private int mEnergy;
	private Random rName = new Random();
	private Random rEnergy = new Random();

	// Constructor
	// COMMENT: 
	public Person() {
		// Pulls a random name from Names enum and generates a 
		// random energy level between 30-90
		mName = Names.values()[rName.nextInt(Names.values().length)];
		mEnergy = rEnergy.nextInt(60) + 30;
	}

	// Temporary methods. Remove
	public void name() {
		System.out.print(mName);
	}

	// Temporary methods. Remove
	public void energy() {
		System.out.print(mEnergy);
	}

	// Set-method used when drinking coffee
	public void setEnergy(int energy) {
		mEnergy += energy;
	}

	@Override
	public void run() {
		// Maybe a while-loop instead? while energy > 0 - do shit
		if (mEnergy >= 100) {
			System.out.println(mName + " going back to work.");
		} else if (mEnergy <= 30) {
			// Go get coffee
		} else if (mEnergy <= 0) {
			System.out.println("Fuck this i'm going home.");
			// Delete person
		}
	}
}
