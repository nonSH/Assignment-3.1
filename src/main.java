import java.util.ArrayList;

public class main {


	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Person());
		t1.start();
	}
}
