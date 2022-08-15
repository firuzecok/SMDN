
Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre @sirali
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli

    Given kullanici amazon anasayfasinda
    And kullanici "java" icin arama yapar
    And sonuclarin "java" icerdigini test eder
    Then sayfayi kapatir
