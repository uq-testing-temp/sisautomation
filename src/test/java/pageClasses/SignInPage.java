package pageClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.DriverFactory;


public class SignInPage extends DriverFactory{

    @FindBy(id = "userid1")
    private WebElement usernamefield;

    @FindBy(id = "pwd")
    private WebElement passwordfield;

    @FindBy(xpath = "(//input[@value=''])[3]")
    private WebElement signinbutton;

    @FindBy(className = "PSHYPERLINK")
    private WebElement signinlink;

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void signIn_page() throws Throwable {
        driver.get("http://pswebdev2.soe.uq.edu.au:9600/ps/uqsinetsignin.html");
        driver.manage().window().maximize();
    }

    public void I_enter_username_as(String username) throws Throwable {
        usernamefield.sendKeys(username);
    }

    public void I_enter_password_as(String password) throws Throwable {
        passwordfield.sendKeys(password);
    }

    public void I_click_signin_button() throws Throwable {
        signinbutton.click();
    }

    public void I_should_not_be_signed_in() throws Throwable {
        boolean signinbuttonDisplayed = signinlink.isDisplayed();
        Assert.assertTrue(signinbuttonDisplayed);
    }
}
