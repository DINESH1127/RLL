package com.payroll_testing.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_test {
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
			
			
			driver.findElement(By.xpath("//a[@href='login']")).click();
			Thread.sleep(1000);
			
	    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dineshfrancis1127@gmail.com");
			Thread.sleep(1000);
					
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
			Thread.sleep(1000);
	
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(1000);
	 
			
			// adding employee
					
			
			driver.findElement(By.xpath("//a[@href='createemployee']")).click();
			Thread.sleep(2000);
		       
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vijay.ajith@gmail.com");
			Thread.sleep(1000);  
		    
			driver.findElement(By.xpath("//input[@name='fName']")).sendKeys("vijay");
			Thread.sleep(1000);  
		       
			driver.findElement(By.xpath("//input[@name='lName']")).sendKeys("Ajith");
			Thread.sleep(1000);  
		       
			driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("07-10-2000");
			Thread.sleep(1000);  
		       
			driver.findElement(By.xpath("//input[@value='male']")).click();
			Thread.sleep(1000);  
		       
			driver.findElement(By.xpath("//input[@name='location']")).sendKeys("Thiruvanmiyur");
			Thread.sleep(1000);  
		       
			driver.findElement(By.xpath("//input[@name='street']")).sendKeys("STR street");
			Thread.sleep(1000);  
			
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
			Thread.sleep(1000); 
			
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamil nadu");
			Thread.sleep(1000); 
			
			driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("600047");
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='mobNo']")).sendKeys("9584628641");
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("HelloAll258");
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//option[@value='Test engineer']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			
			
			// add attendance
			
			driver.findElement(By.xpath("//a[@href='empattendance']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//a[@href='createattendance']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='empId']")).sendKeys("10010");
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='date']")).sendKeys("22-10-2022");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//option[@value='present']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@href='loginsuccess']")).click();
			Thread.sleep(1000);
			
			//add timesheet 
			
			driver.findElement(By.xpath("//a[@href='timesheetlist']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//a[@href='createtimesheet']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='empId']")).sendKeys("10011");
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='date']")).sendKeys("42,2022");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='inTime']")).sendKeys("09:31AM");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='outTime']")).sendKeys("16:37PM");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//option[@id='8']")).click();
			Thread.sleep(1000);
							
			driver.findElement(By.xpath("//option[@type='1']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//option[@span='1']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//option[@value='10']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='mr-2 btn btn-success']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@href='loginsuccess']")).click();
			Thread.sleep(1000);
			
			
			//Schedule  list
			
			
			
			driver.findElement(By.xpath("//a[@href='schedulelist']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//a[@href='createschedule']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='empId']")).sendKeys("10011");
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='date']")).sendKeys("14-10-2022");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//option[@value='Morning']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='stime']")).sendKeys("09:00AM");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='etime']")).sendKeys("18:00PM");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//option[@value='9']")).click();
			Thread.sleep(1000);
						
			driver.findElement(By.xpath("//input[@value='Submit']")).click();   //check
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@href='loginsuccess']")).click();
			Thread.sleep(1000);
			
			
			
			
			
			//leave list
			
			
			driver.findElement(By.xpath("//a[@href='leavelist']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//a[@href='createleave']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='empId']")).sendKeys("10011");
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//option[@value='earned leave']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='startdate']")).sendKeys("01-10-2022");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='enddate']")).sendKeys("04-10-2022");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//option[@value='full day']")).click();
			Thread.sleep(1000);
							
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();   //check
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//a[@href='loginsuccess']")).click();
			Thread.sleep(1000);
			
			
			// salary list
			
			
			driver.findElement(By.xpath("//a[@href='salarylist']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='employeeid']")).sendKeys("10011");
			Thread.sleep(1000); 
			
			driver.findElement(By.xpath("//input[@name='bp']")).sendKeys("15000");
			Thread.sleep(1000); 
		       
			driver.findElement(By.xpath("//input[@name='da']")).sendKeys("7500");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@name='hra']")).sendKeys("7500");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='grosssalary']")).sendKeys("30000");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='pfamount']")).sendKeys("600");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@name='tax']")).sendKeys("300");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='deduction']")).sendKeys("900");
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//input[@name='netPay']")).sendKeys("29100");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='transdate']")).sendKeys("04-10-2022");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='m-3 btn']")).click();   //check
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@href='loginsuccess']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
			driver.close();

			
			
			
			
			   
		    
				      }
     }
     