
Feature: Kullanici dogru bilgiler ile login olmaya calisir
  @PositivLoginAllCase
  Scenario Outline: Dogru Kullanici verileri ile Login olma senaryosu
    Given Kullanici Uygulamanin acildigini verify eder
    When  Kullanici kullanici adini girer "<userName>"
    And   Kullanici kullanici sifre girer "<passWord>"
    And   Kullanici login butonuna tiklar
    Then  Kullanici login oldugunu verify eder
    Examples: verileri gönder
      | userName | passWord |
      |standard_user|secret_sauce|
      |problem_user|secret_sauce|

  @PositivLogin
  Scenario: Kullanici tek bir dogru kullanici ile login olur
    Given Kullanici Uygulamanin acildigini verify eder
    When  Kullanici kullanici adini girer "standard_user"
    And   Kullanici kullanici sifre girer "secret_sauce"
    And   Kullanici login butonuna tiklar
    Then  Kullanici login oldugunu verify eder