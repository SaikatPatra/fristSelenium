package com.actitime.test2;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.genericlib.baseClass;
import com.actitime.genericlib.fileLib;

public class creatUser extends baseClass
{
@Test
      public void createUser() throws Throwable
      {
      fileLib flb = new fileLib();
      Properties pobj=flb.getPropertyobj();
String fName= flb.getExcelData("Sheet1", 4, 2);
String lName=flb.getExcelData("Sheet1", 4, 3);
String email= flb.getExcelData("Sheet1", 4, 4);
String uName= flb.getExcelData("Sheet1", 4, 5);
String password=flb.getExcelData("Sheet1", 4, 6);
Thread.sleep(5000);
fd.findElement(By.xpath("//div[text()='USERS']")).click();
fd.findElement(By.xpath("//div[text()='Add User']")).click();
fd.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(fName);
fd.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lName);
fd.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
fd.findElement(By.id("userDataLightBox_usernameField")).sendKeys(uName);
fd.findElement(By.id("userDataLightBox_passwordField")).sendKeys(password);
fd.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(password);
fd.findElement(By.xpath("//span[text()='Create User']")).click();

      }
@Test
public void createUser2() throws Throwable
{
fileLib flb = new fileLib();
Properties pobj=flb.getPropertyobj();
String fName= flb.getExcelData("Sheet1", 5, 2);
String lName=flb.getExcelData("Sheet1", 5, 3);
String email= flb.getExcelData("Sheet1", 5, 4);
String uName= flb.getExcelData("Sheet1", 5, 5);
String password=flb.getExcelData("Sheet1", 5, 6);
Thread.sleep(5000);
fd.findElement(By.xpath("//div[text()='USERS']")).click();
fd.findElement(By.xpath("//div[text()='Add User']")).click();
fd.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(fName);
fd.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lName);
fd.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
fd.findElement(By.id("userDataLightBox_usernameField")).sendKeys(uName);
fd.findElement(By.id("userDataLightBox_passwordField")).sendKeys(password);
fd.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(password);
fd.findElement(By.xpath("//span[text()='Create User']")).click();
Thread.sleep(5000);

}
}
