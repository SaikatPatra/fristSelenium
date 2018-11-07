package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartIphone {

	public static void main(String[] args) {
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fd.get("https://www.flipkart.com/");
		fd.manage().window().maximize();
		
	fd.findElement(By.xpath("//button[text()='✕']")).click();
    fd.findElement(By.name("q")).sendKeys("iphone ");
    Actions act = new Actions(fd);
    act.sendKeys(Keys.ENTER).perform();
    String str = fd.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
    //String str = fd.findElement(By.xpath("//span[@class='_2yAnYN')")).getText();
    System.out.println(str);

	}

}
