package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfgetTagname {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernametextfield = driver.findElement(By.id("username"));
		String usernametag = usernametextfield.getTagName();
		System.out.println(usernametag);
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
	String loginbuttontagis = loginbutton.getTagName();
	System.out.println(loginbuttontagis);
	if(loginbuttontagis.equals("button")) {
		System.out.println(loginbuttontagis + "is correct");
		loginbutton.click();
		
	}
	else {
		System.out.println("is incorrect");
		
		}
	
		driver.manage().window().minimize();
		driver.quit();
			
	}

}
