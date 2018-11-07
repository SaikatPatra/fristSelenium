package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime3 {

	public static void main(String[] args) {
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().window().maximize();
		
		fd.get("http://localhost:8080/login.do");
		WebElement wb=fd.findElement(By.xpath("//img[@src='/img/default/login/timer.png?hash=1388610907']"));
		Boolean logo = wb.isDisplayed();
		if(logo==true)
		{
			System.out.println("Logo is present==Pass");
		}
		else{
			System.out.println("Logo is not present==Fail");
		}
	}

}
