package paraBank;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import paraBank.LoginPage1;
public class LoginCases extends LoginPage1 {
	public WebDriver driver;
  @Test(priority=6)
  public void Login1() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  LoginPage1 log = new LoginPage1();
		try {
			log.Login1(driver);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @Test(priority=5)
  public void Login2(){
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	LoginPage1 log = new LoginPage1();
		try {
			log.Login2(driver);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @Test(priority=1)
  public void Login3() {
	  driver.get(Url);
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.Login3(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
  }
  @Test(priority=2)
  public void Login4() {
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.Login4(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
  }
  @Test(priority=3)
  public void Login5() {
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.Login5(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}     
  }
  @Test(priority=4)
  public void Login6() {
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.Login6(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}       
  }
  @Test(priority=7)
  public void UpdateProfile() {
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.UpdateProfile(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}         
  }
  @Test(priority=8)
  public void UpdateProfile1() {
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.UpdateProfile1(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}         
  }
  @Test(priority=9)
  public void UpdateProfile2() {
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.UpdateProfile2(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}         
  }
  @Test(priority=10)
  public void TransferFunds() {
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.TransferFunds(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}         
  }
  @Test(priority=11)
  public void InvalidTransferFunds() {
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.InvalidTransferFunds(driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}         
  }
  @Test(priority=12)
  public void BillPay() {
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage1 log = new LoginPage1();
			try {
				log.BillPay(driver);
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
