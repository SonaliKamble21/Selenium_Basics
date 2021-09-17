package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://html.com/input-type-file");
		driver.findElement(By.tagName("input")).sendKeys("‪E:\\Sample.html");
	}
}
