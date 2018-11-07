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
import org.openqa.selenium.firefox.FirefoxDriver;

public class createUser {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		FileInputStream fis =new FileInputStream("./Data/CommonData.properties");
		Properties pobjt = new Properties();
		pobjt.load(fis);
		String un=pobjt.getProperty("Username");
		String pw=pobjt.getProperty("Password");
		String url=pobjt.getProperty("Url");
		
		FileInputStream fis2= new FileInputStream("./Data/TestData.xlsx");
		Workbook wbf=WorkbookFactory.create(fis2);
		Sheet sh=wbf.getSheet("Sheet1");
		Row r2=sh.getRow(4);
		String fristname=r2.getCell(2).getStringCellValue();
		Row r3=sh.getRow(4);
		String lastname=r3.getCell(3).getStringCellValue();
		Row r4=sh.getRow(4);
		String email=r4.getCell(4).getStringCellValue();
		Row r5=sh.getRow(4);
		String username=r5.getCell(5).getStringCellValue();
	    Row r6=sh.getRow(4);
	   String password= r6.getCell(6).getStringCellValue();
	   FirefoxDriver fd = new FirefoxDriver();
	   fd.manage().window().maximize();
	   fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   fd.get(url);
	   fd.findElement(By.id("username")).sendKeys(un);
		 fd.findElement(By.name("pwd")).sendKeys(pw);
		 fd.findElement(By.id("loginButton")).click();
	   
	   
	    Thread.sleep(5000);
		 fd.findElement(By.xpath("//div[text()='USERS']")).click();
		 fd.findElement(By.xpath("//div[text()='Add User']")).click();
		 fd.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(fristname);
		 fd.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lastname);
		 fd.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
		 fd.findElement(By.id("userDataLightBox_usernameField")).sendKeys(username);
		 fd.findElement(By.id("userDataLightBox_passwordField")).sendKeys(password);
		 fd.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(password);
		 fd.findElement(By.xpath("//span[text()='Create User']")).click();
		
	}

}
