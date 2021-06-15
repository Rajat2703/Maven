package quickclickacedemy1.mavenjava1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.Login;
import pageobjects.excel;
import resources.Base;

public class Homepage extends Base {

	@Test
	public WebDriver basePageNavigation() throws IOException, InterruptedException {

		driver = initializeDriver();
		driver.get("https://marketplaceproperties.ca-test.com/#/Public/Login?ReturnUrl=%2F");


		excel ep = new excel();
		excel excelData = ep.Exceldata();
		String eTitle = "Common Areas";
		String aTitle = "";

		Login lp = new Login(driver);
		driver.manage().window().maximize();
		lp.getUsername().sendKeys(excelData.username);
		lp.getPassword().sendKeys("1234567Aa");
		lp.getLoginbutton().click();
		Thread.sleep(5000);
		aTitle = driver.getTitle();
		if (aTitle.contentEquals(eTitle))

		{
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("C://Users//Developer//Desktop//New Folder//screenshot.png"));
		} else {
			System.out.println("Test Failed");
		}
		return driver;

	}
}
