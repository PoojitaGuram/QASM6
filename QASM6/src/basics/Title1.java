package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://tinder.com/");
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		//String title = driver.getTitle();
	//System.out.println(title);
		driver.manage().window().minimize();
		driver.quit();

	}

}
