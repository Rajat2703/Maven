package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	
	By Username = By.id("UserName");
	By Password = By.id("Password");
	By Loginbutton = By.id("login_button");
	By Emailtext  = By.className("form-control");
	
	
	
	
	public Login(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getUsername()
	{
		return driver.findElement(Username);
	}
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getLoginbutton()
	{
		return driver.findElement(Loginbutton);
	}
	
	public WebElement getEmailtext()
	{
	return driver.findElement(Emailtext);
	}	
}

