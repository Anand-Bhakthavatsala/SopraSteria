package RediffTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import RediffPages.RediffHomePage;
import RediffPages.RediffLoginPage;
import junit.framework.Assert;

public class RediffLoginTC {
	
	WebDriver driver;
	RediffHomePage rhp;
	RediffLoginPage rlp;
	
	@BeforeTest
	public void invoke()
	{
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//TestNG
	@SuppressWarnings("deprecation")
	@Test //1st test case
	public void rediffLogin() throws InterruptedException //1st test case
	{
		/*
		 * //rediff login page rlp = new RediffLoginPage(driver);
		 * rlp.userName().sendKeys("admin");//calling the method -> passing the value
		 * rlp.password().sendKeys("admin123"); Thread.sleep(2000);
		 * rlp.signIn().click();//error msg
		 	
		//go-to home page
		rlp.rediffHome().click();*/	
		
		//rediff home page
		rhp = new RediffHomePage(driver);
		rhp.news().click();//navigating to news page
		Thread.sleep(3000);
		rhp.sports().click();
		String aTitle = driver.getTitle();//capture the current page title
		System.out.println(aTitle);
		String eTitle = "Sports news, Cricket, Hockey, Tennis, Football, Formula 1, Live Cricket Score"; //exptected title
		Assert.assertEquals(aTitle, eTitle);	
		
	}
	
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	

}
