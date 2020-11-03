package com.ProjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.By;
import org.openqa.selenium.support.How;

public class PageObject {
	WebDriver driver;
	public PageObject(WebDriver driver) {
		driver = this.driver;
		
	}
	@FindBy(className="hmsprite logo")
	WebElement logo;
	
	@FindBy(how=How.XPATH, using="//span[@class='hmsprite logo']")
	WebElement logo1;
	
	@FindBy(how=How.CSS, using=".animate")
	WebElement account;

}
