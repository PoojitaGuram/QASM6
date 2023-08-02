package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Usageofgetsize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	
	driver.get("https://www.instagram.com/accounts/login/");

WebElement username = driver.findElement(By.name("username"));
	
	Dimension usernameDimension = username.getSize();
	int usernamewidth = usernameDimension.getWidth();
	System.out.println("usernamewidth:"+usernamewidth);
	int usernameheight = usernameDimension.getHeight();
	System.out.println("usernameheight:"+usernameheight);
	/////////////
WebElement password = driver.findElement(By.name("password"));
	
	Dimension passwordDimension = password.getSize();
	int passwordwidth = passwordDimension.getWidth();
	System.out.println("passwordwidth:"+passwordwidth);
	int passwordheight = passwordDimension.getHeight();
	System.out.println("usernameheight:"+passwordheight);
	
	driver.manage().window().minimize();
	driver.quit();
	

}
}
