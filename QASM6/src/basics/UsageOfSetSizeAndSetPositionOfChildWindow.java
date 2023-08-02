package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSizeAndSetPositionOfChildWindow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(5000);
	driver.findElement(By.id("windowButton")).click();
	Thread.sleep(5000);
      Set<String> allWindowIds = driver.getWindowHandles();
      for (String wid : allWindowIds) {
    	String windowUrl = driver.switchTo().window(wid).getCurrentUrl();
    	if(windowUrl.equals("https://demoqa.com/browser-windows")) {
    		driver.manage().window().fullscreen();
    	}
    	else if(windowUrl.equals("https://demoqa.com/sample")) {
    		Dimension targetChildWindowSize = new Dimension(700,200);

    		driver.manage().window().setSize(targetChildWindowSize);
    		Thread.sleep(50000);
           Point targetChildWindowPosition = new Point(100,100);
       driver.manage().window().setPosition(targetChildWindowPosition);
    	}
    	
      
	}
	}
}
