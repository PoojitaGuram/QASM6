package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usageofsubmit {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
WebElement formtagref = driver.findElement(By.tagName("form"));
	WebElement loginButton = formtagref.findElement(By.name("login"));
	if(loginButton.getAttribute("type").equals("submit")) {
		loginButton.submit();
		
	}
	else {
		System.out.println("type attribute is not found as excepted");
	}
	

}
}
