package quickclickacedemy1.mavenjava1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SeleniumTest {
	
	ExtentReports extent;
	
	
	@BeforeTest
	public void BrowserAutomation()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("automation report");
		reporter.config().setDocumentTitle("testing report");

	 extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester","Rajat lohiya" );
	
	
	}
	@Test
	public void elementUi()
	{
		extent.createTest("elementUI");
		System.setProperty("webdriver.chrome.driver","C://Users//Developer//Downloads//eclipse-java-2020-06-R-win32-x86_64 (1)//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.aajtak.in/");
		System.out.println(driver.getTitle());
		
		extent.flush();
		
	}

}
