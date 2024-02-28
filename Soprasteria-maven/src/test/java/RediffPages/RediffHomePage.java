package RediffPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By news = By.linkText("NEWS");//learning the objects
	By sports = By.linkText("SPORTS");
	
	//create method
	public WebElement news()
	{
		//driver.findElement(By.linkText("NEWS"));
		return driver.findElement(news);
	}
	
	public WebElement sports()
	{
		//driver.findElement(By.linkText("NEWS"));
		return driver.findElement(sports);
	}
	
	
}
