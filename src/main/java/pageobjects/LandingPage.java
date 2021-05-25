package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage  {
	
	public WebDriver driver;
	
	By signin = By.linkText("Start a free account");
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
			

}
