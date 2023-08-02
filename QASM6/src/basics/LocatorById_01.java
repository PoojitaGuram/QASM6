package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById_01 {
public static void main(String[] args) throws Throwable {
 WebDriver driver  =new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demo.actitime.com/");
WebElement usernameTextfield = driver.findElement(By.id("username"));
usernameTextfield.sendKeys("trainee");
Thread.sleep(2000);
WebElement passwordTextfield = driver.findElement(By.name("pwd"));
passwordTextfield.sendKeys("trainee");
Thread.sleep(2000);
WebElement checkBox = driver.findElement(By.name("remember"));
checkBox.click();
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();
}
}