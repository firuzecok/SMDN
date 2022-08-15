package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AlistirmaPage;
import utilities.Driver;

public class AlistirmaStepDefinitions {

    AlistirmaPage alistirmaPage = new AlistirmaPage();

    /*
    //    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
    //    ~ click on Phones & PDAs
    //    ~ get the brandName of phones
    //    ~ click on add to button for all elements
    //    ~ click on black total added cart button
    //    ~ get the names of list from the cart
    //    ~ compare the names from displaying list and cart list
    */


    @Then("login butonuna basar")
    public void loginButonunaBasar() {
        alistirmaPage.loginButonu.click();

    }

    @And("yeni kayit yapar")
    public void yeniKayitYapar() {
        alistirmaPage.yeniKayit.click();

    }
    @And("ilgili yerleri doldurur")
    public void ilgiliYerleriDoldurur() {
      // alistirmaPage.firstName.sendKeys("Mavi");

    //  alistirmaPage.firstName.sendKeys("Yol");
    //  alistirmaPage.firstName.sendKeys("555258741");
    //  alistirmaPage.firstName.sendKeys("cucumber sok.");
    //  alistirmaPage.firstName.sendKeys("1230");
    //  alistirmaPage.firstName.sendKeys("java@mail.com");
    //  alistirmaPage.firstName.sendKeys("1234");
    //  alistirmaPage.firstName.sendKeys("1234");
    //  alistirmaPage.registerButton.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.click(alistirmaPage.firstName)
                .sendKeys("Mavi")
                .sendKeys(Keys.TAB)
                .sendKeys("Yol")
                .sendKeys(Keys.TAB)
                .sendKeys("555258741369")
                .sendKeys(Keys.TAB)
                .sendKeys("cucumber sok.")
                .sendKeys(Keys.TAB)
                .sendKeys("1230")
                .sendKeys(Keys.TAB)
                .sendKeys("java@mail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB)
                .click();
    }


    @Then("number bolumune {string} yazar")
    public void number_bolumune_yazar(String number) {
      alistirmaPage.number.sendKeys(number);
    }

    @Then("adres bolumune {string} yazar")
    public void adres_bolumune_yazar(String adres) {
        alistirmaPage.adress.sendKeys(adres);
    }

    @Then("zipcode bolumune {string} yazar")
    public void zipcode_bolumune_yazar(String zipcode) {
      alistirmaPage.zipcode.sendKeys(zipcode);
    }

    @Then("email bolumune {string} yazar")
    public void email_bolumune_yazar(String email) {
      alistirmaPage.email.sendKeys(email);
    }

    @Then("password bolumune {string} yazar")
    public void password_bolumune_yazar(String password) {
        alistirmaPage.password.sendKeys(password);
    }

    @Then("register butonuna basar")
    public void register_butonuna_basar() {
       alistirmaPage.registerButton.click();
    }



}
