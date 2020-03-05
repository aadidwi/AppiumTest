package appiumtests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launch_Browser {

	private AndroidDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		// set the platform version
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability("platformName", "Android");
		// set your Device name. My device name was Charan007
		caps.setCapability("deviceName", "Pixel XL");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void launchApplication() throws Exception {
		driver.get("http://appium.io");
	}

}
