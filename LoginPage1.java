package paraBank;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	
	public WebDriver driver;
	String Url ="https://parabank.parasoft.com/parabank/index.htm";
	 public  void Login1(WebDriver driver) throws IOException, InterruptedException {
		this.driver = driver;
		FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(f);
		 XSSFSheet s = workbook.getSheetAt(1);
		 Thread.sleep(3000);
	    WebElement UserName = driver.findElement(By.xpath(s.getRow(0).getCell(0).getStringCellValue()));
	     UserName.sendKeys(s.getRow(0).getCell(1).getStringCellValue());
	    
	     WebElement Password = driver.findElement(By.xpath(s.getRow(1).getCell(0).getStringCellValue()));
	  Password.sendKeys(s.getRow(1).getCell(1).getStringCellValue());
	     WebElement Login= driver.findElement(By.xpath(s.getRow(2).getCell(0).getStringCellValue()));
        Login.click();
	 }
	 public void Login2(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
	    FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	     XSSFWorkbook workbook = new XSSFWorkbook(f);
	    XSSFSheet s = workbook.getSheetAt(1);
		Thread.sleep(3000);
		 WebElement Register = driver.findElement(By.linkText(s.getRow(3).getCell(0).getStringCellValue()));
		 Register.click();
		 WebElement FirstName = driver.findElement(By.xpath(s.getRow(4).getCell(0).getStringCellValue()));
	     FirstName.sendKeys(s.getRow(4).getCell(1).getStringCellValue());
	   WebElement LastName = driver.findElement(By.xpath(s.getRow(5).getCell(0).getStringCellValue()));
	  LastName.sendKeys(s.getRow(5).getCell(1).getStringCellValue());
	  WebElement Street = driver.findElement(By.xpath(s.getRow(6).getCell(0).getStringCellValue()));
	     Street.sendKeys(s.getRow(6).getCell(1).getStringCellValue());	    
	     WebElement City = driver.findElement(By.xpath(s.getRow(7).getCell(0).getStringCellValue()));
	 City.sendKeys(s.getRow(7).getCell(1).getStringCellValue());
	 WebElement State = driver.findElement(By.xpath(s.getRow(8).getCell(0).getStringCellValue()));
     State.sendKeys(s.getRow(8).getCell(1).getStringCellValue());
     Thread.sleep(1000);
     WebElement ZipCode = driver.findElement(By.xpath(s.getRow(9).getCell(0).getStringCellValue()));
     ZipCode.sendKeys(s.getRow(9).getCell(1).getStringCellValue());
     WebElement PhoneNumber= driver.findElement(By.xpath(s.getRow(10).getCell(0).getStringCellValue()));
     PhoneNumber.sendKeys(s.getRow(10).getCell(1).getStringCellValue());
     WebElement Ssn = driver.findElement(By.xpath(s.getRow(11).getCell(0).getStringCellValue()));
     Ssn.sendKeys(s.getRow(11).getCell(1).getStringCellValue());
     WebElement UserName1= driver.findElement(By.xpath(s.getRow(12).getCell(0).getStringCellValue()));
     UserName1.sendKeys(s.getRow(12).getCell(1).getStringCellValue());	    
     WebElement Password1 = driver.findElement(By.xpath(s.getRow(13).getCell(0).getStringCellValue()));
     Password1.sendKeys(s.getRow(13).getCell(1).getStringCellValue());
     WebElement ConfPassword1 = driver.findElement(By.xpath(s.getRow(14).getCell(0).getStringCellValue()));
     ConfPassword1.sendKeys(s.getRow(14).getCell(1).getStringCellValue());
     Thread.sleep(2000);
     WebElement ClickReg = driver.findElement(By.xpath(s.getRow(15).getCell(0).getStringCellValue()));
     ClickReg.click();
     Thread.sleep(1000);
	 }
	 public void Login3(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1);
			 Thread.sleep(3000);
		    WebElement UserName = driver.findElement(By.xpath(s.getRow(0).getCell(0).getStringCellValue()));
		     UserName.sendKeys(s.getRow(0).getCell(2).getStringCellValue());
		    
		     WebElement Password = driver.findElement(By.xpath(s.getRow(1).getCell(0).getStringCellValue()));
		  Password.sendKeys(s.getRow(1).getCell(2).getStringCellValue());
		     WebElement Login= driver.findElement(By.xpath(s.getRow(2).getCell(0).getStringCellValue()));
	        Login.click();
	 }
	 public void Login4(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1);
			 Thread.sleep(3000);
		    WebElement UserName = driver.findElement(By.xpath(s.getRow(0).getCell(0).getStringCellValue()));
		     UserName.sendKeys(s.getRow(0).getCell(3).getStringCellValue());
		    
		     WebElement Password = driver.findElement(By.xpath(s.getRow(1).getCell(0).getStringCellValue()));
		  Password.sendKeys(s.getRow(1).getCell(2).getStringCellValue());
		     WebElement Login= driver.findElement(By.xpath(s.getRow(2).getCell(0).getStringCellValue()));
	        Login.click(); 
	 }
	 public void Login5(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1);
			 Thread.sleep(3000);
		    WebElement UserName = driver.findElement(By.xpath(s.getRow(0).getCell(0).getStringCellValue()));
		     UserName.sendKeys(s.getRow(0).getCell(2).getStringCellValue());		    
		     WebElement Password = driver.findElement(By.xpath(s.getRow(1).getCell(0).getStringCellValue()));
		  Password.sendKeys(s.getRow(1).getCell(3).getStringCellValue());
		     WebElement Login= driver.findElement(By.xpath(s.getRow(2).getCell(0).getStringCellValue()));
	        Login.click(); 
	 }
	 public void Login6(WebDriver driver) throws InterruptedException, IOException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1); 
			 Thread.sleep(3000);
			    WebElement UserName = driver.findElement(By.xpath(s.getRow(0).getCell(0).getStringCellValue()));
			     UserName.sendKeys(s.getRow(0).getCell(2).getStringCellValue());			    
			     WebElement ResetPassword = driver.findElement(By.linkText(s.getRow(3).getCell(1).getStringCellValue()));
			  ResetPassword.click();
			  WebElement FirstNam = driver.findElement(By.xpath(s.getRow(4).getCell(2).getStringCellValue()));
			     FirstNam.sendKeys(s.getRow(4).getCell(3).getStringCellValue());		    
			     WebElement LastNam = driver.findElement(By.xpath(s.getRow(5).getCell(2).getStringCellValue()));
			 LastNam.sendKeys(s.getRow(5).getCell(3).getStringCellValue()); 
			 WebElement Street1 = driver.findElement(By.xpath(s.getRow(6).getCell(2).getStringCellValue()));
		     Street1.sendKeys(s.getRow(6).getCell(3).getStringCellValue());	    
		     WebElement City1 = driver.findElement(By.xpath(s.getRow(7).getCell(2).getStringCellValue()));
		 City1.sendKeys(s.getRow(7).getCell(3).getStringCellValue());
		 Thread.sleep(1000);
		 WebElement State1 = driver.findElement(By.xpath(s.getRow(8).getCell(2).getStringCellValue()));
	     State1.sendKeys(s.getRow(8).getCell(3).getStringCellValue());
	     Thread.sleep(1000);
	     WebElement ZipCode1 = driver.findElement(By.xpath(s.getRow(9).getCell(2).getStringCellValue()));
	     ZipCode1.sendKeys(s.getRow(9).getCell(3).getStringCellValue());
	     WebElement Ssn1 = driver.findElement(By.xpath(s.getRow(10).getCell(2).getStringCellValue()));
	     Ssn1.sendKeys(s.getRow(10).getCell(3).getStringCellValue());
	     WebElement ClickButtn = driver.findElement(By.xpath(s.getRow(11).getCell(2).getStringCellValue()));
	     ClickButtn.click();
	 }
	 public void UpdateProfile(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1); 
			 Thread.sleep(3000); 
			 WebElement link= driver.findElement(By.linkText(s.getRow(12).getCell(2).getStringCellValue()));
		     link.click(); 
			 WebElement CusName= driver.findElement(By.xpath(s.getRow(13).getCell(2).getStringCellValue()));
		     CusName.sendKeys(s.getRow(13).getCell(3).getStringCellValue()); 
		     WebElement LastNam = driver.findElement(By.xpath(s.getRow(14).getCell(2).getStringCellValue()));
			 LastNam.sendKeys(s.getRow(14).getCell(3).getStringCellValue()); 
			 WebElement Street1 = driver.findElement(By.xpath(s.getRow(15).getCell(2).getStringCellValue()));
		     Street1.sendKeys(s.getRow(15).getCell(3).getStringCellValue());	    
		     WebElement City1 = driver.findElement(By.xpath(s.getRow(16).getCell(2).getStringCellValue()));
		 City1.sendKeys(s.getRow(16).getCell(3).getStringCellValue());
		 Thread.sleep(1000);
		 WebElement State1 = driver.findElement(By.xpath(s.getRow(17).getCell(2).getStringCellValue()));
	     State1.sendKeys(s.getRow(17).getCell(3).getStringCellValue());
	     Thread.sleep(1000);
	     WebElement ZipCode1 = driver.findElement(By.xpath(s.getRow(18).getCell(2).getStringCellValue()));
	     ZipCode1.sendKeys(s.getRow(18).getCell(3).getStringCellValue());
	     WebElement UpdateButtn = driver.findElement(By.xpath(s.getRow(19).getCell(2).getStringCellValue()));
	     UpdateButtn.click();
	 }
	 public void UpdateProfile1(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1); 
			 Thread.sleep(3000); 
			 WebElement link= driver.findElement(By.linkText(s.getRow(12).getCell(2).getStringCellValue()));
		     link.click(); 
			 WebElement CusName= driver.findElement(By.xpath(s.getRow(13).getCell(2).getStringCellValue()));
		     CusName.sendKeys(s.getRow(13).getCell(3).getStringCellValue()); 
		     WebElement LastNam = driver.findElement(By.xpath(s.getRow(14).getCell(2).getStringCellValue()));
			 LastNam.sendKeys(s.getRow(14).getCell(3).getStringCellValue()); 
			 WebElement Street1 = driver.findElement(By.xpath(s.getRow(15).getCell(2).getStringCellValue()));
		     Street1.sendKeys(s.getRow(15).getCell(3).getStringCellValue());	    
		     WebElement City1 = driver.findElement(By.xpath(s.getRow(16).getCell(2).getStringCellValue()));
		 City1.sendKeys(s.getRow(16).getCell(3).getStringCellValue());
		 Thread.sleep(1000);
		 WebElement State1 = driver.findElement(By.xpath(s.getRow(17).getCell(2).getStringCellValue()));
	     State1.sendKeys(s.getRow(17).getCell(3).getStringCellValue());
	     Thread.sleep(1000);
	     WebElement ZipCode1 = driver.findElement(By.xpath(s.getRow(18).getCell(2).getStringCellValue()));
	     ZipCode1.sendKeys(s.getRow(18).getCell(3).getStringCellValue());
	     WebElement phone = driver.findElement(By.xpath(s.getRow(20).getCell(2).getStringCellValue()));
	     phone.sendKeys(s.getRow(20).getCell(3).getStringCellValue());
	     WebElement UpdateButtn = driver.findElement(By.xpath(s.getRow(19).getCell(2).getStringCellValue()));
	     UpdateButtn.click();
	 }
	 public void UpdateProfile2(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1); 
			 Thread.sleep(3000); 
			 WebElement link= driver.findElement(By.linkText(s.getRow(12).getCell(2).getStringCellValue()));
		     link.click(); 
			 WebElement CusName= driver.findElement(By.xpath(s.getRow(13).getCell(2).getStringCellValue()));
		     CusName.sendKeys(s.getRow(13).getCell(3).getStringCellValue()); 
		     WebElement LastNam = driver.findElement(By.xpath(s.getRow(14).getCell(2).getStringCellValue()));
			 LastNam.sendKeys(s.getRow(14).getCell(3).getStringCellValue()); 
			 WebElement Street1 = driver.findElement(By.xpath(s.getRow(15).getCell(2).getStringCellValue()));
		     Street1.sendKeys(s.getRow(15).getCell(3).getStringCellValue());	    
		     WebElement City1 = driver.findElement(By.xpath(s.getRow(16).getCell(2).getStringCellValue()));
		 City1.sendKeys(s.getRow(16).getCell(3).getStringCellValue());
		 Thread.sleep(1000);
		 WebElement State1 = driver.findElement(By.xpath(s.getRow(17).getCell(2).getStringCellValue()));
	     State1.sendKeys(s.getRow(17).getCell(3).getStringCellValue());
	     Thread.sleep(1000);
	     WebElement ZipCode1 = driver.findElement(By.xpath(s.getRow(18).getCell(2).getStringCellValue()));
	     ZipCode1.sendKeys(s.getRow(18).getCell(4).getStringCellValue());
	     WebElement phone = driver.findElement(By.xpath(s.getRow(20).getCell(2).getStringCellValue()));
	     phone.sendKeys(s.getRow(20).getCell(3).getStringCellValue());
	     WebElement UpdateButtn = driver.findElement(By.xpath(s.getRow(19).getCell(2).getStringCellValue()));
	     UpdateButtn.click();
	 }
	 public void TransferFunds(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1); 
			 Thread.sleep(3000); 
			 WebElement link1= driver.findElement(By.linkText(s.getRow(16).getCell(0).getStringCellValue()));
		     link1.click(); 
		     Thread.sleep(1000);
		     WebElement Amount = driver.findElement(By.xpath(s.getRow(17).getCell(0).getStringCellValue()));
		     Amount.sendKeys(s.getRow(17).getCell(1).getStringCellValue());
		     WebElement TransButtn = driver.findElement(By.xpath(s.getRow(18).getCell(0).getStringCellValue()));
		     TransButtn.click();
		     Thread.sleep(1000);
	 }
	 public void InvalidTransferFunds(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1); 
			 Thread.sleep(3000); 
			 WebElement link1= driver.findElement(By.linkText(s.getRow(16).getCell(0).getStringCellValue()));
		     link1.click(); 
		     Thread.sleep(1000);
		     WebElement Amount = driver.findElement(By.xpath(s.getRow(17).getCell(0).getStringCellValue()));
		     Amount.sendKeys(s.getRow(16).getCell(1).getStringCellValue());
		     WebElement TransButtn = driver.findElement(By.xpath(s.getRow(18).getCell(0).getStringCellValue()));
		     TransButtn.click();
		     Thread.sleep(1000);
	 }
	 public void BillPay(WebDriver driver) throws IOException, InterruptedException {
		 this.driver = driver;
			FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(f);
			 XSSFSheet s = workbook.getSheetAt(1); 
			 Thread.sleep(3000); 
			 WebElement link1= driver.findElement(By.linkText(s.getRow(19).getCell(0).getStringCellValue()));
		     link1.click(); 
		     WebElement Nam = driver.findElement(By.xpath(s.getRow(20).getCell(0).getStringCellValue()));
			 Nam.sendKeys(s.getRow(20).getCell(1).getStringCellValue()); 
			 WebElement Street0 = driver.findElement(By.xpath(s.getRow(21).getCell(0).getStringCellValue()));
		     Street0.sendKeys(s.getRow(21).getCell(1).getStringCellValue());	    
		     WebElement City1 = driver.findElement(By.xpath(s.getRow(22).getCell(0).getStringCellValue()));
		 City1.sendKeys(s.getRow(22).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 WebElement State1 = driver.findElement(By.xpath(s.getRow(23).getCell(0).getStringCellValue()));
	     State1.sendKeys(s.getRow(23).getCell(1).getStringCellValue());
	     Thread.sleep(1000);
	     WebElement SendButtn = driver.findElement(By.xpath(s.getRow(24).getCell(0).getStringCellValue()));
	     SendButtn.click();
	     Thread.sleep(1000);
}
}