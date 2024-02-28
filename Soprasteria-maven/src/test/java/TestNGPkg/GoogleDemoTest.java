package TestNGPkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumscripts.BaseClass;

public class GoogleDemoTest extends BaseClass{

	/*
	 * @BeforeTest public void invoke() { invokeBrowser("edge"); }
	 */

	@Test
	public void GoogleDemo() throws InterruptedException {
		WebElement searchBtn,luckyBtn;
		//	driver = new ChromeDriver();
		invokeBrowser("chrome");
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		WebElement search = driver.findElement(By.name("q"));
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> hints = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		int no = hints.size();//count of suggestions
		String suggestion;
		for(int i=0;i<no;i++)
		{
			//print all the suggestions google
			System.out.println(hints.get(i).getText());
			suggestion = hints.get(i).getText();
			//condition inside the loop
			if(suggestion.contains("selenium ide"))
			{
				hints.get(i).click();
				break;
			}
			else
				System.out.println("Keyword not matching");
		}
	}
	
	/*
	 * @AfterTest public void close() throws InterruptedException { closeBrowser();
	 * }
	 */
	
	@Test
	public void fbDemo()
	{
		invokeBrowser("firefox");
		driver.get("https://www.facebook.com/");
	}


}
