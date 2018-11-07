package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actTime4 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 fd.get("http://localhost:8080/login.do");
		 fd.findElement(By.id("username")).sendKeys("admin");
		 fd.findElement(By.name("pwd")).sendKeys("manager");
		 fd.findElement(By.id("loginButton")).click();
		 Thread.sleep(5000);
		 fd.findElement(By.xpath("//div[text()='TASKS']")).click();
		 fd.findElement(By.xpath("//div[text()='Add New']")).click();
		 fd.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		 fd.findElement(By.id("customerLightBox_nameField")).sendKeys("Saikat Patra1");
		 fd.findElement(By.xpath("//span[text()='Create Customer']")).click();
		 WebElement wb = fd.findElement(By.xpath("(//div[@ class='title ellipsis'])[3]"));
		 String actres = wb.getText();
		 String expres = ("Saikat Patra1");
		 System.out.println(actres);
		 if(actres.equals(expres))
		 {
			 System.out.println("New customer name displayed== Pass");
		 }
		 else
		 {
			 System.out.println("Customer with the specified name already exists");
		 }
		 }
	

}
