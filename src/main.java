
public class main {

	public static void main(String[] args) {
		BreakRoom breakRoom = BreakRoom.getBreakRoom();

		Thread t1 = new Thread(new Person(breakRoom));
		Thread t2 = new Thread(new Person(breakRoom));
		Thread t3 = new Thread(new Person(breakRoom));
		Thread t4 = new Thread(new Person(breakRoom));
		Thread t5 = new Thread(new Person(breakRoom));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}

/*
 * 
 * To-do:
 * Two persons with same name?
 * 
 * MAKE PEOPLE GO HOME
 * 
 * What to do when no more coffee?
 * 
 * A person will NEVER get to 100 energy since only one drink is consumed per loop, while < 30 energy
 * possible solutions:
 * 1. increase energy dropped so a coffee has a chance to NOT cover energy dropped
 * 2. drop energy only when at office
 * 
 * Idea: remove ArrayList from break room and only have the one in coffee machine.
 * It's more reasonable to have the coffee stored in the machine rather than the room itself
 * Methods to return size, coffee and bonus coffee from machine will be created in break room
 */
