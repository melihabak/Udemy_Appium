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
        When "iPhone15 Pro" tiklanir
        When Sonuclari Goster tiklanir
        When + butonuna tiklanir
        When Sepete ekle onaylanir
        When Sepetim tiklanir
        Then Sepete urunun geldigi kontrol edilir

    @case2
      Scenario: n11 Mobil Uygulamasında Şifremi Unuttum Kısmına Gidip Mail Alma
        When Hesabim tiklanir
        When Giris Yap tiklanir
        When Sifremi Unuttum tiklanir
        When Eposta adresi girilir
        When Devam Et tiklanir
        Then Mailin gonderildigi kontrol edilir

    @case3
      Scenario: n11 Mobil Uygulamasında En Pahalı Kanguru Ürünü Görüntüleme
        When Kategorilere tiklanir
        When Anne ve Bebek tiklanir
        When Oto Koltugu ve Ana Kucagi tiklanir
        When Kanguru tiklanir
        When Akilli Siralama tiklanir
        When Azalan Fiyat tiklanir
        Then Urunlerin ekrana gelip gelmedigi kontrol edilir

    @case4
      Scenario: n11 Mobil Uygulamasında Sepete Eklenen Ürünün Silinmesi
        When Kategorilere tiklanir
        When Giyim ve Ayakkabilara tiklanir
        When Erkek Giyim ve Aksesuar tiklanır
        When Dis Giyim tiklanir
        When Gorulen ilk urun sepete eklenir
        When Sepete ekle onaylanir
        When Sepetim tiklanir
        When Urun silme tiklanir
        Then Urunun basarili bir sekilde silindigi kontrol edilir

    @case5
      Scenario: n11 Mobil Uygulamasında Siparis ve Iade Kismindan Rasgele Ilk Urunun Secilmesi
        When Hesabim tiklanir
        When Giris Yap tiklanir
        When Email girilir
        When Sifre girilir
        When Giris Yap tiklanir
        When Siparislerim ve Iadelerim tiklanir
        When Gorulen ilk urun tiklanir
        When Secilen urun sepete eklenir
        When Urunlerin ekrana gelip gelmedigi kontrol edilir bes


