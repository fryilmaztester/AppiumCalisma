package Cucumber.Page;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static Cucumber.Utilities.Driver.appiumDriver;

public class CartPage {

    public CartPage() {

        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[2]")
    public AndroidElement swipePoint;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Delete\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    public AndroidElement trashBag;
}
