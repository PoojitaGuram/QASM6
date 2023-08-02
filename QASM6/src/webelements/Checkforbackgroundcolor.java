package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Checkforbackgroundcolor {

	public static void main(String[] args) {
		//WebDriver driver= new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
		driver.get("https://demo.actitime.com/login.do");
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		String bgcolor = loginbutton.getCssValue("background-color");
		System.out.println("bgcolor:"+ bgcolor);
		String hexvalueofcolour = Color.fromString(bgcolor).asHex();
		System.out.println(" hexvalueofcolour:"+hexvalueofcolour);
		driver.manage().window().minimize();
		driver.quit();
	}

}
