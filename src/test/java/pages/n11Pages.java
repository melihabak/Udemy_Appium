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



    public n11Pages(AppiumDriver driver) {
        this.driver = driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new elementHelper(driver);
    }


    public void kategoriTiklama() {
        driver.findElement(kategorilerButonu).click();
    }

    public void elektronikTiklama() {
    }

    public void telefonveAksesuarTiklama() {
    }

    public void capTelefonuTiklama() {
    }

    public void filtreleTiklama() {
    }

    public void markaTiklama() {
    }

    public void appleTiklama() {
    }

    public void uygulaTiklama() {
    }

    public void dahiliHafizaTiklama() {
    }

    public void gbTiklama() {
    }

    public void iPhone15plusTiklama() {
    }

    public void sonuclariGosterTiklama() {
    }

    public void eklemeButonuTiklama() {
    }

    public void sepetimTiklama() {
    }
}
