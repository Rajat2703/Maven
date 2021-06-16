package quickclickacedemy1.mavenjava1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.Login;

public class Kit {
	

    private WebDriver driver;
	@Test
	public void before() throws IOException, InterruptedException 
	{
		
		
		Homepage hi = new Homepage();
		this.driver =hi.basePageNavigation();
		Login lq = new Login(this.driver);
		lq.menu().click();
		lq.connec().click();
		lq.filter().click();
		lq.searchconn().sendKeys("lavi");
        lq.connsave().click();	
        
	
	}
}
