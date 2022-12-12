package upStoxs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateUserNameAndFunds {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		
		Thread.sleep(1000);
		//login to application
		//sending userID
		driver.findElement(By.name("userId")).sendKeys("6VBYG9");
		
		//sending password
		driver.findElement(By.name("password")).sendKeys("Nikhil@1234");
		
		//click on sign In button
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		
		//navigating to passcode page
		Thread.sleep(1000);
		driver.findElement(By.id("yob")).sendKeys("1993");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'])[1]")).click();
		
		Thread.sleep(1000);
		
		 WebElement UserID = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
		
		Scrolling.scrollIntoView(driver, UserID);
		
		String expected="Nikhil S.";
		String actualUserID=UserID.getText();
		
		Screenshot1.takesscreenshot(driver, actualUserID);
		
		if(expected.equals(actualUserID))
		{
			System.out.println("Actual and Expected user names are matching, TC is passed");
		}
		else
		{
			System.out.println("Actual and Expected user names are not matching, TC is failed");
		}

		Thread.sleep(2000);
		driver.findElement(By.linkText("Funds")).click();
		
		Thread.sleep(1000);
		String funds = driver.findElement(By.xpath("((//div[@class='_2BBe9RdErXc7K8fvQxPEzj'])[1]//div)[4]")).getText();
		System.out.println("Funds avilable to trade is "+funds);
	}

}
