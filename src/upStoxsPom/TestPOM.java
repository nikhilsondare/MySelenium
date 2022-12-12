package upStoxsPom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPOM {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		//create an object of UpstoxLoginPage
		
		UpStoxLoginPage login=new UpStoxLoginPage(driver);
		login.enterUserID();
		login.enterPassword();
		login.clickOnSignInButton();
		
		Thread.sleep(1000);
		
		UpStoxPasscodePage passcode=new UpStoxPasscodePage(driver);
		passcode.enterPasscode();
		
		Thread.sleep(4000);
		
		UpStoxWelcomePage good=new UpStoxWelcomePage(driver);
		good.clickOnIAmGoodButton();
		
		Thread.sleep(1000);
		
		UpStoxHomePage homePage=new UpStoxHomePage(driver);
		homePage.ValidateUserName(driver);
		Thread.sleep(1000);
		homePage.ClickOnFundsButton();
		
		UpStoxFundsPage f=new UpStoxFundsPage(driver);
		f.ValidateFunds();
		homePage.logoutFromApplication();
		
		
		
		
		
		
		
		

	}

}
