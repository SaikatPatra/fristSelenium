package com.actitime.test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.genericlib.fileLib;

public class createCustomerTestNG {

	@Test
		
		public void createCustomer() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException
		
		 {
				fileLib flb = new fileLib();
			Properties pobj	=flb.getPropertyobj();
			String url=pobj.getProperty("Url");
			String un=pobj.getProperty("Username");
			String pwd=pobj.getProperty("Password");
			String customerName=flb.getExcelData("Sheet1", 1, 2);
			
			 FirefoxDriver fd = new FirefoxDriver();
			   fd.manage().window().maximize();
			   fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   fd.get(url);
			   fd.findElement(By.id("username")).sendKeys(un);
			   fd.findElement(By.name("pwd")).sendKeys(pwd);
			   fd.findElement(By.id("loginButton")).click();
			   Thread.sleep(5000);
				 fd.findElement(By.xpath("//div[text()='TASKS']")).click();
				 fd.findElement(By.xpath("//div[text()='Add New']")).click();
				 fd.findElement(By.xpath("//div[text()='+ New Customer']")).click();
				 fd.findElement(By.id("customerLightBox_nameField")).sendKeys(customerName);
				 fd.findElement(By.xpath("//span[text()='Create Customer']")).click();
				 WebElement wb = fd.findElement(By.xpath("//a[text()='All Customers']/../../div[@class='title ellipsis']"));
				 String actres = wb.getText();
				 System.out.println(actres);
				 if(actres.equals(customerName))
				 {
					 System.out.println("New customer name displayed== Pass");
				 }
				 else
				 
					 System.out.println("Customer with the specified name already exists==Fail");
				 }
				 
			   
			
			
			}
