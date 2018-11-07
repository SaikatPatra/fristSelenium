package testNG;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class customernameTestNG {
	@Test(dataProvider="getData")
	public void createCustomer(String objtarr) throws Throwable{
		FileInputStream fis1 =new FileInputStream("./Data/CommonData.properties");
		Properties pobjt = new Properties();
		pobjt.load(fis1);
		String un=pobjt.getProperty("Username");
		String pw=pobjt.getProperty("Password");
		String url=pobjt.getProperty("Url");

		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 fd.get(url);
		 fd.findElement(By.id("username")).sendKeys(un);
		 fd.findElement(By.name("pwd")).sendKeys(pw);
		 fd.findElement(By.id("loginButton")).click();
		 Thread.sleep(5000);
		 fd.findElement(By.xpath("//div[text()='TASKS']")).click();
		 fd.findElement(By.xpath("//div[text()='Add New']")).click();
		 fd.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		 fd.findElement(By.id("customerLightBox_nameField")).sendKeys(objtarr);
		 fd.findElement(By.xpath("//span[text()='Create Customer']")).click();
		 WebElement wb = fd.findElement(By.xpath("//a[text()='All Customers']/../../div[@class='title ellipsis']"));
		 String actres = wb.getText();
		 System.out.println(actres);
		 if(actres.equals(objtarr))
		 {
			 System.out.println("New customer name displayed== Pass");
		 }
		 else
		 
			 System.out.println("Customer with the specified name already exists==Fail");
		 }


	
		}
