package Elements;

/**
 * Created by yadavs on 15/03/2016.
 */
public class QuickSearchPage_Elements {

    //---- Store Elements for Quick Search Channel Type DropDown box to select from Drop Down
    public String selectQuickSearchTypeFromDropDown_ByID = "searchDropDown";

    //-- Storing Elements Names of every Channel for Quick Search Text field as per selection from Quick Search Channel Drop Down
    public static String selectVesselInQuickSearchDropDown_ByID = "vessels";
    public static String selectCompaniesInQuickSearchDropDown_ByID = "companies";
    public static String selectCreditReportsInQuickSearchDropDown_ByID = "reports";
    public static String selectPlacesInQuickSearchDropDown_ByID = "places";
    public static String selectCasualtiesInQuickSearchDropDown_ById = "casualties";
    public static String selectSanctionsInQuickSearchDropDown_ById = "sanctions";

    //-- Store Elements for Channels to verify Channel Name on Summary Page
    public static String vesselNameOnVesselSummaryPage_ByID = "vessel-name";
    public static String companyNameOnCompanySummaryPage_ByID = "company-name";
    public static String creditReportOnCRSummaryPage_ByClass = "creditReportPanelHeadline";
    public static String placesNameOnSummaryPage_ByID = "place-name";

    //-- Store Element Class Name of Channel on Summary Page to verify correct Channel summary is loaded
    public static String summaryPageChannelBreadCrum_ByClassName = "bcNoLink";
}
