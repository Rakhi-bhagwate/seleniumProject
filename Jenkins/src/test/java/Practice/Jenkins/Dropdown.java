package Practice.Jenkins;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdown {

	public static WebDriver driver;
	/*public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		NavigateToURL("http://demo.guru99.com/test/newtours/register.php");
		actions();
		
		WebElement country = driver.findElement(By.name("country"));
		country.click();
		Select sel = new Select(country);
		//sel.selectByIndex(12);
		//sel.selectByVisibleText("BANGLADESH");
		sel.selectByValue("ARMENIA");
		Thread.sleep(5000);
	
	List<WebElement> l=sel.getOptions();
	for(WebElement x:l)
	{
		System.out.println(x.getText());
	}
	}*/
	
	@Test
	public static void actions() throws InterruptedException {
		NavigateToURL("http://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("firstName")).sendKeys("Paridhi");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("Agarwal");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("786987829");
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).sendKeys("test5@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("Kondapur");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.name("state")).sendKeys("Telangana");
		Thread.sleep(1000);
		driver.findElement(By.name("postalCode")).sendKeys("500084");
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.name("country"));
		country.click();
		Select sel = new Select(country);
		sel.selectByIndex(12);
		Thread.sleep(2000);
		List<WebElement> l=sel.getOptions();
		for(WebElement x:l)
		{
			System.out.println(x.getText());
		}
		driver.findElement(By.name("email")).sendKeys("test5");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("test@123");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("sign-in")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).sendKeys("test5");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
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
