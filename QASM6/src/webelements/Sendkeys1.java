package webelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		 WebElement username = driver.switchTo().activeElement();
		 username.sendKeys(Keys.CONTROL+"a");
		 username.sendKeys(Keys.BACK_SPACE);
		 username.sendKeys("admin");
		 username.sendKeys(Keys.TAB);
		 driver.switchTo().activeElement().sendKeys("Test@123");
		 driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}

}
