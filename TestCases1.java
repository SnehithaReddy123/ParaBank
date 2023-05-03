package paraBank;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
public class TestCases1 extends BaseClass{
	WebDriver driver;
  @Test(priority=1)
  public void Login() {
	  driver.get(Url);
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  BaseClass log = new BaseClass();
			try {
				log.Login(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
  @Test(priority=2)
  public void ContactUs() {
	  
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  BaseClass log = new BaseClass();
			try {
				log.ContactUs(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
  
  @Test(priority=4)
  public void InValidContactUs() {
	 
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  BaseClass log = new BaseClass();
			try {
				log.InValidContactUs(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
  @Test(priority=5)
  public void InValidContactUs1() {
	 
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  BaseClass log = new BaseClass();
			try {
				log.InValidContactUs1(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\seshu\\OneDrive\\Documents\\jar files\\chromedriver_win32\\chromedriver.exe");
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*"); 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(options);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
