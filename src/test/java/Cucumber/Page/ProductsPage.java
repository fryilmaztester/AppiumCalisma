package Cucumber.Page;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static Cucumber.Utilities.Driver.appiumDriver;

public class ProductsPage {

    public ProductsPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Drag Handle\"])[1]/android.widget.TextView")
    public AndroidElement dragButton;

    @AndroidFindBy(xpath = "//*[@text = 'Drag here to add to cart!']")
    public AndroidElement dropArea;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]")
    public AndroidElement dropZone;



    @AndroidFindBy(xpath = "//*[@text = 'Sauce Labs Backpack']")
    public AndroidElement firstProductTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"test-Item title\"]")
    public List<AndroidElement> productTitles;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]")
    public AndroidElement cart;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]")
    public AndroidElement cartProductTitle;

    @AndroidFindBy(accessibility = "test-Modal Selector Button")
    public AndroidElement filterButton;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[3]")
    public AndroidElement nameZToA;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")
    public AndroidElement lowToHigh;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"test-Price\"]")
    public List<AndroidElement> productsPrices;




}
