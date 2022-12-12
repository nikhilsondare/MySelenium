package popUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\Desktop\\Nikhil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(500);
		driver.navigate().refresh();
		
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//		
//		Alert alt = driver.switchTo().alert();
//		System.out.println("text on alert popup "+alt.getText());
//		Thread.sleep(500);
//		alt.accept();
//		Thread.sleep(500);
		
		String text = driver.findElement(By.xpath("//div[@class='main-header']")).getText();
		System.out.println(text);
		Thread.sleep(500);
		
		driver.close();
		
		

	}

}
