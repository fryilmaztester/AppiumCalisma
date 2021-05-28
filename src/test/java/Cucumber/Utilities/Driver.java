package Cucumber.Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static AndroidDriver appiumDriver;
    public static AndroidDriver appiumDriverAPIDEMOS;

    public static AndroidDriver getAppiumDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
        desiredCapabilities.setCapability("appPackage", ConfigReader.getProperty("appPackage"));
        desiredCapabilities.setCapability("appActivity",ConfigReader.getProperty("appActivity"));
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        // desiredCapabilities.setCapability("autoAcceptAlert",true);
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, ConfigReader.getProperty("udid"));
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,false);
        appiumDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return appiumDriver;
    }

    public static AndroidDriver getAppiumDriverApıDemos()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        // desiredCapabilities.setCapability("autoAcceptAlert",true);
        desiredCapabilities.setCapability(MobileCapabilityType.APP,ConfigReader.getProperty("app"));
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, ConfigReader.getProperty("udid"));
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,false);
        appiumDriverAPIDEMOS = new AndroidDriver(appiumServerURL,desiredCapabilities);
        appiumDriverAPIDEMOS.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return appiumDriverAPIDEMOS;
    }


    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
    }
}
