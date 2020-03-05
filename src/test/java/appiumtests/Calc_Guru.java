package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Calc_Guru {

	RemoteWebDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException {
		// Set up desired capabilities and pass the Android app-activity and app-package
		// to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("VERSION", "9");
		capabilities.setCapability("deviceName", "Emulator");
		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("appPackage", "com.android.calculator2");
		// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator"); // This is Launcher activity of
																							// your app (you can get it
																							// from apk info app)
		// Create RemoteWebDriver instance and connect to the Appium server
		// It will launch the Calculator App in Android Device using the configurations
		// specified in Desired Capabilities
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@Test
	public void testCal() throws Exception {
		// locate the Text on the calculator by using By.name()
		driver.findElementById("com.android.calculator2:id/digit_5").click();

		driver.findElementById("com.android.calculator2:id/op_add").click();

		driver.findElementById("com.android.calculator2:id/digit_4").click();

		driver.findElementById("com.android.calculator2:id/eq").click();
		// locate the edit box of the calculator by using By.tagName()
		// WebElement results=driver.findElement(By.tagName("EditText"));
		// Check the calculated value on the edit box
		// assert results.getText().equals("6"):"Actual value is : "+results.getText()+"
		// did not match with expected value: 6";

	}

}
