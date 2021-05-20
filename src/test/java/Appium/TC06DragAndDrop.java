package Appium;

/*

    Uygulamayı Açınız (ApıDemos)
    Uygulamanın AÇıldığının verify ediniz
    Views e tıklanyınız
    Views ın açıldığının verify ediniz
    DragandDrop a tıklayınız
    DragandDrop un açıldığını verify ediniz
    1.topu 2. topa sürekleyiniz
    Topun drag edildiğini verify ediniz

     */

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class TC06DragAndDrop extends BaseDriver  {


    @Test
    public void dragAndDrop() throws Exception {


        AndroidDriver androidDriver = getAppiumDriver();

        String apıDemosActual = androidDriver.findElementByXPath("//*[@text = 'API DEMOS']").getText();
        String apıDemosExpected = "API DEMOS";
        Assert.assertEquals(apıDemosActual, apıDemosExpected);


        androidDriver.findElementByAccessibilityId("Views").click();
        Assert.assertTrue(androidDriver.findElementByAccessibilityId("Animation").isDisplayed());

        androidDriver.findElementByXPath("\t\n" +
                "//android.widget.TextView[@content-desc=\"Drag and Drop\"]").click();

        Assert.assertTrue(androidDriver.findElementByXPath("//*[@text = " +
                "'VİEWS/DRAG AND DROP']").isDisplayed());

        //1.Yol with --->  LongPress and withElement method



        TouchAction touchAction = new TouchAction(androidDriver);
        WebElement drag = androidDriver.findElementById("io.appium.android.apis:" +
                "id/drag_dot_1");
        WebElement drop = androidDriver.findElementById("io.appium.android.apis:" +
                "id/drag_dot_2");

        touchAction.longPress(LongPressOptions.longPressOptions().
                withElement(ElementOption.element(drag))).
                moveTo(ElementOption.element(drop)).
                release().
                perform();

        Thread.sleep(2000);
        Assert.assertTrue(androidDriver.findElementById("io.appium.android.apis:id/drag_text")
                .isDisplayed());


    }

    //2.Yol ---->  press and waitAction
    @Test
    public void dragAndDropTwo() throws Exception{

        AndroidDriver androidDriver = getAppiumDriver();

        String apıDemosActual = androidDriver.findElementByXPath("//*[@text = 'API DEMOS']").getText();
        String apıDemosExpected = "API DEMOS";
        Assert.assertEquals(apıDemosActual, apıDemosExpected);


        androidDriver.findElementByAccessibilityId("Views").click();
        Assert.assertTrue(androidDriver.findElementByAccessibilityId("Animation").isDisplayed());

        androidDriver.findElementByXPath("\t\n" +
                "//android.widget.TextView[@content-desc=\"Drag and Drop\"]").click();

        Assert.assertTrue(androidDriver.findElementByXPath("//*[@text = " +
                "'VİEWS/DRAG AND DROP']").isDisplayed());


        TouchAction touchAction = new TouchAction(androidDriver);
        WebElement drag = androidDriver.findElementById("io.appium.android.apis:" +
                "id/drag_dot_1");
        WebElement drop = androidDriver.findElementById("io.appium.android.apis:" +
                "id/drag_dot_2");

        touchAction.
                press(ElementOption.element(drag)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).
                moveTo(ElementOption.element(drop)).
                release().
                perform();

        Thread.sleep(2000);
        Assert.assertTrue(androidDriver.findElementById("io.appium.android.apis:id/drag_text")
                .isDisplayed());








}
}
