package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetLocationandSize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.instagram.com/accounts/login/");
	////////////username  getsize
	WebElement usernameTextfield = driver.findElement(By.name("username"));
	Dimension usernameTextfieldSize = usernameTextfield.getSize();
	System.out.println("usernameTextfieldSize:"+usernameTextfieldSize );
	int usernameWidth = usernameTextfieldSize.getWidth();
	System.out.println("usernameWidth:"+usernameWidth);
	int usernameHeight = usernameTextfieldSize.getHeight();
	System.out.println(" usernameHeight:"+ usernameHeight);
    ////////////password	
    WebElement passwordTextfield = driver.findElement(By.name("password")); 
   Dimension passwordtextfieldsize = passwordTextfield.getSize();
   System.out.println("passwordtextfieldsize:"+passwordtextfieldsize);
   int passwordwidth = passwordtextfieldsize.getWidth();
   System.out.println("passwordwidth:"+passwordwidth); 
   int passwordheight = passwordtextfieldsize.getHeight();
   System.out.println("passwordheight:"+passwordheight);
   
   /////////////////////getloction-username
   Point usernametextfieldLoction = usernameTextfield.getLocation();
   System.out.println("usernametextfieldLoction:"+usernametextfieldLoction);
   int startX = usernametextfieldLoction.getX();
   System.out.println("startX:"+startX);
   int startY = usernametextfieldLoction.getY();
   System.out.println("startY:"+startY);
 //////////////////pass
   Point passwordtextfieldloction = passwordTextfield.getLocation();
  System.out.println("passwordtextfieldloction:"+passwordtextfieldloction);
 int startXp = passwordtextfieldloction.getX();
 System.out.println("startXp:"+startXp);
 int startYp = passwordtextfieldloction.getY();
 System.out.println("startYp:"+startYp);
 
   driver.manage().window().minimize();
   driver.quit();
	 
}
}
