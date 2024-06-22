
Feature: Admin login
Scenario: Login of admin
    Given Admin is in login page
    When Admin enter the username and password
    And Admin click the submit button
    Then Admin goes to Home page and exit the browser