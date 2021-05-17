package Appium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.time.Duration;

public class TC03ScroolingDimension extends BaseDriver {


    @Test
    public void TC03ScroolingDimension() throws Exception {



        /*
    Uygulamayı Açınız
    Uygulamanın AÇıldığının verify ediniz
    Views e tıklanyınız
    Views ın açıldığının verify ediniz
    Sayfayı scroll ediniz (Dimension)

     */
        AndroidDriver androidDriver = getAppiumDriver();

        String apıDemosActual = androidDriver.findElementByXPath("//*[@text = 'API DEMOS']").getText();
        String apıDemosExpected = "API DEMOS";
        Assert.assertEquals(apıDemosActual,apıDemosExpected);

        androidDriver.findElementByAccessibilityId("Views").click();
        Assert.assertTrue(androidDriver.findElementByAccessibilityId("Animation").isDisplayed());
/*
        Dimension size = androidDriver.manage().window().getSize();
        System.out.println("Size: " + size);

        int sbit = (int) (size.width * 0.2);
        int startPoint = (int) (size.height * 0.5);
        int endPoint = (int) (size.height * 0.3);



        new TouchAction(androidDriver)
                .press(PointOption.point(sbit, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(sbit, endPoint))
                .release().perform();

 */


        Dimension dimension = androidDriver.manage().window().getSize();
        System.out.println("Size: " + dimension);
        int start_y = (int) (dimension.height * 0.7);
        System.out.println("start_y: " + start_y);
        int start_x = (int) (dimension.width * 0.5);
        System.out.println("start_x: " + start_x);

        int end_y = (int) (dimension.height * 0.4);
        System.out.println("end_y: " + end_y);
        int end_x = (int) (dimension.width * 0.2);
        System.out.println("end_x: " + end_x);

        TouchAction touchAction = new TouchAction(androidDriver);

        touchAction.press(PointOption.point(start_x, start_y)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                moveTo(PointOption.point(end_x, end_y)).release().perform();


        Thread.sleep(3000);




    }

    }
