package com.mavenExample.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Move {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();// open the browser

		driver.manage().window().maximize();// maximize the windows

		driver.get("https://www.ebay.com/");

		//WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[5]/a"));

		//WebElement ele = driver.findElement(By.xpath("(//a[@class='ekit-menu-nav-link' and text()='Marketing & Promotion'])[3]"));

		WebElement ele = driver.findElement(By.xpath("(//a[text()='Sports'])[1]"));

		//WebElement ele = driver.findElement(By.xpath("//div[@ID='vl-flyout-nav']//ul/li/a[text()='Sports']"));

		Thread.sleep(100);

		Actions act=new Actions(driver);

		act.moveToElement(ele).build().perform();

		//act.doubleClick(ele).perform();

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//div[@ID=\"vl-flyout-nav\"]//ul/li/a[text()='Cycling']"));

		Thread.sleep(100);

		Actions action=new Actions(driver);

		act.doubleClick(element).perform();

		System.out.println("hi");
	}

}
