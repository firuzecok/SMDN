Feature: US1011 web tablosundaki istenen sutunu yazdirma
@guru @pr2





  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruUrl" anasayfasinda
    And "Company", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir


  Scenario: TC4 kullanici_liste_alabilmeli
    Given kullanici "guruUrl" anasayfasinda
    And "Company", sutunundaki tum degerleri yazdirir
    And "DCB Bank" listede oldugunu test eder
