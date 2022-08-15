package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GittiPage {
    public GittiPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='tyj39b-5 lfsBU']")
    public WebElement cookies;

    @FindBy(xpath = "//input[@name='k']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//a[@title='2. sayfa']")
    public WebElement ikinciSayfa;
   // @FindBy(xpath = "//div[@class='gray-content']")
   // public WebElement sayfaiki;
    @FindBy(xpath = "(//div[@class='sc-1yvp483-0 dTGwmm'])[3]")
    public WebElement rastgeleUrun;
    @FindBy(xpath = "//h1")
    public WebElement urunBilgisi;
    @FindBy(xpath = "(//span[@id='sp-price-highPrice'])[1]")
    public WebElement tutari;
    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement sepeteEkle;
    @FindBy(xpath = "//a[text()='Sepete Git']")
    public WebElement sepet;
    @FindBy(xpath = "//div[text()='2.587,62 TL']")
    public WebElement sepettekiUrunfiyat;
    @FindBy(xpath = "//select[@class='amount']")
    public WebElement ikiAdetUrun;
    @FindBy(xpath = "(//a[@title='Sil'])[1]")
    public WebElement delete;
    @FindBy(xpath = "//div[@class='gg-d-19 gg-w-21 gg-t-19 gg-m-18']")
    public WebElement sepetteUrunYok;


}
