package Cucumber.Page;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;

import static Cucumber.Utilities.Driver.appiumDriver;

public class SubmenuPage {

    public SubmenuPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView\n")
    public AndroidElement hamburgerIcon;

    @AndroidFindBy(accessibility = "test-WEBVIEW")
    public AndroidElement webView;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-enter a https url here...\"]")
    public AndroidElement urlEnterArea;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-GO TO SITE\"]")
    public AndroidElement gotoSiteButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Amazon\"]")
    public AndroidElement amazonImage;




}
