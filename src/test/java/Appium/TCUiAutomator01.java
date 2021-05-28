package Appium;

import Cucumber.Page.AllPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
ApıDemos uygulamsını açınız
Uygulamanın açıldığını verify ediniz
Views e tıkla
Kaç tane clicklenebilir veri olduğunun sayısının konsola yazdır
 */
public class TCUiAutomator01 extends BaseDriver{

    @Test
    public void clicklenebilir() throws MalformedURLException {


        AndroidDriver androidDriver = getAppiumDriver();

        String apıDemosActual = androidDriver.findElementByXPath("//*[@text = 'API DEMOS']").getText();
        String apıDemosExpected = "API DEMOS";
        Assert.assertEquals(apıDemosActual, apıDemosExpected);

        androidDriver.findElementByAccessibilityId("Views").click();
        List<AndroidElement> clickable = androidDriver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
        int size = clickable.size();
        System.out.println("Clicklenebilir: " + size);
    }

}
