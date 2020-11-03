package com.ProjectTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//http://www.leafground.com/pages/Edit.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement emailfld = driver.findElement(By.id("email"));
		emailfld.sendKeys("user@mail.com");
		
		WebElement apptext = driver.findElement(By.xpath("//input[@type='text' and @value='Append ']"));
		apptext.sendKeys("Value");
		
		WebElement defaultText = driver.findElement(By.name("username"));
		String defValue = defaultText.getText();
		System.out.println(defValue);
		
		//Clear me!!
		driver.findElement(By.xpath("//input[@type='text' and @value='Clear me!!']")).clear();
		
	}

}
