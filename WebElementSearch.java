package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com");

		// enter a search term
		// click on wekepedia link

		driver.findElement(By.tagName("input")).sendKeys("pune"+Keys.ENTER );
	}
}
