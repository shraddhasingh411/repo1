package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	private static WebElement ele= null;
	
	public static WebElement text_usr(WebDriver driver)
	{
		ele= driver.findElement(By.id("email"));
		return ele;

		System.out.println("in username field");
	}
	
	public static WebElement text_pwd(WebDriver driver)
	{
		ele= driver.findElement(By.id("pass"));
		return ele;
	}
	
	public static WebElement logIn_btn(WebDriver driver)
	{
		ele= driver.findElement(By.id("u_0_m"));
		return ele;
	}
}
