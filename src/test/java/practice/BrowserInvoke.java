package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInvoke {

	
	@Test
	public static void browser() {
		WebDriverManager.chromedriver().setup();  // Automatically handles the driver
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
	}
	
	
	
}
