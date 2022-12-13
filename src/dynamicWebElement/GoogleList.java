package dynamicWebElement;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(500);
		List<WebElement> results = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		
		
		
		//adding cmmt
		//How many results I got
		//added one more comment
		
		
		
		
		
		
		
		System.out.println(results.size());
		
		//What are the results
		//By using for each loop
		
//		for(WebElement r:results)
//		{
//			System.out.println(r.getText());
//			String expected="honda amaze";
//			String actualresult=r.getText();
//			if(expected.equals(actualresult))
//			{
//				r.click();
//				break;
//			}
//		}
        //System.out.println("=====================================");
        
        //By using for loop
		for(int i=0;i<=results.size()-1;i++)
		{
			System.out.println(results.get(i).getText());
		}
//		System.out.println("=====================================");
		//By using iterator
//		Iterator<WebElement> it = results.iterator();
//		it.next();
//		it.next();
//		it.next();
//		it.next();
//		it.next();
//		it.next();
//		it.next();
//		WebElement amaze = it.next();
//		System.out.println(amaze.getText());
//		amaze.click();
		
		
	}

}
