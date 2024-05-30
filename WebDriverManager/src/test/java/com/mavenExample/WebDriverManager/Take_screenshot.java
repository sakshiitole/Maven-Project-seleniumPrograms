package com.mavenExample.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        TakesScreenshot ts =(TakesScreenshot) driver ;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des=new File("C:\\screenshots2\\ebay.png");
        FileHandler.copy(src, des);// TODO Auto-generated method stub


	}

}
