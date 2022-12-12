package upStoxsPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import upStoxs.Screenshot1;
import upStoxs.Scrolling;

public class UpStoxHomePage 
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userID;
	@FindBy(xpath="//div[text()='Logout']") private WebElement logOutButton;
	@FindBy(linkText = "Funds") private WebElement fundsButton;
	
	public UpStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateUserName(WebDriver driver) throws IOException
	{
        Scrolling.scrollIntoView(driver, userID);
		
		String expected="Nikhil S.";
		String actualUserID=userID.getText();
		
		Screenshot1.takesscreenshot(driver, actualUserID);
		
		if(expected.equals(actualUserID))
		{
			System.out.println("Actual and Expected user names are matching, TC is passed");
		}
		else
		{
			System.out.println("Actual and Expected user names are not matching, TC is failed");
		}

	}
	
	public void ClickOnFundsButton()
	{
		fundsButton.click();
	}
	
	public void logoutFromApplication() throws InterruptedException 
	{
		userID.click();
		Thread.sleep(500);
		logOutButton.click();
		
	}

}
