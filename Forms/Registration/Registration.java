package Regis;


	import javax.swing.JFrame;
	import javax.swing.JTextField;

	public class Registration {

		public static void main(String args[])  
	    {  
	    JFrame f= new JFrame("RegistrationForm");  
	    JTextField t1,t2,t3,t4,t5;  
	    t1=new JTextField("Product_id");  
	    t1.setBounds(50,100, 200,30);  
	    t2=new JTextField("Product_name");  
	    t2.setBounds(50,150, 200,30); 
	    t3=new JTextField("Product_category");  
	    t3.setBounds(50,200, 200,30);  
	    t4=new JTextField("Product_price");  
	    t4.setBounds(50,250, 200,30);
	    t5=new JTextField("Product_expirydate");  
	    t5.setBounds(50,300, 200,30);  
	    f.add(t1); f.add(t2); f.add(t3); f.add(t4); f.add(t5);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	    }  
	    }  