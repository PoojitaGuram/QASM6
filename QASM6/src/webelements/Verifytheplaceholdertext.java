package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verifytheplaceholdertext {
public static void main(String[] args) throws Throwable {

WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));

driver.get("https://demo.actitime.com/");
WebElement username = driver.findElement(By.id("username"));
WebElement password = driver.findElement(By.name("pwd"));
if(username.getAttribute("placeholder").isEmpty())
{
	System.out.println("username textfield has no placeholder");
}
else {
	System.out.println("username textfield has placeholder");
	if(username.getAttribute("placeholder").equals("Username")){
		System.out.println("pass: username palceholder is present and is verified");
		if(username.getAttribute("value").isEmpty())
		username.sendKeys("admin");
		
	}
	else
	{
		System.out.println("fail : username placeholder is not present and is verified");
	}
	
}

if(password.getAttribute("placeholder").isEmpty())
{
	System.out.println("password textfield has no placeholder");
}
else {
	System.out.println("password textfield has placeholder");
	if(password.getAttribute("placeholder").equals("Password")){
		System.out.println("pass: password palceholder is present and is verified");
		if(password.getAttribute("value").isEmpty()) {
	password.sendKeys(" manager");
		
	}
	else
	{
		System.out.println("fail :password placeholder is not present and is verified");
	}
	
}
}
Thread.sleep(5000);
driver.manage().window().minimize();
driver.quit();


}
}