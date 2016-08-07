package TestCases;

import appModules.LoginAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {
	
	private static WebDriver drv=null;
	
	public static void main(String args[])
	{
		drv=new FirefoxDriver();
		drv.get("www.facebook.com");
		appModules.LoginAccount.Execuete(drv);
System.out.println("==============****");
		System.out.println("This is my first test case");
                System.out.println("==============****");

		drv.quit();
		
	}

}
