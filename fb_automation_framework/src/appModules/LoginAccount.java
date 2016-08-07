package appModules;
import Page_Objects.Home_page;
import Page_Objects.Login_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginAccount {
	
	public static void Execuete (WebDriver driver)
	{
		Login_Page.text_usr(driver).sendKeys("user1");
		Login_Page.text_pwd(driver).sendKeys("pwd1");
		Login_Page.logIn_btn(driver).click();
		Home_page.lnk_profile(driver).click();
	}

}
