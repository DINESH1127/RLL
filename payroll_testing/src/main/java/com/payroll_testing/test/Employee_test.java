package com.payroll_testing.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee_test {
	 @Test    
     public void executSessionOne() throws InterruptedException{
         //First session of WebDriver
		 System.setProperty("webdriver.chrome.driver", "F:\\Phase_5\\chromedriver.exe");
			// Step 1: load the chrome driver
		    WebDriver driver = new ChromeDriver(); // this intializes the chrome web browser
		    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			
			driver.get("http://localhost:4200/dashboard");
			driver.manage().window().maximize();
			Thread.sleep(1000);
						
			driver.findElement(By.xpath("//a[@href='emplogin']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dineshfrancis1127@gmail.com");
			Thread.sleep(1000);
								
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("dinesh");
			Thread.sleep(1000);
	
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			Thread.sleep(1000);
												
			driver.findElement(By.xpath("//button[@name='attendance']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-outline-danger']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@name='timesheet']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@name='schedule']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@name='leave']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			Thread.sleep(2000);
						
			driver.findElement(By.xpath("//button[@name='salary']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
			
			driver.close();

			
	 }
}