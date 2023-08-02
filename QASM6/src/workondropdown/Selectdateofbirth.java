package workondropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectdateofbirth {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://www.facebook.com/signup");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9));
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select dayselect = new Select(daydropdown);
		dayselect.selectByVisibleText("15");
		WebElement monthdropdown = driver.findElement(By.id("month"));
	Select monthselect = new Select(monthdropdown);
		monthselect.selectByVisibleText("Aug");
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select yearselect = new Select(yeardropdown);
		yearselect.selectByVisibleText("1998");
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
