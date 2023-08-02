package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InapproriateBehaviourofgettext {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demo.actitime.com/login.do");
		WebElement tdtag = driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/following-sibling::td"));
		String Expectedtdtagtext= "Username";
		System.out.println("Expectedtdtagtext:"+Expectedtdtagtext);
		String actualtdtagtext = tdtag.getText();
		driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/following-sibling::td/b"));
		System.out.println("actualtdtagtext:"+actualtdtagtext);
		if(actualtdtagtext.equals(Expectedtdtagtext)) {
		System.out.println("pass");
		}
	else
	{
		System.out.println("fail");
	}
		driver.manage().window().minimize();
		driver.quit();
		
	}
	
}
