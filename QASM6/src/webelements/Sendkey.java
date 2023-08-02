package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");//url
	WebElement username = driver.findElement(By.id("username"));//usename locator id
	username.sendKeys(Keys.CONTROL+"a");//selecting the text control a
	Thread.sleep(2000);
	
	username.sendKeys(Keys.BACK_SPACE);//removing
	Thread.sleep(2000);
	username.sendKeys("admin");//entering admin
	Thread.sleep(2000);
	username.sendKeys(Keys.TAB);//click on tab
	driver.switchTo().activeElement().sendKeys("Test@123");//password textfield 
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys(Keys.ENTER);//clicking on enter
	
	
	
}
}
