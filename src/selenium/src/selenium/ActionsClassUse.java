package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ActionsClassUse {
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\Desktop\\Nikhil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
	//	WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
	  //  Actions act=new Actions(driver);
	    //Thread.sleep(1000);
	   //act.contextClick(rightClickButton).perform();
	   //Thread.sleep(1000);
	   
	   //act.click(rightClickButton).perform();
		
		
		//String s=RandomString.make(4);
		
		
		
		//File destination = new File("C:\\Users\\pooja\\Desktop\\Nikhil\\Screenshot\\myscreenshot"+s+".jpg");
		
       //FileHandler.copy(source, destination);
	  // act.click(rightClickButton).perform();
	   
	    
	   
	    
	    WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Actions act1=new Actions(driver);
	    act1.doubleClick(doubleclickbutton).perform();
	    Thread.sleep(1000);
	    
		  
		   
		    
	    
	    
        
	    
	    
	    
		
		
		
	}

}
