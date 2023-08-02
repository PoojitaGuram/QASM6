package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.dassault-aviation.com/en/");
       driver.manage().window().fullscreen();
       // driver.get("https://tinder.com/");
       // driver.manage().window().maximize();
        //Thread.sleep(6);
       // driver.manage().window().minimize();
	}

}

