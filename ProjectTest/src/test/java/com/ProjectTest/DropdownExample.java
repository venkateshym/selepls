package com.ProjectTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.event.ActionEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;



public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// select by index
		//id="dropdown1"
		WebElement drp1 = driver.findElement(By.id("dropdown1"));
		Select seldrp1 = new Select(drp1);
		//Appium selection
		seldrp1.selectByIndex(2);


		//select by value 
		WebElement valueSelection = driver.findElement(By.name("dropdown2"));

		Select seldrp2 = new Select(valueSelection);
		//UFT/QTP
		seldrp2.selectByValue("3");
		//name="dropdown2"


		//select by visible text
		//id="dropdown3"
		//Loadrunner

		WebElement seldrp3 = driver.findElement(By.id("dropdown3"));
		Select drp3 = new Select(seldrp3);
		drp3.selectByVisibleText("Loadrunner");

		//get the no of dropdown options
		//select[@class='dropdown']/options
		WebElement options =		driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select drp4 = new Select(options);		 
		List <WebElement> dr4p = drp4.getOptions();
		int s = dr4p.size();
		System.out.println(s);


		//sendkeys to select 
		//class="example"
		WebElement drp5 =		driver.findElement(By.xpath("//section[@class='innerblock']//div[5]/select"));
		drp5.sendKeys("Appium");

		//select multiple
		WebElement drp6 =		driver.findElement(By.xpath("//section[@class='innerblock']//div[6]/select"));
		Select psrd = new Select(drp6);
		psrd.selectByIndex(1);
		psrd.selectByIndex(2);
		psrd.selectByIndex(3);
		//actions act = new ActionEvent();




	}

}
