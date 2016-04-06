@suite
Feature: Perform Advance Search on Vessels/Companies/Places

  Background: User with full subscription Logs in
    Given I am logged in on LLI

  @suite
  Scenario: Vessel Advance Search
    And I hover over SeaSearcher and Click Vessels
    And I enter "Aemman" in Vessel Search text field Name
    When I click on Search Button
    Then I Should get results for Vessel "Aemman"

  @suite
  Scenario: Companies Advance Search
    And I hover over SeaSearcher and Click Companies
    And I enter "Aero Marine" in Companies Search text field Name
    When I click on Search Button
    Then I Should get results for Company "Aero Marine"

  @suite
  Scenario: Places Advance Search
    And I hover over SeaSearcher and Click Places
    And I enter "Mumbai" in Places Search text field Name
    When I click on Places Search Button
    Then I Should get results for Places "Mumbai"

  @wip
  @Scenario:
    And I hover over SearSearcher and click Casualties Search
    And I enter "Emma" in casualties
    When I click on Casualties Search Button
    Then I Should get results for "Emma"
  @wip
  @Scenario:
    And I hover over SearSearcher and click Casualties Search
    And I enter "Emma" in casualties
    When I click on Casualties Search Button
    Then I Should get results for "Emma"




