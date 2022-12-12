package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\Desktop\\Nikhil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destination = driver.findElement(By.id("amt8"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		//act.dragAndDrop(source, destination).perform();
		
		act.clickAndHold(source).moveToElement(destination).release().build().perform();
		
		
		

		
				

	}

}
