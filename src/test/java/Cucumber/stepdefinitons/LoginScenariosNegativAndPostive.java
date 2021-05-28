package Cucumber.stepdefinitons;

import Cucumber.Page.AllPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

// -------------------Negativ Senaryo için aşağıdaki Test Case kullanılacaktır.-------------------------
/*
SwagLabs uygulamasını açın
Uygulamanın açıldığını verif ediniz
Negativ Senaryoları scenario examples ile gerçekleştirniz
                    [1) Kullanıcı Adı ---> Doğru
                        Pass ---> Yanlış
                     2) Kullanıcı Adı ---> Yanlış
                        Pass ---> Doğru
                     3) Kullanıcı Adı ---> Yanlış
                        Pass ---> Yanlış                ]

 Hata mesajnı verif ediniz
 */

// -------------------Positif Senaryo için aşağıdaki Test Case kullanılacaktır.-------------------------
/*
SwagLabs uygulamasını açın
Uygulamanın açıldığını verif ediniz
Pozitif senaryoları gerçekleştirniz
                1)Uygulanın altında verilen kullanıcı adına tılayınız ve login olunuz
                2)Kullanıcı Adı: standard_user
                  Pass: secret_sauce    ile login olunuz
 Login olduğunuzu verify ediniz

 */


public class LoginScenariosNegativAndPostive {


    AllPage allPage = new AllPage();

    @When("Kullanici kullanici adini girer {string}")
    public void kullanici_yanlis_kullanici_adini_girer(String userName) {
        allPage.loginPage().userName.sendKeys(userName);
    }
    @When("Kullanici kullanici sifre girer {string}")
    public void kullanici_yanlis_kullanici_sifre_girer(String passWord) {
        allPage.loginPage().passWord.sendKeys(passWord);
    }
    @When("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        allPage.loginPage().loginButton.click();
    }
    @Then("Kullanici gelen hata mesajlarini onaylar {string}")
    public void kullanici_gelen_hata_mesajlarini_onaylar(String doNotMatch) {
        Assert.assertTrue(allPage.loginPage().errorMessage.getText().contains(doNotMatch));
    }

    @Then("Kullanici login oldugunu verify eder")
    public void kullanici_login_oldugunu_verify_eder() {
        Assert.assertTrue(allPage.loginPage().productsText.getText().equals("PRODUCTS"));
    }

}
