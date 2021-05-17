package Appium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScrollDeneme extends BaseDriver{


    @Test
    public void scrolll() throws Exception{

        AndroidDriver androidDriver = getAppiumDriver();

        String apıDemosActual = androidDriver.findElementByXPath("//*[@text = 'API DEMOS']").getText();
        String apıDemosExpected = "API DEMOS";
        Assert.assertEquals(apıDemosActual,apıDemosExpected);


        androidDriver.findElementByAccessibilityId("Views").click();
        Assert.assertTrue(androidDriver.findElementByAccessibilityId("Animation").isDisplayed());

        androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector())." +
                "scrollIntoView(text(\"ScrollBars\"))").click();

       androidDriver.findElementByXPath("\t\n" +
               "//android.widget.TextView[@content-desc=\"3. Style\"]").click();

        Dimension dimension = androidDriver.manage().window().getSize();
        System.out.println("Size: " + dimension);
        int start_y = (int) (dimension.height * 0.2);
        System.out.println("start_y: " + start_y);
        int start_x = (int) (dimension.width * 0.2);
        System.out.println("start_x: " + start_x);

        int end_y = (int) (dimension.height * 0.3);
        System.out.println("end_y: " + end_y);
        int end_x = (int) (dimension.width * 0.1);
        System.out.println("end_x: " + end_x);

        TouchAction touchAction = new TouchAction(androidDriver);

        touchAction.press(PointOption.point(start_x, start_y)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                moveTo(PointOption.point(end_x, end_y)).release().perform();

    }
}
