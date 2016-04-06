package LLI.com;

import Pages.AdvanceSearch;
import cucumber.api.java.en.*;
import org.junit.BeforeClass;

/**
 * Created by yadavs on 23/03/2016.
 */
public class advanceSearch_StepDef {
    AdvanceSearch advanceSearch = new AdvanceSearch();

    @BeforeClass
    public void setup() {
        advanceSearch.clearCookies();
    }

    //------------Vessels Advance Search Test-------------------------------------------------
    @Given("^I hover over SeaSearcher and Click Vessels$")
    public void i_hover_over_SeaSearcher_and_Click_Vessels() throws InterruptedException {
        advanceSearch.hoverOverSeasearcherMenuAndClickVessels();
    }

    @Given("^I enter \"([^\"]*)\" in Vessel Search text field Name$")
    public void i_enter_in_Vessel_Search_text_field_Name(String vesselSearchTerm) {
        advanceSearch.enterVesselNameInSearchField(vesselSearchTerm);
    }

    @When("^I click on Search Button$")
    public void i_click_on_Search_Button() {
        advanceSearch.clickOnSearchButton();
    }

    @Then("^I Should get results for Vessel \"([^\"]*)\"$")
    public void i_Should_get_results_for_Vessel(String vesselResult) {
        advanceSearch.verifyVesselSearchResults(vesselResult);
    }
    //----------------------End of Vessels Advance Search Test --------------------------------

    //---------------------Companies Advance Search Test --------------------------------------

    @Given("^I hover over SeaSearcher and Click Companies$")
    public void i_hover_over_SeaSearcher_and_Click_Companies() throws InterruptedException {
        advanceSearch.hoverOverSeasearcherMenuAndClickCompanies();
    }

    @Given("^I enter \"([^\"]*)\" in Companies Search text field Name$")
    public void i_enter_in_Companies_Search_text_field_Name(String companyName) {
        advanceSearch.enterCompaniesNameInSearchTextField(companyName);
    }

    @Then("^I Should get results for Company \"([^\"]*)\"$")
    public void i_Should_get_results_for_Company(String companyName) {
        advanceSearch.verifyCompaniesSearchResults(companyName);
    }
    //---------------------End of Companies Advance Search test -------------------------------


    //---------------------Places Advance Search Test -----------------------------------------
    @Given("^I hover over SeaSearcher and Click Places$")
    public void i_hover_over_SeaSearcher_and_Click_Places() throws InterruptedException {
        advanceSearch.hoverOverSeasearcherMenuAndClickPlaces();
    }

    @Given("^I enter \"([^\"]*)\" in Places Search text field Name$")
    public void i_enter_in_Places_Search_text_field_Name(String placeName) {
        advanceSearch.enterPlaceNameInSearchTextField(placeName);
    }

    @When("^I click on Places Search Button$")
    public void i_click_on_Places_Search_Button() {
        advanceSearch.clickOnPlacesSearchButton();
    }

    @Then("^I Should get results for Places \"([^\"]*)\"$")
    public void i_Should_get_results_for_Places(String placeName) {
        advanceSearch.verifyPlacesSearchResults(placeName);
    }
    //---------------------End of Places Advance Search test -------------------------------
}
