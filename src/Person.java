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

	// Temporary method. Remove
	public void energy() {
		System.out.println(mEnergy + " :" + mName);
	}

	// Method to adjust energy level, both static loss and gain when drinking coffee
	public void setEnergy(int energy) {
		mEnergy += energy;
	}

	@Override
	public void run() {

		while (mEnergy > 0) {
			setEnergy(-15);
			try {
				// Small delay so Thread is not locking program to one person
				Thread.sleep(200);
			} catch (Exception e) {
			}

			if (mEnergy <= 30 && BreakRoom.getBreakRoom().remainingCoffee() != 0) {
				System.out.println(mName + " goes to get some coffee.");

				while (mEnergy <= 100 && BreakRoom.getBreakRoom().remainingCoffee() != 0) {
					Coffee coffee = mBreakRoom.serveCoffee();

					setEnergy(coffee.drink());
					System.out.println(mName + " consumes a " + coffee.drinkType() + " and now has " + mEnergy
							+ " energy. Drinks remaining: " + mBreakRoom.remainingCoffee());
					// Delay while drinking
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
					// One in five chance to create 5 bonus cups of coffee if if
					if (RandomGenerator.bonusCoffeeChance()) {
						mBreakRoom.bonusCoffee();
						System.out
								.println("5 drinks added! Current amount of drinks is " + mBreakRoom.remainingCoffee());
					}
				}
				if (mEnergy >= 100) {
					System.out.println(mName + " going back to work.");
				}
			} else if (BreakRoom.getBreakRoom().remainingCoffee() <= 0) {
				System.out.println(mName + " notices machine is empty.");
				break;
			}
		}
		// Output depending on how the main loop ended. Either ran out of coffee or
		// energy
		if (mEnergy < 0) {
			System.out.println(mName + " is out of energy and is going home.");
		} else {
			System.out.println("No coffee = no work. " + mName + " is going home.");
		}
	}
}