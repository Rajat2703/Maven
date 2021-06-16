package quickclickacedemy1.mavenjava1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.Login;

public class create {
	
	   private WebDriver driver;
		@Test
		public void crea() throws IOException, InterruptedException 
			{
				
				
				Homepage hi = new Homepage();
				this.driver =hi.basePageNavigation();
				Login lq = new Login(this.driver);
				lq.plusbutton().click();
				lq.search().sendKeys("Task");
				lq.searchkit().click();
				Thread.sleep(3000);
			    lq.kitelement().sendKeys("mack");
			    lq.kitsave().click();
			    lq.kitclose().click();
			    lq.menu().click();
			    JavascriptExecutor js=(JavascriptExecutor)driver;
			    js.executeScript("document.querySelector('.v-navigation-drawer__content').scrollTop=1000");
			    driver.findElement(By.xpath("//div[@class='d-flex col-9']//div[@class='v-list-item__content']//div[contains(text(),'Task')]")).click();
			    		
			
			}
	}


