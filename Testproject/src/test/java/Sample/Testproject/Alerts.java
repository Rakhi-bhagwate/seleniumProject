package Sample.Testproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {
	public static WebDriver driver;
	@Test()
	public void alert() throws InterruptedException {
		NavigateToURL("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1123");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(4000);
		alert.accept();
		Thread.sleep(4000);
	}
	@BeforeMethod
	public static void launchBrowser() {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
	}
	
	public static void NavigateToURL(String URL) {
		driver.get(URL);
	}
	
	@AfterMethod
	public static void quit()
	{
		driver.quit();
	}

}
