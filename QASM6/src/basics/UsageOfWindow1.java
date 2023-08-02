package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfWindow1 {
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(5000);
	driver.findElement(By.id("windowButton")).click();
	Thread.sleep(5000);
	String WindowId = driver.getWindowHandle();
	Set<String> allWindowIds = driver.getWindowHandles();
	for (String wid : allWindowIds) {
		System.out.println(wid);
	}
	driver.quit();
	
	
	
	}

}
