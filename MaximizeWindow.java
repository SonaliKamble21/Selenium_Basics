package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("https://www.google.com");  //enter url
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();   //delete all cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		

	}

}
