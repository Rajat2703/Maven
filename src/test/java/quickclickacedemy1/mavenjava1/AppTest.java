package quickclickacedemy1.mavenjava1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.Login;
import pageobjects.excel;
import resources.Base;

/**
 * Unit test for simple App.
 */
public class AppTest extends Base  //inheritance
{
    private WebDriver driver;
	@Test
	public void beforeMethod() throws IOException, InterruptedException, AWTException 
	{
		
		Homepage hw = new Homepage();
		this.driver = hw.basePageNavigation();
		excel ep = new excel();
		excel excelData=ep.Exceldata();
		//this.driver= initializeDriver(); //this is used when we want to use class variable
		Login lo = new Login(this.driver);
		lo.plusbutton().click();
		lo.icon().click();
		lo.cfirstName().sendKeys("mack");
		lo.clastName().sendKeys("mack");
		lo.cemailadd().sendKeys(excelData.connectionEmail);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(Ke);
		lo.save().click();
	}
	
		
	
	
}

