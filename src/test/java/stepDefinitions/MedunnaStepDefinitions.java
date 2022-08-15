package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.UIMedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class MedunnaStepDefinitions {

    UIMedunnaPage medunnaPage = new UIMedunnaPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());


    @When("kullanici {string} anasayfasina gider")
    public void kullanici_anasayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Kullanıcı sag ustde account-menu tıklar")
    public void kullanıcı_sag_ustde_account_menuye_tıklar() {
        medunnaPage.accountMenu.click();

    }

    @When("Doktor Sign in butonuna tıklar")
    public void doktor_sign_in_butonuna_tıklar() {
        medunnaPage.signIn.click();

    }

    @When("Username bolumune {string} yazar")
    public void username_bolumune_yazar(String username) {
        medunnaPage.username.sendKeys("physician_team57");

    }

    @And("Doktor password bolumune {string} yazar")
    public void doktorPasswordBolumuneYazar(String password) {
        medunnaPage.password.sendKeys("ortakKullan.2022");

    }

    @When("Sign in butonuna tıklar")
    public void sign_in_butonuna_tıklar() {
        medunnaPage.ikinciSignIn.click();

    }

    @When("Doktor My Pages butonuna tıklar")
    public void doktor_my_pages_butonuna_tıklar() {
        medunnaPage.MyPages.click();

    }

    @When("Doktor My Appointments butonuna tıklar")
    public void doktor_my_appointments_butonuna_tıklar() {
        medunnaPage.MyAppointments.click();

    }

    @When("Doktor hasta adıyla aynı satırdaki  Edit butonuna tıklar")
    public void doktor_hasta_adıyla_aynı_satırdaki_edit_butonuna_tıklar() throws InterruptedException {
        medunnaPage.editButonu.click();
        Assert.assertTrue(medunnaPage.editInPatient.isDisplayed());
        Thread.sleep(2000);
        System.out.println(medunnaPage.editInPatient.getText());

    }

    @When("Doktor Request A Test butonuna tıklar")
    public void doktor_request_a_test_butonuna_tıklar() {
        medunnaPage.requestTestButonu.click();
       // js.executeScript("arguments[0].click();", medunnaPage.requestTestButonu);

    }

    @And("Doktor Glucose,Urea,Creatinine,Sodium,Potasyum,Total protein,Albumin,Hemoglobin testlerine ait kutucukları isaretler")
    public void doktorGlucoseUreaCreatinineSodiumPotasyumTotalProteinAlbuminHemoglobinTestlerineAitKutucuklarıIsaretler() throws InterruptedException {
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", medunnaPage.SodiumCheckbox);
        js.executeScript("arguments[0].click();", medunnaPage.glucoseCheckbox);
        js.executeScript("arguments[0].click();", medunnaPage.potasyumCheckbox);
        js.executeScript("arguments[0].click();", medunnaPage.CreatinineCheckbox);
        js.executeScript("arguments[0].click();", medunnaPage.AlbuminCheckbox);
        js.executeScript("arguments[0].click();", medunnaPage.TotalProteinCheckbox);
        js.executeScript("arguments[0].click();", medunnaPage.HemoglobinCheckbox);
        js.executeScript("arguments[0].click();", medunnaPage.UreaCheckbox);

    }

    @And("Doktor Save butonuna tıklar")
    public void doktorSaveButonunaTıklar() {
        js.executeScript("arguments[0].click();", medunnaPage.saveButonu);
    }

    @And("Doktor Show Test Result butonuna tıklar")
    public void doktorShowTestResultButonunaTıklar() throws InterruptedException {
        js.executeScript("arguments[0].click();", medunnaPage.ShowTestResultsButonu);
    }

    @And("Doktor View Results butonuna tıklar")
    public void doktorViewResultsButonunaTıklar() throws InterruptedException {
        js.executeScript("arguments[0].click();", medunnaPage.viewResultsButonu);
        Assert.assertTrue(medunnaPage.testResult.isDisplayed());// medunnaPage.testResult.isDisplayed();
        System.out.println(medunnaPage.testResult.getText());
    }

    @And("Doktor Request Inpatıent butonunu tıklar")
    public void doktorRequestInpatıentButonunuTıklar() {
        js.executeScript("arguments[0].click();", medunnaPage.requestTestButonu);
    }

    @And("Doktor My Inpatients butonuna tıklar")
    public void doktorMyInpatientsButonunaTıklar() {
        js.executeScript("arguments[0].click();", medunnaPage.MyInpatients);
    }

    @And("Doktor Status secenegini gunceller")
    public void doktorStatusSeceneginiGunceller() throws IOException, InterruptedException {
        js.executeScript("arguments[0].click();", medunnaPage.status);
        Thread.sleep(2000);
        Select select = new Select(medunnaPage.status);
        select.selectByValue("UNAPPROVED");
        Thread.sleep(2000);
        select.selectByValue("DISCHARGED");
        Thread.sleep(2000);
        select.selectByValue("STAYING");
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",medunnaPage.yeniSaveButonu);
        Thread.sleep(2000);
        ReusableMethods.getScreenshot("statusAlert");
        // UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED
    }


    @And("Doktor hasta adıyla aynı satırdaki bulunan Edit butonuna tıklar")
    public void doktorHastaAdıylaAynıSatırdakiBulunanEditButonunaTıklar() {
        js.executeScript("arguments[0].click();", medunnaPage.yeniEditButonu);
    }


    @And("Doktor room bilgisini gunceller")
    public void doktorRoomBilgisiniGunceller() throws IOException, InterruptedException {
        js.executeScript("arguments[0].click();",medunnaPage.room);
        Select slt=new Select(medunnaPage.room);
        slt.selectByValue("130661");
        js.executeScript("arguments[0].click();",medunnaPage.yeniSaveButonu);
        Thread.sleep(2000);
        ReusableMethods.getScreenshot("roomAlert");

    }


    @And("Doktor tarih aralıgını secer")
    public void doktorTarihAralıgınıSecer() throws InterruptedException {
        medunnaPage.fromDate.sendKeys("02");
        Thread.sleep(2000);
        medunnaPage.toDate.sendKeys("15");
        Thread.sleep(2000);

    }
}
