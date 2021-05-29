
Feature: Webview Test Case

  Background: Kullanici login asamalari
    Given Kullanici Uygulamanin acildigini verify eder
    When  Kullanici kullanici adini girer "standard_user"
    And   Kullanici kullanici sifre girer "secret_sauce"
    And   Kullanici login butonuna tiklar
    Then  Kullanici login oldugunu verify eder

  @WebView
  Scenario: Webview ile amazona giriş
    When Kullanici sub menu tiklar
    When Kullanici webview a tiklar
    When Kullanici webview de "https://www.amazon.com"
    Then Kullanici amazona gittiğini doğrular