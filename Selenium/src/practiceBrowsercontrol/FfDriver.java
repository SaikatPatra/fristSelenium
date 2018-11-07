package practiceBrowsercontrol;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FfDriver {

	public static void main(String[] args) {
		FirefoxDriver fd = new FirefoxDriver(); //lunch a browser
		fd.get("https://gmail.com");  //open a link
		fd.manage().window().maximize();  // maximized the window
		fd.getTitle();// capture the title of the page
		System.out.println(fd.getTitle());// print the title of the page
		fd.getCurrentUrl();//capture the url of the page
		System.out.println(fd.getCurrentUrl());//print the url of the page
		//fd.getPageSource();//capture the entire html code of the page
		fd.close(); // close the current window where control present
		
	}

}
