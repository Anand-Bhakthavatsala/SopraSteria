package seleniumscripts;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class TestRelativeLocators extends BaseClass{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		invokeBrowser("Chrome");
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		//Relative locator - selenium 4
		WebElement email = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
		email.sendKeys("test@gmail.com");

		WebElement city = driver.findElement(with(By.tagName("input")).below(By.tagName("select")));
		city.sendKeys("Delhi");

		WebElement link = driver.findElement(with(By.partialLinkText("THE ")).near(By.linkText("Signin")));
		//link.click();

		WebElement leftOf =
				driver.findElement(with(By.linkText("Signin")).toLeftOf(By.xpath(
						"(//*[@id=\"load_form\"]/div[1]/div[2]/input)[2]"))); 
		File leftScrn =
				leftOf.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(leftScrn, new
						File("./scrshot/left.jpg"));

				leftOf.click();	//login page
	}

}
