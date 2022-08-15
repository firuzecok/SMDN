package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlistirmaPage {
    public AlistirmaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement loginButonu;

    @FindBy(xpath = "//a[text()='Create new user']")
    public WebElement yeniKayit;

    @FindBy(xpath = "(//input[@class='form-control is-invalid'])[1]']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement number;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement adress;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement passwordt;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerButton;


}
