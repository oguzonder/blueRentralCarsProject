package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //US_008 Sule Jasmina  //
    @FindBy(xpath = "//*[text()='Complete Reservation']")
    public WebElement completeReservation;
    @FindBy(xpath = "//b[contains(text(),'Name')]")
    public WebElement name;
    @FindBy(xpath = "//b[contains(text(),'Address')]")
    public WebElement address;
    @FindBy(xpath = " //b[contains(text(),'Phone')]")
    public WebElement phone;
    @FindBy(xpath = "//div[text()='Total price: $']")
    public WebElement totalPrice;
    @FindBy(xpath = "//label[text()='Card number']")
    public WebElement cardNumber;
    @FindBy(xpath = "//label[text()='Name on Card']")
    public WebElement nameOnCard;
    @FindBy(xpath = "//label[text()='Expire Date']")
    public WebElement expireDate;
    @FindBy(xpath = "//label[text()='CVC']")
    public WebElement cvc;
    @FindBy(xpath = "//label[text()='I have read and aggree the sales contract']")
    public WebElement iHaveReadandAgree;
    @FindBy(xpath = "//button[text()='Close']")
    public WebElement close;
    @FindBy(xpath = "//button[text()=' Complete Reservation']")
    public WebElement completeReservationButton;
    @FindBy(xpath = "//span[text()='CALL US']")
    public WebElement callUS;
    @FindBy(xpath = "//a[text()='Reservations']")
    public WebElement reservations;
    @FindBy(xpath = "//tbody/tr[2]/td[2]")//click yapilip diger sayfaya gec
    public WebElement webTableElement;
    @FindBy(xpath = "//button[text()='Reservation Details']")
    public WebElement reservationDetails;
    @FindBy(xpath = "//button[text()='Car Details']")
    public WebElement carDetails;
    @FindBy(xpath = "//button[text()=' Back to reservations']")
    public WebElement backToReservation;
    //US_005 by Sevilay --
    @FindBy(xpath = "//select[@name='car']")
    public WebElement dropDown;
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUpDropDown;
    @FindBy(xpath = "//input[@title='Drop Off']")
    public WebElement pickUpDropOff;
    @FindBy(xpath = "//input[@name='pickUpDate']")
    public WebElement pickUpDate;
    @FindBy(xpath = "//input[@name='pickUpTime']")
    public WebElement pickUpTime;
    @FindBy(xpath = "//input[@name='dropOffDate']")
    public WebElement dropOffDate;
    @FindBy(xpath = "//input[@name='dropOffTime']")
    public WebElement dropOffTime;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueReservation;
    @FindBy(xpath = "//*[text()='Please first login']")
    public WebElement pleaseFirstLogin;
    //US_011 by yavuz-cemil
    @FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Contact']")
    public WebElement contact;
    @FindBy(xpath = "(//div[@class='card-title h5'])[1]")
    public WebElement cellCenter;
    @FindBy(xpath = "(//div[@class='card-title h5'])[2]")
    public WebElement makeReservation;
    @FindBy(xpath = "(//div[@class='card-title h5'])[3]")
    public WebElement cancelReservation;
    @FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[1]")
    public WebElement subscribe;
    @FindBy(xpath = "(//input[@class=\"form-control\"])[1]")
    public WebElement textBoxt;
    @FindBy(xpath = "(//input[@class=\"form-control\"])[4]")
    public WebElement eMail;
    @FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[2]")
    public WebElement send;
    @FindBy(xpath = "//textarea[@class=\"form-control\"]")
    public WebElement comments;
    @FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Contact']")
    public WebElement harita;
    @FindBy(xpath = "(//input[@placeholder='name@example.com'])[1]")
    public WebElement contactName;
    // US_006 Oguzhan-Fatih
    @FindBy(xpath = "//select[@name='car']")
    public WebElement select;
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUp;
    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement DropOff;
    //
//
    //US_04 MUSTAFA-EMRE
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;
    @FindBy(xpath="//input[@id='formBasicEmail']")
    public WebElement loginEmailBox;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement loginPasswordBox;
    @FindBy(xpath = " //button[@class='btn btn-primary']")
    public WebElement loginOnayButton;
    @FindBy(xpath ="//button[@id='dropdown-basic-button']")
    public WebElement nameDropdownButton;
    @FindBy(xpath = "//a[text()='Reservations']")
    public WebElement reservationDropdownButton;
    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[1]")
    public WebElement youtubeIkonu;
    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[2]")
    public WebElement facebookIkonu;
    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[3]")
    public WebElement twitterIkonu;
    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[4]")
    public WebElement instagramIkonu;
    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homeBaslik;
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement servicesBaslik;
    @FindBy(xpath = "(//a[@class='nav-link'])[3]")
    public WebElement aboutUsBaslik;
    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    public WebElement contactBaslik;
    //Huseyin
    @FindBy(xpath="//h2[text()='What do we offer?']")
    public WebElement whatDoWeOffer;
    @FindBy(xpath = "//div[@class=\"mt-2 row\"]")
    public WebElement ourPartners;


    //seçkin
    @FindBy(xpath ="//div[@class='section-title']" )
    public WebElement customerServices;

    @FindBy(xpath ="//div[@class='col-lg-10']" )
    public WebElement flexRenting;

    @FindBy(xpath ="(//div[@class='col-lg-10'])[2]" )
    public WebElement noExtraPrice;

    @FindBy(xpath ="(//div[@class='col-lg-10'])[3]" )
    public WebElement priceEqualization;

    @FindBy(xpath ="(//div[@class='col-lg-10'])[4]" )
    public WebElement hygienicCars;

    @FindBy(xpath ="(//div[@class='col-lg-6'])[1]" )
    public WebElement newsletterSubscription;

    @FindBy(xpath ="//input[@type='email']" )
    public WebElement mailBox;

    @FindBy(xpath ="(//button[@type='button'])[2]" )
    public WebElement suscribeButonu;






}
