package workondropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Usageofgetoptions {

	public static void main(String[] args) {
	/*ArrayList<String> expectedmonthoptions = new ArrayList<String>();
	expectedmonthoptions.add("Jan");
	expectedmonthoptions.add("Feb");
	expectedmonthoptions.add("Mar");
	expectedmonthoptions.add("Apr");
	expectedmonthoptions.add("May");
	expectedmonthoptions.add("Jun");
	expectedmonthoptions.add("Jul");
	expectedmonthoptions.add("Aug");
	expectedmonthoptions.add("Sep");
	expectedmonthoptions.add("Oct");
	expectedmonthoptions.add("Nov");
	expectedmonthoptions.add("Dec");
	ArrayList<String> actualMonthoptions = new ArrayList<String>();*/
	
	WebDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(9));
	driver.get("https://www.facebook.com/signup");
	Select monthSelect = new Select(driver.findElement(By.id("month")));
	List<WebElement> allmonthoptions = monthSelect.getOptions();
	for (WebElement monthoption : allmonthoptions) {
		String visibleText = monthoption.getText();
		
		monthSelect.selectByVisibleText(visibleText);
		if(monthoption.isSelected()) {
			System.out.println(visibleText+"is selected");
		}
		else {
			System.out.println(visibleText+"is not selected");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
	
	}

}
