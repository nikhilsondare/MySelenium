package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\Desktop\\Nikhil\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9299767%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw4c-ZBhAEEiwAZ105RVw-rMBB-Y0UcATJmeDB36vFHbD6yDcBq3wfGZxdteX0qcWcvDyAchoCp6IQAvD_BwE");
		
//		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		WebElement day = driver.findElement(By.id("day"));
		
		
		Actions act=new Actions(driver);
		act.click(day).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement year = driver.findElement(By.id("year"));
		act.click(year).click().perform();
		for(int i=1;i<=29;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();	
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	
		
		
		
		
		
		
		
		
		
		
	}

}
