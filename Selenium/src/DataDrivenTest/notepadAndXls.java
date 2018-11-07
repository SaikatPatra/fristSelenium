package DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class notepadAndXls {

	public static void main(String[] args) throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream fis =new FileInputStream("./Data/CommonData.properties");
		Properties pobjt = new Properties();
		pobjt.load(fis);
		String un=pobjt.getProperty("Username");
		String pw=pobjt.getProperty("Password");
		String url=pobjt.getProperty("Url");
		FileInputStream fis2= new FileInputStream("./Data/TestData.xlsx");
		Workbook wbf=WorkbookFactory.create(fis2);
		Sheet sh=wbf.getSheet("Sheet1");
		Row r1=sh.getRow(1);
		String customername=r1.getCell(2).getStringCellValue();
		wbf.close();
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 fd.get(url);
		 fd.findElement(By.id("username")).sendKeys(un);
		 fd.findElement(By.name("pwd")).sendKeys(pw);
		 fd.findElement(By.id("loginButton")).click();
		 Thread.sleep(5000);
		 fd.findElement(By.xpath("//div[text()='TASKS']")).click();
		 fd.findElement(By.xpath("//div[text()='Add New']")).click();
		 fd.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		 fd.findElement(By.id("customerLightBox_nameField")).sendKeys(customername);
		 fd.findElement(By.xpath("//span[text()='Create Customer']")).click();
		 WebElement wb = fd.findElement(By.xpath("//a[text()='All Customers']/../../div[@class='title ellipsis']"));
		 String actres = wb.getText();
		 System.out.println(actres);
		 if(actres.equals(customername))
		 {
			 System.out.println("New customer name displayed== Pass");
		 }
		 else
		 
			 System.out.println("Customer with the specified name already exists==Fail");
		 }
		 
		 
		 
		 
	}

