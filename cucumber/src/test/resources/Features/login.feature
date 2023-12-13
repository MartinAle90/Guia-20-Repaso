# Autor
# Date
# Description
#@SmokeScenario
Feature: feature to test login functionality

#  @SmokeTest
  Scenario: Check login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

#  Scenario Outline: Check login with invalid credentials
#
#    Given user is on login page
#    When user enters invalid <username> and <password>
#    And clicks on login button
#    Then error message is displayed - Invalid Credentials
#
#    Examples:
#      | username | password |
#      | user1    | pass1    |
#      | user2    | pass2    |