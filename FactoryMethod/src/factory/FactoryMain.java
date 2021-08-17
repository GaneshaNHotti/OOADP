package factory;

public class FactoryMain {
	public static void main(String args[])
	{
	Customer c;
	CategoryFactory cf=new CategoryFactory();
	c=cf.category("Teen");
	c=cf.category("Aged");
	c=cf.category("kidds");

}
	}
