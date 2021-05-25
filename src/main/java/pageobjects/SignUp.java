package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	
	public WebDriver driver;
	
	By FirstName = By.id("ContactInformation_FirstName");
	By LastName = By.id("ContactInformation_LastName");
	By Email = By.id("ContactInformation_EmailAddress");
	By CompanyName = By.id("ContactInformation_CompanyName");	
	By Password = By.id("ContactInformation_Password");
	By ConfirmPassword = By.id("ContactInformation_ConfirmPassword");
	By CompanyType= By.id("ContactInformation_CompanyType");
	By  checkbox = By.className("container-checkbox");
	By submitButton =By.id("submitButton");
	
	
	
	public SignUp(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getFirstName()
	{
		return driver.findElement(FirstName);
	}
	public WebElement getLastName()
	{
		return driver.findElement(LastName);
	}
	public WebElement getEmail()
	{
		return driver.findElement(Email);
		
	}
	public WebElement getCompanyName()
	{
		return driver.findElement(CompanyName);
	}
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement getConfirmPassword()
	{
		return driver.findElement(ConfirmPassword);
	}
	public WebElement getCompanyType()
	{
		return driver.findElement(CompanyType);
	}
	public WebElement getcheckbox()
	{
		return driver.findElement(checkbox);
	}
	public WebElement getsubmitButton()
	{
		return driver.findElement(submitButton);
	}
	
	}	


