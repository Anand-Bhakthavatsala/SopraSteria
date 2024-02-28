package TestNGPkg;

import org.testng.annotations.Test;

public class MathDemo {

	@Test (priority=0,groups= {"smoke","regression"})//Annotation which act a main method
	public void sum()
	{
		System.out.println("Addition demonstration");
		add(34,45);
	}
	
	@Test (priority=1,groups= {"regression"})//Annotation which act a main method
	public void sub()
	{
		System.out.println("Aubtraction demonstration");
		sub(40,12);
	}
	
	public static void add(int num1, int num2) //user defined method
	{
		int a=num1,b=num2;
		System.out.println("Sum of a & b is : : "+(a+b));
	}
	
	public static void sub(int num1, int num2) //user defined method
	{
		//int a=num1,b=num2;
		System.out.println("Sub of a & b is : : "+(num1-num2));
	}

}
