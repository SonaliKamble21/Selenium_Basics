package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); //click on sign in button
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct alert msg");
		}else {
			System.out.println("incorrect alert msg");
		}
		alert.accept();
		
		

	}

}
