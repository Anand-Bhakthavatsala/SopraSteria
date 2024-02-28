package TestNGPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo {
	private static WebDriver driver;
  @Test
  public void TC1() {
	  System.out.println("Test case 1");
	  driver.get("https://www.javatpoint.com/testng-tutorial");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method got invoked");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method got invoked");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class got invoked");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class got invoked");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test got invoked");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  System.out.println("After Test got invoked");
	  Thread.sleep(2000);
	  driver.close();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite got invoked");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite got invoked");
  }

}
