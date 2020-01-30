package Manager;

import org.openqa.selenium.WebDriver;

import CucumberTest.Pages;

public class ProjectManager {
	private WebDriver driver;
	private Pages page;

	public ProjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
	public Pages getPage() {
		return (page==null)? page = new Pages(driver): page;
	}

}
