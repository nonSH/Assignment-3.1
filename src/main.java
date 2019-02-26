
public class main {


	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Person());
		t1.start();
	}
}

/*
 * Added comments
 * Created initiateCoffee() as own method instead of calling it in constructor
 * Created initiateBreakroom() as own method instead of calling it in constructor
 * 
 * To-do:
 * Create a coffee room in main, perhaps send as argument in Person as pointer?
 * Drink() methods for each coffee
 */
