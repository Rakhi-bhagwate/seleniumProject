package Sample.Testproject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
	
@Test
public void checkbox(){
	System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	// Initialize browser.
	WebDriver driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	List <WebElement> flavour = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[5]/div/form/table/tbody/tr[8]/td[2]/span[1]/input[1]"));
	
	flavour.get(0).click();
	int i=0;
	for(Iterator iterator = flavour.iterator();
		iterator.hasNext();)
	{
		WebElement webelement = (WebElement)iterator.next();
		if(flavour.get(i).isSelected()) {
			System.out.println(flavour.get(i).getAttribute("value"));
		}
		i++;
		
			
		}
		
}
}

