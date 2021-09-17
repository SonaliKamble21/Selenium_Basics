package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMovement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.get("https://www.amazon.in/"); // enter url

		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]")).click();
		
	}
}
