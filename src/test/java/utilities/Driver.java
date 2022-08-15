package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
     POM'de Driver icin TestBase class'ina extens etmek yerine
     driver class indan static methodlar kullanarak
     driver olusturup ,ilgili ayarlarin yaapilmasi
     ve sonda driver in kapatilmasi tercih edilmistir
     */

    /*
          POM Driver classindaki getDriver() nin obje olusturularak kullanilmasini engellemek icin
      Singleton pattern kullanimi benimsenmistir

      Singleton Pattern: tekli kullanim, bir classin farkli classlardan
      obje olusturularak kullanimini engellemek icin kullanilir

       Bunu saglamak icin yapmamiz gereken sey oldukca basittir
    Obje olusturmak icin kullanilan constructor i private yaptigimiz zaman baska class'lardan
    driver classindan obje olusturulmasi mumkun olamaz
     */

    private Driver() {

    }
        static WebDriver driver;
        public static WebDriver getDriver () {

            if (driver == null) {
                switch (ConfigReader.getProperty("browser")) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    case "safari":
                        WebDriverManager.safaridriver().setup();
                        driver = new SafariDriver();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        // case "headless-chrome":
                        //     WebDriverManager.chromedriver().setup();
                        //     driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                        //     break;
                        //  default:
                        //      WebDriverManager.chromedriver().setup();
                        //      driver = new ChromeDriver();

                }

                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
            return driver;
        }

        public static void closeDriver () {
            if (driver != null) { // driver'a deger atanmissa
                driver.close();
                driver = null;
            }
        }
    }
