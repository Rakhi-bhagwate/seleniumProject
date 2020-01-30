package Sample.Testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	static WebDriver driver=null;

	@Parameters({ "browser" })
	@BeforeMethod
	public void Browserlaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System. setProperty("webdriver.gecko.driver", "D:\\chromedriver_win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}
   }
	@Test
	public void login() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		submit.click();
		Thread.sleep(4000);

	}
	
//	@Test
//	public void login1() throws InterruptedException {
//		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
//		username.sendKeys("Admin");
//		Thread.sleep(2000);
//		
//		WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
//		password.sendKeys("admin123");
//		Thread.sleep(2000);
//		
//		WebElement submit = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
//		submit.click();
//		Thread.sleep(4000);
//
//	}
}

