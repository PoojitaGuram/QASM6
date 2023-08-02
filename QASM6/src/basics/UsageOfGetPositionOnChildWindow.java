package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPositionOnChildWindow {
	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(5000);
		Set<String> allWindowids = driver.getWindowHandles();
		for (String wid : allWindowids) {
			String windowUrl = driver.switchTo().window(wid).getCurrentUrl();
			if(windowUrl.equals("https://demoqa.com/browser-windows"))
			{
				
			}
			else if(windowUrl.equals("https://demoqa.com/sample")) {
			Point childWindowPosition = driver.manage().window().getPosition();
			int childWindowStartX = childWindowPosition.getX();
		int childWindowStartY = childWindowPosition.getY();
		System.out.println("childWindowStartX"  + childWindowStartX + " pix");
		System.out.println("childWindowStartY"+ childWindowStartY + " pix");
			}
		}
		
	}

}
