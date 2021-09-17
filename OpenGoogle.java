package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		
		driver.quit();
	}
}
