package RediffPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//userName,password,signIn,rediffHome

	By userName = By.xpath("");
	By password = By.cssSelector("");
	By signIn = By.name("");
	By rediffHome = By.linkText("");

	//create method
	public WebElement userName()
	{
		//driver.findElement(By.linkText("NEWS"));
		return driver.findElement(userName);
	}
	
	public WebElement password()
	{
		//driver.findElement(By.linkText("NEWS"));
		return driver.findElement(password);
	}
	
	public WebElement signIn()
	{
		//driver.findElement(By.linkText("NEWS"));
		return driver.findElement(signIn);
	}
	
	public WebElement rediffHome()
	{
		//driver.findElement(By.linkText("NEWS"));
		return driver.findElement(rediffHome);
	}


}
