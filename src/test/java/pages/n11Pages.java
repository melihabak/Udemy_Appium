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
    By filtreleButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[1]");
    By markaButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[1]");
    By appleSecimi = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.TextView");
    By uygulaButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.TextView");
    By dahiliHafizaButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.TextView[1]");
    By gbButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.TextView");
    By modelButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.TextView[1]");
    By modelSecimiButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[11]/android.widget.TextView");
    By sonuclariGosterButonu = AppiumBy.id("com.dmall.mfandroid:id/tv_name");
    By eklemeButonu = AppiumBy.id("com.dmall.mfandroid:id/ivAddToBasket");
    By sepetimButonu = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Sepetim, 1 new notification\"]/android.widget.FrameLayout/android.widget.ImageView");
    By sepetKontrol = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout");
    By siparislerimButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView");
    By sifremiUnuttumButonu = AppiumBy.id("com.dmall.mfandroid:id/tv_forgot_password");
    By mailKismiTextGirme = AppiumBy.id("com.dmall.mfandroid:id/et_email_address");
    By devamEtButonu = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView");
    By mailGonderimKontrol = AppiumBy.id("com.dmall.mfandroid:id/rl_success_area");
    By anneVeBebekButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Anne & Bebek\")");
    By otoKoltukVeAnaKucagiButonu = AppiumBy.androidUIAutomator("Oto Koltuğu & Ana Kucağı");
    //By kanguruButonu = AppiumBy.androidUIAutomator("Kanguru");
    //By akilliSiralamaButonu = AppiumBy.androidUIAutomator("");
    //By azalanFiyatButonu = AppiumBy.androidUIAutomator("");
    public n11Pages(AppiumDriver driver) {
        this.driver = driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new elementHelper(driver);
    }


    public void kategoriTiklama() {

        driver.findElement(kategorilerButonu).click();
    }

    public void elektronikTiklama() {

        driver.findElement(elektronikButonu).click();
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
    }

    public void sepetimTiklama() {
        driver.findElement(sepetimButonu).click();
    }

    public void sepetKontrol(){
        elementHelper.checkVisible(sepetKontrol);
    }
    
    
    //case 2 metotlari
    public void siparislerimTiklama() {
        driver.findElement(siparislerimButonu).click();
    }

    public void sifremiUnuttumTiklama() {
        driver.findElement(sifremiUnuttumButonu).click();
    }

    public void mailGirme() {
        driver.findElement(mailKismiTextGirme).sendKeys("melih.abak@gmail.com");
    }

    public void devamEtTiklama() {
        driver.findElement(devamEtButonu).click();
    }

    public void mailGonderimKontrol() {
        elementHelper.checkVisible(mailGonderimKontrol);
    }

    public void anneVeBebekTiklama() {
        driver.findElement(anneVeBebekButonu).click();

    }

    public void otoKoltukVeAnaKucagiTiklama() {
        driver.findElement(otoKoltukVeAnaKucagiButonu).click();
    }

    public void kanguruTiklama() {
    }

    public void akilliSiralamaTiklama() {
    }

    public void azalanFiyatTiklama() {
    }

    public void enPahaliKanguruUrunKontrol() {
    }





}
