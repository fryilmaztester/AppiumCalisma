package Cucumber.stepdefinitons;

import Cucumber.Page.AllPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import static Cucumber.Utilities.Driver.appiumDriver;

/*
SwagLabs a login olunuz
Login olduğunuzu verify ediniz
1 farklı ürünü drag and drop ile sepete ekelyiniz
Sepete ekeldiğinizi verify ediniz (Doğruu ürünleri )
 */
public class DragAndDrop {
    AllPage allPage = new AllPage();

    @When("Kullanici ilk urunu drag ile sepete ekler")
    public void kullanici_ilk_urunu_drag_ile_sepete_ekler() {

        TouchAction touchAction = new TouchAction(appiumDriver);

        touchAction.longPress(LongPressOptions.longPressOptions().
                withElement(ElementOption.element(allPage.productsPage().dragButton))).
                moveTo(ElementOption.element(allPage.productsPage().dropZone)).
                release().
                perform();
    }


    @Then("Kullanici  sepette urun oldugunu verify eder")
    public void kullanici_sepette_urun_oldugunu_verify_eder() {
        String firstProductsTitle = allPage.productsPage().productTitles.get(0).getText();
        allPage.productsPage().cart.click();
        String cartProductTitlee = allPage.productsPage().cartProductTitle.getText();

        Assert.assertEquals(firstProductsTitle,cartProductTitlee);

    }

}
