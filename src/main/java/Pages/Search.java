package Pages;

import Elements.QuickSearchPage_Elements;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by yadavs on 15/03/2016.
 */
public class Search extends Page {
    QuickSearchPage_Elements searchPage_elements = new QuickSearchPage_Elements();
    WebElement element;

    public static String getValueForQuickSearchTextField = null;
    public static String QSTextFieldIsVessel = "Vessels";
    public static String QSTextFieldIsCompanies = "Companies";
    public static String QSTextFieldIsCreditReport = "Credit Reports";
    public static String QSTextFieldIsPlaces = "Places";
    public static String QSTextFieldIsSanctions = "Sanctions";
    public static String QSTextFieldIsCasualties = "Casualties";


    //--Step 1 Select Channel Type from Drop Down
    public void selectSearchTypeChannel(String searchTypeChannel) {
        explicitWaitForFewSeconds(5);
        Select quickSearchType;
        try {
            if (searchTypeChannel.equalsIgnoreCase(QSTextFieldIsVessel)) {
                quickSearchType = new Select(Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)));
                explicitWaitForFewSeconds(5);
                quickSearchType.selectByVisibleText(searchTypeChannel);
                Thread.sleep(200);

                getValueForQuickSearchTextField = Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)).getAttribute("value");

            } else if (searchTypeChannel.equalsIgnoreCase(QSTextFieldIsCompanies)) {
                quickSearchType = new Select(Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)));
                explicitWaitForFewSeconds(5);
                quickSearchType.selectByVisibleText(searchTypeChannel);
                Thread.sleep(200);

                getValueForQuickSearchTextField = Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)).getAttribute("value");
            } else if (searchTypeChannel.equalsIgnoreCase(QSTextFieldIsCreditReport)) {

                quickSearchType = new Select(Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)));
                explicitWaitForFewSeconds(5);
                quickSearchType.selectByVisibleText(searchTypeChannel);
                Thread.sleep(200);
                getValueForQuickSearchTextField = Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)).getAttribute("value");
            } else if (searchTypeChannel.equalsIgnoreCase(QSTextFieldIsPlaces)) {
                quickSearchType = new Select(Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)));
                explicitWaitForFewSeconds(5);
                quickSearchType.selectByVisibleText(searchTypeChannel);
                Thread.sleep(200);
                getValueForQuickSearchTextField = Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)).getAttribute("value");
            } else if (searchTypeChannel.equalsIgnoreCase(QSTextFieldIsSanctions)) {
                quickSearchType = new Select(Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)));
                explicitWaitForFewSeconds(5);
                quickSearchType.selectByVisibleText(searchTypeChannel);
                Thread.sleep(200);
                getValueForQuickSearchTextField = Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)).getAttribute("value");
            } else if (searchTypeChannel.equalsIgnoreCase(QSTextFieldIsCasualties)) {
                quickSearchType = new Select(Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)));
                explicitWaitForFewSeconds(5);
                quickSearchType.selectByVisibleText(searchTypeChannel);
                Thread.sleep(200);
                getValueForQuickSearchTextField = Driver.findElement(By.id(searchPage_elements.selectQuickSearchTypeFromDropDown_ByID)).getAttribute("value");

            }
            System.out.println("\n Value for Quick Search Field is: " + getValueForQuickSearchTextField);
        } catch (Exception e) {
            System.out.println("Error occurred in Selecting Search Type channel from Drop down box :- " + e.getMessage());
        }
    }

    //Step 2 Enter text in Quick Search Text box
    public void enterValueInQuickSearchTextBox(String searchText) {
        try {
            if (getValueForQuickSearchTextField.equalsIgnoreCase(QSTextFieldIsVessel)) {
                element = Driver.findElement(By.id(searchPage_elements.selectVesselInQuickSearchDropDown_ByID));
                element.sendKeys(searchText);
                Thread.sleep(500);
            } else if (getValueForQuickSearchTextField.equalsIgnoreCase(QSTextFieldIsCompanies)) {
                element = Driver.findElement(By.id(searchPage_elements.selectCompaniesInQuickSearchDropDown_ByID));
                element.sendKeys(searchText);
                Thread.sleep(200);
            } else if (getValueForQuickSearchTextField.equalsIgnoreCase("reports")) {
                element = Driver.findElement(By.id(searchPage_elements.selectCreditReportsInQuickSearchDropDown_ByID));
                element.sendKeys(searchText);
                Thread.sleep(200);
            } else if (getValueForQuickSearchTextField.equalsIgnoreCase(QSTextFieldIsPlaces)) {
                element = Driver.findElement(By.id(searchPage_elements.selectPlacesInQuickSearchDropDown_ByID));
                element.sendKeys(searchText);
                Thread.sleep(200);
            } else if (getValueForQuickSearchTextField.equalsIgnoreCase(QSTextFieldIsSanctions)) {
                element = Driver.findElement(By.id(searchPage_elements.selectSanctionsInQuickSearchDropDown_ById));
                element.sendKeys(searchText);
                Thread.sleep(500);
            } else if (getValueForQuickSearchTextField.equalsIgnoreCase(QSTextFieldIsCasualties)) {
                System.out.println("\n Value for Quick Search Field is: " + getValueForQuickSearchTextField);
                element = Driver.findElement(By.id(searchPage_elements.selectCasualtiesInQuickSearchDropDown_ById));
                element.sendKeys(searchText);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Error message while entering value in Quick Search text field. " + e.getMessage());
        }
    }

    //Step 3 Click on Go Button
    public void clickOnGoButton() {
        try {
            Thread.sleep(500);
            element.sendKeys("", Keys.TAB);
        } catch (Exception e) {
            System.out.println("\n Exception caused due to :- " + e.getMessage());
        }
    }

    //Step 4 Verify Summary page of Channel searched for via Quick Search Text field
    public void channelSummaryPage(String quickSearchInputText, String selectedQuickSearchInDropDown) {

        if (getValueForQuickSearchTextField.equalsIgnoreCase(QSTextFieldIsVessel)) {
            String vesselNameOnSummaryPage = Driver.findElement(By.id(searchPage_elements.vesselNameOnVesselSummaryPage_ByID)).getText();
            String getChannelNameFromSummaryPage = Driver.findElement(By.className(searchPage_elements.summaryPageChannelBreadCrum_ByClassName)).getText();
            assertEquals(quickSearchInputText, vesselNameOnSummaryPage);
            assertEquals(selectedQuickSearchInDropDown, getChannelNameFromSummaryPage);

        } else if (getValueForQuickSearchTextField.equalsIgnoreCase(QSTextFieldIsCompanies)) {
            String companyNameOnSummaryPage = Driver.findElement(By.id(searchPage_elements.companyNameOnCompanySummaryPage_ByID)).getText();
            String getCompanyChannelTypeOnSummaryPage = Driver.findElement(By.className(searchPage_elements.summaryPageChannelBreadCrum_ByClassName)).getText();
            assertEquals(quickSearchInputText, companyNameOnSummaryPage);
            assertEquals(selectedQuickSearchInDropDown, getCompanyChannelTypeOnSummaryPage);

            //-------reports.
        } else if (getValueForQuickSearchTextField.equalsIgnoreCase(QSTextFieldIsCreditReport)) {
            String creditReportNameOnSummaryPage = Driver.findElement(By.id(searchPage_elements.creditReportOnCRSummaryPage_ByClass)).getText();
            String getCreditReportChannelTypeOnSummaryPage = Driver.findElement(By.className(searchPage_elements.summaryPageChannelBreadCrum_ByClassName)).getText();
            assertEquals(quickSearchInputText, creditReportNameOnSummaryPage);
            assertEquals(selectedQuickSearchInDropDown, getCreditReportChannelTypeOnSummaryPage);

        } else if (getValueForQuickSearchTextField.equalsIgnoreCase(QSTextFieldIsPlaces)) {
            String placesNameOnSummaryPage = Driver.findElement(By.id(searchPage_elements.placesNameOnSummaryPage_ByID)).getText();
            String getPlaceChannelTypeOnSummaryPage = Driver.findElement(By.className(searchPage_elements.summaryPageChannelBreadCrum_ByClassName)).getText();
            assertEquals(quickSearchInputText, placesNameOnSummaryPage);
            assertEquals(selectedQuickSearchInDropDown, getPlaceChannelTypeOnSummaryPage);
        }
    }

    //4.1 Verify Casualties summary page with VesselName, Incident Tab and Casualties
    public void casualtiesSummaryPage(String incidentTab, String sanctionVesselName, String casualtiesTab) {
        try {
            String vesselNameOnSummaryPage = Driver.findElement(By.id(searchPage_elements.vesselNameOnVesselSummaryPage_ByID)).getText();
            String incidentTabOnSummaryPage = Driver.findElement(By.className("bcNoLinklast")).getAttribute("title");
            String casualtiesTabOnSummaryPage = Driver.findElement(By.xpath(".//*[@id='content']/div[3]/div[1]/ul/li[3]/span")).getText();
            Thread.sleep(500);
            assertEquals(vesselNameOnSummaryPage, sanctionVesselName);
            assertEquals(incidentTab, incidentTabOnSummaryPage);
            Assert.assertTrue("Casualties", casualtiesTabOnSummaryPage.contains(casualtiesTab));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //4.2 Verify Sanctions Summary page with Sanctions Search Name and Sanction Type
    public void sanctionsSummaryPage(String sanctionTypes, String sanctionsSearchByName) {
        String getSanctionType = Driver.findElement(By.xpath(".//*[@id='content']/div[1]/h2")).getText();
        System.out.println("\n 3.Sanction Search Text, value from test :- " + sanctionsSearchByName);
        assertEquals(sanctionTypes, getSanctionType);
    }
}
