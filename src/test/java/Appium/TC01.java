package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC01 extends BaseDriver {

/*
Uygulamyaı Ac
Uygulamnın açıldığını verify et
Views butonuna tıkla
Views tıklandığını verify et
 */


    @Test
    public void tc01() throws Exception {

        AndroidDriver androidDriver = getAppiumDriver();

        String apıDemosActual = androidDriver.findElementByXPath("//*[@text = 'API DEMOS']").getText();
        String apıDemosExpected = "API DEMOS";
        Assert.assertEquals(apıDemosActual,apıDemosExpected);

        androidDriver.findElementByAccessibilityId("Views").click();
        Assert.assertTrue(androidDriver.findElementByAccessibilityId("Animation").isDisplayed());




    }


}
