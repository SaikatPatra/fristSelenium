package Package1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class link {

	public static void main(String[] args) {
	FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://gmail.com");
		String title= fd.getTitle();
		System.out.println(title);
		if(title.equals("Gmail"))
		{
			System.out.println("Login page displayed=> Pass");
		}
		
		else
		{
			System.out.println("Login page not  displayed=> Fail");
		}
//     String pageurl = fd.getCurrentUrl();
//     System.out.println(pageurl);
//     String pagehtmlsource = fd.getPageSource();
//     System.out.println(pagehtmlsource);

	}

}
