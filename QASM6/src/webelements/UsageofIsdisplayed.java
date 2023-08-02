package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageofIsdisplayed {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(8));
	driver.get("https://www.flipkart.com/");
	WebElement popupbutton = driver.findElement(By.xpath("//button[text()='X']"));
		if(popupbutton.isDisplayed()) {
			System.out.println("boolean true");
			System.out.println("+vetesting element source code is present in dom");
			System.out.println("pass: popupbutton is displayed when the source code is present in dom");
		}
		else
		{
			System.out.println("boolean false");
		System.out.println("+ve testing element source code is not present in dom");
		System.out.println("fail:the popupbutton is not displayed ");
		}
	    Thread.sleep(8);
	    popupbutton.click();
	    try
	    {
	    	boolean ref = popupbutton.isDisplayed();
	    	if(popupbutton.isDisplayed()) {
	    		System.out.println("boolen true");
	    		System.out.println("-ve testing element source code is not present in dom ");
	    		System.out.println("fail: the popupbutton is not displayed when the souce code is not present in dom");
	    	}
	    	else
	    	{
	    		System.out.println("boolen false");
	    		System.out.println("-ve testing element source code is not present in dom");
	    		System.out.println("pass:the popupbutton is not dispalyed when source code of element is not present");
	    	}
	    }
	    
	    	catch(StaleElementReferenceException e) {
	    	System.out.println("the element source code is itself is not associated with dom");
	    		
	    }
	    driver.manage().window().minimize();
	    driver.quit();
	
		
	
	
	
	
	    }
	
	}


