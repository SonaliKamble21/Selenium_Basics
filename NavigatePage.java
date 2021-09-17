package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.gmail.com");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		

	}

}
