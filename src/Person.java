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
		System.out.println(mEnergy +" :"+ mName);
	}

	// Method to adjust energy level, both static loss and gain when drinking coffee
	public void setEnergy(int energy) {
		mEnergy += energy;
	}

	@Override
	public void run() {
		while (mEnergy > 0) {
			setEnergy(-5);
			try {
				// Small delay so Thread is not locking program to one person
				Thread.sleep(200);
			} catch (Exception e) {}
			// Two if/else-statements to react to energy level
			if (mEnergy >= 100) {
				System.out.println(mName + " going back to work.");
				// Make person go to office
			} else if (mEnergy <= 30) {
				System.out.println(mName + " goes to get some coffee.");
				Coffee coffee = mBreakRoom.serveCoffee();
				setEnergy(coffee.drink());
				// Delay while drinking
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}

				System.out.println(mName + " consumes a " + coffee.drinkType() +
						" and now has " + mEnergy + " energy.");
				// One in five chance to create 5 bonus cups of coffee
				if (RandomGenerator.bonusCoffeeChance()) {
					mBreakRoom.bonusCoffee();
					System.out.println("5 drinks added!");

				}
				System.out.println("Drinks remaining in machine: " + mBreakRoom.remainingCoffee());
			}
		}
		System.out.println("Fuck this i'm going home.");
		// Delete person
	}
}