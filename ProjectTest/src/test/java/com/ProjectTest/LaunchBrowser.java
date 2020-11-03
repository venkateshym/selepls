package com.ProjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class LaunchBrowser {
	
	public void drivers() {
	Logger log = LogManager.getLogger(LaunchBrowser.class.getName());
	
	
//STC
//
//Suite
//Test
//Class
//Method
	
	WebDriverManager.chromedriver().setup();
	WebDriverManager.firefoxdriver().setup();
	
	WebDriver driver = new ChromeDriver();
	}
	
	//@Test
	public void launchBrowser1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.phptravels.net/");

		//driver.get("http://www.leafground.com/");
		
		////div[contains(@class,"row-reverse")]//child::div[4]//button[contains(text(),"Search")]
		
		//http://www.leafground.com/
		WebDriverWait wait  = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'row-reverse')]//child::div//button[contains(text(),'Search')]")));
		//log.error("Ms");
		System.out.println("The title of webpage is"+" "+driver.getTitle());	
		driver.manage().window().maximize();
		//Thread.sleep(220);
		//driver.findElement(By.cssSelector(".animate")).click();
		
		//driver.findElement(By.cssSelector(cssSelector)("//div[contains(@class,'dropdown-login')]")).click();


		//PageObject pd = new PageObject(driver);
		//pd.account.click();
		
		
		//driver.close();
		//driver.quit();
	}
		@Test
		public void GotoGoogle() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.co.in/");
			driver.findElement(By.name("q")).sendKeys("agriculture"+Keys.ENTER);
			

		}		
		
	}
	

