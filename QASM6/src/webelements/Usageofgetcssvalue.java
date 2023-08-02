package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Usageofgetcssvalue {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
		driver.get("https://www.facebook.com/login/");
		WebElement loginbutton = driver.findElement(By.name("login"));
	String fontType = loginbutton.getCssValue("font-family");
	System.out.println("fontType:"+fontType);
	String fontSize = loginbutton.getCssValue("font-size");
	System.out.println("fontSize:"+fontSize);
	String boldnessoftext = loginbutton.getCssValue("font-weight");
	System.out.println(" boldnessoftext:"+boldnessoftext);
		driver.manage().window().minimize();
		driver.quit();
	}

}
