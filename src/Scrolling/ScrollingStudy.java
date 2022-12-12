package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingStudy {

	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/trains/train-seat-availability?utm_source=bing&utm_medium=paid_search_bing_trains&utm_campaign=train_search_desktop_bing&msclkid=8f5064f9858a1b971f0707ab9f82c001&utm_term=irctc%20login&utm_content=Ad%20group%201/");
		//driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    Thread.sleep(500);
		js.executeScript("window.scrollBy(160,800)");
		
		WebElement emailID = driver.findElement(By.xpath("(//input[@type=\"text\"])[8]"));
		WebElement buses = driver.findElement(By.linkText("Buses"));
		//js.executeScript("arguments[0].click();", buses);
		js.executeScript("arguments[0].value=’nikhilsondare’;", emailID);
		
		
		//js.executeScript("arguments[0].scrollIntoView(true)",emailID);
		//emailID.sendKeys("nikhilsondare@gmail.com");
		
//		ScrollingStudy s=new ScrollingStudy();
//		//s.browserSize();
//		s.setposition1();
		
		
		
		
		

	}
	
	public void browserSize() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		 Dimension defaultSize = driver.manage().window().getSize();
		 System.out.println(defaultSize);
		 
		 Dimension d=new Dimension(1500, 500);
		 driver.manage().window().setSize(d);
		 
		 Thread.sleep(500);
		 Dimension d1=new Dimension(600, 1000);
		 driver.manage().window().setSize(d1);
		 
		 
	}

	public void setposition1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println("my default size is"+defaultPosition);
		
		Point p=new Point(100, 9);
		Point p1=new Point(9, 100);
		Point p2=new Point(600, 100);
		
		driver.manage().window().setPosition(p);
		Thread.sleep(500);
		driver.manage().window().setPosition(p1);
		Thread.sleep(500);
		driver.manage().window().setPosition(p2);
		
		
		
		
		
	}
	
}
