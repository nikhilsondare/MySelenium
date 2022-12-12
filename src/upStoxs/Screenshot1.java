package upStoxs;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot1 {

	public static void takesscreenshot(WebDriver driver, String filename) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		//String s=RandomString.make(4);
		
		//System.out.println(source);
		
		File destination = new File("D:\\My Selenium Files\\Screenshots\\"+filename+".jpg");
		
        FileHandler.copy(source, destination);
	}
}
