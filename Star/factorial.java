package star;

public class factorial {

	
		// TODO Auto-generated method stub
	public static void main(String[] args) {
		int n = 6;
		int factorial = n;
		 for (int u = (n- 2); u> 1; u--) {
			 factorial = factorial * u;
		 }
		 System.out.println("Factorial of " + n + "is" + factorial);
		 }
	}
