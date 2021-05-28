@Sort
Feature: Sort Test Case

  Background: Kullanici login asamalari
    Given Kullanici Uygulamanin acildigini verify eder
    When  Kullanici kullanici adini girer "standard_user"
    And   Kullanici kullanici sifre girer "secret_sauce"
    And   Kullanici login butonuna tiklar
    Then  Kullanici login oldugunu verify eder

  @SortNameZtoA
  Scenario: Kullanici urunleri Z den A ya gore siralar
    When Kullanici sort butonuna tiklar
    When Kullanici Z-->A icin gerekli butona tiklar
    Then Kullanici urunleirn Z den A ya olacak sekilde siralandigini verify eder


  @SortLowToHigh
  Scenario: Kullanici urunleri low to high a gore siralar
    When Kullanici sort butonuna tiklar
    When Kullanici price için low to high icin gerekli butona tiklar
    Then Kullanici urunleirn low to high ya olacak sekilde siralandigini verify eder