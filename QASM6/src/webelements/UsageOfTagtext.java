package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfTagtext {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(6));
		driver.get("https://demo.actitime.com/login.do");
		WebElement Tdtag = driver.findElement(By.id("adminCredentialsHeader"));
		String TdtagText = Tdtag.getText();
		System.out.println(TdtagText);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
