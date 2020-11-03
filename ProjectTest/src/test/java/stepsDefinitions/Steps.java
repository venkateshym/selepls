package stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Steps {
	public void method() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	}
	@Given("Chrome browser is Launched")
	public void chrome_browser_is_Launched() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	    
	}

	@When("Enter Search Item in Serach Area and Hit Search")
	public void enter_Search_Item_in_Serach_Area_and_Hit_Search() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.ENTER);
	}

	@Then("Search Result Should be displayed")
	public void search_Result_Should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//link[@href='https://www.selenium.dev/']"));
	}

}
