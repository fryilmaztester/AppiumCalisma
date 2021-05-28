package Appium;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Appium.TC04Scroll.scrollElement;

public class TC05Scrollİndiviual {

/*
Store Uyhulamasını aç (Uygulama verilecektir)
(Appium Desktop Kuurlumunu ve DesiredCapabilites leri lutfen bakmadan yazınız)
Açıldığını verif et
Country oalrak Uruguay ı seç
Name Kısmınına FRYTechEdu yaz
Gender işaretli değilse işaretle,
Lets Shop Butonuna tıkla

 */

    @Test
        public void denemememe() throws Exception {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.UDID,"988a1b4545554b494b");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SamsungS8");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/fatihyilmaz/Desktop/AppiumTutorial/AndroidApk/General-Store.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<WebElement> androidDriver = new AndroidDriver<>(url,desiredCapabilities);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement country = androidDriver.findElementById("android:id/text1");
        country.click();
        WebElement uruguay = androidDriver.findElementByXPath("//*[@text = 'Uruguay']");
        int retry = 0;
        while (retry <= 500) {
            try {
                uruguay.isDisplayed();
                uruguay.click();
                break;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                Dimension size = androidDriver.manage().window().getSize();

                int sbit = (int) (size.width * 0.6);
                int startPoint = (int) (size.height * 0.6);
                int endPoint = (int) (size.height * 0.1);



                new TouchAction(androidDriver)
                        .press(PointOption.point(sbit, startPoint))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                        .moveTo(PointOption.point(sbit, endPoint))
                        .release().perform();

                retry++;
            }
        }
/*
        int retry = 0;
        while (retry <= 60) {
            try {
                androidDriver.findElementByXPath("//*[@text = 'Uruguay']").click();
                break;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                androidDriver.findElementById("android:id/text1").getText().equals("Uruguay");
                retry++;
            }
        }

 */


    }
}
