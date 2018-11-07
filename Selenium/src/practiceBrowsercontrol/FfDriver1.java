package practiceBrowsercontrol;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FfDriver1 {
	public static void main(String[] args) {
		FirefoxDriver fd = new FirefoxDriver(); //lunch a browser
		fd.get("https://gmail.com");  //open a link
		fd.manage().window().maximize();  // maximized the window
		Dimension dim = new Dimension(100,400);
		fd.manage().window().setSize(dim);//customized the window size
		

}
}