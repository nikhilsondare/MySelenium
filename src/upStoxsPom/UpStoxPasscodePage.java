package upStoxsPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage {
	
	//variable declaration
	
	@FindBy(id="yob") private WebElement passcode;
	
	public UpStoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPasscode()
	{
		passcode.sendKeys("1993");
	}
}
