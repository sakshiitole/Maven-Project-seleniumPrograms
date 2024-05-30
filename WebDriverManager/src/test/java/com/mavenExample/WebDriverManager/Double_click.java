package com.mavenExample.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		//double click
		WebElement ele=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Thread.sleep(100);
		
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		
		act.doubleClick(ele).perform();
		Thread.sleep(2000);
		
		//right click
		WebElement ele1=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Thread.sleep(2000);
		
		Actions act1=new Actions(driver);
		act.contextClick(ele1).build().perform();
		
		act.contextClick(ele1).perform();
		Thread.sleep(2000);
		
		
	}

}
