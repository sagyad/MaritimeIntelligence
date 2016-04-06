@suite
Feature: Navigate to Lloyds List Intelligence website verify Page Title.
  Login with valid credentials and verify Page Title and User Welcome message.

  @suite
  Scenario: Navigate to LLI and Verify Page Title
    Given I am on LLI site
    When Site is  loaded
    Then I should get "Shipping and maritime intelligence - Lloyd’s List Intelligence" as page title

  @suite
  Scenario Outline: Login to LLI site and verify User Welcome Message
    Given I am on LLI site
    And I enter "<username>" and "<password>"
    When I click on "Login" button
    Then I should get "<message>"
    Then I should get "<pagetitle>" as page title
    Examples: login with valid credentials and invalid credentials
      | username                     | password   | message       | pagetitle                                                      |
      | john.savarimuthu@informa.com | PASSWORD   | Welcome John  | Shipping and maritime intelligence - Lloyd’s List Intelligence |
      | sagar.c.yadav@informa.com    | Manudi2105 | Welcome Sagar | Shipping and maritime intelligence - Lloyd’s List Intelligence |

  @suite
  Scenario Outline: Invalid Login to LLI site and verify User Welcome Message
    Given I am on LLI site
    And I enter "<username>" and "<password>"
    When I click on "Login" button
    Then I should get "<message>" on login page itself
    Then I should get "<pagetitle>" as page title
    Examples: login with valid credentials and invalid credentials
      | username                     | password | message                                                                          | pagetitle                         |
      | john.savarimuthu@informa.com | pppp     | Your login attempt was not successful, please try again.Reason: Bad credentials. | Lloyd's List Intelligence - Login |
      | sagar.c.yadav@informa.com    | *******  | Your login attempt was not successful, please try again.Reason: Bad credentials. | Lloyd's List Intelligence - Login |