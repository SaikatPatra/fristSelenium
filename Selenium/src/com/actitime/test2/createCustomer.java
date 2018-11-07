package com.actitime.test2;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.actitime.genericlib.baseClass;
import com.actitime.genericlib.fileLib;

public class createCustomer extends baseClass
{
	@Test
	public void createCustomer() throws Throwable
	{
		fileLib flb = new fileLib();
		Properties pobj	=flb.getPropertyobj();
		String customerName=flb.getExcelData("Sheet1", 1, 2);
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
		@Test
		public void createCustomer2() throws Throwable
		{
		fileLib flb = new fileLib();
		Properties pobj	=flb.getPropertyobj();
		String customerName=flb.getExcelData("Sheet1", 2, 2);
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
