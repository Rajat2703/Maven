package quickclickacedemy1.mavenjava1;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.Login;
import resources.Base;

public class Homepage extends Base{
	
	@Test
	
	public void basePageNavigation() throws IOException
	{
	
	driver= initializeDriver();
   driver.get("https://commonareas.io/Public/Login?ReturnUrl=%2F");
   
  

   
   Login lp = new Login(driver);
   lp.getUsername().sendKeys("Pradeep@etelligens.in");
   lp.getPassword().sendKeys("1234567Aa");
   lp.getLoginbutton().click();
   

	}
}
