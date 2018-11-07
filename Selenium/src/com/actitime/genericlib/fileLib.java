package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileLib {
	public Properties getPropertyobj() throws IOException
	{
		
	FileInputStream fis1 =new FileInputStream("./Data/CommonData.properties");
	Properties pobj = new Properties();
	pobj.load(fis1);
	return pobj;
	}
		
	public String getExcelData(String SheetName,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis2= new FileInputStream("./Data/TestData2.xlsx");
		Workbook wb=WorkbookFactory.create(fis2);
		Sheet sh=wb.getSheet(SheetName);
		Row r=sh.getRow(rownum);
	    String data =r.getCell(cellnum).getStringCellValue();
		return data;
	}

}
