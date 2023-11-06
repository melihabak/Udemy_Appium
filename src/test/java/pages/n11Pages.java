package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementHelper;

import java.time.Duration;

public class n11Pages {

    AppiumDriver driver;
    WebDriverWait wait;
    util.elementHelper elementHelper;


    By kategorilerButonu = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.FrameLayout/android.widget.ImageView");
    By elektronikButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
    By telefonVeAksesuarlariButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
    By cepTelefonuButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
    By filtreleButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Filtrele\")");
    By markaButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Marka\")");
    By appleSecimi = AppiumBy.androidUIAutomator("new UiSelector().text(\"Apple\")");
    By uygulaButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.TextView");
    By dahiliHafizaButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By gbButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"256 GB\")");
    By modelButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Model\")");
    By modelSecimiButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Iphone 15 Pro\")");
    By sonuclariGosterButonu = AppiumBy.id("com.dmall.mfandroid:id/tv_name");
    By eklemeButonu = AppiumBy.id("com.dmall.mfandroid:id/ivAddToBasket");
    By sepeteEkleButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
    By sepetimButonu = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Sepetim, 1 new notification\"]/android.widget.FrameLayout/android.widget.ImageView");
    By sepetKontrol = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout");
    By sifremiUnuttumButonu = AppiumBy.id("com.dmall.mfandroid:id/tv_forgot_password");
    By mailKismiTextGirme = AppiumBy.id("com.dmall.mfandroid:id/et_email_address");
    By devamEtButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView");
    By mailGonderimKontrol = AppiumBy.id("com.dmall.mfandroid:id/rl_success_area");
    By anneVeBebekButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Anne & Bebek\")");
    By otoKoltukVeAnaKucagiButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Oto Koltuğu & Ana Kucağı\")");
    By kanguruButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
    By akilliSiralamaButonu = AppiumBy.id("com.dmall.mfandroid:id/listingSortTV");
    By azalanFiyatButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Azalan Fiyat\")");
    By enPahaliKanguruKontrol = AppiumBy.id("com.dmall.mfandroid:id/listingRV");
    By hesabimButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Hesabım\")");
    By girisYapButonu = AppiumBy.id("com.dmall.mfandroid:id/btn_login");
    By giyimVeAyakkabiButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Giyim & Ayakkabı\")");
    By erkekGiyimVeAksesuarButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Erkek Giyim & Aksesuar\")");
    By disGiyimButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Dış Giyim\")");
    By gorulenIlkUrunButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[2]");
    By sepeteEklemeOnayButonu =AppiumBy.id("com.dmall.mfandroid:id/continueButton");
    By urunSilmeButonu = AppiumBy.id("com.dmall.mfandroid:id/basketItemDeleteSelectedTV");
    By silinenUrun = AppiumBy.androidUIAutomator("new UiSelector().text(\"Sepetiniz Boş Görünüyor\")");

    public n11Pages(AppiumDriver driver) {
        this.driver = driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new elementHelper(driver);
    }


    public void kategoriTiklama() {

        driver.findElement(kategorilerButonu).click();
    }

    public void elektronikTiklama() {

        driver.findElement(elektronikButonu).click() ;
    }

    public void telefonveAksesuarTiklama() {
        driver.findElement(telefonVeAksesuarlariButonu).click();
    }

    public void capTelefonuTiklama() {
        driver.findElement(cepTelefonuButonu).click();
    }

    public void filtreleTiklama() {
        driver.findElement(filtreleButonu).click();
    }

    public void markaTiklama() {
        driver.findElement(markaButonu).click();
    }

    public void appleTiklama() {
        driver.findElement(appleSecimi).click();
    }

    public void uygulaTiklama() {
        driver.findElement(uygulaButonu).click();
    }

    public void dahiliHafizaTiklama() {
        driver.findElement(dahiliHafizaButonu).click();
    }

    public void gbTiklama() {
        driver.findElement(gbButonu).click();
    }

    public void modelTiklama(){driver.findElement(modelButonu).click();
    }
    public void iPhone15plusTiklama() {driver.findElement(modelSecimiButonu).click();
    }

    public void sonuclariGosterTiklama() {
        driver.findElement(sonuclariGosterButonu).click();
    }

    public void eklemeButonuTiklama() {
        driver.findElement(eklemeButonu).click();
        driver.findElement(sepeteEkleButonu).click();
    }

    public void sepetimTiklama() {
        driver.findElement(sepetimButonu).click();
    }

    public void sepetKontrol(){
        elementHelper.checkVisible(sepetKontrol);
    }
    
    
    //case 2 metotlari


    public void sifremiUnuttumTiklama() {
        driver.findElement(sifremiUnuttumButonu).click();
    }

    public void mailGirme() {
        driver.findElement(mailKismiTextGirme).sendKeys("melih.abak@gmail.com");
    }

    public void devamEtTiklama() {
        driver.findElement(devamEtButonu).click();
    }

    public void mailGonderimKontrol() {elementHelper.checkVisible(mailGonderimKontrol);
    }

    public void anneVeBebekTiklama() {
        driver.findElement(anneVeBebekButonu).click();

    }

    public void otoKoltukVeAnaKucagiTiklama() {

        driver.findElement(otoKoltukVeAnaKucagiButonu).click();
    }

    public void kanguruTiklama() {
        driver.findElement(kanguruButonu).click();
    }

    public void akilliSiralamaTiklama() {
        driver.findElement(akilliSiralamaButonu).click();
    }

    public void azalanFiyatTiklama() {
        driver.findElement(azalanFiyatButonu).click();
    }

    public void enPahaliKanguruUrunKontrol() {
        elementHelper.checkVisible(enPahaliKanguruKontrol);
    }

    public void hesabimTiklama() {driver.findElement(hesabimButonu).click();
    }

    public void girisYapTiklama() {driver.findElement(girisYapButonu).click();
    }

    public void giyimVeAyakkabiTiklama() {driver.findElement(giyimVeAyakkabiButonu).click();
    }

    public void erkekGiyimVeAksesuarTiklama() {driver.findElement(erkekGiyimVeAksesuarButonu).click();
    }

    public void disGiyimTiklama() {driver.findElement(disGiyimButonu).click();
    }

    public void gorulenIlkUrunSepeteEklemeButonu() {driver.findElement(gorulenIlkUrunButonu).click();
    }

    public void sepeteEklemeOnayButonuTiklama() {driver.findElement(sepeteEklemeOnayButonu).click();
    }

    public void urunSilmeButonuTiklama() {driver.findElement(urunSilmeButonu).click();
    }

    public void urunSilinmesiKontrol() {elementHelper.checkVisible(silinenUrun);
    }
}
