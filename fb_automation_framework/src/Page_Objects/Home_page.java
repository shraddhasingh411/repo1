package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_page {
	
	private static WebElement ele= null;
	
	public static WebElement lnk_profile (WebDriver driver)
	{
		ele= driver.findElement(By.className("_2s25"));
		return ele;		
	}
	public static WebElement lnk_FriendRequest (WebDriver driver)
	{
		ele= driver.findElement(By.id("js_4v"));
		return ele;
	}

}
