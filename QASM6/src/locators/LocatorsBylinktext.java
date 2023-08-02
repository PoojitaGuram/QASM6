package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBylinktext {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	 WebElement forgetpass = driver.findElement(By.linkText("Forgotten password?"));
		forgetpass.click();
		driver.navigate().back();
	WebElement createPagelinktext = driver.findElement(By.className("_8esh"));
	createPagelinktext.click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
	}

}