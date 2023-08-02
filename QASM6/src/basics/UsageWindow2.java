package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageWindow2 {
public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(5000);
driver.get("https://demoqa.com/browser-windows");
driver.findElement(By.id("windowButton")).click();
Thread.sleep(5000);
Set<String> AllWindowIds = driver.getWindowHandles();
for (String wid : AllWindowIds) {
	String windowUrl = driver.switchTo().window(wid).getCurrentUrl();
	System.out.println(windowUrl);
}
driver.quit();


}
}

