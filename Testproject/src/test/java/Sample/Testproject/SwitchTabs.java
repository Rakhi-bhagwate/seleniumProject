package Sample.Testproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchTabs {
@Test
public void switchTabs() throws InterruptedException {
	System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	// Initialize browser.
	WebDriver driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.navigate().to("https://www.tutorialspoint.com/index.htm");

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, 2000)");
	Thread.sleep(2000);
	
	 
	WebElement asp_net = driver.findElement(By.xpath("/html/body/div[4]/div[13]/div/div[1]/a/div"));
	asp_net.click();
	
	Thread.sleep(2000);
	Set<String> windowIds = driver.getWindowHandles();
	Iterator<String> iter = windowIds.iterator();
	String mainWindow = iter.next();
	String childWindow = iter.next();
	driver.switchTo().window(childWindow);
//	comment above 5 lines to call the commented function
//	switchToWindow(2); It will iterate 2 times and go to child window
	System.out.println("2nd");

	 WebElement category = driver.findElement(By.xpath("//*[@id=\"logo-menu\"]/div/div[1]/div/a/span"));
	 category.click();
	 Thread.sleep(2000);
	 WebElement engg_tut = driver.findElement(By.xpath("//*[@id=\"logo-menu\"]/div/div[1]/div/ul/li/ul/li[8]/a"));
	 engg_tut.click();
	 Thread.sleep(2000);
	
	 WebElement antenna = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[5]/div"));
	 antenna.click();
	 WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/h1[1]"));
	 String heading = text.getText();
	 System.out.println(heading);
	 Thread.sleep(4000);
	 
	 driver.close();
	 Thread.sleep(2000);
	 driver.switchTo().window(mainWindow);
//	 instead of above line to use commented function
//	 switchToWindow(1); It will iterate 1 time and go to main window
	 
	 System.out.println("The title is:"+ driver.getTitle());
	 Thread.sleep(3000);
	 driver.close();
}

//  index=1 --- main window , index=2 --- childwindow
//	 public static void switchWindow(int index) {
//		 String windowId = null;
//		 Set<String> windowsId = driver.getWindowHandles();
//		 Iterator<String> iter = windowsId.iterator();
//	for(int i=1; i<=index; i++) {
//		windowId = iter.next();
		 
//		 }
//	driver.switchTo().window(windowId);
//}

}

