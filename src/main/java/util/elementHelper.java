package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class elementHelper {

    AppiumDriver driver;
    static WebDriverWait wait;
    Actions action;

    public elementHelper(AppiumDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
    }
    public WebElement presenceElement(By key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }
    public void click(By key){
        findElement(key).click(); // click -- tıklamayı sağlar bu fonksiyon
    }
    public void sendKeys (By key,String text){
        findElement(key).sendKeys(text); //sendKeys -- Text göndermeyi sağlar bu fonksiyon
    }
    public static void checkVisible(By key){
        wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

}
