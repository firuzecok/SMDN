package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UIMedunnaPage {

    public UIMedunnaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signIn;
    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;
    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement ikinciSignIn;
    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement MyPages;
    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement MyAppointments;
    @FindBy(xpath = "(//*[text()='Edit'])[4]")
    public WebElement editButonu;
    @FindBy(xpath = "//*[text()='Request A Test']")
    public WebElement requestTestButonu;
    @FindBy(xpath = "//*[@id='1404']")
    public WebElement SodiumCheckbox;
    @FindBy(xpath = "//*[@id='1402']")
    public WebElement UreaCheckbox;
    @FindBy(xpath = "//*[@id='1408']")
    public WebElement HemoglobinCheckbox;
    @FindBy(xpath = "//*[@id='1407']")
    public WebElement AlbuminCheckbox;
    @FindBy(xpath = "//*[@id='1403']")
    public WebElement CreatinineCheckbox;
    @FindBy(xpath = "//*[@id='1406']")
    public WebElement TotalProteinCheckbox;
    @FindBy(xpath = "//*[@id='132751']")
    public WebElement glucoseCheckbox;
    @FindBy(xpath = "//*[@id='127908']")
    public WebElement potasyumCheckbox;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButonu;
    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement ShowTestResultsButonu;
    @FindBy(xpath = "//*[text()='View Results']")
    public WebElement viewResultsButonu;
    @FindBy(xpath = "//*[@class='table']")
    public WebElement testResult;
    @FindBy(xpath = "//*[text()='Request Inpatient']")
    public WebElement requestInpatientButonu;
    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement MyInpatients;
    @FindBy(xpath = "//*[@class='view-routes']")
    public WebElement editInPatient;
    @FindBy(xpath = "//*[@name='status']")
    public WebElement status;
    @FindBy(xpath = "(//*[text()='Edit'])[6]")
    public WebElement yeniEditButonu;
    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement yeniSaveButonu;
    @FindBy(xpath = "//*[@name='room.id']")
    public WebElement room;
    @FindBy (xpath="//*[@name='fromDate']")
    public WebElement fromDate;
    @FindBy (xpath="//*[@name='toDate']")
    public WebElement toDate;


}
