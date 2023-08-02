package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSizeOnChildWindow {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(5000);
	
	driver.findElement(By.id("windowButton")).click();
	Set<String> allWindowsid = driver.getWindowHandles();

	for (String wid : allWindowsid) {
		
	String windowUrl	=driver.switchTo().window(wid).getCurrentUrl();
	System.out.println(windowUrl);
		if(windowUrl.equals("https://demoqa.com/browser-windows"))
{
	
}
		else if(windowUrl.equals("https://demoqa.com/sample")) {
		Dimension childWindowSize = driver.manage().window().getSize();
		Point childWindowPosition = driver.manage().window().getPosition();
		int x = childWindowPosition.getX();
		int y = childWindowPosition.getY();
		System.out.println(x);
		System.out.println(y);
	int childWindowWidth = childWindowSize.getWidth();
    int childWindowHeight = childWindowSize.getHeight();
	System.out.println("childWindowWidth" + childWindowWidth + " pix");
	System.out.println("childWindowHeight" + childWindowHeight + " pix");
		}
			
		}
	driver.manage().window().minimize();
	driver.quit();
	
	
	
	}
}

