Feature: DragAndDrop Test Case
  Background: Kullanici login asamalari
    Given Kullanici Uygulamanin acildigini verify eder
    When  Kullanici kullanici adini girer "standard_user"
    And   Kullanici kullanici sifre girer "secret_sauce"
    And   Kullanici login butonuna tiklar
    Then  Kullanici login oldugunu verify eder
  @DragAndDrop
  Scenario: Kullanicinin herhangi bir ürünü drag ile sepete eklemesi
    When Kullanici ilk urunu drag ile sepete ekler
    Then Kullanici  sepette urun oldugunu verify eder

