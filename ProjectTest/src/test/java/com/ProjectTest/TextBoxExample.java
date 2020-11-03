package com.ProjectTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class TextBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//http://www.leafground.com/pages/Edit.html
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		/*
		 * enter email id in te field 
		 */
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("user@mail.com");
		
		//append text to the existing text
		////input[@value='Append ']
		WebElement appendText = driver.findElement(By.xpath("//input[@value='Append ']"));
		appendText.sendKeys("added text");

		//aim to get text but Text is returned as null
		////input[@value='TestLeaf']
		WebElement getDefaultText = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		//String Text = getDefaultText.getText();
		String Text = getDefaultText.getAttribute("Value");
		System.out.println("Default text in the Textarea is:" +Text);
		
		//clear the text in the text area 
		////input[@value='Clear me!!']
		WebElement clearText = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clearText.clear();
		
		//text box is disabled to check the status 
		////label[@for='disabled']//following-sibling::input
		WebElement disabledText = driver.findElement(By.xpath("//label[@for='disabled']//following-sibling::input"));
		boolean b = disabledText.isEnabled();
		System.out.println("Textarea is Enabled :" +b);
		

	}

}
