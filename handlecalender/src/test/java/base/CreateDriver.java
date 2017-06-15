package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class CreateDriver 
{

	public WebDriver driver;
	@BeforeSuite
	public void StartBrowser()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		// driver.get("http://jqueryui.com/datepicker/");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Push notification has been disabled");
		
		
	}
	
	
/*	@AfterSuite
	public void EndBrowser()
	{
		driver.quit();
	}
*/	
}
