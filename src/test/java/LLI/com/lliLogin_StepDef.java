package LLI.com;

import Pages.HomePage;
import cucumber.api.java.en.*;
import org.apache.xerces.util.SynchronizedSymbolTable;

/**
 * Created by yadavs on 11/03/2016.
 */
public class lliLogin_StepDef {

    HomePage homePage = new HomePage();

    ///-------------Scenario 1 - Navigate to LLI and Verify Page Title
    @Given("^I am on LLI site$")
    public void i_am_on_LLI_site() {
        homePage.launch_LIVE_LLI_SITE();
    }

    @When("^Site is  loaded$")
    public void site_is_loaded() {
        System.out.println("\n 1. Home page is loaded");
    }

    @Then("^I should get \"([^\"]*)\" as page title$")
    public void i_should_get_as_page_title(String pageTitle) {
        homePage.verifyPageTitles(pageTitle);
    }
    //----------------End of Scenario 1 ---------------------

    //---------------Scenario 2 :Login to LLI site and verify User Welcome Message
    @Given("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String username, String password) {
        homePage.enterUsernameAndPassword(username, password);
    }

    @When("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String loginButton) {
        homePage.clickOnLoginButton(loginButton);
    }

    @Then("^I should get \"([^\"]*)\"$")
    public void i_should_get(String message) {
        homePage.verifyLoginMessage(message);
    }

    //---------------End of Scenario 2 -------------------------------------------


    //-------------Scenario 3: Invalid Login test -----------------------------
    @Then("^I should get \"([^\"]*)\" on login page itself$")
    public void i_should_get_on_login_page_itself(String invalidMessage)  {
        homePage.verifyInValidLoginMessage(invalidMessage);
    }

    //-----------------End of Scenario 3 Test----------------------------------
}
