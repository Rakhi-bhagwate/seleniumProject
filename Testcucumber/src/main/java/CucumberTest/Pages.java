package CucumberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	 WebDriver driver;
		public Pages (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how=How.XPATH,using="//*[@id=\"txtUsername\"]")
		 WebElement username;
		
		@FindBy(how=How.XPATH,using="//*[@id=\"txtPassword\"]")
		 WebElement password;
		
		@FindBy(how=How.XPATH,using="//*[@id=\"btnLogin\"]")
		 WebElement login;
		
		@FindBy(how=How.XPATH,using="//a[text()='Welcome Admin']")
		WebElement welcome;
		
		@FindBy(how=How.XPATH,using="//a[text()='Logout']")
		 WebElement logout;
		
		public void log(String uname, String pass) {
			username.sendKeys(uname);
			password.sendKeys(pass);
			login.click();
		}
		
		public void logOut() throws InterruptedException {
			welcome.click();
			Thread.sleep(2000);
			logout.click();
			
		}
		
}
