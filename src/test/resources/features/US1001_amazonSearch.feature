@tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @nutella  @ikisi
  Scenario: TC01 kullanici amazonda Nutella aratir


    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @java  @ikisi @sirali
    Scenario:TC02 kullanici amazonda java aratir

      Given kullanici amazon anasayfasinda
      Then kullanici java icin arama yapar
      And sonuclarin java icerdigini test eder
      And sayfayi kapatir

      @iphone
      Scenario: TC03 kullanici amazonda iphone aratir

        When kullanici amazon anasayfasinda
        And kullanici iphone icin arama yapar
        Then sonuclarin iphone icerdigini test eder
        And sayfayi kapatir