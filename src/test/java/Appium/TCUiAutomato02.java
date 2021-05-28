package Appium;

/*
 APı demos uygulamasını aç
 Açıldığını verify et
 Preference tıkla
 3.Preference tıkla
 eğer wifi click değilse
 Wifi setting soluk olmalı
 eğer clickli ise
 wifi setting tıkla
 Açılan yere fRYTechEDU yaz
 Tamam a bas

         */

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TCUiAutomato02 extends BaseDriver{

    @Test
    public void preference() throws Exception {

        AndroidDriver androidDriver = getAppiumDriver();
        String apıDemosActual = androidDriver.findElementByXPath("//*[@text = 'API DEMOS']").getText();
        String apıDemosExpected = "API DEMOS";
        Assert.assertEquals(apıDemosActual, apıDemosExpected);


        WebElement preference =  androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']");
        preference.click();


        WebElement preferenceDependicies = androidDriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']");
        preferenceDependicies.click();

        AndroidElement checkbox = (AndroidElement) androidDriver.findElementById("android:id/checkbox");

        if (checkbox.getAttribute("checked").equals("false")){
            checkbox.click();
        }

        WebElement wifiSettings = androidDriver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']");
        wifiSettings.click();

        WebElement wifiText = androidDriver.findElementById("android:id/edit");
        wifiText.sendKeys("FRYTechEdu");

        WebElement okButton = androidDriver.findElementById("android:id/button1");
        okButton.click();
    }
}
