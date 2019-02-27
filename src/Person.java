import java.util.Random;

import tools.RandomGenerator;

public class Person implements Runnable {
	private Names mName;
	private int mEnergy;
	private Random rName = new Random();
	private Random rEnergy = new Random();
	private BreakRoom mBreakRoom;

	// Constructor
	public Person(BreakRoom breakRoom) {
		// Pulls a random name from Names enum and generates a
		// random energy level between 30-90
		mName = Names.values()[rName.nextInt(Names.values().length)];
		mEnergy = rEnergy.nextInt(60) + 30;
		mBreakRoom = breakRoom;
	}

	// Temporary methods. Remove
	public void name() {
		System.out.print(mName);
	}

	// Temporary methods. Remove
	public void energy() {
		System.out.print(mEnergy);
	}

	// Set-method used when drinking coffee. Remove this later
	public void setEnergy(int energy) {
		mEnergy += energy;
		System.out.println(mEnergy);
	}

	@Override
	public void run() {
		while (mEnergy > 0) {
			setEnergy(-1);
			// System.out.println(mName + " has "+mEnergy+ " energy.");
			if (mEnergy >= 100) {
				System.out.println(mName + " going back to work.");
			} else if (mEnergy <= 30) {
				System.out.println(mName + " goes to get some coffee.");
				Coffee coffee = mBreakRoom.serveCoffee();
				mEnergy += coffee.drink();

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}

				System.out.println(mName + " consumes a " + coffee.drinkType() +
						" and now has " + mEnergy + " energy.");
				if (RandomGenerator.bonusCoffeeChance()) {
					mBreakRoom.bonusCoffee();
					System.out.println("5 drinks added!");

				}
				System.out.println("Drinks remaining in machine: " + mBreakRoom.remainingCoffee());

				// System.out.println("Coffee machine has
				// "+BreakRoom.getBreakRoom().remainingCoffee()+" drinks remaining.");
			}
		}

		System.out.println("Fuck this i'm going home.");
		// Delete person

	}
}
