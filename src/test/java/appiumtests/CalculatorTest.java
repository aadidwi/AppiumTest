package appiumtests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	// AndroidDriver driver;
	// AppiumDriver driver;

	public static void main(String[] args) {
		try {
			openCalculator();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi 4");
		cap.setCapability("udid", "348090977ce4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.1.2 N2G47H");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("noReset", false);
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, cap);

		System.out.println("Application started .....");
	}
}