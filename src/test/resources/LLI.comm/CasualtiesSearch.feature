@suite

Feature: Casualties search

  Background:
    Given I am logged in on LLI

  @suite
  Scenario: Search for Vessel Casualty with Vessel Name with Serious Indicator as Yes
    And I hover over Casualties and Click Serious Casualties
    And I Enter "Tivoli" in Vessel Name text field
    When I click on "Search" button
    Then I Should be redirected to "Incidents" tab of "<vesselCasualtiesName>" overview page tab on "Casualties" Section.
