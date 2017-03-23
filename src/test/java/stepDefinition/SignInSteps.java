package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;

import pageClasses.MySiNetPage;
import pageClasses.SignInPage;

public class SignInSteps extends DriverFactory {

    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
    }

    @Given("^I am on SI-net SignIn page$")
    public void signIn_page() throws Throwable {
            new SignInPage(driver).signIn_page();
    }

    @When("^I enter username as \"(.*)\"$")
    public void enterUsername(String username) throws Throwable {
        new SignInPage(driver).I_enter_username_as(username);
    }

    @When ("^I enter password as \"(.*)\"$")
    public void enterPassword(String password) throws Throwable {
        new SignInPage(driver).I_enter_password_as(password);
    }

    @When ("^I click SignIn button$")
    public void clickSignInButton() throws Throwable {
        new SignInPage(driver).I_click_signin_button();
    }

    @Then ("^I should be signed in$")
    public void signedIn() throws Throwable {
        new MySiNetPage(driver).I_should_be_signed_in();
    }

    @Then ("I should not be signed in$")
    public void notSignedIn() throws Throwable {
        new SignInPage(driver).I_should_not_be_signed_in();
    }
}
