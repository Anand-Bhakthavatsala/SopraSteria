package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Then;

public class GoogleSearch {
	WebDriver driver;
	WebElement txtBox;
	@Given("browser is open")
	public void browser_is_open() {
	    // Open the browser
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("https://www.google.com/");
	}

	@Given("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	   txtBox = driver.findElement(By.name("q"));
	   txtBox.sendKeys("Selenium");
	    
	}

	@Then("hits enter")
	public void hits_enter() {
	    // Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		txtBox.sendKeys(Keys.ENTER); 
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to search results");
		String srchTitle = driver.getTitle();
		System.out.println(srchTitle);
	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
		driver.close();
	}

}
