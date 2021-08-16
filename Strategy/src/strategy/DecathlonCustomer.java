package strategy;


abstract class DecathlonCustomer {
	
	static String name1= "Ganesha"; 
	static int age1 = 21;
	
	static String name2= "Chethan"; 
	static int age2 = 22;
	
	iDiscountCalculator iCC; 
	
	DecathlonCustomer(){}
	
	public void calculateDiscount(double mrptotal) { 
		iCC.calculateBillAmount(mrptotal); 
	}
	
	public void display1() { 
		System.out.println("Name is "+ name1 + " \nAge is " + age1); 
	}
	
	public void display2() { 
		System.out.println("Name is "+ name2 + " \nAge is " + age2); 
	}

}

