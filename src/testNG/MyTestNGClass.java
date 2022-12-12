package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestNGClass {
  @Test
  public void googleTest() 
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
  }
  
  @Test
  public void facebookTest() 
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
  }
  
  @Test
  public void flipkartTest() 
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
  }
}

