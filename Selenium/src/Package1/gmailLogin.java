package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailLogin {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://gmail.com");
		fd.manage().window().maximize();
		WebElement wb1 = fd.findElement(By.id("identifierId"));
		wb1.sendKeys("patra.saikat41");
		Thread.sleep(2000);
		WebElement wb2 = fd.findElement(By.xpath("//span[text()='Next']"));
		wb2.click();
		Thread.sleep(2000);
		WebElement wb3 =fd.findElement(By.name("password"));
	wb3.sendKeys("Saikat83487");
		Thread.sleep(2000);
		
		WebElement wb4 = fd.findElement(By.xpath("//span[text()='Next']"));
		wb4.click();
		Thread.sleep(10000);
		WebElement wb5 = fd.findElement(By.xpath("//span[@class='gb_9a gbii']"));
		wb5.click();
		Thread.sleep(2000);
		WebElement wb6 = fd.findElement(By.xpath("//a[@class='gb_za gb_4f gb_ag gb_Pe gb_Fb']"));
		wb6.click();
		fd.close();
		


	}

}
