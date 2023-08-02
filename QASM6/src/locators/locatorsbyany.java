package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsbyany {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//driver.findElement(By.id("login_Layer")).click();
	//	driver.findElement(By.className("nI-gNb-lg-rg__login")).click();
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.cssSelector("a[id='login_Layer']")).click();
		}


}

