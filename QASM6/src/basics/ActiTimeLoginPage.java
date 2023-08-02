package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginPage {
	public static void main(String[] args) {
		
	    WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		String expectedLoginPageTitle="actiTIME - Login";
		String actualLoginPageTitle=driver.getTitle();
		
		String expectedLoginPageUrl="https://demo.actitime.com/login.do";
		String actualLoginPageUrl=driver.getCurrentUrl();
		
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)){
			System.out.println("Login page title is correct");
			
			if(actualLoginPageUrl.equals(expectedLoginPageUrl)) {
				System.out.println("Login page url is correct");
				System.out.println("pass: the login page is dispalyed open the verification of title and url");
			}
			
			else
		{
			System.out.println("Login page url is incorrect");
			System.out.println("fail : the loginpage is not  displayed since url is incorrect");
		}
		
	}
		else {
			System.out.println("Loginpage title is incorrect");
			System.out.println("fail: the login page is  not displayed as both url and title is incorret");
		}
		driver.quit();

}
	 
	}
