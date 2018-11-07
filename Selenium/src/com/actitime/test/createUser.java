package com.actitime.test;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.genericlib.fileLib;

public class createUser {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException{
		//create object of generic fileLib
		
		fileLib flb = new fileLib();
		
		//read common data from PROPERTIESFILE USING generic fileLib
		
	 Properties pobj= flb.getPropertyobj();
	 String url= pobj.getProperty("Url");
	 String un= pobj.getProperty("Username");
	 String pwd=pobj.getProperty("Password");
	 //read data from excel sheet using generic fileLib
	 
	 
	 String fName= flb.getExcelData("Sheet1", 4, 2);
     String lName=flb.getExcelData("Sheet1", 4, 3);
	 String email= flb.getExcelData("Sheet1", 4, 4);
     String uName= flb.getExcelData("Sheet1", 4, 5);
     String password=flb.getExcelData("Sheet1", 4, 6);
     
     //login
     FirefoxDriver fd = new FirefoxDriver();
	   fd.manage().window().maximize();
	   fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   fd.get(url);
	   fd.findElement(By.id("username")).sendKeys(un);
		 fd.findElement(By.name("pwd")).sendKeys(pwd);
		 fd.findElement(By.id("loginButton")).click();
	   
	   //create user
	    Thread.sleep(5000);
		 fd.findElement(By.xpath("//div[text()='USERS']")).click();
		 fd.findElement(By.xpath("//div[text()='Add User']")).click();
		 fd.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(fName);
		 fd.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lName);
		 fd.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
		 fd.findElement(By.id("userDataLightBox_usernameField")).sendKeys(uName);
		 fd.findElement(By.id("userDataLightBox_passwordField")).sendKeys(password);
		 fd.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(password);
		 fd.findElement(By.xpath("//span[text()='Create User']")).click();
     
    
	}

}
