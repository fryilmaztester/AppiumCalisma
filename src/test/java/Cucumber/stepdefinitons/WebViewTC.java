package Cucumber.stepdefinitons;

import Cucumber.Page.AllPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/*
SwagLabs uygulamasını açın
Uygulamanın açıldığını verif ediniz
url olarak amazon.com a gidiniz
gidilen url in amazon olduğunu verify ediniz
 */
public class WebViewTC {

    AllPage allPage = new AllPage();

    @When("Kullanici sub menu tiklar")
    public void kullanici_sub_menu_tiklar() {
        allPage.submenuPage().hamburgerIcon.click();
    }

    @When("Kullanici webview a tiklar")
    public void kullanici_webview_a_tiklar() {
        allPage.submenuPage().webView.click();
    }
    @When("Kullanici webview de {string}")
    public void kullanici_webview_de(String amazon) {
        allPage.submenuPage().urlEnterArea.sendKeys(amazon);
        allPage.submenuPage().gotoSiteButton.click();

    }
    @Then("Kullanici amazona gittiğini doğrular")
    public void kullanici_amazona_gittiğini_doğrular() {
        Assert.assertTrue(allPage.submenuPage().amazonImage.isDisplayed());
    }

}
