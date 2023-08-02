package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args)  {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
		WebElement firstname = driver.findElement(By.name("firstname"));
	
		firstname.sendKeys("pooja");
		WebElement lastname = driver.findElement(By.name("lastname"));
		
		lastname.sendKeys("guram");
		
WebElement password = driver.findElement(By.cssSelector("input[type=\"password\"]"));
		password.sendKeys("fgh34dfh@W");
		
		password.sendKeys("123AQ@12");
		
WebElement phoneno = driver.findElement(By.name("reg_email__"));
		
		
		phoneno.sendKeys("975657478");
		
//WebElement alreadyhave = driver.findElement(By.linkText("Already have an account?"));
//alreadyhave.click();
		
		
		
WebElement alreadyhavepart = driver.findElement(By.partialLinkText("Already have an account?"));
alreadyhavepart.click();


			
		
		
	}

}
