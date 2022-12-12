package upStoxs;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserNameAndFundsUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		
		Thread.sleep(1000);
		//read data from excel sheet
		File myFile=new File("D:\\My Selenium Files\\Upstox userInfo.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		String un = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		//login to application
		//sending userID
		
		driver.findElement(By.name("userId")).sendKeys(un);
		
		String pass = mySheet.getRow(1).getCell(0).getStringCellValue();
		//sending password
		driver.findElement(By.name("password")).sendKeys(pass);
				
		//click on sign In button
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		
		
		//navigating to passcode page
		Thread.sleep(1000);
		driver.findElement(By.id("yob")).sendKeys(mySheet.getRow(2).getCell(0).getStringCellValue());
				
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
		

	}

}
