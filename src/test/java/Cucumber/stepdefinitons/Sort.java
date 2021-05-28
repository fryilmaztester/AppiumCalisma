package Cucumber.stepdefinitons;

import Cucumber.Page.AllPage;
import Cucumber.Utilities.ReusableMethods;
import com.sun.tools.jxc.SchemaGenTask;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static Cucumber.Utilities.Driver.appiumDriver;

/*
SwagLabs a login olunuz
Login olduğunuzu verify ediniz
Ürünleri        1) Z--> A ya göre sıralayınız
                2) Low-->high a göre sıralyınız
 Verify ediniz


 */
public class Sort {

  AllPage allPage = new AllPage();
    @When("Kullanici sort butonuna tiklar")
    public void kullanici_sort_butonuna_tiklar() {
       allPage.productsPage().filterButton.click();
    }


    @When("Kullanici Z-->A icin gerekli butona tiklar")
    public void kullanici_Z_A_icin_gerekli_butona_tiklar() {
       allPage.productsPage().nameZToA.click();
    }

    @Then("Kullanici urunleirn Z den A ya olacak sekilde siralandigini verify eder")
    public void kullanici_urunleirn_Z_den_A_ya_olacak_sekilde_siralandigini_verify_eder()  {

    List<String> urunIsimleri = new ArrayList();

      int retry = 0;
      do {
        allPage.productsPage().productTitles.
                stream().
                map(t -> t.getText()).
                forEach(t -> urunIsimleri.add(t));
        ReusableMethods.scrollElement(0.6, 0.9, 0.3);
        retry++;
      } while (retry <= 1);

      List<String> urunIsimleriAyniOlanlarCikartilmis = new ArrayList<>();
      urunIsimleri.
              stream().
              distinct().
              forEach(t->urunIsimleriAyniOlanlarCikartilmis.add(t));

      List<String> urunIsimleriSirali = new ArrayList<>();
      urunIsimleriAyniOlanlarCikartilmis.
              stream().
              sorted(Comparator.reverseOrder()).
              forEach(t->urunIsimleriSirali.add(t));
      Assert.assertEquals(urunIsimleriAyniOlanlarCikartilmis,urunIsimleriSirali);

    }

  @When("Kullanici price için low to high icin gerekli butona tiklar")
  public void kullanici_price_için_low_to_high_icin_gerekli_butona_tiklar() {
      allPage.productsPage().lowToHigh.click();
  }



  @Then("Kullanici urunleirn low to high ya olacak sekilde siralandigini verify eder")
  public void kullanici_urunleirn_low_to_high_ya_olacak_sekilde_siralandigini_verify_eder() {
    List<String> urunFiyatlari = new ArrayList();

    int retry = 0;
    do {
      allPage.productsPage().productsPrices.
              stream().
              map(t -> t.getText()).
              forEach(t -> urunFiyatlari.add(t));
      ReusableMethods.scrollElement(0.6, 0.9, 0.3);
      retry++;
    } while (retry <= 2);

    List<String> urunFiyatlariAyniOlanlarCikartilmis = new ArrayList<>();
    urunFiyatlari.
            stream().
            distinct().
            forEach(t->urunFiyatlariAyniOlanlarCikartilmis.
                    add(t.replace("$","")));

    List<Double> urunFiyatlariSirali = new ArrayList<>();
    urunFiyatlariAyniOlanlarCikartilmis.
            stream().
            map(Double::parseDouble).
            sorted().
            forEach(t->urunFiyatlariSirali.add(t));

    List<String> urunFiyatlariSiraliStr = new ArrayList<>();
    urunFiyatlariSirali.
            stream().
            map(String::valueOf).
            forEach(t->urunFiyatlariSiraliStr.add(t));

    Assert.assertEquals(urunFiyatlariAyniOlanlarCikartilmis,urunFiyatlariSiraliStr);

    /*                        !!!!!!!!!!!  DİKKATTTTT !!!!!!!!!!!
    UNUTULMAMALIDIR Kİ FİYATLAR DOUBLE DATA TYPE INA AİTTİR. EĞER FİYATLARDA SONU "0"
    İLE BİTEN VARSA EKSTRA KONTROLU YAPILMALIDIR.

    BİR ÇOK SİTE DE ÖRN: 40,00 ŞEKLİNDE FİYATLAR GELİR ---> JAVA BUNU 40,0 OALRAK ALGILAR VE ASSERT
    AŞAMASINDA TESTİMİZ FAİL EDER.

    BURADA TEKRARDAN STR YE ÇEVİRİP "0" EKLEMLİYİZ
     */


  }
}
