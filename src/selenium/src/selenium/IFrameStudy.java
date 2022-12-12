package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\Desktop\\Nikhil\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 driver.close();
		
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");			
		Thread.sleep(1000);	
		
		
		 WebElement d1 = driver.findElement(By.xpath("//button[@type='button']"));
		Thread.sleep(1000);
						
		driver.switchTo().defaultContent();// to switch focus to parent frame.
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
		
		


		
		
		


	}

}
