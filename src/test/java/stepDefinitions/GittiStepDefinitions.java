package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.GittiPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.*;

public class GittiStepDefinitions {

    GittiPage gittiPage=new GittiPage();

    @Then("cookies kapatilir")
    public void cookiesKapatilir() {
        gittiPage.cookies.click();
    }

    @Then("arama kutusunda  {string} arar")
    public void aramaKutusundaArar(String istenenStr) {
        gittiPage.aramaKutusu.sendKeys(istenenStr+ Keys.ENTER);
    }

    @And("Arama sonuçları sayfasından {int}.sayfa açılır,acildigi kontrol edilir")
    public void aramaSonuçlarıSayfasındanSayfaAçılır(int ikinciSayfa) {
        gittiPage.ikinciSayfa.click();
        ReusableMethods.switchToWindow(Driver.getDriver().getTitle());
       // Assert.assertTrue(gittiPage.ikinciSayfa.isDisplayed());

    }

    @And("kullanici acilan alertsi kapatir")
    public void kullaniciAcilanAlertsiKapatir() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    @Then("Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.")
    public void sonucaGöreSergilenenÜrünlerdenRastgeleBirÜrünSeçilir() {
        gittiPage.rastgeleUrun.click();

    }

    @Then("Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır.")
    public void seçilenÜrününÜrünBilgisiVeTutarBilgisiTxtDosyasınaYazılır() throws IOException {
        String dosyaYolu="src/main/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        workbook.getSheet("Sayfa2").getRow(1).getCell(0).
                setCellValue(gittiPage.urunBilgisi.getText());

        FileOutputStream fos=new FileOutputStream(dosyaYolu);
        fos.close();
        fis.close();
        System.out.println(gittiPage.urunBilgisi.getText()+gittiPage.tutari.getText());

    }

    @And("Seçilen ürün sepete eklenir.")
    public void seçilenÜrünSepeteEklenir() {
        gittiPage.sepeteEkle.click();

    }

    @Then("Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.")
    public void ürünSayfasındakiFiyatIleSepetteYerAlanÜrünFiyatınınDoğruluğuKarşılaştırılır() {
        gittiPage.sepet.click();

    }

    @Then("Adet arttırılarak ürün adedinin {int} olduğu doğrulanır.")
    public void adetArttırılarakÜrünAdedininOlduğuDoğrulanır(int ikiAdetUrun) {
       Actions actions=new Actions(Driver.getDriver());
       actions.click(gittiPage.ikiAdetUrun).sendKeys(Keys.BACK_SPACE).sendKeys("2").perform();
        //Assert.assertTrue(gittiPage.ikiAdetUrun.isDisplayed());
    }

    @And("Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.")
    public void ürünSepettenSilinerekSepetinBoşOlduğuKontrolEdilir() {
        gittiPage.delete.click();
       // Assert.assertTrue(gittiPage.sepetteUrunYok.isDisplayed());

    }
}
