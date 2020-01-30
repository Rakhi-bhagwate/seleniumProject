package Sample.Testproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload {
@Test
public void file() {
	System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	// Initialize browser.
	WebDriver driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	driver.navigate().to("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
//	Thread.sleep(2000);
	
	WebElement browse = driver.findElement(By.id("uploadfile"));

	browse.sendKeys("C:\\Users\\rakhi.bhagwate\\Downloads\\home.component.html");
	
}
}
