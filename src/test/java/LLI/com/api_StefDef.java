package LLI.com;

import cucumber.api.java.en.*;


/**
 * Created by yadavs on 01/04/2016.
 */


public class api_StefDef  {

    private final String USER_AGENT = "Mozilla/5.0";
    private String POST_USERNAME_PASSWORD_URL = "http://www.lloydslistintelligence.com/llint/j_spring_security_check?j_username=sagar.c.yadav%40informa.com&j_password=Password2105";


    @When("^I send login request$")
    public void i_send_login_request() throws Throwable {
       System.out.println("\n Send login line");
    }

    @Then("^I should get \"([^\"]*)\" as response\\.$")
    public void i_should_get_as_response(String arg1) throws Throwable {
        System.out.println("\n Get back response code");
    }
}
