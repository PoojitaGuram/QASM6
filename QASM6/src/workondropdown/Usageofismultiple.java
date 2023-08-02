package workondropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Usageofismultiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
		driver.get("https://www.facebook.com/signup");
		WebElement daydropdown = driver.findElement(By.id("day"));
	    Select dayselect = new Select(daydropdown);
		if(dayselect.isMultiple()) {
			System.out.println("Boolean true");
			System.out.println("day dropdown is of multiselect");
		}
		else
		{
			System.out.println("Boolean false");
			System.out.println("day dropdown is of type single select");
			
		}
		dayselect.selectByVisibleText("20");
		Thread.sleep(5000);
		dayselect.selectByIndex(3);
		Thread.sleep(5000);
		dayselect.selectByValue("1");


		driver.manage().window().minimize();
		driver.quit();

	}

}
