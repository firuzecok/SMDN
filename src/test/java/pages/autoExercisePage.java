package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class autoExercisePage {
    public autoExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//html[@lang='en']")
    public static WebElement anasayfa;


    @FindBy(xpath ="//a[@href='/login']")
    public static WebElement signupLoginButton;


    @FindBy(xpath ="//*[text()='New User Signup!']")
    public static WebElement newUserSignupYazisi;


    @FindBy(xpath ="//input[@type='text']" )
    public static WebElement nameTextBox;


    @FindBy(xpath ="//input[@data-qa='signup-email']")
    public static WebElement emailTextBox;


    @FindBy(xpath ="//button[@data-qa='signup-button']")
    public static WebElement signupButton;


    @FindBy(xpath ="//*[text()='Enter Account Information']")
    public static WebElement enterAccountYazisi;


    @FindBy(xpath ="//input[@id='id_gender2']")
    public static WebElement genderButton;


    @FindBy(xpath ="//input[@type='password']")
    public static WebElement passwordBox;


    @FindBy(xpath ="//select[@name='days']")
    public static WebElement dayButton;


    @FindBy(xpath ="//select[@name='months']")
    public static WebElement monthButton;


    @FindBy(xpath ="//select[@name='years']")
    public static WebElement yearButton;


    @FindBy(xpath ="//input[@id='newsletter']")
    public static WebElement newsletterBox;


    @FindBy(xpath ="//input[@id='optin']")
    public static WebElement receiveSpecialBox;


    @FindBy(xpath ="//input[@id='first_name']")
    public static WebElement fistname;


    @FindBy(xpath ="//input[@id='last_name']")
    public static WebElement lastname;


    @FindBy(xpath ="//input[@id='company']")
    public static WebElement company;


    @FindBy(xpath ="//input[@id='address1']")
    public static WebElement address1;


    @FindBy(xpath ="//input[@id='address2']")
    public static WebElement address2;


    @FindBy(xpath ="//select[@id='country']")
    public static WebElement country;


    @FindBy(xpath ="//input[@id='state']")
    public static WebElement state;


    @FindBy(xpath ="//input[@id='city']")
    public static WebElement city;


    @FindBy(xpath ="//input[@id='zipcode']")
    public static WebElement zipcode;


    @FindBy(xpath ="//input[@id='mobile_number']")
    public static WebElement mobileNumber;


    @FindBy(xpath ="//button[@data-qa='create-account']")
    public static WebElement createAccountButton;


    @FindBy(xpath ="//*[text()='Account Created!']")
    public static WebElement accountCreatedYazisi;


    @FindBy(xpath ="//*[text()='Continue']")
    public static WebElement continiueButton;


    @FindBy(xpath ="//*[text()=' Logged in as ']")
    public static WebElement loggedInUsernameYazisi;


    @FindBy(xpath ="//i[@class='fa fa-trash-o']")
    public static WebElement deleteAccountButton;


    @FindBy(xpath = "//*[text()='Login to your account']")
    public static WebElement loginYourAccountYazisi;


    @FindBy(xpath = "//input[@data-qa='login-email']")
    public static WebElement loginEmailBox;


    @FindBy(xpath = "//input[@data-qa='login-password']")
    public static WebElement loginPaswordBox;


    @FindBy(xpath = "//button[@data-qa='login-button']")
    public static WebElement loginButton;


    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public static WebElement yourEmailPasswordIncorrectYazisi;


    @FindBy(xpath = "//a[@href='/logout']")
    public static WebElement logoutButton;




    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public static WebElement emailAlreadyExistYazisi;


    @FindBy(xpath = "//i[@class='fa fa-envelope']")
    public static WebElement contactUsButton;


    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public static WebElement getInTouchYazisi;


    @FindBy(xpath = "//input[@data-qa='name']")
    public static WebElement contactUsName;


    @FindBy(xpath = "//input[@data-qa='email']")
    public static WebElement contactUsEmail;


    @FindBy(xpath = "//input[@data-qa='subject']")
    public static WebElement contactUsSubject;


    @FindBy(xpath = "//textarea[@data-qa='message']")
    public static WebElement contactUsMessage;


    @FindBy(xpath = "//input[@name='upload_file']")
    public static WebElement uploadFile;


    @FindBy(xpath = "//input[@name='submit']")
    public static WebElement submitButton;


    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public static WebElement successMessage;


    @FindBy(xpath = "//a[@class='btn btn-success']")
    public static WebElement homeButton;



    @FindBy(xpath = "(//a[@href='/test_cases'])[1]")
    public static WebElement testCaseButton;


    @FindBy(xpath = "//html[@lang='en']")
    public static WebElement testCaseSayfasi;


    @FindBy(xpath = "//a[@href='/products']")
    public static WebElement productsButton;

    @FindBy(xpath = "(//div[@class='container'])[3]")
    public static WebElement allProductsPage;

    @FindBy(xpath = "//div[@class='features_items']")
    public static WebElement productsList;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public static WebElement firstViewProductButton;

    @FindBy(xpath = "//div[@class='product-details']")
    public static WebElement productDetailsSayfasi;

    @FindBy(xpath = "//*[.='Blue Top']")
    public static WebElement productname;

    @FindBy(xpath = "//*[.='Category: Women > Tops']")
    public static WebElement productcategory;

    @FindBy(xpath = "//*[.='Rs. 500']")
    public static WebElement productprice;

    @FindBy(xpath = "//*[.='Availability:']")
    public static WebElement productavailability;

    @FindBy(xpath = "//*[.='Condition:']")
    public static WebElement productcondition;

    @FindBy(xpath = "//*[.='Brand:']")
    public static WebElement productbrand;


    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProductKutusu;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchProductKutuButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchedProductsYazisi ;

    @FindBy(xpath = "//div[@class='product-image-wrapper']")
    public WebElement aranaUrunlerinGorunurlugu;


    @FindBy(xpath = "//*[.='Subscription']")
    public WebElement subscriptionYazisi;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionEmailKutusu;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement subscriptionOkButonu;

    @FindBy(xpath = "//*[.='You have been successfully subscribed!']")
    public WebElement successfullySubscribedYazisi;


}
