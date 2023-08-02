package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorbypartiallinktext {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.sit.ac.in/html/home.html");
	driver.findElement(By.partialLinkText("NAAC")).click();
	Set<String> allWindowIds = driver.getWindowHandles();
	for (String wids :allWindowIds ) {
		String windowurl = driver.switchTo().window(wids).getCurrentUrl();
		if(windowurl.contains("nacecertificate")) {
			driver.close();
		}
	}
	}
}
