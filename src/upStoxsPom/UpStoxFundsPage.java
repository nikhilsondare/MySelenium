package upStoxsPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxFundsPage 
{
  @FindBy(xpath="((//div[@class='_2BBe9RdErXc7K8fvQxPEzj'])[1]//div)[4]") private WebElement funds;
  
  public UpStoxFundsPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void ValidateFunds()
  {
	  String avilableFund = funds.getText();
	  System.out.println("Funds avilable to trade is "+avilableFund);
  }
}
