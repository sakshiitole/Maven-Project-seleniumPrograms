package com.mavenExample.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swaglabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     
     driver.manage().window().maximize();
     driver.get("https://www.saucedemo.com/v1/");
     
     WebElement element=driver.findElement(By.name("user-name"));
     element.sendKeys("standard_user");
     WebElement pass=driver.findElement(By.id("password"));
     pass.sendKeys("secret_sauce");
     WebElement login=driver.findElement(By.id("login-button"));
     login.click();
     
     String currentwindowhandle =driver.getWindowHandle();
     driver.switchTo().window(currentwindowhandle);
     
     WebElement element2=driver.findElement(By.linkText("Sauce Labs Backpack"));
     element2.click();
     
     WebElement cart=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
     cart.click();
     
     WebElement remove=driver.findElement(By.linkText("REMOVE"));
     remove.click();
     
     
     
	}

}
