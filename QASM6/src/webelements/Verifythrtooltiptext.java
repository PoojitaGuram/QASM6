package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verifythrtooltiptext {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/");
	String expectedToolTiptext = "Do not select if this computer is shared";
	WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	String actualToolTiptext = checkbox.getAttribute("title");
	if(actualToolTiptext.isEmpty()) {
	System.out.println("toottiptext is not present");
	
	}
	else
	{
		System.out.println("tooltiptext is present ");
		if(actualToolTiptext.equals(expectedToolTiptext))
		{
			System.out.println("pass : "+ checkbox.getTagName() +"tooltiptext is verified");
		}
		else
		{
			System.out.println("fail : "+ checkbox.getTagName() +"tooltiptext is verified");
		}
	}
	driver.manage().window().minimize();
	driver.quit();
	

	}

}
