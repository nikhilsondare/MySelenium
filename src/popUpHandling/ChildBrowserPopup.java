package popUpHandling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[text()='Start Selenium Practice']")).click();
		Thread.sleep(500);
		
		System.out.println(driver.getWindowHandle());
		
		Set<String> allWindowID = driver.getWindowHandles();
		
		ArrayList<String>al=new ArrayList<>(allWindowID);
		System.out.println(al.get(0));
		System.out.println(al);
		
//		
//		//Each for Loop
//		for(String a:allWindowID)
//		{
//			System.out.println(a);
//		}
//		
//		Iterator<String> it = allWindowID.iterator();
//		String mainPageID = it.next();
//		String secondTabPageID = it.next();
//		
//		
//		//Changed focus of selenium from main tab to new tab
		driver.switchTo().window(al.get(1));
		Thread.sleep(500);
		
		//Handled drop down on new tab
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Thread.sleep(500);
		Select s=new Select(dropDown);
		s.selectByValue("option2");
		Thread.sleep(500);
//		driver.close();
//		
//		//clicked check box on new tab
//		driver.findElement(By.xpath("//input[@value='option2']")).click();
//		Thread.sleep(500);
//		
//        
//		
//        
//		//driver.close();
//		
//		//Changed focus of selenium from new tab to main tab
//		driver.switchTo().window(mainPageID);
//		String textOnMainPage = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class inquiry')]")).getText();
//		System.out.println("Text present on Main Page ==>"+textOnMainPage);
////		
////		Object text = driver.findElement(By.xpath("(//div[@class='et_pb_text_inner'])[1]")).getAttribute();
////		System.out.println(text);
//		
		
		
		
		

	}

}
