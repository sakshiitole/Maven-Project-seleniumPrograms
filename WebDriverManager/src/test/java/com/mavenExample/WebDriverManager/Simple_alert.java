package com.mavenExample.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();// open the browser
		
		driver.manage().window().maximize();// maximize the windows
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(500);

        Alert a = driver.switchTo().alert();
        Thread.sleep(500);

        System.out.println(a.getText());
        Thread.sleep(500);

        a.accept();
        Thread.sleep(500);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("login1")).sendKeys("Sakshi");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(500);

        Alert a1= driver.switchTo().alert();
        Thread.sleep(500);
        System.out.println(a.getText());
        Thread.sleep(500);
        a.accept();
        Thread.sleep(500);
        
        driver.findElement(By.id("password")).sendKeys("abcd");
        driver.quit();
        

	}

}
