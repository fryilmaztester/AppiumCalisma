package Appium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class TC04Scroll extends BaseDriver{

    /*

     */


    public static void scrollElement(double sbt, double startP, double endP) throws Exception{
        AndroidDriver androidDriver = getAppiumDriver();

        Dimension size = androidDriver.manage().window().getSize();


        int sbit = (int) (size.width * sbt);
        int startPoint = (int) (size.height * startP);
        int endPoint = (int) (size.height * endP);



        new TouchAction(androidDriver)
                .press(PointOption.point(sbit, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(sbit, endPoint))
                .release().perform();

    }
}
