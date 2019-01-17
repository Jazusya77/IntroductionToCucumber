@amazon
Feature: Amazon search;


     Background: User is on the amazon homepage
     Given User is on the amazon homepage

  Scenario: Amazon search test

    When User enters headphones keyword
    And User clicks to search button
    Then  User should see headphones in results


  Scenario: Amazon search test1
    Given User is on the amazon homepage
    When User enters headphones keyword
    And User clicks to search button
    Then  User should see headphones in results

  Scenario: Amazon search test2
    Given User is on the amazon homepage
    When User enters headphones keyword
    And User clicks to search button
    Then  User should see headphones in results


  Scenario: Amazon search test3
    Given User is on the amazon homepage
    When User enters headphones keyword
    And User clicks to search button
    Then  User should see headphones in results