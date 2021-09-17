package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenInternetExplorer {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "F:\\Drivers\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		
		driver.quit();
		

	}

}
