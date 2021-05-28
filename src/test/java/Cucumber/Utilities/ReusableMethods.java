package Cucumber.Utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class ReusableMethods extends Driver{


    public static void waitFor(int second) {

        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void scrollElement(double anc, double startP, double endP) {

        Dimension size = appiumDriver.manage().window().getSize();


        int anchor = (int) (size.width * anc);
        int startPoint = (int) (size.height * startP);
        int endPoint = (int) (size.height * endP);

        ReusableMethods.waitFor(1);

        new TouchAction(appiumDriver)
                .press(PointOption.point(anchor, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(anchor, endPoint))
                .release().perform();

    }

    public static void scroolElementWithUiSelector(String text) {

        appiumDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector())" +
                ".scrollIntoView(text(\"" + text + "\"));");
    }

}
