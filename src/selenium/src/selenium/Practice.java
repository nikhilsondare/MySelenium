package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\Desktop\\Nikhil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		driver.get("https://www.google.com/");
		WebElement searchTab = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		act.sendKeys("iphone 14").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		Thread.sleep(1000);
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images present on web page are "+images.size());
		
		
		
		
		

	}

}
