package quickclickacedemy1.mavenjava1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class appiumtest {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			opencalculator();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
		// TODO Auto-generated method stub
		
		public static void opencalculator() throws Exception 
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Galaxy A7");
			cap.setCapability("udid", "32006be1478cc52f");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "10");
			cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
			cap.setCapability("automationName", "UiAutomator1");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver= new AppiumDriver<MobileElement>(url, cap);
			
			System.out.println("Application Started");
			
		}

	

}
