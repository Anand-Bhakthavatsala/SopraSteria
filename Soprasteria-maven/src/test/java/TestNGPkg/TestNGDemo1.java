package TestNGPkg;

import org.testng.annotations.Test;

public class TestNGDemo1 {

	@Test //Annotation which replace main() method
	public void welcome()
	{
		System.out.println("Welcome to the new topic - TestNG");
	}
	
	@Test //Annotation which replace main() method
	public void bye()
	{
		System.out.println("Done with the topic - TestNG");
	}
}
