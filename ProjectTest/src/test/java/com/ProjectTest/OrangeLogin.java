package com.ProjectTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class OrangeLogin {
	public WebDriver driver;
	
	
	@BeforeTest
	public void loginToApplication()
	{
		WebDriverManager.chromedriver().setup();
		
	}
	
	@Test
	//public void loginTest(String uname, String pword)
		public void loginTest(){
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement uNameField = driver.findElement(By.id("txtUsername"));
		uNameField.sendKeys("uname");
		WebElement pWordField = driver.findElement(By.id("txtPassword"));
		pWordField.sendKeys("pword");
		WebElement button = driver.findElement(By.id("btnLogin"));
		
		
	}
	
	/*@AfterTest
	public void closeApplication()
	{
		driver.close();
	}
*/
}
