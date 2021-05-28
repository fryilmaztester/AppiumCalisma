package Cucumber.stepdefinitons;

import Cucumber.Page.AllPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class CommonUsage {

    AllPage allPage = new AllPage();

    @Given("Kullanici Uygulamanin acildigini verify eder")
    public void kullanici_Uygulamanın_acildigini_verify_eder() {
        Assert.assertTrue(allPage.commonUsagePage().okOrNok.isDisplayed());
    }


}
