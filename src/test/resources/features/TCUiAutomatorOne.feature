
  Feature: TcUiAutomator click sayısı
    @TcUiAutomator
    Scenario: Click Sayisi
      When Kullanici Uygulamanin API DEMOS acildigini verify eder
      When Kullanıcı views tıklar
      Then Kaç tane clicklenebilir veri olduğunun sayısının konsola yazdır