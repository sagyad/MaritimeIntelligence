package LLI.com;

import Pages.HomePage;
import cucumber.api.java.en.*;

/**
 * Created by YadavS on 30/03/2016.
 */
public class home_StefDef {
    HomePage homePage = new HomePage();

    @When("^I visit \"([^\"]*)\"$")
    public void i_visit(String page) {
        homePage.navigateChannelPages(page);
    }
}
