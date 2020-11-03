package com.ProjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://www.leafground.com/pages/Button.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		

		
		//get position of the button 
		WebElement button2 = driver.findElement(By.id("position"));
		Point buttonPoint = button2.getLocation();
		int xPosition =buttonPoint.getX();
		int YPosition =buttonPoint.getY();
		
		//get color of the button 
		WebElement button3 = driver.findElement(By.id("color"));
		String color = button3.getCssValue("background-color");
		System.out.println("color of the button" +color);
		
		
		//get size of the button 
		WebElement button4 = driver.findElement(By.id("size"));
		Dimension dim = button4.getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		System.out.println("height and width of the button is height" +height +"," +"width" +width);
		
		// click and go to home page
		WebElement button1 = driver.findElement(By.id("home"));
		button1.click();
		

	}

}
