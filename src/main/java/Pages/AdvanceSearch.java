package Pages;

import Elements.AdvanceSearch_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

/**
 * Created by yadavs on 23/03/2016.
 */
public class AdvanceSearch extends Page {

    AdvanceSearch_Elements advanceSearch_elements = new AdvanceSearch_Elements();

    public void hoverOverSeasearcherMenuAndClickVessels() throws InterruptedException {
        Actions actions = new Actions(Driver);
        WebElement we = Driver.findElement(By.name(advanceSearch_elements.seaSearcher_ByName));
        Thread.sleep(2000);
        actions.moveToElement(we).moveToElement(Driver.findElement(By.xpath(advanceSearch_elements.seaSearcherVesselsTopMenu_ByXPath))).click().build().perform();
    }

    public void hoverOverSeasearcherMenuAndClickCompanies() throws InterruptedException {
        Actions actions = new Actions(Driver);
        WebElement we = Driver.findElement(By.name(advanceSearch_elements.seaSearcher_ByName));
        Thread.sleep(2000);
        actions.moveToElement(we).moveToElement(Driver.findElement(By.xpath(advanceSearch_elements.seaSearcherCompaniesTopMenu_ByXPath))).click().build().perform();
    }

    public void hoverOverSeasearcherMenuAndClickPlaces() throws InterruptedException {
        Actions actions = new Actions(Driver);
        WebElement we = Driver.findElement(By.name(advanceSearch_elements.seaSearcher_ByName));
        Thread.sleep(2000);
        actions.moveToElement(we).moveToElement(Driver.findElement(By.xpath(advanceSearch_elements.seaSearcherPlacesTopMenu_ByXPath))).click().build().perform();
    }

    public void enterVesselNameInSearchField(String vesselName) {
        fluentWaitForFewSeconds(200);
        Driver.findElement(By.id(advanceSearch_elements.vesselsAdvanceSearchTextField_ByID)).sendKeys(vesselName);
    }

    public void enterCompaniesNameInSearchTextField(String companyName) {
        fluentWaitForFewSeconds(200);
        Driver.findElement(By.id(advanceSearch_elements.companiesAdvanceSearchTextField_ByID)).sendKeys(companyName);
    }

    public void enterPlaceNameInSearchTextField(String companyName) {
        try {
            fluentWaitForFewSeconds(200);
            Driver.findElement(By.id(advanceSearch_elements.placesAdvanceSearchTextField_ByID)).sendKeys(companyName);
            Thread.sleep(500);
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void clickOnSearchButton() {
        fluentWaitForFewSeconds(200);
        Driver.findElement(By.className(advanceSearch_elements.searchButton_ByClass)).click();
    }


    public void verifyVesselSearchResults(String vesselName) {
        String holdValue = Driver.findElement(By.xpath(".//*[@id='item-366802-1']/td[1]/a")).getText();
        assertEquals(holdValue, vesselName);
    }

    public void verifyCompaniesSearchResults(String companyName) {
        String holdValue = Driver.findElement(By.xpath(".//*[@id='item-230956-1']/td[1]/a")).getText();
        assertEquals(holdValue, companyName);
    }

    public void verifyPlacesSearchResults(String placeName) {
        String holdValue = Driver.findElement(By.xpath(".//*[@id='search-results']/tbody/tr[2]/td[1]/a")).getText();
        assertEquals(holdValue, placeName);
    }


    public void clickOnPlacesSearchButton() {
        Driver.findElement(By.className(advanceSearch_elements.placesSearchButton_ByClass)).click();
    }
}
