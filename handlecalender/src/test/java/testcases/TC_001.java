package testcases;
import org.testng.annotations.Test;
import base.CreateDriver;
import pages.HomePage;


public class TC_001 extends CreateDriver
{
	
	@Test(priority=1)
	public void test1() throws InterruptedException
	{
		System.out.println("SUCESSSSSSSSSSSSS");
		HomePage lp=new HomePage(driver);
		lp.calenderpopup();
	}
	
}
