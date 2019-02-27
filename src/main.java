
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
 */
