package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Synchronization {
	public static void main(String[] args) {
		//blocking the notification  popup
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//pre condition for implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//pass the main url of the application
		String mainUrl="https://www.facebook.com/";
		
		driver.get(mainUrl);
		String expectedLoginPageTitle="Facebook - log in or sign up";
		System.out.println("expectedLoginPageTitle");
		
		String actualLoginPageTitle=driver.getTitle();	
		System.out.println(actualLoginPageTitle);
		
		if(actualLoginPageTitle.equals(expectedLoginPageTitle))
		{
			System.out.println("pass : login page is displayed opon the verification of titlt");
		}
		else
		{
			System.out.println("fail: login page is not displayed uopon the verifiction");
		}
		
		//switch to active elements and enter the user name
		driver.switchTo().activeElement().sendKeys("7892746347");		
		
		//identify the password keys
		
		WebElement passwardTextfield = driver.findElement(By.id("pass"));
		passwardTextfield.sendKeys("gold@123");
		
WebElement loginButton = driver.findElement(By.name("login"));
loginButton.click();

String expectedhomepagetitle="Facebook";
System.out.println(expectedhomepagetitle);

String actualhomepageTitle = driver.getTitle();
System.out.println(actualhomepageTitle);

System.out.println("expected homepageurl:"+mainUrl);
String actualHomepagetitle=driver.getCurrentUrl();
System.out.println(actualhomepageTitle);

		if(actualhomepageTitle.equals(mainUrl)) {
			System.out.println("pass: home page url is same as mainurl");
		}
		if(actualhomepageTitle.equals(expectedhomepagetitle))
		{
			System.out.println("home page title found correct");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
