package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amaoneNokia {

	public static void main(String[] args) {
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fd.get("https://www.amazon.in");
		fd.manage().window().maximize();
		
	fd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
    Actions act = new Actions(fd);
    act.sendKeys(Keys.ENTER).perform();
    String str = fd.findElement(By.id("s-result-count")).getText();
    System.out.println(str);

	}

}
