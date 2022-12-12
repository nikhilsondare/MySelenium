package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Sendskey {

	public static void main(String[] args) throws InterruptedException, IOException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\Desktop\\Nikhil\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nikhil");
         
         Thread.sleep(1000);
         driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Sondare");
         
         Thread.sleep(1000);
         driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9822823782");
         
         Thread.sleep(1000);
         driver.findElement(By.name("reg_passwd__")).sendKeys("Nikhil9822");
         Thread.sleep(1000);
         
         WebElement day = driver.findElement(By.id("day"));
         Select s=new Select(day);
        s.selectByVisibleText("27");
        Thread.sleep(1000);
        
        WebElement month = driver.findElement(By.id("month"));
        Select s1=new Select(month);
        s1.selectByValue("8");
        Thread.sleep(1000);
        
        WebElement year = driver.findElement(By.id("year"));
        Select s2=new Select(year);
        s2.selectByVisibleText("1993");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        
        //Screenshot
        File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String s4=RandomString.make(3);
        File destination=new File("C:\\Users\\pooja\\Desktop\\Nikhil\\Screenshot\\nikhil"+s4+".jpg");
        
        FileHandler.copy(sc, destination);
        
        
         
         
		
	}

	
		
	}

