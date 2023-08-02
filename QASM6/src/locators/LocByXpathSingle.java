package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocByXpathSingle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/jackets-men");
		
		driver.findElement(By.xpath("//label[@class='common-customCheckbox']/input[@value='Denim Truckers']")).click();
	}

}
