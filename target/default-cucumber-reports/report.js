$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/webView.feature");
formatter.feature({
  "name": "Webview Test Case",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Kullanici login asamalari",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Kullanici Uygulamanin acildigini verify eder",
  "keyword": "Given "
});
formatter.match({
  "location": "Cucumber.stepdefinitons.CommonUsage.kullanici_Uygulamanın_acildigini_verify_eder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici kullanici adini girer \"standard_user\"",
  "keyword": "When "
});
formatter.match({
  "location": "Cucumber.stepdefinitons.LoginScenariosNegativAndPostive.kullanici_yanlis_kullanici_adini_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici kullanici sifre girer \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber.stepdefinitons.LoginScenariosNegativAndPostive.kullanici_yanlis_kullanici_sifre_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici login butonuna tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber.stepdefinitons.LoginScenariosNegativAndPostive.kullanici_login_butonuna_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici login oldugunu verify eder",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber.stepdefinitons.LoginScenariosNegativAndPostive.kullanici_login_oldugunu_verify_eder()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Webview ile amazona giriş",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@WebView"
    }
  ]
});
formatter.step({
  "name": "Kullanici sub menu tiklar",
  "keyword": "When "
});
formatter.match({
  "location": "Cucumber.stepdefinitons.WebViewTC.kullanici_sub_menu_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici webview a tiklar",
  "keyword": "When "
});
formatter.match({
  "location": "Cucumber.stepdefinitons.WebViewTC.kullanici_webview_a_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici webview de \"https://www.amazon.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "Cucumber.stepdefinitons.WebViewTC.kullanici_webview_de(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici amazona gittiğini doğrular",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber.stepdefinitons.WebViewTC.kullanici_amazona_gittiğini_doğrular()"
});
formatter.result({
  "status": "passed"
});
});