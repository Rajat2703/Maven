package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Developer\\eclipse-workspace\\mavenjava1\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	  String browserName = prop.getProperty("browser");
	  System.out.println(browserName);
	  
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C://Users//Developer//Downloads//eclipse-java-2020-06-R-win32-x86_64 (1)//chromedriver.exe");
		  driver= new ChromeDriver();
	  }
	  else if(browserName=="firefox")
	  {
		  
		  
	  }
	  
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  return driver;
	  
	}}
