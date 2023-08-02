package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Isselected {

	public static void main(String[] args) {
     WebDriver driver = new EdgeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
     driver.get("https://demo.actitime.com/login.do");
  WebElement keeploggedincheckbox = driver.findElement(By.id("keepLoggedInCheckBox"));
  if(keeploggedincheckbox.isSelected()) {
	  System.out.println("boolean true");
	  System.out.println("-ve testing boolean false");
	  System.out.println("fail keeploggedincheckbox is selected before selection");
  }else
	  {
		  System.out.println("boolean false");
		  System.out.println("-ve testing boolean false");
		  System.out.println("pass : the keeploggedincheckbox is  selected after selection ");
	  }
  keeploggedincheckbox.click();
  if(keeploggedincheckbox.isSelected()) {
	  System.out.println("boolean true");
	  System.out.println("+ve testing boolean true");
	  System.out.println("pass: the checkbox is selected after selection");
  }
  else
  {
	  System.out.println("boolean false");
	  System.out.println("+ve teststing boolean false");
	  System.out.println("fail : checkbox is not selected  even after selection ");
  }
 
  driver.manage().window().minimize();
  driver.quit();
  }
    
     
     
	}


