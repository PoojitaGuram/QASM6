package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphism {
	static WebDriver driver;
	public static void main(String[] args) {
		String browser ="chrome";
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("fireFox"))
		{
			driver=new FirefoxDriver();
			
		}
	
	
		 
	}
}
