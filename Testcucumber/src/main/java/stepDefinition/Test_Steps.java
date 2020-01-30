package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CucumberTest.Pages;
import Manager.ProjectManager;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	 WebDriver driver;
	  Pages page;
	  ProjectManager pm; 
	  
	    
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser.
		
		driver=new ChromeDriver(); 
		pm = new ProjectManager(driver);
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
	}

	

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String username, String password) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		Pages page = new Pages(driver);
////		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(username);
////		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
////		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//		page.log(username,password);
//		
//		pm = new ProjectManager(driver);
		page=pm.getPage();
		
		page.log(username,password);
		
	}
	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
		
	    System.out.println("Login Successful");
	    
	}

//	@Given("^User is on Admin Page$")
//	public void user_is_on_Admin_Page() throws Throwable {
//	   System.out.println("User is on admin page");
//	}

//	@When("^User mouse hover on admin and job$")
//	public void user_mouse_hover_on_admin_and_job() throws Throwable {
//	    Actions action=new Actions(driver);
//	    action.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).perform();
//	    Thread.sleep(2000);
//	    action.moveToElement(driver.findElement(By.id("menu_admin_Job"))).perform();
//	    Thread.sleep(2000);
//	   
//	    
//	    
//	}
//
//	@When("^click on job categories$")
//	public void click_on_job_categories() throws Throwable {
//	    driver.findElement(By.id("menu_admin_jobCategory")).click();
//	    Thread.sleep(2000);
//	    
//	}
//
//	@Then("^Add job categories$")
//	public void add_job_categories() throws Throwable {
//		 driver.findElement(By.id("btnAdd")).click();
//		 driver.findElement(By.id("jobCategory_name")).sendKeys("test6");
//	     driver.findElement(By.id("btnSave")).click();
//	    
//	}
//	@Given("^User is on admin page$")
//	public void user_is_on_admin_page() throws Throwable {
//		System.out.println("User is on admin page");
//	 
//	}

	
	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application() throws Throwable {
		System.out.println("Hii");
		Thread.sleep(2000);
		page.logOut();
		
		
		/*driver.findElement(By.xpath("//a[text()='Welcome Admin']")).click();
		Thread.sleep(3000);
       Thread.sleep(2000);
       Actions actions = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"));
		actions.moveToElement(target).perform();
		Thread.sleep(2000);
		target.click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();*/
	}

	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("bye");
	}
	
	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable usercredentials) throws Throwable {
	    List<List<String>> data = usercredentials.raw();
	    driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(data.get(0).get(1));
	    driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}
}
