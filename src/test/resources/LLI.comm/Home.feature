@suite
Feature: Verify Home page and all Channel Page after Valid Login

  @suite
  Scenario Outline: Login and verify title of every Channel Page
    Given I am logged in on LLI
    When I visit "<channels>"
    Then I should get "<pageTitle>" as page title

    Examples:
      | channels         | pageTitle                                                                      |
      | Tankers          | Tanker Fleet and Oil Movements Analysis - Lloyd’s List Intelligence            |
      | LNG              | LNG Fleet and Vessel Movement Analysis - Lloyd’s List Intelligence             |
      | Dry Bulk         | Dry Bulk Fleet List & Movements - Lloyd’s List Intelligence                    |
      | Containers       | Containership operators and fleet activity - Lloyd’s List Intelligence         |
      | Insurance        | Maritime Insurance - shipping intelligence - Lloyd’s List Intelligence         |
      | Law & Regulation | Trade Law, Regulation and Casualties - Lloyd’s List Intelligence               |
      | Credit           | Credit Reports - risk analysis of vessel operators - Lloyd’s List Intelligence |
      | Lloyd's List     | Lloyd's List Intelligence » Lloyd's List                                       |
