package constructor;

public class polymorphism {

	void run() {
		System.out.println("Marks");
	}
	
	class constructor extends polymorphism {
		void run() {
			System.out.println("650");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		polymorphism  b = new polymorphism  ();
		b.run();
		
		}
}
