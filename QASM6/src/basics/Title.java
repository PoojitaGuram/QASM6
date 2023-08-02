package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String actualT = driver.getTitle();
	System.out.println(actualT);
	String expectedT = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	System.out.println(expectedT);
	if(actualT.equals(expectedT))
		
	{
		System.out.println("pass");
	}
	
	else
		System.out.println("fail");
}
	}

