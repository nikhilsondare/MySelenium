package dynamicWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import upStoxs.Scrolling;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//List<WebElement> result1 = driver.findElements(By.id("mah-district"));
		Thread.sleep(500);
		
		WebElement dropDown = driver.findElement(By.xpath("//input[@list='mah-district']"));
		dropDown.click();
		List<WebElement> result1 = driver.findElements(By.xpath("(//div[@class=' extradiv col-lg-8 col-md-12 col-12'])//datalist/option"));
		
		Scrolling.scrollIntoView(driver, dropDown);
		
		//How many results I got
		System.out.println(result1.size());
		
		for(WebElement r:result1) 
		{
			System.out.println(r.getAttribute("value"));
		String expected="Nanded";
		String actualresult=r.getAttribute("Nanded");
		
		if(expected.equals(actualresult))
		{
			r.click();
			break;
		}
		}
		
		/*dropDown.sendKeys("Nanded");
		dropDown.sendKeys(Keys.ENTER);*/
		
//		for(int i=0;i<=result1.size()-1;i++)
//		{
//			System.out.println(result1.get(i).getText());
//		}

	}
	

}
