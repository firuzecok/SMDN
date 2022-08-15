package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue="stepDefinitions" ,
        tags="@Mdn",
        dryRun =false
)

public class TestRunner {


    /*
    Bir framework te bir tek Runner class i yeterli olabilir
    Runner classindan class body'sinde  icerisinde hic bir sey olmaz
    Runner classimizi önemli yapan 2 adet annatation vardir
    @RunWith(Cucumber.class) notasyonu Runner classina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework umuzde JUnit kullanmayi tercih ediyoruz

feature :Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
glue : step definitions dosyalarini nerede bulacagimizi gosterir
tags : o an hangi tag i calistirmak istiyorsak onu belli eder

dryRun : iki secenek var
dryRun=true; yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir
dryRun=false ; yazdigimizda testlerimizi calistirir

     */

    /*
    login:(//a[@role='button'])[1]
yeni=//*[@id="root"]/div[4]/div/div/div/div/form/div[3]/a
firstmaöe=//*[@id="root"]/div[4]/div/div/div/div/form/div[1]/input
     */


}
