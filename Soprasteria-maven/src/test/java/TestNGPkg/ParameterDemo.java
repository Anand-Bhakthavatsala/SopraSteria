package TestNGPkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	@Test
	@Parameters({"val1","val2"})
	public void sum(int i1,int i2)
	{
		int add = i1+i2;
		System.out.println(add);
	}
	
	@Test
	@Parameters({"val3","val4"})
	public void mul(int i1,int i2)
	{
		int mul = i1*i2;
		System.out.println(mul);
	}

}
