package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.GuruPages;
import utilities.Driver;

import java.util.List;

public class GurrStepDefinitions {

    GuruPages guruPages = new GuruPages();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {
        List<WebElement> tabloBaslikListesi = guruPages.baslikListesi;
        // listemiz webelementlerden olusuyor dolasiyla bu webelementlerde hangisi
        //  istenen sutun basligini tasiyor bilemeyiz

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i+1;
                break;
            }
        }
        // for loop ilr tum sutun basliklarini bana verilen istenensutun degeri ile karsilastirdim
        //loop bittiginde basligin bulunup bulunmadigini ontrol etmek ve
        // bulundu ise yoluma devem etmek istiyorum

        if (istenenBaslikIndexi !=-3){// baslik bulundu
            List<WebElement> istenenSutundakiElementler=
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));

            for(WebElement each:istenenSutundakiElementler){
                System.out.println(each.getText());
            }

        }else { // baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }

    }

    @And("{string} listede oldugunu test eder")
    public void listedeOldugunuTestEder(String isteneBaslik) {
        for (int i = 0; i <guruPages.baslikListesi.size() ; i++) {
            if (guruPages.baslikListesi.get(i).getText().equals(isteneBaslik)){

            }

        }



    }
}
