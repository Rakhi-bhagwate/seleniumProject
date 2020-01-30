package Sample.Testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {
	
	@Test
	public void display() throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/menu/");
		
		Actions act = new Actions(driver);
		WebElement music = driver.findElement(By.id("ui-id-9"));
		act.moveToElement(music).perform();
		Thread.sleep(2000);
		
		WebElement rock = driver.findElement(By.id("ui-id-10"));
		act.moveToElement(rock).perform();
		Thread.sleep(2000);
		
		WebElement alternative = driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]"));
		alternative.click();
		Thread.sleep(3000);
		driver.quit();

	
		
	}
}
