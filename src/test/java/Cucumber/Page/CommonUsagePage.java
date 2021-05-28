package Cucumber.Page;

import Cucumber.Utilities.Driver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static Cucumber.Utilities.Driver.appiumDriver;

public class CommonUsagePage {

    public CommonUsagePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(),
                Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[2]")
    public AndroidElement okOrNok;
}
