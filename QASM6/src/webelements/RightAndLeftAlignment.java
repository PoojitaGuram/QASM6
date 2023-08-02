package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightAndLeftAlignment {

	public static void main(String[] args) {
      WebDriver driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
      WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(6));
      driver.get("https://www.facebook.com/campaign/landing.php/");
   WebElement emailTextfield = driver.findElement(By.name("reg_email__"));
  Rectangle emailrect = emailTextfield.getRect();
  System.out.println("emailrect:"+emailrect);
     int emailwidth = emailrect.getWidth();
     int emailheight = emailrect.getHeight(); 
     int emailstarty = emailrect.getY();
     int emailstartx=emailrect.getX();
     int emailEndx = emailstartx+emailwidth;
     WebElement passwordTextfield= driver.findElement(By.name("reg_passwd__"));
     Rectangle passwordrect = passwordTextfield.getRect();
    int passwordheight = passwordrect.getHeight();
    int passwordwidth=passwordrect.getWidth();
   int passwordstartx = passwordrect.getX();
   int passwordstarty = passwordrect.getY();
   int passwordEndx = passwordstartx+passwordwidth;
   if(emailstartx==passwordstartx) {
	   System.out.println("emailstartx:"+emailstartx);
	   System.out.println("passwordstartx:"+passwordstartx);
	   System.out.println("pass: the left allignment of email and password textfield is found correct");
   }
   else
	   System.out.println("fail: the left allignment of email and password textfield is found incorrect and verified");
   
   
      
	if(emailEndx==passwordEndx) {
		System.out.println("emailEndx:"+emailEndx);
		System.out.println("passwordEndx:"+passwordEndx);
		System.out.println("pass: the right allignment of email and password textfield is found correct and verified");
		
	}
	else
		System.out.println("fail: the right allignment of email and password textfield is found incorrect and verified");
	driver.manage().window().minimize();
	driver.quit();

}
}