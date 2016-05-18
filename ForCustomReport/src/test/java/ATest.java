import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;





public class ATest 
{
	@Test
	public void start()
	{
		 // ExtentReports extent = ExtentReports.get(A.class);
		  
		  
		  
          // Call init method and specify the location where you want to save this report

          // second parameter is set to true it means it will overwrite report with new one

          //extent.init("C:\\Mukesh\\Report\\myreport.html", true);



          // Start Test

          //extent.startTest("Verify Page Title");
		//
		FirefoxDriver dr=new FirefoxDriver();
		System.out.println("initialized");
		dr.get("http://www.bittechusa.com");
		Assert.assertTrue(dr.getTitle().contains("bittech"));
		dr.findElement(By.xpath(".//*[@id='me-header']/div[1]/div/ul/li[2]/a/strong")).click();
	}

}
