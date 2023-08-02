package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToUrlurl {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dassault-aviation.com/en/");
	//driver.navigate().to("https://www.dassault-aviation.com/en/");
	driver.getPageSource();
	Thread.sleep(5000);
	//driver.navigate().to();
}
}
