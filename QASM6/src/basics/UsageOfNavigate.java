package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {
	public static void main(String[] args) throws Throwable {
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	driver.navigate().back();
    Thread.sleep(2000);
    
	driver.navigate().forward();


	
	
		

}
}
