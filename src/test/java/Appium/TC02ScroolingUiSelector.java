package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02ScroolingUiSelector extends BaseDriver{

    /*
    Uygulamayı Açınız (ApıDemos)
    Uygulamanın AÇıldığının verify ediniz
    Views e tıklanyınız
    Views ın açıldığının verify ediniz

    WebView e Scroll Ederek tılayınız (UiSelector)
    Açıldığını verify ediniz
     */


    @Test
    public void tc02UiSelector() throws Exception{

        AndroidDriver androidDriver = getAppiumDriver();

        String apıDemosActual = androidDriver.findElementByXPath("//*[@text = 'API DEMOS']").getText();
        String apıDemosExpected = "API DEMOS";
        Assert.assertEquals(apıDemosActual,apıDemosExpected);


        androidDriver.findElementByAccessibilityId("Views").click();
        Assert.assertTrue(androidDriver.findElementByAccessibilityId("Animation").isDisplayed());

        androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector())." +
                "scrollIntoView(text(\"WebView\"))").click();

        WebElement helloWord = androidDriver.findElementByXPath("//android.view.View[@content-desc=\"Hello World! - 1\"]/android.widget.TextView");
        Assert.assertTrue(helloWord.isDisplayed());


    }
}
