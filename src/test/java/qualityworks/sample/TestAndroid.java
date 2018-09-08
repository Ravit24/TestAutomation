package qualityworks.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class TestAndroid {
	
	public void testAndr() throws MalformedURLException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("deviceName", "03157df3ed664723");
       capabilities.setCapability("appPackage", "com.cricbuzz.android");
       capabilities.setCapability("appActivity","com.cricbuzz.android.lithium.app.view.activity.NyitoActivity");

        // Set job name
//        capabilities.setCapability("name", "Quality Works Android Sample" + date);
//        String appPath = System.getenv("android_app_path");
//        assert appPath != null: "Path to Android app is not set";
//        System.out.println("Android App path: "+ appPath);
//        capabilities.setCapability("app", appPath);
      AppiumDriver  driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    String currentActivity = driver.currentActivity();
    System.out.println(currentActivity);
	}
	public static void main(String[] args) throws MalformedURLException {
		TestAndroid ta = new TestAndroid();
		ta.testAndr();
	}

}
