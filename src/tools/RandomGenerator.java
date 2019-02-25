package tools;

import java.util.Random;

public class RandomGenerator {
	public static int blackEnergy() {
		Random r = new Random();
		int i = r.nextInt(20) + 20;
		return i;
	}

	public static int cappucinoEnergy() {
		Random r = new Random();
		int i = r.nextInt(10) + 20;
		return i;
	}

	public static int latteEnergy() {
		Random r = new Random();
		int i = r.nextInt(10) + 25;
		return i;
	}

	public static String randomCoffeeType() {
		Random r = new Random();
		int i = r.nextInt(3);
		String type = " ";
		switch (i) {
		case 0:
			type = "BLACK";
			break;
		case 1:
			type = "CAPPUCINO";
			break;
		case 2:
			type = "LATTE";
			break;
		}
		return type;
	}

	public static boolean bonusCoffeeChance() {
		Random r = new Random();
		int i = r.nextInt(5);
		boolean bool = false;

		switch (i) {
		case 0:
			bool = false;
			break;
		case 1:
			bool = false;
			break;
		case 2:
			bool = false;
			break;
		case 3:
			bool = false;
			break;
		case 4:
			bool = true;
			break;

		}
		return bool;
	}
}
