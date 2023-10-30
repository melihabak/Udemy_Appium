@n11
  Feature:n11 Mobil Uygulaması
    @case1
      Scenario: n11 Mobil Uygulaması ile Telefon Satın Alma Otomasyonu
        When Kategorilere tiklanir
        When Elektronik tiklanir
        When Telefon ve Aksesuarlari tiklanir
        When Cep Telefonu tiklanir
        When Filtrele tiklanir
        When Marka tiklanir
        When Apple tiklanir
        When Uygula tiklanir
        When Dahili Hafiza tiklanir
        When "256 GB" tiklanir

        When Model tiklanir
        When "iPhone15 Plus" tiklanir

        When Sonuclari Goster tiklanir
        When + butonuna tiklanir
        When Sepetim tiklanir
        Then Sepete urunun geldigi kontrol edilir

    @case2
      Scenario: n11 Mobil Uygulamasında Şifremi Unuttum Kısmına Gidip Mail Alma
        When Siparislerim tiklanir
        When Sifremi Unuttum tiklanir
        When Eposta adresi girilir
        When Devam Et tiklanir
        Then Mailin gonderildigi kontrol edilir
