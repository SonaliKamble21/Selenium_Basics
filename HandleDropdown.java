package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.orangehrm.com/contact-sales/"); //enter url
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']")));
		select.selectByVisibleText("India");
		

	}

}
