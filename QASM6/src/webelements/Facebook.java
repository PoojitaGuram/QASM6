package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.facebook.com/");
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("poojita@123");
Thread.sleep(5000);
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("rete534@1U");
Thread.sleep(5000);

//WebElement loginbutton = driver.findElement(By.name("login"));
//loginbutton.click();
//WebElement forgettenpass = driver.findElement(By.linkText("Forgotten password?"));
//forgettenpass.click();
WebElement createnewaccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
   createnewaccount.click();
driver.manage().window().minimize();
driver.quit();
	}

}
