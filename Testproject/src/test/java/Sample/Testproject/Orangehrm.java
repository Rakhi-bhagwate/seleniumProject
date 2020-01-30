package Sample.Testproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orangehrm {
	static WebDriver driver=null;
	 @BeforeMethod() 
		public void beforeSuite() {
			System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			// Initialize browser.
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
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
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		admin.click();
		Thread.sleep(2000);
		
		WebElement jobs = driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]"));
		act.moveToElement(jobs).perform();
		Thread.sleep(2000);
		
		WebElement jobcategory = driver.findElement(By.xpath("//*[@id=\"menu_admin_jobCategory\"]"));
		jobcategory.click();
		
		/*WebElement addjob = driver.findElement(By.xpath("//*[@id=\"btnAdd\"]"));
		addjob.click();
		
		WebElement name = driver.findElement(By.name("jobCategory[name]"));
		name.sendKeys("Satwik");
		
		WebElement save = driver.findElement(By.name("btnSave"));
		save.click();
		*/
		deleteJobTitle("Rakhi");
	}
	
		
		public static void deleteJobTitle(String jobCateory) {
			System.out.println("delete");
			//WebDriver driver=null;
			List<WebElement>  checkboxes =driver.findElements(By.xpath("//table[@id='resultTable']//tbody//input/../following-sibling::td/a"));
			System.out.println(checkboxes.size());

			for(int i=0;i<checkboxes.size();i++)
			{

			if(checkboxes.get(i).getText().equalsIgnoreCase(jobCateory)) 
//			{
			driver.findElement(By.xpath("(//table[@id='resultTable']//tbody//input/../following-sibling::td/a)["+i+"]/../preceding-sibling::td/input")).click();
			
//			}
			driver.findElement(By.id("btnDelete")).click();
		
			}
		}

}
