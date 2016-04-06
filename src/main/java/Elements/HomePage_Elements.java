package Elements;

/**
 * Created by yadavs on 15/03/2016.
 */
public class HomePage_Elements {

    //--------URL to Navigate --------------------
    public static String LLI_LIVE_URL = "http://www.lloydslistintelligence.com/llint/index.htm";
    public static String STAGE_URL = "http://stage.lloydslistintelligence.com/llint";

    //----UserName Password Variables
    public static String USERNAME = "john.savarimuthu@informa.com";
    public static String PASSWORD = "PASSWORD";


    //Element locators for Home page.
    public static String username_BYID = "username";
    public static String password_BYID = "password";
    public static String loginButton_BYCLASSNAME = "loginSubmit";
    public static String login_BYHREF = "Log In";

    //Element for valid and invalid login message
    public static String welcomeMessage_ByXPATH = ".//*[@id='topNavLinks']/ul/li[1]";
    public static String invalidLoginMessage_ByXPATH =".//*[@id='loginForm']/fieldset[2]/div";
}
