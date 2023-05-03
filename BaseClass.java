package paraBank;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	public WebDriver driver;
	String Url ="https://parabank.parasoft.com/parabank/index.htm";
	 public  void Login(WebDriver driver) throws IOException, InterruptedException {
		this.driver = driver;
		FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(f);
		 XSSFSheet s = workbook.getSheetAt(1);
		 Thread.sleep(3000);
	    WebElement UserName = driver.findElement(By.xpath(s.getRow(0).getCell(0).getStringCellValue()));
	     UserName.sendKeys(s.getRow(0).getCell(1).getStringCellValue());
	    
	     WebElement Password = driver.findElement(By.xpath(s.getRow(1).getCell(0).getStringCellValue()));
	  Password.sendKeys(s.getRow(1).getCell(1).getStringCellValue());
	     WebElement login= driver.findElement(By.xpath(s.getRow(2).getCell(0).getStringCellValue()));
        login.click();
	 }
	 public  void ContactUs(WebDriver driver) throws IOException, InterruptedException {
			this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1);
			 Thread.sleep(3000);
			 WebElement link= driver.findElement(By.linkText(s.getRow(25).getCell(0).getStringCellValue()));
		        link.click();
}
	 public  void ValidContactUs(WebDriver driver) throws IOException, InterruptedException {
			this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1);
			 Thread.sleep(3000);
			 WebElement link= driver.findElement(By.linkText(s.getRow(25).getCell(0).getStringCellValue()));
		        link.click();
		        WebElement Name = driver.findElement(By.xpath(s.getRow(21).getCell(2).getStringCellValue()));
			     Name.sendKeys(s.getRow(21).getCell(3).getStringCellValue());			    
			     WebElement Email = driver.findElement(By.xpath(s.getRow(22).getCell(2).getStringCellValue()));
			  Email.sendKeys(s.getRow(22).getCell(3).getStringCellValue()); 
			  WebElement Phone = driver.findElement(By.xpath(s.getRow(23).getCell(2).getStringCellValue()));
			    Phone.sendKeys(s.getRow(23).getCell(3).getStringCellValue());			    
			     WebElement Message = driver.findElement(By.xpath(s.getRow(24).getCell(2).getStringCellValue()));
			  Message.sendKeys(s.getRow(24).getCell(3).getStringCellValue()); 
			  WebElement Button= driver.findElement(By.linkText(s.getRow(25).getCell(2).getStringCellValue()));
		        Button.click();
}	 
	 public  void InValidContactUs(WebDriver driver) throws IOException, InterruptedException {
			this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1);
			 Thread.sleep(3000);
			 WebElement link= driver.findElement(By.linkText(s.getRow(25).getCell(0).getStringCellValue()));
		        link.click();
		        WebElement Name1 = driver.findElement(By.xpath(s.getRow(21).getCell(2).getStringCellValue()));
			     Name1.sendKeys(s.getRow(21).getCell(3).getStringCellValue());			    
			     WebElement Email1 = driver.findElement(By.xpath(s.getRow(22).getCell(2).getStringCellValue()));
			  Email1.sendKeys(s.getRow(22).getCell(4).getStringCellValue()); 
			  WebElement Phone = driver.findElement(By.xpath(s.getRow(23).getCell(2).getStringCellValue()));
			    Phone.sendKeys(s.getRow(23).getCell(3).getStringCellValue());			    
			     WebElement Message = driver.findElement(By.xpath(s.getRow(24).getCell(2).getStringCellValue()));
			  Message.sendKeys(s.getRow(24).getCell(3).getStringCellValue()); 
			  WebElement Button= driver.findElement(By.linkText(s.getRow(25).getCell(2).getStringCellValue()));
		        Button.click();
}	 	 
	 public  void InValidContactUs1(WebDriver driver) throws IOException, InterruptedException {
			this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1);
			 Thread.sleep(3000);
			 WebElement link= driver.findElement(By.linkText(s.getRow(25).getCell(0).getStringCellValue()));
		        link.click();
		        WebElement Name2 = driver.findElement(By.xpath(s.getRow(21).getCell(2).getStringCellValue()));
			     Name2.sendKeys(s.getRow(21).getCell(4).getStringCellValue());			    
			     WebElement Email1 = driver.findElement(By.xpath(s.getRow(22).getCell(2).getStringCellValue()));
			  Email1.sendKeys(s.getRow(22).getCell(4).getStringCellValue()); 
			  WebElement Phone = driver.findElement(By.xpath(s.getRow(23).getCell(2).getStringCellValue()));
			    Phone.sendKeys(s.getRow(23).getCell(3).getStringCellValue());			    
			     WebElement Message = driver.findElement(By.xpath(s.getRow(24).getCell(2).getStringCellValue()));
			  Message.sendKeys(s.getRow(24).getCell(3).getStringCellValue()); 
			  WebElement Button= driver.findElement(By.linkText(s.getRow(25).getCell(2).getStringCellValue()));
		        Button.click();
}	 	 
}