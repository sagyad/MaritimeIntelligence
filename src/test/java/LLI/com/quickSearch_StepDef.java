package LLI.com;

import Pages.HomePage;
import Pages.Search;
import cucumber.api.java.en.*;
import org.junit.BeforeClass;

/**
 * Created by yadavs on 15/03/2016.
 */
public class quickSearch_StepDef {

    HomePage homepage = new HomePage();
    Search search = new Search();

    @BeforeClass
    public void setup() {
        search.clearCookies();
    }

    //---------Quick Search for Vessel MSC Washington-------------------------
    @Given("^I am logged in on LLI$")
    public void i_am_logged_in_on_LLI() {
        homepage.validLoginWithVerification();
    }

    @Given("^I select \"([^\"]*)\" in search Drop Down box$")
    public void i_select_in_search_Drop_Down_box(String searchType) {
        search.selectSearchTypeChannel(searchType);
    }

    @Given("^I enter \"([^\"]*)\" in quick search box$")
    public void i_enter_in_quick_search_box(String vesselName) {
        search.enterValueInQuickSearchTextBox(vesselName);
    }

    @When("^I click Go button$")
    public void i_click_Go_button() {
        search.clickOnGoButton();
    }

    @Then("^I Should be redirected to \"([^\"]*)\" \"([^\"]*)\" overview page\\.$")
    public void i_Should_be_redirected_to_overview_page(String searchText, String searchType) {
        search.channelSummaryPage(searchText, searchType);
    }
    //---------------------------------End of Vessel Search

    //------------------------Casualties Summary Page Verification------------------------------------
    @Then("^I Should be redirected to \"([^\"]*)\" tab of \"([^\"]*)\" overview page tab on \"([^\"]*)\" Section\\.$")
    public void i_Should_be_redirected_to_tab_of_overview_page_tab_on_Section(String incident, String vesselName, String casualties) {
        search.casualtiesSummaryPage(incident, vesselName, casualties);
    }

    //-----------------------End of Casualties Page Verification Test---------------------------------

    //--------------------------Sanctions Summary Page Verification-----------------------------------
    @Then("^I Should be redirected to \"([^\"]*)\" for \"([^\"]*)\" page\\.$")
    public void i_Should_be_redirected_to_for_page(String sanctionSearchName, String sanctionsType) {
        search.sanctionsSummaryPage(sanctionSearchName, sanctionsType);
    }
    //---------------------------End of Sanctions page verification-----------------------------------
}
