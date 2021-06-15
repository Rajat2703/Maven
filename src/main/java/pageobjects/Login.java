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
	By Emailbutton = By.className("btn-go-public");
	By Email		= By.xpath("//td[contains(text(),'Welcome to Commonareas - Verify Email')]");
	By Activate = By.className("em_wrapper");
	By plusbutton =By.xpath("//button[@class='plus-button v-btn v-btn--fab v-btn--flat v-btn--round v-btn--text theme--light v-size--default']");
	By icon =By.xpath("//*[local-name()='svg' and @icon='new-contact-icon']/*[local-name()='path']");
	By cfirstName =By.id("firstName");
	By clastName =By.id("lasttName");	
	By cemailadd =By.id("email");
	By save =By.xpath("//button[@class='button-pop-ups--size ca-button-green v-btn v-btn--contained theme--light v-size--default']");
	By group =By.cssSelector(".v-input--is-focused .v-select__selections");
	By menu =By.xpath("//i[@class=\"v-icon notranslate material-icons theme--dark\"]");
	By connec =By.xpath("//div[contains(text(),'Connections')]");
	By filter =By.xpath("//div[@class=\"d-flex align-center app-secondary-header-left--buttons fill-height gray-divider\"]");
	By searchconn =By.xpath("//div[@class=\"v-input theme--light v-text-field v-text-field--is-booted v-text-field--enclosed v-text-field--outlined\"]//div[@class=\"v-input__control\"]//div[@class=\"v-text-field__slot\"]//input");
	
	
	By search =By.xpath("//*[contains(@placeholder,'Search')]");
	By connsave =By.xpath("//span[contains(text(),'Apply')]");
	By searchkit =By.xpath("//div[contains(text(),'Task')]");
	
	By kitelement =By.xpath("//div[@class='v-input kit-control-text layout-alignment theme--light v-text-field v-text-field--is-booted v-text-field--enclosed v-text-field--outlined']//div[@class='v-input__control']//div[@class='v-input__slot']//div[@class='v-text-field__slot']//input[@controlname='name']");
	By kitsave =By.xpath("//span[contains(text(), 'SAVE')]");
	By kitclose =By.xpath("//div[@class='subheader--button-icon-wrapper fill-height d-flex align-center col']//div[@class='col col-6']//button[@class='navi-bar--button v-btn v-btn--flat v-btn--text theme--light v-size--small']");


	
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
	public WebElement getEmailbutton()
	{
	return driver.findElement(Emailbutton);
	}
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement activate()
	{
		return driver.findElement(Activate);
	}
	public WebElement plusbutton()
	{
		return driver.findElement(plusbutton);
	}
	public WebElement icon()
	{
		return driver.findElement(icon);
	}
	public WebElement cfirstName()
	{
		return driver.findElement(cfirstName);
	}
	public WebElement clastName()
	{
		return driver.findElement(clastName);
	}
	public WebElement cemailadd()
	{
		return driver.findElement(cemailadd);
	}
	public WebElement save()
	{
		return driver.findElement(save);
	}
	public WebElement group()
	{
		return driver.findElement(group);
	}
	public WebElement menu()
	{
		return driver.findElement(menu);
	}
	public WebElement connec()
	{
		return driver.findElement(connec);
	}
	public WebElement filter()
	{
		return driver.findElement(filter);
	}
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement searchconn()
	{
		return driver.findElement(searchconn);
	}
	public WebElement searchkit()
	{
		return driver.findElement(searchkit);
	}
	public WebElement kitelement()
	{
		return driver.findElement(kitelement);
	}
	public WebElement connsave()
	{
		return driver.findElement(connsave);
	}
	public WebElement kitsave()
	{
		return driver.findElement(kitsave);
	}
	public WebElement kitclose()
	{
		return driver.findElement(kitclose);
	}
}

