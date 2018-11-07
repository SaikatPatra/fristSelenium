package practiceBrowsercontrol;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FfDriverNavi {

	public static void main(String[] args) {
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		fd.navigate().to("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		fd.findElement(By.xpath("//a[@jsname='JFyozc']")).click();
		fd.navigate().back();
		fd.navigate().forward();
		fd.navigate().refresh();
		fd.manage().deleteAllCookies();
		fd.close();
		
	}

}
