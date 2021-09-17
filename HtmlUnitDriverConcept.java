package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F://Drivers//chromedriver.exe");

		//WebDriver driver = new ChromeDriver(); // launch chrome
		WebDriver driver = new HtmlUnitDriver();
	

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/ServiceLogin"); // enter url
		
		System.out.println("Before login title is : " + driver.getTitle());
		
		//enter username
		driver.findElement(By.id("identifierId")).sendKeys("kamblesonali29@gmail.com");
		//click on next
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//enter password
		driver.findElement(By.name("password")).sendKeys("sonali@1994");
		//click on next
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		System.out.println("After login title is : " + driver.getTitle());
		
		

	}

}
