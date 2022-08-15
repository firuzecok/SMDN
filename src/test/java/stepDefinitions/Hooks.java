package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*

    Cucumber da step definitions package i icerisinde
     @before ,@after gibi bir notasyon varsa
     extends testBase dememize gerek kalmadan
     her screnario dan once veye sonra bu methodlar calisacakdir

     bu da bizim isteyecegimiz bir durum degildir

     Cucumber da @befor .@after kullanma ihtiyacimiz olursa
     bunu sepdefinitions package i altinda olusturacagimiz
     Hooks class'ına koyarız

     Biz her scenario'dan sonra test sonucunu kontrol edip failed olan
     scenario'lar için screenshoot olmasi amaciyla
     @After methodu kullanacağız
     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        //Driver.closeDriver();
    }
}
