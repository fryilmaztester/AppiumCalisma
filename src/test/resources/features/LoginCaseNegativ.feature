@NegativLogin
Feature: Kullanici yanlis bilgiler ile login olmaya calisir

  Scenario Outline: Yanlis Kullanici verileri ile Login olma senaryosu
    Given Kullanici Uygulamanin acildigini verify eder
    When  Kullanici kullanici adini girer "<userName>"
    And   Kullanici kullanici sifre girer "<passWord>"
    And   Kullanici login butonuna tiklar
    Then  Kullanici gelen hata mesajlarini onaylar "do not match"
    Examples: verileri gönder
      | userName | passWord |
      |standard_user|fryTech|
      |fryTech|secret_sauce|
      |fryTech|FRYTech|
