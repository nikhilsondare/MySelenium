package upStoxsPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxWelcomePage {
	
	@FindBy(xpath="(//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'])[1]") private WebElement iAmGoodButton;
	
	public UpStoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnIAmGoodButton()
	{
		iAmGoodButton.click();
	}

}
