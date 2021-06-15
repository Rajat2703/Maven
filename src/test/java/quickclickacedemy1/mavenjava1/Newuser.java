package quickclickacedemy1.mavenjava1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.SignUp;
import pageobjects.excel;
import resources.Base;

public class Newuser  extends Base{
	
	@Test
	
	public void basePageNavigation() throws IOException
	{
	
	driver= initializeDriver();
   driver.get("https://app.ca-test.com/Public/Login?ReturnUrl=%2F");
    {
	
    	LandingPage l = new LandingPage(driver);
    	   l.getLogin().click();
    	   driver.manage().window().maximize();
    	   excel Ec= new excel();
    	   excel Password=Ec.Exceldata();
    	 
    	  
    	   SignUp s= new SignUp(driver);
    	   s.getFirstName().sendKeys("Rajat");
    	   s.getLastName().sendKeys("Lohiya");
    	   s.getEmail().sendKeys(Password.connectionEmail);
    	   s.getCompanyName().sendKeys("Etelligens");
    	   s.getPassword().sendKeys("1234567Aa");
    	   s.getConfirmPassword().sendKeys("1234567Aa");
    	   Select C = new Select(s.getCompanyType());
    	   C.selectByVisibleText("General Maintenance");
    	   s.getcheckbox().click();
    	   s.getsubmitButton().click();
    	   
    	  
    	   
    	   String expectedTitle = "Sign Up";
           String actualTitle = driver.getTitle();
           Assert.assertEquals(actualTitle, expectedTitle);
           File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	   
    	   FileUtils.copyFile(src,new File("C://Users//Developer//Desktop//New Folder//screenshot.png"));
           
           driver.quit();


	
    }
    }}


