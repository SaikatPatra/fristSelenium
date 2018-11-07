package practiceBrowsercontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName {

	public static void main(String[] args) {
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://www.amazon.in/ref=nav_logo");
	int count = fd.findElements(By.tagName("a")).size();
	System.out.println(count);
		

	}

}
