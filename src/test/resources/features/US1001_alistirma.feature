Feature: US1001 kullanici gittigidiyor sitesinde

  Scenario:TC1 kullanici gittigidiyor sitesinde urun arar


    Given kullanici "gittiUrl" anasayfasinda
    Then cookies kapatilir
    And kullanici 1 sn bekler
    Then arama kutusunda  "bilgisayar" arar
    And kullanici 2 sn bekler
    And Arama sonuçları sayfasından 2.sayfa açılır,acildigi kontrol edilir
    And kullanici 2 sn bekler
   #   And kullanici acilan alertsi kapatir
    And kullanici 2 sn bekler
    Then Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
    And kullanici 2 sn bekler
    Then Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır.
    And kullanici 3 sn bekler
    And  Seçilen ürün sepete eklenir.
    And kullanici 1 sn bekler
    Then Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
    Then Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.
    And  Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.







    # go to web site : https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
    # maximize the web site
    # click on second emoji
    # click all second emoji's element
    # go back parent iframe
    # fill out the form,(Fill the form with the texts you want)
    # click on apply button
    #  web sitesini büyüt
    #  tüm ikinci emoji öğelerini tıklayın
    #  ana iframe'e geri dön
    # formu doldurun,(Formu istediğiniz metinlerle doldurun)
    #  uygula butonuna tıklayın






#Scenario : TC2 kullanici brc sayfasinda hesap olusturur

 #Given kullanici "brcUrl" anasayfasinda




  #TEST 1
  #
  #Hesap olusturun
  #
  #TEST 2
  #
  # Test 1 de olusturdugumuz hesapla
  # login olalim
  #2- Audi Q8 i secip reservasyon yapalim
  #3- reservasyon yaptigimizi dogrulayalim
  #
  #
  #TEST 3
  #
  #Servis Butonunu tiklayip
  #Kiraladigimiz araclarin otomatik
  #vitesli olup olmadigini kontrol edelim
  #
  #Test 4
  #
  #Login olmadan arac kiralamayacagimizi
  #test edelim.
  #
  #1- verileri girelim
  #2- continue reservation a tiklayalim
  #3- 2 saniye beleyelim ve
  #4- continue reservation hala görünür oldugunu test edelim
  #
  #TEST 5
  #
  #1- Servis e gidelim
  #2- En ucuz arac fiyatinin 12 saatlik dolar oldugunu test edelim
  #3- En paha li aracin fiyatinin 3500 $ oldugunu test edelim
  #4- En ucuz ve en pahali arcin ekran resmini alalim
  #
  #TEST 6
  #
  #1- login olalim
  #2- login olduktan sonra profile gideloim ve
  # bilgilerin dogru oldugunu kontrol edelim
  #3- logout u tiklayip sistemi terk edelim
