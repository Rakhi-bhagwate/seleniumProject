package Practice.Jenkins;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import junit.framework.Test;
//import org.testng.annotations.Test;

public class ExcelReadData {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void launchBrowser() {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
	}
	
	
    @Test
	public void tc() throws IOException, InterruptedException {
		/*System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		// TODO Auto-generated method stub
*/		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		ArrayList<String> name = readExcelData(0,"D://list.xlsx","Sheet1");

		ArrayList<String> pass = readExcelData(1,"D://list.xlsx","Sheet1");
//		System.out.println(name.get(0));
//		System.out.println(pass.get(0));

		
		for(int i=0; i<name.size();i++) {
			driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(name.get(i));
			driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(pass.get(i));
			driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
			Thread.sleep(4000);
		}
		
	}
	
	public ArrayList<String> readExcelData(int colNo,String path,String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet(sheetName);
		//XSSFSheet s=wb.getSheetAt(0);
		Iterator <Row> rowIterator = s.iterator();
		rowIterator.next();
		ArrayList<String> list = new ArrayList<String>();
		while(rowIterator.hasNext()) {
			list.add(rowIterator.next().getCell(colNo).getStringCellValue());
			
		}
		System.out.println("List ="+ list);
		return list;
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		ExcelReadData data = new ExcelReadData();
		data.tc();
	}
	@AfterMethod
	public static void quit()
	{
		driver.quit();
	}
}
