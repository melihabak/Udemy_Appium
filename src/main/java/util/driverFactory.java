package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class driverFactory {

    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AppiumDriver initialize_Driver(String browser) {

        properties = configReader.getProperties();
        capabilities = new DesiredCapabilities();

        if (browser.equals("Android")) {
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "R68R9042DXV");
            capabilities.setCapability("appPackage", "com.dmall.mfandroid");
            capabilities.setCapability("appActivity", "com.dmall.mfandroid.activity.base.NHomeActivity");
            capabilities.setCapability("automationName", "UIAutomator2");
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("platformVersion", "12.0");

        } else if (browser.equals("iOS")) {
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("udid", "");
            capabilities.setCapability("appPackage", "");
            capabilities.setCapability("appActivity", "");

        }

        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        int impWait = Integer.parseInt(properties.getProperty("implicitlyWait"));
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        return getDriver();
    }
    public static AppiumDriver getDriver(){
        return driver;
    }
}
