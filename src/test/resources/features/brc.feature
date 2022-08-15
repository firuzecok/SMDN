Feature: brc sayfasinda kayit

  Scenario: TC2 kullanici brc sayfasinda

    Given kullanici "brcUrl" anasayfasinda
    Then login butonuna basar
    Then yeni kayit yapar
    And kullanici 2 sn bekler
    And ilgili yerleri doldurur


  Scenario: TC3 kullanici alistirma yapar

    Given kullanici "automationUrl" anasayfasinda
    Then user sign in linkine tiklar
    And user Create and account bolumune email adresi girer
    And user mesaji dogrulayin


