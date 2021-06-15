package quickclickacedemy1.mavenjava1;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageobjects.Login;
import pageobjects.excel;
import resources.Base;

public class mail extends Base{
	public class Homepage extends Base{
		
		@Test
		
		public void basePageNavigation() throws IOException, InterruptedException
		{
		
		driver= initializeDriver();
	   driver.get("https://www.mailinator.com/");
	   driver.manage().window().maximize();
	   
	   Login ml = new Login(driver);
	   excel ec= new excel();
	   excel Password2=ec.Exceldata();
	   
	   ml.getEmailtext().sendKeys(Password2.connectionEmail);
	   ml.getEmailbutton().click();
       ml.getEmail().click();
      driver.switchTo().frame("html_msg_body");
      ml.activate().click();
      String MainWindow=driver.getWindowHandle();
      Set<String> s1=driver.getWindowHandles();		
      Iterator<String> i1=s1.iterator();		
      		
      while(i1.hasNext())			
      {		
          String ChildWindow=i1.next();		
          		
          if(!MainWindow.equalsIgnoreCase(ChildWindow))			
          {    		
               
                  // Switching to Child window
                  driver.switchTo().window(ChildWindow);
                  driver.findElement(By.id("submitButton")).click();
                  
                
      
}
}
      
		}
		
		
		
		
	}}