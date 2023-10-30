package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.n11Pages;
import util.driverFactory;

public class n11StepDefinitions {

    n11Pages n11Pages = new n11Pages(driverFactory.getDriver());

    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        n11Pages.kategoriTiklama();
    }

    @When("Elektronik tiklanir")
    public void elektronikTiklanir() {
        n11Pages.elektronikTiklama();
    }

    @When("Telefon ve Aksesuarlari tiklanir")
    public void telefonVeAksesuarlariTiklanir() {
        n11Pages.telefonveAksesuarTiklama();
    }

    @When("Cep Telefonu tiklanir")
    public void cepTelefonuTiklanir() {
        n11Pages.capTelefonuTiklama();
    }

    @When("Filtrele tiklanir")
    public void filtreleTiklanir() {
        n11Pages.filtreleTiklama();
    }

    @When("Marka tiklanir")
    public void markaTiklanir() {
        n11Pages.markaTiklama();
    }

    @When("Apple tiklanir")
    public void appleTiklanir() {
        n11Pages.appleTiklama();
    }

    @When("Uygula tiklanir")
    public void uygulaTiklanir() {
        n11Pages.uygulaTiklama();
    }

    @When("Dahili Hafiza tiklanir")
    public void dahiliHafizaTiklanir() {
        n11Pages.dahiliHafizaTiklama();
    }

    @When("\"256 GB\" tiklanir")
    public void gbTiklanir(){
        n11Pages.gbTiklama();
        n11Pages.uygulaTiklama();
    }
    /*@When("Uygula2 tiklanir")
    public void uygulaTiklanirki(){
        n11Pages.uygulaTiklamaiki();
    }*/

    @When("Model tiklanir")
    public void modelTiklanir() {
        n11Pages.modelTiklama();
    }

    @When("\"iPhone15 Plus\" tiklanir")
    public void iphone15PlusTiklanir() {
        n11Pages.iPhone15plusTiklama();
        n11Pages.uygulaTiklama();
    }

    /*@When("Uygula3 tiklanir")
    public void uygulaTiklaniruc(){
        n11Pages.uygulaTiklamauc();
    }*/

    @When("Sonuclari Goster tiklanir")
    public void sonuclariGosterTiklanir() {
        n11Pages.sonuclariGosterTiklama();
    }

    @When("+ butonuna tiklanir")
    public void butonunaTiklanir() {
        n11Pages.eklemeButonuTiklama();
    }

    @When("Sepetim tiklanir")
    public void sepetimTiklanir() {
        n11Pages.sepetimTiklama();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Sepete urunun geldigi kontrol edilir")
    public void sepeteUrununGeldigiKontrolEdilir() {
        n11Pages.sepetKontrol();
    }

    @When("Siparislerim tiklanir")
    public void siparislerimTiklanir() {
        n11Pages.siparislerimTiklama();
    }

    @When("Sifremi Unuttum tiklanir")
    public void sifremiUnuttumTiklanir() {
        n11Pages.sifremiUnuttumTiklama();
    }

    @When("Eposta adresi girilir")
    public void epostaAdresiGirilir() {
        n11Pages.mailGirme();
    }

    @When("Devam Et tiklanir")
    public void devamEtTiklanir() {
        n11Pages.devamEtTiklama();
    }

    @Then("Mailin gonderildigi kontrol edilir")
    public void mailinGonderildigiKontrolEdilir() {
        n11Pages.mailGonderimKontrol();
    }
}




