package Package1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fd.get("https://facebook.com");
		 fd.findElement(By.id("email")).sendKeys("patra.saikat41@gmail.com");
		
		fd.findElement(By.id("pass")).sendKeys("facebookfb");
		
		 fd.findElement(By.id("u_0_2")).click();		 
		  String expres = ("Home");
		 WebElement wb = fd.findElement(By.xpath("//a[text()='Home']"));
	  String actres = wb.getText();
	if(actres.equals(expres))
	{
		System.out.println("Home is displayed==== pass");
	}
	else{
		System.out.println("Home is not displayed==== fail");
	}
	fd.findElement(By.id("userNavigationLabel")).click();
	
	fd.findElement(By.xpath("//div/div/ul/li[8]/a/span/span[@class='_54nh']")).click();
	fd.close();
	
	
	}
	}

