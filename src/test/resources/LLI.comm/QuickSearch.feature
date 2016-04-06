@suite
Feature: Search on LLI. This includes Quick search for all channels and advance search mapping their results sets.

  Background: User with full subscription Logs in
    Given I am logged in on LLI

  @suite
  Scenario Outline: Vessels,Companies, Credit Report and Places Channels Quick Search
    And I select "<quickSearchType>" in search Drop Down box
    And I enter "<quickSearchText>" in quick search box
    When I click Go button
    Then I Should be redirected to "<quickSearchText>" "<quickSearchType>" overview page.
    Examples:
      | quickSearchType | quickSearchText |
      | Vessels         | MSC Elena       |
      | Companies       | ABRS Limited    |
      | Credit Reports  | Maren Ltd       |
      | Places          | Rotterdam       |

  @suite
  Scenario Outline: Vessels,Companies, Credit Report and Places Channels Quick Search - 2
    And I select "<searchtype>" in search Drop Down box
    And I enter "<quicksearchText>" in quick search box
    When I click Go button
    Then I Should be redirected to "<quicksearchText>" "<searchtype>" overview page.
    Examples:
      | searchtype     | quicksearchText         |
      | Vessels        | Emma Jane               |
      | Companies      | Mamry Incorporated      |
      | Credit Reports | Samruddha Resources Ltd |
      | Places         | Mumbai                  |

  @suite
  Scenario Outline:  Casualties - Quick Search for vessels with incident reported
    And I select "Casualties" in search Drop Down box
    And I enter "<vesselCasualtiesName>" in quick search box
    When I click Go button
    Then I Should be redirected to "Incidents" tab of "<vesselCasualtiesName>" overview page tab on "Casualties" Section.
    Examples:
      | vesselCasualtiesName |
      | MSC Elena            |
      | Croatia              |

  @suite
  Scenario Outline: EU - Sanctions - Vessel Sanction Quick Search
    And I select "Sanctions" in search Drop Down box
    And I enter "<sanctionSearchName>" in quick search box
    When I click Go button
    Then I Should be redirected to "<sanctionsType>" for "<sanctionSearchName>" page.
    Examples:
      | sanctionSearchName | sanctionsType                      |
      | 3MG                | EU - Organisation Sanction Details |
      | Aamir Ali Chaudhry | EU - Person Sanction Details       |

  @suite
  Scenario Outline: OFAC-  Sanctions - Vessel Sanction Quick Search
    And I select "Sanctions" in search Drop Down box
    And I enter "<sanctionSearchName>" in quick search box
    When I click Go button
    Then I Should be redirected to "<sanctionsType>" for "<sanctionSearchName>" page.
    Examples:
      | sanctionSearchName | sanctionsType                        |
      | AM NOK GANG        | OFAC - Vessel Sanction Details       |
      | 7 KARNES           | OFAC - Organisation Sanction Details |
      | Abbas FOUAZ        | OFAC - Person Sanction Details       |



