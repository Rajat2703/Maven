package quickclickacedemy1.mavenjava1;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.SignUp;
import resources.Base;

public class Newuser  extends Base{
	
	@Test
	
	public void basePageNavigation() throws IOException
	{
	
	driver= initializeDriver();
   driver.get("https://commonareas.io/Public/Login?ReturnUrl=%2F");
    {
	
    	LandingPage l = new LandingPage(driver);
    	   l.getLogin().click();
    	   driver.manage().window().maximize();
    	   
    	   SignUp s= new SignUp(driver);
    	   s.getFirstName().sendKeys("Rajat");
    	   s.getLastName().sendKeys("Lohiya");
    	   s.getEmail().sendKeys("Rajat4@mailinator.com");
    	   s.getCompanyName().sendKeys("Etelligens");
    	   s.getPassword().sendKeys("1234567Aa");
    	   s.getConfirmPassword().sendKeys("1234567Aa");
    	   Select C = new Select(s.getCompanyType());
    	   C.selectByVisibleText("General Maintenance");
    	   s.getcheckbox().click();
    	   s.getsubmitButton().click();
    	   
    	  
    	   
	


	
    }
    }}


