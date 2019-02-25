import java.util.Random;

public class Person implements Runnable {
	private Names mName;
	private int mEnergy;
	private Random rName = new Random();
	private Random rEnergy = new Random();

	public Person() {
		mName = Names.values()[rName.nextInt(Names.values().length)];
		mEnergy = rEnergy.nextInt(60) + 30;
	}

	public void name() {
		System.out.print(mName);
	}

	public void energy() {
		System.out.print(mEnergy);
	}

	public void setEnergy(int energy) {
		mEnergy += energy;
	}

	@Override
	public void run() {
		if (mEnergy >= 100) {
			System.out.println(mName + " going back to work.");
		}
		else if(mEnergy <= 30) {
			// Go get coffee
		}
		else if(mEnergy <= 0) {
			System.out.println("Fuck this i'm going home.");
		}
	}
}
