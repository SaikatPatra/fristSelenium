package com.actitime.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	public WebDriver fd ;
	
	@BeforeClass
	public void lunchBrowser() throws Throwable
	{
		fd=new FirefoxDriver();
		fd.manage().window().maximize();
		 fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 fileLib fl =new fileLib();
		 Properties pobj	=fl.getPropertyobj();
			String url=pobj.getProperty("Url");
			fd.get(url);	
			}

	@BeforeMethod
	public void logIn() throws Throwable
	{
		fileLib flb = new fileLib();
		Properties pobj	=flb.getPropertyobj();
		String un=pobj.getProperty("Username");
		String pwd=pobj.getProperty("Password");
		fd.findElement(By.id("username")).sendKeys(un);
		fd.findElement(By.name("pwd")).sendKeys(pwd);
		fd.findElement(By.id("loginButton")).click();
		
	}
	@AfterMethod
	public void logOut()
	{
		fd.findElement(By.id("logoutLink")).click();
	}
	
	@AfterClass
	public void closeBroser()
	{
		fd.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
