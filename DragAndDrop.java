package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.get("https://jqueryui.com/droppable/"); // enter url

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.switchTo().frame(0); // switch to frame

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable")))
		.release()
		.build()
		.perform();

	}

}
