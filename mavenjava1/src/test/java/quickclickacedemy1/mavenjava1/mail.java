package quickclickacedemy1.mavenjava1;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.Login;
import resources.Base;

public class mail extends Base{
	public class Homepage extends Base{
		
		@Test
		
		public void basePageNavigation() throws IOException
		{
		
		driver= initializeDriver();
	   driver.get("https://www.mailinator.com/");
	   driver.manage().window().maximize();
	   
	   Login ml = new Login(driver);
	   
	   ml.getEmailtext().sendKeys("Rajat3");
	   

}
}}