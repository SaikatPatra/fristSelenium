package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonLogin {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://amazon.com");
		fd.manage().window().maximize();
		Thread.sleep(2000);
	fd.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();


		 fd.findElement(By.id("ap_email")).sendKeys("patra.saikat41@gmail.com");
	
	    fd.findElement(By.id("continue")).click();

	Thread.sleep(2000);
	 fd.findElement(By.id("ap_password")).sendKeys("Saikat8348");
	 fd.findElement(By.id("signInSubmit")).click();
	 Actions act = new Actions(fd);
	 WebElement we = fd.findElement(By.xpath("//span[text()='Hello, SAIKAT']"));
	 act.moveToElement(we).perform();
	 fd.findElement(By.xpath("//span[text()='Sign Out']")).click();
	 Thread.sleep(2000);
	 fd.close();
	 

	}

}
