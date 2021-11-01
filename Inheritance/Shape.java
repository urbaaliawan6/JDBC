package inheritance;

class Triangle {
 String s ="parents";
}
class Shape extends Triangle{
	String c= "child";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape p=new Shape();
		System.out.println("Programmer salary is:"+p.s );
	System.out.println("Bonus of Programmer is:"+p.c);

}
}

