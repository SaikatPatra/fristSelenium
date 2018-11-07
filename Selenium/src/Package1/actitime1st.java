package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime1st {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().window().maximize();
		
		fd.get("http://localhost:8080/login.do");
		 fd.findElement(By.id("username")).sendKeys("admin");
		
		fd.findElement(By.name("pwd")).sendKeys("manager");
		
		 fd.findElement(By.id("loginButton")).click();
		 String expres = ("USERS");
		String actres= fd.findElement(By.xpath("//div[text()='USERS']")).getText();
		if(actres.equals(expres))
		{
			System.out.println("Home page displayed=== Pass");
		}
		else
		{
			System.out.println("Home page not displayed== Fail");
		}
		Thread.sleep(3000);
		fd.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		fd.close();
	
	}
}
