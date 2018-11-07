package Package1;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actiTime2 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().window().maximize();
		
		fd.get("http://localhost:8080/login.do");
		 fd.findElement(By.id("username")).sendKeys("adm");
		
		fd.findElement(By.name("pwd")).sendKeys("manager");
		
		 fd.findElement(By.id("loginButton")).click();
		 //error msg verifiry.....................
		 String expres = ("Username or Password is invalid. Please try again.");
		WebElement wb = fd.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		String actres=wb.getText();
		if(actres.equals(expres))		{
			System.out.println("Massege displayed=== Pass");
		}
		else
		{
			System.out.println("Massege not displayed== Fail");
		}
//		Thread.sleep(3000);
		//colour of the error msg...........................
	String	actcolor=wb.getCssValue("color");
	System.out.println(actcolor);
	Thread.sleep(3000);
	System.out.println("frontsize of the error msg.........");
	Dimension dem = wb.getSize();
	System.out.println(dem.getHeight());
	System.out.println(dem.getWidth());
	Thread.sleep(3000);
	System.out.println("Location of the error msg...........");
	Point loc = wb.getLocation();
	System.out.println(loc.getX());
	System.out.println(loc.getY());
	Thread.sleep(3000);
		fd.close();
	
	}
}
