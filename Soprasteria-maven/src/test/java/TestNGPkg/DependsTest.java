package TestNGPkg;

import org.testng.annotations.Test;

public class DependsTest {
	
	@Test (dependsOnMethods= {"openBrowser"})
	public void signIn()
	{
		System.out.println("This will execute sign in");
	}
	
	@Test 
	public void openBrowser()
	{
		System.out.println("This will execute first(open browser)");
	}
	

}
