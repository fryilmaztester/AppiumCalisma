package Cucumber.stepdefinitons;


/*
SwagLabs a login olunuz
Login olduğunuzu verify ediniz
1 adet ürünü  sepete ekelyiniz
Ürünün spette olduğunu verify ediniz
Sepete geliniz
Swipe ile ürünü sepetten siliniz
 */


import Cucumber.Page.AllPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

import static Cucumber.Utilities.Driver.appiumDriver;

public class Swipe {

    AllPage allPage = new AllPage();

    @When("Kullanici swipe yapar")
    public void kullanici_swipe_yapar() {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int eny_y = (int) (dimension.height * 0.3);
        //System.out.println(dimension.getHeight()); 2076
        //System.out.println(dimension.getWidth()); 1080

        int end_x = (int) (dimension.width * 0.0);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.
                longPress(ElementOption.element(allPage.cartPage().swipePoint)).
                moveTo(ElementOption.point(end_x,eny_y)).
                release().
                perform();

    }

    @Then("Kullanici cop kutusunu gorur")
    public void kullanici_cop_kutusunu_gorur() {
        Assert.assertTrue(allPage.cartPage().trashBag.isDisplayed());
    }
    @When("Kullanıcı cop kutusuna tiklar")
    public void kullanıcı_cop_kutusuna_tiklar() {
        allPage.cartPage().trashBag.click();
    }
}
